/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcTable;
import ifc2x3tc1.IfcTableRow;
import ifc2x3tc1.IfcValue;
import ifc2x3tc1.Tristate;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Table Row</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcTableRowImpl#getRowCells <em>Row Cells</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTableRowImpl#getIsHeading <em>Is Heading</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTableRowImpl#getOfTable <em>Of Table</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcTableRowImpl extends EObjectImpl implements IfcTableRow {
	/**
	 * The cached value of the '{@link #getRowCells() <em>Row Cells</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowCells()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcValue> rowCells;

	/**
	 * The default value of the '{@link #getIsHeading() <em>Is Heading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsHeading()
	 * @generated
	 * @ordered
	 */
	protected static final Tristate IS_HEADING_EDEFAULT = Tristate.TRUE;

	/**
	 * The cached value of the '{@link #getIsHeading() <em>Is Heading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsHeading()
	 * @generated
	 * @ordered
	 */
	protected Tristate isHeading = IS_HEADING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOfTable() <em>Of Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOfTable()
	 * @generated
	 * @ordered
	 */
	protected IfcTable ofTable;

	/**
	 * This is true if the Of Table reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ofTableESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcTableRowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcTableRow();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcValue> getRowCells() {
		if (rowCells == null) {
			rowCells = new EObjectResolvingEList<IfcValue>(IfcValue.class, this, Ifc2x3tc1Package.IFC_TABLE_ROW__ROW_CELLS);
		}
		return rowCells;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tristate getIsHeading() {
		return isHeading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsHeading(Tristate newIsHeading) {
		Tristate oldIsHeading = isHeading;
		isHeading = newIsHeading == null ? IS_HEADING_EDEFAULT : newIsHeading;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TABLE_ROW__IS_HEADING, oldIsHeading, isHeading));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTable getOfTable() {
		if (ofTable != null && ofTable.eIsProxy()) {
			InternalEObject oldOfTable = (InternalEObject)ofTable;
			ofTable = (IfcTable)eResolveProxy(oldOfTable);
			if (ofTable != oldOfTable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_TABLE_ROW__OF_TABLE, oldOfTable, ofTable));
			}
		}
		return ofTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTable basicGetOfTable() {
		return ofTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOfTable(IfcTable newOfTable, NotificationChain msgs) {
		IfcTable oldOfTable = ofTable;
		ofTable = newOfTable;
		boolean oldOfTableESet = ofTableESet;
		ofTableESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TABLE_ROW__OF_TABLE, oldOfTable, newOfTable, !oldOfTableESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOfTable(IfcTable newOfTable) {
		if (newOfTable != ofTable) {
			NotificationChain msgs = null;
			if (ofTable != null)
				msgs = ((InternalEObject)ofTable).eInverseRemove(this, Ifc2x3tc1Package.IFC_TABLE__ROWS, IfcTable.class, msgs);
			if (newOfTable != null)
				msgs = ((InternalEObject)newOfTable).eInverseAdd(this, Ifc2x3tc1Package.IFC_TABLE__ROWS, IfcTable.class, msgs);
			msgs = basicSetOfTable(newOfTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldOfTableESet = ofTableESet;
			ofTableESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TABLE_ROW__OF_TABLE, newOfTable, newOfTable, !oldOfTableESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetOfTable(NotificationChain msgs) {
		IfcTable oldOfTable = ofTable;
		ofTable = null;
		boolean oldOfTableESet = ofTableESet;
		ofTableESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_TABLE_ROW__OF_TABLE, oldOfTable, null, oldOfTableESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOfTable() {
		if (ofTable != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)ofTable).eInverseRemove(this, Ifc2x3tc1Package.IFC_TABLE__ROWS, IfcTable.class, msgs);
			msgs = basicUnsetOfTable(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldOfTableESet = ofTableESet;
			ofTableESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_TABLE_ROW__OF_TABLE, null, null, oldOfTableESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOfTable() {
		return ofTableESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_TABLE_ROW__OF_TABLE:
				if (ofTable != null)
					msgs = ((InternalEObject)ofTable).eInverseRemove(this, Ifc2x3tc1Package.IFC_TABLE__ROWS, IfcTable.class, msgs);
				return basicSetOfTable((IfcTable)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_TABLE_ROW__OF_TABLE:
				return basicUnsetOfTable(msgs);
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
			case Ifc2x3tc1Package.IFC_TABLE_ROW__ROW_CELLS:
				return getRowCells();
			case Ifc2x3tc1Package.IFC_TABLE_ROW__IS_HEADING:
				return getIsHeading();
			case Ifc2x3tc1Package.IFC_TABLE_ROW__OF_TABLE:
				if (resolve) return getOfTable();
				return basicGetOfTable();
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
			case Ifc2x3tc1Package.IFC_TABLE_ROW__ROW_CELLS:
				getRowCells().clear();
				getRowCells().addAll((Collection<? extends IfcValue>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TABLE_ROW__IS_HEADING:
				setIsHeading((Tristate)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TABLE_ROW__OF_TABLE:
				setOfTable((IfcTable)newValue);
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
			case Ifc2x3tc1Package.IFC_TABLE_ROW__ROW_CELLS:
				getRowCells().clear();
				return;
			case Ifc2x3tc1Package.IFC_TABLE_ROW__IS_HEADING:
				setIsHeading(IS_HEADING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_TABLE_ROW__OF_TABLE:
				unsetOfTable();
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
			case Ifc2x3tc1Package.IFC_TABLE_ROW__ROW_CELLS:
				return rowCells != null && !rowCells.isEmpty();
			case Ifc2x3tc1Package.IFC_TABLE_ROW__IS_HEADING:
				return isHeading != IS_HEADING_EDEFAULT;
			case Ifc2x3tc1Package.IFC_TABLE_ROW__OF_TABLE:
				return isSetOfTable();
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (IsHeading: ");
		result.append(isHeading);
		result.append(')');
		return result.toString();
	}

} //IfcTableRowImpl
