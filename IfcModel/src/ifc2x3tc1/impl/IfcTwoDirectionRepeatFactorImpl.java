/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcTwoDirectionRepeatFactor;
import ifc2x3tc1.IfcVector;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Two Direction Repeat Factor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcTwoDirectionRepeatFactorImpl#getSecondRepeatFactor <em>Second Repeat Factor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcTwoDirectionRepeatFactorImpl extends IfcOneDirectionRepeatFactorImpl implements IfcTwoDirectionRepeatFactor {
	/**
	 * The cached value of the '{@link #getSecondRepeatFactor() <em>Second Repeat Factor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondRepeatFactor()
	 * @generated
	 * @ordered
	 */
	protected IfcVector secondRepeatFactor;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcTwoDirectionRepeatFactor();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcVector getSecondRepeatFactor() {
		if (secondRepeatFactor != null && secondRepeatFactor.eIsProxy()) {
			InternalEObject oldSecondRepeatFactor = (InternalEObject)secondRepeatFactor;
			secondRepeatFactor = (IfcVector)eResolveProxy(oldSecondRepeatFactor);
			if (secondRepeatFactor != oldSecondRepeatFactor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_TWO_DIRECTION_REPEAT_FACTOR__SECOND_REPEAT_FACTOR, oldSecondRepeatFactor, secondRepeatFactor));
			}
		}
		return secondRepeatFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcVector basicGetSecondRepeatFactor() {
		return secondRepeatFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondRepeatFactor(IfcVector newSecondRepeatFactor) {
		IfcVector oldSecondRepeatFactor = secondRepeatFactor;
		secondRepeatFactor = newSecondRepeatFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TWO_DIRECTION_REPEAT_FACTOR__SECOND_REPEAT_FACTOR, oldSecondRepeatFactor, secondRepeatFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_TWO_DIRECTION_REPEAT_FACTOR__SECOND_REPEAT_FACTOR:
				if (resolve) return getSecondRepeatFactor();
				return basicGetSecondRepeatFactor();
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
			case Ifc2x3tc1Package.IFC_TWO_DIRECTION_REPEAT_FACTOR__SECOND_REPEAT_FACTOR:
				setSecondRepeatFactor((IfcVector)newValue);
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
			case Ifc2x3tc1Package.IFC_TWO_DIRECTION_REPEAT_FACTOR__SECOND_REPEAT_FACTOR:
				setSecondRepeatFactor((IfcVector)null);
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
			case Ifc2x3tc1Package.IFC_TWO_DIRECTION_REPEAT_FACTOR__SECOND_REPEAT_FACTOR:
				return secondRepeatFactor != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcTwoDirectionRepeatFactorImpl
