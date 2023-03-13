import java.util.*;
public class Ejercicio32 {
    public static void main(String[] args) {
        System.out.println("El programa le pide al usuario un número entero, del 1-12 e imprima el número de días que tiene el mes correspondiente");
        int usuNum;

        System.out.print("Ingrese un mes del año (del 1-12): ");

        Scanner num=new Scanner(System.in);
        usuNum=num .nextInt();

        if (usuNum==1||usuNum==3||usuNum==5||usuNum==7||usuNum==8||usuNum==10||usuNum==12){
            System.out.println("Tiene 31 días");
        }else if(usuNum==4||usuNum==6||usuNum==9||usuNum==11){
            System.out.println("Tiene 30 días");
        }else if(usuNum==2){
            System.out.println("Tiene 28 días");
        }
        num.close();
    }
}