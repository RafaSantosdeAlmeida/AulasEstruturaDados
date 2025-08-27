/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio02;

/**
 *
 * @author profslvo
 */
public class RoboSimples extends Robo {
    
    public RoboSimples(Tela tela){
        super(tela);
    }
    
    public RoboSimples(Tela tela, int x, int y){
        super(tela, x, y);
    }

    @Override
    public void moverNorte(int distancia) {
        // TO DO: verificar se tem obstáculo
        int novoX = getX() - distancia;
        if(novoX >= 0){
            setX(novoX);
        }
    }

    @Override
    public void moverSul(int distancia) {
        // TO DO: verificar se tem obstáculo
        int novoX = getX() + distancia;
        if(novoX <= super.getTela().getMaxY()){
            setX(novoX);
        }
    }

    @Override
    public void moverLeste(int distancia) {
    
    }

    @Override
    public void moverOeste(int distancia) {
    
    }
    
}
