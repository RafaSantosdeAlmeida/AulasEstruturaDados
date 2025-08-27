/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio02;

/**
 *
 * @author profslvo
 */
public class Main {
    public static void main(String[] args) {
        Tela tela = new Tela(100, 100);
        RoboSimples robo = new RoboSimples(tela, 10, 10);
        
        System.out.println(robo);
        robo.moverNorte(10);
        System.out.println(robo);
        robo.moverNorte(10);
        System.out.println(robo);
    }
}
