/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.ExtrudedDirectionType1;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcExtrudedAreaSolid;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Extruded Area Solid</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcExtrudedAreaSolidImpl#getExtrudedDirection <em>Extruded Direction</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcExtrudedAreaSolidImpl#getDepth <em>Depth</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcExtrudedAreaSolidImpl extends IfcSweptAreaSolidImpl implements IfcExtrudedAreaSolid {
	/**
	 * The cached value of the '{@link #getExtrudedDirection() <em>Extruded Direction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrudedDirection()
	 * @generated
	 * @ordered
	 */
	protected ExtrudedDirectionType1 extrudedDirection;

	/**
	 * The default value of the '{@link #getDepth() <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepth()
	 * @generated
	 * @ordered
	 */
	protected static final double DEPTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDepth() <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepth()
	 * @generated
	 * @ordered
	 */
	protected double depth = DEPTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcExtrudedAreaSolidImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcExtrudedAreaSolid();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtrudedDirectionType1 getExtrudedDirection() {
		return extrudedDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtrudedDirection(ExtrudedDirectionType1 newExtrudedDirection, NotificationChain msgs) {
		ExtrudedDirectionType1 oldExtrudedDirection = extrudedDirection;
		extrudedDirection = newExtrudedDirection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_EXTRUDED_AREA_SOLID__EXTRUDED_DIRECTION, oldExtrudedDirection, newExtrudedDirection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtrudedDirection(ExtrudedDirectionType1 newExtrudedDirection) {
		if (newExtrudedDirection != extrudedDirection) {
			NotificationChain msgs = null;
			if (extrudedDirection != null)
				msgs = ((InternalEObject)extrudedDirection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_EXTRUDED_AREA_SOLID__EXTRUDED_DIRECTION, null, msgs);
			if (newExtrudedDirection != null)
				msgs = ((InternalEObject)newExtrudedDirection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_EXTRUDED_AREA_SOLID__EXTRUDED_DIRECTION, null, msgs);
			msgs = basicSetExtrudedDirection(newExtrudedDirection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_EXTRUDED_AREA_SOLID__EXTRUDED_DIRECTION, newExtrudedDirection, newExtrudedDirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDepth() {
		return depth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepth(double newDepth) {
		double oldDepth = depth;
		depth = newDepth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_EXTRUDED_AREA_SOLID__DEPTH, oldDepth, depth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_EXTRUDED_AREA_SOLID__EXTRUDED_DIRECTION:
				return basicSetExtrudedDirection(null, msgs);
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
			case FinalPackage.IFC_EXTRUDED_AREA_SOLID__EXTRUDED_DIRECTION:
				return getExtrudedDirection();
			case FinalPackage.IFC_EXTRUDED_AREA_SOLID__DEPTH:
				return getDepth();
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
			case FinalPackage.IFC_EXTRUDED_AREA_SOLID__EXTRUDED_DIRECTION:
				setExtrudedDirection((ExtrudedDirectionType1)newValue);
				return;
			case FinalPackage.IFC_EXTRUDED_AREA_SOLID__DEPTH:
				setDepth((Double)newValue);
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
			case FinalPackage.IFC_EXTRUDED_AREA_SOLID__EXTRUDED_DIRECTION:
				setExtrudedDirection((ExtrudedDirectionType1)null);
				return;
			case FinalPackage.IFC_EXTRUDED_AREA_SOLID__DEPTH:
				setDepth(DEPTH_EDEFAULT);
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
			case FinalPackage.IFC_EXTRUDED_AREA_SOLID__EXTRUDED_DIRECTION:
				return extrudedDirection != null;
			case FinalPackage.IFC_EXTRUDED_AREA_SOLID__DEPTH:
				return depth != DEPTH_EDEFAULT;
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
		result.append(" (depth: ");
		result.append(depth);
		result.append(')');
		return result.toString();
	}

} //IfcExtrudedAreaSolidImpl
