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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSectionProperties;
import org.tech.iai.ifc.xml.ifc._2x3.final_.SectionDefinitionType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Section Definition Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.SectionDefinitionTypeImpl#getIfcSectionProperties <em>Ifc Section Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SectionDefinitionTypeImpl extends EObjectImpl implements SectionDefinitionType {
	/**
	 * The cached value of the '{@link #getIfcSectionProperties() <em>Ifc Section Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcSectionProperties()
	 * @generated
	 * @ordered
	 */
	protected IfcSectionProperties ifcSectionProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SectionDefinitionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getSectionDefinitionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSectionProperties getIfcSectionProperties() {
		return ifcSectionProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcSectionProperties(IfcSectionProperties newIfcSectionProperties, NotificationChain msgs) {
		IfcSectionProperties oldIfcSectionProperties = ifcSectionProperties;
		ifcSectionProperties = newIfcSectionProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.SECTION_DEFINITION_TYPE__IFC_SECTION_PROPERTIES, oldIfcSectionProperties, newIfcSectionProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcSectionProperties(IfcSectionProperties newIfcSectionProperties) {
		if (newIfcSectionProperties != ifcSectionProperties) {
			NotificationChain msgs = null;
			if (ifcSectionProperties != null)
				msgs = ((InternalEObject)ifcSectionProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.SECTION_DEFINITION_TYPE__IFC_SECTION_PROPERTIES, null, msgs);
			if (newIfcSectionProperties != null)
				msgs = ((InternalEObject)newIfcSectionProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.SECTION_DEFINITION_TYPE__IFC_SECTION_PROPERTIES, null, msgs);
			msgs = basicSetIfcSectionProperties(newIfcSectionProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.SECTION_DEFINITION_TYPE__IFC_SECTION_PROPERTIES, newIfcSectionProperties, newIfcSectionProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.SECTION_DEFINITION_TYPE__IFC_SECTION_PROPERTIES:
				return basicSetIfcSectionProperties(null, msgs);
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
			case FinalPackage.SECTION_DEFINITION_TYPE__IFC_SECTION_PROPERTIES:
				return getIfcSectionProperties();
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
			case FinalPackage.SECTION_DEFINITION_TYPE__IFC_SECTION_PROPERTIES:
				setIfcSectionProperties((IfcSectionProperties)newValue);
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
			case FinalPackage.SECTION_DEFINITION_TYPE__IFC_SECTION_PROPERTIES:
				setIfcSectionProperties((IfcSectionProperties)null);
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
			case FinalPackage.SECTION_DEFINITION_TYPE__IFC_SECTION_PROPERTIES:
				return ifcSectionProperties != null;
		}
		return super.eIsSet(featureID);
	}

} //SectionDefinitionTypeImpl
