public class Lesson6exercise {

    public static void main(String[] args) {


         String [] sweets = {"Clepsidra", "Masca", "Doremi", "Rafaelo", "orasul de seara" };


        for (int i = 0; i< sweets.length; i++) {
            sweets [i] = sweets [i] + "!";
        }
        for (int i = 0; i < sweets.length; i++) {
            if (i==0) {
                System.out.print (sweets [i]);
            } else {
                System.out.print (", " + sweets [i]);
            }
        }

     double [] numere = {1,2,3.5,4,5,6};
        for (int i = 0; i < numere.length; i++) {
            numere [i] = Math.pow(numere[i], 2);
        }

        for (int i = 0; i < numere.length; i++) {
            int numar = (int) numere [i];
            System.out.print(numar+" ");
            //System.out.print (numere [i] + " ");
        }


        /*for (double numar : numere) {
            int numarIntreg = (int) numar;
            System.out.print (numarIntreg + " ");
        }*/


}
}


