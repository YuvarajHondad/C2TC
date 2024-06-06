package venu;
import java.util.*;

public class main {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Range:");
		int n = sc.nextInt();
		
		int counter = 0;
		while( counter <= n)
		{
			System.out.print(counter+" ");
			counter++;	
		}
		System.out.println();
	}

}
