import java.util.Scanner;

/*
* Author : stephanerheaume
*Date : 15-Jan-2021
*/
public class FiveCities
	{

		public static void main(String[] args)
			{
				
				int distance[] = new int [4];
				int city[] = new int [5];
				
				//input
				Scanner sc = new Scanner(System.in);
				for (int i=0; i<4;i++) {
					distance[i] = sc.nextInt();
				}
				
				// City distances
				city[0] = 0;
				for (int i=1; i<5; ++i) {
					city[i] = city[i-1] + distance[i-1];
					
				}
				
				//calculate
				for (int i=0; i<5; ++i) 
				{
					
					for (int j=0; j<5; ++j) 
					{
					//output
						int r = city[j] - city[i];
						if (r<0) r *= -1;
						System.out.println(r);
						System.out.println(" ");
					
					}
					
					System.out.println();
				}
				sc.close();
				
			}

	}
