/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcAxis1Placement;
import ifc2x3tc1.IfcSurfaceOfRevolution;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Surface Of Revolution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcSurfaceOfRevolutionImpl#getAxisPosition <em>Axis Position</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcSurfaceOfRevolutionImpl extends IfcSweptSurfaceImpl implements IfcSurfaceOfRevolution {
	/**
	 * The cached value of the '{@link #getAxisPosition() <em>Axis Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxisPosition()
	 * @generated
	 * @ordered
	 */
	protected IfcAxis1Placement axisPosition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSurfaceOfRevolutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcSurfaceOfRevolution();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAxis1Placement getAxisPosition() {
		if (axisPosition != null && axisPosition.eIsProxy()) {
			InternalEObject oldAxisPosition = (InternalEObject)axisPosition;
			axisPosition = (IfcAxis1Placement)eResolveProxy(oldAxisPosition);
			if (axisPosition != oldAxisPosition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_SURFACE_OF_REVOLUTION__AXIS_POSITION, oldAxisPosition, axisPosition));
			}
		}
		return axisPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAxis1Placement basicGetAxisPosition() {
		return axisPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxisPosition(IfcAxis1Placement newAxisPosition) {
		IfcAxis1Placement oldAxisPosition = axisPosition;
		axisPosition = newAxisPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SURFACE_OF_REVOLUTION__AXIS_POSITION, oldAxisPosition, axisPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_SURFACE_OF_REVOLUTION__AXIS_POSITION:
				if (resolve) return getAxisPosition();
				return basicGetAxisPosition();
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
			case Ifc2x3tc1Package.IFC_SURFACE_OF_REVOLUTION__AXIS_POSITION:
				setAxisPosition((IfcAxis1Placement)newValue);
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
			case Ifc2x3tc1Package.IFC_SURFACE_OF_REVOLUTION__AXIS_POSITION:
				setAxisPosition((IfcAxis1Placement)null);
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
			case Ifc2x3tc1Package.IFC_SURFACE_OF_REVOLUTION__AXIS_POSITION:
				return axisPosition != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcSurfaceOfRevolutionImpl
