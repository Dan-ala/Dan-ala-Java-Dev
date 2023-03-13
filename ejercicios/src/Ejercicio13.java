import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args) {
        String validacion,contrasena="Hola";

        System.out.print("Por favor ingrese tipo de documento (TI, CC, PEP): ");

        Scanner tipoID=new Scanner(System.in);
        validacion=tipoID .nextLine();

        switch (validacion) {
            case "TI":

            System.out.print("Por favor ingrese su contraseña: ");

            Scanner pass=new Scanner(System.in);
            contrasena=pass .nextLine();
            if(contrasena.equals("Hola")) {
                System.out.println("El enlace es: https://www.youtube.com/watch?v=wzJ-PyMVIcU");
            }else{
                System.out.println("ERROR");
            }
                
                break;

                case "CC":

                System.out.print("Por favor ingrese su contraseña: ");

                Scanner pass2=new Scanner(System.in);
            contrasena=pass2 .nextLine();
            if (contrasena.equals("Hola")) {
                System.out.println("El enlace es: https://www.youtube.com/watch?v=wzJ-PyMVIcU");
            }else{
                System.out.println("ERROR");
            }
                
                break;

                case "PEP":

                System.out.print("Por favor ingrese su contraseña: ");

                Scanner pass3=new Scanner(System.in);
            contrasena=pass3 .nextLine();
            if (contrasena.equals("Hola")) {
                System.out.println("El enlace es: https://www.youtube.com/watch?v=wzJ-PyMVIcU");
            }else{
                System.out.println("ERROR");
            }
                
                break;
        
            default:
                break;
        }
        tipoID.close();
    }
}
