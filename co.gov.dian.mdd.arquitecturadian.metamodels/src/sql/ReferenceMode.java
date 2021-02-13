/**
 */
package sql;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Mode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sql.ReferenceMode#getRefs <em>Refs</em>}</li>
 * </ul>
 *
 * @see sql.SqlPackage#getReferenceMode()
 * @model
 * @generated
 */
public interface ReferenceMode extends Annotation {
	/**
	 * Returns the value of the '<em><b>Refs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refs</em>' attribute.
	 * @see #setRefs(String)
	 * @see sql.SqlPackage#getReferenceMode_Refs()
	 * @model
	 * @generated
	 */
	String getRefs();

	/**
	 * Sets the value of the '{@link sql.ReferenceMode#getRefs <em>Refs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refs</em>' attribute.
	 * @see #getRefs()
	 * @generated
	 */
	void setRefs(String value);

} // ReferenceMode
