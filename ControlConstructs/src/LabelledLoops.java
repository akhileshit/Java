
public class LabelledLoops {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int count = 0;
		outer: for(int i=1; i<=4; i++)
		{
		
			inner: for(int j=1; j<=4; j++)
			{
				
				if(j==2)
				{
					break outer;
				}
				count++;
				System.out.println(count);
			}
			
		}
		
	}

}
