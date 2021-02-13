/**
 * Republica de Colombia
 * Copyright (c) 2019 Dirección de Impuestos y Aduanas Nacionales.
 * (DIAN - www.dian.gov.co).  Todos los Derechos reservados.
 *
 * $Header:$
 */
package co.gov.dian.muisca.exportacion.acciones.alianzapacifico.impl;



import co.gov.dian.muisca.arquitectura.general.excepcion.*;
import co.gov.dian.muisca.exportacion.servicios.alianzapacifico.DCmdSrvConsProcesoDocumentos;
import co.gov.dian.muisca.exportacion.acciones.alianzapacifico.DCmdAccConsProcesoDocumentos;


/**
 * <p>Titulo: Proyecto MUISCA</p>
 * <p>Descripcion: Accion utilizado para consultar un objeto ProcesoDocumentos.</p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: DIAN</p>
 *
 * @author genmodel
 * @version $Revision:$
 * <pre>
 * $Log[10]:$
 * </pre>
 */
public class DCmdAccConsProcesoDocumentosImpl extends DCmdAccConsProcesoDocumentos {

  /**
   * Ejecuta el Accion
   */
  protected void ejecutarComando() {
    try {
      DCmdSrvConsProcesoDocumentos servicio = (DCmdSrvConsProcesoDocumentos) getServicio("exportacion.alianzapacifico.DCmdSrvConsProcesoDocumentos");
      servicio.inicializar(pkProcesoDocumentos);
      servicio.ejecutar();
      toProcesoDocumentos = servicio.getProcesoDocumentos();
      isOk = true;
    }
    catch (DExcepcion ex) {
      mensajeError = ex.getMessage();
      mensajeErrorDetallado = ex.getMensajeDetallado();
      isOk = false;
    }
  }

}
