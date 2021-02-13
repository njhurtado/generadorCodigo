
package co.gov.dian.muisca.exportacion.delegados.negocio;
import co.gov.dian.muisca.arquitectura.general.constantes.IDConstantesLugares;
import co.gov.dian.muisca.arquitectura.general.excepcion.DExcepcion;
import co.gov.dian.muisca.arquitectura.general.excepcion.DMuiscaAppException;
import co.gov.dian.muisca.arquitectura.general.excepcion.errores.tipos.DConfirmacionErrorInfo;
import co.gov.dian.muisca.arquitectura.general.excepcion.errores.tipos.DIrrecuperableErrorInfo;
import co.gov.dian.muisca.arquitectura.general.excepcion.errores.tipos.DValidacionWebErrorInfo;
import co.gov.dian.muisca.arquitectura.general.excepcion.mensajes.enums.DMensajesGeneral;
import co.gov.dian.muisca.arquitectura.general.formateador.implgenerica.DFechaHora;
import co.gov.dian.muisca.arquitectura.general.to.gdto.DGenericoDTO;
import co.gov.dian.muisca.arquitectura.general.to.segmentacion.DSegmentoAplicacionPKTO;
import co.gov.dian.muisca.arquitectura.general.to.tablasbasicas.DLugarAttTO;
import co.gov.dian.muisca.arquitectura.general.to.tablasbasicas.DLugarPKTO;
import co.gov.dian.muisca.arquitectura.general.to.tablasbasicas.DLugarTO;
import co.gov.dian.muisca.arquitectura.general.to.tablasbasicas.DValorDominioAttTO;
import co.gov.dian.muisca.arquitectura.web.buses.DContextoSeguridad;
import co.gov.dian.muisca.exportacion.acciones.*;
import co.gov.dian.muisca.exportacion.delegados.general.DDelegadoNegocio;
import org.apache.log4j.Logger;
import co.gov.dian.muisca.arquitectura.acciones.valoresdominio.DCmdAccConsValorDominio;
import co.gov.dian.muisca.arquitectura.acciones.tablasbasicas.DCmdAccConsLugares;

import java.util.*;

/**
 * Clase delegada concreta a un aspecto de negocio su nombramiento es DDelegadoNegocio en este caso
 * Auditoria
 */
public class DDelegadoExportacion extends DDelegadoNegocio {

    private static Logger logger = Logger.getLogger(  DDelegadoExportacion.class );

    public  DDelegadoExportacion( DContextoSeguridad contextoSeguridad, List emisoresComando, DSegmentoAplicacionPKTO pkSegmentoApp ) {
        super( contextoSeguridad, emisoresComando, pkSegmentoApp );
    }

   
//PROCESO_DOCUMENTOS

 public DGenericoDTO buscarProcesoDocumentos( DGenericoDTO dto ) throws DMuiscaAppException {

    /*    try {

            //Busqueda de la Persona en el RUT
            DCmdAccConstProcesoDocumentos accProcesoDocumentos = ( DCmdAccProcesoDocumentos)this.getAccion( "exportacion.DCmdAccProcesoDocumentos" );
            accProcesoDocumentos.inicializarListarProcesoDocumentos( dto );
            accProcesoDocumentos.ejecutar( );
            dto = accProcesoDocumentos.getDto( );

        }
        catch( DExcepcion ex ) {
            String error = String.format( "Error - Las Acción [ %s ] tiene un Problema de Ejecuci�n - Parametros:", "DCmdAccConsProcesoDocumentos", dto.toString( ) );
            throw new DMuiscaAppException( ex, new DIrrecuperableErrorInfo( error, DMensajesGeneral.ERROR_ACCION ) );
        }

        return dto;
    */
    return new DGenericoDTO( "DProcesoDocumentosDTO" );
}


