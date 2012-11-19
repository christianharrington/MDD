/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcConstructionMaterialResource;
import org.tech.iai.ifc.xml.ifc._2x3.final_.SuppliersType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Construction Material Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcConstructionMaterialResourceImpl#getSuppliers <em>Suppliers</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcConstructionMaterialResourceImpl#getUsageRatio <em>Usage Ratio</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcConstructionMaterialResourceImpl extends IfcConstructionResourceImpl implements IfcConstructionMaterialResource {
	/**
	 * The cached value of the '{@link #getSuppliers() <em>Suppliers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuppliers()
	 * @generated
	 * @ordered
	 */
	protected SuppliersType suppliers;

	/**
	 * The default value of the '{@link #getUsageRatio() <em>Usage Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageRatio()
	 * @generated
	 * @ordered
	 */
	protected static final Double USAGE_RATIO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsageRatio() <em>Usage Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageRatio()
	 * @generated
	 * @ordered
	 */
	protected Double usageRatio = USAGE_RATIO_EDEFAULT;

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
		return FinalPackage.eINSTANCE.getIfcConstructionMaterialResource();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuppliersType getSuppliers() {
		return suppliers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuppliers(SuppliersType newSuppliers, NotificationChain msgs) {
		SuppliersType oldSuppliers = suppliers;
		suppliers = newSuppliers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CONSTRUCTION_MATERIAL_RESOURCE__SUPPLIERS, oldSuppliers, newSuppliers);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuppliers(SuppliersType newSuppliers) {
		if (newSuppliers != suppliers) {
			NotificationChain msgs = null;
			if (suppliers != null)
				msgs = ((InternalEObject)suppliers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CONSTRUCTION_MATERIAL_RESOURCE__SUPPLIERS, null, msgs);
			if (newSuppliers != null)
				msgs = ((InternalEObject)newSuppliers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CONSTRUCTION_MATERIAL_RESOURCE__SUPPLIERS, null, msgs);
			msgs = basicSetSuppliers(newSuppliers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CONSTRUCTION_MATERIAL_RESOURCE__SUPPLIERS, newSuppliers, newSuppliers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getUsageRatio() {
		return usageRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsageRatio(Double newUsageRatio) {
		Double oldUsageRatio = usageRatio;
		usageRatio = newUsageRatio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CONSTRUCTION_MATERIAL_RESOURCE__USAGE_RATIO, oldUsageRatio, usageRatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_CONSTRUCTION_MATERIAL_RESOURCE__SUPPLIERS:
				return basicSetSuppliers(null, msgs);
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
			case FinalPackage.IFC_CONSTRUCTION_MATERIAL_RESOURCE__SUPPLIERS:
				return getSuppliers();
			case FinalPackage.IFC_CONSTRUCTION_MATERIAL_RESOURCE__USAGE_RATIO:
				return getUsageRatio();
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
			case FinalPackage.IFC_CONSTRUCTION_MATERIAL_RESOURCE__SUPPLIERS:
				setSuppliers((SuppliersType)newValue);
				return;
			case FinalPackage.IFC_CONSTRUCTION_MATERIAL_RESOURCE__USAGE_RATIO:
				setUsageRatio((Double)newValue);
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
			case FinalPackage.IFC_CONSTRUCTION_MATERIAL_RESOURCE__SUPPLIERS:
				setSuppliers((SuppliersType)null);
				return;
			case FinalPackage.IFC_CONSTRUCTION_MATERIAL_RESOURCE__USAGE_RATIO:
				setUsageRatio(USAGE_RATIO_EDEFAULT);
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
			case FinalPackage.IFC_CONSTRUCTION_MATERIAL_RESOURCE__SUPPLIERS:
				return suppliers != null;
			case FinalPackage.IFC_CONSTRUCTION_MATERIAL_RESOURCE__USAGE_RATIO:
				return USAGE_RATIO_EDEFAULT == null ? usageRatio != null : !USAGE_RATIO_EDEFAULT.equals(usageRatio);
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
		result.append(" (usageRatio: ");
		result.append(usageRatio);
		result.append(')');
		return result.toString();
	}

} //IfcConstructionMaterialResourceImpl
