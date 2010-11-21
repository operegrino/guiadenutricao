package gui;

import com.sun.lwuit.CheckBox;
import com.sun.lwuit.ComboBox;
import com.sun.lwuit.Command;
import com.sun.lwuit.Form;
import com.sun.lwuit.Label;
import com.sun.lwuit.TextField;
import com.sun.lwuit.events.ActionEvent;

public class MonitorDieta extends MainForm{
	
	Label lNome;
	Label lQtdCalDia;
	Label lPesoIni;
	Label lPesoIdeal;
	Label lMsg;

	public MonitorDieta()
	{
		lNome = new Label("Nome: Regina Souza");
		lQtdCalDia = new Label("Qd. Calorias/Dia 500cal");
		lPesoIni = new Label("Peso Inicial: 70kg");
		lPesoIdeal = new Label("Peso Ideal: 50kg");
		lMsg = new Label("Você vai atingir o seu peso ideal em: 210 dias");
		
		this.addComponent(lNome);
		this.addComponent(lQtdCalDia);
		this.addComponent(lPesoIni);
		this.addComponent(lPesoIdeal);
		this.addComponent(lMsg);
		
		this.addCommandListener(this);
		this.show();
	}
	
	protected void execute(Form f) {
		// TODO Auto-generated method stub
		
	}
	public String getName() {
		// TODO Auto-generated method stub
		return "Monitor da Dieta Alimentar";
	}

	public void actionPerformed(ActionEvent e) {
		Command cmd = e.getCommand();
		switch (cmd.getId()) {
		case RUN_COMMAND:{
			System.out.println("click.entrou: "+this.getName());
			break;
		}
		case BACK_COMMAND:{
			MainForm f = Menu.getSingleton();
			f.show();
			break;
		}
		default:{}
		}
		
		
	}

}
