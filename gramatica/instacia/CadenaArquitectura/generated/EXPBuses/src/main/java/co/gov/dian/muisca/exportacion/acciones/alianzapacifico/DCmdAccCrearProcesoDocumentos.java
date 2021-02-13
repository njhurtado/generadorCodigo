/**
 * Republica de Colombia
 * Copyright (c) 2019 Dirección de Impuestos y Aduanas Nacionales.
 * (DIAN - www.dian.gov.co).  Todos los Derechos reservados.
 *
 * $Header:$
 */
package co.gov.dian.muisca.exportacion.acciones.alianzapacifico;

import java.util.*;

import co.gov.dian.muisca.exportacion.general.to.alianzapacifico.DProcesoDocumentosAttTO;
import co.gov.dian.muisca.exportacion.general.to.alianzapacifico.DProcesoDocumentosPKTO;
import co.gov.dian.muisca.exportacion.general.to.alianzapacifico.DProcesoDocumentosTO;
import co.gov.dian.muisca.arquitectura.general.excepcion.*;
import co.gov.dian.muisca.arquitectura.interfaces.*;
import co.gov.dian.muisca.arquitectura.interfaces.implgenerica.comandos.*;

/**
 * <p>Titulo: Proyecto MUISCA</p>
 * <p>Descripcion: Comando de Accion utilizado para Crear un objeto ProcesoDocumentos.</p>
 * <p>Copyright: Copyright (c) 2012</p>
 * <p>Company: DIAN</p>
 *
 * @author gencode
 * @version $Revision:$
 * <pre>
 * $Log[10]:$
 * </pre>
 */
public class DCmdAccCrearProcesoDocumentos extends DComandoAccion {
	private static final long serialVersionUID = -1467262749L; 

	/** Objeto de transporte de ProcesoDocumentos */
	protected DProcesoDocumentosTO toProcesoDocumentos;
	/** Llave primaria de ProcesoDocumentos */
	protected DProcesoDocumentosPKTO pkProcesoDocumentos;
	/** Atributos de ProcesoDocumentos */
	protected DProcesoDocumentosAttTO attProcesoDocumentos;

	/**
	 * Inicializa Crear de ProcesoDocumentos.
	 * @param toProcesoDocumentos Objeto de Transporte de ProcesoDocumentos
	 */
	public void inicializar(DProcesoDocumentosTO toProcesoDocumentos) {
		this.toProcesoDocumentos = toProcesoDocumentos;
		if (toProcesoDocumentos != null) {
			pkProcesoDocumentos = this.toProcesoDocumentos.getPK();
			attProcesoDocumentos = this.toProcesoDocumentos.getAtt();
		}
	}

	/**
	 * Ejecuta el comando de Accion.
	 * @throws DExcepcion Si ocurre algún error al realizar la operación
	 * Crear  de ProcesoDocumentos
	 */
	protected void ejecutarComando(){
		throw new UnsupportedOperationException();
	}

	/**
	 * Obtiene una copia (clon) del comando.
	 * @return Un Object con la copia del comando
	 */
	public Object clonar() {
		return new DCmdAccCrearProcesoDocumentos();
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
		return "Permite Crear un objeto ProcesoDocumentos";
	}

	/**
	 * Método para validar los parámetros inicializados, invocado
	 * previamente a la ejecución del comando.
	 * @return true si los parámetros son válidos; false de lo contrario
	 * @throws DValidarExcepcion Si los parámetros no son válidos
	 */
	public boolean validar() throws DValidarExcepcion {
		Map<String, Object> parametros=new HashMap<String, Object>();
		parametros.put(this.getClass().getName()+":validar:toProcesoDocumentos",toProcesoDocumentos);
		parametros.put(this.getClass().getName()+":validar:pkProcesoDocumentos",pkProcesoDocumentos);
		parametros.put(this.getClass().getName()+":validar:attProcesoDocumentos",attProcesoDocumentos);
		parametros.put(this.getClass().getName()+":validar:pkProcesoDocumentos.getIdeTipoProceso()",pkProcesoDocumentos.getIdeTipoProceso());
 	 	parametros.put(this.getClass().getName()+":validar:pkProcesoDocumentos.getIdeDocumentoProcesado()",pkProcesoDocumentos.getIdeDocumentoProcesado());
		parametros.put(this.getClass().getName()+":validar:attProcesoDocumentos.getCodEstado()",attProcesoDocumentos.getCodEstado());
 	 	parametros.put(this.getClass().getName()+":validar:attProcesoDocumentos.getValLogError()",attProcesoDocumentos.getValLogError());
 	 	parametros.put(this.getClass().getName()+":validar:attProcesoDocumentos.getFecPrimeraEjecucion()",attProcesoDocumentos.getFecPrimeraEjecucion());
 	 	parametros.put(this.getClass().getName()+":validar:attProcesoDocumentos.getFecUltimaEjecucion()",attProcesoDocumentos.getFecUltimaEjecucion());
 	 	parametros.put(this.getClass().getName()+":validar:attProcesoDocumentos.getNumIntentos()",attProcesoDocumentos.getNumIntentos());		
				
		validarParametros("Crear",parametros);
		return true;
	}

	/**
	 * Para copiar el contenido del comando actual al comando enviado como parámetro.
	 * @param comando Comando sobre el cual copiar
	 */
	public void asignar(IDComando comando) {
		if (comando instanceof DCmdAccCrearProcesoDocumentos) {
			DCmdAccCrearProcesoDocumentos copia = (DCmdAccCrearProcesoDocumentos) comando;
			copia.toProcesoDocumentos = toProcesoDocumentos;
			copia.pkProcesoDocumentos = pkProcesoDocumentos;
			copia.attProcesoDocumentos = attProcesoDocumentos;
		}
	}
}
