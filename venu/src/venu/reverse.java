package venu;
import java.util.*;

public class reverse
{
	public static void main(String[] args)
	{
		 int num =10889;
		 int rev = 0;
		 while(num > 0)
		 {
			int lastdigit = num% 10;
			rev = (rev*10)+lastdigit;
			System.out.print(rev);
			num = num/10;
		 }
		 System.out.println();
		 
		 
	}

}
