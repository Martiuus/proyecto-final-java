package pe.idat.proyecto_final_java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EntradasController {
    @GetMapping("/entradas")
    public String entradas(){
        return "entradas";
    }
}
