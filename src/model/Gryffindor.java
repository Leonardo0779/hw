package model;

public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int magicalPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, magicalPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    protected String getPowerDifferenceGetResult(String winner, String loser, boolean isDraw) {
        if (isDraw) {
            return String.format("%s лучший Гриффиндорец, чем %s%n", winner, loser);
        }
        return String.format("%s такой же Гриффиндорец, чем %s%n", winner, loser);
    }

    protected int getPower() {
        return nobility + honor + bravery;
    }

    @Override
    public String toString() {
        return "Gryffindor" +
                ", name=" + getName() +
                ", transgressionDistance=" + getTransgressionDistance() +
                ", magicalPower=" + getMagicalPower() +
                ", nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }
}
