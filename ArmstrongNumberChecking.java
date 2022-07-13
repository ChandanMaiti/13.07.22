//write a program to check Armstrong number or not?.


package BasicProgram;

import java.util.Scanner;
public class ArmstrongNumberChecking {
	public static void main(String[] args)
	{
		int num,rem,temp,arm=0;
		System.out.println("Enter number for checking armstrong or not?");
		Scanner scan=new Scanner(System.in);
		num = scan.nextInt();
		temp = num;
		while(num>0)
		{
			rem = num%10;
			arm = (rem*rem*rem)+arm;
			num = num/10;
		}
		if( temp == arm)
			System.out.println(temp+ " is Armstrong number.");
		else
			System.out.println(temp+ " is not Armstrong number.");
				
	}

}
