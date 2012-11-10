/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcProduct;
import ifc2x3tc1.IfcRelContainedInSpatialStructure;
import ifc2x3tc1.IfcSpatialStructureElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Contained In Spatial Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcRelContainedInSpatialStructureImpl#getRelatedElements <em>Related Elements</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRelContainedInSpatialStructureImpl#getRelatingStructure <em>Relating Structure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelContainedInSpatialStructureImpl extends IfcRelConnectsImpl implements IfcRelContainedInSpatialStructure {
	/**
	 * The cached value of the '{@link #getRelatedElements() <em>Related Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcProduct> relatedElements;

	/**
	 * The cached value of the '{@link #getRelatingStructure() <em>Relating Structure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingStructure()
	 * @generated
	 * @ordered
	 */
	protected IfcSpatialStructureElement relatingStructure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelContainedInSpatialStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcRelContainedInSpatialStructure();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcProduct> getRelatedElements() {
		if (relatedElements == null) {
			relatedElements = new EObjectResolvingEList<IfcProduct>(IfcProduct.class, this, Ifc2x3tc1Package.IFC_REL_CONTAINED_IN_SPATIAL_STRUCTURE__RELATED_ELEMENTS);
		}
		return relatedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSpatialStructureElement getRelatingStructure() {
		if (relatingStructure != null && relatingStructure.eIsProxy()) {
			InternalEObject oldRelatingStructure = (InternalEObject)relatingStructure;
			relatingStructure = (IfcSpatialStructureElement)eResolveProxy(oldRelatingStructure);
			if (relatingStructure != oldRelatingStructure) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_REL_CONTAINED_IN_SPATIAL_STRUCTURE__RELATING_STRUCTURE, oldRelatingStructure, relatingStructure));
			}
		}
		return relatingStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSpatialStructureElement basicGetRelatingStructure() {
		return relatingStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatingStructure(IfcSpatialStructureElement newRelatingStructure, NotificationChain msgs) {
		IfcSpatialStructureElement oldRelatingStructure = relatingStructure;
		relatingStructure = newRelatingStructure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_CONTAINED_IN_SPATIAL_STRUCTURE__RELATING_STRUCTURE, oldRelatingStructure, newRelatingStructure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingStructure(IfcSpatialStructureElement newRelatingStructure) {
		if (newRelatingStructure != relatingStructure) {
			NotificationChain msgs = null;
			if (relatingStructure != null)
				msgs = ((InternalEObject)relatingStructure).eInverseRemove(this, Ifc2x3tc1Package.IFC_SPATIAL_STRUCTURE_ELEMENT__CONTAINS_ELEMENTS, IfcSpatialStructureElement.class, msgs);
			if (newRelatingStructure != null)
				msgs = ((InternalEObject)newRelatingStructure).eInverseAdd(this, Ifc2x3tc1Package.IFC_SPATIAL_STRUCTURE_ELEMENT__CONTAINS_ELEMENTS, IfcSpatialStructureElement.class, msgs);
			msgs = basicSetRelatingStructure(newRelatingStructure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_CONTAINED_IN_SPATIAL_STRUCTURE__RELATING_STRUCTURE, newRelatingStructure, newRelatingStructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_REL_CONTAINED_IN_SPATIAL_STRUCTURE__RELATING_STRUCTURE:
				if (relatingStructure != null)
					msgs = ((InternalEObject)relatingStructure).eInverseRemove(this, Ifc2x3tc1Package.IFC_SPATIAL_STRUCTURE_ELEMENT__CONTAINS_ELEMENTS, IfcSpatialStructureElement.class, msgs);
				return basicSetRelatingStructure((IfcSpatialStructureElement)otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_REL_CONTAINED_IN_SPATIAL_STRUCTURE__RELATING_STRUCTURE:
				return basicSetRelatingStructure(null, msgs);
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
			case Ifc2x3tc1Package.IFC_REL_CONTAINED_IN_SPATIAL_STRUCTURE__RELATED_ELEMENTS:
				return getRelatedElements();
			case Ifc2x3tc1Package.IFC_REL_CONTAINED_IN_SPATIAL_STRUCTURE__RELATING_STRUCTURE:
				if (resolve) return getRelatingStructure();
				return basicGetRelatingStructure();
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
			case Ifc2x3tc1Package.IFC_REL_CONTAINED_IN_SPATIAL_STRUCTURE__RELATED_ELEMENTS:
				getRelatedElements().clear();
				getRelatedElements().addAll((Collection<? extends IfcProduct>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REL_CONTAINED_IN_SPATIAL_STRUCTURE__RELATING_STRUCTURE:
				setRelatingStructure((IfcSpatialStructureElement)newValue);
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
			case Ifc2x3tc1Package.IFC_REL_CONTAINED_IN_SPATIAL_STRUCTURE__RELATED_ELEMENTS:
				getRelatedElements().clear();
				return;
			case Ifc2x3tc1Package.IFC_REL_CONTAINED_IN_SPATIAL_STRUCTURE__RELATING_STRUCTURE:
				setRelatingStructure((IfcSpatialStructureElement)null);
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
			case Ifc2x3tc1Package.IFC_REL_CONTAINED_IN_SPATIAL_STRUCTURE__RELATED_ELEMENTS:
				return relatedElements != null && !relatedElements.isEmpty();
			case Ifc2x3tc1Package.IFC_REL_CONTAINED_IN_SPATIAL_STRUCTURE__RELATING_STRUCTURE:
				return relatingStructure != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcRelContainedInSpatialStructureImpl
