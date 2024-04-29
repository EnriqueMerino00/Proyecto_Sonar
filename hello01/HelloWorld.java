package hello01;

import org.joda.time.LocalTime;

import java.util.Scanner; // Vulnerabilidad: Import innecesario

public class HelloWorld {
    public static void main(String[] args) {
        LocalTime currenTime = new LocalTime(); // Code Smell: Uso de variable currenTime con error ortográfico
        System.out.println("La hora actual es: " + currenTime);
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
        System.out.println("Hola desde ciber01");

        // Vulnerabilidad: Input sin validación
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Hola, " + nombre);
    }
}