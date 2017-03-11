/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.ejimenezr.a10;

import java.util.Scanner;

/**
 *
 * @author elver
 */
public class SPPEJimenezRA10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tamaño=pedirTamaño();
        int [][] a = arr ("A", tamaño);
        int [][] b = arr ("B", tamaño);
        
        sumaMatrices(a,b);
        restaMatrices(a,b);
        multMatrices(a,b);
    }
    public static int pedirEntero(){
        Scanner kb= new Scanner (System.in);
        boolean flag;
        int n=0;
        do{
            System.out.println("Introduce un número entero");
            try{
                n=kb.nextInt();
                flag=false;
                
            }
            catch(Exception er){
                System.out.println("Lo que introdujo no es un entero, Inténtalo de nuevo");
                flag=true;
                kb.nextLine();
            }
        }while (flag);
        
        return n;
    }
    public static int pedirTamaño(){
        Scanner key = new Scanner (System.in);
        boolean flag;
        int a = 0;
        do{
            try{
                System.out.println("Escribe el tamaño del arreglo: ");
                a = key.nextInt();
                flag = false;
            }
            catch (Exception e){
                System.out.println("Error");
                key.next();
                flag = true;
            }
        }
        while (flag);
        return a;
    }
    public static int [][] arr (String a, int tamaño){
        int [][]arr = new int [tamaño][tamaño];
        System.out.println("Arreglo: " + a);
        for (int i = 0; i < arr.length; i++){
        for (int j = 0; j < arr[i].length; j++){
        arr [i][j] = pedirEntero();
        }
        }
        return arr;
    }
    
    public static int [][] sumaMatrices (int [][]a, int[][]b){
        int [][] res = new int [a.length] [a.length];
        System.out.println("Suma: ");
        for (int i = 0; i < a.length; i++){
        for (int j = 0; j < a[i].length; j++){
        res[i][j] = a[i][j] + b[i][j];
        System.out.println("["+res[i][j]+"]");   
    }
        System.out.println("");   
    }
        return res; 
    }
    
    public static int [][] restaMatrices (int [][]a, int[][]b){
        int [][] res = new int [a.length] [a.length];
        System.out.println("Resta: ");
        for (int i = 0; i < a.length; i++){
        for (int j = 0; j < a[i].length; j++){
        res[i][j] = a[i][j] - b[i][j];
        System.out.println("["+res[i][j]+"]");   
    }
        System.out.println("");   
    }
        return res; 
    }
    public static int [][] multMatrices (int [][]a, int[][]b){
        int [][] res = new int [a.length] [a.length];
        System.out.println("Multiplicación: ");
        for (int i = 0; i < a.length; i++){
        for (int j = 0; j < a[i].length; j++){
        res[i][j] = a[i][j] * b[i][j];
        System.out.println("["+res[i][j]+"]");   
    }
        System.out.println("");   
    }
        return res; 
    }
    
}
