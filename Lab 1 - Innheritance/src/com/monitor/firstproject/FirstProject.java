package com.monitor.firstproject;
import java.util.Scanner;

public class FirstProject {
    private void projType(){
        System.out.println("Project");
    }

    public static void main(String[] args) {
        System.out.println(" - Start");
        FirstProject fp = new FirstProject();
        fp.projType();
        SubFirstProject sfp = new SubFirstProject();
        sfp.projSubType();
        sfp.level();
        SubSubFirstProject ssfp = new SubSubFirstProject();
        ssfp.projSubType();
        ssfp.level();
    }
}
