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

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getSeedOrPlant() {
		return seedOrPlant;
	}

	public void setSeedOrPlant(String seedOrPlant) {
		this.seedOrPlant = seedOrPlant;
	}

	public double getSpacePer() {
		return spacePer;
	}

	public void setSpacePer(double spacePer) {
		this.spacePer = spacePer;
	}

	public double getSpaceRow() {
		return spaceRow;
	}

	public void setSpaceRow(double spaceRow) {
		this.spaceRow = spaceRow;
	}

	public double getDepthReq() {
		return depthReq;
	}

	public void setDepthReq(double depthReq) {
		this.depthReq = depthReq;
	}

	public String getSunReq() {
		return sunReq;
	}

	public void setSunReq(String sunReq) {
		this.sunReq = sunReq;
	}

	public String getWaterReq() {
		return waterReq;
	}

	public void setWaterReq(String waterReq) {
		this.waterReq = waterReq;
	}

	public int getHarvestDuration() {
		return harvestDuration;
	}

	public void setHarvestDuration(int harvestDuration) {
		this.harvestDuration = harvestDuration;
	}

	public String toString() {
		return "Vegetable [kind=" + kind + ", seedOrPlant=" + seedOrPlant + ", spacePer=" + spacePer + ", spaceRow="
				+ spaceRow + ", depthReq=" + depthReq + ", sunReq=" + sunReq + ", waterReq=" + waterReq
				+ ", harvestDuration=" + harvestDuration + "]";
	}
	
}
