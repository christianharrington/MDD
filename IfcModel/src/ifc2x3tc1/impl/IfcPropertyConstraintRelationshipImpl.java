/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcConstraint;
import ifc2x3tc1.IfcProperty;
import ifc2x3tc1.IfcPropertyConstraintRelationship;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Property Constraint Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcPropertyConstraintRelationshipImpl#getRelatingConstraint <em>Relating Constraint</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcPropertyConstraintRelationshipImpl#getRelatedProperties <em>Related Properties</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcPropertyConstraintRelationshipImpl#getName <em>Name</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcPropertyConstraintRelationshipImpl#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcPropertyConstraintRelationshipImpl extends EObjectImpl implements IfcPropertyConstraintRelationship {
	/**
	 * The cached value of the '{@link #getRelatingConstraint() <em>Relating Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingConstraint()
	 * @generated
	 * @ordered
	 */
	protected IfcConstraint relatingConstraint;

	/**
	 * The cached value of the '{@link #getRelatedProperties() <em>Related Properties</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcProperty> relatedProperties;

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
	 * This is true if the Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nameESet;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcPropertyConstraintRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcPropertyConstraintRelationship();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcConstraint getRelatingConstraint() {
		if (relatingConstraint != null && relatingConstraint.eIsProxy()) {
			InternalEObject oldRelatingConstraint = (InternalEObject)relatingConstraint;
			relatingConstraint = (IfcConstraint)eResolveProxy(oldRelatingConstraint);
			if (relatingConstraint != oldRelatingConstraint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_PROPERTY_CONSTRAINT_RELATIONSHIP__RELATING_CONSTRAINT, oldRelatingConstraint, relatingConstraint));
			}
		}
		return relatingConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcConstraint basicGetRelatingConstraint() {
		return relatingConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatingConstraint(IfcConstraint newRelatingConstraint, NotificationChain msgs) {
		IfcConstraint oldRelatingConstraint = relatingConstraint;
		relatingConstraint = newRelatingConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PROPERTY_CONSTRAINT_RELATIONSHIP__RELATING_CONSTRAINT, oldRelatingConstraint, newRelatingConstraint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingConstraint(IfcConstraint newRelatingConstraint) {
		if (newRelatingConstraint != relatingConstraint) {
			NotificationChain msgs = null;
			if (relatingConstraint != null)
				msgs = ((InternalEObject)relatingConstraint).eInverseRemove(this, Ifc2x3tc1Package.IFC_CONSTRAINT__PROPERTIES_FOR_CONSTRAINT, IfcConstraint.class, msgs);
			if (newRelatingConstraint != null)
				msgs = ((InternalEObject)newRelatingConstraint).eInverseAdd(this, Ifc2x3tc1Package.IFC_CONSTRAINT__PROPERTIES_FOR_CONSTRAINT, IfcConstraint.class, msgs);
			msgs = basicSetRelatingConstraint(newRelatingConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PROPERTY_CONSTRAINT_RELATIONSHIP__RELATING_CONSTRAINT, newRelatingConstraint, newRelatingConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcProperty> getRelatedProperties() {
		if (relatedProperties == null) {
			relatedProperties = new EObjectResolvingEList<IfcProperty>(IfcProperty.class, this, Ifc2x3tc1Package.IFC_PROPERTY_CONSTRAINT_RELATIONSHIP__RELATED_PROPERTIES);
		}
		return relatedProperties;
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
		boolean oldNameESet = nameESet;
		nameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PROPERTY_CONSTRAINT_RELATIONSHIP__NAME, oldName, name, !oldNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetName() {
		String oldName = name;
		boolean oldNameESet = nameESet;
		name = NAME_EDEFAULT;
		nameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_PROPERTY_CONSTRAINT_RELATIONSHIP__NAME, oldName, NAME_EDEFAULT, oldNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetName() {
		return nameESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PROPERTY_CONSTRAINT_RELATIONSHIP__DESCRIPTION, oldDescription, description, !oldDescriptionESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_PROPERTY_CONSTRAINT_RELATIONSHIP__DESCRIPTION, oldDescription, DESCRIPTION_EDEFAULT, oldDescriptionESet));
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
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_PROPERTY_CONSTRAINT_RELATIONSHIP__RELATING_CONSTRAINT:
				if (relatingConstraint != null)
					msgs = ((InternalEObject)relatingConstraint).eInverseRemove(this, Ifc2x3tc1Package.IFC_CONSTRAINT__PROPERTIES_FOR_CONSTRAINT, IfcConstraint.class, msgs);
				return basicSetRelatingConstraint((IfcConstraint)otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_PROPERTY_CONSTRAINT_RELATIONSHIP__RELATING_CONSTRAINT:
				return basicSetRelatingConstraint(null, msgs);
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
			case Ifc2x3tc1Package.IFC_PROPERTY_CONSTRAINT_RELATIONSHIP__RELATING_CONSTRAINT:
				if (resolve) return getRelatingConstraint();
				return basicGetRelatingConstraint();
			case Ifc2x3tc1Package.IFC_PROPERTY_CONSTRAINT_RELATIONSHIP__RELATED_PROPERTIES:
				return getRelatedProperties();
			case Ifc2x3tc1Package.IFC_PROPERTY_CONSTRAINT_RELATIONSHIP__NAME:
				return getName();
			case Ifc2x3tc1Package.IFC_PROPERTY_CONSTRAINT_RELATIONSHIP__DESCRIPTION:
				return getDescription();
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
			case Ifc2x3tc1Package.IFC_PROPERTY_CONSTRAINT_RELATIONSHIP__RELATING_CONSTRAINT:
				setRelatingConstraint((IfcConstraint)newValue);
				return;
			case Ifc2x3tc1Package.IFC_PROPERTY_CONSTRAINT_RELATIONSHIP__RELATED_PROPERTIES:
				getRelatedProperties().clear();
				getRelatedProperties().addAll((Collection<? extends IfcProperty>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_PROPERTY_CONSTRAINT_RELATIONSHIP__NAME:
				setName((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_PROPERTY_CONSTRAINT_RELATIONSHIP__DESCRIPTION:
				setDescription((String)newValue);
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
			case Ifc2x3tc1Package.IFC_PROPERTY_CONSTRAINT_RELATIONSHIP__RELATING_CONSTRAINT:
				setRelatingConstraint((IfcConstraint)null);
				return;
			case Ifc2x3tc1Package.IFC_PROPERTY_CONSTRAINT_RELATIONSHIP__RELATED_PROPERTIES:
				getRelatedProperties().clear();
				return;
			case Ifc2x3tc1Package.IFC_PROPERTY_CONSTRAINT_RELATIONSHIP__NAME:
				unsetName();
				return;
			case Ifc2x3tc1Package.IFC_PROPERTY_CONSTRAINT_RELATIONSHIP__DESCRIPTION:
				unsetDescription();
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
			case Ifc2x3tc1Package.IFC_PROPERTY_CONSTRAINT_RELATIONSHIP__RELATING_CONSTRAINT:
				return relatingConstraint != null;
			case Ifc2x3tc1Package.IFC_PROPERTY_CONSTRAINT_RELATIONSHIP__RELATED_PROPERTIES:
				return relatedProperties != null && !relatedProperties.isEmpty();
			case Ifc2x3tc1Package.IFC_PROPERTY_CONSTRAINT_RELATIONSHIP__NAME:
				return isSetName();
			case Ifc2x3tc1Package.IFC_PROPERTY_CONSTRAINT_RELATIONSHIP__DESCRIPTION:
				return isSetDescription();
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
		if (nameESet) result.append(name); else result.append("<unset>");
		result.append(", Description: ");
		if (descriptionESet) result.append(description); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcPropertyConstraintRelationshipImpl
