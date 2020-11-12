package br.com.modulos;

public class Modulos {
    
	
	
	
	
	//método para conversão de inteiro em string
	//que retorna um vetor com cada caractere da string em uma posição
	public String[] converterParaString(int numero) {
		String numString = String.valueOf(numero);
		String[] vetor = new String[numString.length()];
		for(int i = 0; i < numString.length(); i++) {
			vetor[i] = String.valueOf(numString.charAt(i));
		}
		return vetor;
	}
	
	//método que converte cada string do vetor para um vetor de inteiros
	public int[] converterParaInteiros(String[] texto) {
		int[] numeros = new int[texto.length];
		for(int i = 0; i < texto.length; i++) {
			numeros[i] = Integer.parseInt(texto[i]);
		}
		return numeros;
	}
	
	//ordenar vetor do maior para o menor
	public int[] ordenarDescrescente(int[] numero, int aux) {
		for (int i = 0; i < numero.length; i++) {
			for (int j = i + 0; j < numero.length; j++) {
				if (numero[i] < numero[j]) {
					aux = numero[i];
					numero[i] = numero[j];
					numero[j] = aux;
				}
			}
			
		}
		return numero;
	}
	
	//método para concatenar o vetor em uma string
	public String converterParaTextoSimples(int[] numeros, String numero) {
		for(int a: numeros) {
			numero+= a;
		}
		return numero;
	}
	
	//método para converter texto para um número inteiro
	//e acaba retornando o maior número possível.
	public int converterParaInteiroSimples(String numero) {
		if(Integer.parseInt(numero) > 100000000) {
			return -1;
		} else {
			return Integer.parseInt(numero);
		}
	}
}
