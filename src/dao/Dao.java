/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Exception.LibroException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import data.Autor;
import data.Libro;
import data.Soporte;

/**
 * @author fabian.giraldo
 * Luego va ser mejorada
 */
public class Dao {
         
    public Autor cargarAutor(Scanner sc) {
	Autor autor = null;
	String nombre = sc.next().trim();
        String apellido = sc.next().trim();
        autor = new Autor(nombre, apellido);
        return autor;
    }
        
    public Libro cargarLibro(Scanner sc) throws LibroException{
	Libro libro = null;
	String titulo = sc.next().trim();
        
        if(titulo.length()< 5){
           throw new LibroException("Titulo incorrecto" + titulo);
        }
        Autor autor = cargarAutor(sc);
	String isbn = sc.next().trim();	
        libro = new Libro(isbn, titulo);
        libro.setAutor(autor);
         
        return libro;
    }
    
    public Soporte leerSoporte(Scanner sc) throws LibroException {
	String type = sc.next().trim();
	if (type.equals("Libro")) return cargarLibro(sc);
		return null; //Se debe completar
    }
	
    public ArrayList<Soporte> cargarSoportes(String archivo) throws FileNotFoundException, LibroException{
  	ArrayList<Soporte> soportes = new ArrayList<Soporte>();
	Scanner sc;
	sc = new Scanner(new File(archivo));
	sc.useDelimiter(",");
	while (sc.hasNext()) {
		soportes.add(leerSoporte(sc));
	}
	
	return soportes;
   }
    
}
