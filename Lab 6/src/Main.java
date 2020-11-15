import peoples.Patient;
import peoples.administrative.*;
import peoples.operational.*;
import peoples.technical.*;
import structures.Department;
import structures.Hospital;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // declare a hospital
        Hospital hospital = new Hospital("St. Luis", "45", "785113462");

        // declare a department and add to the hospital
        Department department = new Department();
        hospital.addDepartments(department);

        // declare a doctor and add to the department
        Doctor doctor = new Doctor("Doctor",
                "John",
                "",
                "Snow",
                "male",
                "32 Kennedy Street",
                "778456789",
                LocalDate.of(1978,11,23),
                LocalDate.now(),
                hospital,
                "Cardiologist",
                "302");
        doctor.addEducation("");
        doctor.addCertification("");
        doctor.addLanguages("English");
        doctor.addLanguages("Spanish");

        department.addStaff(doctor);

        // declare a surgeon and add to the department
        Surgeon surgeon = new Surgeon("Surgeon",
                "Mark",
                "",
                "Thompson",
                "male",
                "44 Homebrew",
                "745698213",
                LocalDate.of(1988,1,4),
                LocalDate.now(),
                hospital,
                "Neurological surgeon",
                "441");
        surgeon.addEducation("");
        surgeon.addCertification("");
        surgeon.addLanguages("English");
        surgeon.addLanguages("French");

        department.addStaff(surgeon);

        // declare a nurse and add to the department
        Nurse nurse = new Nurse("Nurse",
                "Sara",
                "",
                "Quin",
                "female",
                "5 Morelle Avenue",
                "711584965",
                LocalDate.of(1990, 4, 12),
                LocalDate.now(),
                hospital);
        nurse.addEducation("");
        nurse.addCertification("");
        nurse.addLanguages("English");
        nurse.addLanguages("Chinese");

        department.addStaff(nurse);

        // declare a receptionist and add to the department
        Receptionist receptionist = new Receptionist("Receptionist",
                "Derek",
                "",
                "Peterson",
                "male",
                "77 Garland",
                "794856784",
                LocalDate.of(2000, 12, 2),
                LocalDate.now(),
                hospital);
        receptionist.addEducation("");
        receptionist.addCertification("");
        receptionist.addLanguages("English");
        receptionist.addLanguages("Spanish");
        receptionist.addLanguages("French");

        department.addStaff(receptionist);

        // declare a technician and add to the department
        Technician technician = new Technician("Technician",
                "Adam",
                "",
                "Kirk",
                "male",
                "2 Adleman",
                "794784458",
                LocalDate.of(2994, 5, 5),
                LocalDate.now(),
                hospital);
        technician.addEducation("");
        technician.addCertification("");
        technician.addLanguages("English");

        department.addStaff(technician);

        // declare a technologist and add to the department
        Technologist technologist = new Technologist("Technologist",
                "Ben",
                "",
                "Howard",
                "male",
                "455 G. Morgan",
                "734564452",
                LocalDate.of(2982, 8, 22),
                LocalDate.now(),
                hospital);
        technologist.addEducation("");
        technologist.addCertification("");
        technologist.addLanguages("English");
        technologist.addLanguages("Greek");

        department.addStaff(technologist);

        // declare a surgicalTechnologist and add to the department
        SurgicalTechnologist surgicalTechnologist = new SurgicalTechnologist("Surgical Technologist",
                "Linda",
                "",
                "Dorwill",
                "female",
                "71 3rd Avenue",
                "708445127",
                LocalDate.of(2981, 11, 2),
                LocalDate.now(),
                hospital);
        surgicalTechnologist.addEducation("");
        surgicalTechnologist.addCertification("");
        surgicalTechnologist.addLanguages("English");
        technologist.addLanguages("Spanish");

        department.addStaff(surgicalTechnologist);

        // declare a patient, add to the hospital and operation
        Patient patient = new Patient("Patient",
                "Lara",
                "",
                "King",
                "female",
                "51 Brinston Avenue",
                "799846258",
                LocalDate.of(1997, 4,2),
                "4451",
                LocalDate.now(),
                "Knee",
                hospital);

        patient.addPrescription("Vitamin C 500mg");
        patient.addPrescription("Vitamin D3 500IU");
        patient.addAllergy("bee stings");
        patient.addSpecialReq("Make the lights dimmer");

        patient.addOperationStaff(doctor);
        patient.addOperationStaff(surgeon);

        hospital.addPatient(patient);

        // print hospital's staff
        System.out.println("Staff:");
        hospital.getDepartment(0).printStaff();
        // print hospital's patients
        System.out.println("Patients:");
        hospital.printPersons();

    }
}
