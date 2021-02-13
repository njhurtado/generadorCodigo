/**
 * Republica de Colombia
 * Copyright (c) 2004 Dirección de Impuestos y Aduanas Nacionales.
 * (DIAN - www.dian.gov.co).  Todos los Derechos reservados.
 *
 * $Header:$
 */
package co.gov.dian.muisca.exportacion.servicios.alianzapacifico.impl;

import co.gov.dian.muisca.arquitectura.general.excepcion.DExcepcion;
import co.gov.dian.muisca.arquitectura.interfaces.IDAdminPersistencia;
import co.gov.dian.muisca.exportacion.dao.alianzapacifico.IDDAOFactoryExportacion;
import co.gov.dian.muisca.exportacion.dao.alianzapacifico.IDDAOProcesoDocumentos;
import co.gov.dian.muisca.exportacion.dao.alianzapacifico.impl.oracle.DDAOFactoryExportacion;
import co.gov.dian.muisca.exportacion.servicios.alianzapacifico.DCmdSrvCrearProcesoDocumentos;

/**
 * <p>Titulo: Proyecto MUISCA</p>
 * <p>Descripcion: Comando de servicio utilizado para Crear un objeto ProcesoDocumentos.</p>
 * <p>Copyright: Copyright (c) 2019</p>
 * <p>Company: DIAN</p>
 *
 * @author gencode
 * @version $Revision:$
 * <pre>
 * $Log[10]:$
 * </pre>
 */
public class DCmdSrvCrearProcesoDocumentosImpl extends DCmdSrvCrearProcesoDocumentos {


  /**
   * Ejecuta el comando de servicio.
   *
   * @throws DExcepcion Si ocurre algn error al realizar la
   * actualizaciï¿½ de ProcesoDocumentos
   */
  protected void ejecutarComando() throws DExcepcion {
    IDAdminPersistencia admin = getAdministradorPersistencia();
    try {
      // Iniciar los DAO's
      IDDAOFactoryExportacion fabrica = new DDAOFactoryExportacion();
      IDDAOProcesoDocumentos dao = fabrica.getDaoProcesoDocumentos();

      // Crear
      dao.inicializarCrear(toProcesoDocumentos);
      admin.guardar(dao);
    }
    finally {
      admin.cerrarSesion();
    }
  }

}
