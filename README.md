# 📚 Biblioteca DAM

Sistema de gestión de catálogo y préstamos de libros, desarrollado en Java como proyecto de aprendizaje de Git y GitHub.

## 🗂️ Estructura del proyecto

```
biblioteca-dam/
├── Libro.java        # Modelo de datos (título, autor, estado de préstamo)
├── Biblioteca.java   # Lógica principal del catálogo
└── Main.java         # Punto de entrada de la aplicación
```

## ✨ Funcionalidades

### Rama `main`
- Crear libros con título y autor
- Añadir libros al catálogo (`agregarLibro`)
- Mostrar el catálogo completo (`mostrarLibros`)

### Rama `prestamos`
- Prestar libros a usuarios (`prestarLibro`)
- Registrar devoluciones (`devolverLibro`)
- Control del estado de cada libro (prestado / disponible)

## 🛠️ Tecnologías

- **Lenguaje:** Java 17+
- **Control de versiones:** Git + GitHub
- **IDE recomendado:** IntelliJ IDEA / VS Code + GitLens

## 🚀 Cómo ejecutar

```bash
git clone https://github.com/TU_USUARIO/biblioteca-dam.git
cd biblioteca-dam
javac *.java
java Main
```

## 📌 Historial de ramas

| Rama | Descripción |
|------|-------------|
| `main` | Versión estable con catálogo básico |
| `prestamos` | Sistema de préstamos y devoluciones |

---
> Proyecto educativo — DAM · Control de Versiones con Git
