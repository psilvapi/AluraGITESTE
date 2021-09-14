
public class Teste {
		
		public static void main(String[] args) {
		
			String myFirstTet = "25";
			
			if(myFirstTet.equals("25")) {
				System.out.println("ACESSO CONCEDIDO");
				
			
			}else if(!myFirstTet.equals("123")){
				System.out.println("ACESSO NEGADO");
			}
			
			for(int i = 0; i <=10; i++) {
				if(myFirstTet.equals("123")){
					System.out.println("A sua senha é " + myFirstTet);
				}else {
					System.out.println("A sua senha não existe");
				}
			}

		}
		
		
	}
