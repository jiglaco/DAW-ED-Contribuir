package com.biblioteca.modelo;

import java.util.Scanner;

/**
 * Representa un libro en el sistema de biblioteca
 */
public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private int añoPublicacion;
    private boolean disponible;
    
    public Libro(String titulo, String autor, String isbn, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.añoPublicacion = añoPublicacion;
        this.disponible = true;
    }
    
    // Metodos        
    public static String validarIsbn(Scanner sc) {
        String isbn;        
        
        while (true) {            
            // Entrada por consola
            isbn = sc.nextLine();            
            // Eliminar guiones
            String isbnLimpio = isbn.replace("-", "");
            
            // La longitud debe ser 13 caracteres
            if (isbnLimpio.length() != 13) {
                System.out.println("El código ISBN introducido debe tener exactamente trece dígitos.");
                continue;
            }
            
            // Comprobar que solo sean dígitos
            if (!isbnLimpio.matches("\\d{13}")) {
                System.out.println("El ISBN solo puede contener valores numéricos y la separación por guiones es opcional");
                continue;
            }
            
            return isbn;
        }
    }
    
    
    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public String getIsbn() {
        return isbn;
    }
    
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    public int getAñoPublicacion() {
        return añoPublicacion;
    }
    
    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }
    
    public boolean isDisponible() {
        return disponible;
    }
    
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    @Override
    public String toString() {
        return String.format("Libro: %s | Autor: %s | ISBN: %s | Año: %d | Disponible: %s",
                titulo, autor, isbn, añoPublicacion, disponible ? "Sí" : "No");
    }
}
