package com.coudevi.services;

import com.coudevi.models.Contacto;

import java.util.ArrayList;
import java.util.List;

public class ContactoService {
    private List<Contacto> contactos = new ArrayList<>();
    public void agregarContacto(Contacto contacto){
        contactos.add(contacto);
    }
    public List<Contacto> obtenerContactos(){
        return contactos;
    }
}
