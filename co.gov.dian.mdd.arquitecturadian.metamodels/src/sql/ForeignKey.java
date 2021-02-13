/**
 */
package sql;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sql.ForeignKey#getLocalColumns <em>Local Columns</em>}</li>
 *   <li>{@link sql.ForeignKey#getForeignTable <em>Foreign Table</em>}</li>
 *   <li>{@link sql.ForeignKey#getForeignColumns <em>Foreign Columns</em>}</li>
 *   <li>{@link sql.ForeignKey#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see sql.SqlPackage#getForeignKey()
 * @model
 * @generated
 */
public interface ForeignKey extends AnnotedElement {
	/**
	 * Returns the value of the '<em><b>Local Columns</b></em>' reference list.
	 * The list contents are of type {@link sql.Column}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Columns</em>' reference list.
	 * @see sql.SqlPackage#getForeignKey_LocalColumns()
	 * @model required="true"
	 * @generated
	 */
	EList<Column> getLocalColumns();

	/**
	 * Returns the value of the '<em><b>Foreign Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Table</em>' reference.
	 * @see #setForeignTable(Table)
	 * @see sql.SqlPackage#getForeignKey_ForeignTable()
	 * @model
	 * @generated
	 */
	Table getForeignTable();

	/**
	 * Sets the value of the '{@link sql.ForeignKey#getForeignTable <em>Foreign Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foreign Table</em>' reference.
	 * @see #getForeignTable()
	 * @generated
	 */
	void setForeignTable(Table value);

	/**
	 * Returns the value of the '<em><b>Foreign Columns</b></em>' reference list.
	 * The list contents are of type {@link sql.Column}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Columns</em>' reference list.
	 * @see sql.SqlPackage#getForeignKey_ForeignColumns()
	 * @model required="true"
	 * @generated
	 */
	EList<Column> getForeignColumns();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see sql.SqlPackage#getForeignKey_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link sql.ForeignKey#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ForeignKey
