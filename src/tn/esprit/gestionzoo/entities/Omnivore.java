package tn.esprit.gestionzoo.entities;

interface Omnivore<T> extends Herbivore<T>,Carnivore<T> {

   void eatPlantAndMeet(T food);
}
