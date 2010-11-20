/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import com.sun.lwuit.CheckBox;
import com.sun.lwuit.Command;
import com.sun.lwuit.Label;

/**
 * @author Jefferson
 */
public class MontarPrato extends MainForm{

    Command voltarCommand;
    Command confirmaCommand;

    Label lTitulo;
    Label lNome;
    Label lQtdCalDia;
    Label lCalConsumida;
    Label lCalRestante;
    Label lQtdRefeicao;
    Label lPratoPrinc;
    Label lQtdCal;

    CheckBox ckPrato01;


    public MontarPrato()
    {
        super();

        f.setTitle("Montar Prato");

        // Add command
        voltarCommand = new Command("Voltar");
        confirmaCommand = new Command("Confirmar");
        f.addCommand(voltarCommand);
        f.addCommand(confirmaCommand);
        f.setCommandListener(this);

        lTitulo = new Label("Refeições - Montar Prato");
        f.addComponent(lTitulo);

        lNome = new Label("Nome: Usuário(a)");
        lQtdCalDia = new Label("Qtd.Calorias/Dia: 1500 cal");
        lCalConsumida = new Label("Cal. Consumidas:  300 cal");
        lCalRestante = new Label("Cal. Restantes:  1200 cal");
        lQtdRefeicao = new Label("Qtd.Refeição/Dia: 2º");
        lPratoPrinc = new Label("Pratos Principais:");
        lQtdCal = new Label("Qtd.Calorias: 250 cal");

        //checkbox
        ckPrato01 = new CheckBox("Lazanha");

        f.addComponent(this.lNome);
        f.addComponent(this.lQtdCalDia);
        f.addComponent(this.lCalConsumida);
        f.addComponent(this.lCalRestante);
        f.addComponent(this.lQtdRefeicao);
        f.addComponent(this.lPratoPrinc);
        f.addComponent(ckPrato01);
        f.addComponent(lQtdCal);

        f.show();
    }

   

   

    /*
    public void actionPerformed(ActionEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet.");
     *
     * Local para implementar os Commands.
     *
    }
    */
}
