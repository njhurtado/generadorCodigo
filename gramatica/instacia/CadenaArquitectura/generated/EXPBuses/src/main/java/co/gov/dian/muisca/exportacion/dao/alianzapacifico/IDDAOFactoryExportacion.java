
/**
 * Republica de Colombia
 * Copyright (c) 2019 Dirección de Impuestos y Aduanas Nacionales.
 * (DIAN - www.dian.gov.co).  Todos los Derechos reservados.
 *
 * $Header:$
 */
package co.gov.dian.muisca.exportacion.dao.alianzapacifico;

import java.util.*;
import co.gov.dian.muisca.arquitectura.interfaces.IDDAOFactory;
import co.gov.dian.muisca.exportacion.dao.alianzapacifico.*;

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
 
 public interface IDDAOFactoryExportacion extends IDDAOFactory {
 
		 /**
		 * Genera un objeto DAO de tipo ProcesoDocumentos
		 *@ return  IDDAOProcesoDocumentos
		 */		  
		  IDDAOProcesoDocumentos getDaoProcesoDocumentos(); 
 	
 	
 }
 
