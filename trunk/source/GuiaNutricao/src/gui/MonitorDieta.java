package gui;

import com.sun.lwuit.CheckBox;
import com.sun.lwuit.ComboBox;
import com.sun.lwuit.Form;
import com.sun.lwuit.Label;
import com.sun.lwuit.TextField;

public class MonitorDieta extends MainForm{

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
    Label lTpRefeição;
    ComboBox cbTpRefeicao;
    CheckBox ckPrato01;

	
	public MonitorDieta(){}
	public MonitorDieta(String nome)
	{
        super();

        this.setTitle(nome);

        lNome = new Label("Nome: Usuário(a)");
        lQtdCalDia = new Label("Qtd.Calorias/Dia: 1500 cal");
        lCalConsumida = new Label("Cal. Consumidas:  300 cal");
        lCalRestante = new Label("Cal. Restantes:  1200 cal");
        lQtdRefeicao = new Label("Qtd.Refeições/Dia: 2º");
        lPratoPrinc = new Label("Pratos Principais:");
        lQtdCal = new Label("Qtd.Calorias: 250 cal");
        lDtConsumo = new Label("Data de Consumo");
        txDtConsumo = new TextField();
        lTpRefeição = new Label("Tipo da Refeição");
        String[] tpRefeicao = {"Café da Manhã","Almoço", "Jantar", "Lanche"};
        cbTpRefeicao = new ComboBox(tpRefeicao);

        //checkbox
        ckPrato01 = new CheckBox("Lazanha");

        this.addComponent(this.lNome);
        this.addComponent(this.lQtdCalDia);
        this.addComponent(this.lCalConsumida);
        this.addComponent(this.lCalRestante);
        this.addComponent(this.lQtdRefeicao);
        this.addComponent(this.lPratoPrinc);
        // add here
        this.addComponent(this.lDtConsumo);
        this.addComponent(this.txDtConsumo);
        this.addComponent(this.lTpRefeição);
        this.addComponent(this.cbTpRefeicao);
        
        this.addComponent(ckPrato01);
        this.addComponent(lQtdCal);

        this.show();        
		
	}
	
	protected void execute(Form f) {
		// TODO Auto-generated method stub
		
	}

}
