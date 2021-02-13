/**
 * Republica de Colombia
 * Copyright (c) 2004 Dirección de Impuestos y Aduanas Nacionales.
 * (DIAN - www.dian.gov.co).  Todos los Derechos reservados.
 *
 * $Header:$
 */
package co.gov.dian.muisca.exportacion.servicios.alianzapacifico;

import java.util.*;

import co.gov.dian.muisca.exportacion.general.to.alianzapacifico.*;
import co.gov.dian.muisca.arquitectura.general.excepcion.*;
import co.gov.dian.muisca.arquitectura.interfaces.*;
import co.gov.dian.muisca.arquitectura.interfaces.implgenerica.comandos.*;

/**
 * <p>Titulo: Proyecto MUISCA</p>
 * <p>Descripcion: Comando de ServicioNegocio utilizado para consultar objetos ProcesoDocumentos.</p>
 * <p>Copyright: Copyright (c) 2012</p>
 * <p>Company: DIAN</p>
 *
 * @author Nelson Hurtado
 * @version $Revision:$
 * <pre>
 * $Log[10]:$
 * </pre>
 */
public class DCmdSrvConsLstProcesoDocumentos extends DComandoServicioNegocio {
	private static final long serialVersionUID = -1235430177L; 
	public static final int CONSULTA_GENERICA = 1;
		
						
		
	
	protected DProcesoDocumentosTO toProcesoDocumentos;

	/** Tipo de operación de consulta */
	protected int tipoOperacion = -1;
	/** Colección de objetos DProcesoDocumentosTO */
	protected Collection<DProcesoDocumentosTO> objetosProcesoDocumentos;
		
	
	

	/**
	 * Inicializa la consulta genérica de ProcesoDocumentos.
	 * @param attProcesoDocumentos Atributos de ProcesoDocumentos
	 */
	public void inicializarConsultaGenerica(DProcesoDocumentosTO toProcesoDocumentos) {
		tipoOperacion = CONSULTA_GENERICA;
		this.toProcesoDocumentos = toProcesoDocumentos;
	}

	/**
	 * Devuelve la colección de objetos ProcesoDocumentos que se hayan consultado.
	 * @return Un Collection con objetos DProcesoDocumentosTO
	 */
	public Collection<DProcesoDocumentosTO> getColeccionProcesoDocumentos() {
		return objetosProcesoDocumentos;
	}

	/**
	 * Ejecuta el comando de ServicioNegocio.
	 * @throws DExcepcion Si ocurre algún error al realizar la
	 * la consulta de ProcesoDocumentos
	 */
	protected void ejecutarComando() throws DExcepcion {
		throw new UnsupportedOperationException();
	}

	/**
	 * Obtiene una copia (clon) del comando.
	 * @return Un Object con la copia del comando
	 */
	public Object clonar() {
		return new DCmdSrvConsLstProcesoDocumentos();
	}

	/**
	 * Indica si el comando es auditable.
	 * @return true si el comando es auditable; false de lo contrario
	 */
	public boolean isAuditable() {
		return true;
	}

	/**
	 * Obtiene la descripción del comando.
	 * @return Un String con la descripción del comando
	 */
	public String getDescripcion() {
		return "Permite consultar objetos ProcesoDocumentos";
	}

	/**
	 * Método para validar los parámetros inicializados, invocado
	 * previamente a la ejecución del comando.
	 * @return true si los paretros son váidos; false de lo contrario
	 * @throws DValidarExcepcion Si los parámetros no son váidos
	 */
	public boolean validar() throws DValidarExcepcion {
		Map<String, Object> parametros=new HashMap<String, Object>();
		switch (tipoOperacion) {			
			
			case CONSULTA_GENERICA:
				parametros.put(this.getClass().getName()+":validar:toProcesoDocumentos",toProcesoDocumentos);
				break;

			default:
				throw new DValidarExcepcion(getMensajeGeneral("la consulta", "de objetos ProcesoDocumentos"), getMensajeOperInvalida());
		}
		validarParametros("Listar",parametros);
		return true;
	}

	/**
	 * Para copiar el contenido del comando actual al comando enviado como parámetro.
	 * @param comando Comando sobre el cual copiar
	 */
	public void asignar(IDComando comando) {
		if (comando instanceof DCmdSrvConsLstProcesoDocumentos) {
			DCmdSrvConsLstProcesoDocumentos copia = (DCmdSrvConsLstProcesoDocumentos) comando;
			copia.tipoOperacion = tipoOperacion;
			
			copia.objetosProcesoDocumentos = objetosProcesoDocumentos;
			copia.toProcesoDocumentos = toProcesoDocumentos;
		}
	}
}
