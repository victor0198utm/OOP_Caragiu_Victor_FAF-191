package peoples.operational;

import peoples.Patient;
import peoples.Staff;
import structures.Hospital;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class OperationsStaff extends Staff {
    public ArrayList<Patient> patients=new ArrayList<>();

    public OperationsStaff(String title,
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

    public void addPatient(Patient patient){
        this.patients.add(patient);
    }

}
