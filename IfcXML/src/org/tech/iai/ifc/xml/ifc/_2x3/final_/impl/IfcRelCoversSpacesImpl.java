/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelCoversSpaces;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatedCoveringsType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatedSpaceType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Covers Spaces</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelCoversSpacesImpl#getRelatedSpace <em>Related Space</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelCoversSpacesImpl#getRelatedCoverings <em>Related Coverings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelCoversSpacesImpl extends IfcRelConnectsImpl implements IfcRelCoversSpaces {
	/**
	 * The cached value of the '{@link #getRelatedSpace() <em>Related Space</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedSpace()
	 * @generated
	 * @ordered
	 */
	protected RelatedSpaceType relatedSpace;

	/**
	 * The cached value of the '{@link #getRelatedCoverings() <em>Related Coverings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedCoverings()
	 * @generated
	 * @ordered
	 */
	protected RelatedCoveringsType relatedCoverings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelCoversSpacesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcRelCoversSpaces();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedSpaceType getRelatedSpace() {
		return relatedSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatedSpace(RelatedSpaceType newRelatedSpace, NotificationChain msgs) {
		RelatedSpaceType oldRelatedSpace = relatedSpace;
		relatedSpace = newRelatedSpace;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_COVERS_SPACES__RELATED_SPACE, oldRelatedSpace, newRelatedSpace);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedSpace(RelatedSpaceType newRelatedSpace) {
		if (newRelatedSpace != relatedSpace) {
			NotificationChain msgs = null;
			if (relatedSpace != null)
				msgs = ((InternalEObject)relatedSpace).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_COVERS_SPACES__RELATED_SPACE, null, msgs);
			if (newRelatedSpace != null)
				msgs = ((InternalEObject)newRelatedSpace).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_COVERS_SPACES__RELATED_SPACE, null, msgs);
			msgs = basicSetRelatedSpace(newRelatedSpace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_COVERS_SPACES__RELATED_SPACE, newRelatedSpace, newRelatedSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedCoveringsType getRelatedCoverings() {
		return relatedCoverings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatedCoverings(RelatedCoveringsType newRelatedCoverings, NotificationChain msgs) {
		RelatedCoveringsType oldRelatedCoverings = relatedCoverings;
		relatedCoverings = newRelatedCoverings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_COVERS_SPACES__RELATED_COVERINGS, oldRelatedCoverings, newRelatedCoverings);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedCoverings(RelatedCoveringsType newRelatedCoverings) {
		if (newRelatedCoverings != relatedCoverings) {
			NotificationChain msgs = null;
			if (relatedCoverings != null)
				msgs = ((InternalEObject)relatedCoverings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_COVERS_SPACES__RELATED_COVERINGS, null, msgs);
			if (newRelatedCoverings != null)
				msgs = ((InternalEObject)newRelatedCoverings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_COVERS_SPACES__RELATED_COVERINGS, null, msgs);
			msgs = basicSetRelatedCoverings(newRelatedCoverings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_COVERS_SPACES__RELATED_COVERINGS, newRelatedCoverings, newRelatedCoverings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_REL_COVERS_SPACES__RELATED_SPACE:
				return basicSetRelatedSpace(null, msgs);
			case FinalPackage.IFC_REL_COVERS_SPACES__RELATED_COVERINGS:
				return basicSetRelatedCoverings(null, msgs);
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
			case FinalPackage.IFC_REL_COVERS_SPACES__RELATED_SPACE:
				return getRelatedSpace();
			case FinalPackage.IFC_REL_COVERS_SPACES__RELATED_COVERINGS:
				return getRelatedCoverings();
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
			case FinalPackage.IFC_REL_COVERS_SPACES__RELATED_SPACE:
				setRelatedSpace((RelatedSpaceType)newValue);
				return;
			case FinalPackage.IFC_REL_COVERS_SPACES__RELATED_COVERINGS:
				setRelatedCoverings((RelatedCoveringsType)newValue);
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
			case FinalPackage.IFC_REL_COVERS_SPACES__RELATED_SPACE:
				setRelatedSpace((RelatedSpaceType)null);
				return;
			case FinalPackage.IFC_REL_COVERS_SPACES__RELATED_COVERINGS:
				setRelatedCoverings((RelatedCoveringsType)null);
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
			case FinalPackage.IFC_REL_COVERS_SPACES__RELATED_SPACE:
				return relatedSpace != null;
			case FinalPackage.IFC_REL_COVERS_SPACES__RELATED_COVERINGS:
				return relatedCoverings != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcRelCoversSpacesImpl
