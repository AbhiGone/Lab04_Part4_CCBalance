import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int credit = 5000;
        double intrest = .17;

        double monthOne = credit*intrest;
        double monthOneTotal = credit + monthOne;
        double monthTwo = (credit+monthOne)*intrest;
        double monthTwoTotal = monthOneTotal + monthTwo;

        System.out.println("your credit balance after one month is, $" + monthOneTotal + " and your intrest is, $" + monthOne + ".");
        System.out.println("your credit balance after one month is, $" + monthTwoTotal + " and your intrest is, $" + monthTwo + ".");
    }
}