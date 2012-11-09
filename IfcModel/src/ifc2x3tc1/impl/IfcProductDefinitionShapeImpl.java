/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcProduct;
import ifc2x3tc1.IfcProductDefinitionShape;
import ifc2x3tc1.IfcShapeAspect;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Product Definition Shape</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcProductDefinitionShapeImpl#getShapeOfProduct <em>Shape Of Product</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcProductDefinitionShapeImpl#getHasShapeAspects <em>Has Shape Aspects</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcProductDefinitionShapeImpl extends IfcProductRepresentationImpl implements IfcProductDefinitionShape {
	/**
	 * The cached value of the '{@link #getShapeOfProduct() <em>Shape Of Product</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShapeOfProduct()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcProduct> shapeOfProduct;

	/**
	 * The cached value of the '{@link #getHasShapeAspects() <em>Has Shape Aspects</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasShapeAspects()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcShapeAspect> hasShapeAspects;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcProductDefinitionShapeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcProductDefinitionShape();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcProduct> getShapeOfProduct() {
		if (shapeOfProduct == null) {
			shapeOfProduct = new EObjectResolvingEList.Unsettable<IfcProduct>(IfcProduct.class, this, Ifc2x3tc1Package.IFC_PRODUCT_DEFINITION_SHAPE__SHAPE_OF_PRODUCT);
		}
		return shapeOfProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetShapeOfProduct() {
		if (shapeOfProduct != null) ((InternalEList.Unsettable<?>)shapeOfProduct).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetShapeOfProduct() {
		return shapeOfProduct != null && ((InternalEList.Unsettable<?>)shapeOfProduct).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcShapeAspect> getHasShapeAspects() {
		if (hasShapeAspects == null) {
			hasShapeAspects = new EObjectWithInverseResolvingEList.Unsettable<IfcShapeAspect>(IfcShapeAspect.class, this, Ifc2x3tc1Package.IFC_PRODUCT_DEFINITION_SHAPE__HAS_SHAPE_ASPECTS, Ifc2x3tc1Package.IFC_SHAPE_ASPECT__PART_OF_PRODUCT_DEFINITION_SHAPE);
		}
		return hasShapeAspects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHasShapeAspects() {
		if (hasShapeAspects != null) ((InternalEList.Unsettable<?>)hasShapeAspects).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHasShapeAspects() {
		return hasShapeAspects != null && ((InternalEList.Unsettable<?>)hasShapeAspects).isSet();
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
			case Ifc2x3tc1Package.IFC_PRODUCT_DEFINITION_SHAPE__HAS_SHAPE_ASPECTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasShapeAspects()).basicAdd(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_PRODUCT_DEFINITION_SHAPE__HAS_SHAPE_ASPECTS:
				return ((InternalEList<?>)getHasShapeAspects()).basicRemove(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_PRODUCT_DEFINITION_SHAPE__SHAPE_OF_PRODUCT:
				return getShapeOfProduct();
			case Ifc2x3tc1Package.IFC_PRODUCT_DEFINITION_SHAPE__HAS_SHAPE_ASPECTS:
				return getHasShapeAspects();
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
			case Ifc2x3tc1Package.IFC_PRODUCT_DEFINITION_SHAPE__SHAPE_OF_PRODUCT:
				getShapeOfProduct().clear();
				getShapeOfProduct().addAll((Collection<? extends IfcProduct>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_PRODUCT_DEFINITION_SHAPE__HAS_SHAPE_ASPECTS:
				getHasShapeAspects().clear();
				getHasShapeAspects().addAll((Collection<? extends IfcShapeAspect>)newValue);
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
			case Ifc2x3tc1Package.IFC_PRODUCT_DEFINITION_SHAPE__SHAPE_OF_PRODUCT:
				unsetShapeOfProduct();
				return;
			case Ifc2x3tc1Package.IFC_PRODUCT_DEFINITION_SHAPE__HAS_SHAPE_ASPECTS:
				unsetHasShapeAspects();
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
			case Ifc2x3tc1Package.IFC_PRODUCT_DEFINITION_SHAPE__SHAPE_OF_PRODUCT:
				return isSetShapeOfProduct();
			case Ifc2x3tc1Package.IFC_PRODUCT_DEFINITION_SHAPE__HAS_SHAPE_ASPECTS:
				return isSetHasShapeAspects();
		}
		return super.eIsSet(featureID);
	}

} //IfcProductDefinitionShapeImpl
