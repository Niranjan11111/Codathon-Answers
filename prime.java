import java.util.*;

public class prime {

	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int b, i, j;
		boolean flag;

		System.out.println("Enter range: ");
		b = sc.nextInt(); 

		for (i = 2; i <= b; i++) {
			flag = true;

			for (j = 2; j <= i/2; ++j) {// divided by two for optimization
				if (i % j == 0) {
					flag = false;
				}
			}
			if (flag)
				System.out.println(i);
				
		}
	}
}
