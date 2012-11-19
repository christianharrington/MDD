/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelAssociatesClassification;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingClassificationType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Associates Classification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelAssociatesClassificationImpl#getRelatingClassification <em>Relating Classification</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelAssociatesClassificationImpl extends IfcRelAssociatesImpl implements IfcRelAssociatesClassification {
	/**
	 * The cached value of the '{@link #getRelatingClassification() <em>Relating Classification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingClassification()
	 * @generated
	 * @ordered
	 */
	protected RelatingClassificationType relatingClassification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelAssociatesClassificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcRelAssociatesClassification();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingClassificationType getRelatingClassification() {
		return relatingClassification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatingClassification(RelatingClassificationType newRelatingClassification, NotificationChain msgs) {
		RelatingClassificationType oldRelatingClassification = relatingClassification;
		relatingClassification = newRelatingClassification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_ASSOCIATES_CLASSIFICATION__RELATING_CLASSIFICATION, oldRelatingClassification, newRelatingClassification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingClassification(RelatingClassificationType newRelatingClassification) {
		if (newRelatingClassification != relatingClassification) {
			NotificationChain msgs = null;
			if (relatingClassification != null)
				msgs = ((InternalEObject)relatingClassification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_ASSOCIATES_CLASSIFICATION__RELATING_CLASSIFICATION, null, msgs);
			if (newRelatingClassification != null)
				msgs = ((InternalEObject)newRelatingClassification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_ASSOCIATES_CLASSIFICATION__RELATING_CLASSIFICATION, null, msgs);
			msgs = basicSetRelatingClassification(newRelatingClassification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_ASSOCIATES_CLASSIFICATION__RELATING_CLASSIFICATION, newRelatingClassification, newRelatingClassification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_REL_ASSOCIATES_CLASSIFICATION__RELATING_CLASSIFICATION:
				return basicSetRelatingClassification(null, msgs);
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
			case FinalPackage.IFC_REL_ASSOCIATES_CLASSIFICATION__RELATING_CLASSIFICATION:
				return getRelatingClassification();
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
			case FinalPackage.IFC_REL_ASSOCIATES_CLASSIFICATION__RELATING_CLASSIFICATION:
				setRelatingClassification((RelatingClassificationType)newValue);
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
			case FinalPackage.IFC_REL_ASSOCIATES_CLASSIFICATION__RELATING_CLASSIFICATION:
				setRelatingClassification((RelatingClassificationType)null);
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
			case FinalPackage.IFC_REL_ASSOCIATES_CLASSIFICATION__RELATING_CLASSIFICATION:
				return relatingClassification != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcRelAssociatesClassificationImpl
