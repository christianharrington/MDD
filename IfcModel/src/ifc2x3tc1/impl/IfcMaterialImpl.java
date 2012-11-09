/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcMaterial;
import ifc2x3tc1.IfcMaterialClassificationRelationship;
import ifc2x3tc1.IfcMaterialDefinitionRepresentation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Material</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcMaterialImpl#getName <em>Name</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcMaterialImpl#getHasRepresentation <em>Has Representation</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcMaterialImpl#getClassifiedAs <em>Classified As</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcMaterialImpl extends EObjectImpl implements IfcMaterial {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasRepresentation() <em>Has Representation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasRepresentation()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcMaterialDefinitionRepresentation> hasRepresentation;

	/**
	 * The cached value of the '{@link #getClassifiedAs() <em>Classified As</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifiedAs()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcMaterialClassificationRelationship> classifiedAs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcMaterialImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcMaterial();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_MATERIAL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcMaterialDefinitionRepresentation> getHasRepresentation() {
		if (hasRepresentation == null) {
			hasRepresentation = new EObjectWithInverseResolvingEList.Unsettable<IfcMaterialDefinitionRepresentation>(IfcMaterialDefinitionRepresentation.class, this, Ifc2x3tc1Package.IFC_MATERIAL__HAS_REPRESENTATION, Ifc2x3tc1Package.IFC_MATERIAL_DEFINITION_REPRESENTATION__REPRESENTED_MATERIAL);
		}
		return hasRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHasRepresentation() {
		if (hasRepresentation != null) ((InternalEList.Unsettable<?>)hasRepresentation).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHasRepresentation() {
		return hasRepresentation != null && ((InternalEList.Unsettable<?>)hasRepresentation).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcMaterialClassificationRelationship> getClassifiedAs() {
		if (classifiedAs == null) {
			classifiedAs = new EObjectWithInverseResolvingEList.Unsettable<IfcMaterialClassificationRelationship>(IfcMaterialClassificationRelationship.class, this, Ifc2x3tc1Package.IFC_MATERIAL__CLASSIFIED_AS, Ifc2x3tc1Package.IFC_MATERIAL_CLASSIFICATION_RELATIONSHIP__CLASSIFIED_MATERIAL);
		}
		return classifiedAs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetClassifiedAs() {
		if (classifiedAs != null) ((InternalEList.Unsettable<?>)classifiedAs).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetClassifiedAs() {
		return classifiedAs != null && ((InternalEList.Unsettable<?>)classifiedAs).isSet();
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
			case Ifc2x3tc1Package.IFC_MATERIAL__HAS_REPRESENTATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasRepresentation()).basicAdd(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_MATERIAL__CLASSIFIED_AS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getClassifiedAs()).basicAdd(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_MATERIAL__HAS_REPRESENTATION:
				return ((InternalEList<?>)getHasRepresentation()).basicRemove(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_MATERIAL__CLASSIFIED_AS:
				return ((InternalEList<?>)getClassifiedAs()).basicRemove(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_MATERIAL__NAME:
				return getName();
			case Ifc2x3tc1Package.IFC_MATERIAL__HAS_REPRESENTATION:
				return getHasRepresentation();
			case Ifc2x3tc1Package.IFC_MATERIAL__CLASSIFIED_AS:
				return getClassifiedAs();
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
			case Ifc2x3tc1Package.IFC_MATERIAL__NAME:
				setName((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_MATERIAL__HAS_REPRESENTATION:
				getHasRepresentation().clear();
				getHasRepresentation().addAll((Collection<? extends IfcMaterialDefinitionRepresentation>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_MATERIAL__CLASSIFIED_AS:
				getClassifiedAs().clear();
				getClassifiedAs().addAll((Collection<? extends IfcMaterialClassificationRelationship>)newValue);
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
			case Ifc2x3tc1Package.IFC_MATERIAL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_MATERIAL__HAS_REPRESENTATION:
				unsetHasRepresentation();
				return;
			case Ifc2x3tc1Package.IFC_MATERIAL__CLASSIFIED_AS:
				unsetClassifiedAs();
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
			case Ifc2x3tc1Package.IFC_MATERIAL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Ifc2x3tc1Package.IFC_MATERIAL__HAS_REPRESENTATION:
				return isSetHasRepresentation();
			case Ifc2x3tc1Package.IFC_MATERIAL__CLASSIFIED_AS:
				return isSetClassifiedAs();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //IfcMaterialImpl
