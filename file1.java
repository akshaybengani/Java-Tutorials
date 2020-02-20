import java.util.Scanner;

class file1{

	public static void main(String args[])
	{
	Scanner scan = new Scanner(System.in);
	int value = scan.nextInt();
	int counter=0;
while(value!=1)	
{
	counter++;
	if(value%2==0)
	{
		value = value/2;			
		System.out.println(value);
	}
	else
	{
		value = value*3+1;
		System.out.println(value);
	}	

}
System.out.println("It takes "+counter+" steps to reach");

// main end
	}
// class end
}