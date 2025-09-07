package ar.edu.unahur.obj2.conexion;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ConectorADBTest {

    @Test
    @DisplayName("Verificar que si guardo en 2 variables diferentes 2 instancias de ConectorADB me devuelven el mismo objeto")
    void testGetInstance() {
        var instance1 = ConectorADB.getInstance();
        var instance2 = ConectorADB.getInstance();

        assertEquals(instance1, instance2);
    }
}
