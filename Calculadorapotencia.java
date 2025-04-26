import java.util.Scanner;

public class Calculadora {

    // Método para sumar
    public static double sumar(double a, double b) {
        return a + b;
    }

    // Método para restar
    public static double restar(double a, double b) {
        return a - b;
    }

    // Método para multiplicar
    public static double multiplicar(double a, double b) {
        return a * b;
    }

    // Método para dividir
    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error: No se puede dividir entre cero.");
            return Double.NaN;  // Retorna un valor no numérico en caso de división por cero.
        }
        return a / b;
    }

    // Método para calcular la potencia utilizando recursividad
    public static double potencia(double base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else if (exponente < 0) {
            return 1 / potencia(base, -exponente);
        } else {
            return base * potencia(base, exponente - 1);
        }
    }

    // Método para mostrar el menú
    public static void mostrarMenu() {
        System.out.println("\n--- Calculadora ---");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Potencia (recursiva)");
        System.out.println("6. Salir");
    }

    // Método principal que ejecuta el programa
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;  // Se inicializa fuera del bucle

        // Comienza el ciclo de operaciones
        while (opcion != 6) {
            mostrarMenu();
            System.out.print("Selecciona una opción (1-6): ");
            opcion = scanner.nextInt();  // Lee la opción elegida por el usuario

            if (opcion == 6) {
                System.out.println("¡Hasta luego!");
                break;  // Sale del ciclo si el usuario elige la opción 6
            }

            // Pedir los números al usuario
            System.out.print("Ingresa el primer número: ");
            double a = scanner.nextDouble();

            System.out.print("Ingresa el segundo número: ");
            double b = scanner.nextDouble();

            // Ejecutar la operación seleccionada
            switch (opcion) {
                case 1:
                    System.out.println("Resultado: " + sumar(a, b));
                    break;
                case 2:
                    System.out.println("Resultado: " + restar(a, b));
                    break;
                case 3:
                    System.out.println("Resultado: " + multiplicar(a, b));
                    break;
                case 4:
                    System.out.println("Resultado: " + dividir(a, b));
                    break;
                case 5:
                    // En caso de la opción de potencia, b se debe convertir a entero
                    System.out.println("Resultado: " + potencia(a, (int) b));
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }

        scanner.close();  // Cierra el scanner al finalizar el programa
    }
}
