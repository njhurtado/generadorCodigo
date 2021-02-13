
/**
 * Republica de Colombia
 * Copyright (c) 2019 Dirección de Impuestos y Aduanas Nacionales.
 * (DIAN - www.dian.gov.co).  Todos los Derechos reservados.
 *
 * $Header:$
 */
package co.gov.dian.muisca.exportacion.dao.alianzapacifico.impl.oracle;

import java.util.*;
import co.gov.dian.muisca.exportacion.general.to.alianzapacifico.*;
import co.gov.dian.muisca.exportacion.dao.alianzapacifico.*;
import co.gov.dian.muisca.exportacion.dao.alianzapacifico.impl.oracle.*;
import co.gov.dian.muisca.arquitectura.general.persistencia.dao.DDAOFactory;

/**
 * <p>Titulo: Proyecto MUISCA</p>
 * <p>Descripcion: Fabrica de Objetos de acceso a datos para Exportacion.</p>
 * <p>Copyright: Copyright (c) 2019</p>
 * <p>Company: DIAN</p>
 *
 * @author 
 * @version 
 * <pre>
 
 * </pre>
 */
 
 public class DDAOFactoryExportacion extends DDAOFactory implements IDDAOFactoryExportacion {
 
		/**
		 * Genera un nuevo objeto DAO de tipo ProcesoDocumentos
		 * @ return  IDDAOProcesoDocumentos
		 */			  
		  public IDDAOProcesoDocumentos getDaoProcesoDocumentos() {
		  		return new DDAOProcesoDocumentos();
		  } 
 	
 	
 }
 
