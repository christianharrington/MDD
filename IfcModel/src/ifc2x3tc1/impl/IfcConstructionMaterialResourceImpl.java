/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcActorSelect;
import ifc2x3tc1.IfcConstructionMaterialResource;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Construction Material Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcConstructionMaterialResourceImpl#getSuppliers <em>Suppliers</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcConstructionMaterialResourceImpl#getUsageRatio <em>Usage Ratio</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcConstructionMaterialResourceImpl#getUsageRatioAsString <em>Usage Ratio As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcConstructionMaterialResourceImpl extends IfcConstructionResourceImpl implements IfcConstructionMaterialResource {
	/**
	 * The cached value of the '{@link #getSuppliers() <em>Suppliers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuppliers()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcActorSelect> suppliers;

	/**
	 * The default value of the '{@link #getUsageRatio() <em>Usage Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageRatio()
	 * @generated
	 * @ordered
	 */
	protected static final double USAGE_RATIO_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getUsageRatio() <em>Usage Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageRatio()
	 * @generated
	 * @ordered
	 */
	protected double usageRatio = USAGE_RATIO_EDEFAULT;

	/**
	 * This is true if the Usage Ratio attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean usageRatioESet;

	/**
	 * The default value of the '{@link #getUsageRatioAsString() <em>Usage Ratio As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageRatioAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String USAGE_RATIO_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsageRatioAsString() <em>Usage Ratio As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageRatioAsString()
	 * @generated
	 * @ordered
	 */
	protected String usageRatioAsString = USAGE_RATIO_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Usage Ratio As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean usageRatioAsStringESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcConstructionMaterialResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcConstructionMaterialResource();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcActorSelect> getSuppliers() {
		if (suppliers == null) {
			suppliers = new EObjectResolvingEList.Unsettable<IfcActorSelect>(IfcActorSelect.class, this, Ifc2x3tc1Package.IFC_CONSTRUCTION_MATERIAL_RESOURCE__SUPPLIERS);
		}
		return suppliers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSuppliers() {
		if (suppliers != null) ((InternalEList.Unsettable<?>)suppliers).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSuppliers() {
		return suppliers != null && ((InternalEList.Unsettable<?>)suppliers).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getUsageRatio() {
		return usageRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsageRatio(double newUsageRatio) {
		double oldUsageRatio = usageRatio;
		usageRatio = newUsageRatio;
		boolean oldUsageRatioESet = usageRatioESet;
		usageRatioESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CONSTRUCTION_MATERIAL_RESOURCE__USAGE_RATIO, oldUsageRatio, usageRatio, !oldUsageRatioESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUsageRatio() {
		double oldUsageRatio = usageRatio;
		boolean oldUsageRatioESet = usageRatioESet;
		usageRatio = USAGE_RATIO_EDEFAULT;
		usageRatioESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_CONSTRUCTION_MATERIAL_RESOURCE__USAGE_RATIO, oldUsageRatio, USAGE_RATIO_EDEFAULT, oldUsageRatioESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUsageRatio() {
		return usageRatioESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsageRatioAsString() {
		return usageRatioAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsageRatioAsString(String newUsageRatioAsString) {
		String oldUsageRatioAsString = usageRatioAsString;
		usageRatioAsString = newUsageRatioAsString;
		boolean oldUsageRatioAsStringESet = usageRatioAsStringESet;
		usageRatioAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CONSTRUCTION_MATERIAL_RESOURCE__USAGE_RATIO_AS_STRING, oldUsageRatioAsString, usageRatioAsString, !oldUsageRatioAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUsageRatioAsString() {
		String oldUsageRatioAsString = usageRatioAsString;
		boolean oldUsageRatioAsStringESet = usageRatioAsStringESet;
		usageRatioAsString = USAGE_RATIO_AS_STRING_EDEFAULT;
		usageRatioAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_CONSTRUCTION_MATERIAL_RESOURCE__USAGE_RATIO_AS_STRING, oldUsageRatioAsString, USAGE_RATIO_AS_STRING_EDEFAULT, oldUsageRatioAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUsageRatioAsString() {
		return usageRatioAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_CONSTRUCTION_MATERIAL_RESOURCE__SUPPLIERS:
				return getSuppliers();
			case Ifc2x3tc1Package.IFC_CONSTRUCTION_MATERIAL_RESOURCE__USAGE_RATIO:
				return getUsageRatio();
			case Ifc2x3tc1Package.IFC_CONSTRUCTION_MATERIAL_RESOURCE__USAGE_RATIO_AS_STRING:
				return getUsageRatioAsString();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_CONSTRUCTION_MATERIAL_RESOURCE__SUPPLIERS:
				getSuppliers().clear();
				getSuppliers().addAll((Collection<? extends IfcActorSelect>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CONSTRUCTION_MATERIAL_RESOURCE__USAGE_RATIO:
				setUsageRatio((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CONSTRUCTION_MATERIAL_RESOURCE__USAGE_RATIO_AS_STRING:
				setUsageRatioAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_CONSTRUCTION_MATERIAL_RESOURCE__SUPPLIERS:
				unsetSuppliers();
				return;
			case Ifc2x3tc1Package.IFC_CONSTRUCTION_MATERIAL_RESOURCE__USAGE_RATIO:
				unsetUsageRatio();
				return;
			case Ifc2x3tc1Package.IFC_CONSTRUCTION_MATERIAL_RESOURCE__USAGE_RATIO_AS_STRING:
				unsetUsageRatioAsString();
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
			case Ifc2x3tc1Package.IFC_CONSTRUCTION_MATERIAL_RESOURCE__SUPPLIERS:
				return isSetSuppliers();
			case Ifc2x3tc1Package.IFC_CONSTRUCTION_MATERIAL_RESOURCE__USAGE_RATIO:
				return isSetUsageRatio();
			case Ifc2x3tc1Package.IFC_CONSTRUCTION_MATERIAL_RESOURCE__USAGE_RATIO_AS_STRING:
				return isSetUsageRatioAsString();
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
		result.append(" (UsageRatio: ");
		if (usageRatioESet) result.append(usageRatio); else result.append("<unset>");
		result.append(", UsageRatioAsString: ");
		if (usageRatioAsStringESet) result.append(usageRatioAsString); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcConstructionMaterialResourceImpl
