/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcDistributionControlElement;
import ifc2x3tc1.IfcDistributionFlowElement;
import ifc2x3tc1.IfcRelFlowControlElements;

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
 * An implementation of the model object '<em><b>Ifc Rel Flow Control Elements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcRelFlowControlElementsImpl#getRelatedControlElements <em>Related Control Elements</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRelFlowControlElementsImpl#getRelatingFlowElement <em>Relating Flow Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelFlowControlElementsImpl extends IfcRelConnectsImpl implements IfcRelFlowControlElements {
	/**
	 * The cached value of the '{@link #getRelatedControlElements() <em>Related Control Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedControlElements()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcDistributionControlElement> relatedControlElements;

	/**
	 * The cached value of the '{@link #getRelatingFlowElement() <em>Relating Flow Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingFlowElement()
	 * @generated
	 * @ordered
	 */
	protected IfcDistributionFlowElement relatingFlowElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelFlowControlElementsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcRelFlowControlElements();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcDistributionControlElement> getRelatedControlElements() {
		if (relatedControlElements == null) {
			relatedControlElements = new EObjectWithInverseResolvingEList.ManyInverse<IfcDistributionControlElement>(IfcDistributionControlElement.class, this, Ifc2x3tc1Package.IFC_REL_FLOW_CONTROL_ELEMENTS__RELATED_CONTROL_ELEMENTS, Ifc2x3tc1Package.IFC_DISTRIBUTION_CONTROL_ELEMENT__ASSIGNED_TO_FLOW_ELEMENT);
		}
		return relatedControlElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDistributionFlowElement getRelatingFlowElement() {
		if (relatingFlowElement != null && relatingFlowElement.eIsProxy()) {
			InternalEObject oldRelatingFlowElement = (InternalEObject)relatingFlowElement;
			relatingFlowElement = (IfcDistributionFlowElement)eResolveProxy(oldRelatingFlowElement);
			if (relatingFlowElement != oldRelatingFlowElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_REL_FLOW_CONTROL_ELEMENTS__RELATING_FLOW_ELEMENT, oldRelatingFlowElement, relatingFlowElement));
			}
		}
		return relatingFlowElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDistributionFlowElement basicGetRelatingFlowElement() {
		return relatingFlowElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatingFlowElement(IfcDistributionFlowElement newRelatingFlowElement, NotificationChain msgs) {
		IfcDistributionFlowElement oldRelatingFlowElement = relatingFlowElement;
		relatingFlowElement = newRelatingFlowElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_FLOW_CONTROL_ELEMENTS__RELATING_FLOW_ELEMENT, oldRelatingFlowElement, newRelatingFlowElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingFlowElement(IfcDistributionFlowElement newRelatingFlowElement) {
		if (newRelatingFlowElement != relatingFlowElement) {
			NotificationChain msgs = null;
			if (relatingFlowElement != null)
				msgs = ((InternalEObject)relatingFlowElement).eInverseRemove(this, Ifc2x3tc1Package.IFC_DISTRIBUTION_FLOW_ELEMENT__HAS_CONTROL_ELEMENTS, IfcDistributionFlowElement.class, msgs);
			if (newRelatingFlowElement != null)
				msgs = ((InternalEObject)newRelatingFlowElement).eInverseAdd(this, Ifc2x3tc1Package.IFC_DISTRIBUTION_FLOW_ELEMENT__HAS_CONTROL_ELEMENTS, IfcDistributionFlowElement.class, msgs);
			msgs = basicSetRelatingFlowElement(newRelatingFlowElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_FLOW_CONTROL_ELEMENTS__RELATING_FLOW_ELEMENT, newRelatingFlowElement, newRelatingFlowElement));
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
			case Ifc2x3tc1Package.IFC_REL_FLOW_CONTROL_ELEMENTS__RELATED_CONTROL_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRelatedControlElements()).basicAdd(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_REL_FLOW_CONTROL_ELEMENTS__RELATING_FLOW_ELEMENT:
				if (relatingFlowElement != null)
					msgs = ((InternalEObject)relatingFlowElement).eInverseRemove(this, Ifc2x3tc1Package.IFC_DISTRIBUTION_FLOW_ELEMENT__HAS_CONTROL_ELEMENTS, IfcDistributionFlowElement.class, msgs);
				return basicSetRelatingFlowElement((IfcDistributionFlowElement)otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_REL_FLOW_CONTROL_ELEMENTS__RELATED_CONTROL_ELEMENTS:
				return ((InternalEList<?>)getRelatedControlElements()).basicRemove(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_REL_FLOW_CONTROL_ELEMENTS__RELATING_FLOW_ELEMENT:
				return basicSetRelatingFlowElement(null, msgs);
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
			case Ifc2x3tc1Package.IFC_REL_FLOW_CONTROL_ELEMENTS__RELATED_CONTROL_ELEMENTS:
				return getRelatedControlElements();
			case Ifc2x3tc1Package.IFC_REL_FLOW_CONTROL_ELEMENTS__RELATING_FLOW_ELEMENT:
				if (resolve) return getRelatingFlowElement();
				return basicGetRelatingFlowElement();
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
			case Ifc2x3tc1Package.IFC_REL_FLOW_CONTROL_ELEMENTS__RELATED_CONTROL_ELEMENTS:
				getRelatedControlElements().clear();
				getRelatedControlElements().addAll((Collection<? extends IfcDistributionControlElement>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REL_FLOW_CONTROL_ELEMENTS__RELATING_FLOW_ELEMENT:
				setRelatingFlowElement((IfcDistributionFlowElement)newValue);
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
			case Ifc2x3tc1Package.IFC_REL_FLOW_CONTROL_ELEMENTS__RELATED_CONTROL_ELEMENTS:
				getRelatedControlElements().clear();
				return;
			case Ifc2x3tc1Package.IFC_REL_FLOW_CONTROL_ELEMENTS__RELATING_FLOW_ELEMENT:
				setRelatingFlowElement((IfcDistributionFlowElement)null);
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
			case Ifc2x3tc1Package.IFC_REL_FLOW_CONTROL_ELEMENTS__RELATED_CONTROL_ELEMENTS:
				return relatedControlElements != null && !relatedControlElements.isEmpty();
			case Ifc2x3tc1Package.IFC_REL_FLOW_CONTROL_ELEMENTS__RELATING_FLOW_ELEMENT:
				return relatingFlowElement != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcRelFlowControlElementsImpl
