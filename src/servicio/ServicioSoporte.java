/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import Exception.LibroException;
import dao.Dao;
import data.Soporte;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 *
 * @author fabian.giraldo
 */
public class ServicioSoporte {
    private Dao dao;
    private ArrayList<Soporte> soportes = null; //Debe ser mejorado notablemente.
    public ServicioSoporte(){
      this.dao = new Dao();
     }
    
    public void cargarSoportes(String archivo) throws FileNotFoundException, LibroException{
       this.soportes = this.dao.cargarSoportes(archivo);
    }
    
    public ArrayList<Soporte> getSoportes(){
      return this.soportes;
    }
    
   
    
}
