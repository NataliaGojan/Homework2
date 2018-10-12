public class Lesson6Homework {
    public static void main(String[] args) {

        /* Creati o lista de numere care reprezinta temperaturile medii pe luna in anul 2017 din republica moldova
         -  in Celsius, si printati-le la ecran. Exista persoane din alte tari care nu se folosesc de Celsius ca
         unitate de masura pentru temperatura - dar Kelvin. Convertiti temperaturile din lista aceasta din Celsius
         in Kelvin  si printati-le corespunzator la ecran.
        */


        String [] luni = {"Ianuarie", "Februarie", "Martie", "Aprilie", "Mai", "Iunie", "Iulie", "August", "Septembrie",
         "Octombrie", "Noiembrie", "Decembrie"};
        int [] grade = {-10, -8, 6, 11, 13, 20, 25, 26, 15, 13, 11, 9 };

        System.out.println("");
        System.out.println("Temperatura pentru europeni:");

        for (int i=0; i < luni.length ;i++) {
            System.out.println (luni [i] + ": " + grade[i] + "° Celsius");
        }

        System.out.println("");
        System.out.println("Temperatura pentru americani:");

        for (int i=0; i < luni.length; i++) {
            double kelvin = 273.15 + grade[i];
            System.out.println(luni[i] + ": " + kelvin + " Kelvin");
        }

    }


}
