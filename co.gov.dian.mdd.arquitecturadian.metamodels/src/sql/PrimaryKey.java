/**
 */
package sql;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primary Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sql.PrimaryKey#getName <em>Name</em>}</li>
 *   <li>{@link sql.PrimaryKey#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @see sql.SqlPackage#getPrimaryKey()
 * @model
 * @generated
 */
public interface PrimaryKey extends CommentedElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see sql.SqlPackage#getPrimaryKey_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link sql.PrimaryKey#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' reference list.
	 * The list contents are of type {@link sql.Column}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' reference list.
	 * @see sql.SqlPackage#getPrimaryKey_Columns()
	 * @model required="true"
	 * @generated
	 */
	EList<Column> getColumns();

} // PrimaryKey
