/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcFeatureElementSubtraction;
import ifc2x3tc1.IfcRelVoidsElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Feature Element Subtraction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcFeatureElementSubtractionImpl#getVoidsElements <em>Voids Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcFeatureElementSubtractionImpl extends IfcFeatureElementImpl implements IfcFeatureElementSubtraction {
	/**
	 * The cached value of the '{@link #getVoidsElements() <em>Voids Elements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoidsElements()
	 * @generated
	 * @ordered
	 */
	protected IfcRelVoidsElement voidsElements;

	/**
	 * This is true if the Voids Elements reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean voidsElementsESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcFeatureElementSubtractionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcFeatureElementSubtraction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelVoidsElement getVoidsElements() {
		if (voidsElements != null && voidsElements.eIsProxy()) {
			InternalEObject oldVoidsElements = (InternalEObject)voidsElements;
			voidsElements = (IfcRelVoidsElement)eResolveProxy(oldVoidsElements);
			if (voidsElements != oldVoidsElements) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_FEATURE_ELEMENT_SUBTRACTION__VOIDS_ELEMENTS, oldVoidsElements, voidsElements));
			}
		}
		return voidsElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelVoidsElement basicGetVoidsElements() {
		return voidsElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVoidsElements(IfcRelVoidsElement newVoidsElements, NotificationChain msgs) {
		IfcRelVoidsElement oldVoidsElements = voidsElements;
		voidsElements = newVoidsElements;
		boolean oldVoidsElementsESet = voidsElementsESet;
		voidsElementsESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_FEATURE_ELEMENT_SUBTRACTION__VOIDS_ELEMENTS, oldVoidsElements, newVoidsElements, !oldVoidsElementsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoidsElements(IfcRelVoidsElement newVoidsElements) {
		if (newVoidsElements != voidsElements) {
			NotificationChain msgs = null;
			if (voidsElements != null)
				msgs = ((InternalEObject)voidsElements).eInverseRemove(this, Ifc2x3tc1Package.IFC_REL_VOIDS_ELEMENT__RELATED_OPENING_ELEMENT, IfcRelVoidsElement.class, msgs);
			if (newVoidsElements != null)
				msgs = ((InternalEObject)newVoidsElements).eInverseAdd(this, Ifc2x3tc1Package.IFC_REL_VOIDS_ELEMENT__RELATED_OPENING_ELEMENT, IfcRelVoidsElement.class, msgs);
			msgs = basicSetVoidsElements(newVoidsElements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldVoidsElementsESet = voidsElementsESet;
			voidsElementsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_FEATURE_ELEMENT_SUBTRACTION__VOIDS_ELEMENTS, newVoidsElements, newVoidsElements, !oldVoidsElementsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetVoidsElements(NotificationChain msgs) {
		IfcRelVoidsElement oldVoidsElements = voidsElements;
		voidsElements = null;
		boolean oldVoidsElementsESet = voidsElementsESet;
		voidsElementsESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_FEATURE_ELEMENT_SUBTRACTION__VOIDS_ELEMENTS, oldVoidsElements, null, oldVoidsElementsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVoidsElements() {
		if (voidsElements != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)voidsElements).eInverseRemove(this, Ifc2x3tc1Package.IFC_REL_VOIDS_ELEMENT__RELATED_OPENING_ELEMENT, IfcRelVoidsElement.class, msgs);
			msgs = basicUnsetVoidsElements(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldVoidsElementsESet = voidsElementsESet;
			voidsElementsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_FEATURE_ELEMENT_SUBTRACTION__VOIDS_ELEMENTS, null, null, oldVoidsElementsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVoidsElements() {
		return voidsElementsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_FEATURE_ELEMENT_SUBTRACTION__VOIDS_ELEMENTS:
				if (voidsElements != null)
					msgs = ((InternalEObject)voidsElements).eInverseRemove(this, Ifc2x3tc1Package.IFC_REL_VOIDS_ELEMENT__RELATED_OPENING_ELEMENT, IfcRelVoidsElement.class, msgs);
				return basicSetVoidsElements((IfcRelVoidsElement)otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_FEATURE_ELEMENT_SUBTRACTION__VOIDS_ELEMENTS:
				return basicUnsetVoidsElements(msgs);
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
			case Ifc2x3tc1Package.IFC_FEATURE_ELEMENT_SUBTRACTION__VOIDS_ELEMENTS:
				if (resolve) return getVoidsElements();
				return basicGetVoidsElements();
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
			case Ifc2x3tc1Package.IFC_FEATURE_ELEMENT_SUBTRACTION__VOIDS_ELEMENTS:
				setVoidsElements((IfcRelVoidsElement)newValue);
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
			case Ifc2x3tc1Package.IFC_FEATURE_ELEMENT_SUBTRACTION__VOIDS_ELEMENTS:
				unsetVoidsElements();
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
			case Ifc2x3tc1Package.IFC_FEATURE_ELEMENT_SUBTRACTION__VOIDS_ELEMENTS:
				return isSetVoidsElements();
		}
		return super.eIsSet(featureID);
	}

} //IfcFeatureElementSubtractionImpl
