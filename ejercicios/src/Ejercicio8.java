import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {

        int cara=0, sello=1, valJugador;

        System.out.print("¿Qué opción es de su preferecnia?, 0 es para cara y 1 para sello: ");

        Scanner ingreNum=new Scanner(System.in);
        valJugador=ingreNum .nextInt();
        

        int valMaquina=(int) Math.floor(Math.random()*2);


        if (valJugador==valMaquina) {
            System.out.println("Felicitraciones usted GANÓ");
        } else {
            System.out.println("Perdió");
        }

        ingreNum.close();
    }
}
