package peoples;

import peoples.operational.OperationsStaff;
import structures.Hospital;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Patient extends Person{
    private String id;
    private int age;
    private LocalDate accepted;
    private String sickness;
    private ArrayList<String> prescriptions = new ArrayList<>();
    private ArrayList<String> allergies = new ArrayList<>();
    private ArrayList<String> specialReqs = new ArrayList<>();
    private ArrayList<OperationsStaff> operationsStaff = new ArrayList<>();

    public Patient(String title,
                   String givenName,
                   String middleName,
                   String familyName,
                   String gender,
                   String homeAddress,
                   String phone,
                   LocalDate birthDate,
                   String id,
                   LocalDate accepted,
                   String sickness,
                   Hospital hospital){
        super(title, givenName, middleName, familyName, gender, homeAddress, phone, birthDate, hospital);
        this.id = id;

        // compute age
        LocalDate today = LocalDate.now();
        Period period = Period.between(birthDate, today);
        this.age = period.getYears();

        this.accepted = accepted;
        this.sickness = sickness;
    }

    public void addPrescription(String prescription){
        this.prescriptions.add(prescription);
    }

    public void addAllergy(String allergy) { this.allergies.add(allergy); }

    public void addSpecialReq(String specialReqs){
        this.specialReqs.add(specialReqs);
    }

    public void addOperationStaff(OperationsStaff operationsStaff) { this.operationsStaff.add(operationsStaff); }
}