 public DGenericoDTO crearProcesoDocumentos( DGenericoDTO dto ) throws DMuiscaAppException {

        logger.debug( "************  crearProcesoDocumentos   ***********************" );

        //Se genera la creacion del ProcesoDocumentos
      /*  try {
            DCmdAccProcesoDocumentos accProcesoDocumentos = ( DCmdAccProcesoDocumentos )this.getAccion( "exportacion.DCmdAccProcesoDocumentos" );
            accProcesoDocumentos.inicializarCrearProcesoDocumentos( dto );
            accProcesoDocumentos.ejecutar( );
            dto = accProcesoDocumentos.getDto( );
        }
        catch( DExcepcion ex ) {
            String error = String.format( "Las Acción [ %s ] tiene un Problema de Ejecución :  - Parametros : [idPersonaRut = %s]", "crearProcesoDocumentosMuisca", ex.getMensajeDetallado( ), dto.getLongValue( "idPersonaRut" ) );
            DMuiscaAppException musicaException = new DMuiscaAppException( ex, new DIrrecuperableErrorInfo( error, DMensajesGeneral.ERROR_ACCION ) );
            String errorWeb = String.format( "Error Irrecuperable en el Servicio de Creacion de ProcesoDocumentos Muisca, por favor comunicarse al area de soporte tecnol�gico de la entidad [ Codigo de Error :  ]", DMensajesGeneral.ERROR_ACCION );
            musicaException.getErrors( ).add( new DValidacionWebErrorInfo( errorWeb, DMensajesGeneral.ERROR_ACCION ) );
            throw musicaException;
        }

        return dto;*/
		return new DGenericoDTO( "DProcesoDocumentosDTO" );
    }
    
    
     public DGenericoDTO borrarProcesoDocumentos( DGenericoDTO dto ) throws DMuiscaAppException {

        logger.debug( "************  borrarProcesoDocumentosMuisca  ***********************" );

        //Se genera la habilitacion de la cuenta Muisca
       /* try {
            DCmdAccProcesoDocumentos accProcesoDocumentos = ( DCmdAccProcesoDocumentos )this.getAccion( "exportacion.DCmdAccProcesoDocumentos" );
            accProcesoDocumentos.inicializarBorrarProcesoDocumentos( dto );
            accProcesoDocumentos.ejecutar( );
            dto = accProcesoDocumentos.getDto( );

        }
        catch( DExcepcion ex ) {

            String error = String.format( "Las Acción [ %s ] tiene un Problema de Ejecución : - Parametros : [idPersonaRut = %s]", "borrarProcesoDocumentosMuisca", ex.getMensajeDetallado( ), dto.getLongValue( "idPersonaRut" ) );
            DMuiscaAppException musicaException = new DMuiscaAppException( ex, new DIrrecuperableErrorInfo( error, DMensajesGeneral.ERROR_ACCION ) );
            String errorWeb = String.format( "Error Irrecuperable en el Servicio de Eliminacion de ProcesoDocumentos Muisca, por favor comunicarse al area de soporte tecnológico de la entidad [ Codigo de Error :  ]", DMensajesGeneral.ERROR_ACCION );
            musicaException.getErrors( ).add( new DValidacionWebErrorInfo( errorWeb, DMensajesGeneral.ERROR_ACCION ) );
            throw musicaException;
        }

        return dto;*/
        return new DGenericoDTO( "DProcesoDocumentosDTO" );

    }

    public DGenericoDTO actualizarProcesoDocumentos( DGenericoDTO dto ) throws DMuiscaAppException {

        logger.debug( "************  actualizarProcesoDocumentosMuisca   ***********************" );

        //Se genera la habilitacion de la cuenta Muisca
     /*   try {

            DCmdAccProcesoDocumentos accProcesoDocumentos = ( DCmdAccProcesoDocumentos )this.getAccion( "exportacion.DCmdAccProcesoDocumentos" );
            accProcesoDocumentos.inicializarActualizarProcesoDocumentos( dto );
            accProcesoDocumentos.ejecutar( );
            dto = accProcesoDocumentos.getDto( );
        }
        catch( DExcepcion ex ) {
            String error = String.format( "Las Acción [ %s ] tiene un Problema de Ejecución :  - Parametros : [idPersonaRut = %s]", "actualizarProcesoDocumentosMuisca", ex.getMensajeDetallado( ), dto.getLongValue( "idPersonaRut" ) );
            DMuiscaAppException musicaException = new DMuiscaAppException( ex, new DIrrecuperableErrorInfo( error, DMensajesGeneral.ERROR_ACCION ) );
            String errorWeb = String
                    .format( "Error Irrecuperable en el Servicio de actualizacion de ProcesoDocumentos Muisca, por favor comunicarse al area de soporte tecnol�gico de la entidad [ Codigo de Error :  ]", DMensajesGeneral.ERROR_ACCION );
            musicaException.getErrors( ).add( new DValidacionWebErrorInfo( errorWeb, DMensajesGeneral.ERROR_ACCION ) );
            throw musicaException;
        }*/

        //Lanzamiento de una Excepcion de Confirmacion - Funcionamiento Correcto de la funcion

        String confirmacion = String.format( "Se ha Actualizado el ProcesoDocumentos MUISCA con Identificación: [ %s ] - Usuario: ", dto.getLongValue( "numNit" ), dto.getStringValue( "nomRazonSocial" ) );
        throw new DMuiscaAppException( new DConfirmacionErrorInfo( confirmacion, DMensajesGeneral.ERROR_CAPA_PRESENTACION ) );

    }
   


   

   

    // ------- Metodos Privados -- Trabajar con los servicios :)

