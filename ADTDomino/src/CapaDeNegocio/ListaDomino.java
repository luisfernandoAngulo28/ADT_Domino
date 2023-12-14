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
public class ListaDomino {

    NodoD primero;
    NodoD ultimo;
    int cantidad;

    public ListaDomino() {
        primero = null;
        ultimo = null;
        cantidad = 0;
    }

    public void insertarDomino(int dato1, int dato2) {
        if (cantidad == 0) {//P==null
            NodoD p = new NodoD(dato1, dato2);
            primero = p;
            ultimo = p;
            cantidad++;
        } else {
            NodoD aux = primero;
            while (aux.getEnlaceDerecho() != null) {
                aux = aux.getEnlaceDerecho();
            }

            if ((aux.getDato2() == dato1) || (aux.getDato2() == dato2)) {
                if (aux.getDato2() == dato2) {
                    NodoD p = new NodoD(dato1, dato2);
                    p.volcar();
                    p.setEnlaceIzquierdo(aux); //enlazamos
                    aux.setEnlaceDerecho(p);
                    ultimo = p;
                    cantidad++;

                } else {
                    NodoD p = new NodoD(dato1, dato2);
                    p.setEnlaceIzquierdo(aux); //enlazamos
                    aux.setEnlaceDerecho(p);
                    ultimo = p;
                    cantidad++;

                }

            } else {
                if (primero.getDato1() == dato2) {
                    NodoD p = new NodoD(dato1, dato2);
                    p.setEnlaceDerecho(primero);
                    primero.setEnlaceIzquierdo(p);
                    primero = p;
                    cantidad++;

                } else {
                    if (primero.getDato1() == dato1) {
                        NodoD p = new NodoD(dato1, dato2);
                        p.volcar();
                        p.setEnlaceDerecho(primero);
                        primero.setEnlaceIzquierdo(p);
                        primero = p;
                        cantidad++;
                    }
                }
            }

        }
    }

    
    
    
    public String toString() {
        String S = "primero -> ";
        NodoD aux = primero;
        while (aux != null) {
            S = S + "[ | " + aux.getDato1()+"|"+aux.getDato2()+ " | ]->";
            aux = aux.getEnlaceDerecho();
        }
        return S + "ultimo";
    }
    public static void main(String[] args) {
        ListaDomino L=new ListaDomino();
        L.insertarDomino(2, 6);
        L.insertarDomino(6, 1);
        L.insertarDomino(1, 3);
        L.insertarDomino(5, 2);
        L.insertarDomino(5, 8);
        L.insertarDomino(4, 7);
        System.out.println(L.toString());
    }

}
