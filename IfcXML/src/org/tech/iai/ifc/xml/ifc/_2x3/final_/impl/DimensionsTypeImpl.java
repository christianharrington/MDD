/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.DimensionsType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDimensionalExponents;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dimensions Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.DimensionsTypeImpl#getIfcDimensionalExponents <em>Ifc Dimensional Exponents</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DimensionsTypeImpl extends EObjectImpl implements DimensionsType {
	/**
	 * The cached value of the '{@link #getIfcDimensionalExponents() <em>Ifc Dimensional Exponents</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcDimensionalExponents()
	 * @generated
	 * @ordered
	 */
	protected IfcDimensionalExponents ifcDimensionalExponents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DimensionsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getDimensionsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDimensionalExponents getIfcDimensionalExponents() {
		return ifcDimensionalExponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcDimensionalExponents(IfcDimensionalExponents newIfcDimensionalExponents, NotificationChain msgs) {
		IfcDimensionalExponents oldIfcDimensionalExponents = ifcDimensionalExponents;
		ifcDimensionalExponents = newIfcDimensionalExponents;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.DIMENSIONS_TYPE__IFC_DIMENSIONAL_EXPONENTS, oldIfcDimensionalExponents, newIfcDimensionalExponents);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcDimensionalExponents(IfcDimensionalExponents newIfcDimensionalExponents) {
		if (newIfcDimensionalExponents != ifcDimensionalExponents) {
			NotificationChain msgs = null;
			if (ifcDimensionalExponents != null)
				msgs = ((InternalEObject)ifcDimensionalExponents).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.DIMENSIONS_TYPE__IFC_DIMENSIONAL_EXPONENTS, null, msgs);
			if (newIfcDimensionalExponents != null)
				msgs = ((InternalEObject)newIfcDimensionalExponents).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.DIMENSIONS_TYPE__IFC_DIMENSIONAL_EXPONENTS, null, msgs);
			msgs = basicSetIfcDimensionalExponents(newIfcDimensionalExponents, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.DIMENSIONS_TYPE__IFC_DIMENSIONAL_EXPONENTS, newIfcDimensionalExponents, newIfcDimensionalExponents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.DIMENSIONS_TYPE__IFC_DIMENSIONAL_EXPONENTS:
				return basicSetIfcDimensionalExponents(null, msgs);
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
			case FinalPackage.DIMENSIONS_TYPE__IFC_DIMENSIONAL_EXPONENTS:
				return getIfcDimensionalExponents();
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
			case FinalPackage.DIMENSIONS_TYPE__IFC_DIMENSIONAL_EXPONENTS:
				setIfcDimensionalExponents((IfcDimensionalExponents)newValue);
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
			case FinalPackage.DIMENSIONS_TYPE__IFC_DIMENSIONAL_EXPONENTS:
				setIfcDimensionalExponents((IfcDimensionalExponents)null);
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
			case FinalPackage.DIMENSIONS_TYPE__IFC_DIMENSIONAL_EXPONENTS:
				return ifcDimensionalExponents != null;
		}
		return super.eIsSet(featureID);
	}

} //DimensionsTypeImpl
