package in.dpk.nitro.beans;

import java.util.Date;

public class Details {
    private String identifier;
    private String lastName;
    private String firstName;
    private Date dateOfBirth;
    private Long phoneNumber;
    private String filler;
    private Double annualIncome;

    public Details(String identifier, String lastName, String firstName, Date dateOfBirth, Long phoneNumber, String filler, Double annualIncome) {
        this.identifier = identifier;
        this.lastName = lastName;
        this.firstName = firstName;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.filler = filler;
        this.annualIncome = annualIncome;
    }

    public Details() {
    }

    @Override
    public String toString() {
        return "Details{" +
                "identifier='" + identifier + '\'' +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", phoneNumber=" + phoneNumber +
                ", filler='" + filler + '\'' +
                ", annualIncome=" + annualIncome +
                '}';
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFiller() {
        return filler;
    }

    public void setFiller(String filler) {
        this.filler = filler;
    }

    public Double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(Double annualIncome) {
        this.annualIncome = annualIncome;
    }
}
