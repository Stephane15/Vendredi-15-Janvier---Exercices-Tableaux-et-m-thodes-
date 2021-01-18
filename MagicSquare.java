import java.util.Scanner;

/*
* Author : stephanerheaume
*Date : 15-Jan-2021
*/
public class MagicSquare
	{

		public static void main(String[] args)
			{
				
				//input 
				Scanner sc = new Scanner(System.in);
				
				int A1 = sc.nextInt();
				int A2 = sc.nextInt();
				int A3 = sc.nextInt();
				int A4 = sc.nextInt();
				
				int B1 = sc.nextInt();
				int B2 = sc.nextInt();
				int B3 = sc.nextInt();
				int B4 = sc.nextInt();
				
				int C1 = sc.nextInt();
				int C2 = sc.nextInt();
				int C3 = sc.nextInt();
				int C4 = sc.nextInt();
				
				int D1 = sc.nextInt();
				int D2 = sc.nextInt();
				int D3 = sc.nextInt();
				int D4 = sc.nextInt();
				
				
				int horizontale1 = A1 + A2 + A3 + A4;
				int horizontale2 = B1 + B2 + B3 + B4;
				int horizontale3 = C1 + C2 + C3 + C4;
				int horizontale4 = D1 + D2 + D3 + D4;
				
				int verticale1 = A1 + B1 + C1 + D1;
				int verticale2 = A2 + B2 + C2 + D2;
				int verticale3 = A3 + B3 + C3 + D3;
				int verticale4 = A4 + B4 + C4 + D4;
				
					
				
				// calculer
			
				if( (horizontale1 == horizontale2)&(horizontale2 == horizontale3)&&(horizontale3 == horizontale4)&&( horizontale4 == verticale1 )&&( verticale1 == verticale2)&&(verticale2 == verticale3)&&(verticale3 == verticale4))  {
					System.out.println("Magic");
				}
				else {
					System.out.println("not Magic");
				}
				
				

				sc.close();
				
				
			}

	}
