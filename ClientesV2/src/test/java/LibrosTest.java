import org.example.Libros;
import org.example.Obra;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;

public class LibrosTest extends Obra{

    @Test
    public void mostrarLibrosTest(){
        Libros miLista = new Libros();
        Libros libro = new Libros("El principito", "Antoine de Saint-Exupéry", 96);
        miLista.agregarLibro(libro);
        assertEquals("El principito", miLista.mostrarLibros());
    }
}
