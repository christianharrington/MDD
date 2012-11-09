/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcClassificationNotationSelect;
import ifc2x3tc1.IfcConstraint;
import ifc2x3tc1.IfcConstraintClassificationRelationship;

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
 * An implementation of the model object '<em><b>Ifc Constraint Classification Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcConstraintClassificationRelationshipImpl#getClassifiedConstraint <em>Classified Constraint</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcConstraintClassificationRelationshipImpl#getRelatedClassifications <em>Related Classifications</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcConstraintClassificationRelationshipImpl extends EObjectImpl implements IfcConstraintClassificationRelationship {
	/**
	 * The cached value of the '{@link #getClassifiedConstraint() <em>Classified Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifiedConstraint()
	 * @generated
	 * @ordered
	 */
	protected IfcConstraint classifiedConstraint;

	/**
	 * The cached value of the '{@link #getRelatedClassifications() <em>Related Classifications</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedClassifications()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcClassificationNotationSelect> relatedClassifications;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcConstraintClassificationRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcConstraintClassificationRelationship();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcConstraint getClassifiedConstraint() {
		if (classifiedConstraint != null && classifiedConstraint.eIsProxy()) {
			InternalEObject oldClassifiedConstraint = (InternalEObject)classifiedConstraint;
			classifiedConstraint = (IfcConstraint)eResolveProxy(oldClassifiedConstraint);
			if (classifiedConstraint != oldClassifiedConstraint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_CONSTRAINT_CLASSIFICATION_RELATIONSHIP__CLASSIFIED_CONSTRAINT, oldClassifiedConstraint, classifiedConstraint));
			}
		}
		return classifiedConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcConstraint basicGetClassifiedConstraint() {
		return classifiedConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassifiedConstraint(IfcConstraint newClassifiedConstraint, NotificationChain msgs) {
		IfcConstraint oldClassifiedConstraint = classifiedConstraint;
		classifiedConstraint = newClassifiedConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CONSTRAINT_CLASSIFICATION_RELATIONSHIP__CLASSIFIED_CONSTRAINT, oldClassifiedConstraint, newClassifiedConstraint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassifiedConstraint(IfcConstraint newClassifiedConstraint) {
		if (newClassifiedConstraint != classifiedConstraint) {
			NotificationChain msgs = null;
			if (classifiedConstraint != null)
				msgs = ((InternalEObject)classifiedConstraint).eInverseRemove(this, Ifc2x3tc1Package.IFC_CONSTRAINT__CLASSIFIED_AS, IfcConstraint.class, msgs);
			if (newClassifiedConstraint != null)
				msgs = ((InternalEObject)newClassifiedConstraint).eInverseAdd(this, Ifc2x3tc1Package.IFC_CONSTRAINT__CLASSIFIED_AS, IfcConstraint.class, msgs);
			msgs = basicSetClassifiedConstraint(newClassifiedConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CONSTRAINT_CLASSIFICATION_RELATIONSHIP__CLASSIFIED_CONSTRAINT, newClassifiedConstraint, newClassifiedConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcClassificationNotationSelect> getRelatedClassifications() {
		if (relatedClassifications == null) {
			relatedClassifications = new EObjectResolvingEList<IfcClassificationNotationSelect>(IfcClassificationNotationSelect.class, this, Ifc2x3tc1Package.IFC_CONSTRAINT_CLASSIFICATION_RELATIONSHIP__RELATED_CLASSIFICATIONS);
		}
		return relatedClassifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_CONSTRAINT_CLASSIFICATION_RELATIONSHIP__CLASSIFIED_CONSTRAINT:
				if (classifiedConstraint != null)
					msgs = ((InternalEObject)classifiedConstraint).eInverseRemove(this, Ifc2x3tc1Package.IFC_CONSTRAINT__CLASSIFIED_AS, IfcConstraint.class, msgs);
				return basicSetClassifiedConstraint((IfcConstraint)otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_CONSTRAINT_CLASSIFICATION_RELATIONSHIP__CLASSIFIED_CONSTRAINT:
				return basicSetClassifiedConstraint(null, msgs);
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
			case Ifc2x3tc1Package.IFC_CONSTRAINT_CLASSIFICATION_RELATIONSHIP__CLASSIFIED_CONSTRAINT:
				if (resolve) return getClassifiedConstraint();
				return basicGetClassifiedConstraint();
			case Ifc2x3tc1Package.IFC_CONSTRAINT_CLASSIFICATION_RELATIONSHIP__RELATED_CLASSIFICATIONS:
				return getRelatedClassifications();
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
			case Ifc2x3tc1Package.IFC_CONSTRAINT_CLASSIFICATION_RELATIONSHIP__CLASSIFIED_CONSTRAINT:
				setClassifiedConstraint((IfcConstraint)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CONSTRAINT_CLASSIFICATION_RELATIONSHIP__RELATED_CLASSIFICATIONS:
				getRelatedClassifications().clear();
				getRelatedClassifications().addAll((Collection<? extends IfcClassificationNotationSelect>)newValue);
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
			case Ifc2x3tc1Package.IFC_CONSTRAINT_CLASSIFICATION_RELATIONSHIP__CLASSIFIED_CONSTRAINT:
				setClassifiedConstraint((IfcConstraint)null);
				return;
			case Ifc2x3tc1Package.IFC_CONSTRAINT_CLASSIFICATION_RELATIONSHIP__RELATED_CLASSIFICATIONS:
				getRelatedClassifications().clear();
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
			case Ifc2x3tc1Package.IFC_CONSTRAINT_CLASSIFICATION_RELATIONSHIP__CLASSIFIED_CONSTRAINT:
				return classifiedConstraint != null;
			case Ifc2x3tc1Package.IFC_CONSTRAINT_CLASSIFICATION_RELATIONSHIP__RELATED_CLASSIFICATIONS:
				return relatedClassifications != null && !relatedClassifications.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IfcConstraintClassificationRelationshipImpl
