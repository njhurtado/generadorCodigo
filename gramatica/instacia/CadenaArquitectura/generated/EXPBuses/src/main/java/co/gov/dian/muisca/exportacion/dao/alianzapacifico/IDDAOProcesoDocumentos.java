
/**
 * Republica de Colombia
 * Copyright (c) 2019 Dirección de Impuestos y Aduanas Nacionales.
 * (DIAN - www.dian.gov.co).  Todos los Derechos reservados.
 *
 * $Header:$
 */
package co.gov.dian.muisca.exportacion.dao.alianzapacifico;

import java.util.*;
import co.gov.dian.muisca.arquitectura.interfaces.IDDAO;
import co.gov.dian.muisca.exportacion.general.to.alianzapacifico.*;

/**
 * <p>Titulo: Proyecto MUISCA</p>
 * <p>Descripcion: Objeto de acceso a datos para ProcesoDocumentos.</p>
 * <p>Copyright: Copyright (c) 2019</p>
 * <p>Company: DIAN</p>
 *
 * @author 
 * @version 
 * <pre>
 
 * </pre>
 */
 
 public interface IDDAOProcesoDocumentos extends IDDAO {
 
 	static final int CONSULTAR_POR_PK = 0;
	static final int CREAR = 1;
	static final int ACTUALIZAR = 2;
	static final int ELIMINAR = 3;
 	static final int CONSULTA_GENERICA = 4;
			
 	/**
	 * Inicializa la consulta por llave primaria.
	 * @param pkProcesoDocumentos Llave primaria de ProcesoDocumentos
	 */
	void inicializarConsultarPorPK(DProcesoDocumentosPKTO pkProcesoDocumentos);

	/**
	 * Inicializa la creación de ProcesoDocumentos.
	 * @param toProcesoDocumentos Objeto de Transporte de ProcesoDocumentos
	 */
	void inicializarCrear(DProcesoDocumentosTO toProcesoDocumentos);

	/**
	 * Inicializa la actualización de ProcesoDocumentos.
	 * @param toProcesoDocumentos Objeto de Transporte de ProcesoDocumentos
	 */
	void inicializarActualizar(DProcesoDocumentosTO toProcesoDocumentos);

	/**
	 * Inicializa la eliminación de ProcesoDocumentos.
	 * @param pkProcesoDocumentos Llave primaria de ProcesoDocumentos
	 */
	void inicializarEliminar(DProcesoDocumentosPKTO pkProcesoDocumentos);
 
 
 	/**
	 * Inicializa la consulta genérica de ProcesoDocumentos.
	 * @param attProcesoDocumentos Atributos de ProcesoDocumentos
	 */
	void inicializarConsultaGenerica(DProcesoDocumentosTO toProcesoDocumentos);
 	
 	
 	
 	/**
	 * Devuelve el objeto ProcesoDocumentos que se haya consultado.
	 * @return Un objeto DProcesoDocumentosTO
	 */
	DProcesoDocumentosTO getProcesoDocumentos();

	/**
	 * Devuelve la colección de objetos ProcesoDocumentos que se hayan consultado.
	 * @return Un Collection con objetos DProcesoDocumentosTO
	 */
	Collection<DProcesoDocumentosTO> getColeccionProcesoDocumentos();
 
 }
 
