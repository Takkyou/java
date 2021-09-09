package Java2;
class Circle{
	int x;
	int y; 
	int r; 
	
	public Circle(int x, int y, int r) {
		this.x = x;
		this.y = y; 
		this.r = r; 
	}
	public String toString() {
		return "(" + x + "," + y + ") r " + r;
	}
	
	public boolean equals(Object obj) {
		Circle p = (Circle)obj;
		if(x == p.x && y == p.y && r == p.r)
			return true;
		else
			return false;
	}
	
}
public class CircleTest {
	public static void  main(String[] args) {
		Circle a = new Circle(2,3,5);
		Circle b = new Circle(1,3,5);
		Circle c = new Circle(2,3,5);
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
	}
}
