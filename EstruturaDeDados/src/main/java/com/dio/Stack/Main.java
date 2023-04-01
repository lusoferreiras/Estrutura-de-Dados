package com.dio.Stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Carro> stackCarros = new Stack<>();

        stackCarros.push(new Carro("Ford"));
        stackCarros.push(new Carro("Chevorlet"));
        stackCarros.push(new Carro("Fiat"));

        System.out.println(stackCarros);

        stackCarros.pop();
        System.out.println(stackCarros);

        System.out.println(stackCarros.peek());

        System.out.println(stackCarros);

        System.out.println(stackCarros.empty());


    }
}
