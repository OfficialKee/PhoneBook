/**
 * Address
 */
/**
 * Address
 */
public class Address {
    private int house_aptNumber;
    private String streetName;
    private String city;
    private String state;
    private int zipCode;

    public Address(int house_aptNumber,String streetName, String city, String state, int zipCode){
        this.house_aptNumber = house_aptNumber;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        

    }


    public int getHouseNumber() {
        return this.house_aptNumber;
    }

    public void setHouse_aptNumber(int house_aptNumber) {
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

    public int getZipCode() {
        return this.zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

   
    
}
  