
public class LabelledLoops2 {

	public static void main(String[] args) {

		first: for(int i=1; i<=4; i++)
		{
		
			second: for(int j=1; j<=4; j++)
			{
				
				if(i==3)
				{
					continue second;                           
				}
				if(j==2)
				{
					continue first;                           
				}
				
				System.out.println("i:"+i+" ,j:"+j);
			}
			
			
		}

	}

}
