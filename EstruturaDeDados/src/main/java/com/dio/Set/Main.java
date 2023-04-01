package com.dio.Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Carro> hastSetCarros = new HashSet<>();

        hastSetCarros.add(new Carro("Ford"));
        hastSetCarros.add(new Carro("Chevrolet"));
        hastSetCarros.add(new Carro("Peugeot"));
        hastSetCarros.add(new Carro("Zip"));
        hastSetCarros.add(new Carro("Alfa Romeo"));

        System.out.println(hastSetCarros);

        TreeSet<Carro> treeSetCarros = new TreeSet<>();

        treeSetCarros.add(new Carro("Ford"));
        treeSetCarros.add(new Carro("Chevrolet"));
        treeSetCarros.add(new Carro("Peugeot"));
        treeSetCarros.add(new Carro("Zip"));
        treeSetCarros.add(new Carro("Alfa Romeo"));

        System.out.println(treeSetCarros);

    }
}
