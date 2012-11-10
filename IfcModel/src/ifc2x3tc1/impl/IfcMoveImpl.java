/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcMove;
import ifc2x3tc1.IfcSpatialStructureElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Move</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcMoveImpl#getMoveFrom <em>Move From</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcMoveImpl#getMoveTo <em>Move To</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcMoveImpl#getPunchList <em>Punch List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcMoveImpl extends IfcTaskImpl implements IfcMove {
	/**
	 * The cached value of the '{@link #getMoveFrom() <em>Move From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoveFrom()
	 * @generated
	 * @ordered
	 */
	protected IfcSpatialStructureElement moveFrom;

	/**
	 * The cached value of the '{@link #getMoveTo() <em>Move To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoveTo()
	 * @generated
	 * @ordered
	 */
	protected IfcSpatialStructureElement moveTo;

	/**
	 * The cached value of the '{@link #getPunchList() <em>Punch List</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPunchList()
	 * @generated
	 * @ordered
	 */
	protected EList<String> punchList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcMoveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcMove();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSpatialStructureElement getMoveFrom() {
		if (moveFrom != null && moveFrom.eIsProxy()) {
			InternalEObject oldMoveFrom = (InternalEObject)moveFrom;
			moveFrom = (IfcSpatialStructureElement)eResolveProxy(oldMoveFrom);
			if (moveFrom != oldMoveFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_MOVE__MOVE_FROM, oldMoveFrom, moveFrom));
			}
		}
		return moveFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSpatialStructureElement basicGetMoveFrom() {
		return moveFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoveFrom(IfcSpatialStructureElement newMoveFrom) {
		IfcSpatialStructureElement oldMoveFrom = moveFrom;
		moveFrom = newMoveFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_MOVE__MOVE_FROM, oldMoveFrom, moveFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSpatialStructureElement getMoveTo() {
		if (moveTo != null && moveTo.eIsProxy()) {
			InternalEObject oldMoveTo = (InternalEObject)moveTo;
			moveTo = (IfcSpatialStructureElement)eResolveProxy(oldMoveTo);
			if (moveTo != oldMoveTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_MOVE__MOVE_TO, oldMoveTo, moveTo));
			}
		}
		return moveTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSpatialStructureElement basicGetMoveTo() {
		return moveTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoveTo(IfcSpatialStructureElement newMoveTo) {
		IfcSpatialStructureElement oldMoveTo = moveTo;
		moveTo = newMoveTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_MOVE__MOVE_TO, oldMoveTo, moveTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getPunchList() {
		if (punchList == null) {
			punchList = new EDataTypeEList.Unsettable<String>(String.class, this, Ifc2x3tc1Package.IFC_MOVE__PUNCH_LIST);
		}
		return punchList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPunchList() {
		if (punchList != null) ((InternalEList.Unsettable<?>)punchList).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPunchList() {
		return punchList != null && ((InternalEList.Unsettable<?>)punchList).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_MOVE__MOVE_FROM:
				if (resolve) return getMoveFrom();
				return basicGetMoveFrom();
			case Ifc2x3tc1Package.IFC_MOVE__MOVE_TO:
				if (resolve) return getMoveTo();
				return basicGetMoveTo();
			case Ifc2x3tc1Package.IFC_MOVE__PUNCH_LIST:
				return getPunchList();
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
			case Ifc2x3tc1Package.IFC_MOVE__MOVE_FROM:
				setMoveFrom((IfcSpatialStructureElement)newValue);
				return;
			case Ifc2x3tc1Package.IFC_MOVE__MOVE_TO:
				setMoveTo((IfcSpatialStructureElement)newValue);
				return;
			case Ifc2x3tc1Package.IFC_MOVE__PUNCH_LIST:
				getPunchList().clear();
				getPunchList().addAll((Collection<? extends String>)newValue);
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
			case Ifc2x3tc1Package.IFC_MOVE__MOVE_FROM:
				setMoveFrom((IfcSpatialStructureElement)null);
				return;
			case Ifc2x3tc1Package.IFC_MOVE__MOVE_TO:
				setMoveTo((IfcSpatialStructureElement)null);
				return;
			case Ifc2x3tc1Package.IFC_MOVE__PUNCH_LIST:
				unsetPunchList();
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
			case Ifc2x3tc1Package.IFC_MOVE__MOVE_FROM:
				return moveFrom != null;
			case Ifc2x3tc1Package.IFC_MOVE__MOVE_TO:
				return moveTo != null;
			case Ifc2x3tc1Package.IFC_MOVE__PUNCH_LIST:
				return isSetPunchList();
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
		result.append(" (PunchList: ");
		result.append(punchList);
		result.append(')');
		return result.toString();
	}

} //IfcMoveImpl
