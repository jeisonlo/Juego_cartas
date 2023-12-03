/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego_cartas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author user
 */
public class Jugador  {
    
    
    
    protected String nombre;
    protected int vida ;

    public Jugador(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

   
   
    
 
    
    public void mostrar(){
        
        
        System.out.println(""+this.nombre );
        System.out.println("vida "+this.vida );
        System.out.println(" ");
    }
        
         public void cartas_baraja(){
        
        
             
             
        
        String[] cartas= {"c fuego", "c agua ", "c viento ", "c rayo", "c tierra", "c fuego", "c viento", "c rayo", "c tierra", "c agua"};

        
        List<String> lista = new ArrayList<>();
        Collections.addAll(lista, cartas);

        
        Collections.shuffle(lista);

        
        List<String> sublista1 = lista.subList(0, 5);
        List<String> sublista2 = lista.subList(5, 10);

        
        String[] vector1 = new String[5];
        String[] vector2 = new String[5];
        for (int i = 0; i < 5; i++) {
            vector1[i] = sublista1.get(i);
            vector2[i] = sublista2.get(i);
        }

        
        System.out.println("cartas: " + arrayToString(cartas));
             System.out.println(" ");
        System.out.println("maso 1 para caballero: " + arrayToString(vector1));
        System.out.println("maso 2 para mago: " + arrayToString(vector2));
    }

    
    private static String arrayToString(Object[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
        
    }
    
}