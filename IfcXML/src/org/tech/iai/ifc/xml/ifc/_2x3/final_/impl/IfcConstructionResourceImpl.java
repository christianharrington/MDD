/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.BaseQuantityType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcConstructionResource;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcResourceConsumptionEnum;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Construction Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcConstructionResourceImpl#getResourceIdentifier <em>Resource Identifier</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcConstructionResourceImpl#getResourceGroup <em>Resource Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcConstructionResourceImpl#getResourceConsumption <em>Resource Consumption</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcConstructionResourceImpl#getBaseQuantity <em>Base Quantity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class IfcConstructionResourceImpl extends IfcResourceImpl implements IfcConstructionResource {
	/**
	 * The default value of the '{@link #getResourceIdentifier() <em>Resource Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResourceIdentifier() <em>Resource Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String resourceIdentifier = RESOURCE_IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getResourceGroup() <em>Resource Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceGroup()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_GROUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResourceGroup() <em>Resource Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceGroup()
	 * @generated
	 * @ordered
	 */
	protected String resourceGroup = RESOURCE_GROUP_EDEFAULT;

	/**
	 * The default value of the '{@link #getResourceConsumption() <em>Resource Consumption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceConsumption()
	 * @generated
	 * @ordered
	 */
	protected static final IfcResourceConsumptionEnum RESOURCE_CONSUMPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResourceConsumption() <em>Resource Consumption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceConsumption()
	 * @generated
	 * @ordered
	 */
	protected IfcResourceConsumptionEnum resourceConsumption = RESOURCE_CONSUMPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBaseQuantity() <em>Base Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseQuantity()
	 * @generated
	 * @ordered
	 */
	protected BaseQuantityType baseQuantity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcConstructionResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcConstructionResource();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResourceIdentifier() {
		return resourceIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceIdentifier(String newResourceIdentifier) {
		String oldResourceIdentifier = resourceIdentifier;
		resourceIdentifier = newResourceIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CONSTRUCTION_RESOURCE__RESOURCE_IDENTIFIER, oldResourceIdentifier, resourceIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResourceGroup() {
		return resourceGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceGroup(String newResourceGroup) {
		String oldResourceGroup = resourceGroup;
		resourceGroup = newResourceGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CONSTRUCTION_RESOURCE__RESOURCE_GROUP, oldResourceGroup, resourceGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcResourceConsumptionEnum getResourceConsumption() {
		return resourceConsumption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceConsumption(IfcResourceConsumptionEnum newResourceConsumption) {
		IfcResourceConsumptionEnum oldResourceConsumption = resourceConsumption;
		resourceConsumption = newResourceConsumption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CONSTRUCTION_RESOURCE__RESOURCE_CONSUMPTION, oldResourceConsumption, resourceConsumption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseQuantityType getBaseQuantity() {
		return baseQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaseQuantity(BaseQuantityType newBaseQuantity, NotificationChain msgs) {
		BaseQuantityType oldBaseQuantity = baseQuantity;
		baseQuantity = newBaseQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CONSTRUCTION_RESOURCE__BASE_QUANTITY, oldBaseQuantity, newBaseQuantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseQuantity(BaseQuantityType newBaseQuantity) {
		if (newBaseQuantity != baseQuantity) {
			NotificationChain msgs = null;
			if (baseQuantity != null)
				msgs = ((InternalEObject)baseQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CONSTRUCTION_RESOURCE__BASE_QUANTITY, null, msgs);
			if (newBaseQuantity != null)
				msgs = ((InternalEObject)newBaseQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CONSTRUCTION_RESOURCE__BASE_QUANTITY, null, msgs);
			msgs = basicSetBaseQuantity(newBaseQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CONSTRUCTION_RESOURCE__BASE_QUANTITY, newBaseQuantity, newBaseQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_CONSTRUCTION_RESOURCE__BASE_QUANTITY:
				return basicSetBaseQuantity(null, msgs);
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
			case FinalPackage.IFC_CONSTRUCTION_RESOURCE__RESOURCE_IDENTIFIER:
				return getResourceIdentifier();
			case FinalPackage.IFC_CONSTRUCTION_RESOURCE__RESOURCE_GROUP:
				return getResourceGroup();
			case FinalPackage.IFC_CONSTRUCTION_RESOURCE__RESOURCE_CONSUMPTION:
				return getResourceConsumption();
			case FinalPackage.IFC_CONSTRUCTION_RESOURCE__BASE_QUANTITY:
				return getBaseQuantity();
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
			case FinalPackage.IFC_CONSTRUCTION_RESOURCE__RESOURCE_IDENTIFIER:
				setResourceIdentifier((String)newValue);
				return;
			case FinalPackage.IFC_CONSTRUCTION_RESOURCE__RESOURCE_GROUP:
				setResourceGroup((String)newValue);
				return;
			case FinalPackage.IFC_CONSTRUCTION_RESOURCE__RESOURCE_CONSUMPTION:
				setResourceConsumption((IfcResourceConsumptionEnum)newValue);
				return;
			case FinalPackage.IFC_CONSTRUCTION_RESOURCE__BASE_QUANTITY:
				setBaseQuantity((BaseQuantityType)newValue);
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
			case FinalPackage.IFC_CONSTRUCTION_RESOURCE__RESOURCE_IDENTIFIER:
				setResourceIdentifier(RESOURCE_IDENTIFIER_EDEFAULT);
				return;
			case FinalPackage.IFC_CONSTRUCTION_RESOURCE__RESOURCE_GROUP:
				setResourceGroup(RESOURCE_GROUP_EDEFAULT);
				return;
			case FinalPackage.IFC_CONSTRUCTION_RESOURCE__RESOURCE_CONSUMPTION:
				setResourceConsumption(RESOURCE_CONSUMPTION_EDEFAULT);
				return;
			case FinalPackage.IFC_CONSTRUCTION_RESOURCE__BASE_QUANTITY:
				setBaseQuantity((BaseQuantityType)null);
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
			case FinalPackage.IFC_CONSTRUCTION_RESOURCE__RESOURCE_IDENTIFIER:
				return RESOURCE_IDENTIFIER_EDEFAULT == null ? resourceIdentifier != null : !RESOURCE_IDENTIFIER_EDEFAULT.equals(resourceIdentifier);
			case FinalPackage.IFC_CONSTRUCTION_RESOURCE__RESOURCE_GROUP:
				return RESOURCE_GROUP_EDEFAULT == null ? resourceGroup != null : !RESOURCE_GROUP_EDEFAULT.equals(resourceGroup);
			case FinalPackage.IFC_CONSTRUCTION_RESOURCE__RESOURCE_CONSUMPTION:
				return RESOURCE_CONSUMPTION_EDEFAULT == null ? resourceConsumption != null : !RESOURCE_CONSUMPTION_EDEFAULT.equals(resourceConsumption);
			case FinalPackage.IFC_CONSTRUCTION_RESOURCE__BASE_QUANTITY:
				return baseQuantity != null;
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
		result.append(" (resourceIdentifier: ");
		result.append(resourceIdentifier);
		result.append(", resourceGroup: ");
		result.append(resourceGroup);
		result.append(", resourceConsumption: ");
		result.append(resourceConsumption);
		result.append(')');
		return result.toString();
	}

} //IfcConstructionResourceImpl
