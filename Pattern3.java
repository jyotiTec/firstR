package Assignment;

public class Pattern3 {

	 
		// TODO Auto-generated constructor stub
	

	public static void main(String[] args) {
		int n=15;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0||i==n-1||i+j<=n/2&&i<=n/2||j==0||i-j>=n/2&&i>=n/2)
				{
					System.out.print(" *");
					
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println( );
		}
	}
		// TODO Auto-generated method stub

	}


