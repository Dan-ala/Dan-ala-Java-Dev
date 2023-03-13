import java.util.*;
public class Ejercicio21 {
    public static void main(String[] args) {
        int age;
        System.out.print("Ingrese: de 0-10=niño, de 11-19=adolescente, de 20-28=joven:  ");
        Scanner ingresarEdad=new Scanner(System.in);
        age=ingresarEdad .nextInt();

        if (age<=10) {
            System.out.println("Niño");
        }else if(age==11 || age==12 || age==13 || age==14 || age==15 || age==16 || age==17 || age==18 || age==19){
            System.out.println("Adolescente");
        }else if(age>=20){
            System.out.println("Joven");
        }
        ingresarEdad.close();
    }
}
