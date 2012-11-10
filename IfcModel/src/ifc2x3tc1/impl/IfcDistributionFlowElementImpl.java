/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcDistributionFlowElement;
import ifc2x3tc1.IfcRelFlowControlElements;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Distribution Flow Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcDistributionFlowElementImpl#getHasControlElements <em>Has Control Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcDistributionFlowElementImpl extends IfcDistributionElementImpl implements IfcDistributionFlowElement {
	/**
	 * The cached value of the '{@link #getHasControlElements() <em>Has Control Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasControlElements()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcRelFlowControlElements> hasControlElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcDistributionFlowElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcDistributionFlowElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcRelFlowControlElements> getHasControlElements() {
		if (hasControlElements == null) {
			hasControlElements = new EObjectWithInverseResolvingEList.Unsettable<IfcRelFlowControlElements>(IfcRelFlowControlElements.class, this, Ifc2x3tc1Package.IFC_DISTRIBUTION_FLOW_ELEMENT__HAS_CONTROL_ELEMENTS, Ifc2x3tc1Package.IFC_REL_FLOW_CONTROL_ELEMENTS__RELATING_FLOW_ELEMENT);
		}
		return hasControlElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHasControlElements() {
		if (hasControlElements != null) ((InternalEList.Unsettable<?>)hasControlElements).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHasControlElements() {
		return hasControlElements != null && ((InternalEList.Unsettable<?>)hasControlElements).isSet();
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
			case Ifc2x3tc1Package.IFC_DISTRIBUTION_FLOW_ELEMENT__HAS_CONTROL_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasControlElements()).basicAdd(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_DISTRIBUTION_FLOW_ELEMENT__HAS_CONTROL_ELEMENTS:
				return ((InternalEList<?>)getHasControlElements()).basicRemove(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_DISTRIBUTION_FLOW_ELEMENT__HAS_CONTROL_ELEMENTS:
				return getHasControlElements();
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
			case Ifc2x3tc1Package.IFC_DISTRIBUTION_FLOW_ELEMENT__HAS_CONTROL_ELEMENTS:
				getHasControlElements().clear();
				getHasControlElements().addAll((Collection<? extends IfcRelFlowControlElements>)newValue);
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
			case Ifc2x3tc1Package.IFC_DISTRIBUTION_FLOW_ELEMENT__HAS_CONTROL_ELEMENTS:
				unsetHasControlElements();
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
			case Ifc2x3tc1Package.IFC_DISTRIBUTION_FLOW_ELEMENT__HAS_CONTROL_ELEMENTS:
				return isSetHasControlElements();
		}
		return super.eIsSet(featureID);
	}

} //IfcDistributionFlowElementImpl
