package org.kt.model;

/**
 * Clase que representa la entidad Libro.
 */
public class Libro {
    private int idLibro;
    private String titulo;
    private String isbn;
    private double precio;

    /** Constructor vacío */
    public Libro() {}

    /**
     * Constructor parametrizado.
     * @param idLibro ID del libro.
     * @param titulo Título de la obra.
     * @param isbn Código ISBN.
     * @param precio Precio de venta.
     */
    public Libro(int idLibro, String titulo, String isbn, double precio) {
        this.idLibro = idLibro;
        this.titulo = titulo;
        this.isbn = isbn;
        this.precio = precio;
    }

    public int getIdLibro() { return idLibro; }
    public void setIdLibro(int idLibro) { this.idLibro = idLibro; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    @Override
    public String toString() {
        return "Libro{" + "idLibro=" + idLibro + ", titulo=" + titulo + ", isbn=" + isbn + ", precio=" + precio + '}';
    }
}
