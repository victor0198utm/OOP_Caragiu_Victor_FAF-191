package peoples;
import structures.Hospital;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Person {
    private String title;
    private String givenName;
    private String middleName;
    private String familyName;
    private String name;
    private String gender;
    private String homeAddress;
    private String phone;
    private LocalDate birthDate;
    private ArrayList<Hospital> hospitals=new ArrayList<>();

    Person(String title,
           String givenName,
           String middleName,
           String familyName,
           String gender,
           String homeAddress,
           String phone,
           LocalDate birthDate,
           Hospital hospital){
        this.title = title;
        this.givenName = givenName;
        this.middleName = middleName;
        this.familyName = familyName;
        this.name = givenName + ' ' + middleName + ' ' + familyName;
        this.gender = gender;
        this.homeAddress = homeAddress;
        this.phone = phone;
        this.birthDate = birthDate;
        this.addHospital(hospital);
    }

    public void addHospital(Hospital hospital){
        this.hospitals.add(hospital);
    }

    public String getTitle(){ return this.title; }

    public String getName(){ return this.name; }
}
