package peoples.administrative;

import peoples.Staff;
import structures.Hospital;

import java.time.LocalDate;

public abstract class AdministrativeStaff extends Staff{
    public AdministrativeStaff(String title,
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
