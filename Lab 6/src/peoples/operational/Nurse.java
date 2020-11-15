package peoples.operational;

import structures.Hospital;

import java.time.LocalDate;

public class Nurse extends OperationsStaff{
    public Nurse(String title,
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
