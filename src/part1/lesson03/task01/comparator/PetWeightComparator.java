package part1.lesson03.task01.comparator;

import part1.lesson03.task01.Pet;

import java.util.Comparator;

public class PetWeightComparator implements Comparator<Pet> {
    @Override
    public int compare(Pet first, Pet second) {
        if (Double.compare(first.getWeight(), second.getWeight()) > 0) {
            return 1;
        } else if (Double.compare(first.getWeight(), second.getWeight()) < 0) {
            return -1;
        }
        return 0;
    }
}