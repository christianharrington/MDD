/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcBoundingBox;
import ifc2x3tc1.IfcBoxedHalfSpace;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Boxed Half Space</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcBoxedHalfSpaceImpl#getEnclosure <em>Enclosure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcBoxedHalfSpaceImpl extends IfcHalfSpaceSolidImpl implements IfcBoxedHalfSpace {
	/**
	 * The cached value of the '{@link #getEnclosure() <em>Enclosure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnclosure()
	 * @generated
	 * @ordered
	 */
	protected IfcBoundingBox enclosure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcBoxedHalfSpaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcBoxedHalfSpace();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBoundingBox getEnclosure() {
		if (enclosure != null && enclosure.eIsProxy()) {
			InternalEObject oldEnclosure = (InternalEObject)enclosure;
			enclosure = (IfcBoundingBox)eResolveProxy(oldEnclosure);
			if (enclosure != oldEnclosure) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_BOXED_HALF_SPACE__ENCLOSURE, oldEnclosure, enclosure));
			}
		}
		return enclosure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBoundingBox basicGetEnclosure() {
		return enclosure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnclosure(IfcBoundingBox newEnclosure) {
		IfcBoundingBox oldEnclosure = enclosure;
		enclosure = newEnclosure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_BOXED_HALF_SPACE__ENCLOSURE, oldEnclosure, enclosure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_BOXED_HALF_SPACE__ENCLOSURE:
				if (resolve) return getEnclosure();
				return basicGetEnclosure();
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
			case Ifc2x3tc1Package.IFC_BOXED_HALF_SPACE__ENCLOSURE:
				setEnclosure((IfcBoundingBox)newValue);
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
			case Ifc2x3tc1Package.IFC_BOXED_HALF_SPACE__ENCLOSURE:
				setEnclosure((IfcBoundingBox)null);
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
			case Ifc2x3tc1Package.IFC_BOXED_HALF_SPACE__ENCLOSURE:
				return enclosure != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcBoxedHalfSpaceImpl
