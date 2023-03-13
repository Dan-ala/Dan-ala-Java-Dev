import java.util.Scanner;
import java.lang.Math;

public class Ejercicio33{
    public static void main(String[] args) {
        System.out.println("Este programa calcula la distancia entre dos puntos, y luego determina cuál punto es mayor");

        double x1,y1,x2,y2;

        Scanner p1yp2=new Scanner(System.in);

        System.out.println("Ingrese un número en x1 y en y1");
        System.out.print("x1: "); x1=p1yp2 .nextDouble(); 
        System.out.print("y1: "); y1=p1yp2 .nextDouble();

        System.out.println("Ingrese un número en x2 y en y2");
        System.out.print("x2: "); x2=p1yp2 .nextDouble(); 
        System.out.print("y2: "); y2=p1yp2 .nextDouble();

        double restaP1=x2-x1;
        double restaP2=y1-y2;

        double x = Math.sqrt(Math.pow(restaP1, 2 )+Math.pow(restaP2, 2)); 
        
        System.out.println("La distancia entre los dos puntos es:  " + x);


        if (restaP1>restaP2) {
            System.out.println("el punto 1 es mayor que el punto 2");
        }else{
            System.out.println("el punto 2 es mayor que el punto 1");
        }
        p1yp2.close();
    }
}