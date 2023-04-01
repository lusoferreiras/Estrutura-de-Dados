package com.dio.no;

public class TesteNo {
    public static void main(String[] args) {
       No<String> no = new No("Conteuno nó");

       No<String> no2 = new No("Conteúdo nó2");

       no.setProximoNo(no2);

       No<String> no3 = new No("Conteúdo nó3");

       no2.setProximoNo(no3);

       No<String> no4 = new No("Conteúdo nó4");

       no3.setProximoNo(no4);

        System.out.println(no);
        System.out.println(no.getProximoNo());
        System.out.println(no2);
        System.out.println("----------------");

        System.out.println(no);
        System.out.println(no.getProximoNo());
        System.out.println(no.getProximoNo().getProximoNo());
        System.out.println(no.getProximoNo().getProximoNo().getProximoNo());
    }
}
