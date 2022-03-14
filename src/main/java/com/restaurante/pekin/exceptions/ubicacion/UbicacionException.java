package com.restaurante.pekin.exceptions.ubicacion;

import org.apache.commons.lang.exception.NestableException;

/**
 *
 * @author hernan
 */
public class UbicacionException extends NestableException {

  private static final long serialVersionUID = 1L;

  public UbicacionException(String msg) {
    super(msg);
  }
}
