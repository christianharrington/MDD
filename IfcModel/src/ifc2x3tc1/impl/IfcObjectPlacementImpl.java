/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcLocalPlacement;
import ifc2x3tc1.IfcObjectPlacement;
import ifc2x3tc1.IfcProduct;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Object Placement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcObjectPlacementImpl#getPlacesObject <em>Places Object</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcObjectPlacementImpl#getReferencedByPlacements <em>Referenced By Placements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcObjectPlacementImpl extends EObjectImpl implements IfcObjectPlacement {
	/**
	 * The cached value of the '{@link #getPlacesObject() <em>Places Object</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlacesObject()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcProduct> placesObject;

	/**
	 * The cached value of the '{@link #getReferencedByPlacements() <em>Referenced By Placements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedByPlacements()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcLocalPlacement> referencedByPlacements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcObjectPlacementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcObjectPlacement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcProduct> getPlacesObject() {
		if (placesObject == null) {
			placesObject = new EObjectWithInverseResolvingEList.Unsettable<IfcProduct>(IfcProduct.class, this, Ifc2x3tc1Package.IFC_OBJECT_PLACEMENT__PLACES_OBJECT, Ifc2x3tc1Package.IFC_PRODUCT__OBJECT_PLACEMENT);
		}
		return placesObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPlacesObject() {
		if (placesObject != null) ((InternalEList.Unsettable<?>)placesObject).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPlacesObject() {
		return placesObject != null && ((InternalEList.Unsettable<?>)placesObject).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcLocalPlacement> getReferencedByPlacements() {
		if (referencedByPlacements == null) {
			referencedByPlacements = new EObjectWithInverseResolvingEList.Unsettable<IfcLocalPlacement>(IfcLocalPlacement.class, this, Ifc2x3tc1Package.IFC_OBJECT_PLACEMENT__REFERENCED_BY_PLACEMENTS, Ifc2x3tc1Package.IFC_LOCAL_PLACEMENT__PLACEMENT_REL_TO);
		}
		return referencedByPlacements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReferencedByPlacements() {
		if (referencedByPlacements != null) ((InternalEList.Unsettable<?>)referencedByPlacements).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReferencedByPlacements() {
		return referencedByPlacements != null && ((InternalEList.Unsettable<?>)referencedByPlacements).isSet();
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
			case Ifc2x3tc1Package.IFC_OBJECT_PLACEMENT__PLACES_OBJECT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPlacesObject()).basicAdd(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_OBJECT_PLACEMENT__REFERENCED_BY_PLACEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferencedByPlacements()).basicAdd(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_OBJECT_PLACEMENT__PLACES_OBJECT:
				return ((InternalEList<?>)getPlacesObject()).basicRemove(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_OBJECT_PLACEMENT__REFERENCED_BY_PLACEMENTS:
				return ((InternalEList<?>)getReferencedByPlacements()).basicRemove(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_OBJECT_PLACEMENT__PLACES_OBJECT:
				return getPlacesObject();
			case Ifc2x3tc1Package.IFC_OBJECT_PLACEMENT__REFERENCED_BY_PLACEMENTS:
				return getReferencedByPlacements();
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
			case Ifc2x3tc1Package.IFC_OBJECT_PLACEMENT__PLACES_OBJECT:
				getPlacesObject().clear();
				getPlacesObject().addAll((Collection<? extends IfcProduct>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_OBJECT_PLACEMENT__REFERENCED_BY_PLACEMENTS:
				getReferencedByPlacements().clear();
				getReferencedByPlacements().addAll((Collection<? extends IfcLocalPlacement>)newValue);
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
			case Ifc2x3tc1Package.IFC_OBJECT_PLACEMENT__PLACES_OBJECT:
				unsetPlacesObject();
				return;
			case Ifc2x3tc1Package.IFC_OBJECT_PLACEMENT__REFERENCED_BY_PLACEMENTS:
				unsetReferencedByPlacements();
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
			case Ifc2x3tc1Package.IFC_OBJECT_PLACEMENT__PLACES_OBJECT:
				return isSetPlacesObject();
			case Ifc2x3tc1Package.IFC_OBJECT_PLACEMENT__REFERENCED_BY_PLACEMENTS:
				return isSetReferencedByPlacements();
		}
		return super.eIsSet(featureID);
	}

} //IfcObjectPlacementImpl
