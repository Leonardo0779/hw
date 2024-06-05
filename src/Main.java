import model.Gryffindor;
import model.Hogwarts;
import model.Slytherin;
import model.Hufflepuff;
import model.Ravenclaw;
public class Main {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Harry Potter", 87,45,88,95,90);
        Gryffindor hermioneGranger = new Gryffindor("Hermione Granger", 92,41,85,30,80);
        Gryffindor ronWeasley = new Gryffindor("Ron Weasley", 50,24,56,21,33);
        Slytherin drakoMalfoy = new Slytherin("Drako Malfoy",84,49,32,12,44,32,87);
        Slytherin grahamMontague = new Slytherin("Graham Montague",44,25,31,66,41,30,56);
        Slytherin gregoryGoyle = new Slytherin("Gregory Goyle",56,42,30,15,49,37,47);
        Hufflepuff zachariahSmith = new Hufflepuff("Zacharia",62,22,19,24,29);
        Hufflepuff cedricDiggory = new Hufflepuff("Cedric Diggory",82,72,49,54,89);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Justin Finch-Fletchley",60,20,18,20,29);
        Ravenclaw padmaPatil = new Ravenclaw("Padma Patil",23,27,19,28,30,42);
        Ravenclaw zhouChang = new Ravenclaw("Zhou Chang",30,32,22,28,39,44);
        Ravenclaw marcusBelby = new Ravenclaw("Marcus Belby",48,70,19,54,39,49);
        Hogwarts sergey = new Hogwarts("Sergey",99,99);
        Hogwarts oleg = new Hogwarts("Oleg",98,98);
        System.out.println(harryPotter);
        System.out.println(hermioneGranger);
        System.out.println(ronWeasley);
        System.out.println(drakoMalfoy);
        System.out.println(grahamMontague);
        System.out.println(gregoryGoyle);
        System.out.println(zachariahSmith);
        System.out.println(cedricDiggory);
        System.out.println(justinFinchFletchley);
        System.out.println(padmaPatil);
        System.out.println(zhouChang);
        System.out.println(marcusBelby);
        System.out.println(sergey);
        System.out.println(oleg);

        sergey.printPowerDifference(oleg);
    }
}