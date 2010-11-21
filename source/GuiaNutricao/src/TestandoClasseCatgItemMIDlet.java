import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;

import negocio.ControladorCategoriaItem;
import Util.UtilFuncoes;
import classe.basica.CategoriaItem;


public class TestandoClasseCatgItemMIDlet extends MIDlet {


	public TestandoClasseCatgItemMIDlet() {
		// TODO Auto-generated constructor stub
	}

	protected void destroyApp(boolean arg0) throws MIDletStateChangeException {
		// TODO Auto-generated method stub

	}

	protected void pauseApp() {
		// TODO Auto-generated method stub

	}

	protected void startApp() throws MIDletStateChangeException {

		ControladorCategoriaItem ctrlCatg = new ControladorCategoriaItem();
		
		CategoriaItem catgItem = new CategoriaItem();
		UtilFuncoes util = new UtilFuncoes();
		
		catgItem.setNome("Frios");
		CategoriaItem catgItem2 = new CategoriaItem();
		catgItem2.setNome("Legumes");
		
		
		ctrlCatg.cadastrarCatgItem(catgItem);
		ctrlCatg.cadastrarCatgItem(catgItem2);
		
//		String[] list;
//		list = ctrlCatg.consultarTodasCategoriasItens();
//		int tamanho = list.length;
//		System.out.println("tamanho : " + tamanho);
//		int i = 0;
//		
//		while (i < tamanho){
//			System.out.println(list[i]);
//			i++;
//		}
//		
//		System.out.println(util.capturarId(list[0]));
//	
//		System.out.println("passou2");
		
//		catgItem = ctrlCatg.buscarCategoriaItem(2);
//		System.out.println(catgItem.getId());
//		System.out.println(catgItem.getNome());
		
		//ctrlCatg.excluirCategoriaItem(catgItem);
		
		
		

	}

}
