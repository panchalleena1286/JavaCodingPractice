//Create an Array and print their Average.
public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[] = {56,25,36,75,65};
		int sum =0;
		
		for(int i=0;i<ar.length;i++)
		{
			sum = sum+ar[i];
		}
		
		int avg = sum/ar.length;
		System.out.println(avg);
	}

}
