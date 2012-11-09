/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcDraughtingCallout;
import ifc2x3tc1.IfcDraughtingCalloutElement;
import ifc2x3tc1.IfcDraughtingCalloutRelationship;

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
 * An implementation of the model object '<em><b>Ifc Draughting Callout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcDraughtingCalloutImpl#getContents <em>Contents</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcDraughtingCalloutImpl#getIsRelatedFromCallout <em>Is Related From Callout</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcDraughtingCalloutImpl#getIsRelatedToCallout <em>Is Related To Callout</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcDraughtingCalloutImpl extends IfcGeometricRepresentationItemImpl implements IfcDraughtingCallout {
	/**
	 * The cached value of the '{@link #getContents() <em>Contents</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContents()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcDraughtingCalloutElement> contents;

	/**
	 * The cached value of the '{@link #getIsRelatedFromCallout() <em>Is Related From Callout</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsRelatedFromCallout()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcDraughtingCalloutRelationship> isRelatedFromCallout;

	/**
	 * The cached value of the '{@link #getIsRelatedToCallout() <em>Is Related To Callout</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsRelatedToCallout()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcDraughtingCalloutRelationship> isRelatedToCallout;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcDraughtingCalloutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcDraughtingCallout();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcDraughtingCalloutElement> getContents() {
		if (contents == null) {
			contents = new EObjectResolvingEList<IfcDraughtingCalloutElement>(IfcDraughtingCalloutElement.class, this, Ifc2x3tc1Package.IFC_DRAUGHTING_CALLOUT__CONTENTS);
		}
		return contents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcDraughtingCalloutRelationship> getIsRelatedFromCallout() {
		if (isRelatedFromCallout == null) {
			isRelatedFromCallout = new EObjectWithInverseResolvingEList.Unsettable<IfcDraughtingCalloutRelationship>(IfcDraughtingCalloutRelationship.class, this, Ifc2x3tc1Package.IFC_DRAUGHTING_CALLOUT__IS_RELATED_FROM_CALLOUT, Ifc2x3tc1Package.IFC_DRAUGHTING_CALLOUT_RELATIONSHIP__RELATED_DRAUGHTING_CALLOUT);
		}
		return isRelatedFromCallout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsRelatedFromCallout() {
		if (isRelatedFromCallout != null) ((InternalEList.Unsettable<?>)isRelatedFromCallout).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsRelatedFromCallout() {
		return isRelatedFromCallout != null && ((InternalEList.Unsettable<?>)isRelatedFromCallout).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcDraughtingCalloutRelationship> getIsRelatedToCallout() {
		if (isRelatedToCallout == null) {
			isRelatedToCallout = new EObjectWithInverseResolvingEList.Unsettable<IfcDraughtingCalloutRelationship>(IfcDraughtingCalloutRelationship.class, this, Ifc2x3tc1Package.IFC_DRAUGHTING_CALLOUT__IS_RELATED_TO_CALLOUT, Ifc2x3tc1Package.IFC_DRAUGHTING_CALLOUT_RELATIONSHIP__RELATING_DRAUGHTING_CALLOUT);
		}
		return isRelatedToCallout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsRelatedToCallout() {
		if (isRelatedToCallout != null) ((InternalEList.Unsettable<?>)isRelatedToCallout).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsRelatedToCallout() {
		return isRelatedToCallout != null && ((InternalEList.Unsettable<?>)isRelatedToCallout).isSet();
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
			case Ifc2x3tc1Package.IFC_DRAUGHTING_CALLOUT__IS_RELATED_FROM_CALLOUT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsRelatedFromCallout()).basicAdd(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_DRAUGHTING_CALLOUT__IS_RELATED_TO_CALLOUT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsRelatedToCallout()).basicAdd(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_DRAUGHTING_CALLOUT__IS_RELATED_FROM_CALLOUT:
				return ((InternalEList<?>)getIsRelatedFromCallout()).basicRemove(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_DRAUGHTING_CALLOUT__IS_RELATED_TO_CALLOUT:
				return ((InternalEList<?>)getIsRelatedToCallout()).basicRemove(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_DRAUGHTING_CALLOUT__CONTENTS:
				return getContents();
			case Ifc2x3tc1Package.IFC_DRAUGHTING_CALLOUT__IS_RELATED_FROM_CALLOUT:
				return getIsRelatedFromCallout();
			case Ifc2x3tc1Package.IFC_DRAUGHTING_CALLOUT__IS_RELATED_TO_CALLOUT:
				return getIsRelatedToCallout();
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
			case Ifc2x3tc1Package.IFC_DRAUGHTING_CALLOUT__CONTENTS:
				getContents().clear();
				getContents().addAll((Collection<? extends IfcDraughtingCalloutElement>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_DRAUGHTING_CALLOUT__IS_RELATED_FROM_CALLOUT:
				getIsRelatedFromCallout().clear();
				getIsRelatedFromCallout().addAll((Collection<? extends IfcDraughtingCalloutRelationship>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_DRAUGHTING_CALLOUT__IS_RELATED_TO_CALLOUT:
				getIsRelatedToCallout().clear();
				getIsRelatedToCallout().addAll((Collection<? extends IfcDraughtingCalloutRelationship>)newValue);
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
			case Ifc2x3tc1Package.IFC_DRAUGHTING_CALLOUT__CONTENTS:
				getContents().clear();
				return;
			case Ifc2x3tc1Package.IFC_DRAUGHTING_CALLOUT__IS_RELATED_FROM_CALLOUT:
				unsetIsRelatedFromCallout();
				return;
			case Ifc2x3tc1Package.IFC_DRAUGHTING_CALLOUT__IS_RELATED_TO_CALLOUT:
				unsetIsRelatedToCallout();
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
			case Ifc2x3tc1Package.IFC_DRAUGHTING_CALLOUT__CONTENTS:
				return contents != null && !contents.isEmpty();
			case Ifc2x3tc1Package.IFC_DRAUGHTING_CALLOUT__IS_RELATED_FROM_CALLOUT:
				return isSetIsRelatedFromCallout();
			case Ifc2x3tc1Package.IFC_DRAUGHTING_CALLOUT__IS_RELATED_TO_CALLOUT:
				return isSetIsRelatedToCallout();
		}
		return super.eIsSet(featureID);
	}

} //IfcDraughtingCalloutImpl
