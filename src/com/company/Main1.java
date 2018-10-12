package com.company;


public class Main1 {

    public static void main(String[] args) {

        /*

        String Moldova = "Chisinau";
        String Moldova2 = new String("Moldova");


        String Romania = "Bucuresti";
        String Romania2 = new String( "Bucuresti");

        System.out.println(Moldova == Moldova2);
        System.out.println(Moldova != Moldova2);

        System.out.println(Romania != Romania2);
        System.out.println(Romania == Romania2);

        System.out.println(Moldova.equals(Moldova2));

        String s = "oleg";
        String upper = s.toUpperCase();
        System.out.println(upper);
        System.out.println(s);

        // *************************

        String oleg = "OLEG";
        oleg.toLowerCase();
        System.out.println(oleg.toLowerCase());
        System.out.println(oleg);  // tot se printeaza cu litere mici

        String oleg2 = oleg.toLowerCase();
        String oleg3 = oleg2.toUpperCase();

        System.out.println("");

        System.out.println(oleg==oleg3);

        */

        String c1 = "Natalia";
        String c2 = "Natalia";

        int comparatie = c1.compareTo(c2);
        if (comparatie < 0) {
            System.out.println("Al doilea nume este mai mare");
        } else if (comparatie > 0){
            System.out.println("Primul nume este mai mare");
        } else {
            System.out.println("Ele sunt egale");
        }


    }


}
