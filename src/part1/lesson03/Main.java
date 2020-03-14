package part1.lesson03;

import part1.lesson03.task01.Person;
import part1.lesson03.task01.Pet;
import part1.lesson03.task01.Sex;
import part1.lesson03.task01.comparator.PetNameComparator;
import part1.lesson03.task01.comparator.PetOwnerComparator;

public class Main {

    public static void main(String[] args) {
        PetCardfile Card = new PetCardfile();
        Card.add(new Pet(1, "Jeka", 15, new Person("Gleb", 20, Sex.MAN)));
        Card.add(new Pet(2, "Stas", 2, new Person("Testo", 20, Sex.MAN)));
        Card.add(new Pet(3, "Azur", 20, new Person("Nwa", 20, Sex.MAN)));
        for (Pet pet : Card
        ) {
            System.out.println(pet.toString());
        }
        Card.sort(new PetOwnerComparator());
        for (Pet pet : Card
        ) {
            System.out.println(pet.toString());
        }
    }
}
