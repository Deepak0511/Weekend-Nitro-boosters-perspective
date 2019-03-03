package in.dpk.nitro.beans;

public class Header {
    private String identifier;
    private String country;
    private String city;
    private String filler;
    private Long pinCode;

    public Header(String identifier, String country, String city, String filler, Long pinCode) {
        this.identifier = identifier;
        this.country = country;
        this.city = city;
        this.filler = filler;
        this.pinCode = pinCode;
    }

    public Header() {
    }

    @Override
    public String toString() {
        return "Header{" +
                "identifier='" + identifier + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", filler='" + filler + '\'' +
                ", pinCode=" + pinCode +
                '}';
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getFiller() {
        return filler;
    }

    public void setFiller(String filler) {
        this.filler = filler;
    }

    public Long getPinCode() {
        return pinCode;
    }

    public void setPinCode(Long pinCode) {
        this.pinCode = pinCode;
    }
}
