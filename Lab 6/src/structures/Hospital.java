package structures;

import peoples.Person;

import java.util.ArrayList;

public class Hospital {
    private String name;
    private String address;
    private String phone;
    private ArrayList<Person> persons=new ArrayList<>();
    private ArrayList<Department> departments=new ArrayList<>();

    public Hospital(String name, String address, String phone){
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public void addPatient(Person person){
        this.persons.add(person);
    }

    public void addDepartments(Department department) {
        this.departments.add(department);
    }

    // additional printing feature
    public  void printPersons(){
        for (int i=0; i<this.persons.size();i++){
            System.out.println(this.persons.get(i).getName());
        }
    }

    public Department getDepartment(int idx) { return this.departments.get(idx); }
}
