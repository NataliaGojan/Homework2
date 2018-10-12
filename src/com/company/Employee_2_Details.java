package com.company;

public class Employee_2_Details {

    public static void main (String args[]) {

        Employee firstEmployee = new Employee();
        Employee secondEmployee = new Employee();


        firstEmployee.name = "Natalia";
        firstEmployee.country = "Moldova";
        firstEmployee.monthySalary = 6545.50;
        firstEmployee.marks = new double[]{9, 8.5, 9, 4, 10, 8};

        secondEmployee.name = "Anna";
        secondEmployee.country = "Italy";
        secondEmployee.monthySalary = 15650.50;
        secondEmployee.marks = new double[]{8, 8.5, 9.6, 10, 7.5};

        firstEmployee.PrintDetalii();
        secondEmployee.PrintDetalii();







    }

    }
