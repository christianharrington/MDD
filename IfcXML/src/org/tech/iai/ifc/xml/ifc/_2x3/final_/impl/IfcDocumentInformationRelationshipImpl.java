/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.EntityImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDocumentInformationRelationship;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatedDocumentsType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingDocumentType1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Document Information Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDocumentInformationRelationshipImpl#getRelatingDocument <em>Relating Document</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDocumentInformationRelationshipImpl#getRelatedDocuments <em>Related Documents</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDocumentInformationRelationshipImpl#getRelationshipType <em>Relationship Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcDocumentInformationRelationshipImpl extends EntityImpl implements IfcDocumentInformationRelationship {
	/**
	 * The cached value of the '{@link #getRelatingDocument() <em>Relating Document</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingDocument()
	 * @generated
	 * @ordered
	 */
	protected RelatingDocumentType1 relatingDocument;

	/**
	 * The cached value of the '{@link #getRelatedDocuments() <em>Related Documents</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedDocuments()
	 * @generated
	 * @ordered
	 */
	protected RelatedDocumentsType relatedDocuments;

	/**
	 * The default value of the '{@link #getRelationshipType() <em>Relationship Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationshipType()
	 * @generated
	 * @ordered
	 */
	protected static final String RELATIONSHIP_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelationshipType() <em>Relationship Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationshipType()
	 * @generated
	 * @ordered
	 */
	protected String relationshipType = RELATIONSHIP_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcDocumentInformationRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcDocumentInformationRelationship();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingDocumentType1 getRelatingDocument() {
		return relatingDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatingDocument(RelatingDocumentType1 newRelatingDocument, NotificationChain msgs) {
		RelatingDocumentType1 oldRelatingDocument = relatingDocument;
		relatingDocument = newRelatingDocument;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DOCUMENT_INFORMATION_RELATIONSHIP__RELATING_DOCUMENT, oldRelatingDocument, newRelatingDocument);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingDocument(RelatingDocumentType1 newRelatingDocument) {
		if (newRelatingDocument != relatingDocument) {
			NotificationChain msgs = null;
			if (relatingDocument != null)
				msgs = ((InternalEObject)relatingDocument).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DOCUMENT_INFORMATION_RELATIONSHIP__RELATING_DOCUMENT, null, msgs);
			if (newRelatingDocument != null)
				msgs = ((InternalEObject)newRelatingDocument).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DOCUMENT_INFORMATION_RELATIONSHIP__RELATING_DOCUMENT, null, msgs);
			msgs = basicSetRelatingDocument(newRelatingDocument, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DOCUMENT_INFORMATION_RELATIONSHIP__RELATING_DOCUMENT, newRelatingDocument, newRelatingDocument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedDocumentsType getRelatedDocuments() {
		return relatedDocuments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatedDocuments(RelatedDocumentsType newRelatedDocuments, NotificationChain msgs) {
		RelatedDocumentsType oldRelatedDocuments = relatedDocuments;
		relatedDocuments = newRelatedDocuments;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DOCUMENT_INFORMATION_RELATIONSHIP__RELATED_DOCUMENTS, oldRelatedDocuments, newRelatedDocuments);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedDocuments(RelatedDocumentsType newRelatedDocuments) {
		if (newRelatedDocuments != relatedDocuments) {
			NotificationChain msgs = null;
			if (relatedDocuments != null)
				msgs = ((InternalEObject)relatedDocuments).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DOCUMENT_INFORMATION_RELATIONSHIP__RELATED_DOCUMENTS, null, msgs);
			if (newRelatedDocuments != null)
				msgs = ((InternalEObject)newRelatedDocuments).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DOCUMENT_INFORMATION_RELATIONSHIP__RELATED_DOCUMENTS, null, msgs);
			msgs = basicSetRelatedDocuments(newRelatedDocuments, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DOCUMENT_INFORMATION_RELATIONSHIP__RELATED_DOCUMENTS, newRelatedDocuments, newRelatedDocuments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRelationshipType() {
		return relationshipType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationshipType(String newRelationshipType) {
		String oldRelationshipType = relationshipType;
		relationshipType = newRelationshipType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DOCUMENT_INFORMATION_RELATIONSHIP__RELATIONSHIP_TYPE, oldRelationshipType, relationshipType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_DOCUMENT_INFORMATION_RELATIONSHIP__RELATING_DOCUMENT:
				return basicSetRelatingDocument(null, msgs);
			case FinalPackage.IFC_DOCUMENT_INFORMATION_RELATIONSHIP__RELATED_DOCUMENTS:
				return basicSetRelatedDocuments(null, msgs);
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
			case FinalPackage.IFC_DOCUMENT_INFORMATION_RELATIONSHIP__RELATING_DOCUMENT:
				return getRelatingDocument();
			case FinalPackage.IFC_DOCUMENT_INFORMATION_RELATIONSHIP__RELATED_DOCUMENTS:
				return getRelatedDocuments();
			case FinalPackage.IFC_DOCUMENT_INFORMATION_RELATIONSHIP__RELATIONSHIP_TYPE:
				return getRelationshipType();
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
			case FinalPackage.IFC_DOCUMENT_INFORMATION_RELATIONSHIP__RELATING_DOCUMENT:
				setRelatingDocument((RelatingDocumentType1)newValue);
				return;
			case FinalPackage.IFC_DOCUMENT_INFORMATION_RELATIONSHIP__RELATED_DOCUMENTS:
				setRelatedDocuments((RelatedDocumentsType)newValue);
				return;
			case FinalPackage.IFC_DOCUMENT_INFORMATION_RELATIONSHIP__RELATIONSHIP_TYPE:
				setRelationshipType((String)newValue);
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
			case FinalPackage.IFC_DOCUMENT_INFORMATION_RELATIONSHIP__RELATING_DOCUMENT:
				setRelatingDocument((RelatingDocumentType1)null);
				return;
			case FinalPackage.IFC_DOCUMENT_INFORMATION_RELATIONSHIP__RELATED_DOCUMENTS:
				setRelatedDocuments((RelatedDocumentsType)null);
				return;
			case FinalPackage.IFC_DOCUMENT_INFORMATION_RELATIONSHIP__RELATIONSHIP_TYPE:
				setRelationshipType(RELATIONSHIP_TYPE_EDEFAULT);
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
			case FinalPackage.IFC_DOCUMENT_INFORMATION_RELATIONSHIP__RELATING_DOCUMENT:
				return relatingDocument != null;
			case FinalPackage.IFC_DOCUMENT_INFORMATION_RELATIONSHIP__RELATED_DOCUMENTS:
				return relatedDocuments != null;
			case FinalPackage.IFC_DOCUMENT_INFORMATION_RELATIONSHIP__RELATIONSHIP_TYPE:
				return RELATIONSHIP_TYPE_EDEFAULT == null ? relationshipType != null : !RELATIONSHIP_TYPE_EDEFAULT.equals(relationshipType);
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
		result.append(" (relationshipType: ");
		result.append(relationshipType);
		result.append(')');
		return result.toString();
	}

} //IfcDocumentInformationRelationshipImpl
