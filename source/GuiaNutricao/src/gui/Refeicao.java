package gui;

import com.sun.lwuit.CheckBox;
import com.sun.lwuit.ComboBox;
import com.sun.lwuit.Command;
import com.sun.lwuit.Form;
import com.sun.lwuit.Label;
import com.sun.lwuit.TextField;
import com.sun.lwuit.events.ActionEvent;

public class Refeicao extends MainForm{
	
    Label lTitulo;
    Label lNome;
    Label lQtdCalDia;
    Label lCalConsumida;
    Label lCalRestante;
    Label lQtdRefeicao;
    Label lPratoPrinc;
    Label lQtdCal;
    Label lDtConsumo;
    TextField txDtConsumo;
    Label lTpRefei��o;
    ComboBox cbTpRefeicao;
    CheckBox ckPrato01;

    public Refeicao()
    {
        super();
        this.setTitle(this.getName());

        lNome         = new Label("Nome: Usu�rio(a)");
        lQtdCalDia    = new Label("Qtd.Calorias/Dia: 1500 cal");
        lCalConsumida = new Label("Cal. Consumidas:  300 cal");
        lCalRestante  = new Label("Cal. Restantes:  1200 cal");
        lQtdRefeicao  = new Label("Qtd.Refei��es/Dia: 2�");
        lPratoPrinc   = new Label("Pratos Principais:");
        lQtdCal       = new Label("Qtd.Calorias: 250 cal");
        lDtConsumo    = new Label("Data de Consumo");
        txDtConsumo   = new TextField();
        lTpRefei��o   = new Label("Tipo da Refei��o");
        String[] tpRefeicao = {"Caf� da Manh�","Almo�o", "Jantar", "Lanche"};
        cbTpRefeicao  = new ComboBox(tpRefeicao);
        //checkbox
        ckPrato01     = new CheckBox("Lazanha");

        this.addComponent(this.lNome);
        this.addComponent(this.lQtdCalDia);
        this.addComponent(this.lCalConsumida);
        this.addComponent(this.lCalRestante);
        this.addComponent(this.lQtdRefeicao);
        this.addComponent(this.lPratoPrinc);
        // add here
        this.addComponent(this.lDtConsumo);
        this.addComponent(this.txDtConsumo);
        this.addComponent(this.lTpRefei��o);
        this.addComponent(this.cbTpRefeicao);
        
        this.addComponent(ckPrato01);
        this.addComponent(lQtdCal);

        this.addCommandListener(this);        
        this.show();        
        
    }

	public String getName() {
		// TODO Auto-generated method stub
		return "Refei��o";
	}

	protected void execute(Form f) {
		// TODO Auto-generated method stub
		
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
