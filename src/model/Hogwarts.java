package model;

import java.util.Objects;

public class Hogwarts {
    private String name;
    private int magicalPower;
    private int transgressionDistance;

    public Hogwarts(String name, int magicalPower, int transgressionDistance) {
        this.name = name;
        this.magicalPower = magicalPower;
        this.transgressionDistance = transgressionDistance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hogwarts hogwarts = (Hogwarts) o;
        return magicalPower == hogwarts.magicalPower && transgressionDistance == hogwarts.transgressionDistance && Objects.equals(name, hogwarts.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, magicalPower, transgressionDistance);
    }

    protected String getName() {
        return name;
    }

    protected int getMagicalPower() {
        return magicalPower;
    }

    protected int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void printPowerDifference(Hogwarts student) {
        if (this.getPower() > student.getPower()) {
            System.out.printf("%s обладает большей мощностью магии, чем %s%n", this.getName(), student.getName());
        } else if (this.getPower() < student.getPower()) {
            System.out.printf("%s обладает большей мощностью магии, чем %s%n", student.getName(), this.getName());
        } else {
            System.out.printf("%s обладает такой же мощностью магии, чем %s%n", this.getName(), student.getName());
        }
    }

    protected int getPower() {
        return transgressionDistance + magicalPower;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", magicalPower=" + magicalPower +
                ", transgressionDistance=" + transgressionDistance +
                '}';
    }
}