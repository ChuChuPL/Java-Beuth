package pr1.a09;

public class Point {
	
	protected int x;
	protected int y;
	
	public Point (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point (Point q) {
		this(q.x, q.y);
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void moveAbs (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void moveRel (int dx, int dy) {
		x += dx;
		y += dy;
	}
	
	public String toString() {
		return String.format("[%3d, %3d]", x, y);
	}
}
