package ar.edu.unahur.obj2.conexion;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ConectorDBTest {

    @Test
    @DisplayName("Verificar que si guardo en 2 variables diferentes 2 instancias de ConectorDB me devuelven el mismo objeto")
    void testGetInstance() {
        var instance1 = ConectorDB.getInstance();
        var instance2 = ConectorDB.getInstance();

        assertEquals(instance1, instance2);
    }
}
