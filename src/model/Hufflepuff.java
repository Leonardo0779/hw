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

    public void printPowerDifference(Hufflepuff student) {
        if (this.getPower() > student.getPower()) {
            System.out.printf("%s лучший Пуффендуец, чем %s%n", this.getName(), student.getName());
        } else if (this.getPower() < student.getPower()) {
            System.out.printf("%s лучший Пуффендуец, чем %s%n", student.getName(), this.getName());
        } else {
            System.out.printf("%s такой же Пуффендуец, чем %s%n", this.getName(), student.getName());
        }
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
