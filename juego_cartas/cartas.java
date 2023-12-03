/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego_cartas;



/**
 *
 * @author user
 */
public class cartas extends Jugador{
    
    protected int atk;
    protected int def;
    protected String elemento;

    public cartas(int atk, int def, String elemento, String nombre, int vida) {
        super(nombre, vida);
        this.atk = atk;
        this.def = def;
        this.elemento = elemento;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
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

    



    
    public void atacar(cartas cartas){
        
       int d1=0; int d2=0;
       
        System.out.println("tiro de dados");
       d1 = (int) (Math.random() * (6 - 1 + 1)) + 1;  
       d2 = (int) (Math.random() * (6 - 1 + 1)) + 1; 
        System.out.println(" ");
        System.out.println(" caballero :"+d1);
        System.out.println(" mago :"+d2);
       if(d1>d2){
           System.out.println("gano caballero :");
           int resul = this.atk-cartas.def;
           
          this.vida=this.vida-(resul);
                 
        System.out.println(" su vida :"+this.vida+" nombre :"+this.nombre);
          
       }
        else 
        
        if(d2>d1){
                
      System.out.println("gano mago :");
      int resul1 = cartas.atk-this.def;
      
      cartas.vida=cartas.vida-(resul1);
      
            System.out.println(" su vida :"+cartas.vida+" nombre :"+cartas.nombre);
                
      
       }
    }
    public void motra1(){
    
        
         System.out.println("elemento:"+this.elemento);
        System.out.println("ataque:"+this.atk);
        System.out.println("defensa:"+this.def);
        
    }

}