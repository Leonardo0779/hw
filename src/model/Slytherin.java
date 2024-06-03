package model;

public class Slytherin extends Hogwarts {
    private int cunning;
    private int determined;
    private int ambitious;
    private int resourceful;
    private int powerHungry;

    public Slytherin(String name, int magicalPower, int transgressionDistance, int cunning, int determined, int ambitious,
                     int resourceful, int powerHungry) {
        super(name, magicalPower, transgressionDistance);
        this.cunning = cunning;
        this.determined = determined;
        this.ambitious = ambitious;
        this.resourceful = resourceful;
        this.powerHungry = powerHungry;
    }

    public void printPowerDifference(Slytherin student) {
        if (this.getPower() > student.getPower()) {
            System.out.printf("%s лучший Слизеринец, чем %s%n", this.getName(), student.getName());
        } else if (this.getPower() < student.getPower()) {
            System.out.printf("%s лучший Слизеринец, чем %s%n", student.getName(), this.getName());
        } else {
            System.out.printf("%s такой же лучший Слизеринец, чем %s%n", this.getName(), student.getName());
        }
    }

    protected int getPower() {
        return determined + ambitious + resourceful + powerHungry;
    }

    @Override
    public String toString() {
        return "Slytherin" +
                ", name=" + getName() +
                ", transgressionDistance=" + getTransgressionDistance() +
                ", magicalPower=" + getMagicalPower() +
                ", nobility=" + cunning +
                ", honor=" + determined +
                ", bravery=" + ambitious +
                ", resourceful=" + resourceful +
                ", powerHungry=" + powerHungry +
                '}';
    }
}
