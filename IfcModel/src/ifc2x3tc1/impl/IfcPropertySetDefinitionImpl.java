/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcPropertySetDefinition;
import ifc2x3tc1.IfcRelDefinesByProperties;
import ifc2x3tc1.IfcTypeObject;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Property Set Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcPropertySetDefinitionImpl#getPropertyDefinitionOf <em>Property Definition Of</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcPropertySetDefinitionImpl#getDefinesType <em>Defines Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcPropertySetDefinitionImpl extends IfcPropertyDefinitionImpl implements IfcPropertySetDefinition {
	/**
	 * The cached value of the '{@link #getPropertyDefinitionOf() <em>Property Definition Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyDefinitionOf()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcRelDefinesByProperties> propertyDefinitionOf;

	/**
	 * The cached value of the '{@link #getDefinesType() <em>Defines Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinesType()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcTypeObject> definesType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcPropertySetDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcPropertySetDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcRelDefinesByProperties> getPropertyDefinitionOf() {
		if (propertyDefinitionOf == null) {
			propertyDefinitionOf = new EObjectWithInverseResolvingEList.Unsettable<IfcRelDefinesByProperties>(IfcRelDefinesByProperties.class, this, Ifc2x3tc1Package.IFC_PROPERTY_SET_DEFINITION__PROPERTY_DEFINITION_OF, Ifc2x3tc1Package.IFC_REL_DEFINES_BY_PROPERTIES__RELATING_PROPERTY_DEFINITION);
		}
		return propertyDefinitionOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPropertyDefinitionOf() {
		if (propertyDefinitionOf != null) ((InternalEList.Unsettable<?>)propertyDefinitionOf).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPropertyDefinitionOf() {
		return propertyDefinitionOf != null && ((InternalEList.Unsettable<?>)propertyDefinitionOf).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcTypeObject> getDefinesType() {
		if (definesType == null) {
			definesType = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse<IfcTypeObject>(IfcTypeObject.class, this, Ifc2x3tc1Package.IFC_PROPERTY_SET_DEFINITION__DEFINES_TYPE, Ifc2x3tc1Package.IFC_TYPE_OBJECT__HAS_PROPERTY_SETS);
		}
		return definesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDefinesType() {
		if (definesType != null) ((InternalEList.Unsettable<?>)definesType).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDefinesType() {
		return definesType != null && ((InternalEList.Unsettable<?>)definesType).isSet();
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
			case Ifc2x3tc1Package.IFC_PROPERTY_SET_DEFINITION__PROPERTY_DEFINITION_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPropertyDefinitionOf()).basicAdd(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_PROPERTY_SET_DEFINITION__DEFINES_TYPE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDefinesType()).basicAdd(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_PROPERTY_SET_DEFINITION__PROPERTY_DEFINITION_OF:
				return ((InternalEList<?>)getPropertyDefinitionOf()).basicRemove(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_PROPERTY_SET_DEFINITION__DEFINES_TYPE:
				return ((InternalEList<?>)getDefinesType()).basicRemove(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_PROPERTY_SET_DEFINITION__PROPERTY_DEFINITION_OF:
				return getPropertyDefinitionOf();
			case Ifc2x3tc1Package.IFC_PROPERTY_SET_DEFINITION__DEFINES_TYPE:
				return getDefinesType();
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
			case Ifc2x3tc1Package.IFC_PROPERTY_SET_DEFINITION__PROPERTY_DEFINITION_OF:
				getPropertyDefinitionOf().clear();
				getPropertyDefinitionOf().addAll((Collection<? extends IfcRelDefinesByProperties>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_PROPERTY_SET_DEFINITION__DEFINES_TYPE:
				getDefinesType().clear();
				getDefinesType().addAll((Collection<? extends IfcTypeObject>)newValue);
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
			case Ifc2x3tc1Package.IFC_PROPERTY_SET_DEFINITION__PROPERTY_DEFINITION_OF:
				unsetPropertyDefinitionOf();
				return;
			case Ifc2x3tc1Package.IFC_PROPERTY_SET_DEFINITION__DEFINES_TYPE:
				unsetDefinesType();
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
			case Ifc2x3tc1Package.IFC_PROPERTY_SET_DEFINITION__PROPERTY_DEFINITION_OF:
				return isSetPropertyDefinitionOf();
			case Ifc2x3tc1Package.IFC_PROPERTY_SET_DEFINITION__DEFINES_TYPE:
				return isSetDefinesType();
		}
		return super.eIsSet(featureID);
	}

} //IfcPropertySetDefinitionImpl
