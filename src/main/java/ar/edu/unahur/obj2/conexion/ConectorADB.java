package ar.edu.unahur.obj2.conexion;

public class ConectorADB {

    private static ConectorADB instance = new ConectorADB(); // debe tener un atributo de clase del tipo de dato de la clase

    private ConectorADB(){} // debe tener privados los constructores por defecto para que no se puedan instanciar más objetos de este tipo

    public static ConectorADB getInstance() {
        return instance;
    } //debe tener un getter para poder acceder al objeto/instancia creado/a 

}

