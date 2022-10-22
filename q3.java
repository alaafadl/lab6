import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {

        for (int i = 2; i <= 100; i++) {
            if(i%2 == 0)
                System.out.println(i);
        }

        Scanner in=new Scanner(System.in);
        System.out.println("Enter tow numbers :");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        for (int i = n1; i <= n2; i++) {
            if(i%2 != 0)
                System.out.println(i);
        }


        System.out.println("Enter number :");
        int number  = in.nextInt();
        int sum=0 , rem;

        while (number!=0)
        {
            rem=number%10;
            if (rem%2 != 0) {
                sum+=rem;
            }
            number=number/10;
        }
        System.out.println(sum);


    }

}
