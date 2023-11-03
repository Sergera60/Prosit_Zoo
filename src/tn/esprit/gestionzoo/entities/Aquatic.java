package tn.esprit.gestionzoo.entities;

public abstract non-sealed class Aquatic extends Animal implements Carnivore<Food>{

    protected String habitat;

    public Aquatic() {
    }

    @Override
    public void eatMeat(Food meat) {
        if (meat ==Food.MEAT) System.out.println("i eat meat");
    }

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }


    public  abstract void swim() ;

    @Override
    public String toString() {
        return super.toString() + ", habitat:" + habitat;
    }

    @Override
    public boolean equals(Object obj) {
        // Check if the objects are the same reference
        if (this == obj) {
            return true;
        }

        // Check if obj is an instance of Aquatic
        if (!(obj instanceof Aquatic)) {
            return false;
        }

        // Cast obj to Aquatic
        Aquatic otherAquatic = (Aquatic) obj;

        // Compare the fields: name, age, and habitat
        return this.getName().equals(otherAquatic.getName()) &&
                this.getAge() == otherAquatic.getAge() &&
                this.habitat.equals(otherAquatic.habitat);
    }
}
