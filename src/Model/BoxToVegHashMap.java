package Model;

import java.util.HashMap;
import java.util.Map;

public class BoxToVegHashMap {
	
	private Map<GardenBox, Vegetable> emap;
	
	public BoxToVegHashMap()
	{
		this.emap = new HashMap<GardenBox, Vegetable>();
	}
	
	public boolean containsKey(GardenBox box)
	{
		return emap.containsKey(box.boxNum);
	}
	
	public Vegetable get(GardenBox box)
	{
		return emap.get(box.boxNum);
	}
	
	public void putIfAbsent(GardenBox box, Vegetable v)
	{
		emap.putIfAbsent(box ,v);
	}
}
