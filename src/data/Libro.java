/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author fabian.giraldo
 */
public class Libro extends Soporte{
    private String isbn;
    
    public Libro(String isbn, String titulo) {
        super(titulo);
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Libro{" + super.toString() +"isbn=" + isbn + '}';
    }
    
    
    
}
