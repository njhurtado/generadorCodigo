
/**
 * Republica de Colombia
 * Copyright (c) 2004 Direcci�n de Impuestos y Aduanas Nacionales.
 * (DIAN - www.dian.gov.co).  Todos los Derechos reservados.
 *
 * $Header:$
 */
package co.gov.dian.muisca.exportacion.servicios.alianzapacifico;

import java.util.*;

import co.gov.dian.muisca.exportacion.general.to.alianzapacifico.DProcesoDocumentosPKTO;
import co.gov.dian.muisca.arquitectura.general.excepcion.*;
import co.gov.dian.muisca.arquitectura.interfaces.*;
import co.gov.dian.muisca.arquitectura.interfaces.implgenerica.comandos.*;


/**
 * <p>Titulo: Proyecto MUISCA</p>
 * <p>Descripcion: Comando de servicio utilizado para eliminar un objeto ProcesoDocumentos.</p>
 * <p>Copyright: Copyright (c) 2019</p>
 * <p>Company: DIAN</p>
 *
 * @author gen code
 * @version $Revision:$
 * <pre>
 * $Log[10]:$
 * </pre>
 */
public class DCmdSrvElimProcesoDocumentos extends DComandoServicioInterno {
	private static final long serialVersionUID = 1522321546L; 

	/** Llave primaria de ProcesoDocumentos */
	protected DProcesoDocumentosPKTO pkProcesoDocumentos;

	/**
	 * Inicializa la eliminaci�n de ProcesoDocumentos.
	 * @param pkProcesoDocumentos Llave primaria de ProcesoDocumentos
	 */
	public void inicializar(DProcesoDocumentosPKTO pkProcesoDocumentos) {
		this.pkProcesoDocumentos = pkProcesoDocumentos;
	}

	/**
	 * Ejecuta el comando de servicio.
	 * @throws DExcepcion Si ocurre alg�n error al realizar la
	 * la eliminaci�n de ProcesoDocumentos
	 */
	protected void ejecutarComando() throws DExcepcion {
		throw new UnsupportedOperationException();
	}

	/**
	 * Obtiene una copia (clon) del comando.
	 * @return Un Object con la copia del comando
	 */
	public Object clonar() {
		return new DCmdSrvElimProcesoDocumentos();
	}

	/**
	 * Indica si el comando es auditable.
	 * @return true si el comando es auditable; false de lo contrario
	 */
	public boolean isAuditable() {
		return true;
	}

	/**
	 * Obtiene la descripci�n del comando.
	 * @return Un String con la descripci�n del comando
	 */
	public String getDescripcion() {
		return "Permite eliminar un objeto ProcesoDocumentos";
	}

	/**
	 * M�todo para validar los par�metros inicializados, invocado
	 * previamente a la ejecuci�n del comando.
	 * @return true si los par�metros son v�lidos; false de lo contrario
	 * @throws DValidarExcepcion Si los par�metros no son v�lidos
	 */
	public boolean validar() throws DValidarExcepcion {
		Map<String, Object> parametros=new HashMap<String, Object>();
		parametros.put(this.getClass().getName()+":validar:pkProcesoDocumentos",pkProcesoDocumentos);
		parametros.put(this.getClass().getName()+":validar:pkProcesoDocumentos.getIdeTipoProceso()",pkProcesoDocumentos.getIdeTipoProceso());
 	 	parametros.put(this.getClass().getName()+":validar:pkProcesoDocumentos.getIdeDocumentoProcesado()",pkProcesoDocumentos.getIdeDocumentoProcesado());		
		
		validarParametros("Eliminar",parametros);
		return true;
	}

	/**
	 * Para copiar el contenido del comando actual al comando enviado como par�metro.
	 * @param comando Comando sobre el cual copiar
	 */
	public void asignar(IDComando comando) {
		if (comando instanceof DCmdSrvElimProcesoDocumentos) {
			DCmdSrvElimProcesoDocumentos copia = (DCmdSrvElimProcesoDocumentos) comando;
			copia.pkProcesoDocumentos = pkProcesoDocumentos;
		}
	}
}



