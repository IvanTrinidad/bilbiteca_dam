public class Biblioteca {
    private Libro[] libros;
    private int contador;

    public Biblioteca(int capacidad) {
        libros   = new Libro[capacidad];
        contador = 0;
    }

    public void agregarLibro(Libro libro) {
        if (contador < libros.length) {
            libros[contador] = libro;
            contador++;
            System.out.println("Libro añadido: " + libro.getTitulo());
        } else {
            System.out.println("La biblioteca está llena.");
        }
    }
}