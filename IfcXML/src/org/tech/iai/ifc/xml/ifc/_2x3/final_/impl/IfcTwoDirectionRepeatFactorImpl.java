/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTwoDirectionRepeatFactor;
import org.tech.iai.ifc.xml.ifc._2x3.final_.SecondRepeatFactorType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Two Direction Repeat Factor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTwoDirectionRepeatFactorImpl#getSecondRepeatFactor <em>Second Repeat Factor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcTwoDirectionRepeatFactorImpl extends IfcOneDirectionRepeatFactorImpl implements IfcTwoDirectionRepeatFactor {
	/**
	 * The cached value of the '{@link #getSecondRepeatFactor() <em>Second Repeat Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondRepeatFactor()
	 * @generated
	 * @ordered
	 */
	protected SecondRepeatFactorType secondRepeatFactor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcTwoDirectionRepeatFactorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcTwoDirectionRepeatFactor();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecondRepeatFactorType getSecondRepeatFactor() {
		return secondRepeatFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecondRepeatFactor(SecondRepeatFactorType newSecondRepeatFactor, NotificationChain msgs) {
		SecondRepeatFactorType oldSecondRepeatFactor = secondRepeatFactor;
		secondRepeatFactor = newSecondRepeatFactor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TWO_DIRECTION_REPEAT_FACTOR__SECOND_REPEAT_FACTOR, oldSecondRepeatFactor, newSecondRepeatFactor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondRepeatFactor(SecondRepeatFactorType newSecondRepeatFactor) {
		if (newSecondRepeatFactor != secondRepeatFactor) {
			NotificationChain msgs = null;
			if (secondRepeatFactor != null)
				msgs = ((InternalEObject)secondRepeatFactor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_TWO_DIRECTION_REPEAT_FACTOR__SECOND_REPEAT_FACTOR, null, msgs);
			if (newSecondRepeatFactor != null)
				msgs = ((InternalEObject)newSecondRepeatFactor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_TWO_DIRECTION_REPEAT_FACTOR__SECOND_REPEAT_FACTOR, null, msgs);
			msgs = basicSetSecondRepeatFactor(newSecondRepeatFactor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TWO_DIRECTION_REPEAT_FACTOR__SECOND_REPEAT_FACTOR, newSecondRepeatFactor, newSecondRepeatFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_TWO_DIRECTION_REPEAT_FACTOR__SECOND_REPEAT_FACTOR:
				return basicSetSecondRepeatFactor(null, msgs);
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
			case FinalPackage.IFC_TWO_DIRECTION_REPEAT_FACTOR__SECOND_REPEAT_FACTOR:
				return getSecondRepeatFactor();
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
			case FinalPackage.IFC_TWO_DIRECTION_REPEAT_FACTOR__SECOND_REPEAT_FACTOR:
				setSecondRepeatFactor((SecondRepeatFactorType)newValue);
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
			case FinalPackage.IFC_TWO_DIRECTION_REPEAT_FACTOR__SECOND_REPEAT_FACTOR:
				setSecondRepeatFactor((SecondRepeatFactorType)null);
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
			case FinalPackage.IFC_TWO_DIRECTION_REPEAT_FACTOR__SECOND_REPEAT_FACTOR:
				return secondRepeatFactor != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcTwoDirectionRepeatFactorImpl
