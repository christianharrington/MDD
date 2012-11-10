/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcEnvironmentalImpactCategoryEnum;
import ifc2x3tc1.IfcEnvironmentalImpactValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Environmental Impact Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcEnvironmentalImpactValueImpl#getImpactType <em>Impact Type</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcEnvironmentalImpactValueImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcEnvironmentalImpactValueImpl#getUserDefinedCategory <em>User Defined Category</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcEnvironmentalImpactValueImpl extends IfcAppliedValueImpl implements IfcEnvironmentalImpactValue {
	/**
	 * The default value of the '{@link #getImpactType() <em>Impact Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpactType()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPACT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImpactType() <em>Impact Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpactType()
	 * @generated
	 * @ordered
	 */
	protected String impactType = IMPACT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final IfcEnvironmentalImpactCategoryEnum CATEGORY_EDEFAULT = IfcEnvironmentalImpactCategoryEnum.NULL;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected IfcEnvironmentalImpactCategoryEnum category = CATEGORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserDefinedCategory() <em>User Defined Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDefinedCategory()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_DEFINED_CATEGORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserDefinedCategory() <em>User Defined Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDefinedCategory()
	 * @generated
	 * @ordered
	 */
	protected String userDefinedCategory = USER_DEFINED_CATEGORY_EDEFAULT;

	/**
	 * This is true if the User Defined Category attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean userDefinedCategoryESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcEnvironmentalImpactValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcEnvironmentalImpactValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImpactType() {
		return impactType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImpactType(String newImpactType) {
		String oldImpactType = impactType;
		impactType = newImpactType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ENVIRONMENTAL_IMPACT_VALUE__IMPACT_TYPE, oldImpactType, impactType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcEnvironmentalImpactCategoryEnum getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(IfcEnvironmentalImpactCategoryEnum newCategory) {
		IfcEnvironmentalImpactCategoryEnum oldCategory = category;
		category = newCategory == null ? CATEGORY_EDEFAULT : newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ENVIRONMENTAL_IMPACT_VALUE__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserDefinedCategory() {
		return userDefinedCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserDefinedCategory(String newUserDefinedCategory) {
		String oldUserDefinedCategory = userDefinedCategory;
		userDefinedCategory = newUserDefinedCategory;
		boolean oldUserDefinedCategoryESet = userDefinedCategoryESet;
		userDefinedCategoryESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ENVIRONMENTAL_IMPACT_VALUE__USER_DEFINED_CATEGORY, oldUserDefinedCategory, userDefinedCategory, !oldUserDefinedCategoryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUserDefinedCategory() {
		String oldUserDefinedCategory = userDefinedCategory;
		boolean oldUserDefinedCategoryESet = userDefinedCategoryESet;
		userDefinedCategory = USER_DEFINED_CATEGORY_EDEFAULT;
		userDefinedCategoryESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_ENVIRONMENTAL_IMPACT_VALUE__USER_DEFINED_CATEGORY, oldUserDefinedCategory, USER_DEFINED_CATEGORY_EDEFAULT, oldUserDefinedCategoryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUserDefinedCategory() {
		return userDefinedCategoryESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_ENVIRONMENTAL_IMPACT_VALUE__IMPACT_TYPE:
				return getImpactType();
			case Ifc2x3tc1Package.IFC_ENVIRONMENTAL_IMPACT_VALUE__CATEGORY:
				return getCategory();
			case Ifc2x3tc1Package.IFC_ENVIRONMENTAL_IMPACT_VALUE__USER_DEFINED_CATEGORY:
				return getUserDefinedCategory();
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
			case Ifc2x3tc1Package.IFC_ENVIRONMENTAL_IMPACT_VALUE__IMPACT_TYPE:
				setImpactType((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ENVIRONMENTAL_IMPACT_VALUE__CATEGORY:
				setCategory((IfcEnvironmentalImpactCategoryEnum)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ENVIRONMENTAL_IMPACT_VALUE__USER_DEFINED_CATEGORY:
				setUserDefinedCategory((String)newValue);
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
			case Ifc2x3tc1Package.IFC_ENVIRONMENTAL_IMPACT_VALUE__IMPACT_TYPE:
				setImpactType(IMPACT_TYPE_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_ENVIRONMENTAL_IMPACT_VALUE__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_ENVIRONMENTAL_IMPACT_VALUE__USER_DEFINED_CATEGORY:
				unsetUserDefinedCategory();
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
			case Ifc2x3tc1Package.IFC_ENVIRONMENTAL_IMPACT_VALUE__IMPACT_TYPE:
				return IMPACT_TYPE_EDEFAULT == null ? impactType != null : !IMPACT_TYPE_EDEFAULT.equals(impactType);
			case Ifc2x3tc1Package.IFC_ENVIRONMENTAL_IMPACT_VALUE__CATEGORY:
				return category != CATEGORY_EDEFAULT;
			case Ifc2x3tc1Package.IFC_ENVIRONMENTAL_IMPACT_VALUE__USER_DEFINED_CATEGORY:
				return isSetUserDefinedCategory();
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
		result.append(" (ImpactType: ");
		result.append(impactType);
		result.append(", Category: ");
		result.append(category);
		result.append(", UserDefinedCategory: ");
		if (userDefinedCategoryESet) result.append(userDefinedCategory); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcEnvironmentalImpactValueImpl
