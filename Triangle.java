
public class Triangle {
	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int z = Integer.parseInt(args[2]);
		boolean b = (x+y>z) && (x+z>y) && (y+z>x);
		System.out.println(x + ", " + y + ", " + z + " : " + b);		
		
	}
}
