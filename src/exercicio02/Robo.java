/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio02;

/**
 *
 * @author profslvo
 */
public abstract class Robo {
    private int x, y;
    private Tela tela;
    
    public Robo(Tela tela){
        this.tela = tela;
    }
    
    public Robo(Tela tela, int x, int y){
        this.tela = tela;
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if(x >= 0 && x <= tela.getMaxX()){
            this.x = x;
        }
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if(y >= 0 && y <= tela.getMaxY()){
            this.y = y;
        }
    }
    
    @Override
    public String toString(){
        return "[" + x + "," + y + "]";
    }
    
    public abstract void moverNorte(int distancia);
    public abstract void moverSul(int distancia);
    public abstract void moverLeste(int distancia);
    public abstract void moverOeste(int distancia);
}
