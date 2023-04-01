package com.dio.pilha;

public class Pilha {

    private No refNoEntradaPilha;

    public Pilha() {

        this.refNoEntradaPilha = null;
    }
    public No pop(){
        if (!this.isEmpty()){
            No noPoped = refNoEntradaPilha;
            this.refNoEntradaPilha = refNoEntradaPilha.getRefNo();
        }else {

        return null;
        }
        return refNoEntradaPilha;
    }
    public void push(No novoNo){
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }
    public No top(){
        return refNoEntradaPilha;
    }
    public boolean isEmpty(){
        return refNoEntradaPilha == null ? true : false;

    }

    @Override
    public String toString() {
        String stringRetorno = "======================\n";
        stringRetorno += "        Pilha\n";
        stringRetorno += "======================\n";

        No noAuxiliar = refNoEntradaPilha;

        while (true){
            if (noAuxiliar != null){
                stringRetorno += "[No{dado="+noAuxiliar.getDado()+"}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            }else {
                break;
            }
        }
        stringRetorno += "===============\n";
        return stringRetorno;
    }
}
