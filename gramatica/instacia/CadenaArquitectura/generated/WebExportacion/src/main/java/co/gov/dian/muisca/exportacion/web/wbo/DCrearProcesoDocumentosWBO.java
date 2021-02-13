/**
 * Republica de Colombia
 * Copyright (c) 2004 Dirección de Impuestos y Aduanas Nacionales.
 * (DIAN - www.dian.gov.co).  Todos los Derechos reservados.
 *
 * $Header:$
 */
package co.gov.dian.muisca.exportacion.web.wbo.alianzapacifico.exportacion.web.wbo;

import co.gov.dian.muisca.arquitectura.general.excepcion.DMuiscaAppException;
import co.gov.dian.muisca.arquitectura.general.excepcion.errores.tipos.DConfirmacionErrorInfo;
import co.gov.dian.muisca.arquitectura.general.excepcion.errores.tipos.DValidacionWebErrorInfo;
import co.gov.dian.muisca.arquitectura.general.excepcion.mensajes.enums.DMensajesGeneral;
import co.gov.dian.muisca.arquitectura.general.to.gdto.DGenericoDTO;


import co.gov.dian.muisca.exportacion.delegados.DCatalogoDelegados;
import co.gov.dian.muisca.exportacion.delegados.negocio.DDelegadoExportacion;

import co.gov.dian.muisca.exportacion.acciones.alianzapacifico.DCmdAccCrearProcesoDocumentos;

import javax.annotation.PostConstruct;
import javax.faces.model.SelectItem;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

public class DCrearProcesoDocumentosWBO extends  DExportacionBaseWBO {

	private static Logger logger = Logger.getLogger( DProcesoDocumentosWBO.class );
	//private DDelegadoExportacion delegadoExportacion ;
	DCmdAccCrearProcesoDocumentos accCrearProcesoDocumentos;
	private DProcesoDocumentosTO toProcesoDocumentos;
	  
	 
	 
	 
	  
    @PostConstruct
    public void init( ) {
   // delegadoExportacion  = ( DDelegadoExportacion )DCatalogoDelegados.DELEGADO_EXPORTACION.getInstancia( this.getContextoSeguridad( ), this.getNombreCmdProtector( ), this.getPkSegmentoAplicacion( ) );
    //this.dto = new DGenericoDTO( "DExportacionDTO" )
    this.toProcesoDocumentos = new DProcesoDocumentosTO();
    }
    
    public DProcesoDocumentosWBO( ) {
        super( );
    }
    
    
    public void crearProcesoDocumentos( ) {

        logger.debug( "************  Crear ProcesoDocumentos WBO ***********************" );
        try {
  			accCrearProcesoDocumentos = (DCmdAccCrearProcesoDocumentos)getAccion("exportacion.alianzapacifico.DCmdAccCrearProcesoDocumentos"); 
            accCrearProcesoDocumentos.inicializar(this.toProcesoDocumentos);
             accCrearProcesoDocumentos.ejecutar();
            

        }
        catch( DMuiscaAppException ex ) {

            this.verCardUsuario = Boolean.FALSE;
            //Se decide el manejo de la excepcion propagada
            //Manejo de mensajes de excepcion a nivel de JavaServerFaces
            this.notificarUsuarios( ex );
            this.notificarNoUsuarios( ex );
        }

    }
    
    
    
    
    
	 
    /**
    *Retorna obejto DProcesoDocumentosTO
    **/
    public ProcesoDocumentosTO getProcesoDocumentosTO(){
    return this.toProcesoDocumentos;
    }
    
    
	
}