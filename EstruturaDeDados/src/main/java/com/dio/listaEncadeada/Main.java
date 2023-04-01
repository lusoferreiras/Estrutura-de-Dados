package com.dio.listaEncadeada;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada<String> minhaListaEndaceada = new ListaEncadeada<>();

        minhaListaEndaceada.add("teste1");
        minhaListaEndaceada.add("teste2");
        minhaListaEndaceada.add("teste3");
        minhaListaEndaceada.add("teste4");

        System.out.println(minhaListaEndaceada.get(0));
        System.out.println(minhaListaEndaceada.get(1));
        System.out.println(minhaListaEndaceada.get(2));
        System.out.println(minhaListaEndaceada.get(3));

        System.out.println(minhaListaEndaceada);
        System.out.println(minhaListaEndaceada.remove(3));
        System.out.println(minhaListaEndaceada);
    }
}
