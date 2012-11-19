/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcElementQuantity;
import org.tech.iai.ifc.xml.ifc._2x3.final_.QuantitiesType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Element Quantity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcElementQuantityImpl#getMethodOfMeasurement <em>Method Of Measurement</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcElementQuantityImpl#getQuantities <em>Quantities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcElementQuantityImpl extends IfcPropertySetDefinitionImpl implements IfcElementQuantity {
	/**
	 * The default value of the '{@link #getMethodOfMeasurement() <em>Method Of Measurement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodOfMeasurement()
	 * @generated
	 * @ordered
	 */
	protected static final String METHOD_OF_MEASUREMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMethodOfMeasurement() <em>Method Of Measurement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodOfMeasurement()
	 * @generated
	 * @ordered
	 */
	protected String methodOfMeasurement = METHOD_OF_MEASUREMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getQuantities() <em>Quantities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantities()
	 * @generated
	 * @ordered
	 */
	protected QuantitiesType quantities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcElementQuantityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcElementQuantity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMethodOfMeasurement() {
		return methodOfMeasurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodOfMeasurement(String newMethodOfMeasurement) {
		String oldMethodOfMeasurement = methodOfMeasurement;
		methodOfMeasurement = newMethodOfMeasurement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_ELEMENT_QUANTITY__METHOD_OF_MEASUREMENT, oldMethodOfMeasurement, methodOfMeasurement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantitiesType getQuantities() {
		return quantities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantities(QuantitiesType newQuantities, NotificationChain msgs) {
		QuantitiesType oldQuantities = quantities;
		quantities = newQuantities;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_ELEMENT_QUANTITY__QUANTITIES, oldQuantities, newQuantities);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantities(QuantitiesType newQuantities) {
		if (newQuantities != quantities) {
			NotificationChain msgs = null;
			if (quantities != null)
				msgs = ((InternalEObject)quantities).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_ELEMENT_QUANTITY__QUANTITIES, null, msgs);
			if (newQuantities != null)
				msgs = ((InternalEObject)newQuantities).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_ELEMENT_QUANTITY__QUANTITIES, null, msgs);
			msgs = basicSetQuantities(newQuantities, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_ELEMENT_QUANTITY__QUANTITIES, newQuantities, newQuantities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_ELEMENT_QUANTITY__QUANTITIES:
				return basicSetQuantities(null, msgs);
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
			case FinalPackage.IFC_ELEMENT_QUANTITY__METHOD_OF_MEASUREMENT:
				return getMethodOfMeasurement();
			case FinalPackage.IFC_ELEMENT_QUANTITY__QUANTITIES:
				return getQuantities();
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
			case FinalPackage.IFC_ELEMENT_QUANTITY__METHOD_OF_MEASUREMENT:
				setMethodOfMeasurement((String)newValue);
				return;
			case FinalPackage.IFC_ELEMENT_QUANTITY__QUANTITIES:
				setQuantities((QuantitiesType)newValue);
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
			case FinalPackage.IFC_ELEMENT_QUANTITY__METHOD_OF_MEASUREMENT:
				setMethodOfMeasurement(METHOD_OF_MEASUREMENT_EDEFAULT);
				return;
			case FinalPackage.IFC_ELEMENT_QUANTITY__QUANTITIES:
				setQuantities((QuantitiesType)null);
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
			case FinalPackage.IFC_ELEMENT_QUANTITY__METHOD_OF_MEASUREMENT:
				return METHOD_OF_MEASUREMENT_EDEFAULT == null ? methodOfMeasurement != null : !METHOD_OF_MEASUREMENT_EDEFAULT.equals(methodOfMeasurement);
			case FinalPackage.IFC_ELEMENT_QUANTITY__QUANTITIES:
				return quantities != null;
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
		result.append(" (methodOfMeasurement: ");
		result.append(methodOfMeasurement);
		result.append(')');
		return result.toString();
	}

} //IfcElementQuantityImpl
