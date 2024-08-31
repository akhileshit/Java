
class NestedForLoops {
	public static void main(String[] args) {
		int count = 0;
		for(int i=1; i<=4; i++)
		{
			count++;
			for(int j=1; j<=4; j++)
			{
				count++;
				if(j==3)
				{
					continue;
				}
				System.out.println("i:"+i+", j:"+j);
			}
			System.out.println("count:"+count);
		}
	}
}