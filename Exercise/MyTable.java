import java.util.Scanner;

class MyTable
{

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int a = scanner.nextInt();

        for(int i = 1;i<=10;i++)
        {
            System.out.println(a+" x "+i+" = "+(a*i));
        }



    }
}