/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcConstraint;
import ifc2x3tc1.IfcConstraintRelationship;

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
 * An implementation of the model object '<em><b>Ifc Constraint Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcConstraintRelationshipImpl#getName <em>Name</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcConstraintRelationshipImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcConstraintRelationshipImpl#getRelatingConstraint <em>Relating Constraint</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcConstraintRelationshipImpl#getRelatedConstraints <em>Related Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcConstraintRelationshipImpl extends EObjectImpl implements IfcConstraintRelationship {
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
	 * The cached value of the '{@link #getRelatingConstraint() <em>Relating Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingConstraint()
	 * @generated
	 * @ordered
	 */
	protected IfcConstraint relatingConstraint;

	/**
	 * The cached value of the '{@link #getRelatedConstraints() <em>Related Constraints</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcConstraint> relatedConstraints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcConstraintRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcConstraintRelationship();
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CONSTRAINT_RELATIONSHIP__NAME, oldName, name, !oldNameESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_CONSTRAINT_RELATIONSHIP__NAME, oldName, NAME_EDEFAULT, oldNameESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CONSTRAINT_RELATIONSHIP__DESCRIPTION, oldDescription, description, !oldDescriptionESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_CONSTRAINT_RELATIONSHIP__DESCRIPTION, oldDescription, DESCRIPTION_EDEFAULT, oldDescriptionESet));
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
	public IfcConstraint getRelatingConstraint() {
		if (relatingConstraint != null && relatingConstraint.eIsProxy()) {
			InternalEObject oldRelatingConstraint = (InternalEObject)relatingConstraint;
			relatingConstraint = (IfcConstraint)eResolveProxy(oldRelatingConstraint);
			if (relatingConstraint != oldRelatingConstraint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_CONSTRAINT_RELATIONSHIP__RELATING_CONSTRAINT, oldRelatingConstraint, relatingConstraint));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CONSTRAINT_RELATIONSHIP__RELATING_CONSTRAINT, oldRelatingConstraint, newRelatingConstraint);
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
				msgs = ((InternalEObject)relatingConstraint).eInverseRemove(this, Ifc2x3tc1Package.IFC_CONSTRAINT__RELATES_CONSTRAINTS, IfcConstraint.class, msgs);
			if (newRelatingConstraint != null)
				msgs = ((InternalEObject)newRelatingConstraint).eInverseAdd(this, Ifc2x3tc1Package.IFC_CONSTRAINT__RELATES_CONSTRAINTS, IfcConstraint.class, msgs);
			msgs = basicSetRelatingConstraint(newRelatingConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CONSTRAINT_RELATIONSHIP__RELATING_CONSTRAINT, newRelatingConstraint, newRelatingConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcConstraint> getRelatedConstraints() {
		if (relatedConstraints == null) {
			relatedConstraints = new EObjectWithInverseResolvingEList.ManyInverse<IfcConstraint>(IfcConstraint.class, this, Ifc2x3tc1Package.IFC_CONSTRAINT_RELATIONSHIP__RELATED_CONSTRAINTS, Ifc2x3tc1Package.IFC_CONSTRAINT__IS_RELATED_WITH);
		}
		return relatedConstraints;
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
			case Ifc2x3tc1Package.IFC_CONSTRAINT_RELATIONSHIP__RELATING_CONSTRAINT:
				if (relatingConstraint != null)
					msgs = ((InternalEObject)relatingConstraint).eInverseRemove(this, Ifc2x3tc1Package.IFC_CONSTRAINT__RELATES_CONSTRAINTS, IfcConstraint.class, msgs);
				return basicSetRelatingConstraint((IfcConstraint)otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_CONSTRAINT_RELATIONSHIP__RELATED_CONSTRAINTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRelatedConstraints()).basicAdd(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_CONSTRAINT_RELATIONSHIP__RELATING_CONSTRAINT:
				return basicSetRelatingConstraint(null, msgs);
			case Ifc2x3tc1Package.IFC_CONSTRAINT_RELATIONSHIP__RELATED_CONSTRAINTS:
				return ((InternalEList<?>)getRelatedConstraints()).basicRemove(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_CONSTRAINT_RELATIONSHIP__NAME:
				return getName();
			case Ifc2x3tc1Package.IFC_CONSTRAINT_RELATIONSHIP__DESCRIPTION:
				return getDescription();
			case Ifc2x3tc1Package.IFC_CONSTRAINT_RELATIONSHIP__RELATING_CONSTRAINT:
				if (resolve) return getRelatingConstraint();
				return basicGetRelatingConstraint();
			case Ifc2x3tc1Package.IFC_CONSTRAINT_RELATIONSHIP__RELATED_CONSTRAINTS:
				return getRelatedConstraints();
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
			case Ifc2x3tc1Package.IFC_CONSTRAINT_RELATIONSHIP__NAME:
				setName((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CONSTRAINT_RELATIONSHIP__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CONSTRAINT_RELATIONSHIP__RELATING_CONSTRAINT:
				setRelatingConstraint((IfcConstraint)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CONSTRAINT_RELATIONSHIP__RELATED_CONSTRAINTS:
				getRelatedConstraints().clear();
				getRelatedConstraints().addAll((Collection<? extends IfcConstraint>)newValue);
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
			case Ifc2x3tc1Package.IFC_CONSTRAINT_RELATIONSHIP__NAME:
				unsetName();
				return;
			case Ifc2x3tc1Package.IFC_CONSTRAINT_RELATIONSHIP__DESCRIPTION:
				unsetDescription();
				return;
			case Ifc2x3tc1Package.IFC_CONSTRAINT_RELATIONSHIP__RELATING_CONSTRAINT:
				setRelatingConstraint((IfcConstraint)null);
				return;
			case Ifc2x3tc1Package.IFC_CONSTRAINT_RELATIONSHIP__RELATED_CONSTRAINTS:
				getRelatedConstraints().clear();
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
			case Ifc2x3tc1Package.IFC_CONSTRAINT_RELATIONSHIP__NAME:
				return isSetName();
			case Ifc2x3tc1Package.IFC_CONSTRAINT_RELATIONSHIP__DESCRIPTION:
				return isSetDescription();
			case Ifc2x3tc1Package.IFC_CONSTRAINT_RELATIONSHIP__RELATING_CONSTRAINT:
				return relatingConstraint != null;
			case Ifc2x3tc1Package.IFC_CONSTRAINT_RELATIONSHIP__RELATED_CONSTRAINTS:
				return relatedConstraints != null && !relatedConstraints.isEmpty();
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

} //IfcConstraintRelationshipImpl
