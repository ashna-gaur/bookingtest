package com.booking.recruitment.hotel.service.impl;

import com.booking.recruitment.hotel.exception.BadRequestException;
import com.booking.recruitment.hotel.model.Hotel;
import com.booking.recruitment.hotel.repository.HotelRepository;
import com.booking.recruitment.hotel.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.booking.recruitment.hotel.dto.HotelDto;
import com.booking.recruitment.hotel.dto.CityDto;

import java.util.List;
import java.util.stream.Collectors;

@Service
class DefaultHotelService implements HotelService {
  private final HotelRepository hotelRepository;

  @Autowired
  DefaultHotelService(HotelRepository hotelRepository) {
    this.hotelRepository = hotelRepository;
  }

  @Override
  public List<Hotel> getAllHotels() {
    return hotelRepository.findAll();
  }

  @Override
  public HotelDto getHotelById(Long id) {
    Hotel hotel =  hotelRepository
    .findById(id)
    .orElseThrow(() -> new ElementNotFoundException("Could not find hotel with ID provided"));
    CityDto cityDto = new CityDto(hotel.getCity().getId(), hotel.getCity().getName(), hotel.getCity().getCityCentreLongitude(),hotel.getCity().setCityCentreLatitude());
    return new HotelDto(hotel.getId(),hotel.getName(), hotel.getRating(),
    hotel.getLongitude(), hotel.getLatitude(), hotel.getAddress(),cityDto);

  }

  @Override
  public List<Hotel> getHotelsByCity(Long cityId) {
    return hotelRepository.findAll().stream()
        .filter((hotel) -> cityId.equals(hotel.getCity().getId()))
        .collect(Collectors.toList());
  }

  @Override
  public Hotel createNewHotel(Hotel hotel) {
    if (hotel.getId() != null) {
      throw new BadRequestException("The ID must not be provided when creating a new Hotel");
    }

    return hotelRepository.save(hotel);
  }

  @Override
  public void deleteHotelById(int id) {
        Optional<Hotel> optionalHotel = hotelRepository.findById(id);
        if (optionalHotel.isPresent()) {
            Hotel hotel = optionalHotel.get();
            hotel.setDeleted(true);
            hotelRepository.save(hotel);
        } else {
            throw new IllegalArgumentException("Hotel with ID " + id + " not found");
        }
    }
}
