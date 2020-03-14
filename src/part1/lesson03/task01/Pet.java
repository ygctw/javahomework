package part1.lesson03.task01;

public class Pet {
    private int id;

    private String name;

    private double weight;

    private Person owner;

    public Pet(int id, String petName, double weight, Person owner) {
        this.id = id;
        this.name = petName;
        this.weight = weight;
        this.owner = owner;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public Person getOwner() {
        return owner;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", owner=" + owner +
                '}';
    }
}
