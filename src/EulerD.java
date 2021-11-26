import java.io.BufferedWriter;
import java.io.FileWriter;   
import java.io.IOException;

public class EulerD {
    //Definition von Variablen
    static double e=2.7182818284590452; //Euler e
    static double n=0;   
    static double eu;  //e ungefähr beschrieben 

public static void main(String[] args)  {
    try {
        FileWriter myWriter = new FileWriter("Liste.txt");
        BufferedWriter out = new BufferedWriter(myWriter);
        while(eu < e){//Abbruchbedingung
            eu = Math.pow((1+ 1/n),n); //Potenzieren von dem Term 
            n = n+1000; 
            out.write("Für n: "+n +" gilt e= "+eu);
            out.newLine();
            System.out.println("Für n: "+n +" gilt e= "+eu);            
        }out.close();
} catch (IOException e) {
        e.printStackTrace();
      }
    }
}
