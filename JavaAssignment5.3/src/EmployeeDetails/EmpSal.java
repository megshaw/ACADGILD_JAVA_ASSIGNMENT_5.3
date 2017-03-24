package EmployeeDetails;

import java.util.*;
import java.lang.*;

class Emp {

    public static int emp_no;
    public static String name;
    public static String designation;

    public void showdata() {
        System.out.println("Employee number:--->" + emp_no);
        System.out.println("Employee name:------>" + name);
        System.out.println("Employee designation:--->" + designation);
    }
}

class Salary extends Emp {

    public static float bsal, hr, da, tsal;

    public void cal() {
        tsal = bsal + hr + da;
        System.out.println("Total salary:---->" + tsal);
    }
}

class EmpSal extends Salary {

    public void calc() {
        if (bsal >= 15000) {
            hr = 0.3f * bsal;
            da = 0.2f * bsal;
        } else if (bsal >= 10000) {
            hr = 0.4f * bsal;
            da = 0.3f * bsal;
        } else {
            hr = 0.3f * bsal + 500;
        }
        da = 0.2f * bsal + 500;
    }

    public static void main(String[] args) {
        EmpSal E = new EmpSal();
        emp_no = Integer.parseInt(args[0]);
        name = args[1];
        designation=  args[2];
        bsal = Integer.parseInt(args[3]);
        E.showdata();
        System.out.println("Employee Salary");
        E.calc();
        E.cal();
    }
}
