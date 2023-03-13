import java.util.*;
public class Ejercicio20 {
    public static void main(String[] args) {
        int num;
        System.out.print("Ingrese un número del 1-3 para calcular la siguiente función: f(x)=3x+2 :  ");

        Scanner ingreseNum=new Scanner(System.in);
        num=ingreseNum .nextInt();

        switch (num) {
            case 1:
                int f=3*num+2;
                System.out.println("Resultado: " +f);
                break;

                case 2:
                int f2=3*num+2;
                System.out.println("Resultado: " + f2);
                break;

                case 3:
                int f3=3*num+2;
                System.out.println("Resultado: " + f3);                
                break;
        
            default:
                break;
        }
        ingreseNum.close();
    }
}
