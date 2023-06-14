package com.solucoes;

public class VerificarString {
    public static boolean contemApenasDigitos(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String minhaString = "15tr4";
        boolean resultado = contemApenasDigitos(minhaString);
        System.out.println("A string contém apenas dígitos? " + resultado);
    }
}