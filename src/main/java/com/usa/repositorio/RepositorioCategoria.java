/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usa.repositorio;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.usa.interfaces.InterfaceCategoria;
import com.usa.modelo.Categoria;

/**
 *
 * @author USUARIO
 */
@Repository
public class RepositorioCategoria {
    @Autowired
    private InterfaceCategoria crud2;
    
     public List<Categoria> getAll(){
        return (List<Categoria>) crud2.findAll();       
    }
    
    public Optional <Categoria> getCategoria(int id){
        return crud2.findById(id);
    }
    
    public Categoria save(Categoria categoria){
        return crud2.save(categoria);
    }
     public void delete(Categoria categoria){
        crud2.delete(categoria);
    }
}
