package part1.lesson03;

import part1.lesson03.task01.Person;
import part1.lesson03.task01.Pet;

import java.util.*;

public class PetCardfile extends ArrayList<Pet>{

    @Override
    public boolean add(Pet pet) {
        if(super.contains(pet)){
            throw new IllegalArgumentException("This pet is already in collection");
        }
        else
            return super.add(pet);
    }

    public Pet get
}
