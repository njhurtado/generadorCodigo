/**
 */
package sql.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sql.Column;
import sql.Comment;
import sql.CommentedElement;
import sql.ForeignKey;
import sql.PrimaryKey;
import sql.SqlPackage;
import sql.Table;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sql.impl.TableImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link sql.impl.TableImpl#getName <em>Name</em>}</li>
 *   <li>{@link sql.impl.TableImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link sql.impl.TableImpl#getForeignkeys <em>Foreignkeys</em>}</li>
 *   <li>{@link sql.impl.TableImpl#getPrimarykey <em>Primarykey</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableImpl extends AnnotedElementImpl implements Table {
	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected EList<Comment> comments;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> columns;

	/**
	 * The cached value of the '{@link #getForeignkeys() <em>Foreignkeys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignkeys()
	 * @generated
	 * @ordered
	 */
	protected EList<ForeignKey> foreignkeys;

	/**
	 * The cached value of the '{@link #getPrimarykey() <em>Primarykey</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimarykey()
	 * @generated
	 * @ordered
	 */
	protected PrimaryKey primarykey;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SqlPackage.Literals.TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comment> getComments() {
		if (comments == null) {
			comments = new EObjectContainmentEList<Comment>(Comment.class, this, SqlPackage.TABLE__COMMENTS);
		}
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SqlPackage.TABLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Column> getColumns() {
		if (columns == null) {
			columns = new EObjectContainmentEList<Column>(Column.class, this, SqlPackage.TABLE__COLUMNS);
		}
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ForeignKey> getForeignkeys() {
		if (foreignkeys == null) {
			foreignkeys = new EObjectContainmentEList<ForeignKey>(ForeignKey.class, this, SqlPackage.TABLE__FOREIGNKEYS);
		}
		return foreignkeys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimaryKey getPrimarykey() {
		if (primarykey != null && primarykey.eIsProxy()) {
			InternalEObject oldPrimarykey = (InternalEObject)primarykey;
			primarykey = (PrimaryKey)eResolveProxy(oldPrimarykey);
			if (primarykey != oldPrimarykey) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SqlPackage.TABLE__PRIMARYKEY, oldPrimarykey, primarykey));
			}
		}
		return primarykey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimaryKey basicGetPrimarykey() {
		return primarykey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimarykey(PrimaryKey newPrimarykey) {
		PrimaryKey oldPrimarykey = primarykey;
		primarykey = newPrimarykey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SqlPackage.TABLE__PRIMARYKEY, oldPrimarykey, primarykey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SqlPackage.TABLE__COMMENTS:
				return ((InternalEList<?>)getComments()).basicRemove(otherEnd, msgs);
			case SqlPackage.TABLE__COLUMNS:
				return ((InternalEList<?>)getColumns()).basicRemove(otherEnd, msgs);
			case SqlPackage.TABLE__FOREIGNKEYS:
				return ((InternalEList<?>)getForeignkeys()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SqlPackage.TABLE__COMMENTS:
				return getComments();
			case SqlPackage.TABLE__NAME:
				return getName();
			case SqlPackage.TABLE__COLUMNS:
				return getColumns();
			case SqlPackage.TABLE__FOREIGNKEYS:
				return getForeignkeys();
			case SqlPackage.TABLE__PRIMARYKEY:
				if (resolve) return getPrimarykey();
				return basicGetPrimarykey();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SqlPackage.TABLE__COMMENTS:
				getComments().clear();
				getComments().addAll((Collection<? extends Comment>)newValue);
				return;
			case SqlPackage.TABLE__NAME:
				setName((String)newValue);
				return;
			case SqlPackage.TABLE__COLUMNS:
				getColumns().clear();
				getColumns().addAll((Collection<? extends Column>)newValue);
				return;
			case SqlPackage.TABLE__FOREIGNKEYS:
				getForeignkeys().clear();
				getForeignkeys().addAll((Collection<? extends ForeignKey>)newValue);
				return;
			case SqlPackage.TABLE__PRIMARYKEY:
				setPrimarykey((PrimaryKey)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SqlPackage.TABLE__COMMENTS:
				getComments().clear();
				return;
			case SqlPackage.TABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SqlPackage.TABLE__COLUMNS:
				getColumns().clear();
				return;
			case SqlPackage.TABLE__FOREIGNKEYS:
				getForeignkeys().clear();
				return;
			case SqlPackage.TABLE__PRIMARYKEY:
				setPrimarykey((PrimaryKey)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SqlPackage.TABLE__COMMENTS:
				return comments != null && !comments.isEmpty();
			case SqlPackage.TABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SqlPackage.TABLE__COLUMNS:
				return columns != null && !columns.isEmpty();
			case SqlPackage.TABLE__FOREIGNKEYS:
				return foreignkeys != null && !foreignkeys.isEmpty();
			case SqlPackage.TABLE__PRIMARYKEY:
				return primarykey != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == CommentedElement.class) {
			switch (derivedFeatureID) {
				case SqlPackage.TABLE__COMMENTS: return SqlPackage.COMMENTED_ELEMENT__COMMENTS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == CommentedElement.class) {
			switch (baseFeatureID) {
				case SqlPackage.COMMENTED_ELEMENT__COMMENTS: return SqlPackage.TABLE__COMMENTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TableImpl
