import java.util.*;
public class Ejercicio17 {
    public static void main(String[] args) {
        int num;
        System.out.print("Digite un número: ");
        Scanner numUsu=new Scanner(System.in);
        num=numUsu .nextInt();

        if (num%2==0) {
            int multi=num*2;
            System.out.println("El resultado es: " + multi);
        }else{
            System.out.println("Es impar");
        }
        numUsu.close();
    }
}
