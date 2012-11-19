/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelAssignsToProduct;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingProductType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Assigns To Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelAssignsToProductImpl#getRelatingProduct <em>Relating Product</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelAssignsToProductImpl extends IfcRelAssignsImpl implements IfcRelAssignsToProduct {
	/**
	 * The cached value of the '{@link #getRelatingProduct() <em>Relating Product</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingProduct()
	 * @generated
	 * @ordered
	 */
	protected RelatingProductType relatingProduct;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelAssignsToProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcRelAssignsToProduct();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingProductType getRelatingProduct() {
		return relatingProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatingProduct(RelatingProductType newRelatingProduct, NotificationChain msgs) {
		RelatingProductType oldRelatingProduct = relatingProduct;
		relatingProduct = newRelatingProduct;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_ASSIGNS_TO_PRODUCT__RELATING_PRODUCT, oldRelatingProduct, newRelatingProduct);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingProduct(RelatingProductType newRelatingProduct) {
		if (newRelatingProduct != relatingProduct) {
			NotificationChain msgs = null;
			if (relatingProduct != null)
				msgs = ((InternalEObject)relatingProduct).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_ASSIGNS_TO_PRODUCT__RELATING_PRODUCT, null, msgs);
			if (newRelatingProduct != null)
				msgs = ((InternalEObject)newRelatingProduct).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_ASSIGNS_TO_PRODUCT__RELATING_PRODUCT, null, msgs);
			msgs = basicSetRelatingProduct(newRelatingProduct, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_ASSIGNS_TO_PRODUCT__RELATING_PRODUCT, newRelatingProduct, newRelatingProduct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_REL_ASSIGNS_TO_PRODUCT__RELATING_PRODUCT:
				return basicSetRelatingProduct(null, msgs);
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
			case FinalPackage.IFC_REL_ASSIGNS_TO_PRODUCT__RELATING_PRODUCT:
				return getRelatingProduct();
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
			case FinalPackage.IFC_REL_ASSIGNS_TO_PRODUCT__RELATING_PRODUCT:
				setRelatingProduct((RelatingProductType)newValue);
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
			case FinalPackage.IFC_REL_ASSIGNS_TO_PRODUCT__RELATING_PRODUCT:
				setRelatingProduct((RelatingProductType)null);
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
			case FinalPackage.IFC_REL_ASSIGNS_TO_PRODUCT__RELATING_PRODUCT:
				return relatingProduct != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcRelAssignsToProductImpl
