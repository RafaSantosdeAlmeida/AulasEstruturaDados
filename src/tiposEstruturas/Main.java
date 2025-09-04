/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiposEstruturas;

/**
 *
 * @author profslvo
 */
public class Main {
    public static void main(String[] args) {
        Pilha minhaPilha = new Pilha(5);
        
        System.out.println("Pilha vazia? " + minhaPilha.estaVazia());
        System.out.println("Pilha cheia? " + minhaPilha.estaCheia());
        System.out.println("Capacidade: " + minhaPilha.capacidade());
        
        System.out.println(minhaPilha.exibirPilha());
        minhaPilha.empilhar(2);
        minhaPilha.empilhar(3);
        minhaPilha.empilhar(5);
        System.out.println(minhaPilha.exibirPilha());
        System.out.println("Removeu: " + minhaPilha.desempilhar());
        System.out.println(minhaPilha.exibirPilha());
        System.out.println("Quantidade de elementos na pilha: " + minhaPilha.numElementos());
    }
}
