package assginment1;

public class PrintingDiamonds {

	public static void main(String[] args) {
		
		      
		    
		    int n = 11;
			int start =0; 
			int end =n-1; 
			
		
			double half =end/2; 
			double quar =half/2;
		
			for(int i=start;i<n;i++) 
			{
			//Question 3
				for(int j=start;j<n;j++)
				{
					if(i==start || j==start || i+j<=half ||
							(j-i>=half) || j==end && i<=half ||
							i==end||j==end)
					{
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}

				for(int k=0;k<quar;k++)
				{
					System.out.print(" ");
				}
			// Question 4
				for(int j=start;j<n;j++)
				{
					if(i-j>=half || i+j>=end+half)
					{
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}

				for(int k=0;k<quar;k++)
				{
					System.out.print(" ");
				}
			// Question 5
				for(int j=start;j<n;j++)
				{
					if(i==start || j==start ||i==end ||i+j<=half || i-j>=half)
					{
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
	
	}




