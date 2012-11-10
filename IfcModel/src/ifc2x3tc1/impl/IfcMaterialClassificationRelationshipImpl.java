/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcClassificationNotationSelect;
import ifc2x3tc1.IfcMaterial;
import ifc2x3tc1.IfcMaterialClassificationRelationship;

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
 * An implementation of the model object '<em><b>Ifc Material Classification Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcMaterialClassificationRelationshipImpl#getMaterialClassifications <em>Material Classifications</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcMaterialClassificationRelationshipImpl#getClassifiedMaterial <em>Classified Material</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcMaterialClassificationRelationshipImpl extends EObjectImpl implements IfcMaterialClassificationRelationship {
	/**
	 * The cached value of the '{@link #getMaterialClassifications() <em>Material Classifications</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterialClassifications()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcClassificationNotationSelect> materialClassifications;

	/**
	 * The cached value of the '{@link #getClassifiedMaterial() <em>Classified Material</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifiedMaterial()
	 * @generated
	 * @ordered
	 */
	protected IfcMaterial classifiedMaterial;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcMaterialClassificationRelationship();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcClassificationNotationSelect> getMaterialClassifications() {
		if (materialClassifications == null) {
			materialClassifications = new EObjectResolvingEList<IfcClassificationNotationSelect>(IfcClassificationNotationSelect.class, this, Ifc2x3tc1Package.IFC_MATERIAL_CLASSIFICATION_RELATIONSHIP__MATERIAL_CLASSIFICATIONS);
		}
		return materialClassifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMaterial getClassifiedMaterial() {
		if (classifiedMaterial != null && classifiedMaterial.eIsProxy()) {
			InternalEObject oldClassifiedMaterial = (InternalEObject)classifiedMaterial;
			classifiedMaterial = (IfcMaterial)eResolveProxy(oldClassifiedMaterial);
			if (classifiedMaterial != oldClassifiedMaterial) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_MATERIAL_CLASSIFICATION_RELATIONSHIP__CLASSIFIED_MATERIAL, oldClassifiedMaterial, classifiedMaterial));
			}
		}
		return classifiedMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMaterial basicGetClassifiedMaterial() {
		return classifiedMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassifiedMaterial(IfcMaterial newClassifiedMaterial, NotificationChain msgs) {
		IfcMaterial oldClassifiedMaterial = classifiedMaterial;
		classifiedMaterial = newClassifiedMaterial;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_MATERIAL_CLASSIFICATION_RELATIONSHIP__CLASSIFIED_MATERIAL, oldClassifiedMaterial, newClassifiedMaterial);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassifiedMaterial(IfcMaterial newClassifiedMaterial) {
		if (newClassifiedMaterial != classifiedMaterial) {
			NotificationChain msgs = null;
			if (classifiedMaterial != null)
				msgs = ((InternalEObject)classifiedMaterial).eInverseRemove(this, Ifc2x3tc1Package.IFC_MATERIAL__CLASSIFIED_AS, IfcMaterial.class, msgs);
			if (newClassifiedMaterial != null)
				msgs = ((InternalEObject)newClassifiedMaterial).eInverseAdd(this, Ifc2x3tc1Package.IFC_MATERIAL__CLASSIFIED_AS, IfcMaterial.class, msgs);
			msgs = basicSetClassifiedMaterial(newClassifiedMaterial, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_MATERIAL_CLASSIFICATION_RELATIONSHIP__CLASSIFIED_MATERIAL, newClassifiedMaterial, newClassifiedMaterial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_MATERIAL_CLASSIFICATION_RELATIONSHIP__CLASSIFIED_MATERIAL:
				if (classifiedMaterial != null)
					msgs = ((InternalEObject)classifiedMaterial).eInverseRemove(this, Ifc2x3tc1Package.IFC_MATERIAL__CLASSIFIED_AS, IfcMaterial.class, msgs);
				return basicSetClassifiedMaterial((IfcMaterial)otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_MATERIAL_CLASSIFICATION_RELATIONSHIP__CLASSIFIED_MATERIAL:
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
			case Ifc2x3tc1Package.IFC_MATERIAL_CLASSIFICATION_RELATIONSHIP__MATERIAL_CLASSIFICATIONS:
				return getMaterialClassifications();
			case Ifc2x3tc1Package.IFC_MATERIAL_CLASSIFICATION_RELATIONSHIP__CLASSIFIED_MATERIAL:
				if (resolve) return getClassifiedMaterial();
				return basicGetClassifiedMaterial();
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
			case Ifc2x3tc1Package.IFC_MATERIAL_CLASSIFICATION_RELATIONSHIP__MATERIAL_CLASSIFICATIONS:
				getMaterialClassifications().clear();
				getMaterialClassifications().addAll((Collection<? extends IfcClassificationNotationSelect>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_MATERIAL_CLASSIFICATION_RELATIONSHIP__CLASSIFIED_MATERIAL:
				setClassifiedMaterial((IfcMaterial)newValue);
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
			case Ifc2x3tc1Package.IFC_MATERIAL_CLASSIFICATION_RELATIONSHIP__MATERIAL_CLASSIFICATIONS:
				getMaterialClassifications().clear();
				return;
			case Ifc2x3tc1Package.IFC_MATERIAL_CLASSIFICATION_RELATIONSHIP__CLASSIFIED_MATERIAL:
				setClassifiedMaterial((IfcMaterial)null);
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
			case Ifc2x3tc1Package.IFC_MATERIAL_CLASSIFICATION_RELATIONSHIP__MATERIAL_CLASSIFICATIONS:
				return materialClassifications != null && !materialClassifications.isEmpty();
			case Ifc2x3tc1Package.IFC_MATERIAL_CLASSIFICATION_RELATIONSHIP__CLASSIFIED_MATERIAL:
				return classifiedMaterial != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcMaterialClassificationRelationshipImpl
