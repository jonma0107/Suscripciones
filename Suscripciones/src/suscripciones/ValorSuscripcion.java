package suscripciones;

import java.util.Scanner;

public class ValorSuscripcion extends ClasePadre {

    public ValorSuscripcion(int codigo, String estado, int periodicidad, int valorPeriodico) {
        super(codigo, estado, periodicidad, valorPeriodico);
    }

    public void procesarCodigoSuscripcion() {
        int codigo;
        String estado;
        int periodicidad = 0;
        int valorPeriodico = 0;

        int contador = 1;
        int totalvalorSuscripciones = 0;
        
        
        System.out.println("Ingrese la Cantidad de Suscriptores a validar: ");
        Scanner sus = new Scanner(System.in);
        int y = sus.nextInt();
        
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("INGRESE EL CODIGO, ESTADO Y PERIODICIDAD DEL SUSCRIPTOR\n"
                    + "SEPARADOS POR UNA COMA Y UN ESPACIO: ");
            // Se convierte la cadena de caracteres a una lista
            String x = sc.nextLine();
            String[] arreglo = x.split(", ");
            // Se maneja lso errores de usuario mediante un TRY CATCH
            try {
                periodicidad = Integer.parseInt(arreglo[2]);
                // Condicional IF que valida de la lista el ítem de "Estado"
                if (arreglo[1].equals("S") || arreglo[1].equals("s")) {
                    System.out.println("El valor a pagar de la suscripción es cero "
                            + "y el servicio está SUSPENDIDO\n");
                    contador++;
                    
                    // Condicional ELSE IF que valida el indice en la lista de "Estado = Vigente y Periodicidad
                } else if (arreglo[1].equals("V") || arreglo[1].equals("v")) {
                    switch (periodicidad) {
                        case 1:
                            if (arreglo[2].equals("1")) {
                                valorPeriodico = 30000;
                                System.out.println("Valor a Pagar $" + valorPeriodico + " pesos" + " MENSUALES\n");
                                totalvalorSuscripciones += valorPeriodico;
                            }
                            break;
                        case 2:
                            if (arreglo[2].equals("2")) {
                                valorPeriodico = 70000;
                                System.out.println("Valor a Pagar son $" + valorPeriodico + " pesos" + " TRIMESTRALES\n");
                                totalvalorSuscripciones += valorPeriodico;
                            }
                            break;
                        case 3:
                            if (arreglo[2].equals("3")) {
                                valorPeriodico = 150000;
                                System.out.println("Valor a Pagar son $" + valorPeriodico + " pesos" + " SEMESTRALES\n");
                                totalvalorSuscripciones += valorPeriodico;
                            }
                            break;
                        case 4:
                            if (arreglo[2].equals("4")) {
                                valorPeriodico = 270000;
                                System.out.println("Valor a Pagar son $" + valorPeriodico + " pesos" + " ANUALES\n");
                                totalvalorSuscripciones += valorPeriodico;
                            }
                            break;
                        default:
                            System.out.println("Digite el Periodo correspondiente del 1 al 4\n");
                            break;
                    }
                    contador++;
                } // cierra el else if
                else {
                    System.out.println("Los Datos ingresados no corresponden\n"
                            + "a los solicitados en el Estado del Suscriptor\n");
                }

            } catch (NumberFormatException error) {
                System.out.println("Digite un valor entero para la periodicidad\n");

            } // cierra del try catch

        } while (y >= contador);
        System.out.println("El valor total a pagar en suscripciones es de $" + totalvalorSuscripciones + " pesos");
    } // cierra funcion procesarCodigoSuscripcion

    // Función Principal
    public static void main(String[] args) {
        ValorSuscripcion suscriptor = new ValorSuscripcion(255, "Suspendido", 2, 70000);
        suscriptor.procesarCodigoSuscripcion();

    }

}
