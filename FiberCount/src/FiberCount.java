import Controller.FiberController;
import Model.DropInfo;
import View.FiberView;

public class FiberCount {

	public static void main(String[] args) {
		DropInfo model = getRibbonFromDatabase();
		
		FiberView view = new FiberView();
		
		FiberController controller = new FiberController(model, view);
		
		controller.getFiberCount(200, 245, model.getFiberType());

		controller.updateView();
	}
	
	
	private static DropInfo getRibbonFromDatabase(){
	      DropInfo job = new DropInfo();
	      job.setFiberType(24);
	      
	      return job;
	}
}
