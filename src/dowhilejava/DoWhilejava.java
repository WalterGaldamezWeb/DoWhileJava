/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dowhilejava;

/**
 *
 * @author Walter Galdamez
 */
public class DoWhilejava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador=1;
        int limite=10;
        int tabla=5;

        System.out.println("Tabla de multiplicar del "+ tabla +"\n");

        do{
            System.out.println(contador+" X "+tabla+" = "+(contador*tabla));
            contador++;
        }while(contador<=limite);
    }
    
}
