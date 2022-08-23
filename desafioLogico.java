
public class desafioLogico {
	
	public static void main(String[] args) {
		// Trabalho na terça (V ou F)
		// Trabalho na quinta (V ou F)
		
		boolean trabalho1 = false;
		boolean trabalho2 = true;
		
		boolean comprouTV50 = trabalho1 && trabalho2;
		boolean comprouTV32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		
		//Operador Unario!
		boolean maisSaudavelFicarEmCasa = !comprouSorvete;
		
		System.out.println("comprou TV 50 \"? " + comprouTV50);
		System.out.println("comprou TV 32 \"? " + comprouTV32);
		System.out.println("comprou Sorvete? " + comprouSorvete);
		System.out.println("Mais Saudavel Ficar Em Casa?  " + maisSaudavelFicarEmCasa);
		
		
		
		
				
	}

}
