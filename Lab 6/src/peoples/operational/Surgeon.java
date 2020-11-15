package peoples.operational;

import structures.Hospital;

import java.time.LocalDate;

public class Surgeon extends Doctor{
    public Surgeon(String title,
                   String givenName,
                   String middleName,
                   String familyName,
                   String gender,
                   String homeAddress,
                   String phone,
                   LocalDate birthDate,
                   LocalDate joined,
                   Hospital hospital,
                   String specialty,
                   String locations) {
        super(title, givenName, middleName, familyName, gender, homeAddress, phone, birthDate, joined, hospital, specialty, locations);
    }
}
