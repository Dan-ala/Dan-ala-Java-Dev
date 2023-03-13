import java.util.Scanner;
public class Ejercicio10 {

    public static void main(String[] args) {
        String form;
        int age, genero, nacionalidad, solte;

        System.out.print("¿Desea ingresar al Ejército Nacional de Colombia paara postularse, digite Si o No (El primer caracter en maýuscula): ");

        Scanner opcion=new Scanner(System.in);
        form=opcion .nextLine();

        switch (form) {
            case "No":

            System.out.println("Gracias por ingresar a nuestro sistema");
                
                break;

                case "Si":

                System.out.print("Usted es: ¿Hombre o Mujer? (1 para hombre y 2 para mujer ): ");

                Scanner sexo=new Scanner(System.in);
                genero=sexo .nextInt();



                if (genero==1) {

                    System.out.println("Documentación para hombres: ");

                    System.out.println("");

                    System.out.println("Tener entre 18 y 23 años de edad"); System.out.println("");

                    System.out.print("Ingrese su edad: ");

                Scanner ageForm=new Scanner(System.in);
                age=ageForm .nextInt();
                
                if (age==18 || age==19 || age==20 || age==21 || age==22 || age==23 ) {

                    System.out.println("Es apto para ser parte del Ejército Nacional de Colombia");
                    System.out.println();
                }else{
                    System.out.println("Lamentamos que no sea apto, espere hasta cumplir con la edad mínima, GRACIAS");
                    System.out.println("SIN EMBARGO TENGA EN CUENTA LOS SIGUIENTES DOCUMENTOS");

                    System.out.println("");
                }

                

                    System.out.print("Tener nacionalidad colombiana, ingrese 1 para indicar que es de Colombia y 2 que pertenece a otro país: "); System.out.println("");

                    Scanner nacioLidad=new Scanner(System.in);
                    nacionalidad=nacioLidad .nextInt();

                    if (nacionalidad==1) {
                        System.out.println("Usted es colombiano");
                        
                    }else{
                        System.out.println("Usted es de otra nación");
                    }

                    

                    System.out.print("Estar soltero y no tener una carga familiar, ingrese 1 si es soltero y 2 si tiene una familia a cargo: "); System.out.println("");

                    Scanner solTeria=new Scanner(System.in);
                    solte=solTeria .nextInt();

                    if (solte==1) {

                        System.out.println("Usted es soltero");
                        
                    }else{
                    System.out.println("Usted tiene una familia que mantener");
                    System.out.println("");
                    }

                    


                    System.out.println("Tener el registro civil de nacimiento, una copia o el original"); System.out.println("");
                    System.out.println("Presentar una copia original y ampliada a color de la cédula de identidad del solicitante"); System.out.println("");
                    System.out.println("Fotocopia a color y ampliada del DNI de uno de los padres"); System.out.println(""); 
                    System.out.println("Presentar copia de la tarjeta SISBEN o EPS, este requisito es obligatorio"); System.out.println("");
                    System.out.println("Mostrar el certificado examen emitido por ICFES"); System.out.println("");
                    System.out.println("Entre otros"); System.out.println("");

                }else if (genero==2) {
                    

                    System.out.println("Documentación para muejeres: ");

                    System.out.println("");
                    
                    System.out.println("Tener entre 18 y 23 años de edad"); System.out.println("");


                    System.out.print("Ingrese su edad: ");

                Scanner ageForm=new Scanner(System.in);
                age=ageForm .nextInt();
                
                if (age==18 || age==19 || age==20 || age==21 || age==22 || age==23 ) {

                    System.out.println("Es apta para ser parte del Ejército Nacional de Colombia");
                    System.out.println();
                }else{
                    System.out.println("Lamentamos que no sea apta, espere hasta cumplir con la edad mínima, GRACIAS");
                    System.out.println("SIN EMBARGO TENGA EN CUENTA LOS SIGUIENTES DOCUMENTOS");

                }

                


                    System.out.print("Tener nacionalidad colombiana, ingrese 1 para indicar que es de Colombia y 2 que pertenece a otro país: "); System.out.println("");

                    Scanner nacioLidad=new Scanner(System.in);
                    nacionalidad=nacioLidad .nextInt();

                    if (nacionalidad==1) {
                        System.out.println("Usted es colombiano");
                        
                    }else{
                        System.out.println("Usted es de otra nación");
                        System.out.println("");
                    }

                    


                    System.out.println("Tener el registro civil de nacimiento, una copia o el original"); System.out.println("");
                    System.out.println("Presentar una copia original y ampliada a color de la cédula de identidad del solicitante"); System.out.println("");
                    System.out.println("Fotocopia a color y ampliada del DNI de uno de los padres"); System.out.println("");
                    System.out.println("Presentar copia de la tarjeta SISBEN o EPS, este requisito es obligatorio"); System.out.println("");
                    System.out.println("Título de bachiller"); System.out.println("");
                    System.out.println("No estar casada ni tener hijos: Digite 1 si es soltera y 2 si está casada"); System.out.println("");

                    Scanner solTeria=new Scanner(System.in);
                    solte=solTeria .nextInt();

                    if (solte==1) {

                        System.out.println("Usted es soltera");
                        
                    }else{
                    System.out.println("Usted está casada");
                    System.out.println("");
                    }

                    

                    System.out.println("Mostrar el certificado examen emitido por ICFES"); System.out.println("");
                    System.out.println("Entre otros"); System.out.println("");
                    System.out.println("Cumplir con los exámenes y pruebas físicas propuestas por la Policía Metropolitana"); System.out.println("");
                }

                break;

                
            }

            System.out.println("GRACIAS POR RESPONDER EL FORMULARIO");
            opcion.close();

        }

    }