/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.CausedByType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Structural Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcStructuralActionImpl#isDestabilizingLoad <em>Destabilizing Load</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcStructuralActionImpl#getCausedBy <em>Caused By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class IfcStructuralActionImpl extends IfcStructuralActivityImpl implements IfcStructuralAction {
	/**
	 * The default value of the '{@link #isDestabilizingLoad() <em>Destabilizing Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDestabilizingLoad()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DESTABILIZING_LOAD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDestabilizingLoad() <em>Destabilizing Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDestabilizingLoad()
	 * @generated
	 * @ordered
	 */
	protected boolean destabilizingLoad = DESTABILIZING_LOAD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCausedBy() <em>Caused By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCausedBy()
	 * @generated
	 * @ordered
	 */
	protected CausedByType causedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcStructuralActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcStructuralAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDestabilizingLoad() {
		return destabilizingLoad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestabilizingLoad(boolean newDestabilizingLoad) {
		boolean oldDestabilizingLoad = destabilizingLoad;
		destabilizingLoad = newDestabilizingLoad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_ACTION__DESTABILIZING_LOAD, oldDestabilizingLoad, destabilizingLoad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CausedByType getCausedBy() {
		return causedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCausedBy(CausedByType newCausedBy, NotificationChain msgs) {
		CausedByType oldCausedBy = causedBy;
		causedBy = newCausedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_ACTION__CAUSED_BY, oldCausedBy, newCausedBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCausedBy(CausedByType newCausedBy) {
		if (newCausedBy != causedBy) {
			NotificationChain msgs = null;
			if (causedBy != null)
				msgs = ((InternalEObject)causedBy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_STRUCTURAL_ACTION__CAUSED_BY, null, msgs);
			if (newCausedBy != null)
				msgs = ((InternalEObject)newCausedBy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_STRUCTURAL_ACTION__CAUSED_BY, null, msgs);
			msgs = basicSetCausedBy(newCausedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_ACTION__CAUSED_BY, newCausedBy, newCausedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_STRUCTURAL_ACTION__CAUSED_BY:
				return basicSetCausedBy(null, msgs);
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
			case FinalPackage.IFC_STRUCTURAL_ACTION__DESTABILIZING_LOAD:
				return isDestabilizingLoad();
			case FinalPackage.IFC_STRUCTURAL_ACTION__CAUSED_BY:
				return getCausedBy();
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
			case FinalPackage.IFC_STRUCTURAL_ACTION__DESTABILIZING_LOAD:
				setDestabilizingLoad((Boolean)newValue);
				return;
			case FinalPackage.IFC_STRUCTURAL_ACTION__CAUSED_BY:
				setCausedBy((CausedByType)newValue);
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
			case FinalPackage.IFC_STRUCTURAL_ACTION__DESTABILIZING_LOAD:
				setDestabilizingLoad(DESTABILIZING_LOAD_EDEFAULT);
				return;
			case FinalPackage.IFC_STRUCTURAL_ACTION__CAUSED_BY:
				setCausedBy((CausedByType)null);
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
			case FinalPackage.IFC_STRUCTURAL_ACTION__DESTABILIZING_LOAD:
				return destabilizingLoad != DESTABILIZING_LOAD_EDEFAULT;
			case FinalPackage.IFC_STRUCTURAL_ACTION__CAUSED_BY:
				return causedBy != null;
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
		result.append(" (destabilizingLoad: ");
		result.append(destabilizingLoad);
		result.append(')');
		return result.toString();
	}

} //IfcStructuralActionImpl
