class Sample{
	private int  id;
	Sample(){
		id = 101;
		System.out.println("No Arg constructor, with ID: "+id);
	}
	Sample(int no){
		id = no;
		System.out.println("One argument constructor, with ID: "+id);
	}
}


public class ConstructorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s1 = new Sample();
		Sample s2 = new Sample(102);

	}

}
