public class Main {
    public static void main(String[] args) {
        System.out.println("╔════════════════════════════╗");
        System.out.println("║   BIBLIOTECA DAM  v2.0     ║");
        System.out.println("╚════════════════════════════╝");

        Biblioteca biblioteca = new Biblioteca(10);

        biblioteca.agregarLibro(new Libro("Clean Code",  "Robert C. Martin"));
        biblioteca.agregarLibro(new Libro("El Quijote",  "Miguel de Cervantes"));
        biblioteca.agregarLibro(new Libro("1984",        "George Orwell"));

        System.out.println();
        biblioteca.mostrarLibros();
    }
}