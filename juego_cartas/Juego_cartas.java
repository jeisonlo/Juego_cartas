/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juego_cartas;


import java.util.Scanner;

/**
 *
 * @author user
 */
public class Juego_cartas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Jugador j1= new  Jugador ("Caballero",150);
         Jugador j2= new  Jugador ("Mago",100);
         cartas c1=new cartas(2,1,"Fuego",""+j1.getNombre(),0);
         cartas c2=new cartas(2,1,"Agua","",0);
         cartas c3=new cartas(2,1,"Tierra","",0);
         cartas c4=new cartas(2,1,"Viento","",0);
         cartas c5=new cartas(2,1,"Rayo","",0);
        
        int opc=0;
        Scanner sc=new Scanner (System.in);
        
       
        
        System.out.println("Bienvenido Al Juego De Cartas.....");
      
        System.out.println("Seleciona Tu Jugado ");
     
        System.out.println("1.caballero");
        System.out.println("2.Mago");
        
        opc=sc.nextInt();
        
        switch (opc){
            
            
            case 1: System.out.println("Has Elegido A caballero");
            
            
            break;
            
            case 2: System.out.println("Has Elegido A Mago");
           
            break;
            
            
        }
        
         System.out.println(" cartas :");
        System.out.println(" ");
                c1.motra1();
                System.out.println(" ");
                c2.motra1();
                System.out.println(" ");
                c3.motra1();
                System.out.println(" ");
                c4.motra1();
                System.out.println(" ");
                c5.motra1();
                System.out.println(" ");
        System.out.println("tiro de dados para turno ");
        
        int dj1=0;
        int dj2=0;
      
       dj1 = (int) (Math.random() * (6 - 1 + 1)) + 1;  
       dj2 = (int) (Math.random() * (6 - 1 + 1)) + 1;    
            
       
        System.out.println("caballero :"+dj1);
         System.out.println("mago :"+dj2);
         System.out.println(" ");
                
             
            if (dj1 > dj2) {
                
                System.out.println(" gano caballero");
                System.out.println(" ");
                
                j1.cartas_baraja();
                System.out.println(" ");
             
                c2.atacar(c1);
              
                
            } if (dj2> dj1) {
               
                System.out.println(" gano mago");
                System.out.println(" ");
                
               j2.cartas_baraja();
               System.out.println(" ");
              
               c1.atacar(c5);
              
               
            }
            

        }
        
        
    }
    



