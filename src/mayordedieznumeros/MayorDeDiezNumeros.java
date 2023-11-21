
package mayordedieznumeros;
import java.util.Scanner;

public class MayorDeDiezNumeros {

    
    public static void main(String[] args) {
        // Crear un array para almacenar los 10 números
        double[] numeros = new double[10];

        // Utilizar un Scanner para obtener la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese 10 números
        System.out.println("Por favor, ingrese 10 números:");

        // Leer los números y almacenarlos en el array
        for (int i = 1; i <= 10; i++) {
            System.out.print("Número " + i + ": ");
            numeros[i-1] = scanner.nextDouble();
        }

        // Calcular el número más grande
        double mayor = numeros[0];
        for (int i = 0; i <= 9; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }

        // Imprimir el resultado
        System.out.println("El número más grande es: " + mayor);

        // Cerrar el Scanner
        scanner.close();
    }
    
}
