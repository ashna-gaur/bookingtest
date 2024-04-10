package com.booking.recruitment.hotel.dto;

public class CityDto {
    private int id;
    private String name;
    private Double cityCentrelongitude;
    private Double cityCentrelatitude;

    public CityDto() {}

    public CityDto(int id, String name, Double cityCentrelongitude, Double cityCentrelatitude) {
        this.id = id;
        this.name = name;
        this.cityCentrelongitude = cityCentrelongitude;
        this.cityCentrelatitude = cityCentrelatitude;
    }

    // Getter and Setter methods for id
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

    // Getter and Setter methods for cityCentrelongitude
    public Double getCityCentrelongitude()
