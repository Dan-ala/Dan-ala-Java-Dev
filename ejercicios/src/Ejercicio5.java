import java.util.*;
public class Ejercicio5 {
    public static void main(String[] args) {

        System.out.println("Hi there! En este programa vamos a determinar si un numero es par o impar, y si  es mayor o menor que 10");
        
        int num,oper;

        System.out.print("Por favor digite un número: ");

        Scanner meineObj=new Scanner(System.in);
        num=meineObj .nextInt();

        System.out.println("El numero ingresado es: " + num);

        oper=num%2;

        if (oper==0){
          System.out.println("El número es par");

        }else{
          System.out.println("El número es impar");
        }

          if(num>10){
            System.out.println("mayor que 10");
          }else{
            System.out.println("menor que 10");
          }

        
        meineObj.close();
    
}

}