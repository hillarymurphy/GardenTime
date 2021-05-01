/**
 * Vegetable class to hold all the attributes of a vegetable
 * @author Hillary Murphy
 * @version 1
 */

package Model;

public class Vegetable {

	String kind;		// kind of vegetable ie carrots, cucumber, tomatoes, etc
	String seedOrPlant;	// Seed or Prestarted plant - we by tomatoes and peppers prestarted generally
	double spacePer;		// space between seeds in row
	double spaceRow;		// space between rows
	double depthReq;		// depth required for growth
	String sunReq;		// shady, partial sun, full sun
	String waterReq;	// how frequently is watering required
	int harvestDuration;	// how long from planting to harvesting in weeks
	
	public Vegetable()
	{
		setKind("tomatoes");
		setSeedOrPlant("plant");
		setSpacePer(36);
		setSpaceRow(36);
		setDepthReq(5);
		setSunReq("full");
		setWaterReq("moderate");
	}
	/**
	 * Constructor to set up all the attributes of a new vegetable
	 * @param kind - What vegetable?
	 * @param sOrP - seed or plant
	 * @param per - space between seeds
	 * @param row - space between rows
	 * @param depth - depth
	 * @param sun - how much sun needed
	 * @param water - how much watering
	 * @param harvest - how long until harvest
	 */
	public Vegetable(String kind, String sOrP, double per, double row, double depth, String sun, String water, int harvest)
	{
		setKind(kind);
		setSeedOrPlant(sOrP);
		setSpacePer(per);
		setSpaceRow(row);
		setDepthReq(depth);
		setSunReq(sun);
		setWaterReq(water);
		setHarvestDuration(harvest);
	}

	/**
	 * Getter method for kind
	 * @return kind
	 */
	public String getKind() {
		return kind;
	}

	/**
	 * Setter method for kind
	 * @param kind
	 */
	public void setKind(String kind) {
		this.kind = kind;
	}

	/**
	 * Getter method for seedOrPlant
	 * @return seedOrPlant
	 */
	public String getSeedOrPlant() {
		return seedOrPlant;
	}

	/**
	 * Setter method for seedOrPlant
	 * @param seedOrPlant
	 */
	public void setSeedOrPlant(String seedOrPlant) {
		this.seedOrPlant = seedOrPlant;
	}

	/**
	 * Getter method for SpacePer - space between seeds or plants
	 * @return SpacePer
	 */
	public double getSpacePer() {
		return spacePer;
	}

	/**
	 * Setter method for SpacePer
	 * @param spacePer
	 */
	public void setSpacePer(double spacePer) {
		this.spacePer = spacePer;
	}

	/**
	 * Getter method for SpaceRow - space between rows
	 * @return spaceRow
	 */
	public double getSpaceRow() {
		return spaceRow;
	}

	/**
	 * Setter method for SpaceRow
	 * @param spaceRow
	 */
	public void setSpaceRow(double spaceRow) {
		this.spaceRow = spaceRow;
	}

	/**
	 * Getter method for DepthReq
	 * @return
	 */
	public double getDepthReq() {
		return depthReq;
	}

	/**
	 * Setter method for DepthReq
	 * @param depthReq
	 */
	public void setDepthReq(double depthReq) {
		this.depthReq = depthReq;
	}

	/**
	 * Getter method for Sun
	 * @return sunReq
	 */
	public String getSunReq() {
		return sunReq;
	}
	
	/**
	 * Getter method for Sun
	 * @param sunReq
	 */
	public void setSunReq(String sunReq) {
		this.sunReq = sunReq;
	}

	/**
	 * Getter method for waterReq
	 * @return WaterReq
	 */
	public String getWaterReq() {
		return waterReq;
	}

	/**
	 * Setter method for waterReq
	 * @param waterReq
	 */
	public void setWaterReq(String waterReq) {
		this.waterReq = waterReq;
	}

	/**
	 * Getter method for HarvestDuration
	 * @return HarvestDuration
	 */
	public int getHarvestDuration() {
		return harvestDuration;
	}

	/**
	 * Setter for HarvestDuration
	 * @param harvestDuration
	 */
	public void setHarvestDuration(int harvestDuration) {
		this.harvestDuration = harvestDuration;
	}

	/**
	 * toString method for Vegetable
	 */
	public String toString() {
		return "Vegetable [kind=" + kind + ", seedOrPlant=" + seedOrPlant + ", spacePer=" + spacePer + ", spaceRow="
				+ spaceRow + ", depthReq=" + depthReq + ", sunReq=" + sunReq + ", waterReq=" + waterReq
				+ ", harvestDuration=" + harvestDuration + "]";
	}
	
}
