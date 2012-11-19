/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelOverridesProperties;
import org.tech.iai.ifc.xml.ifc._2x3.final_.OverridingPropertiesType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Overrides Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelOverridesPropertiesImpl#getOverridingProperties <em>Overriding Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelOverridesPropertiesImpl extends IfcRelDefinesByPropertiesImpl implements IfcRelOverridesProperties {
	/**
	 * The cached value of the '{@link #getOverridingProperties() <em>Overriding Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverridingProperties()
	 * @generated
	 * @ordered
	 */
	protected OverridingPropertiesType overridingProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelOverridesPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcRelOverridesProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OverridingPropertiesType getOverridingProperties() {
		return overridingProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOverridingProperties(OverridingPropertiesType newOverridingProperties, NotificationChain msgs) {
		OverridingPropertiesType oldOverridingProperties = overridingProperties;
		overridingProperties = newOverridingProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_OVERRIDES_PROPERTIES__OVERRIDING_PROPERTIES, oldOverridingProperties, newOverridingProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverridingProperties(OverridingPropertiesType newOverridingProperties) {
		if (newOverridingProperties != overridingProperties) {
			NotificationChain msgs = null;
			if (overridingProperties != null)
				msgs = ((InternalEObject)overridingProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_OVERRIDES_PROPERTIES__OVERRIDING_PROPERTIES, null, msgs);
			if (newOverridingProperties != null)
				msgs = ((InternalEObject)newOverridingProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_OVERRIDES_PROPERTIES__OVERRIDING_PROPERTIES, null, msgs);
			msgs = basicSetOverridingProperties(newOverridingProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_OVERRIDES_PROPERTIES__OVERRIDING_PROPERTIES, newOverridingProperties, newOverridingProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_REL_OVERRIDES_PROPERTIES__OVERRIDING_PROPERTIES:
				return basicSetOverridingProperties(null, msgs);
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
			case FinalPackage.IFC_REL_OVERRIDES_PROPERTIES__OVERRIDING_PROPERTIES:
				return getOverridingProperties();
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
			case FinalPackage.IFC_REL_OVERRIDES_PROPERTIES__OVERRIDING_PROPERTIES:
				setOverridingProperties((OverridingPropertiesType)newValue);
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
			case FinalPackage.IFC_REL_OVERRIDES_PROPERTIES__OVERRIDING_PROPERTIES:
				setOverridingProperties((OverridingPropertiesType)null);
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
			case FinalPackage.IFC_REL_OVERRIDES_PROPERTIES__OVERRIDING_PROPERTIES:
				return overridingProperties != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcRelOverridesPropertiesImpl
