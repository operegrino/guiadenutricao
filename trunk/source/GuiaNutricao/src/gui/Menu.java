package gui;

import com.sun.lwuit.ButtonGroup;
import com.sun.lwuit.Form;
import com.sun.lwuit.RadioButton;
import com.sun.lwuit.events.ActionEvent;

public class Menu extends MainForm {

	private static Menu menuSigl;
	
	private Menu()
	{
		this.setTitle(this.getName());
	}
	
	public static Menu getSingleton()
	{
		if(menuSigl == null)
		{
			menuSigl = new Menu();
		}
		return menuSigl;
	}
	
	public String getName() {		
		return "Guia de Nutrição";
	}

	protected void execute(Form f) {
		// TODO Auto-generated method stub
		
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
