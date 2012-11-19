/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.EntityImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.ClassifiedConstraintType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcConstraintClassificationRelationship;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatedClassificationsType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Constraint Classification Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcConstraintClassificationRelationshipImpl#getClassifiedConstraint <em>Classified Constraint</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcConstraintClassificationRelationshipImpl#getRelatedClassifications <em>Related Classifications</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcConstraintClassificationRelationshipImpl extends EntityImpl implements IfcConstraintClassificationRelationship {
	/**
	 * The cached value of the '{@link #getClassifiedConstraint() <em>Classified Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifiedConstraint()
	 * @generated
	 * @ordered
	 */
	protected ClassifiedConstraintType classifiedConstraint;

	/**
	 * The cached value of the '{@link #getRelatedClassifications() <em>Related Classifications</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedClassifications()
	 * @generated
	 * @ordered
	 */
	protected RelatedClassificationsType relatedClassifications;

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
		return FinalPackage.eINSTANCE.getIfcConstraintClassificationRelationship();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassifiedConstraintType getClassifiedConstraint() {
		return classifiedConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassifiedConstraint(ClassifiedConstraintType newClassifiedConstraint, NotificationChain msgs) {
		ClassifiedConstraintType oldClassifiedConstraint = classifiedConstraint;
		classifiedConstraint = newClassifiedConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CONSTRAINT_CLASSIFICATION_RELATIONSHIP__CLASSIFIED_CONSTRAINT, oldClassifiedConstraint, newClassifiedConstraint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassifiedConstraint(ClassifiedConstraintType newClassifiedConstraint) {
		if (newClassifiedConstraint != classifiedConstraint) {
			NotificationChain msgs = null;
			if (classifiedConstraint != null)
				msgs = ((InternalEObject)classifiedConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CONSTRAINT_CLASSIFICATION_RELATIONSHIP__CLASSIFIED_CONSTRAINT, null, msgs);
			if (newClassifiedConstraint != null)
				msgs = ((InternalEObject)newClassifiedConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CONSTRAINT_CLASSIFICATION_RELATIONSHIP__CLASSIFIED_CONSTRAINT, null, msgs);
			msgs = basicSetClassifiedConstraint(newClassifiedConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CONSTRAINT_CLASSIFICATION_RELATIONSHIP__CLASSIFIED_CONSTRAINT, newClassifiedConstraint, newClassifiedConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedClassificationsType getRelatedClassifications() {
		return relatedClassifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatedClassifications(RelatedClassificationsType newRelatedClassifications, NotificationChain msgs) {
		RelatedClassificationsType oldRelatedClassifications = relatedClassifications;
		relatedClassifications = newRelatedClassifications;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CONSTRAINT_CLASSIFICATION_RELATIONSHIP__RELATED_CLASSIFICATIONS, oldRelatedClassifications, newRelatedClassifications);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedClassifications(RelatedClassificationsType newRelatedClassifications) {
		if (newRelatedClassifications != relatedClassifications) {
			NotificationChain msgs = null;
			if (relatedClassifications != null)
				msgs = ((InternalEObject)relatedClassifications).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CONSTRAINT_CLASSIFICATION_RELATIONSHIP__RELATED_CLASSIFICATIONS, null, msgs);
			if (newRelatedClassifications != null)
				msgs = ((InternalEObject)newRelatedClassifications).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CONSTRAINT_CLASSIFICATION_RELATIONSHIP__RELATED_CLASSIFICATIONS, null, msgs);
			msgs = basicSetRelatedClassifications(newRelatedClassifications, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CONSTRAINT_CLASSIFICATION_RELATIONSHIP__RELATED_CLASSIFICATIONS, newRelatedClassifications, newRelatedClassifications));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_CONSTRAINT_CLASSIFICATION_RELATIONSHIP__CLASSIFIED_CONSTRAINT:
				return basicSetClassifiedConstraint(null, msgs);
			case FinalPackage.IFC_CONSTRAINT_CLASSIFICATION_RELATIONSHIP__RELATED_CLASSIFICATIONS:
				return basicSetRelatedClassifications(null, msgs);
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
			case FinalPackage.IFC_CONSTRAINT_CLASSIFICATION_RELATIONSHIP__CLASSIFIED_CONSTRAINT:
				return getClassifiedConstraint();
			case FinalPackage.IFC_CONSTRAINT_CLASSIFICATION_RELATIONSHIP__RELATED_CLASSIFICATIONS:
				return getRelatedClassifications();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FinalPackage.IFC_CONSTRAINT_CLASSIFICATION_RELATIONSHIP__CLASSIFIED_CONSTRAINT:
				setClassifiedConstraint((ClassifiedConstraintType)newValue);
				return;
			case FinalPackage.IFC_CONSTRAINT_CLASSIFICATION_RELATIONSHIP__RELATED_CLASSIFICATIONS:
				setRelatedClassifications((RelatedClassificationsType)newValue);
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
			case FinalPackage.IFC_CONSTRAINT_CLASSIFICATION_RELATIONSHIP__CLASSIFIED_CONSTRAINT:
				setClassifiedConstraint((ClassifiedConstraintType)null);
				return;
			case FinalPackage.IFC_CONSTRAINT_CLASSIFICATION_RELATIONSHIP__RELATED_CLASSIFICATIONS:
				setRelatedClassifications((RelatedClassificationsType)null);
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
			case FinalPackage.IFC_CONSTRAINT_CLASSIFICATION_RELATIONSHIP__CLASSIFIED_CONSTRAINT:
				return classifiedConstraint != null;
			case FinalPackage.IFC_CONSTRAINT_CLASSIFICATION_RELATIONSHIP__RELATED_CLASSIFICATIONS:
				return relatedClassifications != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcConstraintClassificationRelationshipImpl
