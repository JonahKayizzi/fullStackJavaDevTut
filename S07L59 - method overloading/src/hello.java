
public class hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Area of rectangle is " + area(5.2F, 4.1F));
		System.out.println("Area of square is " + area(3.1F));
	}
	
	public static float area (float length, float width) {
		return length * width;
	}
	
	public static float area (float side) {
		return side*side;
	}

}
