/*
Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de esos
números. El tamaño de la lista también será aleatorio y podrá oscilar entre 10
y 20 elementos ambos inclusive.
 */
package ejercicio2_pag_247;

import java.util.*;
import java.math.*;
/**
 *
 * @author Joaquin
 */
public class Ejercicio2_pag_247 {

   
    public static void main(String[] args)
    {
       
       Scanner sc=new Scanner(System.in); 
       ArrayList<Double> a=new ArrayList();
       double sum=0;
       int tama=(int)Math.random()*11;
       
       for(int i=0;i<10;i++)
          {
           a.add((Math.random())*100);       
          }
       
    for(double numero: a) //Usamos un foreach, lo que hace es sacar los elementos de a e ir introduciendolos en la variable numero 
        {
            System.out.println(numero);
            sum+=numero;
        }
//Suma
        System.out.println("Suma del Array="+sum);
        //Media
        System.out.println("La Media del Array es="+(sum/10));
//El maximo numero del Array para ello usamos la clase collections
        System.out.println("El maximo es"+Collections.max(a));
        
        System.out.println("El minimo es="+Collections.min(a));
    }
    
}
//Probando Cambios