/**
 * Republica de Colombia
 * Copyright (c) 2019 Dirección de Impuestos y Aduanas Nacionales.
 * (DIAN - www.dian.gov.co).  Todos los Derechos reservados.
 *
 * $Header:$
 */
package co.gov.dian.muisca.exportacion.general.to.alianzapacifico;

import co.gov.dian.muisca.arquitectura.general.to.IDTO;
import org.apache.commons.lang.builder.*;


/**
 * <p>Titulo: Proyecto MUISCA</p>
 * <p>Descripcion: Objeto de transporte para la PK de ProcesoDocumentos.</p>
 * <p>Copyright: Copyright (c) 2019</p>
 * <p>Company: DIAN</p>
 *
 * @author user
 * @version $Revision:$
 * <pre>
 * $Log[10]:$
 * </pre>
 */
public class DProcesoDocumentosPKTO implements IDTO {
		private static final long serialVersionUID = -1231029143L; 

	// Atributos PK
		private java.math.BigInteger ideTipoProceso;		
		private java.math.BigInteger ideDocumentoProcesado;		
	
	/**
	 * Construye un nuevo DProcesoDocumentosPKTO por defecto.
	 */
	public DProcesoDocumentosPKTO() { }

	/**
	 * Construye un nuevo DProcesoDocumentosPKTO con los atributos.
		* @param ideTipoProceso java.math.BigInteger;
		* @param ideDocumentoProcesado java.math.BigInteger;
	 */
	public DProcesoDocumentosPKTO(java.math.BigInteger ideTipoProceso,java.math.BigInteger ideDocumentoProcesado) {
		setIdeTipoProceso(ideTipoProceso);
 	 	setIdeDocumentoProcesado(ideDocumentoProcesado);
	}
	
	
	
		/**
	 	* Devuelve el valor de ideTipoProceso.
	 	* @return Un objeto java.math.BigInteger 
	 	*/
		public java.math.BigInteger getIdeTipoProceso (){
			return ideTipoProceso;
		}
		/**
		 * Establece el valor de ideTipoProceso.
		 * @param ideTipoProceso El nuevo valor de ideTipoProceso
		 */
		public void setIdeTipoProceso(java.math.BigInteger ideTipoProceso) {
			this.ideTipoProceso = ideTipoProceso;
		}
		
		/**
	 	* Devuelve el valor de ideDocumentoProcesado.
	 	* @return Un objeto java.math.BigInteger 
	 	*/
		public java.math.BigInteger getIdeDocumentoProcesado (){
			return ideDocumentoProcesado;
		}
		/**
		 * Establece el valor de ideDocumentoProcesado.
		 * @param ideDocumentoProcesado El nuevo valor de ideDocumentoProcesado
		 */
		public void setIdeDocumentoProcesado(java.math.BigInteger ideDocumentoProcesado) {
			this.ideDocumentoProcesado = ideDocumentoProcesado;
		}
		
	
	/**
	 * Devuelve una representación en String del objeto.
	 * @return String
	 */
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this);
		
		builder.append("ideTipoProceso", getIdeTipoProceso());
		builder.append("ideDocumentoProcesado", getIdeDocumentoProcesado());
		return builder.toString();
	}
	
	
	/**
     * Compara el objeto actual con el objeto especificado.
     * @param objeto Objeto con el cual se compara
     * @return true si los objetos son iguales; false de lo contrario
     */
     public boolean equals(Object objeto) {
           if (this == objeto) {
                 return true;
           }
           if (!(objeto instanceof DProcesoDocumentosPKTO)) {
                 return false;
           }
           DProcesoDocumentosPKTO otro = (DProcesoDocumentosPKTO) objeto;
           EqualsBuilder builder = new EqualsBuilder();       
           
           
		builder.append(getIdeTipoProceso(),  otro.getIdeTipoProceso());
		builder.append(getIdeDocumentoProcesado(),  otro.getIdeDocumentoProcesado());
           
           return builder.isEquals();
     }

     /**
     * Devuelve el hash code del objeto.
     * @return int
     */
     public int hashCode() {
           HashCodeBuilder builder = new HashCodeBuilder();
		builder.append( getIdeTipoProceso());
		builder.append( getIdeDocumentoProcesado());
           return builder.toHashCode();
           
           
     }
	
	
}
