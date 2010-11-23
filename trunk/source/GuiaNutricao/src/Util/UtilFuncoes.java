package Util;

public class UtilFuncoes {

	// retorna um int referente ao Id concatenado no retorno de metodos
	// para preenchimento dos combos
	
   public static int capturarId(String nome) {
		
		String a = nome.substring(0, nome.indexOf("-"));
		int retorno = Integer.parseInt(a);

		return retorno;
	}
}
