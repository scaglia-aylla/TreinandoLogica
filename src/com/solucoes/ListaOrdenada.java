package com.solucoes;
//Dada uma lista ordenada, verifique se ela lista está ordenada de forma crescente ou descrescente.

public class ListaOrdenada {

    public static void verificaLista(int[] lista) { //recebe um array que é uma lista de inteiros
        int crescente = 0; //variável que vai contar se a lista está em ordem crescente
        int decrescente = 0;//variável que vai contar se a lista está em ordem decrescente

        for (int i = 0; i < lista.length - 1; i++) {//percorre a lista de 0 até o tamanho total da lista -1
            if (lista[i] < lista[i + 1]) {// a váriavel i é usada como indice para percorrer a lista e verificar se o valor do indice atual é menor que o valor do indice seguinte
                crescente++; //se for menor, a variável crescente é incrementada
            } else if (lista[i] > lista[i + 1]) {
                decrescente++;//se for maior, a variável decrescente é incrementada
            }
        }
        if (crescente == lista.length - 1) {//se a variável crescente for igual ao tamanho da lista -1, significa que a lista está em ordem crescente
            System.out.println("A lista está ordenada de forma crescente.");
        } else if (decrescente == lista.length - 1) {//se a variável decrescente for igual ao tamanho da lista -1, significa que a lista está em ordem decrescente
            System.out.println("A lista está ordenada de forma decrescente.");
        } else{
            System.out.println("A lista não está ordenada.");}
        
    }

    public static void main(String[] args) {
        int[] lista1 = {1, 2, 3, 4, 5};
        int[] lista2 = {5, 4, 3, 2, 1};
        int[] lista3 = {1, 3, 2, 4, 5};
        
        System.out.println("Lista 1:");
        verificaLista(lista1);
        
        System.out.println("Lista 2:");
        verificaLista(lista2);
        
        System.out.println("Lista 3:");
        verificaLista(lista3);
    }
}
