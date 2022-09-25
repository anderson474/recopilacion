public class Persona {
    private int idpersona;
    public String nombre;
    private int edad;
    private static int contadorPersonas;


    private Persona(){
        this.idpersona = contadorPersonas++;
    }

    // constructor completo - esto es sobrecarga
    public Persona(String nombre, int edad){
        this();
        this.nombre = nombre;
        this.edad = edad;
    }
    public static int sumar(int a, int b){
        System.out.println("sumando enteros");
        return a+b;
    }
    //aca se sobrecarga el metodo de sumar
    public static double sumar(double a, double b){
        System.out.println("sumando double");
        return a+b;
    }

    public int getEdad() {
        return edad;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    public String getNombre() {
        return nombre;
    }
}
