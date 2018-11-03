import java.util.Scanner;

public class MyArthmetics{

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input First Number: ");
        int a = scanner.nextInt();
        System.out.print("Input Second Number: ");
        int b = scanner.nextInt();

        System.out.println(a+" + "+b+" = "+(a+b));
        System.out.println(a+" - "+b+" = "+(a-b));
        System.out.println(a+" * "+b+" = "+(a*b));
        System.out.println(a+" / "+b+" = "+(a/b));
        System.out.println(a+" mod "+b+" = "+(a%b));


    }
}