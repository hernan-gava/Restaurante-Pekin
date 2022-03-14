package com.restaurante.pekin.service;

import com.restaurante.pekin.exceptions.detalleProducto.DetalleMenuException;
import com.restaurante.pekin.model.DetalleProducto;

/**
 *
 * @author hernan
 */
public interface DetalleProductoService {

   public void guardarDetallePedidoCliente(DetalleProducto detalleProducto) throws DetalleMenuException;

   //public List<DetalleProducto> getAllDetalleProducto() throws DetalleMenuException;

   //public void eliminarDetalleProducto(Integer idMenu) throws DetalleMenuException;
}
