package pe.idat.proyecto_final_java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OrdenFinalController {
    @GetMapping("/ordenfinal")
    public String ordenfinal(){
        return "ordenfinal";
    }
}
