import java.util.*;
public class Ejercicio37 {
    public static void main(String[] args) {
        System.out.println("Este progama es un juego de adivinar el nombre de 3 departamentos de Colombia");
        System.out.println("Tenga presente que cuenta con 1 vidas en el juego ahora sí, !A JUGAR!");

        int numVidas=2;
        int word;

        Scanner adi=new Scanner(System.in);

        int[] dment={1,2,3};

        System.out.println("¿Podrá adivinar el num del 1-3?");
        

        while (numVidas>0) {
            System.out.print("Adivine el número: ");
            word=adi .nextInt();

            for(int i=0; i<dment.length; i++){

                if (word==(dment[2])){
                    System.out.println("Ganó");
                    break;
                }else{
                    numVidas--;
                    System.out.println("LE QUEDA 1 VIDA ¡OJO!");

                    System.out.print("Adivine el número: ");
            word=adi .nextInt();

            for(i=0; i<dment.length; i++){

                if (word==(dment[2])){
                    System.out.println("Ganó");
                    break;
                }
                    }

                    if (numVidas==0) {
                        System.out.println("Perdió");
                    }

            }

            adi.close();

        
        }
        }
    }
}