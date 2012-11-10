/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcRelConnectsStructuralElement;
import ifc2x3tc1.IfcRelConnectsStructuralMember;
import ifc2x3tc1.IfcStructuralMember;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Structural Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralMemberImpl#getReferencesElement <em>References Element</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralMemberImpl#getConnectedBy <em>Connected By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcStructuralMemberImpl extends IfcStructuralItemImpl implements IfcStructuralMember {
	/**
	 * The cached value of the '{@link #getReferencesElement() <em>References Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencesElement()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcRelConnectsStructuralElement> referencesElement;

	/**
	 * The cached value of the '{@link #getConnectedBy() <em>Connected By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcRelConnectsStructuralMember> connectedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcStructuralMemberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcStructuralMember();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcRelConnectsStructuralElement> getReferencesElement() {
		if (referencesElement == null) {
			referencesElement = new EObjectWithInverseResolvingEList.Unsettable<IfcRelConnectsStructuralElement>(IfcRelConnectsStructuralElement.class, this, Ifc2x3tc1Package.IFC_STRUCTURAL_MEMBER__REFERENCES_ELEMENT, Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_ELEMENT__RELATED_STRUCTURAL_MEMBER);
		}
		return referencesElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReferencesElement() {
		if (referencesElement != null) ((InternalEList.Unsettable<?>)referencesElement).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReferencesElement() {
		return referencesElement != null && ((InternalEList.Unsettable<?>)referencesElement).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcRelConnectsStructuralMember> getConnectedBy() {
		if (connectedBy == null) {
			connectedBy = new EObjectWithInverseResolvingEList.Unsettable<IfcRelConnectsStructuralMember>(IfcRelConnectsStructuralMember.class, this, Ifc2x3tc1Package.IFC_STRUCTURAL_MEMBER__CONNECTED_BY, Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__RELATING_STRUCTURAL_MEMBER);
		}
		return connectedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConnectedBy() {
		if (connectedBy != null) ((InternalEList.Unsettable<?>)connectedBy).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConnectedBy() {
		return connectedBy != null && ((InternalEList.Unsettable<?>)connectedBy).isSet();
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_MEMBER__REFERENCES_ELEMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferencesElement()).basicAdd(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_STRUCTURAL_MEMBER__CONNECTED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnectedBy()).basicAdd(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_MEMBER__REFERENCES_ELEMENT:
				return ((InternalEList<?>)getReferencesElement()).basicRemove(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_STRUCTURAL_MEMBER__CONNECTED_BY:
				return ((InternalEList<?>)getConnectedBy()).basicRemove(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_MEMBER__REFERENCES_ELEMENT:
				return getReferencesElement();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_MEMBER__CONNECTED_BY:
				return getConnectedBy();
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_MEMBER__REFERENCES_ELEMENT:
				getReferencesElement().clear();
				getReferencesElement().addAll((Collection<? extends IfcRelConnectsStructuralElement>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_MEMBER__CONNECTED_BY:
				getConnectedBy().clear();
				getConnectedBy().addAll((Collection<? extends IfcRelConnectsStructuralMember>)newValue);
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_MEMBER__REFERENCES_ELEMENT:
				unsetReferencesElement();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_MEMBER__CONNECTED_BY:
				unsetConnectedBy();
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_MEMBER__REFERENCES_ELEMENT:
				return isSetReferencesElement();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_MEMBER__CONNECTED_BY:
				return isSetConnectedBy();
		}
		return super.eIsSet(featureID);
	}

} //IfcStructuralMemberImpl
