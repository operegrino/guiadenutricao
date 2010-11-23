package gui;



import com.sun.lwuit.Command;
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
		Command cmd = e.getCommand();
		
			switch (cmd.getId()) {
			case RUN_COMMAND:{
				
				
				break;
			}
			case BACK_COMMAND:{
				MainForm f = Menu.getSingleton();
				f.show();
				break;
			}
			default:{
			
			}
		   }
	}

	protected void execute(Form f) {
		// TODO Auto-generated method stub

	}

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

}
