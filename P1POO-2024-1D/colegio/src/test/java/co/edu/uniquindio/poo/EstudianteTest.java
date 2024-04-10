/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    /**
     * Caso de prueba para validar a un estudiante 
     */
    @Test
    public void datosCompletos() {
        LOG.info("Iniciado test datosCompletos");
        
        Estudiante estudiante = new Estudiante("Camila", "Alzate Rios", "109453264", "camila@uniquindio.edu.co", "315635674", (byte) 18);

        assertEquals("Camila", estudiante.nombre());
        assertEquals("Alzate Rios", estudiante.apellido());
        assertEquals("109453264", estudiante.identificacion());
        assertEquals("camila@uniquindio.edu.co", estudiante.correo());
        assertEquals("315635674", estudiante.telefono());
        assertEquals((byte) 18, estudiante.edad());

        LOG.info("Finalizando test datosCompletos");
    }

    /**
     * Prueba para verificar los datos de un estudiantes no sean nulos
     */
    @Test
    public void datosNulos() {
        LOG.info("Inicio Prueba de datosNulos");

        assertThrows(  Throwable.class, ()-> new Estudiante (null, null, null, null, null,(byte)0));

        LOG.info("Finalizacion de peurba datosNulos");
    }

     /**
     * Prueba para verificar los datos de un estudiantes no esten vacios
     */
    @Test
    public void datosVacios() {
        LOG.info("Inicio Prueba de datosVacios");

        assertThrows(  Throwable.class, ()-> new Estudiante ("", "","" , "", "",(byte)0));

        LOG.info("Finalizacion de prueba datosVacios");
    }

    /**
     * Prueba para verificar que la edad del estudiante no sea negativa
     */
    @Test
    public void edadNegativa(){
        LOG.info("Inicio prueba edadNegativa")

        assertThrows( Throwable.class,()-> new Es)


        LOG.info("Finalizscion prueba edadNegativa")

    }

    /*
     * Prueba para verificar correo electronico
     */
    @Test
    public void correoInvalido(){

    }


}
