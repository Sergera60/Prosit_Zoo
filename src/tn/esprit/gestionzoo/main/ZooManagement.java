package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {

    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.setName("Simba");
        lion.setAge(8);
        lion.setFamily("Cats");
        lion.setMammal(true);

        Zoo myZoo = new Zoo("Wildlife Park", "Ariana");
        Zoo notMyZoo = new Zoo("WaterPark", "Siliana");


        Animal dog = new Animal("Canine", "Snoopy", 2, true);



        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(dog));
        Animal dog2 = new Animal("Canine", "lll", 2, true);
        System.out.println(myZoo.searchAnimal(dog2));

//           System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();


        System.out.println(myZoo);



        try {
            myZoo.addAnimal(lion);
            myZoo.addAnimal(dog);
            myZoo.addAnimal(lion);
            myZoo.addAnimal(dog);
            myZoo.addAnimal(dog2);}
        catch ( ZooFullException e){
            System.out.println("Erreur: " + e.getMessage());
        }
        catch (InvalidAgeException a){System.out.println("Erreur: " + a.getMessage());}

        myZoo.displayAnimals();


        myZoo.setName("Belvedere Park");
        Zoo notMyZoo1 = Zoo.comparerZoo(myZoo, notMyZoo);
        System.out.println(notMyZoo1);

        System.out.println("-------------------------------------------------------");

        Terrestrial terrestrial = new Terrestrial("Panda", "Narla", 4, true, 2);
        Dolphin dolphin = new Dolphin("Delphinidae", "Flipper", 5, true, "Ocean", 14.5f);
        Penguin penguin = new Penguin("Spheniscidae", "Skipper", 3, true, "Ocean", 25.3f);

        Dolphin dolphin1 = new Dolphin("Delphinidae1", "Flipper", 5, true, "Ocean", 14.5f);
        Penguin penguin1 = new Penguin("Spheniscidae2", "Skipper", 3, true, "Ocean", 25.3f);

       /* Aquatic aquatic = new Aquatic("Fish", "Sardine", 2, true, "Sea");
            Aquatic aquatic1 = new Aquatic("Fish1", "Sardine1", 2, true, "Sea");

            Aquatic aquatic2 = new Aquatic("Fish2", "Sardine2", 2, true, "Sea");

*/
       /* System.out.println(aquatic);*/
       /* System.out.println(terrestrial);
        System.out.println(dolphin);
        System.out.println(penguin);
*/


        /*aquatic.swim();*/
        dolphin.swim();
        penguin.swim();
dolphin1.swim();
penguin1.swim();




      myZoo.addAquaticAnimal(dolphin);
        myZoo.addAquaticAnimal(penguin);

        myZoo.addAquaticAnimal(dolphin1);
        myZoo.addAquaticAnimal(penguin1);

        myZoo.displaySwimmingOfAquaticAnimals();
        myZoo.maxPenguinSwimmingDepth();
        myZoo.displayNumberOfAquaticsByType();


        terrestrial.eatMeat(Food.MEAT);
        terrestrial.eatMeat(Food.PLANT);
        terrestrial.eatMeat(Food.BOTH);
        Aquatic a = new Aquatic("Fish", "Sardine", 2, true, "Sea"){
            public void swim() {
                System.out.println("This aquatic animal swims.");
            }
        } ;

        a.eatMeat(Food.MEAT);
        penguin.eatMeat(Food.MEAT);

    }

}
