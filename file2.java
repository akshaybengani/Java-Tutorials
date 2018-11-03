// Write a java program to convert decimal into binary number
import java.util.Scanner;

class file2{
	
public static void main(String args[])
{
	Scanner scan = new Scanner(System.in);
	int value = scan.nextInt();
	int[] myarray = new int[1000];	
	int i=0;
	while(value>0)
	{
		myarray[i]= value%2;		
		value = value/2;
		i++;
	}
	
	for(int j=0;j<i;j++)
	{
		System.out.print(myarray[j]);
	}

// End of main	
}
// End of class
}