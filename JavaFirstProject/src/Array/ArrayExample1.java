package Array;

public class ArrayExample1 {

	public static void main(String[] args) {
		String[] name = {"Su Su","Mya Mya","Juu Lone","Micheal","Bo Bo"};
		
		int[] marks= {40,60,80,90,100};
	
		for(int i = 0;i<name.length;i++)
		{
			if(marks[i]>=50)
			{
				System.out.println(name[i] + " pass");
			}
			else
				System.out.println(name[i] + "fail");
		}
	}

}
