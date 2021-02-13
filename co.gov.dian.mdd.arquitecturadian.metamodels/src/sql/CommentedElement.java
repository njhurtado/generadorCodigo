/**
 */
package sql;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Commented Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sql.CommentedElement#getComments <em>Comments</em>}</li>
 * </ul>
 *
 * @see sql.SqlPackage#getCommentedElement()
 * @model abstract="true"
 * @generated
 */
public interface CommentedElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Comments</b></em>' containment reference list.
	 * The list contents are of type {@link sql.Comment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' containment reference list.
	 * @see sql.SqlPackage#getCommentedElement_Comments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Comment> getComments();

} // CommentedElement
