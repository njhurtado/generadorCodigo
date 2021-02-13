
/**
 * Republica de Colombia
 * Copyright (c) 2019 DirecciÃƒÂ³n de Impuestos y Aduanas Nacionales.
 * (DIAN - www.dian.gov.co).  Todos los Derechos reservados.
 *
 * $Header:$
 */
package  co.gov.dian.muisca.exportacion.test.alianzapacifico;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Timestamp;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import uk.co.jemos.podam.api.AttributeMetadata;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;
import uk.co.jemos.podam.api.PodamUtils;
import uk.co.jemos.podam.typeManufacturers.IntTypeManufacturerImpl;
import uk.co.jemos.podam.typeManufacturers.LongTypeManufacturerImpl;
import uk.co.jemos.podam.typeManufacturers.TypeManufacturer;


import co.gov.dian.muisca.exportacion.general.to.alianzapacifico.*;


/**
 * <p>Titulo: Proyecto MUISCA</p>
 * <p>Descripcion: Prueba unitaria para ProcesoDocumentos.</p>
 * <p>Copyright: Copyright (c) 2019</p>
 * <p>Company: DIAN</p>
 *
 * @author 
 * @version 
 * <pre>
 
 * </pre>
 */
 @FixMethodOrder(MethodSorters.NAME_ASCENDING)
 public class  DProcesoDocumentosTest  {
 	
 	/** url para apuntar al servlet de pruebas*/
 	private static URL url;
 	/** factory para la librería de mockups*/
	private static PodamFactory factory;
 	/** Objeto de transporte de ProcesoDocumentos */
	private static DProcesoDocumentosTO toProcesoDocumentos;
	
	@BeforeClass
	public static void setUp(){
		try {
			url = new URL("http://10.255.5.9:8080/WebArquitecturaDian/servletTest" );
			factory = new PodamFactoryImpl();
					TypeManufacturer<Integer> manufacturer = new IntTypeManufacturerImpl() {
		        @Override
		        public Integer getInteger(AttributeMetadata attributeMetadata) {
		        	
		        	/*Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		            System.out.println(timestamp);

		            //method 2 - via Date
		            Date date = new Date();
		            System.out.println(new Timestamp(date.getTime()));

		            //return number of milliseconds since January 1, 1970, 00:00:00 GMT
		            System.out.println(timestamp.getTime());*/

		            if (attributeMetadata.getPojoClass() == Timestamp.class) {
		                return PodamUtils.getIntegerInRange(0, 999999999);
		            } else if (attributeMetadata.getPojoClass() == java.math.BigInteger.class) {
		                return PodamUtils.getIntegerInRange(0, 99999999);
		            }
		            else {
		                return  PodamUtils.getIntegerInRange(0, 99999999);//super.getInteger(attributeMetadata);
		            }
		        }
		    };   
		    
		    		    
			TypeManufacturer<Long> manufacturerLong = new LongTypeManufacturerImpl() {
		        @Override
		        public Long getLong(AttributeMetadata attributeMetadata) {
		        	
		        	/*Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		            System.out.println(timestamp);

		            //method 2 - via Date
		            Date date = new Date();
		            System.out.println(new Timestamp(date.getTime()));

		            //return number of milliseconds since January 1, 1970, 00:00:00 GMT
		            System.out.println(timestamp.getTime());*/

		            if (attributeMetadata.getPojoClass() == Timestamp.class) {
		                return (long) PodamUtils.getIntegerInRange(0, 9999999);
		            } else if (attributeMetadata.getPojoClass() == java.math.BigInteger.class) {
		                return (long) PodamUtils.getIntegerInRange(0, 9999999);
		            }
		            else {
		                return  (long) PodamUtils.getIntegerInRange(0, 9999999);//super.getInteger(attributeMetadata);
		            }
		        }
		       
		    }; 
		    
		    factory.getStrategy().addOrReplaceTypeManufacturer(int.class, manufacturer);
		    factory.getStrategy().addOrReplaceTypeManufacturer(Integer.class, manufacturer);
		    factory.getStrategy().addOrReplaceTypeManufacturer(long.class, manufacturerLong);
		    factory.getStrategy().addOrReplaceTypeManufacturer(Long.class, manufacturerLong);
		    
			toProcesoDocumentos = factory.manufacturePojo(DProcesoDocumentosTO.class);
			DProcesoDocumentosPKTO pkProcesoDocumentos = factory.manufacturePojo(DProcesoDocumentosPKTO.class);			
			factory.populatePojo(toProcesoDocumentos);
			toProcesoDocumentos.setPK(pkProcesoDocumentos);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void probar1CrearProcesoDocumentos() {		
			DProcesoDocumentosTO recibido = (DProcesoDocumentosTO)enviarObjeto(toProcesoDocumentos, "crearProcesoDocumentos");
			assertEquals(toProcesoDocumentos.getPK(), recibido.getPK()); 						
	}
	
	@Test
	public void probar2ConsultarProcesoDocumentos() {		
			DProcesoDocumentosTO recibido = (DProcesoDocumentosTO)enviarObjeto(toProcesoDocumentos, "consultarProcesoDocumentos");
			assertNotNull(recibido); 						
	}
	
	@Test
	public void probar3ActualizarProcesoDocumentos() {
			DProcesoDocumentosAttTO attProcesoDocumentos = factory.manufacturePojo(DProcesoDocumentosAttTO.class);
			toProcesoDocumentos.setAtt(attProcesoDocumentos);
			DProcesoDocumentosTO recibido = (DProcesoDocumentosTO)enviarObjeto(toProcesoDocumentos, "actualizarProcesoDocumentos");
			assertEquals(toProcesoDocumentos.getPK(), recibido.getPK()); 						
	}
	
	@Test
	public void probar4EliminarProcesoDocumentos() {
			DProcesoDocumentosAttTO attProcesoDocumentos = factory.manufacturePojo(DProcesoDocumentosAttTO.class);
			toProcesoDocumentos.setAtt(attProcesoDocumentos);
			DProcesoDocumentosTO recibido = (DProcesoDocumentosTO)enviarObjeto(toProcesoDocumentos.getPK(), "eliminarProcesoDocumentos");
			assertNull(recibido); 						
	}
	
	private Object enviarObjeto(Serializable objEnviar, String nombreOperacion) {
		try {
			URLConnection con = url.openConnection(); 
			con.setDoInput(true);
			con.setDoOutput(true);
			con.setUseCaches(false);
			
			// consigue un outputStream
	
			ObjectOutputStream objOut = new ObjectOutputStream(con.getOutputStream());
	
			// escribe el objeto
			objOut.writeObject(nombreOperacion);
			objOut.writeObject(objEnviar);
	
			// cierra el flujo
			objOut.flush();
			objOut.close();
			// con.connect();
	
			ObjectInputStream objIn = new ObjectInputStream(con
					.getInputStream());
	
			try {
				Object recibido = objIn.readObject();
				objIn.close();
				return recibido;
				 
			} catch (ClassNotFoundException ex) {
				ex.printStackTrace();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return null;
	}
		
	
}
 
 
