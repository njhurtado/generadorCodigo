/**
 */
package sql.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sql.SqlPackage;
import sql.Table;
import sql.TableDetail;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Detail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sql.impl.TableDetailImpl#getTableRelation <em>Table Relation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableDetailImpl extends AnnotationImpl implements TableDetail {
	/**
	 * The cached value of the '{@link #getTableRelation() <em>Table Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableRelation()
	 * @generated
	 * @ordered
	 */
	protected Table tableRelation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableDetailImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SqlPackage.Literals.TABLE_DETAIL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Table getTableRelation() {
		if (tableRelation != null && tableRelation.eIsProxy()) {
			InternalEObject oldTableRelation = (InternalEObject)tableRelation;
			tableRelation = (Table)eResolveProxy(oldTableRelation);
			if (tableRelation != oldTableRelation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SqlPackage.TABLE_DETAIL__TABLE_RELATION, oldTableRelation, tableRelation));
			}
		}
		return tableRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetTableRelation() {
		return tableRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTableRelation(Table newTableRelation) {
		Table oldTableRelation = tableRelation;
		tableRelation = newTableRelation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SqlPackage.TABLE_DETAIL__TABLE_RELATION, oldTableRelation, tableRelation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SqlPackage.TABLE_DETAIL__TABLE_RELATION:
				if (resolve) return getTableRelation();
				return basicGetTableRelation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SqlPackage.TABLE_DETAIL__TABLE_RELATION:
				setTableRelation((Table)newValue);
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
			case SqlPackage.TABLE_DETAIL__TABLE_RELATION:
				setTableRelation((Table)null);
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
			case SqlPackage.TABLE_DETAIL__TABLE_RELATION:
				return tableRelation != null;
		}
		return super.eIsSet(featureID);
	}

} //TableDetailImpl
