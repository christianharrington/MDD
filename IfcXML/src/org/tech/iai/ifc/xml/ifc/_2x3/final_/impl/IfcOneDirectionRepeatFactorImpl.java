/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcOneDirectionRepeatFactor;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RepeatFactorType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc One Direction Repeat Factor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcOneDirectionRepeatFactorImpl#getRepeatFactor <em>Repeat Factor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcOneDirectionRepeatFactorImpl extends IfcGeometricRepresentationItemImpl implements IfcOneDirectionRepeatFactor {
	/**
	 * The cached value of the '{@link #getRepeatFactor() <em>Repeat Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeatFactor()
	 * @generated
	 * @ordered
	 */
	protected RepeatFactorType repeatFactor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcOneDirectionRepeatFactorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcOneDirectionRepeatFactor();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepeatFactorType getRepeatFactor() {
		return repeatFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepeatFactor(RepeatFactorType newRepeatFactor, NotificationChain msgs) {
		RepeatFactorType oldRepeatFactor = repeatFactor;
		repeatFactor = newRepeatFactor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_ONE_DIRECTION_REPEAT_FACTOR__REPEAT_FACTOR, oldRepeatFactor, newRepeatFactor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepeatFactor(RepeatFactorType newRepeatFactor) {
		if (newRepeatFactor != repeatFactor) {
			NotificationChain msgs = null;
			if (repeatFactor != null)
				msgs = ((InternalEObject)repeatFactor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_ONE_DIRECTION_REPEAT_FACTOR__REPEAT_FACTOR, null, msgs);
			if (newRepeatFactor != null)
				msgs = ((InternalEObject)newRepeatFactor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_ONE_DIRECTION_REPEAT_FACTOR__REPEAT_FACTOR, null, msgs);
			msgs = basicSetRepeatFactor(newRepeatFactor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_ONE_DIRECTION_REPEAT_FACTOR__REPEAT_FACTOR, newRepeatFactor, newRepeatFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_ONE_DIRECTION_REPEAT_FACTOR__REPEAT_FACTOR:
				return basicSetRepeatFactor(null, msgs);
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
			case FinalPackage.IFC_ONE_DIRECTION_REPEAT_FACTOR__REPEAT_FACTOR:
				return getRepeatFactor();
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
			case FinalPackage.IFC_ONE_DIRECTION_REPEAT_FACTOR__REPEAT_FACTOR:
				setRepeatFactor((RepeatFactorType)newValue);
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
			case FinalPackage.IFC_ONE_DIRECTION_REPEAT_FACTOR__REPEAT_FACTOR:
				setRepeatFactor((RepeatFactorType)null);
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
			case FinalPackage.IFC_ONE_DIRECTION_REPEAT_FACTOR__REPEAT_FACTOR:
				return repeatFactor != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcOneDirectionRepeatFactorImpl
