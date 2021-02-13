
package co.gov.dian.muisca.exportacion.web.wbo;

import co.gov.dian.muisca.arquitectura.general.excepcion.DMuiscaAppException;
import co.gov.dian.muisca.arquitectura.general.excepcion.errores.DErrorInfoBase;
import co.gov.dian.muisca.arquitectura.general.excepcion.errores.tipos.DConfirmacionErrorInfo;
import co.gov.dian.muisca.arquitectura.general.excepcion.errores.tipos.DValidacionWebErrorInfo;
import co.gov.dian.muisca.arquitectura.general.web.DWbo;
import co.gov.dian.muisca.arquitectura.general.to.gdto.DGenericoDTO;

import co.gov.dian.muisca.exportacion.web.general.to.generico.DExportacionWebDTO;


import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.apache.log4j.Logger;

public class DExportacionBaseWBO extends DWbo {

    private static Logger logger = Logger.getLogger( DExportacionBaseWBO.class );
    protected DExportacionWebDTO dtoWeb = new DExportacionWebDTO( "DExportacionWebDTO" );
    protected DGenericoDTO dto;

    //------------ Manejo de Excepciones Propagadas-----------------------------------------

    protected void notificarUsuarios( Throwable ex ) {
        if( ex instanceof DMuiscaAppException ) {
            DMuiscaAppException muiscaException = ( DMuiscaAppException )ex;

            if( muiscaException.getLastError( ) instanceof DValidacionWebErrorInfo ) {
                FacesContext.getCurrentInstance( ).addMessage( null, construirMensajeErrorFaces( muiscaException.getLastError( ) ) );
            }
            else if( muiscaException.getLastError( ) instanceof DConfirmacionErrorInfo ) {
                FacesContext.getCurrentInstance( ).addMessage( null, construirMensajeConfirmacionFaces( muiscaException.getLastError( ) ) );
            }

        }
    }

    protected void notificarNoUsuarios( Throwable ex ) {
        if( ex instanceof DMuiscaAppException ) {
            DMuiscaAppException ae = ( DMuiscaAppException )ex;
            for( DErrorInfoBase error : ae.getErrors( ) ) {
                logger.debug( "Severidad :" + error.getSeverity( ).name( ) );
                logger.debug( "Descripcion :" + error.getErrorText( ) );
                logger.debug( "Codigo Error :" + error.getCode( ).getMessageCode( ) );
                logger.debug( "Parametros :" + error.getParameters( ).toString( ) );
                error.getCause( ).printStackTrace( );
            }
        }
    }

    private FacesMessage construirMensajeErrorFaces( DErrorInfoBase errorInfo ) {
        logger.debug( "Severidad : " + errorInfo.getSeverity( ).name( ) );
        return new FacesMessage( FacesMessage.SEVERITY_ERROR, errorInfo.getSeverity( ).name( ), errorInfo.getErrorText( ) );
    }

    private FacesMessage construirMensajeConfirmacionFaces( DErrorInfoBase errorInfo ) {
        logger.debug( "Severidad : " + errorInfo.getSeverity( ).name( ) );
        return new FacesMessage( FacesMessage.SEVERITY_INFO, errorInfo.getSeverity( ).name( ), errorInfo.getErrorText( ) );
    }

}