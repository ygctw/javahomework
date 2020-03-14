package part1.lesson03;

import part1.lesson03.task01.Person;
import part1.lesson03.task01.Pet;

import java.util.*;

public class PetCardfile extends ArrayList<Pet> {

    @Override
    public boolean add(Pet pet) {
        if (super.contains(pet) || !this.isIdUnique(pet.getId()) || !this.isNameUnique(pet.getName())) {
            throw new IllegalArgumentException("This pet is not unique in collection");
        } else {
            return super.add(pet);
        }
    }

    public Pet getPetByName(String petName) {
        for (Pet pet : this) {
            if (pet.getName().equals(petName)) {
                return pet;
            }
        }
        throw new IllegalArgumentException("This collection does not contain any pet with Name: " + petName);
    }

    public void setPetNameById(int id, String newName) {
        if (!this.isNameUnique(newName) || this.getPetById(id).getName().equals(newName)) {
            throw new IllegalArgumentException("New name is not unique in this list.");
        }
        this.getPetById(id).setName(newName);
    }

    public void setPetOwnerById(int id, Person newOwner) {
        this.getPetById(id).setOwner(newOwner);
    }

    public void setPetWeightById(int id, double newWeight) {
        this.getPetById(id).setWeight(newWeight);
    }

    private Pet getPetById(int id) {
        for (Pet pet : this) {
            if (id == pet.getId()) {
                return pet;
            }
        }
        throw new IllegalArgumentException("This collection does not contain any pet with Id: " + id);
    }

    public boolean isIdUnique(int id) {
        for (Pet pet : this) {
            if (id == pet.getId()) {
                return false;
            }
        }
        return true;
    }

    public boolean isNameUnique(String name) {
        for (Pet pet : this) {
            if (pet.getName().equals(name)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void sort(Comparator<? super Pet> c) {
        super.sort(c);
    }
}

