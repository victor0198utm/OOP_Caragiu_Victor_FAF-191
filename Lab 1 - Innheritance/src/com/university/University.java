package com.university;

public class University {
    String name;
    int found_year;
    Student[] students = new Student[3];

    public double Average(){
        double sum = 0;
        for(int i=0; i< students.length; i++){
            sum += this.students[0].mark;
        }
        return sum / students.length;
    }

    public static void main(String[] args) {
        University[] universities = new University[3];

        // university 1
        universities[0] = new University();
        universities[0].name = "UTM";
        universities[0].found_year = 1964;

        universities[0].students[0] = new Student();
        universities[0].students[0].name = "Name1 Surname1";
        universities[0].students[0].age = 20;
        universities[0].students[0].mark = 9.1;
        universities[0].students[1] = new Student();
        universities[0].students[1].name = "Name2 Surname2";
        universities[0].students[1].age = 20;
        universities[0].students[1].mark = 9.6;
        universities[0].students[2] = new Student();
        universities[0].students[2].name = "Name3 Surname3";
        universities[0].students[2].age = 20;
        universities[0].students[2].mark = 8.1;

        // university 2
        universities[1] = new University();
        universities[1].name = "USM";
        universities[1].found_year = 1922;

        universities[1].students[0] = new Student();
        universities[1].students[0].name = "Name4 Surname4";
        universities[1].students[0].age = 20;
        universities[1].students[0].mark = 8.4;
        universities[1].students[1] = new Student();
        universities[1].students[1].name = "Name5 Surname5";
        universities[1].students[1].age = 20;
        universities[1].students[1].mark = 9.3;
        universities[1].students[2] = new Student();
        universities[1].students[2].name = "Name6 Surname6";
        universities[1].students[2].age = 20;
        universities[1].students[2].mark = 7.1;

        // university 2
        universities[2] = new University();
        universities[2].name = "USMF";
        universities[2].found_year = 1944;

        universities[2].students[0] = new Student();
        universities[2].students[0].name = "Name7 Surname7";
        universities[2].students[0].age = 20;
        universities[2].students[0].mark = 7.4;
        universities[2].students[1] = new Student();
        universities[2].students[1].name = "Name8 Surname8";
        universities[2].students[1].age = 20;
        universities[2].students[1].mark = 8.3;
        universities[2].students[2] = new Student();
        universities[2].students[2].name = "Name9 Surname9";
        universities[2].students[2].age = 20;
        universities[2].students[2].mark = 6.1;

        System.out.println("Average of " + universities[0].name + ": " + universities[0].Average());
        System.out.println("Average of " + universities[1].name + ": " + universities[1].Average());
        System.out.println("Average of " + universities[2].name + ": " + universities[2].Average());

    }
}
