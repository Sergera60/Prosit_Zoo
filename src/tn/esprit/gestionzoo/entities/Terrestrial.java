package tn.esprit.gestionzoo.entities;

public final class Terrestrial extends Animal implements Omnivore<Food> {

    private int nbrLegs;

    public Terrestrial() {
    }

    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString() {
        return super.toString() + ", nbrLegs:" + nbrLegs;
    }
    @Override
    public void eatPlantAndMeet(Food food) {
        if(food==Food.BOTH) System.out.println("i eat meat and plants");
    }

    @Override
    public void eatMeat(Food meat) {
        if(meat==Food.MEAT) System.out.println("i eat meat");
    }

    @Override
    public void eatPlant(Food plant) {
        if(plant==Food.PLANT) System.out.println("i eat plants");
    }
}
