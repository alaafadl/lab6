import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int years=0;


        System.out.println("Enter  initial investment balance");
        int investment = in.nextInt();


        System.out.println("Enter  initial  interest rate");
        int rate = in.nextInt();

        while (investment <= 1000000) {
            investment=investment+((investment*rate) /100);
            years++;
        }
        System.out.println("The years it takes for the investment to reach one million dollars :" + years);

    }

}