package Model;

public class GardenBox {

	int boxNum;
	int length;
	int width;
	int area;
	int depth;
	String sun;
	
	public GardenBox()
	{
		setBoxNum(0);
		setLength(0);
		setWidth(0);
		setArea();
		setDepth(0);
		setSun("shady");
	}
	
	public GardenBox(int n, int l, int w, int d, String s)
	{
		setBoxNum(n);
		setLength(l);
		setWidth(w);
		setArea();
		setDepth(d);
		setSun(s);
	}
	
	public int getBoxNum() {
		return boxNum;
	}
	public void setBoxNum(int boxNum) {
		this.boxNum = boxNum;
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
	
	public int getArea() {
		return area;
	}
	public void setArea() {
		this.area = area();
	}
	
	
	/**
	 * Method implementation for area method with formula for rectangle perimeter
	 */
	public int area() {
		int a = this.length * this.width;
		return a;
	}

	/**
	 * To String Method
	 */
	@Override
	public String toString() {
		return 	"W: " + width + "\r\nL: " + length + "\r\nA: " + area + "\r\nD: " + depth + "\r\nS: " + sun;
	}
	
	public String BoxNumtoString() {
		return 	"Box Number: " + boxNum;
	}
	
}
