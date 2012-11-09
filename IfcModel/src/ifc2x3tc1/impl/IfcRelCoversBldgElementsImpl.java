/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcCovering;
import ifc2x3tc1.IfcElement;
import ifc2x3tc1.IfcRelCoversBldgElements;

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
 * An implementation of the model object '<em><b>Ifc Rel Covers Bldg Elements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcRelCoversBldgElementsImpl#getRelatingBuildingElement <em>Relating Building Element</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRelCoversBldgElementsImpl#getRelatedCoverings <em>Related Coverings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelCoversBldgElementsImpl extends IfcRelConnectsImpl implements IfcRelCoversBldgElements {
	/**
	 * The cached value of the '{@link #getRelatingBuildingElement() <em>Relating Building Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingBuildingElement()
	 * @generated
	 * @ordered
	 */
	protected IfcElement relatingBuildingElement;

	/**
	 * The cached value of the '{@link #getRelatedCoverings() <em>Related Coverings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedCoverings()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcCovering> relatedCoverings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelCoversBldgElementsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcRelCoversBldgElements();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElement getRelatingBuildingElement() {
		if (relatingBuildingElement != null && relatingBuildingElement.eIsProxy()) {
			InternalEObject oldRelatingBuildingElement = (InternalEObject)relatingBuildingElement;
			relatingBuildingElement = (IfcElement)eResolveProxy(oldRelatingBuildingElement);
			if (relatingBuildingElement != oldRelatingBuildingElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_REL_COVERS_BLDG_ELEMENTS__RELATING_BUILDING_ELEMENT, oldRelatingBuildingElement, relatingBuildingElement));
			}
		}
		return relatingBuildingElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElement basicGetRelatingBuildingElement() {
		return relatingBuildingElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatingBuildingElement(IfcElement newRelatingBuildingElement, NotificationChain msgs) {
		IfcElement oldRelatingBuildingElement = relatingBuildingElement;
		relatingBuildingElement = newRelatingBuildingElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_COVERS_BLDG_ELEMENTS__RELATING_BUILDING_ELEMENT, oldRelatingBuildingElement, newRelatingBuildingElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingBuildingElement(IfcElement newRelatingBuildingElement) {
		if (newRelatingBuildingElement != relatingBuildingElement) {
			NotificationChain msgs = null;
			if (relatingBuildingElement != null)
				msgs = ((InternalEObject)relatingBuildingElement).eInverseRemove(this, Ifc2x3tc1Package.IFC_ELEMENT__HAS_COVERINGS, IfcElement.class, msgs);
			if (newRelatingBuildingElement != null)
				msgs = ((InternalEObject)newRelatingBuildingElement).eInverseAdd(this, Ifc2x3tc1Package.IFC_ELEMENT__HAS_COVERINGS, IfcElement.class, msgs);
			msgs = basicSetRelatingBuildingElement(newRelatingBuildingElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_COVERS_BLDG_ELEMENTS__RELATING_BUILDING_ELEMENT, newRelatingBuildingElement, newRelatingBuildingElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcCovering> getRelatedCoverings() {
		if (relatedCoverings == null) {
			relatedCoverings = new EObjectWithInverseResolvingEList.ManyInverse<IfcCovering>(IfcCovering.class, this, Ifc2x3tc1Package.IFC_REL_COVERS_BLDG_ELEMENTS__RELATED_COVERINGS, Ifc2x3tc1Package.IFC_COVERING__COVERS);
		}
		return relatedCoverings;
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
			case Ifc2x3tc1Package.IFC_REL_COVERS_BLDG_ELEMENTS__RELATING_BUILDING_ELEMENT:
				if (relatingBuildingElement != null)
					msgs = ((InternalEObject)relatingBuildingElement).eInverseRemove(this, Ifc2x3tc1Package.IFC_ELEMENT__HAS_COVERINGS, IfcElement.class, msgs);
				return basicSetRelatingBuildingElement((IfcElement)otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_REL_COVERS_BLDG_ELEMENTS__RELATED_COVERINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRelatedCoverings()).basicAdd(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_REL_COVERS_BLDG_ELEMENTS__RELATING_BUILDING_ELEMENT:
				return basicSetRelatingBuildingElement(null, msgs);
			case Ifc2x3tc1Package.IFC_REL_COVERS_BLDG_ELEMENTS__RELATED_COVERINGS:
				return ((InternalEList<?>)getRelatedCoverings()).basicRemove(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_REL_COVERS_BLDG_ELEMENTS__RELATING_BUILDING_ELEMENT:
				if (resolve) return getRelatingBuildingElement();
				return basicGetRelatingBuildingElement();
			case Ifc2x3tc1Package.IFC_REL_COVERS_BLDG_ELEMENTS__RELATED_COVERINGS:
				return getRelatedCoverings();
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
			case Ifc2x3tc1Package.IFC_REL_COVERS_BLDG_ELEMENTS__RELATING_BUILDING_ELEMENT:
				setRelatingBuildingElement((IfcElement)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REL_COVERS_BLDG_ELEMENTS__RELATED_COVERINGS:
				getRelatedCoverings().clear();
				getRelatedCoverings().addAll((Collection<? extends IfcCovering>)newValue);
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
			case Ifc2x3tc1Package.IFC_REL_COVERS_BLDG_ELEMENTS__RELATING_BUILDING_ELEMENT:
				setRelatingBuildingElement((IfcElement)null);
				return;
			case Ifc2x3tc1Package.IFC_REL_COVERS_BLDG_ELEMENTS__RELATED_COVERINGS:
				getRelatedCoverings().clear();
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
			case Ifc2x3tc1Package.IFC_REL_COVERS_BLDG_ELEMENTS__RELATING_BUILDING_ELEMENT:
				return relatingBuildingElement != null;
			case Ifc2x3tc1Package.IFC_REL_COVERS_BLDG_ELEMENTS__RELATED_COVERINGS:
				return relatedCoverings != null && !relatedCoverings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IfcRelCoversBldgElementsImpl
