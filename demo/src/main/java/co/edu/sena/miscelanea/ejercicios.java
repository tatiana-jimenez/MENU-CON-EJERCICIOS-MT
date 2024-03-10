package co.edu.sena.miscelanea;
public class ejercicios {
    public class operadores {
        public static double primerejercicio(double bctrian, double alttrian) {
            double artri = (bctrian * alttrian) / 2;
            return artri;
        }

        public static double segundoejercicio(double primdig, double segdig) {
            double resum = primdig + segdig;
            return resum;
        }

        public static double tercerejercicio(double numcuadr) {
            double resnumcuadr = Math.pow(numcuadr, 2);
            return resnumcuadr;
        }

        public static double cuartoejercicio(double euros) {
            double difvalor = 1.8;
            double dolares = euros * difvalor;
            return dolares;
        }

        public static double quintoejercicio(double ladcuad) {
            double arcuad = ladcuad * ladcuad;
            double percuad = 4 * ladcuad;
            System.out.println("Entonces el perimetro del cuadrado: " + percuad);
            return (arcuad);
        }

        public static double sextoejercicio(double radcilin, double turacilin) {

            double alacilin = 2 * Math.PI * radcilin * turacilin;
            double altcilin = 2 * Math.PI * radcilin * (radcilin + turacilin);
            double volcilin = Math.PI * Math.pow(radcilin, 2) * turacilin;

            System.out.println("Entonces el area lateral del cilindro es: " + alacilin);
            System.out.println("Entonces el area total del cilindro es: " + altcilin);
            return (volcilin);
        }

        public static double septimoejercicio(double radcirc) {

            double longcirc = 2 * Math.PI * radcirc;
            double arecirculo = Math.PI * Math.pow(radcirc, 2);
            System.out.println("Entonces la longitud de la circunferencia es: " + longcirc);
            return (arecirculo);
        
        }

        public static double octavoejercicio(double prn, double sgn, double trn) {

            double promt = (prn + sgn + trn) / 3;
            return promt;

        }
    

    }

    
        

    public class condicionales {
        public static String novenoejercicio(double respon) {
            String varespon;

            if (respon > 0) {
                varespon = "El digito :" +respon + " resulto ser positivo";
            } else {
                varespon = "El digito : " +respon + " resulto ser negativo";
            }

            return varespon;
        }


        public static String decimoejercicio(double prdig, double sgrdig) {
            String resmom;
            if (prdig < sgrdig) {
                resmom ="El numero " +prdig + " es menor  y el " + sgrdig + " es el mayor";
            }else{
                resmom ="El numero " +sgrdig + " es menor y el "  + prdig + " es  el mayor";
            }
            return resmom;
        }


        public static String oncenejercicio(double primnumdig, double segnumdig, double trcnumdig) {
            String totalnummayoomen;
        
            if (Double.isNaN(primnumdig) || Double.isNaN(segnumdig) || Double.isNaN(trcnumdig) || primnumdig < 0 || segnumdig < 0 || trcnumdig < 0) {
                System.out.println("Error. Por favor siga las instrucciones dadas, gracias");
                return null;
            } else {
                double numayo = primnumdig;
                if (segnumdig > numayo) {
                    numayo = segnumdig;
                }
                if (trcnumdig > numayo) {
                    numayo = trcnumdig;
                }
        
                double nummeno = primnumdig;
                if (segnumdig < nummeno) {
                    nummeno = segnumdig;
                }
                if (trcnumdig < nummeno) {
                    nummeno = trcnumdig;
                }
                totalnummayoomen = "El numero mayor es el " + numayo + " y el menor es el " + nummeno;
                return totalnummayoomen;}
            }


            public static double doceejercicio(double digita, double digiteb) {
                double igual;
            
                if (digita < digiteb) {
                    igual = digita + digiteb;
                } else {
                    igual = digiteb - digita;
                }
            System.out.println("Esto da: ");
            return igual;
            }


            public static double treceejercicio(double numera, double numerb) {
                double igual;
            
                if (numerb == 0) {
                    System.out.println("No es posible dividir entre 0, intentelo denuevo");
                    igual = Double.NaN;
                } else {
                    igual = numera / numerb;
                    System.out.println("El cociente de la division entre estos dos numeros es: ");    
                }
                return igual;
            }


            public static double catorceejercicio(double digitoA, double digitoB) {
                double igual;
            
                if (digitoA < 0 || digitoB < 0) {
                    igual = digitoA + digitoB;        
                    System.out.println("Esto suma un total de: "); 
                } else {
                    igual = digitoA * digitoB;
                    System.out.println("El resultado de la multiplicacion es: "); 
                }
                return igual;
            }


            public static String quinceejercicio(Double ano) {
                if (ano % 4 == 0) {
                    if (ano % 100 == 0) {
                        if (ano % 400 == 0) {
                            return "El año: " + ano + ", resulto ser un año bisiesto";
                        } else {
                            return "El año: " + ano + ", resulto no ser un año bisiesto";
                        }
                    } else {
                        return "El año: " + ano + ", resulto ser un año bisiesto.";
                    }
                } else {
                    return "El año: " + ano + ", resulto no ser un año bisiesto.";
                }
            }
        }
    }
        


