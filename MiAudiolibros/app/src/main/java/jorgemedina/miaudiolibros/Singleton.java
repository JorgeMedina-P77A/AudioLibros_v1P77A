package jorgemedina.miaudiolibros;

/**
 * Created by jlmgm on 12/09/2017.
 */

public class Singleton {

    private static Singleton INSTANCIA = new Singleton();

    // El constructor es private para evitar su acceso desde fuera.
    private Singleton() {}

    // Método para obtener la única instancia de la clase
    public static Singleton getInstancia() {
        return INSTANCIA;
    }




}
