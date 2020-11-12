package br.com.modulos;

public class MaiorCombinacao {
 	 
	
	  //variavel usada no retorno
	String numString = "";
	
	public int maiorNumero(int numero)  {
		 Modulos modulos = new Modulos();
		 
		 //verificar se o numero digitado
		 if(numero > 100000000) {
			 return -1;
		
		 } 
		 else {
		 
		 //transformar número em String
		 String[] numeroString = modulos.converterParaString(numero);
		 
		 //converter vetor de String para vetor de inteiros
		 int[] vetorInteiros = modulos.converterParaInteiros(numeroString);
		
		 //ordenar o vetor para obter o maior número possível
		 int aux = 0;
		 int vetorOrdenado[] = modulos.ordenarDescrescente(vetorInteiros, aux);
		 
		 //concatenar o vetor em uma String
		 String n = "";
		  numString = modulos.converterParaTextoSimples(vetorOrdenado, n);
		 
		 
		 
		 }
		 
		//converter a String para obter o maior número possível já que o mesmo se encontra
		 //ordenado do maior para o menor
		 return modulos.converterParaInteiroSimples(numString);
	 }
}
