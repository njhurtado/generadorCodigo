package co.gov.dian.muisca.exportacion.delegados.general;

import co.gov.dian.muisca.arquitectura.general.delegados.DDelegadoAccionesGenerico;
import co.gov.dian.muisca.arquitectura.general.to.segmentacion.DSegmentoAplicacionPKTO;
import co.gov.dian.muisca.arquitectura.web.buses.DContextoSeguridad;

import java.util.List;

/**
 * DDelegadoNegocio : contiene los metodos transversales propios, se utiliza pra evitar replicacion de codigo
 */

public abstract class DDelegadoNegocio extends DDelegadoAccionesGenerico {

    public DDelegadoNegocio( DContextoSeguridad contextoSeguridad, List emisoresComando, DSegmentoAplicacionPKTO pkSegmentoApp ) {
        super( contextoSeguridad, emisoresComando, pkSegmentoApp );
    }
}