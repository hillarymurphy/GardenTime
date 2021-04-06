
public class GardenBox {

	int length;
	int width;
	int area;
	int depth;
	String sun;
	
	public GardenBox(int l, int w, int d, String s)
	{
		setLength(l);
		setWidth(w);
		setDepth(d);
		setSun(s);
	}
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}

	public int getDepth() {
		return depth;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}
	public String getSun() {
		return sun;
	}
	public void setSun(String sun) {
		this.sun = sun;
	}
	
	/**
	 * Method implementation for area method with formula for rectangle perimeter
	 */
	public double area() {
		double a = this.length * this.width;
		return a;
	}
}
