import java.util.*;;
public class Ejercicio22 {
    public static void main(String[] args) {
        int num1,num2,num3;
            System.out.println("Ingrese un valor entero para la variable #1, #2 y #3: ");
            Scanner nums=new Scanner(System.in);
            num1=nums .nextInt();
            num2=nums .nextInt();
            num3=nums .nextInt();

            if (num1>num2 && num1>num3) {
               System.out.println("El primer número es el mayor"); 
            }else if(num2>num1 && num2>num3){
            System.out.println("El segundo número es mayor:");
            }else{
                System.out.println("El número 3 es el mayor");
            }

            nums.close();
}
}
