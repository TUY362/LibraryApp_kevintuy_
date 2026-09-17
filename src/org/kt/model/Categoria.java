package org.kt.model;

/**
 * Clase que representa el género o categoría de un libro.
 */
public class Categoria {
    private int idCategoria;
    private String nombreCategoria;

    /** Constructor vacío */
    public Categoria() {}

    /**
     * Constructor parametrizado.
     * @param idCategoria ID de la categoría.
     * @param nombreCategoria Nombre de la categoría.
     */
    public Categoria(int idCategoria, String nombreCategoria) {
        this.idCategoria = idCategoria;
        this.nombreCategoria = nombreCategoria;
    }

    public int getIdCategoria() { return idCategoria; }
    public void setIdCategoria(int idCategoria) { this.idCategoria = idCategoria; }

    public String getNombreCategoria() { return nombreCategoria; }
    public void setNombreCategoria(String nombreCategoria) { this.nombreCategoria = nombreCategoria; }

    @Override
    public String toString() {
        return "Categoria{" + "idCategoria=" + idCategoria + ", nombreCategoria=" + nombreCategoria + '}';
    }
}