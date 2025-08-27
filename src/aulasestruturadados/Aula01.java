/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulasestruturadados;

import java.util.Scanner;

/**
 *
 * @author profslvo
 */
public class Aula01 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeroLampadas;
        
        System.out.print("Informe o numero de lampadas: ");
        numeroLampadas = input.nextInt();
        input.close();
        
        percorrerCorredor(numeroLampadas);
    }
    
    private static void percorrerCorredor(int n){
        Boolean[] lampadas = new Boolean[n];
        for (int i = 0; i < lampadas.length; i++) {
            lampadas[i] = false;
            System.out.print("\tLMP"+(i+1));
        }
        
        System.out.println("");
        
        for (int i = 0; i <= lampadas.length; i++) {
            for (int j = 0; j < lampadas.length; j++) {
                if (j == 0) {
                    System.out.print((i+1)+ "\t" + ((lampadas[j])?"on":"off"));
                }else{
                    System.out.print("\t" + ((lampadas[j])?"on":"off"));
                }
                if ((j+1)%(i+1) == 0) {
                    lampadas[j] = !lampadas[j];
                }
            }
            System.out.println("");
        }
        
    }
    
}
