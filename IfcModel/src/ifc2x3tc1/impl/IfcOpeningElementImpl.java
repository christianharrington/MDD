/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcOpeningElement;
import ifc2x3tc1.IfcRelFillsElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Opening Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcOpeningElementImpl#getHasFillings <em>Has Fillings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcOpeningElementImpl extends IfcFeatureElementSubtractionImpl implements IfcOpeningElement {
	/**
	 * The cached value of the '{@link #getHasFillings() <em>Has Fillings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasFillings()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcRelFillsElement> hasFillings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcOpeningElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcOpeningElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcRelFillsElement> getHasFillings() {
		if (hasFillings == null) {
			hasFillings = new EObjectWithInverseResolvingEList.Unsettable<IfcRelFillsElement>(IfcRelFillsElement.class, this, Ifc2x3tc1Package.IFC_OPENING_ELEMENT__HAS_FILLINGS, Ifc2x3tc1Package.IFC_REL_FILLS_ELEMENT__RELATING_OPENING_ELEMENT);
		}
		return hasFillings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHasFillings() {
		if (hasFillings != null) ((InternalEList.Unsettable<?>)hasFillings).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHasFillings() {
		return hasFillings != null && ((InternalEList.Unsettable<?>)hasFillings).isSet();
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
			case Ifc2x3tc1Package.IFC_OPENING_ELEMENT__HAS_FILLINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasFillings()).basicAdd(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_OPENING_ELEMENT__HAS_FILLINGS:
				return ((InternalEList<?>)getHasFillings()).basicRemove(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_OPENING_ELEMENT__HAS_FILLINGS:
				return getHasFillings();
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
			case Ifc2x3tc1Package.IFC_OPENING_ELEMENT__HAS_FILLINGS:
				getHasFillings().clear();
				getHasFillings().addAll((Collection<? extends IfcRelFillsElement>)newValue);
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
			case Ifc2x3tc1Package.IFC_OPENING_ELEMENT__HAS_FILLINGS:
				unsetHasFillings();
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
			case Ifc2x3tc1Package.IFC_OPENING_ELEMENT__HAS_FILLINGS:
				return isSetHasFillings();
		}
		return super.eIsSet(featureID);
	}

} //IfcOpeningElementImpl
