package com.company;

public class Main2 {

    public static void main(String[] args) {

        //creem un strig builder cu num nostro si prin append adaugam familia

        StringBuilder sb = new StringBuilder("Natalia ");
        /*
        sb.append("Gojan");
        System.out.println(sb);
        sb.insert(2, 5 ); // pe pozitia 2 inseram numarul 5
        System.out.println(sb);
        sb.delete(0,5); //stergem pozitia 0 si 5
        System.out.println(sb);
        */

        StringBuilder sb2 = sb.append("Gojan");
        System.out.println(sb==sb2);
        System.out.println(sb.toString().equals(sb2.toString())); //facem asa pt ca .equals nu merge in stringbuilder











    }



}
