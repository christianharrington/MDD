/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcAxis2Placement3D;
import ifc2x3tc1.IfcProfileDef;
import ifc2x3tc1.IfcSweptAreaSolid;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Swept Area Solid</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcSweptAreaSolidImpl#getSweptArea <em>Swept Area</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSweptAreaSolidImpl#getPosition <em>Position</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcSweptAreaSolidImpl extends IfcSolidModelImpl implements IfcSweptAreaSolid {
	/**
	 * The cached value of the '{@link #getSweptArea() <em>Swept Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSweptArea()
	 * @generated
	 * @ordered
	 */
	protected IfcProfileDef sweptArea;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected IfcAxis2Placement3D position;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSweptAreaSolidImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcSweptAreaSolid();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProfileDef getSweptArea() {
		if (sweptArea != null && sweptArea.eIsProxy()) {
			InternalEObject oldSweptArea = (InternalEObject)sweptArea;
			sweptArea = (IfcProfileDef)eResolveProxy(oldSweptArea);
			if (sweptArea != oldSweptArea) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_SWEPT_AREA_SOLID__SWEPT_AREA, oldSweptArea, sweptArea));
			}
		}
		return sweptArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProfileDef basicGetSweptArea() {
		return sweptArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSweptArea(IfcProfileDef newSweptArea) {
		IfcProfileDef oldSweptArea = sweptArea;
		sweptArea = newSweptArea;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SWEPT_AREA_SOLID__SWEPT_AREA, oldSweptArea, sweptArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAxis2Placement3D getPosition() {
		if (position != null && position.eIsProxy()) {
			InternalEObject oldPosition = (InternalEObject)position;
			position = (IfcAxis2Placement3D)eResolveProxy(oldPosition);
			if (position != oldPosition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_SWEPT_AREA_SOLID__POSITION, oldPosition, position));
			}
		}
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAxis2Placement3D basicGetPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(IfcAxis2Placement3D newPosition) {
		IfcAxis2Placement3D oldPosition = position;
		position = newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SWEPT_AREA_SOLID__POSITION, oldPosition, position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_SWEPT_AREA_SOLID__SWEPT_AREA:
				if (resolve) return getSweptArea();
				return basicGetSweptArea();
			case Ifc2x3tc1Package.IFC_SWEPT_AREA_SOLID__POSITION:
				if (resolve) return getPosition();
				return basicGetPosition();
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
			case Ifc2x3tc1Package.IFC_SWEPT_AREA_SOLID__SWEPT_AREA:
				setSweptArea((IfcProfileDef)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SWEPT_AREA_SOLID__POSITION:
				setPosition((IfcAxis2Placement3D)newValue);
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
			case Ifc2x3tc1Package.IFC_SWEPT_AREA_SOLID__SWEPT_AREA:
				setSweptArea((IfcProfileDef)null);
				return;
			case Ifc2x3tc1Package.IFC_SWEPT_AREA_SOLID__POSITION:
				setPosition((IfcAxis2Placement3D)null);
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
			case Ifc2x3tc1Package.IFC_SWEPT_AREA_SOLID__SWEPT_AREA:
				return sweptArea != null;
			case Ifc2x3tc1Package.IFC_SWEPT_AREA_SOLID__POSITION:
				return position != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcSweptAreaSolidImpl
