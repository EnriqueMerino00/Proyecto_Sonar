package hello01;
import java.util.Scanner;

public class VulnerableClass {

    // Variable global
    private int globalVariable;

    // Constructor
    public VulnerableClass(int initialValue) {
        this.globalVariable = initialValue;
    }

    // Método para introducir datos por teclado
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        int input = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea
        
        // Asignar el valor introducido a la variable global
        globalVariable = input;
    }

    // Método con un switch case que acepta valores sin verificar
    public void switchCaseExample() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca una opción (1, 2 o 3): ");
        int option = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea
        
        // Switch case sin verificación de valores
        switch (option) {
            case 1:
                System.out.println("Opción 1 seleccionada");
                break;
            case 2:
                System.out.println("Opción 2 seleccionada");
                break;
            case 3:
                System.out.println("Opción 3 seleccionada");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }

    // Método adicional para aumentar la cantidad de líneas
    public void additionalMethod() {
        // Realizar algún cálculo
        int result = globalVariable * 2;
        System.out.println("El doble de la variable global es: " + result);

        // Otro cálculo
        int anotherResult = globalVariable + 10;
        System.out.println("La variable global más 10 es: " + anotherResult);

        // Otro cálculo más
        int finalResult = result + anotherResult;
        System.out.println("La suma de los dos resultados anteriores es: " + finalResult);

        // Hacer algo más
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteración " + i);
        }

        // Generar una excepción intencionalmente
        generateException();
    }

    // Método para generar una excepción
    private void generateException() {
        throw new RuntimeException("Excepción generada intencionalmente");
    }
}