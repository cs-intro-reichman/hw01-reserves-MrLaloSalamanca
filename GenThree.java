
public class GenThree {
	public static void main(String[] args) {
			int min = Integer.parseInt(args[0]);
			int max = Integer.parseInt(args[1]);
			int a = ((int)((Math.random() * (max-min+1) + min)));
			int b = ((int)((Math.random() * (max-min+1) + min)));
			int c = ((int)((Math.random() * (max-min+1) + min)));
			int d = Math.min(a,b);
			min = Math.min(c,d);
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println("The minimal generated number was " + min);
			
			
			
			
	}
}
