/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcPropertySetDefinition;
import ifc2x3tc1.IfcRelDefinesByProperties;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Defines By Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcRelDefinesByPropertiesImpl#getRelatingPropertyDefinition <em>Relating Property Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelDefinesByPropertiesImpl extends IfcRelDefinesImpl implements IfcRelDefinesByProperties {
	/**
	 * The cached value of the '{@link #getRelatingPropertyDefinition() <em>Relating Property Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingPropertyDefinition()
	 * @generated
	 * @ordered
	 */
	protected IfcPropertySetDefinition relatingPropertyDefinition;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcRelDefinesByProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPropertySetDefinition getRelatingPropertyDefinition() {
		if (relatingPropertyDefinition != null && relatingPropertyDefinition.eIsProxy()) {
			InternalEObject oldRelatingPropertyDefinition = (InternalEObject)relatingPropertyDefinition;
			relatingPropertyDefinition = (IfcPropertySetDefinition)eResolveProxy(oldRelatingPropertyDefinition);
			if (relatingPropertyDefinition != oldRelatingPropertyDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_REL_DEFINES_BY_PROPERTIES__RELATING_PROPERTY_DEFINITION, oldRelatingPropertyDefinition, relatingPropertyDefinition));
			}
		}
		return relatingPropertyDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPropertySetDefinition basicGetRelatingPropertyDefinition() {
		return relatingPropertyDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatingPropertyDefinition(IfcPropertySetDefinition newRelatingPropertyDefinition, NotificationChain msgs) {
		IfcPropertySetDefinition oldRelatingPropertyDefinition = relatingPropertyDefinition;
		relatingPropertyDefinition = newRelatingPropertyDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_DEFINES_BY_PROPERTIES__RELATING_PROPERTY_DEFINITION, oldRelatingPropertyDefinition, newRelatingPropertyDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingPropertyDefinition(IfcPropertySetDefinition newRelatingPropertyDefinition) {
		if (newRelatingPropertyDefinition != relatingPropertyDefinition) {
			NotificationChain msgs = null;
			if (relatingPropertyDefinition != null)
				msgs = ((InternalEObject)relatingPropertyDefinition).eInverseRemove(this, Ifc2x3tc1Package.IFC_PROPERTY_SET_DEFINITION__PROPERTY_DEFINITION_OF, IfcPropertySetDefinition.class, msgs);
			if (newRelatingPropertyDefinition != null)
				msgs = ((InternalEObject)newRelatingPropertyDefinition).eInverseAdd(this, Ifc2x3tc1Package.IFC_PROPERTY_SET_DEFINITION__PROPERTY_DEFINITION_OF, IfcPropertySetDefinition.class, msgs);
			msgs = basicSetRelatingPropertyDefinition(newRelatingPropertyDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_DEFINES_BY_PROPERTIES__RELATING_PROPERTY_DEFINITION, newRelatingPropertyDefinition, newRelatingPropertyDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_REL_DEFINES_BY_PROPERTIES__RELATING_PROPERTY_DEFINITION:
				if (relatingPropertyDefinition != null)
					msgs = ((InternalEObject)relatingPropertyDefinition).eInverseRemove(this, Ifc2x3tc1Package.IFC_PROPERTY_SET_DEFINITION__PROPERTY_DEFINITION_OF, IfcPropertySetDefinition.class, msgs);
				return basicSetRelatingPropertyDefinition((IfcPropertySetDefinition)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_REL_DEFINES_BY_PROPERTIES__RELATING_PROPERTY_DEFINITION:
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
			case Ifc2x3tc1Package.IFC_REL_DEFINES_BY_PROPERTIES__RELATING_PROPERTY_DEFINITION:
				if (resolve) return getRelatingPropertyDefinition();
				return basicGetRelatingPropertyDefinition();
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
			case Ifc2x3tc1Package.IFC_REL_DEFINES_BY_PROPERTIES__RELATING_PROPERTY_DEFINITION:
				setRelatingPropertyDefinition((IfcPropertySetDefinition)newValue);
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
			case Ifc2x3tc1Package.IFC_REL_DEFINES_BY_PROPERTIES__RELATING_PROPERTY_DEFINITION:
				setRelatingPropertyDefinition((IfcPropertySetDefinition)null);
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
			case Ifc2x3tc1Package.IFC_REL_DEFINES_BY_PROPERTIES__RELATING_PROPERTY_DEFINITION:
				return relatingPropertyDefinition != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcRelDefinesByPropertiesImpl
