package Array;

public class ArrayExample6 {

	public static void main(String[] args) {
		//To find duplicate values in array
		int []arr = {1,2,2,6,7,18,7,9,1,8,10,11,11,15,18,14,9};
		System.out.println(arr.length);
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if((arr[i]==arr[j])&&(i!=j))
				{
					System.out.println("Duplicate Element : "+arr[j]);
				}
			}
		}
	}

}
