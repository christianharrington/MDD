/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcDocumentInformation;
import ifc2x3tc1.IfcDocumentInformationRelationship;

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
 * An implementation of the model object '<em><b>Ifc Document Information Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcDocumentInformationRelationshipImpl#getRelatingDocument <em>Relating Document</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcDocumentInformationRelationshipImpl#getRelatedDocuments <em>Related Documents</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcDocumentInformationRelationshipImpl#getRelationshipType <em>Relationship Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcDocumentInformationRelationshipImpl extends EObjectImpl implements IfcDocumentInformationRelationship {
	/**
	 * The cached value of the '{@link #getRelatingDocument() <em>Relating Document</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingDocument()
	 * @generated
	 * @ordered
	 */
	protected IfcDocumentInformation relatingDocument;

	/**
	 * The cached value of the '{@link #getRelatedDocuments() <em>Related Documents</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedDocuments()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcDocumentInformation> relatedDocuments;

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
	 * This is true if the Relationship Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean relationshipTypeESet;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformationRelationship();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDocumentInformation getRelatingDocument() {
		if (relatingDocument != null && relatingDocument.eIsProxy()) {
			InternalEObject oldRelatingDocument = (InternalEObject)relatingDocument;
			relatingDocument = (IfcDocumentInformation)eResolveProxy(oldRelatingDocument);
			if (relatingDocument != oldRelatingDocument) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION_RELATIONSHIP__RELATING_DOCUMENT, oldRelatingDocument, relatingDocument));
			}
		}
		return relatingDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDocumentInformation basicGetRelatingDocument() {
		return relatingDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatingDocument(IfcDocumentInformation newRelatingDocument, NotificationChain msgs) {
		IfcDocumentInformation oldRelatingDocument = relatingDocument;
		relatingDocument = newRelatingDocument;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION_RELATIONSHIP__RELATING_DOCUMENT, oldRelatingDocument, newRelatingDocument);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingDocument(IfcDocumentInformation newRelatingDocument) {
		if (newRelatingDocument != relatingDocument) {
			NotificationChain msgs = null;
			if (relatingDocument != null)
				msgs = ((InternalEObject)relatingDocument).eInverseRemove(this, Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__IS_POINTER, IfcDocumentInformation.class, msgs);
			if (newRelatingDocument != null)
				msgs = ((InternalEObject)newRelatingDocument).eInverseAdd(this, Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__IS_POINTER, IfcDocumentInformation.class, msgs);
			msgs = basicSetRelatingDocument(newRelatingDocument, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION_RELATIONSHIP__RELATING_DOCUMENT, newRelatingDocument, newRelatingDocument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcDocumentInformation> getRelatedDocuments() {
		if (relatedDocuments == null) {
			relatedDocuments = new EObjectWithInverseResolvingEList.ManyInverse<IfcDocumentInformation>(IfcDocumentInformation.class, this, Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION_RELATIONSHIP__RELATED_DOCUMENTS, Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__IS_POINTED_TO);
		}
		return relatedDocuments;
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
		boolean oldRelationshipTypeESet = relationshipTypeESet;
		relationshipTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION_RELATIONSHIP__RELATIONSHIP_TYPE, oldRelationshipType, relationshipType, !oldRelationshipTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRelationshipType() {
		String oldRelationshipType = relationshipType;
		boolean oldRelationshipTypeESet = relationshipTypeESet;
		relationshipType = RELATIONSHIP_TYPE_EDEFAULT;
		relationshipTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION_RELATIONSHIP__RELATIONSHIP_TYPE, oldRelationshipType, RELATIONSHIP_TYPE_EDEFAULT, oldRelationshipTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRelationshipType() {
		return relationshipTypeESet;
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
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION_RELATIONSHIP__RELATING_DOCUMENT:
				if (relatingDocument != null)
					msgs = ((InternalEObject)relatingDocument).eInverseRemove(this, Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__IS_POINTER, IfcDocumentInformation.class, msgs);
				return basicSetRelatingDocument((IfcDocumentInformation)otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION_RELATIONSHIP__RELATED_DOCUMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRelatedDocuments()).basicAdd(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION_RELATIONSHIP__RELATING_DOCUMENT:
				return basicSetRelatingDocument(null, msgs);
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION_RELATIONSHIP__RELATED_DOCUMENTS:
				return ((InternalEList<?>)getRelatedDocuments()).basicRemove(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION_RELATIONSHIP__RELATING_DOCUMENT:
				if (resolve) return getRelatingDocument();
				return basicGetRelatingDocument();
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION_RELATIONSHIP__RELATED_DOCUMENTS:
				return getRelatedDocuments();
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION_RELATIONSHIP__RELATIONSHIP_TYPE:
				return getRelationshipType();
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
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION_RELATIONSHIP__RELATING_DOCUMENT:
				setRelatingDocument((IfcDocumentInformation)newValue);
				return;
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION_RELATIONSHIP__RELATED_DOCUMENTS:
				getRelatedDocuments().clear();
				getRelatedDocuments().addAll((Collection<? extends IfcDocumentInformation>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION_RELATIONSHIP__RELATIONSHIP_TYPE:
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
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION_RELATIONSHIP__RELATING_DOCUMENT:
				setRelatingDocument((IfcDocumentInformation)null);
				return;
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION_RELATIONSHIP__RELATED_DOCUMENTS:
				getRelatedDocuments().clear();
				return;
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION_RELATIONSHIP__RELATIONSHIP_TYPE:
				unsetRelationshipType();
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
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION_RELATIONSHIP__RELATING_DOCUMENT:
				return relatingDocument != null;
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION_RELATIONSHIP__RELATED_DOCUMENTS:
				return relatedDocuments != null && !relatedDocuments.isEmpty();
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION_RELATIONSHIP__RELATIONSHIP_TYPE:
				return isSetRelationshipType();
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
		result.append(" (RelationshipType: ");
		if (relationshipTypeESet) result.append(relationshipType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcDocumentInformationRelationshipImpl
