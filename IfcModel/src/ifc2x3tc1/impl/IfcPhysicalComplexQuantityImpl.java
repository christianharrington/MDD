/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcPhysicalComplexQuantity;
import ifc2x3tc1.IfcPhysicalQuantity;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Physical Complex Quantity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcPhysicalComplexQuantityImpl#getHasQuantities <em>Has Quantities</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcPhysicalComplexQuantityImpl#getDiscrimination <em>Discrimination</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcPhysicalComplexQuantityImpl#getQuality <em>Quality</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcPhysicalComplexQuantityImpl#getUsage <em>Usage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcPhysicalComplexQuantityImpl extends IfcPhysicalQuantityImpl implements IfcPhysicalComplexQuantity {
	/**
	 * The cached value of the '{@link #getHasQuantities() <em>Has Quantities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasQuantities()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcPhysicalQuantity> hasQuantities;

	/**
	 * The default value of the '{@link #getDiscrimination() <em>Discrimination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscrimination()
	 * @generated
	 * @ordered
	 */
	protected static final String DISCRIMINATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiscrimination() <em>Discrimination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscrimination()
	 * @generated
	 * @ordered
	 */
	protected String discrimination = DISCRIMINATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuality() <em>Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuality()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuality() <em>Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuality()
	 * @generated
	 * @ordered
	 */
	protected String quality = QUALITY_EDEFAULT;

	/**
	 * This is true if the Quality attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean qualityESet;

	/**
	 * The default value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected static final String USAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected String usage = USAGE_EDEFAULT;

	/**
	 * This is true if the Usage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean usageESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcPhysicalComplexQuantityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcPhysicalComplexQuantity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcPhysicalQuantity> getHasQuantities() {
		if (hasQuantities == null) {
			hasQuantities = new EObjectWithInverseResolvingEList.ManyInverse<IfcPhysicalQuantity>(IfcPhysicalQuantity.class, this, Ifc2x3tc1Package.IFC_PHYSICAL_COMPLEX_QUANTITY__HAS_QUANTITIES, Ifc2x3tc1Package.IFC_PHYSICAL_QUANTITY__PART_OF_COMPLEX);
		}
		return hasQuantities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDiscrimination() {
		return discrimination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscrimination(String newDiscrimination) {
		String oldDiscrimination = discrimination;
		discrimination = newDiscrimination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PHYSICAL_COMPLEX_QUANTITY__DISCRIMINATION, oldDiscrimination, discrimination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQuality() {
		return quality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuality(String newQuality) {
		String oldQuality = quality;
		quality = newQuality;
		boolean oldQualityESet = qualityESet;
		qualityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PHYSICAL_COMPLEX_QUANTITY__QUALITY, oldQuality, quality, !oldQualityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQuality() {
		String oldQuality = quality;
		boolean oldQualityESet = qualityESet;
		quality = QUALITY_EDEFAULT;
		qualityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_PHYSICAL_COMPLEX_QUANTITY__QUALITY, oldQuality, QUALITY_EDEFAULT, oldQualityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQuality() {
		return qualityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsage() {
		return usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsage(String newUsage) {
		String oldUsage = usage;
		usage = newUsage;
		boolean oldUsageESet = usageESet;
		usageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PHYSICAL_COMPLEX_QUANTITY__USAGE, oldUsage, usage, !oldUsageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUsage() {
		String oldUsage = usage;
		boolean oldUsageESet = usageESet;
		usage = USAGE_EDEFAULT;
		usageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_PHYSICAL_COMPLEX_QUANTITY__USAGE, oldUsage, USAGE_EDEFAULT, oldUsageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUsage() {
		return usageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_PHYSICAL_COMPLEX_QUANTITY__HAS_QUANTITIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasQuantities()).basicAdd(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_PHYSICAL_COMPLEX_QUANTITY__HAS_QUANTITIES:
				return ((InternalEList<?>)getHasQuantities()).basicRemove(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_PHYSICAL_COMPLEX_QUANTITY__HAS_QUANTITIES:
				return getHasQuantities();
			case Ifc2x3tc1Package.IFC_PHYSICAL_COMPLEX_QUANTITY__DISCRIMINATION:
				return getDiscrimination();
			case Ifc2x3tc1Package.IFC_PHYSICAL_COMPLEX_QUANTITY__QUALITY:
				return getQuality();
			case Ifc2x3tc1Package.IFC_PHYSICAL_COMPLEX_QUANTITY__USAGE:
				return getUsage();
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
			case Ifc2x3tc1Package.IFC_PHYSICAL_COMPLEX_QUANTITY__HAS_QUANTITIES:
				getHasQuantities().clear();
				getHasQuantities().addAll((Collection<? extends IfcPhysicalQuantity>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_PHYSICAL_COMPLEX_QUANTITY__DISCRIMINATION:
				setDiscrimination((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_PHYSICAL_COMPLEX_QUANTITY__QUALITY:
				setQuality((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_PHYSICAL_COMPLEX_QUANTITY__USAGE:
				setUsage((String)newValue);
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
			case Ifc2x3tc1Package.IFC_PHYSICAL_COMPLEX_QUANTITY__HAS_QUANTITIES:
				getHasQuantities().clear();
				return;
			case Ifc2x3tc1Package.IFC_PHYSICAL_COMPLEX_QUANTITY__DISCRIMINATION:
				setDiscrimination(DISCRIMINATION_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_PHYSICAL_COMPLEX_QUANTITY__QUALITY:
				unsetQuality();
				return;
			case Ifc2x3tc1Package.IFC_PHYSICAL_COMPLEX_QUANTITY__USAGE:
				unsetUsage();
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
			case Ifc2x3tc1Package.IFC_PHYSICAL_COMPLEX_QUANTITY__HAS_QUANTITIES:
				return hasQuantities != null && !hasQuantities.isEmpty();
			case Ifc2x3tc1Package.IFC_PHYSICAL_COMPLEX_QUANTITY__DISCRIMINATION:
				return DISCRIMINATION_EDEFAULT == null ? discrimination != null : !DISCRIMINATION_EDEFAULT.equals(discrimination);
			case Ifc2x3tc1Package.IFC_PHYSICAL_COMPLEX_QUANTITY__QUALITY:
				return isSetQuality();
			case Ifc2x3tc1Package.IFC_PHYSICAL_COMPLEX_QUANTITY__USAGE:
				return isSetUsage();
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
		result.append(" (Discrimination: ");
		result.append(discrimination);
		result.append(", Quality: ");
		if (qualityESet) result.append(quality); else result.append("<unset>");
		result.append(", Usage: ");
		if (usageESet) result.append(usage); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcPhysicalComplexQuantityImpl
