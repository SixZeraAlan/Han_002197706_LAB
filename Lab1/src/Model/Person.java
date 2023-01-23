/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author alan
 */
public class Person {

    private String firstName;
    private String lastName;
    private long NUID;
    private String collegeName;

    Address address;
    Address permanentAddress;
    
    Contact personalContact;
    Contact officeContact;
    
    public Person() {
        this.firstName = "";
        this.address = new Address();
        this.permanentAddress = new Address();
        
        this.officeContact = new Contact();
        this.personalContact = new Contact();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getNUID() {
        return NUID;
    }

    public void setNUID(long NUID) {
        this.NUID = NUID;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(Address permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public Contact getPersonalContact() {
        return personalContact;
    }

    public void setPersonalContact(Contact personalContact) {
        this.personalContact = personalContact;
    }

    public Contact getOfficeContact() {
        return officeContact;
    }

    public void setOfficeContact(Contact officeContact) {
        this.officeContact = officeContact;
    }
    
    
//    public static void main(String[] args) {
//        Person obj = new Person();
//        obj.firstName = "Alan";
//        Address adr = obj.getAddress();
//        adr.setStreetName("Huntington");
//        System.out.println(obj.getFirstName() + " " + obj.getAddress().getStreetName());
//        
//    }

  
    
}
