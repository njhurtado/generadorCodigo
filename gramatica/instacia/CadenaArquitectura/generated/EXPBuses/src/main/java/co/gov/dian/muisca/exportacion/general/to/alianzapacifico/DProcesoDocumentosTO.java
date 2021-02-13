/**
 * Republica de Colombia
 * Copyright (c) 2019 Dirección de Impuestos y Aduanas Nacionales.
 * (DIAN - www.dian.gov.co).  Todos los Derechos reservados.
 *
 * $Header:$
 */
package co.gov.dian.muisca.exportacion.general.to.alianzapacifico;


import co.gov.dian.muisca.arquitectura.general.to.IDTO;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.EqualsBuilder;


/**
 * <p>Titulo: Proyecto MUISCA</p>
 * <p>Descripcion: Objeto de transporte para ProcesoDocumentos.</p>
 * <p>Copyright: Copyright (c) 2019</p>
 * <p>Company: DIAN</p>
 *
 * @author user
 * @version $Revision:$
 * <pre>
 * $Log[10]:$
 * </pre>
 */
public class DProcesoDocumentosTO implements IDTO {
		private static final long serialVersionUID = -1231029145L; 
		
		/**
	 * Llave primaria del objeto
	 */
	private DProcesoDocumentosPKTO pk;
	/**
	 * Atributos del objeto
	 */
	private DProcesoDocumentosAttTO att;
	
	/**
	 * Construye un nuevo DProcesoDocumentosTO por defecto.
	 */
	public DProcesoDocumentosTO() {
		this.pk  = new DProcesoDocumentosPKTO();
		this.att = new DProcesoDocumentosAttTO();
	}
	
	/**
	 * Construye un nuevo DProcesoDocumentosTO con la PK y el Att.
	 * @param pk Llave primaria
	 * @param att Atributos
	 */
	public DProcesoDocumentosTO(DProcesoDocumentosPKTO pk, DProcesoDocumentosAttTO att) {
		this.pk = pk;
		this.att = att;
	}

/**
	 * Devuelve la llave primaria del objeto.
	 * @return Un objeto ProcesoDocumentosPKTO
	 */
	public DProcesoDocumentosPKTO getPK() {
		return pk;
	}

	/**
	 * Devuelve los atributos del objeto.
	 * @return Un objeto DProcesoDocumentosAttTO
	 */
	public DProcesoDocumentosAttTO getAtt() {
		return att;
	}

	/**
	 * Establece la llave primaria del objeto.
	 * @param pk Llave primaria
	 */
	public void setPK(DProcesoDocumentosPKTO pk) {
		this.pk = pk;
	}

	/**
	 * Establece los atributos del objeto.
	 * @param att Atributos
	 */
	public void setAtt(DProcesoDocumentosAttTO att) {
		this.att = att;
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
		if (!(objeto instanceof DProcesoDocumentosTO)) {
			return false;
		}
		DProcesoDocumentosTO otro = (DProcesoDocumentosTO) objeto;
		EqualsBuilder builder = new EqualsBuilder();
		return builder.append(this.getPK(), otro.getPK()).isEquals();
	}

	/**
	 * Devuelve el hash code del objeto.
	 * @return int
	 */
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		return builder.append(getPK()).toHashCode();
	}

	/**
	 * Devuelve una representación en String del objeto.
	 * @return String
	 */
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this);
		builder.append("LLAVE PRIMARIA", getPK());
		builder.append("ATRIBUTOS", getAtt());
		return builder.toString();
	}
	
	
}
