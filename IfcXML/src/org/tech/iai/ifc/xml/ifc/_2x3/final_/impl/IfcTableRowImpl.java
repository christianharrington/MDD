/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.EntityImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTableRow;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RowCellsType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Table Row</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTableRowImpl#getRowCells <em>Row Cells</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTableRowImpl#isIsHeading <em>Is Heading</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcTableRowImpl extends EntityImpl implements IfcTableRow {
	/**
	 * The cached value of the '{@link #getRowCells() <em>Row Cells</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowCells()
	 * @generated
	 * @ordered
	 */
	protected RowCellsType rowCells;

	/**
	 * The default value of the '{@link #isIsHeading() <em>Is Heading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsHeading()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_HEADING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsHeading() <em>Is Heading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsHeading()
	 * @generated
	 * @ordered
	 */
	protected boolean isHeading = IS_HEADING_EDEFAULT;

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
		return FinalPackage.eINSTANCE.getIfcTableRow();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RowCellsType getRowCells() {
		return rowCells;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRowCells(RowCellsType newRowCells, NotificationChain msgs) {
		RowCellsType oldRowCells = rowCells;
		rowCells = newRowCells;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TABLE_ROW__ROW_CELLS, oldRowCells, newRowCells);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRowCells(RowCellsType newRowCells) {
		if (newRowCells != rowCells) {
			NotificationChain msgs = null;
			if (rowCells != null)
				msgs = ((InternalEObject)rowCells).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_TABLE_ROW__ROW_CELLS, null, msgs);
			if (newRowCells != null)
				msgs = ((InternalEObject)newRowCells).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_TABLE_ROW__ROW_CELLS, null, msgs);
			msgs = basicSetRowCells(newRowCells, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TABLE_ROW__ROW_CELLS, newRowCells, newRowCells));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsHeading() {
		return isHeading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsHeading(boolean newIsHeading) {
		boolean oldIsHeading = isHeading;
		isHeading = newIsHeading;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TABLE_ROW__IS_HEADING, oldIsHeading, isHeading));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_TABLE_ROW__ROW_CELLS:
				return basicSetRowCells(null, msgs);
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
			case FinalPackage.IFC_TABLE_ROW__ROW_CELLS:
				return getRowCells();
			case FinalPackage.IFC_TABLE_ROW__IS_HEADING:
				return isIsHeading();
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
			case FinalPackage.IFC_TABLE_ROW__ROW_CELLS:
				setRowCells((RowCellsType)newValue);
				return;
			case FinalPackage.IFC_TABLE_ROW__IS_HEADING:
				setIsHeading((Boolean)newValue);
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
			case FinalPackage.IFC_TABLE_ROW__ROW_CELLS:
				setRowCells((RowCellsType)null);
				return;
			case FinalPackage.IFC_TABLE_ROW__IS_HEADING:
				setIsHeading(IS_HEADING_EDEFAULT);
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
			case FinalPackage.IFC_TABLE_ROW__ROW_CELLS:
				return rowCells != null;
			case FinalPackage.IFC_TABLE_ROW__IS_HEADING:
				return isHeading != IS_HEADING_EDEFAULT;
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
		result.append(" (isHeading: ");
		result.append(isHeading);
		result.append(')');
		return result.toString();
	}

} //IfcTableRowImpl
