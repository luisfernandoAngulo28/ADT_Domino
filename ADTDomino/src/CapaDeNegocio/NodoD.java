/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDeNegocio;

/**
 *
 * @author ferna
 */
public class NodoD {
    int dato1;
    int dato2;
    NodoD EnlaceIzquierdo;
    NodoD EnlaceDerecho;

    public NodoD(int dato1, int dato2) {
        this.dato1 = dato1;
        this.dato2 = dato2;
        EnlaceIzquierdo=null;
        EnlaceDerecho=null;
    }

    public int getDato1() {
        return dato1;
    }

    public int getDato2() {
        return dato2;
    }

    public NodoD getEnlaceIzquierdo() {
        return EnlaceIzquierdo;
    }

    public NodoD getEnlaceDerecho() {
        return EnlaceDerecho;
    }

    public void setDato1(int dato1) {
        this.dato1 = dato1;
    }

    public void setDato2(int dato2) {
        this.dato2 = dato2;
    }

    public void setEnlaceIzquierdo(NodoD EnlaceIzquierdo) {
        this.EnlaceIzquierdo = EnlaceIzquierdo;
    }

    public void setEnlaceDerecho(NodoD EnlaceDerecho) {
        this.EnlaceDerecho = EnlaceDerecho;
    }
    
    public void volcar(){
        int x=getDato2();
        this.dato2=getDato1();
        this.dato1=x;
    }
    
       @Override
    public String toString(){
      String s="[ ";
      s=s+getDato1()+"|"+getDato2();
      return s+" ]";
    }
    public static void main(String[] args) {
        NodoD A=new NodoD(5, 2);
        System.out.println(A.toString());
        A.volcar();
        System.out.println(A.toString());
    }
}
