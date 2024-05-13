package hello01;


import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        // Llamada al método sayHello() de la clase Greeter
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());

        // Llamada al método adicionalCode() de la clase Greeter
        greeter.additionalCode();

        System.out.println("Hola desde ciber01");

        // Vulnerabilidad: Input sin validación
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Hola, " + nombre);
        greeter.threadOperation();
        greeter.closeResource();
        greeter.servletMethod();
    }
}