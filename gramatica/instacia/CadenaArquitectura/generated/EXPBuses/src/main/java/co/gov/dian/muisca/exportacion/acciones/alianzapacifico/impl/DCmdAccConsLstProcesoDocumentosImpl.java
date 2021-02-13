/**
 * Republica de Colombia
 * Copyright (c) 2004 Dirección de Impuestos y Aduanas Nacionales.
 * (DIAN - www.dian.gov.co).  Todos los Derechos reservados.
 *
 * $Header:$
 */
package co.gov.dian.muisca.exportacion.acciones.alianzapacifico.impl;

import co.gov.dian.muisca.arquitectura.general.excepcion.DExcepcion;
import co.gov.dian.muisca.arquitectura.general.excepcion.DValidarExcepcion;
import co.gov.dian.muisca.exportacion.servicios.alianzapacifico.DCmdSrvConsLstProcesoDocumentos;
import co.gov.dian.muisca.exportacion.acciones.alianzapacifico.DCmdAccConsLstProcesoDocumentos;

/**
 * <p>Titulo: Proyecto MUISCA</p>
 * <p>Descripcion: Accion utilizado para consultar objetos ProcesoDocumentos.</p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: DIAN</p>
 *
 * @author gencode
 * @version $Revision:$
 * <pre>
 * $Log[10]:$
 * </pre>
 */
public class DCmdAccConsLstProcesoDocumentosImpl extends DCmdAccConsLstProcesoDocumentos {

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
	protected void ejecutarComando() {
			
		try {
			DCmdSrvConsLstProcesoDocumentos servicio = (DCmdSrvConsLstProcesoDocumentos) getServicio("exportacion.alianzapacifico.DCmdSrvConsLstProcesoDocumentos");

			switch (tipoOperacion) {
			case CONSULTA_GENERICA:
				servicio.inicializarConsultaGenerica(toProcesoDocumentos);;
				break;
				
		
							
			
			default:
			
				throw new DValidarExcepcion(getMensajeGeneral("la consulta", "de objetos ProcesoDocumentos"),
						getMensajeOperInvalida());
			}
			servicio.ejecutar();
			objetosProcesoDocumentos = servicio.getColeccionProcesoDocumentos();
			isOk = true;
		} catch (DExcepcion ex) {
			mensajeError = ex.getMessage();
			mensajeErrorDetallado = ex.getMensajeDetallado();
			isOk = false;
		}
	}

}
