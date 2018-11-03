import java.util.Scanner;
import java.lang.Math;

class circle{

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        double r = scanner.nextDouble();
        System.out.println("Perimeter is : "+2*Math.PI*r);
        System.out.println("Area is :"+Math.PI*r*r);


    }
}