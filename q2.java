import java.util.Scanner;


public class q2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter  an integer :");
        int integer=in.nextInt();
        for (int i=0 ; i<=integer ; i++)
        {
            if (i%3 != 0 && i%2 !=0 || i==2 || i==3 )
                System.out.println(i);
        }

    }
}
