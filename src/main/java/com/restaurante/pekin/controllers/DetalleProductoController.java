package com.restaurante.pekin.controllers;

import com.restaurante.pekin.exceptions.detalleProducto.DetalleMenuException;
import com.restaurante.pekin.model.DetalleProducto;
import com.restaurante.pekin.model.dto.DetalleDto;
import com.restaurante.pekin.service.DetalleProductoService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author hernan
 */
@Controller
public class DetalleProductoController {
  
  private static final Logger log = LogManager.getLogger(DetalleProductoController.class);
  
  @Autowired
  private DetalleProductoService detalleProductoService;
  
  private static final String DETALLE_MENU_INSERT_DATA = "/insertarDetalleProducto";
  private static final String DETALLE_MENU_UPDATE_DATA = "/actualizarDetalleProducto";
  private static final String LISTA_DETALLE_MENU = "/listarDetalleProducto";
  private static final String DELETE_DETALLE_MENU = "/eliminarDetalleProducto";
  
  @PostMapping(value = DETALLE_MENU_INSERT_DATA)
  public @ResponseBody
  Boolean insertarClienteDetalle(@RequestBody DetalleDto detalleDto) throws DetalleMenuException {
    StringBuilder mensaje = new StringBuilder();
    System.out.println("datos de cliente" + detalleDto.toString());
    try {
      DetalleProducto persist = new DetalleProducto();
      persist.setNombre(detalleDto.getNombre());
      persist.setLocalidad(detalleDto.getLocalidad());
      persist.setCalle(detalleDto.getCalle());
      persist.setReferencia(detalleDto.getReferencia());
      persist.setPedido(detalleDto.getPedido());
      persist.setTotalpago(detalleDto.getTotalpago());
      persist.setTelefono(detalleDto.getTelefono());
      persist.setFechahoracaptura(detalleDto.obtieneFechaHora());
      persist.setActivo("activo");
      detalleProductoService.guardarDetallePedidoCliente(persist);
      return true;
    } catch (DetalleMenuException ex) {
      mensaje.append("NO SE PUDO GUARDAR DETALLE CLIENTE ERROR CONTROLLER").append(ex.getMessage());
      log.error("ENTRO EN EL CATCH DETALLE CLIENTE CONTROLLER");
      throw new DetalleMenuException(ex.getCause().toString());
    }
  }
  
}
