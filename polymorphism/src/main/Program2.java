package main;

import inheritance.BonusController;
import inheritance.Designer;
import inheritance.Employee;
import inheritance.Manager;
import inheritance.VideoEditor;

public class Program2 {

	public static void main(String[] args) {
		Manager g1 = new Manager();
		
		g1.setName("Davi Silva");
		g1.setSalary(5000.0);
		
		VideoEditor editor = new VideoEditor();
		editor.setSalary(2500);
		
		Designer designer = new Designer();
		designer.setSalary(2000.00);
	
		
		BonusController controller = new BonusController();
		controller.register(g1);
		controller.register(editor);
		controller.register(designer);
		
		System.out.println(controller.getSum());		
	}
}
