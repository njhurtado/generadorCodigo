/**
 */
package sql;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Detail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sql.TableDetail#getTableRelation <em>Table Relation</em>}</li>
 * </ul>
 *
 * @see sql.SqlPackage#getTableDetail()
 * @model
 * @generated
 */
public interface TableDetail extends Annotation {
	/**
	 * Returns the value of the '<em><b>Table Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Relation</em>' reference.
	 * @see #setTableRelation(Table)
	 * @see sql.SqlPackage#getTableDetail_TableRelation()
	 * @model required="true"
	 * @generated
	 */
	Table getTableRelation();

	/**
	 * Sets the value of the '{@link sql.TableDetail#getTableRelation <em>Table Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Relation</em>' reference.
	 * @see #getTableRelation()
	 * @generated
	 */
	void setTableRelation(Table value);

} // TableDetail
