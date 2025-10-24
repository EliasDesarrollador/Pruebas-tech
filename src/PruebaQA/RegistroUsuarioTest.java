package PruebaQA;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RegistroUsuarioTest {

    private RegistroUsuario registro;

    @BeforeEach
    void setup() {
        registro = new RegistroUsuario();
    }

    @Test
    void testRegistroExitoso() {
        String resultado = registro.registrarUsuario("Elias", "elias@test.com", "es1234");
        assertEquals("Registro exitoso", resultado);
        assertEquals(1, registro.cantidadUsuarios());
    }

    @Test
    void testCamposVacios() {
        String resultado = registro.registrarUsuario("", "elias@test.com", "es1234");
        assertEquals("Error: Campos vacíos", resultado);
    }

    @Test
    void testEmailDuplicado() {
        registro.registrarUsuario("Elias", "elias@test.com", "es1234");
        String resultado = registro.registrarUsuario("Juan", "elias@test.com", "abcd");
        assertEquals("Error: Email ya registrado", resultado);
    }
}
