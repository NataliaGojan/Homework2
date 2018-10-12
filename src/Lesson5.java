public class Lesson5 {

    public static void main(String[] args) {
    boolean b = 5 > 6;
    boolean c = !b;

    System.out.println (b);
    System.out.println (c);


    // %  inmulteste la nr invers dar returneaza rezultatul

        System.out.println (7%2); // 2*3+1

        // AND  &&, OR = ||

        boolean afaraPloua = false;
        boolean afaraEfrig = true;
        boolean aziEmiercuri = true;

        boolean stauAcasa = aziEmiercuri && afaraEfrig && afaraPloua;
        System.out.println (stauAcasa);


        if (stauAcasa== true) {
            System.out.println("eu stau acasa");
        } else {
            System.out.println ("ma duc la perechi");

        }


        // ARRAY  []

        int [] note = new int [10];
        note [0] = 9;
        note [1] = 8;
        note [12] = 12;

        double media = ( note [0] + note [1]) / 2.0; //calculam media la primii doi elevi

        //cum sa calculam media la toti elevii:

        for (int i = 0; i < note.length; i++) {

            System.out.println (note [i]);

        }


        System.out.println ( note [0]);
        System.out.println ( note [7]);
        System.out.println ( note [12]);   //apare exceptie care a sa le invatam mai tarziu
        System.out.println (media);

        /* alta metoda de a declara un array exemplu:  int [] note = {,12,3,4,5,3,,5,7,8,9,4,4};
         se mai poate de scris asa cand inca nu vreau sa initializez:  int [] array;

         */




    }

}
