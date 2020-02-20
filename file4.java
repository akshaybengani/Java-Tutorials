import java.util.Scanner;
// 0 1 1 2 3 5 8 13 21

class file4{

public static void main(String args[])
{
	Scanner scan = new Scanner(System.in);
	int value = scan.nextInt();
	int a=0,b=1,sum=0,c=1;	

while(sum<value){
	a=b;
	b=sum;
	sum= a+b;
	if(sum<=value)
	c++;
}
if(value==sum)
System.out.println("Yes it comes in fabonacci series and its \nPosition is : "+c);
else
System.out.println("No it not comes in the series");

//end of main
}
//end of class
}