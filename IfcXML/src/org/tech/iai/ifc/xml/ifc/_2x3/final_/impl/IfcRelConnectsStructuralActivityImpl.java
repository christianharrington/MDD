/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelConnectsStructuralActivity;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatedStructuralActivityType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingElementType1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Connects Structural Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelConnectsStructuralActivityImpl#getRelatingElement <em>Relating Element</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelConnectsStructuralActivityImpl#getRelatedStructuralActivity <em>Related Structural Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelConnectsStructuralActivityImpl extends IfcRelConnectsImpl implements IfcRelConnectsStructuralActivity {
	/**
	 * The cached value of the '{@link #getRelatingElement() <em>Relating Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingElement()
	 * @generated
	 * @ordered
	 */
	protected RelatingElementType1 relatingElement;

	/**
	 * The cached value of the '{@link #getRelatedStructuralActivity() <em>Related Structural Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedStructuralActivity()
	 * @generated
	 * @ordered
	 */
	protected RelatedStructuralActivityType relatedStructuralActivity;

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
		return FinalPackage.eINSTANCE.getIfcRelConnectsStructuralActivity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingElementType1 getRelatingElement() {
		return relatingElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatingElement(RelatingElementType1 newRelatingElement, NotificationChain msgs) {
		RelatingElementType1 oldRelatingElement = relatingElement;
		relatingElement = newRelatingElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_ACTIVITY__RELATING_ELEMENT, oldRelatingElement, newRelatingElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingElement(RelatingElementType1 newRelatingElement) {
		if (newRelatingElement != relatingElement) {
			NotificationChain msgs = null;
			if (relatingElement != null)
				msgs = ((InternalEObject)relatingElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_ACTIVITY__RELATING_ELEMENT, null, msgs);
			if (newRelatingElement != null)
				msgs = ((InternalEObject)newRelatingElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_ACTIVITY__RELATING_ELEMENT, null, msgs);
			msgs = basicSetRelatingElement(newRelatingElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_ACTIVITY__RELATING_ELEMENT, newRelatingElement, newRelatingElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedStructuralActivityType getRelatedStructuralActivity() {
		return relatedStructuralActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatedStructuralActivity(RelatedStructuralActivityType newRelatedStructuralActivity, NotificationChain msgs) {
		RelatedStructuralActivityType oldRelatedStructuralActivity = relatedStructuralActivity;
		relatedStructuralActivity = newRelatedStructuralActivity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_ACTIVITY__RELATED_STRUCTURAL_ACTIVITY, oldRelatedStructuralActivity, newRelatedStructuralActivity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedStructuralActivity(RelatedStructuralActivityType newRelatedStructuralActivity) {
		if (newRelatedStructuralActivity != relatedStructuralActivity) {
			NotificationChain msgs = null;
			if (relatedStructuralActivity != null)
				msgs = ((InternalEObject)relatedStructuralActivity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_ACTIVITY__RELATED_STRUCTURAL_ACTIVITY, null, msgs);
			if (newRelatedStructuralActivity != null)
				msgs = ((InternalEObject)newRelatedStructuralActivity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_ACTIVITY__RELATED_STRUCTURAL_ACTIVITY, null, msgs);
			msgs = basicSetRelatedStructuralActivity(newRelatedStructuralActivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_ACTIVITY__RELATED_STRUCTURAL_ACTIVITY, newRelatedStructuralActivity, newRelatedStructuralActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_ACTIVITY__RELATING_ELEMENT:
				return basicSetRelatingElement(null, msgs);
			case FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_ACTIVITY__RELATED_STRUCTURAL_ACTIVITY:
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
			case FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_ACTIVITY__RELATING_ELEMENT:
				return getRelatingElement();
			case FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_ACTIVITY__RELATED_STRUCTURAL_ACTIVITY:
				return getRelatedStructuralActivity();
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
			case FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_ACTIVITY__RELATING_ELEMENT:
				setRelatingElement((RelatingElementType1)newValue);
				return;
			case FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_ACTIVITY__RELATED_STRUCTURAL_ACTIVITY:
				setRelatedStructuralActivity((RelatedStructuralActivityType)newValue);
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
			case FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_ACTIVITY__RELATING_ELEMENT:
				setRelatingElement((RelatingElementType1)null);
				return;
			case FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_ACTIVITY__RELATED_STRUCTURAL_ACTIVITY:
				setRelatedStructuralActivity((RelatedStructuralActivityType)null);
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
			case FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_ACTIVITY__RELATING_ELEMENT:
				return relatingElement != null;
			case FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_ACTIVITY__RELATED_STRUCTURAL_ACTIVITY:
				return relatedStructuralActivity != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcRelConnectsStructuralActivityImpl
