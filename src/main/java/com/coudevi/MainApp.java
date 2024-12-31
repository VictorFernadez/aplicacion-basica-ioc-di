package com.coudevi;

import com.coudevi.models.Contacto;
import com.coudevi.services.ContactoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.coudevi.config");
        ContactoService contactoService = context.getBean(ContactoService.class);
        contactoService.agregarContacto(new Contacto("Victor", "123456789"));
        contactoService.agregarContacto(new Contacto("Natalie", "987654321"));
        contactoService.obtenerContactos().forEach(contacto -> {
            System.out.println("Nombre: " + contacto.getNombre() + ", Teléfono: " + contacto.getTelefono());
        });
    }
}
