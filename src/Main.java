import model.Gryffindor;
import model.Hogwarts;
import model.Slytherin;
import model.Hufflepuff;
import model.Ravenclaw;
public class Main {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Harry Potter", 87,45,88,95,90);
        Slytherin drakoMalfoy = new Slytherin("Drako",84,49,32,12,44,32,87);
        Hufflepuff zachariahSmith = new Hufflepuff("Zacharia",62,22,19,24,29);
        Ravenclaw padmaPatil = new Ravenclaw("Padma",23,27,19,28,30,42);
        Hogwarts sergey = new Hogwarts("Sergey",99,99);
        Hogwarts oleg = new Hogwarts("Oleg",98,98);
        System.out.println(harryPotter);
        System.out.println(drakoMalfoy);
        System.out.println(zachariahSmith);
        System.out.println(padmaPatil);
        System.out.println(sergey);
        System.out.println(oleg);
    }
}