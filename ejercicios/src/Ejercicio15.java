import java.util.Scanner;
public class Ejercicio15 {
    public static void main(String[] args) {
        
        String vowel,v1="a",v2="e",v3="i",v4="o",v5="u";

        System.out.print("Ingrese un caracter en minúscula: ");

        Scanner caracter=new Scanner(System.in);
        vowel=caracter .next();

        if (vowel==v1 || vowel==v2 || vowel==v3 || vowel==v4 || vowel==v5){

            System.out.println("Es una vocal: " + vowel);
        } else {

            System.out.println("Una letra");
            
        }
        caracter.close();
    }
    
}
