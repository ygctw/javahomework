package part1.lesson03.task01;

public class Person {
    private int age;

    private Sex sex;

    private String name;

    public Person(String name, int age, Sex sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public Sex getSex() {
        return sex;
    }

    public String getName() {
        return name;
    }

    public void setAge(int ageValue) {
        if(ageValue > 100 || ageValue < 0){
            throw new IndexOutOfBoundsException("Age value must be in [0,100] range.");
        }
        else{
            this.age = ageValue;
        }
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", sex=" + sex +
                ", name='" + name + '\'' +
                '}';
    }
}
