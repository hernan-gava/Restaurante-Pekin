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
	private static final String LOGIN = "/login-page";
	private static final String DETALLE_MENU = "/public-menu";
	private static final String Alta_Cliente = "/AltaCliente";
	private static final String Alta_Role = "/AltaRole";
	private static final String Alta_Cliente_Role = "/ClienteRole";

	@GetMapping(value = PAGINA_PRINCIPAL)
	public String paginaPrincipal() {
		return "index";
	}

	@GetMapping(value = DETALLE_MENU)
	public String altaPublicacion() {
		return "Administrador-Page/PublicacionAltaProductos";
	}

	@GetMapping(value = LOGIN)
	public String loginAdmin() {
		return "Administrador-Page/Login-page";
	}

	@GetMapping(value = Alta_Cliente)
	public String AltaCliente() {
		return "Administrador-Page/AltaCliente";
	}

	@GetMapping(value = Alta_Role)
	public String AltaRole() {
		return "Administrador-Page/AltaRoles";
	}

	@GetMapping(value = Alta_Cliente_Role)
	public String AltaClienteRole() {
		return "Administrador-Page/ClienteRole";
	}
}
