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

    protected String getPowerDifferenceGetResult(String winner, String loser, boolean isDraw) {
        if (isDraw) {
            return String.format("%s лучший Слизеринец, чем %s%n", winner, loser);
        }
        return String.format("%s такой же Слизеринец, чем %s%n", winner, loser);
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
