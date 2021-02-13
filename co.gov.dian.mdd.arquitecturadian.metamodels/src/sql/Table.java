/**
 */
package sql;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sql.Table#getName <em>Name</em>}</li>
 *   <li>{@link sql.Table#getColumns <em>Columns</em>}</li>
 *   <li>{@link sql.Table#getForeignkeys <em>Foreignkeys</em>}</li>
 *   <li>{@link sql.Table#getPrimarykey <em>Primarykey</em>}</li>
 * </ul>
 *
 * @see sql.SqlPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends AnnotedElement, CommentedElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see sql.SqlPackage#getTable_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link sql.Table#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link sql.Column}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see sql.SqlPackage#getTable_Columns()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Column> getColumns();

	/**
	 * Returns the value of the '<em><b>Foreignkeys</b></em>' containment reference list.
	 * The list contents are of type {@link sql.ForeignKey}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreignkeys</em>' containment reference list.
	 * @see sql.SqlPackage#getTable_Foreignkeys()
	 * @model containment="true"
	 * @generated
	 */
	EList<ForeignKey> getForeignkeys();

	/**
	 * Returns the value of the '<em><b>Primarykey</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primarykey</em>' reference.
	 * @see #setPrimarykey(PrimaryKey)
	 * @see sql.SqlPackage#getTable_Primarykey()
	 * @model
	 * @generated
	 */
	PrimaryKey getPrimarykey();

	/**
	 * Sets the value of the '{@link sql.Table#getPrimarykey <em>Primarykey</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primarykey</em>' reference.
	 * @see #getPrimarykey()
	 * @generated
	 */
	void setPrimarykey(PrimaryKey value);

} // Table
