public class SobreCargaConstructores {
    public static void main(String[] args) {

        Persona.sumar(4,5);
        Persona.sumar(4.56,5);

        Persona p1=new Persona("Anderson",19);
        System.out.println(p1.getEdad());
        System.out.println(p1.getContadorPersonas());


    }
}
