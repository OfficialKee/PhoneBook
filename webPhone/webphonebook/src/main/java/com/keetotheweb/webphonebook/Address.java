package com.keetotheweb.webphonebook;
/**
 * Address
 */
/**
 * Address
 */
public class Address {
    private String house_aptNumber;
    private String streetName;
    private String city;
    private String state;
    private String zipCode;

    public Address(String house_aptNumber,String streetName, String city, String state, String zipCode){
        this.house_aptNumber = house_aptNumber;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        

    }


    public String getHouseNumber() {
        return this.house_aptNumber;
    }

    public void setHouse_aptNumber(String house_aptNumber) {
        this.house_aptNumber = house_aptNumber;
    }

    public String getStreetName() {
        return this.streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
       return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return this.zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

   
    
}
  