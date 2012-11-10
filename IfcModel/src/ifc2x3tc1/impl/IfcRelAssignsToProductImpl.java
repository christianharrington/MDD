/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcProduct;
import ifc2x3tc1.IfcRelAssignsToProduct;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Assigns To Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcRelAssignsToProductImpl#getRelatingProduct <em>Relating Product</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelAssignsToProductImpl extends IfcRelAssignsImpl implements IfcRelAssignsToProduct {
	/**
	 * The cached value of the '{@link #getRelatingProduct() <em>Relating Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingProduct()
	 * @generated
	 * @ordered
	 */
	protected IfcProduct relatingProduct;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcRelAssignsToProduct();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProduct getRelatingProduct() {
		if (relatingProduct != null && relatingProduct.eIsProxy()) {
			InternalEObject oldRelatingProduct = (InternalEObject)relatingProduct;
			relatingProduct = (IfcProduct)eResolveProxy(oldRelatingProduct);
			if (relatingProduct != oldRelatingProduct) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_PRODUCT__RELATING_PRODUCT, oldRelatingProduct, relatingProduct));
			}
		}
		return relatingProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProduct basicGetRelatingProduct() {
		return relatingProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatingProduct(IfcProduct newRelatingProduct, NotificationChain msgs) {
		IfcProduct oldRelatingProduct = relatingProduct;
		relatingProduct = newRelatingProduct;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_PRODUCT__RELATING_PRODUCT, oldRelatingProduct, newRelatingProduct);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingProduct(IfcProduct newRelatingProduct) {
		if (newRelatingProduct != relatingProduct) {
			NotificationChain msgs = null;
			if (relatingProduct != null)
				msgs = ((InternalEObject)relatingProduct).eInverseRemove(this, Ifc2x3tc1Package.IFC_PRODUCT__REFERENCED_BY, IfcProduct.class, msgs);
			if (newRelatingProduct != null)
				msgs = ((InternalEObject)newRelatingProduct).eInverseAdd(this, Ifc2x3tc1Package.IFC_PRODUCT__REFERENCED_BY, IfcProduct.class, msgs);
			msgs = basicSetRelatingProduct(newRelatingProduct, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_PRODUCT__RELATING_PRODUCT, newRelatingProduct, newRelatingProduct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_PRODUCT__RELATING_PRODUCT:
				if (relatingProduct != null)
					msgs = ((InternalEObject)relatingProduct).eInverseRemove(this, Ifc2x3tc1Package.IFC_PRODUCT__REFERENCED_BY, IfcProduct.class, msgs);
				return basicSetRelatingProduct((IfcProduct)otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_PRODUCT__RELATING_PRODUCT:
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
			case Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_PRODUCT__RELATING_PRODUCT:
				if (resolve) return getRelatingProduct();
				return basicGetRelatingProduct();
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
			case Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_PRODUCT__RELATING_PRODUCT:
				setRelatingProduct((IfcProduct)newValue);
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
			case Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_PRODUCT__RELATING_PRODUCT:
				setRelatingProduct((IfcProduct)null);
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
			case Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_PRODUCT__RELATING_PRODUCT:
				return relatingProduct != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcRelAssignsToProductImpl
