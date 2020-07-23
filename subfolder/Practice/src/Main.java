
public class Main {

	public static void main(String[] args) {
		Point p1 = new Point(1,2);
		Point p2 = new Point(1,2);
		
		boolean b = (p1==p2);
		System.out.println(b);
		
		String s = "Point " + p1.getX() + "," +p1.getY();
		
		Point p3 = new Point(0,0);
		p3.setX(p1.getX());
		p3.setY(p1.getY());
		
		
	}

}
