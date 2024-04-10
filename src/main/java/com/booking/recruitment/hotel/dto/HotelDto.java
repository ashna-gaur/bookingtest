package com.booking.recruitment.hotel.dto;

import com.booking.recruitment.hotel.dto.CityDto;

public class HotelDto {
    private int id;
    private String name;
  private Double rating;
  private Double longitude;
  private Double latitude;
  private String address;
  private CityDto CityDto;

  public HotelDto() {}

  public HotelDto(int id, String name, Double rating, Double longitude, Double latitude, String address, CityDto cityDto) {
        this.id = id;
        this.name = name;
        this.rating = rating;
        this.longitude = longitude;
        this.latitude = latitude;
        this.address = address;
        this.cityDto = cityDto;
    }

  public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and Setter methods for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter methods for rating
    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    // Getter and Setter methods for longitude
    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    // Getter and Setter methods for latitude
    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    // Getter and Setter methods for address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCityDto() {
        return cityDto;
    }

    public void setCityDto(CityDto cityDto) {
        this.cityDto = cityDto;
    }

}
