/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.HasPropertiesType1;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcComplexProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Complex Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcComplexPropertyImpl#getUsageName <em>Usage Name</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcComplexPropertyImpl#getHasProperties <em>Has Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcComplexPropertyImpl extends IfcPropertyImpl implements IfcComplexProperty {
	/**
	 * The default value of the '{@link #getUsageName() <em>Usage Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageName()
	 * @generated
	 * @ordered
	 */
	protected static final String USAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsageName() <em>Usage Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageName()
	 * @generated
	 * @ordered
	 */
	protected String usageName = USAGE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasProperties() <em>Has Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasProperties()
	 * @generated
	 * @ordered
	 */
	protected HasPropertiesType1 hasProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcComplexPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcComplexProperty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsageName() {
		return usageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsageName(String newUsageName) {
		String oldUsageName = usageName;
		usageName = newUsageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_COMPLEX_PROPERTY__USAGE_NAME, oldUsageName, usageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HasPropertiesType1 getHasProperties() {
		return hasProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasProperties(HasPropertiesType1 newHasProperties, NotificationChain msgs) {
		HasPropertiesType1 oldHasProperties = hasProperties;
		hasProperties = newHasProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_COMPLEX_PROPERTY__HAS_PROPERTIES, oldHasProperties, newHasProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasProperties(HasPropertiesType1 newHasProperties) {
		if (newHasProperties != hasProperties) {
			NotificationChain msgs = null;
			if (hasProperties != null)
				msgs = ((InternalEObject)hasProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_COMPLEX_PROPERTY__HAS_PROPERTIES, null, msgs);
			if (newHasProperties != null)
				msgs = ((InternalEObject)newHasProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_COMPLEX_PROPERTY__HAS_PROPERTIES, null, msgs);
			msgs = basicSetHasProperties(newHasProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_COMPLEX_PROPERTY__HAS_PROPERTIES, newHasProperties, newHasProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_COMPLEX_PROPERTY__HAS_PROPERTIES:
				return basicSetHasProperties(null, msgs);
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
			case FinalPackage.IFC_COMPLEX_PROPERTY__USAGE_NAME:
				return getUsageName();
			case FinalPackage.IFC_COMPLEX_PROPERTY__HAS_PROPERTIES:
				return getHasProperties();
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
			case FinalPackage.IFC_COMPLEX_PROPERTY__USAGE_NAME:
				setUsageName((String)newValue);
				return;
			case FinalPackage.IFC_COMPLEX_PROPERTY__HAS_PROPERTIES:
				setHasProperties((HasPropertiesType1)newValue);
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
			case FinalPackage.IFC_COMPLEX_PROPERTY__USAGE_NAME:
				setUsageName(USAGE_NAME_EDEFAULT);
				return;
			case FinalPackage.IFC_COMPLEX_PROPERTY__HAS_PROPERTIES:
				setHasProperties((HasPropertiesType1)null);
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
			case FinalPackage.IFC_COMPLEX_PROPERTY__USAGE_NAME:
				return USAGE_NAME_EDEFAULT == null ? usageName != null : !USAGE_NAME_EDEFAULT.equals(usageName);
			case FinalPackage.IFC_COMPLEX_PROPERTY__HAS_PROPERTIES:
				return hasProperties != null;
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
		result.append(" (usageName: ");
		result.append(usageName);
		result.append(')');
		return result.toString();
	}

} //IfcComplexPropertyImpl
