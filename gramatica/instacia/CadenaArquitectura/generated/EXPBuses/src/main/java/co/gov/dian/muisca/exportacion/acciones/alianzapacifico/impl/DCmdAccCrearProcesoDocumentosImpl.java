/**
 * Republica de Colombia
 * Copyright (c) 2019 Dirección de Impuestos y Aduanas Nacionales.
 * (DIAN - www.dian.gov.co).  Todos los Derechos reservados.
 *
 * $Header:$
 */
package co.gov.dian.muisca.exportacion.acciones.alianzapacifico.impl;



import co.gov.dian.muisca.arquitectura.general.excepcion.*;

import co.gov.dian.muisca.exportacion.servicios.alianzapacifico.DCmdSrvCrearProcesoDocumentos;
import co.gov.dian.muisca.exportacion.acciones.alianzapacifico.DCmdAccCrearProcesoDocumentos;

/**
 * <p>Titulo: Proyecto MUISCA</p>
 * <p>Descripcion: Accion utilizado para actualizar un objeto ProcesoDocumentos.</p>
 * <p>Copyright: Copyright (c) 2019</p>
 * <p>Company: DIAN</p>
 *
 * @author gencode
 * @version $Revision:$
 * <pre>
 * $Log[10]:$
 * </pre>
 */
public class DCmdAccCrearProcesoDocumentosImpl extends DCmdAccCrearProcesoDocumentos  {


  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

/**
   * Ejecuta el comando de acciï¿½.
   */
  protected void ejecutarComando() {
    try {
      DCmdSrvCrearProcesoDocumentos servicio = (DCmdSrvCrearProcesoDocumentos) getServicio("exportacion.alianzapacifico.DCmdSrvCrearProcesoDocumentos");
      servicio.inicializar(toProcesoDocumentos);
      servicio.ejecutar();
      isOk = true;
    }
    catch (DExcepcion ex) {
      mensajeError = ex.getMessage();
      mensajeErrorDetallado = ex.getMensajeDetallado();
      isOk = false;
    }
  }

}