package peoples;

import structures.Hospital;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Staff extends Person{
    private LocalDate joined;
    private ArrayList<String> education = new ArrayList<>();
    private ArrayList<String> certification = new ArrayList<>();
    private ArrayList<String> languages = new ArrayList<>();

    public Staff(String title,
                 String givenName,
                 String middleName,
                 String familyName,
                 String gender,
                 String homeAddress,
                 String phone,
                 LocalDate birthDate,
                 LocalDate joined,
                 Hospital hospital) {
        super(title, givenName, middleName, familyName, gender, homeAddress, phone, birthDate, hospital);
        this.joined = joined;
    }

    public void addEducation(String education) { this.education.add(education); }

    public void addCertification(String certification) {
        this.certification.add(certification);
    }

    public void addLanguages(String languages) {
        this.languages.add(languages);
    }
}
