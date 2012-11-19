/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelDefinesByProperties;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingPropertyDefinitionType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Defines By Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelDefinesByPropertiesImpl#getRelatingPropertyDefinition <em>Relating Property Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelDefinesByPropertiesImpl extends IfcRelDefinesImpl implements IfcRelDefinesByProperties {
	/**
	 * The cached value of the '{@link #getRelatingPropertyDefinition() <em>Relating Property Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingPropertyDefinition()
	 * @generated
	 * @ordered
	 */
	protected RelatingPropertyDefinitionType relatingPropertyDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelDefinesByPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcRelDefinesByProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingPropertyDefinitionType getRelatingPropertyDefinition() {
		return relatingPropertyDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatingPropertyDefinition(RelatingPropertyDefinitionType newRelatingPropertyDefinition, NotificationChain msgs) {
		RelatingPropertyDefinitionType oldRelatingPropertyDefinition = relatingPropertyDefinition;
		relatingPropertyDefinition = newRelatingPropertyDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_DEFINES_BY_PROPERTIES__RELATING_PROPERTY_DEFINITION, oldRelatingPropertyDefinition, newRelatingPropertyDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingPropertyDefinition(RelatingPropertyDefinitionType newRelatingPropertyDefinition) {
		if (newRelatingPropertyDefinition != relatingPropertyDefinition) {
			NotificationChain msgs = null;
			if (relatingPropertyDefinition != null)
				msgs = ((InternalEObject)relatingPropertyDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_DEFINES_BY_PROPERTIES__RELATING_PROPERTY_DEFINITION, null, msgs);
			if (newRelatingPropertyDefinition != null)
				msgs = ((InternalEObject)newRelatingPropertyDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_DEFINES_BY_PROPERTIES__RELATING_PROPERTY_DEFINITION, null, msgs);
			msgs = basicSetRelatingPropertyDefinition(newRelatingPropertyDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_DEFINES_BY_PROPERTIES__RELATING_PROPERTY_DEFINITION, newRelatingPropertyDefinition, newRelatingPropertyDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_REL_DEFINES_BY_PROPERTIES__RELATING_PROPERTY_DEFINITION:
				return basicSetRelatingPropertyDefinition(null, msgs);
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
			case FinalPackage.IFC_REL_DEFINES_BY_PROPERTIES__RELATING_PROPERTY_DEFINITION:
				return getRelatingPropertyDefinition();
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
			case FinalPackage.IFC_REL_DEFINES_BY_PROPERTIES__RELATING_PROPERTY_DEFINITION:
				setRelatingPropertyDefinition((RelatingPropertyDefinitionType)newValue);
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
			case FinalPackage.IFC_REL_DEFINES_BY_PROPERTIES__RELATING_PROPERTY_DEFINITION:
				setRelatingPropertyDefinition((RelatingPropertyDefinitionType)null);
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
			case FinalPackage.IFC_REL_DEFINES_BY_PROPERTIES__RELATING_PROPERTY_DEFINITION:
				return relatingPropertyDefinition != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcRelDefinesByPropertiesImpl
