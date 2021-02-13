/**
 */
package sql.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import sql.Column;
import sql.ForeignKey;
import sql.SqlPackage;
import sql.Table;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sql.impl.ForeignKeyImpl#getLocalColumns <em>Local Columns</em>}</li>
 *   <li>{@link sql.impl.ForeignKeyImpl#getForeignTable <em>Foreign Table</em>}</li>
 *   <li>{@link sql.impl.ForeignKeyImpl#getForeignColumns <em>Foreign Columns</em>}</li>
 *   <li>{@link sql.impl.ForeignKeyImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForeignKeyImpl extends AnnotedElementImpl implements ForeignKey {
	/**
	 * The cached value of the '{@link #getLocalColumns() <em>Local Columns</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> localColumns;

	/**
	 * The cached value of the '{@link #getForeignTable() <em>Foreign Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignTable()
	 * @generated
	 * @ordered
	 */
	protected Table foreignTable;

	/**
	 * The cached value of the '{@link #getForeignColumns() <em>Foreign Columns</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> foreignColumns;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForeignKeyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SqlPackage.Literals.FOREIGN_KEY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Column> getLocalColumns() {
		if (localColumns == null) {
			localColumns = new EObjectResolvingEList<Column>(Column.class, this, SqlPackage.FOREIGN_KEY__LOCAL_COLUMNS);
		}
		return localColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Table getForeignTable() {
		if (foreignTable != null && foreignTable.eIsProxy()) {
			InternalEObject oldForeignTable = (InternalEObject)foreignTable;
			foreignTable = (Table)eResolveProxy(oldForeignTable);
			if (foreignTable != oldForeignTable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SqlPackage.FOREIGN_KEY__FOREIGN_TABLE, oldForeignTable, foreignTable));
			}
		}
		return foreignTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetForeignTable() {
		return foreignTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForeignTable(Table newForeignTable) {
		Table oldForeignTable = foreignTable;
		foreignTable = newForeignTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SqlPackage.FOREIGN_KEY__FOREIGN_TABLE, oldForeignTable, foreignTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Column> getForeignColumns() {
		if (foreignColumns == null) {
			foreignColumns = new EObjectResolvingEList<Column>(Column.class, this, SqlPackage.FOREIGN_KEY__FOREIGN_COLUMNS);
		}
		return foreignColumns;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SqlPackage.FOREIGN_KEY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SqlPackage.FOREIGN_KEY__LOCAL_COLUMNS:
				return getLocalColumns();
			case SqlPackage.FOREIGN_KEY__FOREIGN_TABLE:
				if (resolve) return getForeignTable();
				return basicGetForeignTable();
			case SqlPackage.FOREIGN_KEY__FOREIGN_COLUMNS:
				return getForeignColumns();
			case SqlPackage.FOREIGN_KEY__NAME:
				return getName();
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
			case SqlPackage.FOREIGN_KEY__LOCAL_COLUMNS:
				getLocalColumns().clear();
				getLocalColumns().addAll((Collection<? extends Column>)newValue);
				return;
			case SqlPackage.FOREIGN_KEY__FOREIGN_TABLE:
				setForeignTable((Table)newValue);
				return;
			case SqlPackage.FOREIGN_KEY__FOREIGN_COLUMNS:
				getForeignColumns().clear();
				getForeignColumns().addAll((Collection<? extends Column>)newValue);
				return;
			case SqlPackage.FOREIGN_KEY__NAME:
				setName((String)newValue);
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
			case SqlPackage.FOREIGN_KEY__LOCAL_COLUMNS:
				getLocalColumns().clear();
				return;
			case SqlPackage.FOREIGN_KEY__FOREIGN_TABLE:
				setForeignTable((Table)null);
				return;
			case SqlPackage.FOREIGN_KEY__FOREIGN_COLUMNS:
				getForeignColumns().clear();
				return;
			case SqlPackage.FOREIGN_KEY__NAME:
				setName(NAME_EDEFAULT);
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
			case SqlPackage.FOREIGN_KEY__LOCAL_COLUMNS:
				return localColumns != null && !localColumns.isEmpty();
			case SqlPackage.FOREIGN_KEY__FOREIGN_TABLE:
				return foreignTable != null;
			case SqlPackage.FOREIGN_KEY__FOREIGN_COLUMNS:
				return foreignColumns != null && !foreignColumns.isEmpty();
			case SqlPackage.FOREIGN_KEY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
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

} //ForeignKeyImpl
