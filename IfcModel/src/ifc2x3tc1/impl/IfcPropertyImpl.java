/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcComplexProperty;
import ifc2x3tc1.IfcProperty;
import ifc2x3tc1.IfcPropertyDependencyRelationship;

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
 * An implementation of the model object '<em><b>Ifc Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcPropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcPropertyImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcPropertyImpl#getPropertyForDependance <em>Property For Dependance</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcPropertyImpl#getPropertyDependsOn <em>Property Depends On</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcPropertyImpl#getPartOfComplex <em>Part Of Complex</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcPropertyImpl extends EObjectImpl implements IfcProperty {
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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * This is true if the Description attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean descriptionESet;

	/**
	 * The cached value of the '{@link #getPropertyForDependance() <em>Property For Dependance</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyForDependance()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcPropertyDependencyRelationship> propertyForDependance;

	/**
	 * The cached value of the '{@link #getPropertyDependsOn() <em>Property Depends On</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyDependsOn()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcPropertyDependencyRelationship> propertyDependsOn;

	/**
	 * The cached value of the '{@link #getPartOfComplex() <em>Part Of Complex</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartOfComplex()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcComplexProperty> partOfComplex;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcProperty();
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PROPERTY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		boolean oldDescriptionESet = descriptionESet;
		descriptionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PROPERTY__DESCRIPTION, oldDescription, description, !oldDescriptionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDescription() {
		String oldDescription = description;
		boolean oldDescriptionESet = descriptionESet;
		description = DESCRIPTION_EDEFAULT;
		descriptionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_PROPERTY__DESCRIPTION, oldDescription, DESCRIPTION_EDEFAULT, oldDescriptionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDescription() {
		return descriptionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcPropertyDependencyRelationship> getPropertyForDependance() {
		if (propertyForDependance == null) {
			propertyForDependance = new EObjectWithInverseResolvingEList.Unsettable<IfcPropertyDependencyRelationship>(IfcPropertyDependencyRelationship.class, this, Ifc2x3tc1Package.IFC_PROPERTY__PROPERTY_FOR_DEPENDANCE, Ifc2x3tc1Package.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP__DEPENDING_PROPERTY);
		}
		return propertyForDependance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPropertyForDependance() {
		if (propertyForDependance != null) ((InternalEList.Unsettable<?>)propertyForDependance).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPropertyForDependance() {
		return propertyForDependance != null && ((InternalEList.Unsettable<?>)propertyForDependance).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcPropertyDependencyRelationship> getPropertyDependsOn() {
		if (propertyDependsOn == null) {
			propertyDependsOn = new EObjectWithInverseResolvingEList.Unsettable<IfcPropertyDependencyRelationship>(IfcPropertyDependencyRelationship.class, this, Ifc2x3tc1Package.IFC_PROPERTY__PROPERTY_DEPENDS_ON, Ifc2x3tc1Package.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP__DEPENDANT_PROPERTY);
		}
		return propertyDependsOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPropertyDependsOn() {
		if (propertyDependsOn != null) ((InternalEList.Unsettable<?>)propertyDependsOn).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPropertyDependsOn() {
		return propertyDependsOn != null && ((InternalEList.Unsettable<?>)propertyDependsOn).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcComplexProperty> getPartOfComplex() {
		if (partOfComplex == null) {
			partOfComplex = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse<IfcComplexProperty>(IfcComplexProperty.class, this, Ifc2x3tc1Package.IFC_PROPERTY__PART_OF_COMPLEX, Ifc2x3tc1Package.IFC_COMPLEX_PROPERTY__HAS_PROPERTIES);
		}
		return partOfComplex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPartOfComplex() {
		if (partOfComplex != null) ((InternalEList.Unsettable<?>)partOfComplex).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPartOfComplex() {
		return partOfComplex != null && ((InternalEList.Unsettable<?>)partOfComplex).isSet();
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
			case Ifc2x3tc1Package.IFC_PROPERTY__PROPERTY_FOR_DEPENDANCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPropertyForDependance()).basicAdd(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_PROPERTY__PROPERTY_DEPENDS_ON:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPropertyDependsOn()).basicAdd(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_PROPERTY__PART_OF_COMPLEX:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPartOfComplex()).basicAdd(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_PROPERTY__PROPERTY_FOR_DEPENDANCE:
				return ((InternalEList<?>)getPropertyForDependance()).basicRemove(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_PROPERTY__PROPERTY_DEPENDS_ON:
				return ((InternalEList<?>)getPropertyDependsOn()).basicRemove(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_PROPERTY__PART_OF_COMPLEX:
				return ((InternalEList<?>)getPartOfComplex()).basicRemove(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_PROPERTY__NAME:
				return getName();
			case Ifc2x3tc1Package.IFC_PROPERTY__DESCRIPTION:
				return getDescription();
			case Ifc2x3tc1Package.IFC_PROPERTY__PROPERTY_FOR_DEPENDANCE:
				return getPropertyForDependance();
			case Ifc2x3tc1Package.IFC_PROPERTY__PROPERTY_DEPENDS_ON:
				return getPropertyDependsOn();
			case Ifc2x3tc1Package.IFC_PROPERTY__PART_OF_COMPLEX:
				return getPartOfComplex();
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
			case Ifc2x3tc1Package.IFC_PROPERTY__NAME:
				setName((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_PROPERTY__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_PROPERTY__PROPERTY_FOR_DEPENDANCE:
				getPropertyForDependance().clear();
				getPropertyForDependance().addAll((Collection<? extends IfcPropertyDependencyRelationship>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_PROPERTY__PROPERTY_DEPENDS_ON:
				getPropertyDependsOn().clear();
				getPropertyDependsOn().addAll((Collection<? extends IfcPropertyDependencyRelationship>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_PROPERTY__PART_OF_COMPLEX:
				getPartOfComplex().clear();
				getPartOfComplex().addAll((Collection<? extends IfcComplexProperty>)newValue);
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
			case Ifc2x3tc1Package.IFC_PROPERTY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_PROPERTY__DESCRIPTION:
				unsetDescription();
				return;
			case Ifc2x3tc1Package.IFC_PROPERTY__PROPERTY_FOR_DEPENDANCE:
				unsetPropertyForDependance();
				return;
			case Ifc2x3tc1Package.IFC_PROPERTY__PROPERTY_DEPENDS_ON:
				unsetPropertyDependsOn();
				return;
			case Ifc2x3tc1Package.IFC_PROPERTY__PART_OF_COMPLEX:
				unsetPartOfComplex();
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
			case Ifc2x3tc1Package.IFC_PROPERTY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Ifc2x3tc1Package.IFC_PROPERTY__DESCRIPTION:
				return isSetDescription();
			case Ifc2x3tc1Package.IFC_PROPERTY__PROPERTY_FOR_DEPENDANCE:
				return isSetPropertyForDependance();
			case Ifc2x3tc1Package.IFC_PROPERTY__PROPERTY_DEPENDS_ON:
				return isSetPropertyDependsOn();
			case Ifc2x3tc1Package.IFC_PROPERTY__PART_OF_COMPLEX:
				return isSetPartOfComplex();
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
		result.append(", Description: ");
		if (descriptionESet) result.append(description); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcPropertyImpl
