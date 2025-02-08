package assginment1;

public class IneuronPrinting {
	public static void main(String[] args) 
	{
		int n =11;
		int start =0;
		int end =n-1;
		int half =end/2;
		int quar =half/2;

		for(int i=start;i<n;i++)
		{
			
			for(int j=0;j<n;j++)
			{
				// I
				if(j==half && i==start+2 || i>=half && j==half)
				{
					System.out.print("i");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int j=0;j<quar;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<n;j++)
			{
				// N
				if(i==j || j==start || j==end)
				{
					System.out.print("N");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int j=0;j<quar;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<n;j++) //E
			{
				if(j==0 || i==0 || i==end || (i==half && j< end-quar))
				{
					System.out.print("e");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int j=0;j<quar;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<n;j++) //U
			{
				if((j==start && i<end) || (i==end && j>start && j<end) ||
						(j==end && i<end))
				{
					System.out.print("u");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int j=0;j<quar;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<n;j++)
			{
				// R
				if((i==start && j<end) || j==start || (i==half &&j<end) ||
						(j==end && i>start && i<half) || i==j && i>=half )
				{
					System.out.print("r");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int j=0;j<quar;j++)
			{
				System.out.print(" ");
			}
			//0
			for(int j=0;j<n;j++)
			{
				if(j==start & i>start && i<end || j ==end && i>start && i<end ||
						i==start && j>start && j<end || i==end && j>start&&j<end)
				{
					System.out.print("o");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int j=0;j<quar;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<n;j++)
			{
				// N
				if(i==j || j==start || j==end)
				{
					System.out.print("n");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}


