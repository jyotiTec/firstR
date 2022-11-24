package Assignment;

public class Ineuron {

	public static void main(String[] args) {
		int n=8;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if((i==0&&j<=n/2)||((i==(3*n)/4)&&j<=n/2)||(j==(n/3)&&i<=(3*n)/4))
					
{
	

                    System.out.print("*");
			}
else
{
	System.out.print(" ");
		}
		// TODO Auto-generated method stub

	}


	
		
			for(int j=0;j<n;j++)
			{
				if((j==0&&i<=(3*n)/4)||(i==j&&i<=(3*n)/4)||(j==(3*n)/4&&i<=(3*n)/4))
                 {
	

                    System.out.print("*");
                 }
else
{
	System.out.print(" ");
	}
			}
		// TODO Auto-generated method stub

	
	
		for(int j1=0;j1<n;j1++)
		{
			if(j1==0&&i<=(3*n)/4||i==0&&j1<=(3*n)/4||i==(3*n)/4&&j1<=(3*n)/4||(i==(n/2)-1&&j1<=(3*n)/4))
				
{


                System.out.print("*");
		}
else
{
System.out.print(" ");
	}
	// TODO Auto-generated method stub

}
		for(int j1=0;j1<n;j1++)
		{
			if(j1==0&&i<(3*n)/4||i==(3*n)/4&&j1>0&&j1<(3*n)/4||(j1==(3*n)/4&&i<(3*n)/4))
				
{


                System.out.print("*");
		}
else
{
System.out.print(" ");
	}
		}
		for(int j1=0;j1<n;j1++)
		{
			if(j1==0&&i<=(3*n)/4||i==0&&j1<=(3*n)/4||j1==(3*n)/4&&i<n/2||i==(n/2)-1&&j1<=(3*n)/4||
					(i==j1&&i>=n/2&&j1<=(3*n)/4))
				
{


                System.out.print("*");
		}
else
{
System.out.print(" ");
	}
		}
		for(int j1=0;j1<n;j1++)
		{
			if(i==0&&j1>0&&j1<=(3*n)/4||j1==0&&i>0&&i<(3*n)/4||i==(3*n)/4&& j1>=n/4&&j1<=(3*n)/4||
					j1==((3*n)/4)+1&&i>0&&i<(3*n)/4)
				
{


                System.out.print("*");
		}
else
{
System.out.print(" ");
	}
		}
		for(int j1=0;j1<n;j1++)
		{
			if((j1==0&&i<=(3*n)/4)||(i==j1&&i<=(3*n)/4)||(j1==(3*n)/4&&i<=(3*n)/4))
				
{


                System.out.print("*");
		}
else
{
System.out.print(" ");;;

	}
		}
		
		System.out.println();
}
}
	}


