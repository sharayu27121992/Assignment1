
public class Launch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 10;
		for (int i = 0; i < n; i++) // row 
		{

			for (int j = 0; j < n; j++) // column
			{

				if (i == 0 || j == (n - 1) / 2 || i == (n - 1)) // for printing I
				{
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			
			}
			
			System.out.print("  ");
			
			for (int j = 0; j < n; j++) // column For N
			{

				if (j==0 || i==j || j==n-1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			
			for (int j = 1; j < n; j++) // column For E
			{ 
				if((j==1 || (i==0 || j==1) ||(j==1 || i==(n-1)/2) || (j==1 || i==(n-1))))
				
				//(j==1 || (j==1 && i == 0) || (j==2 && i == 0) || (j==3 && i == 0) ||(j==4 && i == 0)
						//|| (j==5 && i == 0) || (j==6 && i == 0) || (j==7 && i == 0) || (j==8 && i == 0)||
						//(j==9 &&i==0)||(i == (n-1)/2))
				{
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");

			for (int j = 0; j <= n; j++) // column For U
			{

				if ((j==0 && i<(n-1)) || (j==(n-1) && i<(n-1)) || (j==1 || j==2 || j==3 ||j==4 || j==5 ||j==6
						||j==7 || j==8) && i==(n-1))  {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			
			for (int j = 0; j < n; j++) // column For R
			{

				if (j==0 || (j==1 && i==0) || (j==2 && i==0)|| (j==3 && i==0) || (j==4 && i==0) || (j==5 && i==0) ||(j==6 && i==0)|| 
						(j==7 && i==1) || (j==7 && i==2) || (j==6 && i==3) || ((j==5 && i==4))||
						 (j==3 && i==5) || (j==2 && i==5)|| (j==1 && i==5)||(j==5 && i==6) ||
						(j==6 && i==7) || (j==7 && i==8) || (j==8 && i==9))  {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			for (int j = 0; j < n; j++) // column For o
			{

				if ((i==0 && (j==1 ||j==2 || j==3 || j==4 || j==5 || j==6 || j==7 || j==8 )) || 
						(j==0 && (i==1 || i==2 ||i==3 ||i==4|| i==5 ||i==6 || i==7 || i==8) || 
						(i==(n-1) && (j==1 ||j==2 || j==3 || j==4 || j==5 || j==6 || j==7 || j==8) ||
						(j==(n-1) && (i==1 || i==2 ||i==3 ||i==4|| i==5 ||i==6 || i==7 || i==8)))))  {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			
			for (int j = 0; j < n; j++) // column For N
			{

				if (j==0 || i==j || j==n-1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			
			System.out.print("  ");
			System.out.println();

		}
	}
}
