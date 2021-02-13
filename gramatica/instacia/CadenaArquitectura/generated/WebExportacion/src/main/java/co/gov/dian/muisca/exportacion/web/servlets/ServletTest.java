
/**
 * Republica de Colombia
 * Copyright (c) 2019 Dirección de Impuestos y Aduanas Nacionales.
 * (DIAN - www.dian.gov.co).  Todos los Derechos reservados.
 *
 * $Header:$
 */
package co.gov.dian.muisca.exportacion.web.servlets;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import co.gov.dian.muisca.arquitectura.general.delegados.DBusDelegateFactory;
import co.gov.dian.muisca.arquitectura.general.excepcion.DExcepcion;
import co.gov.dian.muisca.arquitectura.general.excepcion.DSeguridadExcepcion;
import co.gov.dian.muisca.arquitectura.interfaces.IDBusAccionesDelegate;
import co.gov.dian.muisca.arquitectura.interfaces.IDBusDelegateFactory;
import co.gov.dian.muisca.arquitectura.interfaces.IDComando;
import co.gov.dian.muisca.arquitectura.interfaces.implgenerica.comandos.DComandoAccion;
import co.gov.dian.muisca.arquitectura.web.buses.DAccesoSeguridad;
import co.gov.dian.muisca.arquitectura.web.buses.DContextoSeguridad;
import co.gov.dian.muisca.exportacion.general.to.alianzapacifico.*;
import co.gov.dian.muisca.exportacion.acciones.alianzapacifico.*;

import co.gov.dian.muisca.automatizacion.buses.DBusAccionesDelegateAUTTxNueva;

