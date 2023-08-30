package method;

public class MethodExample5 {
	static int A[]= {1,2,3,4};
	static int B[]= {5,6,7,8};
	static int C[]=new int[A.length];
	public static void main(String[] args) {
		int[] C=add(A,B);
		display(C);

	}
	public static int[] add(int[]A,int[]B)
	{
		for(int i=0;i<A.length;i++)
		{
			C[i]=A[i]+B[i];
		}
		return C;
	}
	public static void display(int[]C)
	{
		for(int i=0;i<C.length;i++)
		{
			System.out.print(C[i]+" ");
		}
	}

}
