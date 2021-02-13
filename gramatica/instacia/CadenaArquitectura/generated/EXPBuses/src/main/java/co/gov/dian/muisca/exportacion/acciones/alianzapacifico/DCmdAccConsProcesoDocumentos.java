/**
 * Republica de Colombia
 * Copyright (c) 2004 Dirección de Impuestos y Aduanas Nacionales.
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
 * <p>Descripcion: Comando de Accion utilizado para consultar un objeto ProcesoDocumentos.</p>
 * <p>Copyright: Copyright (c) 2019</p>
 * <p>Company: DIAN</p>
 *
 * @author gencode
 * @version $Revision:$
 * <pre>
 * $Log[10]:$
 * </pre>
 */
public class DCmdAccConsProcesoDocumentos extends  DComandoAccion {
	private static final long serialVersionUID = 1788506914L; 

	/** Objeto de transporte de ProcesoDocumentos */
	protected DProcesoDocumentosTO toProcesoDocumentos;
	/** Llave primaria de ProcesoDocumentos */
	protected DProcesoDocumentosPKTO pkProcesoDocumentos;
	/** Atributos de ProcesoDocumentos */
	protected DProcesoDocumentosAttTO attProcesoDocumentos;

	/**
	 * Inicializa la consulta por llave primaria.
	 * @param pkProcesoDocumentos Llave primaria de ProcesoDocumentos
	 */
	public void inicializar(DProcesoDocumentosPKTO pkProcesoDocumentos) {
		toProcesoDocumentos = null;
		attProcesoDocumentos = null;
		this.pkProcesoDocumentos = pkProcesoDocumentos;
	}

	/**
	 * Devuelve el objeto ProcesoDocumentos que se haya consultado.
	 * @return Un objeto DProcesoDocumentosTO
	 */
	public DProcesoDocumentosTO getProcesoDocumentos() {
		return toProcesoDocumentos;
	}

	/**
	 * Ejecuta el comando de Accion.
	 * @throws DExcepcion Si ocurre algún error al realizar la
	 * la consulta de ProcesoDocumentos
	 */
	protected void ejecutarComando(){
		throw new UnsupportedOperationException();
	}

	/**
	 * Obtiene una copia (clon) del comando.
	 * @return Un Object con la copia del comando
	 */
	public Object clonar() {
		return new DCmdAccConsProcesoDocumentos();
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
		return "Permite consultar un objeto ProcesoDocumentos";
	}

	/**
	 * Método para validar los parámetros inicializados, invocado
	 * previamente a la ejecución del comando.
	 * @return true si los parámetros son válidos; false de lo contrario
	 * @throws DValidarExcepcion Si los parámetros no son válidos
	 */
	public boolean validar() throws DValidarExcepcion {
		Map<String, Object> parametros=new HashMap<String, Object>();
		parametros.put(this.getClass().getName()+":validar:pkProcesoDocumentos",pkProcesoDocumentos);
		
		parametros.put(this.getClass().getName()+":validar:pkProcesoDocumentos.getIdeTipoProceso()",pkProcesoDocumentos.getIdeTipoProceso());
 	 	parametros.put(this.getClass().getName()+":validar:pkProcesoDocumentos.getIdeDocumentoProcesado()",pkProcesoDocumentos.getIdeDocumentoProcesado());		
		validarParametros("Consulta",parametros);
		return true;
	}

	/**
	 * Para copiar el contenido del comando actual al comando enviado como parámetro.
	 * @param comando Comando sobre el cual copiar
	 */
	public void asignar(IDComando comando) {
		if (comando instanceof DCmdAccConsProcesoDocumentos) {
			DCmdAccConsProcesoDocumentos copia = (DCmdAccConsProcesoDocumentos) comando;
			copia.toProcesoDocumentos = toProcesoDocumentos;
			copia.pkProcesoDocumentos = pkProcesoDocumentos;
			copia.attProcesoDocumentos = attProcesoDocumentos;
		}
	}
}