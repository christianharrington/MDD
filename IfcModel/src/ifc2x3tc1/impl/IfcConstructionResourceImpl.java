/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcConstructionResource;
import ifc2x3tc1.IfcMeasureWithUnit;
import ifc2x3tc1.IfcResourceConsumptionEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Construction Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcConstructionResourceImpl#getResourceIdentifier <em>Resource Identifier</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcConstructionResourceImpl#getResourceGroup <em>Resource Group</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcConstructionResourceImpl#getResourceConsumption <em>Resource Consumption</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcConstructionResourceImpl#getBaseQuantity <em>Base Quantity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcConstructionResourceImpl extends IfcResourceImpl implements IfcConstructionResource {
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
	 * This is true if the Resource Identifier attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean resourceIdentifierESet;

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
	 * This is true if the Resource Group attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean resourceGroupESet;

	/**
	 * The default value of the '{@link #getResourceConsumption() <em>Resource Consumption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceConsumption()
	 * @generated
	 * @ordered
	 */
	protected static final IfcResourceConsumptionEnum RESOURCE_CONSUMPTION_EDEFAULT = IfcResourceConsumptionEnum.NULL;

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
	 * This is true if the Resource Consumption attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean resourceConsumptionESet;

	/**
	 * The cached value of the '{@link #getBaseQuantity() <em>Base Quantity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseQuantity()
	 * @generated
	 * @ordered
	 */
	protected IfcMeasureWithUnit baseQuantity;

	/**
	 * This is true if the Base Quantity reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean baseQuantityESet;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcConstructionResource();
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
		boolean oldResourceIdentifierESet = resourceIdentifierESet;
		resourceIdentifierESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CONSTRUCTION_RESOURCE__RESOURCE_IDENTIFIER, oldResourceIdentifier, resourceIdentifier, !oldResourceIdentifierESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetResourceIdentifier() {
		String oldResourceIdentifier = resourceIdentifier;
		boolean oldResourceIdentifierESet = resourceIdentifierESet;
		resourceIdentifier = RESOURCE_IDENTIFIER_EDEFAULT;
		resourceIdentifierESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_CONSTRUCTION_RESOURCE__RESOURCE_IDENTIFIER, oldResourceIdentifier, RESOURCE_IDENTIFIER_EDEFAULT, oldResourceIdentifierESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetResourceIdentifier() {
		return resourceIdentifierESet;
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
		boolean oldResourceGroupESet = resourceGroupESet;
		resourceGroupESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CONSTRUCTION_RESOURCE__RESOURCE_GROUP, oldResourceGroup, resourceGroup, !oldResourceGroupESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetResourceGroup() {
		String oldResourceGroup = resourceGroup;
		boolean oldResourceGroupESet = resourceGroupESet;
		resourceGroup = RESOURCE_GROUP_EDEFAULT;
		resourceGroupESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_CONSTRUCTION_RESOURCE__RESOURCE_GROUP, oldResourceGroup, RESOURCE_GROUP_EDEFAULT, oldResourceGroupESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetResourceGroup() {
		return resourceGroupESet;
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
		resourceConsumption = newResourceConsumption == null ? RESOURCE_CONSUMPTION_EDEFAULT : newResourceConsumption;
		boolean oldResourceConsumptionESet = resourceConsumptionESet;
		resourceConsumptionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CONSTRUCTION_RESOURCE__RESOURCE_CONSUMPTION, oldResourceConsumption, resourceConsumption, !oldResourceConsumptionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetResourceConsumption() {
		IfcResourceConsumptionEnum oldResourceConsumption = resourceConsumption;
		boolean oldResourceConsumptionESet = resourceConsumptionESet;
		resourceConsumption = RESOURCE_CONSUMPTION_EDEFAULT;
		resourceConsumptionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_CONSTRUCTION_RESOURCE__RESOURCE_CONSUMPTION, oldResourceConsumption, RESOURCE_CONSUMPTION_EDEFAULT, oldResourceConsumptionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetResourceConsumption() {
		return resourceConsumptionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMeasureWithUnit getBaseQuantity() {
		if (baseQuantity != null && baseQuantity.eIsProxy()) {
			InternalEObject oldBaseQuantity = (InternalEObject)baseQuantity;
			baseQuantity = (IfcMeasureWithUnit)eResolveProxy(oldBaseQuantity);
			if (baseQuantity != oldBaseQuantity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_CONSTRUCTION_RESOURCE__BASE_QUANTITY, oldBaseQuantity, baseQuantity));
			}
		}
		return baseQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMeasureWithUnit basicGetBaseQuantity() {
		return baseQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseQuantity(IfcMeasureWithUnit newBaseQuantity) {
		IfcMeasureWithUnit oldBaseQuantity = baseQuantity;
		baseQuantity = newBaseQuantity;
		boolean oldBaseQuantityESet = baseQuantityESet;
		baseQuantityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CONSTRUCTION_RESOURCE__BASE_QUANTITY, oldBaseQuantity, baseQuantity, !oldBaseQuantityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBaseQuantity() {
		IfcMeasureWithUnit oldBaseQuantity = baseQuantity;
		boolean oldBaseQuantityESet = baseQuantityESet;
		baseQuantity = null;
		baseQuantityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_CONSTRUCTION_RESOURCE__BASE_QUANTITY, oldBaseQuantity, null, oldBaseQuantityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBaseQuantity() {
		return baseQuantityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_CONSTRUCTION_RESOURCE__RESOURCE_IDENTIFIER:
				return getResourceIdentifier();
			case Ifc2x3tc1Package.IFC_CONSTRUCTION_RESOURCE__RESOURCE_GROUP:
				return getResourceGroup();
			case Ifc2x3tc1Package.IFC_CONSTRUCTION_RESOURCE__RESOURCE_CONSUMPTION:
				return getResourceConsumption();
			case Ifc2x3tc1Package.IFC_CONSTRUCTION_RESOURCE__BASE_QUANTITY:
				if (resolve) return getBaseQuantity();
				return basicGetBaseQuantity();
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
			case Ifc2x3tc1Package.IFC_CONSTRUCTION_RESOURCE__RESOURCE_IDENTIFIER:
				setResourceIdentifier((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CONSTRUCTION_RESOURCE__RESOURCE_GROUP:
				setResourceGroup((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CONSTRUCTION_RESOURCE__RESOURCE_CONSUMPTION:
				setResourceConsumption((IfcResourceConsumptionEnum)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CONSTRUCTION_RESOURCE__BASE_QUANTITY:
				setBaseQuantity((IfcMeasureWithUnit)newValue);
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
			case Ifc2x3tc1Package.IFC_CONSTRUCTION_RESOURCE__RESOURCE_IDENTIFIER:
				unsetResourceIdentifier();
				return;
			case Ifc2x3tc1Package.IFC_CONSTRUCTION_RESOURCE__RESOURCE_GROUP:
				unsetResourceGroup();
				return;
			case Ifc2x3tc1Package.IFC_CONSTRUCTION_RESOURCE__RESOURCE_CONSUMPTION:
				unsetResourceConsumption();
				return;
			case Ifc2x3tc1Package.IFC_CONSTRUCTION_RESOURCE__BASE_QUANTITY:
				unsetBaseQuantity();
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
			case Ifc2x3tc1Package.IFC_CONSTRUCTION_RESOURCE__RESOURCE_IDENTIFIER:
				return isSetResourceIdentifier();
			case Ifc2x3tc1Package.IFC_CONSTRUCTION_RESOURCE__RESOURCE_GROUP:
				return isSetResourceGroup();
			case Ifc2x3tc1Package.IFC_CONSTRUCTION_RESOURCE__RESOURCE_CONSUMPTION:
				return isSetResourceConsumption();
			case Ifc2x3tc1Package.IFC_CONSTRUCTION_RESOURCE__BASE_QUANTITY:
				return isSetBaseQuantity();
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
		result.append(" (ResourceIdentifier: ");
		if (resourceIdentifierESet) result.append(resourceIdentifier); else result.append("<unset>");
		result.append(", ResourceGroup: ");
		if (resourceGroupESet) result.append(resourceGroup); else result.append("<unset>");
		result.append(", ResourceConsumption: ");
		if (resourceConsumptionESet) result.append(resourceConsumption); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcConstructionResourceImpl
