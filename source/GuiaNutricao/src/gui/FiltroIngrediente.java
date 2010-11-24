package gui;

import java.io.IOException;

import javax.microedition.rms.InvalidRecordIDException;
import javax.microedition.rms.RecordStoreException;

import negocio.ControladorItem;

import com.sun.lwuit.CheckBox;
import com.sun.lwuit.Command;
import com.sun.lwuit.Form;
import com.sun.lwuit.events.ActionEvent;
import com.sun.lwuit.layouts.GridLayout;

public class FiltroIngrediente extends MainForm{

	private GridLayout grid;
	private ControladorItem controlItem;
	
	public FiltroIngrediente(int idTpIngrediente) throws InvalidRecordIDException, IOException, RecordStoreException
	{		
		this.setTitle(this.getTitle());
		controlItem = new ControladorItem();
		String[] value = controlItem.consultarPorCatg(idTpIngrediente); 
		
		System.out.println(value.length);
		
		if(value.length > 0)
		{
			//grid = new GridLayout(value.length, 2);
			//this.setLayout(grid);		
			
			for(int i=0; i<value.length; i++)
			{
				System.out.println("teste: "+value[i]);
				this.addComponent(new CheckBox(value[i]));
			}
		}
		this.addCommandListener(this);
		this.show();
	}
	
	public String getName() {
		
		return "Filtro Ingrediente";
	}

	protected void execute(Form f) {
		// TODO Auto-generated method stub
		
	}

	public void actionPerformed(ActionEvent e) {
		Command cmd = e.getCommand();
		switch (cmd.getId()) {
		case RUN_COMMAND:{
			System.out.println("cmd run");
			break;
		}
		case BACK_COMMAND:{
			System.out.println("cmd back");
			//MainForm f = Menu.getSingleton();
			//f.show();
			break;
		}
		default:{}
		}
		
	}

}
