/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.EntityImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.ClassifiedMaterialType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMaterialClassificationRelationship;
import org.tech.iai.ifc.xml.ifc._2x3.final_.MaterialClassificationsType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Material Classification Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcMaterialClassificationRelationshipImpl#getMaterialClassifications <em>Material Classifications</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcMaterialClassificationRelationshipImpl#getClassifiedMaterial <em>Classified Material</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcMaterialClassificationRelationshipImpl extends EntityImpl implements IfcMaterialClassificationRelationship {
	/**
	 * The cached value of the '{@link #getMaterialClassifications() <em>Material Classifications</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterialClassifications()
	 * @generated
	 * @ordered
	 */
	protected MaterialClassificationsType materialClassifications;

	/**
	 * The cached value of the '{@link #getClassifiedMaterial() <em>Classified Material</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifiedMaterial()
	 * @generated
	 * @ordered
	 */
	protected ClassifiedMaterialType classifiedMaterial;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcMaterialClassificationRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcMaterialClassificationRelationship();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaterialClassificationsType getMaterialClassifications() {
		return materialClassifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaterialClassifications(MaterialClassificationsType newMaterialClassifications, NotificationChain msgs) {
		MaterialClassificationsType oldMaterialClassifications = materialClassifications;
		materialClassifications = newMaterialClassifications;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_MATERIAL_CLASSIFICATION_RELATIONSHIP__MATERIAL_CLASSIFICATIONS, oldMaterialClassifications, newMaterialClassifications);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaterialClassifications(MaterialClassificationsType newMaterialClassifications) {
		if (newMaterialClassifications != materialClassifications) {
			NotificationChain msgs = null;
			if (materialClassifications != null)
				msgs = ((InternalEObject)materialClassifications).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_MATERIAL_CLASSIFICATION_RELATIONSHIP__MATERIAL_CLASSIFICATIONS, null, msgs);
			if (newMaterialClassifications != null)
				msgs = ((InternalEObject)newMaterialClassifications).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_MATERIAL_CLASSIFICATION_RELATIONSHIP__MATERIAL_CLASSIFICATIONS, null, msgs);
			msgs = basicSetMaterialClassifications(newMaterialClassifications, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_MATERIAL_CLASSIFICATION_RELATIONSHIP__MATERIAL_CLASSIFICATIONS, newMaterialClassifications, newMaterialClassifications));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassifiedMaterialType getClassifiedMaterial() {
		return classifiedMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassifiedMaterial(ClassifiedMaterialType newClassifiedMaterial, NotificationChain msgs) {
		ClassifiedMaterialType oldClassifiedMaterial = classifiedMaterial;
		classifiedMaterial = newClassifiedMaterial;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_MATERIAL_CLASSIFICATION_RELATIONSHIP__CLASSIFIED_MATERIAL, oldClassifiedMaterial, newClassifiedMaterial);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassifiedMaterial(ClassifiedMaterialType newClassifiedMaterial) {
		if (newClassifiedMaterial != classifiedMaterial) {
			NotificationChain msgs = null;
			if (classifiedMaterial != null)
				msgs = ((InternalEObject)classifiedMaterial).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_MATERIAL_CLASSIFICATION_RELATIONSHIP__CLASSIFIED_MATERIAL, null, msgs);
			if (newClassifiedMaterial != null)
				msgs = ((InternalEObject)newClassifiedMaterial).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_MATERIAL_CLASSIFICATION_RELATIONSHIP__CLASSIFIED_MATERIAL, null, msgs);
			msgs = basicSetClassifiedMaterial(newClassifiedMaterial, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_MATERIAL_CLASSIFICATION_RELATIONSHIP__CLASSIFIED_MATERIAL, newClassifiedMaterial, newClassifiedMaterial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_MATERIAL_CLASSIFICATION_RELATIONSHIP__MATERIAL_CLASSIFICATIONS:
				return basicSetMaterialClassifications(null, msgs);
			case FinalPackage.IFC_MATERIAL_CLASSIFICATION_RELATIONSHIP__CLASSIFIED_MATERIAL:
				return basicSetClassifiedMaterial(null, msgs);
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
			case FinalPackage.IFC_MATERIAL_CLASSIFICATION_RELATIONSHIP__MATERIAL_CLASSIFICATIONS:
				return getMaterialClassifications();
			case FinalPackage.IFC_MATERIAL_CLASSIFICATION_RELATIONSHIP__CLASSIFIED_MATERIAL:
				return getClassifiedMaterial();
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
			case FinalPackage.IFC_MATERIAL_CLASSIFICATION_RELATIONSHIP__MATERIAL_CLASSIFICATIONS:
				setMaterialClassifications((MaterialClassificationsType)newValue);
				return;
			case FinalPackage.IFC_MATERIAL_CLASSIFICATION_RELATIONSHIP__CLASSIFIED_MATERIAL:
				setClassifiedMaterial((ClassifiedMaterialType)newValue);
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
			case FinalPackage.IFC_MATERIAL_CLASSIFICATION_RELATIONSHIP__MATERIAL_CLASSIFICATIONS:
				setMaterialClassifications((MaterialClassificationsType)null);
				return;
			case FinalPackage.IFC_MATERIAL_CLASSIFICATION_RELATIONSHIP__CLASSIFIED_MATERIAL:
				setClassifiedMaterial((ClassifiedMaterialType)null);
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
			case FinalPackage.IFC_MATERIAL_CLASSIFICATION_RELATIONSHIP__MATERIAL_CLASSIFICATIONS:
				return materialClassifications != null;
			case FinalPackage.IFC_MATERIAL_CLASSIFICATION_RELATIONSHIP__CLASSIFIED_MATERIAL:
				return classifiedMaterial != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcMaterialClassificationRelationshipImpl
