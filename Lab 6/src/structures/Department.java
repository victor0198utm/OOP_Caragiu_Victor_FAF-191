package structures;

import peoples.Staff;

import java.util.ArrayList;

public class Department {
    public ArrayList<Staff> staff=new ArrayList<>();

    public void addStaff(Staff staff){
        this.staff.add(staff);
    }

    // additional printing feature
    public void printStaff(){
        for (int i=0; i<this.staff.size();i++){
            System.out.println(this.staff.get(i).getTitle() + ": " + this.staff.get(i).getName());
        }
    }

}
