package hello01;

import org.joda.time.LocalTime;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        // Code Smell: Uso de variable currenTime con error ortográfico
        LocalTime currenTime = new LocalTime(); 
        System.out.println("La hora actual es: " + currenTime);

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
        greeter.doSomething();
        greeter.closeResource();
        greeter.servletMethod();
    }
}