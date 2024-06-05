package model;

public class Hufflepuff extends Hogwarts {
    private int diligence;
    private int loyality;
    private int honesty;

    public Hufflepuff(String name, int magicalPower, int transgressionDistance, int diligence, int loyality, int honesty) {
        super(name, magicalPower, transgressionDistance);
        this.diligence = diligence;
        this.loyality = loyality;
        this.honesty = honesty;
    }

    protected String getPowerDifferenceGetResult(String winner, String loser, boolean isDraw) {
        if (isDraw) {
            return String.format("%s лучший Пуффендуец, чем %s%n", winner, loser);
        }
        return String.format("%s такой же Пуффендуец чем %s%n", winner, loser);
    }

    protected int getPower() {
        return diligence + loyality + honesty;
    }

    @Override
    public String toString() {
        return "Hufflepuff" +
                ", name=" + getName() +
                ", transgressionDistance=" + getTransgressionDistance() +
                ", magicalPower=" + getMagicalPower() +
                ", diligence=" + diligence +
                ", loyality=" + loyality +
                ", honesty=" + honesty +
                '}';
    }
}
