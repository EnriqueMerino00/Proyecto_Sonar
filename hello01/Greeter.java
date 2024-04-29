package hello01;

public class Greeter {
    
    // Code Smell: Método sayHello() innecesariamente público
    public String sayHello() {
        // Vulnerabilidad: Uso de concatenación de cadenas insegura
        return "Hello" + " world!";
    }
}