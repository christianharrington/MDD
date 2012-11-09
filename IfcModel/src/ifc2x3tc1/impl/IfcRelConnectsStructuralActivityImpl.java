/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcRelConnectsStructuralActivity;
import ifc2x3tc1.IfcStructuralActivity;
import ifc2x3tc1.IfcStructuralActivityAssignmentSelect;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Connects Structural Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcRelConnectsStructuralActivityImpl#getRelatingElement <em>Relating Element</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRelConnectsStructuralActivityImpl#getRelatedStructuralActivity <em>Related Structural Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelConnectsStructuralActivityImpl extends IfcRelConnectsImpl implements IfcRelConnectsStructuralActivity {
	/**
	 * The cached value of the '{@link #getRelatingElement() <em>Relating Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingElement()
	 * @generated
	 * @ordered
	 */
	protected IfcStructuralActivityAssignmentSelect relatingElement;

	/**
	 * The cached value of the '{@link #getRelatedStructuralActivity() <em>Related Structural Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedStructuralActivity()
	 * @generated
	 * @ordered
	 */
	protected IfcStructuralActivity relatedStructuralActivity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelConnectsStructuralActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcRelConnectsStructuralActivity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralActivityAssignmentSelect getRelatingElement() {
		if (relatingElement != null && relatingElement.eIsProxy()) {
			InternalEObject oldRelatingElement = (InternalEObject)relatingElement;
			relatingElement = (IfcStructuralActivityAssignmentSelect)eResolveProxy(oldRelatingElement);
			if (relatingElement != oldRelatingElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_ACTIVITY__RELATING_ELEMENT, oldRelatingElement, relatingElement));
			}
		}
		return relatingElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralActivityAssignmentSelect basicGetRelatingElement() {
		return relatingElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingElement(IfcStructuralActivityAssignmentSelect newRelatingElement) {
		IfcStructuralActivityAssignmentSelect oldRelatingElement = relatingElement;
		relatingElement = newRelatingElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_ACTIVITY__RELATING_ELEMENT, oldRelatingElement, relatingElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralActivity getRelatedStructuralActivity() {
		if (relatedStructuralActivity != null && relatedStructuralActivity.eIsProxy()) {
			InternalEObject oldRelatedStructuralActivity = (InternalEObject)relatedStructuralActivity;
			relatedStructuralActivity = (IfcStructuralActivity)eResolveProxy(oldRelatedStructuralActivity);
			if (relatedStructuralActivity != oldRelatedStructuralActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_ACTIVITY__RELATED_STRUCTURAL_ACTIVITY, oldRelatedStructuralActivity, relatedStructuralActivity));
			}
		}
		return relatedStructuralActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralActivity basicGetRelatedStructuralActivity() {
		return relatedStructuralActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatedStructuralActivity(IfcStructuralActivity newRelatedStructuralActivity, NotificationChain msgs) {
		IfcStructuralActivity oldRelatedStructuralActivity = relatedStructuralActivity;
		relatedStructuralActivity = newRelatedStructuralActivity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_ACTIVITY__RELATED_STRUCTURAL_ACTIVITY, oldRelatedStructuralActivity, newRelatedStructuralActivity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedStructuralActivity(IfcStructuralActivity newRelatedStructuralActivity) {
		if (newRelatedStructuralActivity != relatedStructuralActivity) {
			NotificationChain msgs = null;
			if (relatedStructuralActivity != null)
				msgs = ((InternalEObject)relatedStructuralActivity).eInverseRemove(this, Ifc2x3tc1Package.IFC_STRUCTURAL_ACTIVITY__ASSIGNED_TO_STRUCTURAL_ITEM, IfcStructuralActivity.class, msgs);
			if (newRelatedStructuralActivity != null)
				msgs = ((InternalEObject)newRelatedStructuralActivity).eInverseAdd(this, Ifc2x3tc1Package.IFC_STRUCTURAL_ACTIVITY__ASSIGNED_TO_STRUCTURAL_ITEM, IfcStructuralActivity.class, msgs);
			msgs = basicSetRelatedStructuralActivity(newRelatedStructuralActivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_ACTIVITY__RELATED_STRUCTURAL_ACTIVITY, newRelatedStructuralActivity, newRelatedStructuralActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_ACTIVITY__RELATED_STRUCTURAL_ACTIVITY:
				if (relatedStructuralActivity != null)
					msgs = ((InternalEObject)relatedStructuralActivity).eInverseRemove(this, Ifc2x3tc1Package.IFC_STRUCTURAL_ACTIVITY__ASSIGNED_TO_STRUCTURAL_ITEM, IfcStructuralActivity.class, msgs);
				return basicSetRelatedStructuralActivity((IfcStructuralActivity)otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_ACTIVITY__RELATED_STRUCTURAL_ACTIVITY:
				return basicSetRelatedStructuralActivity(null, msgs);
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
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_ACTIVITY__RELATING_ELEMENT:
				if (resolve) return getRelatingElement();
				return basicGetRelatingElement();
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_ACTIVITY__RELATED_STRUCTURAL_ACTIVITY:
				if (resolve) return getRelatedStructuralActivity();
				return basicGetRelatedStructuralActivity();
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
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_ACTIVITY__RELATING_ELEMENT:
				setRelatingElement((IfcStructuralActivityAssignmentSelect)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_ACTIVITY__RELATED_STRUCTURAL_ACTIVITY:
				setRelatedStructuralActivity((IfcStructuralActivity)newValue);
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
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_ACTIVITY__RELATING_ELEMENT:
				setRelatingElement((IfcStructuralActivityAssignmentSelect)null);
				return;
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_ACTIVITY__RELATED_STRUCTURAL_ACTIVITY:
				setRelatedStructuralActivity((IfcStructuralActivity)null);
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
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_ACTIVITY__RELATING_ELEMENT:
				return relatingElement != null;
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_ACTIVITY__RELATED_STRUCTURAL_ACTIVITY:
				return relatedStructuralActivity != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcRelConnectsStructuralActivityImpl
