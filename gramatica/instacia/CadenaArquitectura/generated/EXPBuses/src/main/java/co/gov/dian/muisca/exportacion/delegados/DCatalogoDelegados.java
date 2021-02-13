package co.gov.dian.muisca.exportacion.delegados;

import co.gov.dian.muisca.arquitectura.general.to.segmentacion.DSegmentoAplicacionPKTO;
import co.gov.dian.muisca.arquitectura.web.buses.DContextoSeguridad;
import co.gov.dian.muisca.exportacion.delegados.general.DDelegadoNegocio;
import co.gov.dian.muisca.exportacion.delegados.negocio.DDelegadoExportacion ;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * Catalogo de los diferentes delegados utilizados en la aplicacion, esto centraliza en un punto
 * las clases delegadas, sirve como generado de instancia.
 */

public enum DCatalogoDelegados {


    DELEGADO_EXPORTACION( DDelegadoExportacion .class );

    private final Class<? extends DDelegadoNegocio> clazz;

    private DCatalogoDelegados( Class<? extends DDelegadoNegocio> clazz ) {
        this.clazz = clazz;
    }

    public Class getClase( ) {
        return this.clazz;
    }

    public DDelegadoNegocio getInstancia( DContextoSeguridad contextoSeguridad, String emisoresComando, Long segmentoApp ) {

        DDelegadoNegocio delegado = null;

        List emisoresList = new ArrayList( );
        emisoresList.add( emisoresComando );

        try {
            delegado = clazz.getConstructor( DContextoSeguridad.class, List.class, DSegmentoAplicacionPKTO.class ).newInstance( contextoSeguridad, emisoresList, segmentoApp != null ? new DSegmentoAplicacionPKTO( segmentoApp ) : null );
        }
        catch( InstantiationException e ) {
            // This should not happen
            assert false;
        }
        catch( IllegalAccessException e ) {
            // This should not happen
            assert false;
        }
        catch( NoSuchMethodException e ) {
            e.printStackTrace( );
        }
        catch( InvocationTargetException e ) {
            e.printStackTrace( );
        }
        return delegado;

    }

}