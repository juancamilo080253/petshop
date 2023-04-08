package com.desarrollo.petshop.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.desarrollo.petshop.services.productoService;


@Controller
public class inicioController {

    @Autowired
    productoService productoService;

    @GetMapping("/catalogo")
    public String goToCatalogo(Model model){    
       var productos = productoService.listarProdutos();
       model.addAttribute("productos", productos);  //variable que hemos compartido "entre comillas"
        return "catalogo";
    }

    @GetMapping("/nosotros")
    public String goToNosotros(Model model){ 
        /* que es esto del model? es un objeto que 
        voy a recibir trabajando con mvc 
        representa los datos que quiero mandarle a la vista, para
        que el me muestre la info en la plantilla*/ 
        return "nosotros"; //redirige plantilla, si es el nombre de un archivo lo devuelve
    }

    @GetMapping("/contacto")
    public String goTocontacto(Model model){
        return "contacto";
    }
}
