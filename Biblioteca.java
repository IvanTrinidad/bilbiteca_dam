public class Biblioteca {
    private Libro[] libros;
    private int contador;

    public Biblioteca(int capacidad) {
        libros   = new Libro[capacidad];
        contador = 0;
    }
}
