package co.edu.sena.miscelanea;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        MENUMT();
    }

    public static void MENUMT() {
        Scanner in = new Scanner(System.in);
        boolean concedido = true;

        while (concedido) {
            System.out.println("***MENU DE EJERCICIOS DE MATEMATICAS***");
            System.out.println("1. Ejercicios de operadores");
            System.out.println("2. Ejercicios de condicionales");
            System.out.println("0. Salir del programa");

            int opc = in.nextInt();

            switch (opc) { 
                case 1:
                    menop(in);
                    break;
                case 2:
                  mencondi(in);
                break;
                case 0:
                concedido = false;
                System.out.println("Saliendo del programa de tatiana...");
                    break;
                default:
                    System.out.println("Error. Opcion invalida");
                    break;
            }
        }
        in.close();
    }

    public static void menop(Scanner in) {
        boolean concedido = true;

        while (concedido) {
            System.out.println("***MENU OPERADORES***");
            System.out.println("1. Calcular el area de un triangulo");
            System.out.println("2. Sumar dos numeros");
            System.out.println("3. Elevar un numero al cuadrado");
            System.out.println("4. Transformar euros a dolares");
            System.out.println("5. Hallar el area y el perimetro de un cuadrado");
            System.out.println("6. Hallar el area y el volumen de un cilindro");
            System.out.println("7. Encontrar la longitud y area de un circulo");
            System.out.println("8. Calcular el promedio de tres numeros");
            System.out.println("0. Regresar al menu principal");

            int opc = in.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Ingrese la base del triangulo: ");
                    double bctrian = in.nextDouble();
                    System.out.println("Ingrese la altura del triangulo: ");
                    double alttrian = in.nextDouble();
                    System.out.println(
                        "El area del triangulo es: " + ejercicios.operadores.primerejercicio(bctrian, alttrian));
                    break;



                case 2:
                    System.out.println("Escriba el primer numero que quiere sumar: ");
                    double primdig = in.nextDouble();
                    System.out.println("Escriba el segundo numero que quiere sumar: ");
                    double segdig = in.nextDouble();
                    System.out.println("La sumatoria de estos 2 numeros es: " + ejercicios.operadores.segundoejercicio(primdig, segdig));
                    break;

                case 3:
                System.out.println("Ingrese el numero que quiera elevar al cuadrado: ");
                double numcuadr = in.nextDouble();
                System.out.println("el numero " + numcuadr + " al cuadrado da "
                        + ejercicios.operadores.tercerejercicio(numcuadr));
                break;

                case 4:
                System.out.println("Escriba cuantos euros quiere pasar a dolares:");
                double euros = in.nextDouble();
                System.out.println(euros + " euros equivalen a " + ejercicios.operadores.cuartoejercicio(euros)
                        + " dolares.");
                break;

                case 5:
                System.out.println("¿Cual es el lado del cuadrado? ");
                double ladcuad = in.nextDouble();
                System.out.println(
                    "Entonces el area del cuadrado es: " + ejercicios.operadores.quintoejercicio(ladcuad));
                break;

                case 6:
                System.out.println("¿Cual es el radio del cilindro?: ");
                double radcilin = in.nextDouble();
                System.out.println("¿Cual es la altura del cilindro?: ");
                double turacilin = in.nextDouble();
                System.out.println("Entonces el volumen del cilindro es: "
                     + ejercicios.operadores.sextoejercicio(radcilin, turacilin));
                break;

                case 7:
                System.out.println("¿Cual es el radio de la circunferencia?: ");
                    double arecirculo = in.nextDouble();
                    System.out.println("Entonces el area del circulo inscrito es: "
                            + ejercicios.operadores.septimoejercicio(arecirculo));
                    break;    
 
                  case 8:
                  System.out.println("¿Cuales son los 3 numeros?: ");
                    double prn = in.nextDouble();
                    double sgn = in.nextDouble();
                    double trn = in.nextDouble();
                    System.out.println("El promedio de la suma de los 3 numeros es: "
                            + ejercicios.operadores.octavoejercicio(prn, sgn, trn));
                    break;

                case 0:
                concedido = false;
                    break;

                default:
                    System.out.println("Error. Vuelva a intentarlo");
                    break;
            }
        }

    }
//2 menu
    public static void mencondi(Scanner in) {
        boolean concedido = true;
        while (concedido) {
            System.out.println("***MENU CONDICIONALES***");
            System.out.println("1. Ver si un numero es negativo o positivo");
            System.out.println("2. Identificar cual numero es menor y cual es mayor ");
            System.out.println("3. Leer 3 numeros enteros positivos y imprimir el mayor y el menor ");
            System.out.println("4. Dados dos números A y B, sumarlos si A es menor que B o sino restarlos ");
            System.out.println("5. Dados dos números A y B encontrar el cociente entre A y B ");
            System.out.println("6. Dados dos números A y B, sumarlos si al menos uno de ellos es negativo, en caso contrario multiplicarlos ");
            System.out.println("7. Determinar si un año es bisiesto o no lo es");
            System.out.println("0. Regresar al menu principal");
        
            int opc = in.nextInt();

            switch (opc) {
                case 1:
                System.out.println("Ingrese un numero a continuacion para ver si es positivo o negativo:");
                double respon = in.nextDouble();
                System.out.println(ejercicios.condicionales.novenoejercicio(respon)); 
                break;


                case 2:
                System.out.println("Ingrese el primer digito: ");
                double prdig = in.nextDouble();
                System.out.println("Ingrese el segundo digito: ");
                double sgrdig = in.nextDouble();
                System.out.println(ejercicios.condicionales.decimoejercicio(prdig,sgrdig)); 
                break;
                

                case 3:
                System.out.println("Ingrese el primer digito: ");
                double primnumdig = in.nextDouble();
                System.out.println("Ingrese el segundo digito: ");
                double segnumdig= in.nextDouble();
                System.out.println("Ingrese el tercer digito: ");
                double trcnumdig= in.nextDouble();
                System.out.println(ejercicios.condicionales.oncenejercicio(primnumdig, segnumdig, trcnumdig));
                break;

                case 4:
                System.out.println("Ingrese el primer digito: ");
                double digita = in.nextDouble();
                System.out.println("Ingrese el segundo digito: ");
                double digiteb = in.nextDouble();
                System.out.println(ejercicios.condicionales.doceejercicio(digita, digiteb));
                
                break;

                case 5:
                System.out.println("Ingrese el primer digito: ");
                double numera = in.nextDouble();
                System.out.println("Ingrese el segundo digito:" );
                double numerb = in.nextDouble();
                System.out.println(ejercicios.condicionales.treceejercicio(numera, numerb));

                
                break;

                case 6:
                System.out.println("Ingrese el primer digito: ");
                double digitoA = in.nextDouble();
                System.out.println("Ingrese el segundo digito: ");
                double digitoB = in.nextDouble();
                System.out.println(ejercicios.condicionales.catorceejercicio(digitoA, digitoB));
                break;


                case 7:
                System.out.println("Ingrese un año para saber si es bisiesto o no");
                double ano = in.nextDouble();
                System.out.println(ejercicios.condicionales.quinceejercicio(ano));
                break;

                case 0:
                concedido = false;
                    break;

                default:
                    System.out.println("Error. Vuelva a intentarlo");
                    break;

                 }
         }         

    }  
            private static void MENUMT(Scanner in) {
        throw new UnsupportedOperationException("Unimplemented method 'menu'");
    }
  }

    

    