/**
 * <p>Titulo: Proyecto MUISCA</p>
 * <p>Descripcion: Cervlet para pruebas de Exportacion.</p>
 * <p>Copyright: Copyright (c) 2019</p>
 * <p>Company: DIAN</p>
 *
 * @author 
 * @version 
 * <pre>
 
 * </pre>
 */
 
 public class ServletTest extends HttpServlet { 
 
 /**
	 * 
	 */
	private static final long serialVersionUID = -4227816447245462992L;
	
	private static final String CONTENT_TYPE = "text/html";
    public static final int COD_TIPO_MENSAJE = 12;
    public static final int COD_SUBTIPO_MENSAJE = 12;

    private static Logger logger = Logger.getLogger(ServletTest.class);

    //Initialize global variables
    public void init() throws ServletException {
    }

    //Process the HTTP Get request
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
    	try {    		
    		InputStream in = request.getInputStream();
            ObjectInputStream ois = new ObjectInputStream(in);
            
           
            // Leer la acción
            String oper = (String) ois.readObject();
            
            
	        String operacion = request.getParameter("operacion");
	        
	        if(operacion == null) {
	        	operacion = oper;
	        }
	        
	        ObjectOutputStream miOut = new ObjectOutputStream(response.getOutputStream());
		
			if ("crearProcesoDocumentos".equalsIgnoreCase(operacion)) {
	        	DProcesoDocumentosTO toProcesoDocumentos = (DProcesoDocumentosTO)ois.readObject();
	            crearProcesoDocumentos(toProcesoDocumentos);
	            DProcesoDocumentosTO toProcesoDocumentosConsultado = consultarProcesoDocumentos(toProcesoDocumentos.getPK());
	            miOut.writeObject(toProcesoDocumentosConsultado);	            
	        } 
	        if ("consultarProcesoDocumentos".equalsIgnoreCase(operacion)) {
	        	DProcesoDocumentosTO toProcesoDocumentos = (DProcesoDocumentosTO)ois.readObject();
	            DProcesoDocumentosTO toProcesoDocumentosConsultado = consultarProcesoDocumentos(toProcesoDocumentos.getPK());
	            miOut.writeObject(toProcesoDocumentosConsultado);	            
	        } 
	        if ("actualizarProcesoDocumentos".equalsIgnoreCase(operacion)) {
	        	DProcesoDocumentosTO toProcesoDocumentos = (DProcesoDocumentosTO)ois.readObject();
	        	actualizarProcesoDocumentos(toProcesoDocumentos);
	            DProcesoDocumentosTO toProcesoDocumentosConsultado = consultarProcesoDocumentos(toProcesoDocumentos.getPK());
	            miOut.writeObject(toProcesoDocumentosConsultado);	            
	        } 
	        if ("eliminarProcesoDocumentos".equalsIgnoreCase(operacion)) {
	        	DProcesoDocumentosPKTO pkProcesoDocumentos = (DProcesoDocumentosPKTO)ois.readObject();
	        	eliminarProcesoDocumentos(pkProcesoDocumentos);
	            DProcesoDocumentosTO toProcesoDocumentosConsultado = consultarProcesoDocumentos(pkProcesoDocumentos);
	            miOut.writeObject(toProcesoDocumentosConsultado);	            
	        }
 
	        miOut.flush();
            miOut.close();
	        
	        response.setContentType(CONTENT_TYPE);
        
    	} catch (Exception ex) {
    		ex.printStackTrace();
    	}
    }

   public void doPost(HttpServletRequest request, HttpServletResponse response)
   throws ServletException, IOException {
       doGet(request, response);
   }


		       
    private DProcesoDocumentosTO crearProcesoDocumentos(DProcesoDocumentosTO toProcesoDocumentos) throws DExcepcion {
    	DCmdAccCrearProcesoDocumentos accion = (DCmdAccCrearProcesoDocumentos)getAccion("exportacion.alianzapacifico.DCmdAccCrearProcesoDocumentos", getAccesoSeguridad(), true);
    	System.out.println("toProcesoDocumentos-->"+toProcesoDocumentos);
    	accion.inicializar(toProcesoDocumentos);
    	accion.ejecutar();
    	return null;
    }
   
    private DProcesoDocumentosTO consultarProcesoDocumentos(DProcesoDocumentosPKTO pkProcesoDocumentos) throws DExcepcion {
    	DCmdAccConsProcesoDocumentos accion = (DCmdAccConsProcesoDocumentos)getAccion("exportacion.alianzapacifico.DCmdAccConsProcesoDocumentos", getAccesoSeguridad(), true);
    	System.out.println("pkProcesoDocumentos-->"+pkProcesoDocumentos);
    	accion.inicializar(pkProcesoDocumentos);
    	accion.ejecutar();
    	return accion.getProcesoDocumentos();    	
    	
    }
    
    private DProcesoDocumentosTO actualizarProcesoDocumentos(DProcesoDocumentosTO toProcesoDocumentos) throws DExcepcion {
    	DCmdAccActProcesoDocumentos accion = (DCmdAccActProcesoDocumentos)getAccion("exportacion.alianzapacifico.DCmdAccActProcesoDocumentos", getAccesoSeguridad(), true);
    	    	System.out.println("toProcesoDocumentos-->"+toProcesoDocumentos);
    	accion.inicializar(toProcesoDocumentos);
    	accion.ejecutar();
    	return null;
    }
    
    private DProcesoDocumentosTO eliminarProcesoDocumentos(DProcesoDocumentosPKTO pkProcesoDocumentos) throws DExcepcion {
    	DCmdAccElimProcesoDocumentos accion = (DCmdAccElimProcesoDocumentos)getAccion("exportacion.alianzapacifico.DCmdAccElimProcesoDocumentos", getAccesoSeguridad(), true);
    	System.out.println("pkProcesoDocumentos-->"+pkProcesoDocumentos);
    	accion.inicializar(pkProcesoDocumentos);
    	accion.ejecutar();
    	return null;
    }
    
    public DComandoAccion getAccion(String unNombreAccion) throws DExcepcion {
    	//DBusAccionesDelegateArq delegado = new DBusAccionesDelegateArq();
    	DBusAccionesDelegateAUTTxNueva delegado = new DBusAccionesDelegateAUTTxNueva();
    	//delegado.setSubsistemaInvocador("informacionextranjera");
		return (DComandoAccion)delegado.getComando(unNombreAccion);
    }
    
    public DComandoAccion getAccion(String unNombreAccion,
			DContextoSeguridad ctx, boolean isTransaccional) throws DExcepcion {
		IDComando miComando;
		IDBusDelegateFactory fac = DBusDelegateFactory.getInstance();
		try {
			IDBusAccionesDelegate miDelegado = fac
					.getDelegadoAcciones(unNombreAccion);
			miDelegado.setContextoSeguridad(ctx);
			miComando = (IDComando) miDelegado.getComando(unNombreAccion,
					isTransaccional);

		} catch (DExcepcion ex) {
			logger.error("Error..getAccion", ex);
			throw ex;
		} catch (Exception ex) {
			logger.error("Error..getAccion", ex);
			throw new DExcepcion(ex);
		}

		return (DComandoAccion) miComando;
	}
    
    private DContextoSeguridad getAccesoSeguridad() throws DExcepcion  {
    	DAccesoSeguridad miAccesoSeguridad = new DAccesoSeguridad();
        DContextoSeguridad ctxSeguridad;
		try {
			ctxSeguridad = miAccesoSeguridad.autenticarUsuario("13000074337297","Prueba2006".getBytes("UTF-8"), 1);
		} catch (DSeguridadExcepcion e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new DExcepcion(e); 
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new DExcepcion(e);
		} catch (DExcepcion e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new DExcepcion(e);
		}        
        return ctxSeguridad;
    }
}

 
