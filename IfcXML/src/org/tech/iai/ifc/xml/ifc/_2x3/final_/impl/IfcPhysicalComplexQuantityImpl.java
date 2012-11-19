/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.HasQuantitiesType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPhysicalComplexQuantity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Physical Complex Quantity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcPhysicalComplexQuantityImpl#getHasQuantities <em>Has Quantities</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcPhysicalComplexQuantityImpl#getDiscrimination <em>Discrimination</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcPhysicalComplexQuantityImpl#getQuality <em>Quality</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcPhysicalComplexQuantityImpl#getUsage <em>Usage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcPhysicalComplexQuantityImpl extends IfcPhysicalQuantityImpl implements IfcPhysicalComplexQuantity {
	/**
	 * The cached value of the '{@link #getHasQuantities() <em>Has Quantities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasQuantities()
	 * @generated
	 * @ordered
	 */
	protected HasQuantitiesType hasQuantities;

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
		return FinalPackage.eINSTANCE.getIfcPhysicalComplexQuantity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HasQuantitiesType getHasQuantities() {
		return hasQuantities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasQuantities(HasQuantitiesType newHasQuantities, NotificationChain msgs) {
		HasQuantitiesType oldHasQuantities = hasQuantities;
		hasQuantities = newHasQuantities;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PHYSICAL_COMPLEX_QUANTITY__HAS_QUANTITIES, oldHasQuantities, newHasQuantities);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasQuantities(HasQuantitiesType newHasQuantities) {
		if (newHasQuantities != hasQuantities) {
			NotificationChain msgs = null;
			if (hasQuantities != null)
				msgs = ((InternalEObject)hasQuantities).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PHYSICAL_COMPLEX_QUANTITY__HAS_QUANTITIES, null, msgs);
			if (newHasQuantities != null)
				msgs = ((InternalEObject)newHasQuantities).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PHYSICAL_COMPLEX_QUANTITY__HAS_QUANTITIES, null, msgs);
			msgs = basicSetHasQuantities(newHasQuantities, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PHYSICAL_COMPLEX_QUANTITY__HAS_QUANTITIES, newHasQuantities, newHasQuantities));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PHYSICAL_COMPLEX_QUANTITY__DISCRIMINATION, oldDiscrimination, discrimination));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PHYSICAL_COMPLEX_QUANTITY__QUALITY, oldQuality, quality));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PHYSICAL_COMPLEX_QUANTITY__USAGE, oldUsage, usage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_PHYSICAL_COMPLEX_QUANTITY__HAS_QUANTITIES:
				return basicSetHasQuantities(null, msgs);
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
			case FinalPackage.IFC_PHYSICAL_COMPLEX_QUANTITY__HAS_QUANTITIES:
				return getHasQuantities();
			case FinalPackage.IFC_PHYSICAL_COMPLEX_QUANTITY__DISCRIMINATION:
				return getDiscrimination();
			case FinalPackage.IFC_PHYSICAL_COMPLEX_QUANTITY__QUALITY:
				return getQuality();
			case FinalPackage.IFC_PHYSICAL_COMPLEX_QUANTITY__USAGE:
				return getUsage();
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
			case FinalPackage.IFC_PHYSICAL_COMPLEX_QUANTITY__HAS_QUANTITIES:
				setHasQuantities((HasQuantitiesType)newValue);
				return;
			case FinalPackage.IFC_PHYSICAL_COMPLEX_QUANTITY__DISCRIMINATION:
				setDiscrimination((String)newValue);
				return;
			case FinalPackage.IFC_PHYSICAL_COMPLEX_QUANTITY__QUALITY:
				setQuality((String)newValue);
				return;
			case FinalPackage.IFC_PHYSICAL_COMPLEX_QUANTITY__USAGE:
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
			case FinalPackage.IFC_PHYSICAL_COMPLEX_QUANTITY__HAS_QUANTITIES:
				setHasQuantities((HasQuantitiesType)null);
				return;
			case FinalPackage.IFC_PHYSICAL_COMPLEX_QUANTITY__DISCRIMINATION:
				setDiscrimination(DISCRIMINATION_EDEFAULT);
				return;
			case FinalPackage.IFC_PHYSICAL_COMPLEX_QUANTITY__QUALITY:
				setQuality(QUALITY_EDEFAULT);
				return;
			case FinalPackage.IFC_PHYSICAL_COMPLEX_QUANTITY__USAGE:
				setUsage(USAGE_EDEFAULT);
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
			case FinalPackage.IFC_PHYSICAL_COMPLEX_QUANTITY__HAS_QUANTITIES:
				return hasQuantities != null;
			case FinalPackage.IFC_PHYSICAL_COMPLEX_QUANTITY__DISCRIMINATION:
				return DISCRIMINATION_EDEFAULT == null ? discrimination != null : !DISCRIMINATION_EDEFAULT.equals(discrimination);
			case FinalPackage.IFC_PHYSICAL_COMPLEX_QUANTITY__QUALITY:
				return QUALITY_EDEFAULT == null ? quality != null : !QUALITY_EDEFAULT.equals(quality);
			case FinalPackage.IFC_PHYSICAL_COMPLEX_QUANTITY__USAGE:
				return USAGE_EDEFAULT == null ? usage != null : !USAGE_EDEFAULT.equals(usage);
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
		result.append(" (discrimination: ");
		result.append(discrimination);
		result.append(", quality: ");
		result.append(quality);
		result.append(", usage: ");
		result.append(usage);
		result.append(')');
		return result.toString();
	}

} //IfcPhysicalComplexQuantityImpl
