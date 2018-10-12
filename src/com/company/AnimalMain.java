package com.company;

public class AnimalMain {

    public static void main(String args[]) {

        Animal[] animals = new Animal[3];
        // null, null, null - creaza 3 obiecte dar pina cand sunt null,pt ca nam creat nici un animal

        Animal one = new Animal();
        one.name = "Dog";

        Animal two = new Animal();
        two.name = "Cat";

        Animal three = new Animal();
        three.name = "Cow";

        animals[0] = one;
        animals[1] = two;
        animals[2] = three;

        //numaram cate animale incep cu litera C, folosim FOR EACH, x - cream o variabila care FOR se ocupa

        int animalCounter = 0;

        for (Animal x : animals)   //ce contine array ul aceea punem, sa fi fost array Int avea sa fie int in loc de Animal
                                   // prin acest for garantam ca trecem prin fiecare animal
            {

            if (x.name.startsWith("C")) {
                animalCounter++;               //sau animalCounter = animalCounter + 1;
            }

        }

        System.out.println(animalCounter);



    }
}
