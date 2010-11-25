package gui;



import classe.basica.CategoriaItem;


import com.sun.lwuit.Form;
import com.sun.lwuit.Label;
import com.sun.lwuit.events.ActionEvent;

public class Sucesso extends MainForm {
	

	
	private Label lblmsg = new Label();
	
	public Sucesso(){
	
	}
	public Sucesso(String mensagem){
		
		this.setTitle(this.getName());
		lblmsg.setText(mensagem);
		this.addComponent(lblmsg);
		this.show();
		
		
	}
	
	
	
	public void actionPerformed(ActionEvent e) {

		
	}

	protected void execute(Form f) {
		// TODO Auto-generated method stub

	}

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

}
