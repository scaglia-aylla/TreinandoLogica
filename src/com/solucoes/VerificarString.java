package com.solucoes;
 /**
     * Verifica se uma string contém apenas dígitos.
     *
     * @param str a string a ser verificada
     * @return true se a string contém apenas dígitos, false caso contrário
     */
public class VerificarString {

    // Percorre cada caractere da string 
    public static boolean contemApenasDigitos(String str) {
        for (int i = 0; i < str.length(); i++) {
            // Verifica se o caractere atual não é um dígito
            if (!Character.isDigit(str.charAt(i))) {
                // Se não for um dígito, retorna false imediatamente
                return false;
            }
        }
         // Se todos os caracteres forem dígitos, retorna true
        return true;
    }
    
    /**
     * Método principal que demonstra o uso da verificação de dígitos.
     *
     * @param args argumentos de linha de comando (não utilizados neste exemplo)
     */
    public static void main(String[] args) {

         // String de exemplo
        String minhaString = "15tr4";
         // Chama o método contemApenasDigitos passando a string como argumento
        boolean resultado = contemApenasDigitos(minhaString);
        // Exibe o resultado na tela
        System.out.println("A string contém apenas dígitos? " + resultado);
    }
}