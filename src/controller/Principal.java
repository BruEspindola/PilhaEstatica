package controller;

public class Principal {

    public static void main(String[] args) {
        PilhaEstatica p = new PilhaEstatica();
        p.adicionar(10);
        p.adicionar(12);
        p.adicionar(30);
        p.mostrar();
        p.remover();
        p.mostrar();
    }
}

