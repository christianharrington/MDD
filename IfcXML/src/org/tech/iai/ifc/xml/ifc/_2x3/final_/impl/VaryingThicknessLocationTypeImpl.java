/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcShapeAspect;
import org.tech.iai.ifc.xml.ifc._2x3.final_.VaryingThicknessLocationType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Varying Thickness Location Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.VaryingThicknessLocationTypeImpl#getIfcShapeAspect <em>Ifc Shape Aspect</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VaryingThicknessLocationTypeImpl extends EObjectImpl implements VaryingThicknessLocationType {
	/**
	 * The cached value of the '{@link #getIfcShapeAspect() <em>Ifc Shape Aspect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcShapeAspect()
	 * @generated
	 * @ordered
	 */
	protected IfcShapeAspect ifcShapeAspect;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VaryingThicknessLocationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getVaryingThicknessLocationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcShapeAspect getIfcShapeAspect() {
		return ifcShapeAspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcShapeAspect(IfcShapeAspect newIfcShapeAspect, NotificationChain msgs) {
		IfcShapeAspect oldIfcShapeAspect = ifcShapeAspect;
		ifcShapeAspect = newIfcShapeAspect;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.VARYING_THICKNESS_LOCATION_TYPE__IFC_SHAPE_ASPECT, oldIfcShapeAspect, newIfcShapeAspect);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcShapeAspect(IfcShapeAspect newIfcShapeAspect) {
		if (newIfcShapeAspect != ifcShapeAspect) {
			NotificationChain msgs = null;
			if (ifcShapeAspect != null)
				msgs = ((InternalEObject)ifcShapeAspect).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.VARYING_THICKNESS_LOCATION_TYPE__IFC_SHAPE_ASPECT, null, msgs);
			if (newIfcShapeAspect != null)
				msgs = ((InternalEObject)newIfcShapeAspect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.VARYING_THICKNESS_LOCATION_TYPE__IFC_SHAPE_ASPECT, null, msgs);
			msgs = basicSetIfcShapeAspect(newIfcShapeAspect, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.VARYING_THICKNESS_LOCATION_TYPE__IFC_SHAPE_ASPECT, newIfcShapeAspect, newIfcShapeAspect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.VARYING_THICKNESS_LOCATION_TYPE__IFC_SHAPE_ASPECT:
				return basicSetIfcShapeAspect(null, msgs);
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
			case FinalPackage.VARYING_THICKNESS_LOCATION_TYPE__IFC_SHAPE_ASPECT:
				return getIfcShapeAspect();
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
			case FinalPackage.VARYING_THICKNESS_LOCATION_TYPE__IFC_SHAPE_ASPECT:
				setIfcShapeAspect((IfcShapeAspect)newValue);
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
			case FinalPackage.VARYING_THICKNESS_LOCATION_TYPE__IFC_SHAPE_ASPECT:
				setIfcShapeAspect((IfcShapeAspect)null);
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
			case FinalPackage.VARYING_THICKNESS_LOCATION_TYPE__IFC_SHAPE_ASPECT:
				return ifcShapeAspect != null;
		}
		return super.eIsSet(featureID);
	}

} //VaryingThicknessLocationTypeImpl
