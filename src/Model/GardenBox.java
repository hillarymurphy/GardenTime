/**
 * Garden Box class to hold all the attributes of a garden box
 * @author Hillary Murphy
 * @version 1
 */

package Model;

public class GardenBox {

	int boxNum;
	int length;
	int width;
	int area;
	int depth;
	String sun;
	
	/**
	 * sets up default garden box with 0 for numbers and shady for sun
	 */
	public GardenBox()
	{
		setBoxNum(0);
		setLength(0);
		setWidth(0);
		setArea();
		setDepth(0);
		setSun("shady");
	}
	
	/**
	 * Garden box creates with numbers and proper sun
	 * @param n - Box number
	 * @param l - length
	 * @param w - width
	 * @param d - depth
	 * @param s - sun
	 */
	public GardenBox(int n, int l, int w, int d, String s)
	{
		setBoxNum(n);
		setLength(l);
		setWidth(w);
		setArea();
		setDepth(d);
		setSun(s);
	}
	
	/**
	 * Getter method for Box Number
	 * @return box number
	 */
	public int getBoxNum() {
		return boxNum;
	}
	
	/**
	 * Setter method for box number
	 * @param boxNum
	 */
	public void setBoxNum(int boxNum) {
		this.boxNum = boxNum;
	}
	
	/**
	 * Getter method for Length
	 * @return length
	 */
	public int getLength() {
		return length;
	}
	
	/**
	 * Setter method for length
	 * @param length
	 */
	public void setLength(int length) {
		this.length = length;
	}
	
	/**
	 * Getter method for width
	 * @return width
	 */
	public int getWidth() {
		return width;
	}
	
	/**
	 * Setter method for width
	 * @param width
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * Getter method for Depth
	 * @return depth
	 */
	public int getDepth() {
		return depth;
	}
	
	/**
	 * Setter method for Depth
	 * @param depth
	 */
	public void setDepth(int depth) {
		this.depth = depth;
	}
	
	/**
	 * Getter method for Sun
	 * @return sun
	 */
	public String getSun() {
		return sun;
	}
	
	/**
	 * Setter method for sun
	 * @param sun
	 */
	public void setSun(String sun) {
		this.sun = sun;
	}
	
	/**
	 * Getter method for Area
	 * @return area
	 */
	public int getArea() {
		return area;
	}
	
	/**
	 * Setter method for Area
	 */
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
	
	/**
	 * Method to get string for box number
	 * @return string information
	 */
	public String BoxNumtoString() {
		return 	"Box Number: " + boxNum;
	}
	
}
