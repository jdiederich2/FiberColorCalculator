package Controller;

import Model.DropInfo;
import View.FiberView;

public class FiberController {
	private DropInfo model;
	private FiberView view;
	
	
	public FiberController(DropInfo model, FiberView view) {
		this.model = model;
		this.view = view;
	}
	
	public void setRibbonFiberType(int fiberType) {
		model.setFiberType(fiberType);
	}
	
	public int getRibbonFiberType() {
		return model.getFiberType();
	}
	
	public void setRibbonStartNumber(int startNumber) {
		model.setStartNumber(startNumber);
	}
	
	public int getRibbonStartNumber() {
		return model.getStartNumber();
	}
	
	public void setDropFiberNumber(int fiberNumber) {
		model.setFiberNumber(fiberNumber);
	}
	
	public int getDropFiberNumber() {
		return model.getFiberNumber();
	}
	
	public void setRibbonFiberNumber(int ribbonNumber) {
		model.setFiberNumber(ribbonNumber);
	}
	
	public int getRibbonFiberNumber() {
		return model.getRibbonNumber();
	}
	
	public void setRibbonNumberColor(String ribbonColor) {
		model.setRibbonColor(ribbonColor);
	}
	
	public String getRibbonNumberColor() {
		return model.getRibbonColor();
	}
	
	public void setRibbonFiberColor(String fiberColor) {
		model.setFiberColor(fiberColor);
	}
	
	public String getRibbonFiberColor() {
		return model.getFiberColor();
	}	
	
	
    public void getFiberCount(int startCount, int fiberNumber, int fiberType) {
    	model.setStartNumber(startCount);
    	model.setFiberNumber(fiberNumber);

        ribbonColor(startCount, fiberNumber, fiberType);
        getFiberColor(startCount, fiberNumber, fiberType);
        
    }
    
    
    private void ribbonColor(int startCount, int fiberNumber, int fiberType) {
        
        if(startCount > 0) {
            fiberNumber -= (startCount -1);
        }
        
        double dFiberType = (double)fiberType;
        
        double ribbonNumber = fiberNumber / dFiberType;
        
        if(ribbonNumber % fiberType != 0) {
            ribbonNumber += 1;
        }

        
       if(ribbonNumber > 12) {
            ribbonNumber -= 12;
        }
        
       model.setRibbonNumber((int)ribbonNumber);
       model.setRibbonColor(colorFinder((int)ribbonNumber));
    }
    
    
    private void getFiberColor(int startCount, int fiberNumber, int fiberType) {
        
        String d = "";
        
        if(startCount > 0) {
            fiberNumber -= (startCount -1);
        }
        
        int fiberColor = fiberNumber % fiberType;
        
        if(fiberColor > 12) {
            d = "d-";
            fiberColor -= 12;
        }

        
        if(fiberColor == 0) {
            fiberColor += 12;
        }

        model.setFiberColor(d + colorFinder(fiberColor));
    }


    private static String colorFinder(int number) {
    
	    switch(number) {
	        case 1: 
	        	return "Blue";
	        case 2: 
	        	return "Orange"; 
	        case 3: 
	        	return "Green"; 
	        case 4:
	        	return "Brown";
	        case 5: 
	        	return "Slate";
	        case 6: 
	        	return "White"; 
	        case 7:
	        	return "Red";
	        case 8: 
	        	return "Black";
	        case 9: 
	        	return "Yellow";
		case 10:
			return "Violet";
		case 11: 
			return "Rose";
		case 12: 
			return "Aqua";
	        default:
	            return "Invalid";
	    }
	}

    
	
	public void updateView() {
		view.printFiberCountDetails(model.getStartNumber(), model.getFiberNumber(), model.getFiberType(), model.getRibbonNumber(), model.getRibbonColor(), model.getFiberColor());
	}
}
