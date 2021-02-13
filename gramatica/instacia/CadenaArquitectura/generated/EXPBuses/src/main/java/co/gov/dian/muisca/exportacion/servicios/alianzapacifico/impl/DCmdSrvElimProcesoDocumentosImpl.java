/**
 * Republica de Colombia
 * Copyright (c) 2004 Dirección de Impuestos y Aduanas Nacionales.
 * (DIAN - www.dian.gov.co).  Todos los Derechos reservados.
 * <p>
 * $Header:$
 */
package co.gov.dian.muisca.exportacion.servicios.alianzapacifico.impl;

import co.gov.dian.muisca.arquitectura.general.excepcion.DExcepcion;
import co.gov.dian.muisca.arquitectura.interfaces.IDAdminPersistencia;
import co.gov.dian.muisca.exportacion.dao.alianzapacifico.impl.oracle.DDAOFactoryExportacion;
import co.gov.dian.muisca.exportacion.dao.alianzapacifico.IDDAOProcesoDocumentos;
import co.gov.dian.muisca.exportacion.dao.alianzapacifico.IDDAOFactoryExportacion;
import co.gov.dian.muisca.exportacion.servicios.alianzapacifico.DCmdSrvElimProcesoDocumentos;


/**
 * <p>Titulo: Proyecto MUISCA</p>
 * <p>Descripcion: Comando de servicio utilizado para eliminar un objeto ProcesoDocumentos.</p>
 * <p>Copyright: Copyright (c) 2012</p>
 * <p>Company: DIAN</p>
 *
 * @author gen code
 * @version $Revision:$
 * <pre>
 * $Log[10]:$
 * </pre>
 */
public class DCmdSrvElimProcesoDocumentosImpl extends DCmdSrvElimProcesoDocumentos {

    private static final long serialVersionUID = -431717317L;

    /**
     * Ejecuta el comando de servicio.
     *
     * @throws DExcepcion Si ocurre algn error al realizar la
     * consulta de ProcesoDocumentos o si el objeto no existe
     */
    protected void ejecutarComando( ) throws DExcepcion {
        IDAdminPersistencia admin = getAdministradorPersistencia( );
        try {
            // Iniciar los DAO's
            IDDAOFactoryExportacion fabrica = new DDAOFactoryExportacion( );
            IDDAOProcesoDocumentos dao = fabrica.getDaoProcesoDocumentos( );

            // Eliminar
            dao.inicializarEliminar( pkProcesoDocumentos );
            admin.eliminar( dao );
        }
        finally {
            admin.cerrarSesion( );
        }
    }
}


