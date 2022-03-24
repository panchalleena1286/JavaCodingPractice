//Write a program to create integer array with elements and calculate and print their sum.

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar[] = new int[] {1,2,3,4,5,6,7,8,9};
		int sum = 0;
		
		for(int i=0; i<ar.length; i++)
		{
			sum = sum + ar[i];
		}
		System.out.println(sum);

	}

}
