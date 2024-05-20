/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package keluarga;

/**
 *
 * @author user
 */
public class Parent extends Person {
    public Parent(String name, String birthPlace, String birthDate, String occupation, String residence, String phoneNumber) {
        super(name, birthPlace, birthDate, occupation, residence, phoneNumber);
    }

    @Override
    public String getDetails() {
        return String.format(
            "Bernama: %s\n" +
            "Tempat Lahir: %s\n" +
            "Tanggal Lahir: %s\n" +
            "Pekerjaan: %s\n" +
            "Tempat Tinggal: %s\n" +
            "Nomor HP: %s\n",
            getName(), getBirthPlace(), getBirthDate(), getOccupation(), getResidence(), getPhoneNumber()
        );
    }
}



