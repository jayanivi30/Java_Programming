package Basics;

public class printfbasics2 {
	public static void main(String args[]) {
	int n1,n2,n3;
	n1=1;
	n2=12;
	n3=123;
	//to arrange the numbers in order
	System.out.printf("%3d\n",n1);
	System.out.printf("%3d\n",n2);
	System.out.printf("%3d\n",n3);
	//to add zero before the numbers
	System.out.printf("%03d\n",n1);
	System.out.printf("%03d\n",n2);
	System.out.printf("%03d\n",n3);
	//to add coma to amounts
	int n4=4000;
	System.out.printf("%,d\n",n4);
	}

}
