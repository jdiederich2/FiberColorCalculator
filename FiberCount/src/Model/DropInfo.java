package Model;

public class DropInfo {
	
	private int fiberType;
	private int startNumber;
	private int fiberNumber;
	private int ribbonNumber;
	private String ribbonColor;
	private String fiberColor;
	
	public DropInfo() {
		this(12);
	}
	
	public DropInfo(int fiberType) {
		this.fiberType = fiberType;
	}

	public int getFiberType() {
		return fiberType;
	}

	public void setFiberType(int fiberType) {
		this.fiberType = fiberType;
	}

	public int getStartNumber() {
		return startNumber;
	}

	public void setStartNumber(int startNumber) {
		this.startNumber = startNumber;
	}

	public int getFiberNumber() {
		return fiberNumber;
	}

	public void setFiberNumber(int fiberNumber) {
		this.fiberNumber = fiberNumber;
	}

	public int getRibbonNumber() {
		return ribbonNumber;
	}

	public void setRibbonNumber(int ribbonNumber) {
		this.ribbonNumber = ribbonNumber;
	}

	public String getRibbonColor() {
		return ribbonColor;
	}

	public void setRibbonColor(String ribbonColor) {
		this.ribbonColor = ribbonColor;
	}

	public String getFiberColor() {
		return fiberColor;
	}

	public void setFiberColor(String fiberColor) {
		this.fiberColor = fiberColor;
	}
	
	
	
	

}
