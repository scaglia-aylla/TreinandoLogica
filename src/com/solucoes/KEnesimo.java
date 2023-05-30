package com.solucoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KEnesimo {
    public static void main(String[] args) {

        //Primeiro, declaramos a lista de números listaNumeros e o valor de k que 
        //representa o k-ésimo número mais frequente que queremos encontrar.
        List<Integer> listaNumeros = Arrays.asList(1, 2, 3, 2, 3, 3, 4, 4, 4, 4);
        int k = 1; // k-ésimo(numero que aparece mais vezes ou mais frequente)

        // Em seguida, declaramos um HashMap chamado contagens para armazenar os números e suas contagens.
        Map<Integer, Integer> contagens = new HashMap<>();

        //Utilizamos um loop for para percorrer cada número na lista listaNumeros. Verificamos se o número 
        //já está presente no HashMap usando o método containsKey(). Se estiver presente, incrementamos a contagem correspondente usando o método put() para atualizar o valor. 
        //Caso contrário, adicionamos o número como uma nova chave no HashMap com a contagem inicial de 1.
        for (int numero : listaNumeros) {
            if (contagens.containsKey(numero)) {
                contagens.put(numero, contagens.get(numero) + 1);
            } else {
                contagens.put(numero, 1);
            }
        }

        //criamos uma lista entradas para armazenar as entradas (pares chave-valor) do HashMap contagens. 
        //Para isso, utilizamos o construtor da classe ArrayList e passamos como argumento contagens.entrySet(),
        // que retorna um conjunto de todas as entradas do HashMap.
        List<Map.Entry<Integer, Integer>> entradas = new ArrayList<>(contagens.entrySet());

        //Para ordenar a lista entradas em ordem decrescente com base nas contagens, 
        //utilizamos o método sort() da classe Collections e fornecemos um objeto Comparator como argumento
        Collections.sort(entradas, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> entrada1, Map.Entry<Integer, Integer> entrada2) {
                return entrada2.getValue().compareTo(entrada1.getValue());
            }
        });

        int kEsimoMaisFrequente = entradas.get(k - 1).getKey();
        System.out.println("O número " + k + "-ésimo mais frequente na lista é: " + kEsimoMaisFrequente);
    }
}

    
    
