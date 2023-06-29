package com.solucoes;
//Calcule a soma dos dígitos de uma string com diferentes caracteres.

public class SomaString {

  public void somaString(String str) { // Recebe uma string
    int soma = 0;//Essa variável será utilizada para armazenar a soma dos dígitos.
    for (int i = 0; i < str.length(); i++) {//para verificar se o caractere atual, representado pela variável "c", é um dígito. Se for um dígito, realizamos a soma com o valor numérico do dígito utilizando o método "Character.getNumericValue(c)".
      char c = str.charAt(i);
      if (Character.isDigit(c)) {
        soma += Character.getNumericValue(c);
      }
    }
    System.out.println("Soma dos dígitos da string: " + soma);
  }

    public static void main(String[] args) {
        SomaString somaString = new SomaString();
        
        String str1 = "12345";
        somaString.somaString(str1);
        // Saída esperada: Soma dos dígitos da string: 15
        
        String str2 = "9s765r3o1";
        somaString.somaString(str2);
        // Saída esperada: Soma dos dígitos da string: 45
        
        String str3 = "01rt3o";
        somaString.somaString(str3);
        // Saída esperada: Soma dos dígitos da string: 0
    }
}