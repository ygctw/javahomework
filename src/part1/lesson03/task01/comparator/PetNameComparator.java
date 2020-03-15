package part1.lesson03.task01.comparator;

import part1.lesson03.task01.Pet;

import java.util.Comparator;

public class PetNameComparator implements Comparator<Pet> {
    @Override
    public int compare(Pet first, Pet second) {
        if (first.getName().compareTo(second.getName()) > 0) {
            return 1;
        } else if (first.getName().compareTo(second.getName()) < 0) {
            return -1;
        }
        return 0;
    }
}