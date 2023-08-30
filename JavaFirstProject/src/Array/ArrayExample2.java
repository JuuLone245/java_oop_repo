package Array;

public class ArrayExample2 {
	public static void main(String args[])
	{
		int height[]= { 175,167,160,164,183,187,188,179,176,175,169,175,176,178,165 };
		int sum=0;
		for(int i=0;i<height.length;i++)
		{
			 sum +=height[i];
		}
		int avg = sum/height.length;
		System.out.println("The average height is : "+avg);
		int aboveavg = 0,belowavg = 0;
		for(int i=0;i<height.length;i++)
		{
			if(height[i]>avg)
			{
				aboveavg++;
			}
			else if(height[i]<avg)
			{
				belowavg++;
			}
		}
		System.out.println("Above average height: "+ aboveavg);
		System.out.println("Below average height:"+ belowavg);
		int max=height[0];
		int min=height[0];
		for(int i=0;i<height.length;i++)
		{
			if(height[i]>max)
			{
				max=height[i];
			}
			else if(height[i]<min)
			{
				min=height[i];
			}
		}
		System.out.println("The max height is "+max);
		System.out.println("The min height is "+min);
	}

}
	

