package com.booking.recruitment.hotel.service;


import com.booking.recruitment.hotel.model.Hotel;
import com.booking.recruitment.hotel.dto.HotelDto;

import java.util.List;

public interface HotelService {
  List<Hotel> getAllHotels();

  HotelDto getHotelById(Long id);

  List<Hotel> getHotelsByCity(Long cityId);

  Hotel createNewHotel(Hotel hotel);

  public void deleteHotelById(Long id);
}
