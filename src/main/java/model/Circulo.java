
package model;
// 2 pi raio

public class Circulo {
    private double raio;
    double pi = 3.14;
    
    public Circulo(){
        this(0);
    }
    
    public Circulo(double raio){
        this.raio = raio;
    }
    
    public double getRaio(){
        return raio;
    }
    public void setRaio(double raio){
        this.raio = raio;
    }
    public double getArea(){
        return ((pi) * (getRaio() * getRaio()));
    }
    
    
}
