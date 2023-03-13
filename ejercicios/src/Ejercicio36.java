import java.util.*;
public class Ejercicio36 {
    public static void main(String[] args) {

        System.out.println("Este programa determina el ganador de una competencia de natación, gana el participante con menor tiempo (el primero que llegue al final de la piscina en menos de 10s), en total son 8 competidores");
        System.out.println("");

        int tCompetitor;

        
        for(int i=0; i<8; i++){
            System.out.print("Ingrese el tiempo del competidor: ");
        Scanner tCompeti=new Scanner(System.in);
        tCompetitor=tCompeti .nextInt();

        if (tCompetitor<=3) {
            System.out.println("Gana el competidor con el tiempo de: " + tCompetitor);
        }
            }
    }
}