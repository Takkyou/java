package Java2;

class Rect1{
	int x;
	int y; 
	
	public Rect1(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public boolean equals(Object o) {
		Rect1 p = (Rect1)o;
		if(x*y == p.x*p.y && (x==p.x || x== p.y) && (y==p.x|| y==p.y))
			return true;
			else
				return false;
	}
	public String toString() {
		return "w=" + x + " h=" + y;
	}
	
}
public class RectTest {

	public static void main(String[] args) {	
		
		Rect1 a = new Rect1(2,3);
		Rect1 b = new Rect1(2,3);
		Rect1 c = new Rect1(1,6);
		
		System.out.println( a );
		System.out.println( b );
		System.out.println( c );
		System.out.println( a.equals(b) );
		System.out.println( a.equals(c) );
	}

}
