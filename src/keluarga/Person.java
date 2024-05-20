/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package keluarga;

/**
 *
 * @author user
 */
public abstract class Person {
    private String name;
    private String birthPlace;
    private String birthDate;
    private String occupation;
    private String residence;
    private String phoneNumber;

    public Person(String name, String birthPlace, String birthDate, String occupation, String residence, String phoneNumber) {
        this.name = name;
        this.birthPlace = birthPlace;
        this.birthDate = birthDate;
        this.occupation = occupation;
        this.residence = residence;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getResidence() {
        return residence;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public abstract String getDetails();
}


