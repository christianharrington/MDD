/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcVector;
import org.tech.iai.ifc.xml.ifc._2x3.final_.OrientationType2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Vector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcVectorImpl#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcVectorImpl#getMagnitude <em>Magnitude</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcVectorImpl extends IfcGeometricRepresentationItemImpl implements IfcVector {
	/**
	 * The cached value of the '{@link #getOrientation() <em>Orientation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected OrientationType2 orientation;

	/**
	 * The default value of the '{@link #getMagnitude() <em>Magnitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMagnitude()
	 * @generated
	 * @ordered
	 */
	protected static final Double MAGNITUDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMagnitude() <em>Magnitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMagnitude()
	 * @generated
	 * @ordered
	 */
	protected Double magnitude = MAGNITUDE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcVectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcVector();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrientationType2 getOrientation() {
		return orientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrientation(OrientationType2 newOrientation, NotificationChain msgs) {
		OrientationType2 oldOrientation = orientation;
		orientation = newOrientation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_VECTOR__ORIENTATION, oldOrientation, newOrientation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrientation(OrientationType2 newOrientation) {
		if (newOrientation != orientation) {
			NotificationChain msgs = null;
			if (orientation != null)
				msgs = ((InternalEObject)orientation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_VECTOR__ORIENTATION, null, msgs);
			if (newOrientation != null)
				msgs = ((InternalEObject)newOrientation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_VECTOR__ORIENTATION, null, msgs);
			msgs = basicSetOrientation(newOrientation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_VECTOR__ORIENTATION, newOrientation, newOrientation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMagnitude() {
		return magnitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMagnitude(Double newMagnitude) {
		Double oldMagnitude = magnitude;
		magnitude = newMagnitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_VECTOR__MAGNITUDE, oldMagnitude, magnitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_VECTOR__ORIENTATION:
				return basicSetOrientation(null, msgs);
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
			case FinalPackage.IFC_VECTOR__ORIENTATION:
				return getOrientation();
			case FinalPackage.IFC_VECTOR__MAGNITUDE:
				return getMagnitude();
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
			case FinalPackage.IFC_VECTOR__ORIENTATION:
				setOrientation((OrientationType2)newValue);
				return;
			case FinalPackage.IFC_VECTOR__MAGNITUDE:
				setMagnitude((Double)newValue);
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
			case FinalPackage.IFC_VECTOR__ORIENTATION:
				setOrientation((OrientationType2)null);
				return;
			case FinalPackage.IFC_VECTOR__MAGNITUDE:
				setMagnitude(MAGNITUDE_EDEFAULT);
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
			case FinalPackage.IFC_VECTOR__ORIENTATION:
				return orientation != null;
			case FinalPackage.IFC_VECTOR__MAGNITUDE:
				return MAGNITUDE_EDEFAULT == null ? magnitude != null : !MAGNITUDE_EDEFAULT.equals(magnitude);
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
		result.append(" (magnitude: ");
		result.append(magnitude);
		result.append(')');
		return result.toString();
	}

} //IfcVectorImpl
