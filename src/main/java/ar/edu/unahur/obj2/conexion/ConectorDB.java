package ar.edu.unahur.obj2.conexion;

public class ConectorDB {

    private static ConectorDB instance;

    private ConectorDB(){}

    public static ConectorDB getInstance() { 
        if (instance == null) {
            instance = new ConectorDB(); 
        }
        return instance;
    }

}

/*
    Comparando esta aplicacion del singleton y la otra, podemos notar que:
        De la otra forma, desde que se compila el codigo instanciamos un Conector.
        En este caso, instanciamos el objeto recien cuando hacemos la primer consulta al getter
      
*/
