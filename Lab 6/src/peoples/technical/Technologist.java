package peoples.technical;

import structures.Hospital;

import java.time.LocalDate;

public class Technologist extends TechnicalStaff{
    public Technologist(String title,
                        String givenName,
                        String middleName,
                        String familyName,
                        String gender,
                        String homeAddress,
                        String phone,
                        LocalDate birthDate,
                        LocalDate joined,
                        Hospital hospital) {
        super(title, givenName, middleName, familyName, gender, homeAddress, phone, birthDate, joined, hospital);
    }
}
