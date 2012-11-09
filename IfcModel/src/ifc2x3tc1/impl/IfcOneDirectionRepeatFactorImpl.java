/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcOneDirectionRepeatFactor;
import ifc2x3tc1.IfcVector;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc One Direction Repeat Factor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcOneDirectionRepeatFactorImpl#getRepeatFactor <em>Repeat Factor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcOneDirectionRepeatFactorImpl extends IfcGeometricRepresentationItemImpl implements IfcOneDirectionRepeatFactor {
	/**
	 * The cached value of the '{@link #getRepeatFactor() <em>Repeat Factor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeatFactor()
	 * @generated
	 * @ordered
	 */
	protected IfcVector repeatFactor;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcOneDirectionRepeatFactor();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcVector getRepeatFactor() {
		if (repeatFactor != null && repeatFactor.eIsProxy()) {
			InternalEObject oldRepeatFactor = (InternalEObject)repeatFactor;
			repeatFactor = (IfcVector)eResolveProxy(oldRepeatFactor);
			if (repeatFactor != oldRepeatFactor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_ONE_DIRECTION_REPEAT_FACTOR__REPEAT_FACTOR, oldRepeatFactor, repeatFactor));
			}
		}
		return repeatFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcVector basicGetRepeatFactor() {
		return repeatFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepeatFactor(IfcVector newRepeatFactor) {
		IfcVector oldRepeatFactor = repeatFactor;
		repeatFactor = newRepeatFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ONE_DIRECTION_REPEAT_FACTOR__REPEAT_FACTOR, oldRepeatFactor, repeatFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_ONE_DIRECTION_REPEAT_FACTOR__REPEAT_FACTOR:
				if (resolve) return getRepeatFactor();
				return basicGetRepeatFactor();
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
			case Ifc2x3tc1Package.IFC_ONE_DIRECTION_REPEAT_FACTOR__REPEAT_FACTOR:
				setRepeatFactor((IfcVector)newValue);
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
			case Ifc2x3tc1Package.IFC_ONE_DIRECTION_REPEAT_FACTOR__REPEAT_FACTOR:
				setRepeatFactor((IfcVector)null);
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
			case Ifc2x3tc1Package.IFC_ONE_DIRECTION_REPEAT_FACTOR__REPEAT_FACTOR:
				return repeatFactor != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcOneDirectionRepeatFactorImpl
