/**
 * Republica de Colombia
 * Copyright (c) 2004 Dirección de Impuestos y Aduanas Nacionales.
 * (DIAN - www.dian.gov.co).  Todos los Derechos reservados.
 *
 * $Header:$
 */
package co.gov.dian.muisca.exportacion.servicios.alianzapacifico.impl;

import co.gov.dian.muisca.arquitectura.general.excepcion.DExcepcion;
import co.gov.dian.muisca.arquitectura.general.excepcion.DValidarExcepcion;
import co.gov.dian.muisca.arquitectura.interfaces.IDAdminPersistencia;
import co.gov.dian.muisca.exportacion.dao.alianzapacifico.IDDAOFactoryExportacion;
import co.gov.dian.muisca.exportacion.dao.alianzapacifico.IDDAOProcesoDocumentos;
import co.gov.dian.muisca.exportacion.dao.alianzapacifico.impl.oracle.DDAOFactoryExportacion;
import co.gov.dian.muisca.exportacion.servicios.alianzapacifico.DCmdSrvConsLstProcesoDocumentos;

/**
 * <p>Titulo: Proyecto MUISCA</p>
 * <p>Descripcion: Comando de servicio utilizado para consultar objetos ProcesoDocumentos.</p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: DIAN</p>
 *
 * @author gencode
 * @version $Revision:$
 * <pre>
 * $Log[10]:$
 * </pre>
 */
public class DCmdSrvConsLstProcesoDocumentosImpl extends DCmdSrvConsLstProcesoDocumentos {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8790414816659457392L;

	/**
	 * Ejecuta el comando de servicio.
	 *
	 * @throws DExcepcion
	 *           Si ocurre algn error al realizar la consulta de objetos
	 *           ProcesoDocumentos
	 */
	protected void ejecutarComando() throws DExcepcion {
		IDAdminPersistencia admin = getAdministradorPersistencia();
		try {
			// Iniciar los DAO's
			IDDAOFactoryExportacion fabrica = new DDAOFactoryExportacion();
			IDDAOProcesoDocumentos dao = fabrica.getDaoProcesoDocumentos();

			switch (tipoOperacion) {
			case CONSULTA_GENERICA:
				dao.inicializarConsultaGenerica(toProcesoDocumentos);
				break;
				
		
					
			default:
				throw new DValidarExcepcion(getMensajeGeneral("la consulta", "de objetos ProcesoDocumentos"),
						getMensajeOperInvalida());
			}

			// Consultar
			admin.buscar(dao);
			objetosProcesoDocumentos = dao.getColeccionProcesoDocumentos();
		} finally {
			admin.cerrarSesion();
		}
	}

}
