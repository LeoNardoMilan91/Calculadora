/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *clase generica calculadora que implemente (suma,resta,multiplicacion y division)
 * y que sirva para numeros enteros y reales.
 * @author Alumno
 */
public class Calculadora <T>{
    private T t;
    private T u;
    
    public T Suma(T() x,T() y){
        
        return (x+y);
    }
    public T Resta(T t,T u){
        T Resultado=t-u;
        return Resultado;
    }
    public T Multiplicacion(T t,T u){
        T Resultado=t*u;
        return Resultado;
    }
    public T Division(T t,T u){
        T Resultado=t/u;
        return Resultado;
    }
    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public T getU() {
        return u;
    }

    public void setU(T u) {
        this.u = u;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
    
}
