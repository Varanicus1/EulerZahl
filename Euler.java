public class Euler {
    //Definition von Variablen
    static double e=2.7182818284590452; //Euler e
    static double n=0;   
    static double eu;  //e ungefähr beschrieben 

public static void main(String[] args)  {
    
        while(eu < e){//Abbruchbedingung
            eu = Math.pow((1+ 1/n),n); //Potenzieren von dem Term 
            n = n+1000; 
            System.out.println("Für n: "+n +" gilt e= "+eu);            
        }
        if(eu >e){
            System.out.println("Für n: "+n +" beschreibt Euler e auf 16.Nachkommastellen näherungsweise ");
        }

    }
}