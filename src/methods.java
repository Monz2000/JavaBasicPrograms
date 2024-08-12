public class methods {
	
static double BoxVolume(double length, double height, double breadth)
{
	double Vol=length*breadth*height;
	return Vol;
}

	
	public static void main(String[] args) {
		
		System.out.println("hey");
		
		double Volume= BoxVolume(10.5,5,6);
		
		System.out.println(Volume);
	}

}