    private List<DGenericoDTO> consultaLugares( Integer tipoLugar, Integer codLugarPadre ) throws DExcepcion {
        List<DGenericoDTO> lstLugares = new ArrayList<DGenericoDTO>( );

        DCmdAccConsLugares cmdConsLugares = ( DCmdAccConsLugares )getAccion( "arquitectura.tablasbasicas.DCmdAccConsLugares" );

        DLugarPKTO pkLugar = new DLugarPKTO( );
        DLugarAttTO attLugar = new DLugarAttTO( );
        attLugar.setCodigoTipoLugar( tipoLugar );
        DLugarTO toLugar = new DLugarTO( pkLugar, attLugar );

        if( codLugarPadre != null ) { //Si el codLugarPadre existe se consulta por jerarquia
            pkLugar.setCodigo( codLugarPadre );
            cmdConsLugares.inicializarConsultaJerarquia( toLugar );
        }
        else { // sino se consultan todos los lugares de ese tipo
            cmdConsLugares.inicializarConsultaGenerica( toLugar );
        }
        cmdConsLugares.ejecutar( );

        Collection colLugares = cmdConsLugares.getLugares( );
        if( colLugares != null && !colLugares.isEmpty( ) ) {
            Iterator it = colLugares.iterator( );
            DLugarTO lugaresTo;
            while( it.hasNext( ) ) {
                lugaresTo = ( DLugarTO )it.next( );
                DGenericoDTO lugarGenerico = new DGenericoDTO( lugaresTo.getLugarPK( ).getCodigo( ).toString( ) );
                lugarGenerico.addInteger( "codigo", lugaresTo.getLugarPK( ).getCodigo( ) );
                lugarGenerico.addString( "nombre", lugaresTo.getLugarAtt( ).getNombre( ) );

                lstLugares.add( lugarGenerico );
            }
        }
        return lstLugares;
    }
    
     public DGenericoDTO buscarTiposDocumentos( DGenericoDTO dto ) throws DMuiscaAppException {

        logger.debug( "************  buscarTiposDocumentos ***********************" );
        try {
            DCmdAccConsValorDominio valorDominio = ( DCmdAccConsValorDominio )this.getAccion( "arquitectura.valoresdominio.DCmdAccConsValorDominio" );

            DValorDominioAttTO valorAtt = new DValorDominioAttTO( );
            //Valor Dominio para tipos de documento
            valorAtt.setCodDominio( 109 );
            //Se coloca la fecha actual para que cargue los valores de acuerdo a la vigencia
            Integer fecActual = DFechaHora.convertirDateToInteger( new Date( ) );
            valorAtt.setFechaDesde( fecActual );
            valorAtt.setFechaHasta( fecActual );
            valorDominio.inicializarConsultaPorATT( valorAtt );
            valorDominio.ejecutar( );
            Collection dominioCollection = valorDominio.getValoresDominio( );

            List dominiosList = dominioCollection instanceof List ? ( List )dominioCollection : new ArrayList( dominioCollection );
            dto.addList( "tiposIdentList", dominiosList );

        }
        catch( DExcepcion ex ) {
            String error = String.format( "Error Accion:] La Accion :  %s tiene una problema de Ejecucion", "" );
            throw new DMuiscaAppException( ex, new DIrrecuperableErrorInfo( error, DMensajesGeneral.ERROR_ACCION ) );
        }

        return dto;

    }

    public DGenericoDTO buscarPaises( DGenericoDTO dto ) throws DMuiscaAppException {

        logger.debug( "************  buscarPaises ***********************" );
        try {
            dto.addList( "lstPaises", consultaLugares( IDConstantesLugares.VALOR_DOMINIO_PAISES, null ) );
        }
        catch( DExcepcion ex ) {
            String error = String.format( "Error Accion:] La Accion :  %s tiene una problema de Ejecucion", "" );
            throw new DMuiscaAppException( ex, new DIrrecuperableErrorInfo( error, DMensajesGeneral.ERROR_ACCION ) );
        }
        return dto;
    }

    protected static final Integer CODIGO_COLOMBIA = new Integer( 1071043 );

    public DGenericoDTO buscarDepartamentos( DGenericoDTO dto ) throws DMuiscaAppException {

        logger.debug( "************  buscarDepartamentos ***********************" );
        try {
            dto.addList( "lstDepartamentos", consultaLugares( IDConstantesLugares.VALOR_DOMINIO_DEPARTAMENTOS, CODIGO_COLOMBIA ) );

        }
        catch( DExcepcion ex ) {
            String error = String.format( "Error Accion:] La Accion :  %s tiene una problema de Ejecucion", "" );
            throw new DMuiscaAppException( ex, new DIrrecuperableErrorInfo( error, DMensajesGeneral.ERROR_ACCION ) );
        }

        return dto;
    }

    public DGenericoDTO buscarMunicipios( DGenericoDTO dto ) throws DMuiscaAppException {
        logger.debug( "************  buscarMunicipios ***********************" );
        try {
            dto.addList( "lstMunicipios", consultaLugares( IDConstantesLugares.VALOR_DOMINIO_MUNICIPIOS, dto.getIntegerValue( "idDepartamento" ) ) );

        }
        catch( DExcepcion ex ) {
            String error = String.format( "Error Accion:] La Accion :  %s tiene una problema de Ejecucion", "" );
            throw new DMuiscaAppException( ex, new DIrrecuperableErrorInfo( error, DMensajesGeneral.ERROR_ACCION ) );
        }

        return dto;
    }

}