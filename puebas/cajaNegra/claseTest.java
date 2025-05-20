import org.junit.Test;
import static org.junit.Assert.*;

public class IncidenciaTest {

    @Test
    public void testCambiarPrioridad() {
        Incidencia i = new Incidencia(1, "No puedo acceder", "Media", "cliente@benatech.com");
        String resultado = i.cambiarPrioridad("Alta");
        assertEquals("Prioridad actualizada a Alta", resultado);
        assertEquals("Alta", i.getPrioridad());
    }
}
