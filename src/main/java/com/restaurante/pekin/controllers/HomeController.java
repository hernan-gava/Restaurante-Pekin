package com.restaurante.pekin.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author hernan
 */
@Controller
public class HomeController {

   private static final String PAGINA_PRINCIPAL = "/index";
   private static final String DETALLE_MENU = "/public-menu";

   @GetMapping(value = PAGINA_PRINCIPAL)
   public String paginaPrincipal() {
      return "index";
   }

   @GetMapping(value = DETALLE_MENU)
   public String altaPublicacion() {
      return "Administrador-Page/PublicacionAltaProductos";
   }
}
