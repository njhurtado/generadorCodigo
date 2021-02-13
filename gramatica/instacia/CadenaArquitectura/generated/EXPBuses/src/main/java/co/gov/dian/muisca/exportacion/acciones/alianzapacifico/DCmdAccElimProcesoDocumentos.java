/**
 * Republica de Colombia
 * Copyright (c) 2019 DirecciÃ³n de Impuestos y Aduanas Nacionales.
 * (DIAN - www.dian.gov.co).  Todos los Derechos reservados.
 *
 * $Header:$
 */
package co.gov.dian.muisca.exportacion.acciones.alianzapacifico;

import java.util.HashMap;
import java.util.Map;

import co.gov.dian.muisca.arquitectura.general.excepcion.DValidarExcepcion;
import co.gov.dian.muisca.exportacion.general.to.alianzapacifico.DProcesoDocumentosPKTO;
import co.gov.dian.muisca.arquitectura.interfaces.IDComando;
import co.gov.dian.muisca.arquitectura.interfaces.implgenerica.comandos.DComandoAccion;
/**
 * <p>Titulo: Proyecto MUISCA</p>
 * <p>Descripcion: Comando utilizado para Eliminar un objeto ProcesoDocumentos.</p>
 * <p>Copyright: Copyright (c) 2012</p>
 * <p>Company: DIAN</p>
 *
 * @author gencode
 * @version $Revision:$
 * <pre>
 * $Log[10]:$
 * </pre>
 */
public class DCmdAccElimProcesoDocumentos extends DComandoAccion {
	protected DProcesoDocumentosPKTO procesoDocumentosPK;

	public void inicializar(DProcesoDocumentosPKTO procesoDocumentosPK) {
		this.procesoDocumentosPK = procesoDocumentosPK;
	}

	public Object clonar() {
		DCmdAccElimProcesoDocumentos clon = new DCmdAccElimProcesoDocumentos();
		return clon;
	}

	protected void ejecutarComando() {
		throw new UnsupportedOperationException();
	}

	public boolean isAuditable() {
		return true;
	}

	public String getDescripcion() {
		return "Comando de acción que permite eliminar un Usuario por su id";
	}

	public boolean validar() throws DValidarExcepcion {
		Map<String, Object> parametros=new HashMap<String, Object>();
		parametros.put(this.getClass().getName()+":validar:ProcesoDocumentos",procesoDocumentosPK);
		parametros.put(this.getClass().getName()+":validar:ProcesoDocumentosPK.getIdeTipoProceso()",procesoDocumentosPK.getIdeTipoProceso());
 	 	parametros.put(this.getClass().getName()+":validar:ProcesoDocumentosPK.getIdeDocumentoProcesado()",procesoDocumentosPK.getIdeDocumentoProcesado());		
		
		validarParametros("Eliminar",parametros);
		return true;
	}

	public void asignar(IDComando comando) {
		if (comando instanceof DCmdAccElimProcesoDocumentos) {
			DCmdAccElimProcesoDocumentos copia = (DCmdAccElimProcesoDocumentos) comando;
			copia.procesoDocumentosPK = this.procesoDocumentosPK;
		}

	}
}
