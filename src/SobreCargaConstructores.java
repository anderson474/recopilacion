public class SobreCargaConstructores {
    public static void main(String[] args) {

        Persona.sumar(4,5);
        Persona.sumar(4.56,5);

        Persona p1=new Persona("Anderson",19);
        System.out.println(p1.getEdad());
        System.out.println(p1.getContadorPersonas());
        System.out.println(p1.getNombre());

        //paso por referencia
        //se le manda una variable de tipo persona
        //entonces apunta a la direccion en memoria de ese objeto
        cambiarNombre(p1);

        System.out.println(p1.getNombre());


    }
    private static void cambiarNombre(Persona pelsona){
        pelsona.nombre="Juan";
    }
}
