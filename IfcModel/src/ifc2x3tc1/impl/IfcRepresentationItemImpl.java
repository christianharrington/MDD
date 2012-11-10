/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcPresentationLayerAssignment;
import ifc2x3tc1.IfcRepresentationItem;
import ifc2x3tc1.IfcStyledItem;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Representation Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcRepresentationItemImpl#getLayerAssignments <em>Layer Assignments</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRepresentationItemImpl#getStyledByItem <em>Styled By Item</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRepresentationItemImpl extends EObjectImpl implements IfcRepresentationItem {
	/**
	 * The cached value of the '{@link #getLayerAssignments() <em>Layer Assignments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayerAssignments()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcPresentationLayerAssignment> layerAssignments;

	/**
	 * The cached value of the '{@link #getStyledByItem() <em>Styled By Item</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyledByItem()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcStyledItem> styledByItem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRepresentationItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcRepresentationItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcPresentationLayerAssignment> getLayerAssignments() {
		if (layerAssignments == null) {
			layerAssignments = new EObjectResolvingEList.Unsettable<IfcPresentationLayerAssignment>(IfcPresentationLayerAssignment.class, this, Ifc2x3tc1Package.IFC_REPRESENTATION_ITEM__LAYER_ASSIGNMENTS);
		}
		return layerAssignments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLayerAssignments() {
		if (layerAssignments != null) ((InternalEList.Unsettable<?>)layerAssignments).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLayerAssignments() {
		return layerAssignments != null && ((InternalEList.Unsettable<?>)layerAssignments).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcStyledItem> getStyledByItem() {
		if (styledByItem == null) {
			styledByItem = new EObjectWithInverseResolvingEList.Unsettable<IfcStyledItem>(IfcStyledItem.class, this, Ifc2x3tc1Package.IFC_REPRESENTATION_ITEM__STYLED_BY_ITEM, Ifc2x3tc1Package.IFC_STYLED_ITEM__ITEM);
		}
		return styledByItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStyledByItem() {
		if (styledByItem != null) ((InternalEList.Unsettable<?>)styledByItem).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStyledByItem() {
		return styledByItem != null && ((InternalEList.Unsettable<?>)styledByItem).isSet();
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
			case Ifc2x3tc1Package.IFC_REPRESENTATION_ITEM__STYLED_BY_ITEM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStyledByItem()).basicAdd(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_REPRESENTATION_ITEM__STYLED_BY_ITEM:
				return ((InternalEList<?>)getStyledByItem()).basicRemove(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_REPRESENTATION_ITEM__LAYER_ASSIGNMENTS:
				return getLayerAssignments();
			case Ifc2x3tc1Package.IFC_REPRESENTATION_ITEM__STYLED_BY_ITEM:
				return getStyledByItem();
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
			case Ifc2x3tc1Package.IFC_REPRESENTATION_ITEM__LAYER_ASSIGNMENTS:
				getLayerAssignments().clear();
				getLayerAssignments().addAll((Collection<? extends IfcPresentationLayerAssignment>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REPRESENTATION_ITEM__STYLED_BY_ITEM:
				getStyledByItem().clear();
				getStyledByItem().addAll((Collection<? extends IfcStyledItem>)newValue);
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
			case Ifc2x3tc1Package.IFC_REPRESENTATION_ITEM__LAYER_ASSIGNMENTS:
				unsetLayerAssignments();
				return;
			case Ifc2x3tc1Package.IFC_REPRESENTATION_ITEM__STYLED_BY_ITEM:
				unsetStyledByItem();
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
			case Ifc2x3tc1Package.IFC_REPRESENTATION_ITEM__LAYER_ASSIGNMENTS:
				return isSetLayerAssignments();
			case Ifc2x3tc1Package.IFC_REPRESENTATION_ITEM__STYLED_BY_ITEM:
				return isSetStyledByItem();
		}
		return super.eIsSet(featureID);
	}

} //IfcRepresentationItemImpl
