import java.util.Scanner;

public class Main {
    static Scanner key =  new Scanner(System.in);;
    public static void main(String[] args) {
        Persona persona = new Persona();
        System.out.print("Introduzca el nombre de la persona: ");
        String name = key.next();
        persona.setNombre(name);
        System.out.print("Introduzca la edad de la persona: ");
        int age = key.nextInt();
        persona.setEdad(age);
        System.out.print("Introduzca el numero de la persona: ");
        String nambah = key.next();
        persona.setTelefono(nambah);
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad() + " años");
        System.out.println("Numero: " + persona.getTelefono());
    }

}

class Persona{
    private int edad;
    private String nombre;
    private String telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}