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
 * <p>Descripcion: Objeto de transporte para los atributos de ProcesoDocumentos.</p>
 * <p>Copyright: Copyright (c) 2019</p>
 * <p>Company: DIAN</p>
 *
 * @author user
 * @version $Revision:$
 * <pre>
 * $Log[10]:$
 * </pre>
 */
public class DProcesoDocumentosAttTO implements IDTO {
		private static final long serialVersionUID = -1231029142L; 

	// Atributos
		private java.lang.String codEstado;		
		private java.lang.String valLogError;		
		private java.sql.Timestamp fecPrimeraEjecucion;		
		private java.sql.Timestamp fecUltimaEjecucion;		
		private java.math.BigInteger numIntentos;		
	
	/**
	 * Construye un nuevo DProcesoDocumentosAttTO por defecto.
	 */
	public DProcesoDocumentosAttTO() { }

	/**
	 * Construye un nuevo DProcesoDocumentosAttTO con los atributos.
		* @param codEstado java.lang.String;
		* @param valLogError java.lang.String;
		* @param fecPrimeraEjecucion java.sql.Timestamp;
		* @param fecUltimaEjecucion java.sql.Timestamp;
		* @param numIntentos java.math.BigInteger;
	 */
	public DProcesoDocumentosAttTO(java.lang.String codEstado,java.lang.String valLogError,java.sql.Timestamp fecPrimeraEjecucion,java.sql.Timestamp fecUltimaEjecucion,java.math.BigInteger numIntentos) {
		setCodEstado(codEstado);
 	 	setValLogError(valLogError);
 	 	setFecPrimeraEjecucion(fecPrimeraEjecucion);
 	 	setFecUltimaEjecucion(fecUltimaEjecucion);
 	 	setNumIntentos(numIntentos);
	}
	
	
	
		/**
	 	* Devuelve el valor de codEstado.
	 	* @return Un objeto java.lang.String 
	 	*/
		public java.lang.String getCodEstado (){
			return codEstado;
		}
		/**
		 * Establece el valor de codEstado.
		 * @param codEstado El nuevo valor de codEstado
		 */
		public void setCodEstado(java.lang.String codEstado) {
			this.codEstado = codEstado;
		}
		
		/**
	 	* Devuelve el valor de valLogError.
	 	* @return Un objeto java.lang.String 
	 	*/
		public java.lang.String getValLogError (){
			return valLogError;
		}
		/**
		 * Establece el valor de valLogError.
		 * @param valLogError El nuevo valor de valLogError
		 */
		public void setValLogError(java.lang.String valLogError) {
			this.valLogError = valLogError;
		}
		
		/**
	 	* Devuelve el valor de fecPrimeraEjecucion.
	 	* @return Un objeto java.sql.Timestamp 
	 	*/
		public java.sql.Timestamp getFecPrimeraEjecucion (){
			return fecPrimeraEjecucion;
		}
		/**
		 * Establece el valor de fecPrimeraEjecucion.
		 * @param fecPrimeraEjecucion El nuevo valor de fecPrimeraEjecucion
		 */
		public void setFecPrimeraEjecucion(java.sql.Timestamp fecPrimeraEjecucion) {
			this.fecPrimeraEjecucion = fecPrimeraEjecucion;
		}
		
		/**
	 	* Devuelve el valor de fecUltimaEjecucion.
	 	* @return Un objeto java.sql.Timestamp 
	 	*/
		public java.sql.Timestamp getFecUltimaEjecucion (){
			return fecUltimaEjecucion;
		}
		/**
		 * Establece el valor de fecUltimaEjecucion.
		 * @param fecUltimaEjecucion El nuevo valor de fecUltimaEjecucion
		 */
		public void setFecUltimaEjecucion(java.sql.Timestamp fecUltimaEjecucion) {
			this.fecUltimaEjecucion = fecUltimaEjecucion;
		}
		
		/**
	 	* Devuelve el valor de numIntentos.
	 	* @return Un objeto java.math.BigInteger 
	 	*/
		public java.math.BigInteger getNumIntentos (){
			return numIntentos;
		}
		/**
		 * Establece el valor de numIntentos.
		 * @param numIntentos El nuevo valor de numIntentos
		 */
		public void setNumIntentos(java.math.BigInteger numIntentos) {
			this.numIntentos = numIntentos;
		}
		
	
	/**
	 * Devuelve una representación en String del objeto.
	 * @return String
	 */
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this);
		
		builder.append("codEstado", getCodEstado());
		builder.append("valLogError", getValLogError());
		builder.append("fecPrimeraEjecucion", getFecPrimeraEjecucion());
		builder.append("fecUltimaEjecucion", getFecUltimaEjecucion());
		builder.append("numIntentos", getNumIntentos());
		return builder.toString();
	}
	
	
}
