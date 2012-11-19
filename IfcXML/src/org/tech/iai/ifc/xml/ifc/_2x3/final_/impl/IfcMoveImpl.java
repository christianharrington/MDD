/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMove;
import org.tech.iai.ifc.xml.ifc._2x3.final_.MoveFromType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.MoveToType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.PunchListType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Move</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcMoveImpl#getMoveFrom <em>Move From</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcMoveImpl#getMoveTo <em>Move To</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcMoveImpl#getPunchList <em>Punch List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcMoveImpl extends IfcTaskImpl implements IfcMove {
	/**
	 * The cached value of the '{@link #getMoveFrom() <em>Move From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoveFrom()
	 * @generated
	 * @ordered
	 */
	protected MoveFromType moveFrom;

	/**
	 * The cached value of the '{@link #getMoveTo() <em>Move To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoveTo()
	 * @generated
	 * @ordered
	 */
	protected MoveToType moveTo;

	/**
	 * The cached value of the '{@link #getPunchList() <em>Punch List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPunchList()
	 * @generated
	 * @ordered
	 */
	protected PunchListType punchList;

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
		return FinalPackage.eINSTANCE.getIfcMove();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoveFromType getMoveFrom() {
		return moveFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMoveFrom(MoveFromType newMoveFrom, NotificationChain msgs) {
		MoveFromType oldMoveFrom = moveFrom;
		moveFrom = newMoveFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_MOVE__MOVE_FROM, oldMoveFrom, newMoveFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoveFrom(MoveFromType newMoveFrom) {
		if (newMoveFrom != moveFrom) {
			NotificationChain msgs = null;
			if (moveFrom != null)
				msgs = ((InternalEObject)moveFrom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_MOVE__MOVE_FROM, null, msgs);
			if (newMoveFrom != null)
				msgs = ((InternalEObject)newMoveFrom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_MOVE__MOVE_FROM, null, msgs);
			msgs = basicSetMoveFrom(newMoveFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_MOVE__MOVE_FROM, newMoveFrom, newMoveFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoveToType getMoveTo() {
		return moveTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMoveTo(MoveToType newMoveTo, NotificationChain msgs) {
		MoveToType oldMoveTo = moveTo;
		moveTo = newMoveTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_MOVE__MOVE_TO, oldMoveTo, newMoveTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoveTo(MoveToType newMoveTo) {
		if (newMoveTo != moveTo) {
			NotificationChain msgs = null;
			if (moveTo != null)
				msgs = ((InternalEObject)moveTo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_MOVE__MOVE_TO, null, msgs);
			if (newMoveTo != null)
				msgs = ((InternalEObject)newMoveTo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_MOVE__MOVE_TO, null, msgs);
			msgs = basicSetMoveTo(newMoveTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_MOVE__MOVE_TO, newMoveTo, newMoveTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PunchListType getPunchList() {
		return punchList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPunchList(PunchListType newPunchList, NotificationChain msgs) {
		PunchListType oldPunchList = punchList;
		punchList = newPunchList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_MOVE__PUNCH_LIST, oldPunchList, newPunchList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPunchList(PunchListType newPunchList) {
		if (newPunchList != punchList) {
			NotificationChain msgs = null;
			if (punchList != null)
				msgs = ((InternalEObject)punchList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_MOVE__PUNCH_LIST, null, msgs);
			if (newPunchList != null)
				msgs = ((InternalEObject)newPunchList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_MOVE__PUNCH_LIST, null, msgs);
			msgs = basicSetPunchList(newPunchList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_MOVE__PUNCH_LIST, newPunchList, newPunchList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_MOVE__MOVE_FROM:
				return basicSetMoveFrom(null, msgs);
			case FinalPackage.IFC_MOVE__MOVE_TO:
				return basicSetMoveTo(null, msgs);
			case FinalPackage.IFC_MOVE__PUNCH_LIST:
				return basicSetPunchList(null, msgs);
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
			case FinalPackage.IFC_MOVE__MOVE_FROM:
				return getMoveFrom();
			case FinalPackage.IFC_MOVE__MOVE_TO:
				return getMoveTo();
			case FinalPackage.IFC_MOVE__PUNCH_LIST:
				return getPunchList();
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
			case FinalPackage.IFC_MOVE__MOVE_FROM:
				setMoveFrom((MoveFromType)newValue);
				return;
			case FinalPackage.IFC_MOVE__MOVE_TO:
				setMoveTo((MoveToType)newValue);
				return;
			case FinalPackage.IFC_MOVE__PUNCH_LIST:
				setPunchList((PunchListType)newValue);
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
			case FinalPackage.IFC_MOVE__MOVE_FROM:
				setMoveFrom((MoveFromType)null);
				return;
			case FinalPackage.IFC_MOVE__MOVE_TO:
				setMoveTo((MoveToType)null);
				return;
			case FinalPackage.IFC_MOVE__PUNCH_LIST:
				setPunchList((PunchListType)null);
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
			case FinalPackage.IFC_MOVE__MOVE_FROM:
				return moveFrom != null;
			case FinalPackage.IFC_MOVE__MOVE_TO:
				return moveTo != null;
			case FinalPackage.IFC_MOVE__PUNCH_LIST:
				return punchList != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcMoveImpl
