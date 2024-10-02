import java.util.Scanner;

public class OddsAndEvens {
    public static String name;
    public static char oddsOrEvens;

    public static void main(String[] args) {
        greeting();
        askName();
        askOddsOrEvens();
        displayPlayersChoice();
        displayLines();
    }

    public static void displayLines() {
        System.out.println("-----------------------------------------------");
    }

    public static void greeting() {
        System.out.println("Let's play a game called “Odds and Evens”");
    }

    public static void askName() {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        name = input.nextLine();
    }

    public static void askOddsOrEvens() {
        Scanner input = new Scanner(System.in);
        System.out.println("Hi " + name + ", which do you choose? (O)dds or (E)vens?");
        oddsOrEvens = input.nextLine().charAt(0);
    }

    public static void displayPlayersChoice() {
        if (oddsOrEvens == 'O') {
            System.out.println(name + " has picked odds! The computer will be evens.");
        } else if (oddsOrEvens == 'E') {
            System.out.println(name + " has picked evens! The computer will be odds.");
        } else {
            System.out.println(name + " didn't pick a valid option (O or E)");
        }
    }
}
