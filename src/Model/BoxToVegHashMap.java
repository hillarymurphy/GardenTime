/**
 * Garden Box to Vegetable assignment hashmap
 * @author Hillary Murphy
 * @version 1
 */

package Model;

import java.util.HashMap;
import java.util.Map;

public class BoxToVegHashMap {
	
	private Map<GardenBox, Vegetable> emap;
	
	 /**
	 * Constructor for GardenBox and Vegetable hashmap
	 */
	public BoxToVegHashMap()
	{
		this.emap = new HashMap<GardenBox, Vegetable>();
	}
	
	/**
	 * Method finds if GardenBox key exists in map and returns box number
	 * @param box
	 * @return box number of box
	 */
	public boolean containsKey(GardenBox box)
	{
		return emap.containsKey(box);
	}
	
	/**
	 * Adds box and vegetable pair to emap
	 * @param box - GardenBox
	 * @param v - Vegetable
	 */
	public void putIfAbsent(GardenBox box, Vegetable v)
	{
		emap.putIfAbsent(box, v);
	}

	@Override
	public String toString() {
		return "BoxToVegHashMap [emap=" + emap + "]";
	}
	
}
