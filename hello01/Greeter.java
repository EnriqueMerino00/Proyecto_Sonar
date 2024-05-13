package hello01;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.Scanner;

public class Greeter {
    
    // Code Smell: Método innecesariamente público
    public String sayHello() {
        // Code Smell: Uso de "==" para comparar cadenas
        String greeting = "Hello";
        if (greeting == "Hello") {
            return "Hello world!";
        } else {
            return "Greetings world!";
        }
    }
    
    // Code Smell: Método que solo reenvía una excepción capturada
    public void doSomething() throws Exception {
        try {
            // Código que puede lanzar una excepción
            throw new Exception("Something went wrong");
        } catch (Exception e) {
            // Code Smell: Captura de excepción que solo la vuelve a lanzar
            throw e;
        }
    }
    
    // Code Smell: Llamada redundante a close()
    public void closeResource() {
        // Código para cerrar un recurso
        try {
            // Código que cierra el recurso
            // ...
        } catch (Exception e) {
            // Manejo de excepción
        }
        
        // Code Smell: Llamada redundante a close()
        // El recurso ya se cerró en el bloque try
        close(); // Suponiendo que close() es un método de instancia
        
        // Crear un socket para escuchar en un puerto y actuar como un servidor
        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            System.out.println("Servidor iniciado en el puerto 8080...");
            
            // Código para aceptar conexiones, procesar solicitudes, etc.
            // Este código no se ejecutará realmente ya que estamos en el método close(),
            // pero es solo para demostrar cómo podría funcionar.
            
        } catch (IOException e) {
            // Manejo de excepciones de E/S
            e.printStackTrace();
        }
    }

    // Vulnerabilidad: Método de servlet lanzando una excepción
    public void servletMethod() {
        // Código del servlet
        try {
            // Algo que puede lanzar una excepción
            throw new Exception("Servlet exception");
        } catch (Exception e) {
            // Manejo de excepción inadecuado
            e.printStackTrace();
        }
    }

    // Vulnerabilidad: Uso inseguro de suspensión de hilos
    public void threadOperation() {
        // Operación que podría ser vulnerable a DoS si es intensiva en recursos
        // y se ejecuta en múltiples hilos simultáneamente
    }

    // Código adicional para aumentar la cantidad de líneas
    public void additionalCode() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int num = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea
        
        // Hacer algo con el número ingresado
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " es par");
            } else {
                System.out.println(i + " es impar");
            }
        }
        
        // Otro bucle para imprimir un mensaje
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteración " + i);
        }
        
        // Generar una excepción intencionalmente
        generateException();
        
        // Cerrar el scanner
        scanner.close();
    }
    
    // Método para generar una excepción
    private void generateException() {
        throw new RuntimeException("Excepción generada intencionalmente");
    }
}