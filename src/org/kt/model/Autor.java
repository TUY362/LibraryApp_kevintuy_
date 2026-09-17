package org.kt.model;

/**
 * Clase que representa la entidad Autor.
 */
public class Autor {
    private int idAutor;
    private String nombres;
    private String apellidos;

    /** Constructor vacío */
    public Autor() {}

    /**
     * Constructor parametrizado.
     * @param idAutor ID del autor.
     * @param nombres Nombres del autor.
     * @param apellidos Apellidos del autor.
     */
    public Autor(int idAutor, String nombres, String apellidos) {
        this.idAutor = idAutor;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public int getIdAutor() { return idAutor; }
    public void setIdAutor(int idAutor) { this.idAutor = idAutor; }

    public String getNombres() { return nombres; }
    public void setNombres(String nombres) { this.nombres = nombres; }

    public String getApellidos() { return apellidos; }
    public void setApellidos(String apellidos) { this.apellidos = apellidos; }

    @Override
    public String toString() {
        return "Autor{" + "idAutor=" + idAutor + ", nombres=" + nombres + ", apellidos=" + apellidos + '}';
    }
}