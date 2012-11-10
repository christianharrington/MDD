/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcActorSelect;
import ifc2x3tc1.IfcCalendarDate;
import ifc2x3tc1.IfcDateAndTime;
import ifc2x3tc1.IfcDocumentConfidentialityEnum;
import ifc2x3tc1.IfcDocumentElectronicFormat;
import ifc2x3tc1.IfcDocumentInformation;
import ifc2x3tc1.IfcDocumentInformationRelationship;
import ifc2x3tc1.IfcDocumentReference;
import ifc2x3tc1.IfcDocumentStatusEnum;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Document Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcDocumentInformationImpl#getDocumentId <em>Document Id</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcDocumentInformationImpl#getName <em>Name</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcDocumentInformationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcDocumentInformationImpl#getDocumentReferences <em>Document References</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcDocumentInformationImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcDocumentInformationImpl#getIntendedUse <em>Intended Use</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcDocumentInformationImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcDocumentInformationImpl#getRevision <em>Revision</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcDocumentInformationImpl#getDocumentOwner <em>Document Owner</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcDocumentInformationImpl#getEditors <em>Editors</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcDocumentInformationImpl#getCreationTime <em>Creation Time</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcDocumentInformationImpl#getLastRevisionTime <em>Last Revision Time</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcDocumentInformationImpl#getElectronicFormat <em>Electronic Format</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcDocumentInformationImpl#getValidFrom <em>Valid From</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcDocumentInformationImpl#getValidUntil <em>Valid Until</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcDocumentInformationImpl#getConfidentiality <em>Confidentiality</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcDocumentInformationImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcDocumentInformationImpl#getIsPointedTo <em>Is Pointed To</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcDocumentInformationImpl#getIsPointer <em>Is Pointer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcDocumentInformationImpl extends EObjectImpl implements IfcDocumentInformation {
	/**
	 * The default value of the '{@link #getDocumentId() <em>Document Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentId()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocumentId() <em>Document Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentId()
	 * @generated
	 * @ordered
	 */
	protected String documentId = DOCUMENT_ID_EDEFAULT;

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
	 * The cached value of the '{@link #getDocumentReferences() <em>Document References</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcDocumentReference> documentReferences;

	/**
	 * The default value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected static final String PURPOSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected String purpose = PURPOSE_EDEFAULT;

	/**
	 * This is true if the Purpose attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean purposeESet;

	/**
	 * The default value of the '{@link #getIntendedUse() <em>Intended Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntendedUse()
	 * @generated
	 * @ordered
	 */
	protected static final String INTENDED_USE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIntendedUse() <em>Intended Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntendedUse()
	 * @generated
	 * @ordered
	 */
	protected String intendedUse = INTENDED_USE_EDEFAULT;

	/**
	 * This is true if the Intended Use attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean intendedUseESet;

	/**
	 * The default value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected static final String SCOPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected String scope = SCOPE_EDEFAULT;

	/**
	 * This is true if the Scope attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean scopeESet;

	/**
	 * The default value of the '{@link #getRevision() <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevision()
	 * @generated
	 * @ordered
	 */
	protected static final String REVISION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRevision() <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevision()
	 * @generated
	 * @ordered
	 */
	protected String revision = REVISION_EDEFAULT;

	/**
	 * This is true if the Revision attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean revisionESet;

	/**
	 * The cached value of the '{@link #getDocumentOwner() <em>Document Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentOwner()
	 * @generated
	 * @ordered
	 */
	protected IfcActorSelect documentOwner;

	/**
	 * This is true if the Document Owner reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean documentOwnerESet;

	/**
	 * The cached value of the '{@link #getEditors() <em>Editors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditors()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcActorSelect> editors;

	/**
	 * The cached value of the '{@link #getCreationTime() <em>Creation Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationTime()
	 * @generated
	 * @ordered
	 */
	protected IfcDateAndTime creationTime;

	/**
	 * This is true if the Creation Time reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean creationTimeESet;

	/**
	 * The cached value of the '{@link #getLastRevisionTime() <em>Last Revision Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastRevisionTime()
	 * @generated
	 * @ordered
	 */
	protected IfcDateAndTime lastRevisionTime;

	/**
	 * This is true if the Last Revision Time reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lastRevisionTimeESet;

	/**
	 * The cached value of the '{@link #getElectronicFormat() <em>Electronic Format</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElectronicFormat()
	 * @generated
	 * @ordered
	 */
	protected IfcDocumentElectronicFormat electronicFormat;

	/**
	 * This is true if the Electronic Format reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean electronicFormatESet;

	/**
	 * The cached value of the '{@link #getValidFrom() <em>Valid From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidFrom()
	 * @generated
	 * @ordered
	 */
	protected IfcCalendarDate validFrom;

	/**
	 * This is true if the Valid From reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean validFromESet;

	/**
	 * The cached value of the '{@link #getValidUntil() <em>Valid Until</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidUntil()
	 * @generated
	 * @ordered
	 */
	protected IfcCalendarDate validUntil;

	/**
	 * This is true if the Valid Until reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean validUntilESet;

	/**
	 * The default value of the '{@link #getConfidentiality() <em>Confidentiality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidentiality()
	 * @generated
	 * @ordered
	 */
	protected static final IfcDocumentConfidentialityEnum CONFIDENTIALITY_EDEFAULT = IfcDocumentConfidentialityEnum.NULL;

	/**
	 * The cached value of the '{@link #getConfidentiality() <em>Confidentiality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidentiality()
	 * @generated
	 * @ordered
	 */
	protected IfcDocumentConfidentialityEnum confidentiality = CONFIDENTIALITY_EDEFAULT;

	/**
	 * This is true if the Confidentiality attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean confidentialityESet;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final IfcDocumentStatusEnum STATUS_EDEFAULT = IfcDocumentStatusEnum.NULL;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected IfcDocumentStatusEnum status = STATUS_EDEFAULT;

	/**
	 * This is true if the Status attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean statusESet;

	/**
	 * The cached value of the '{@link #getIsPointedTo() <em>Is Pointed To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPointedTo()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcDocumentInformationRelationship> isPointedTo;

	/**
	 * The cached value of the '{@link #getIsPointer() <em>Is Pointer</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPointer()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcDocumentInformationRelationship> isPointer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcDocumentInformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDocumentId() {
		return documentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentId(String newDocumentId) {
		String oldDocumentId = documentId;
		documentId = newDocumentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__DOCUMENT_ID, oldDocumentId, documentId));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__DESCRIPTION, oldDescription, description, !oldDescriptionESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__DESCRIPTION, oldDescription, DESCRIPTION_EDEFAULT, oldDescriptionESet));
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
	public EList<IfcDocumentReference> getDocumentReferences() {
		if (documentReferences == null) {
			documentReferences = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse<IfcDocumentReference>(IfcDocumentReference.class, this, Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__DOCUMENT_REFERENCES, Ifc2x3tc1Package.IFC_DOCUMENT_REFERENCE__REFERENCE_TO_DOCUMENT);
		}
		return documentReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDocumentReferences() {
		if (documentReferences != null) ((InternalEList.Unsettable<?>)documentReferences).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDocumentReferences() {
		return documentReferences != null && ((InternalEList.Unsettable<?>)documentReferences).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPurpose() {
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPurpose(String newPurpose) {
		String oldPurpose = purpose;
		purpose = newPurpose;
		boolean oldPurposeESet = purposeESet;
		purposeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__PURPOSE, oldPurpose, purpose, !oldPurposeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPurpose() {
		String oldPurpose = purpose;
		boolean oldPurposeESet = purposeESet;
		purpose = PURPOSE_EDEFAULT;
		purposeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__PURPOSE, oldPurpose, PURPOSE_EDEFAULT, oldPurposeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPurpose() {
		return purposeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIntendedUse() {
		return intendedUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntendedUse(String newIntendedUse) {
		String oldIntendedUse = intendedUse;
		intendedUse = newIntendedUse;
		boolean oldIntendedUseESet = intendedUseESet;
		intendedUseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__INTENDED_USE, oldIntendedUse, intendedUse, !oldIntendedUseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIntendedUse() {
		String oldIntendedUse = intendedUse;
		boolean oldIntendedUseESet = intendedUseESet;
		intendedUse = INTENDED_USE_EDEFAULT;
		intendedUseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__INTENDED_USE, oldIntendedUse, INTENDED_USE_EDEFAULT, oldIntendedUseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIntendedUse() {
		return intendedUseESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScope() {
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScope(String newScope) {
		String oldScope = scope;
		scope = newScope;
		boolean oldScopeESet = scopeESet;
		scopeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__SCOPE, oldScope, scope, !oldScopeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetScope() {
		String oldScope = scope;
		boolean oldScopeESet = scopeESet;
		scope = SCOPE_EDEFAULT;
		scopeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__SCOPE, oldScope, SCOPE_EDEFAULT, oldScopeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetScope() {
		return scopeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRevision() {
		return revision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevision(String newRevision) {
		String oldRevision = revision;
		revision = newRevision;
		boolean oldRevisionESet = revisionESet;
		revisionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__REVISION, oldRevision, revision, !oldRevisionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRevision() {
		String oldRevision = revision;
		boolean oldRevisionESet = revisionESet;
		revision = REVISION_EDEFAULT;
		revisionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__REVISION, oldRevision, REVISION_EDEFAULT, oldRevisionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRevision() {
		return revisionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcActorSelect getDocumentOwner() {
		if (documentOwner != null && documentOwner.eIsProxy()) {
			InternalEObject oldDocumentOwner = (InternalEObject)documentOwner;
			documentOwner = (IfcActorSelect)eResolveProxy(oldDocumentOwner);
			if (documentOwner != oldDocumentOwner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__DOCUMENT_OWNER, oldDocumentOwner, documentOwner));
			}
		}
		return documentOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcActorSelect basicGetDocumentOwner() {
		return documentOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentOwner(IfcActorSelect newDocumentOwner) {
		IfcActorSelect oldDocumentOwner = documentOwner;
		documentOwner = newDocumentOwner;
		boolean oldDocumentOwnerESet = documentOwnerESet;
		documentOwnerESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__DOCUMENT_OWNER, oldDocumentOwner, documentOwner, !oldDocumentOwnerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDocumentOwner() {
		IfcActorSelect oldDocumentOwner = documentOwner;
		boolean oldDocumentOwnerESet = documentOwnerESet;
		documentOwner = null;
		documentOwnerESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__DOCUMENT_OWNER, oldDocumentOwner, null, oldDocumentOwnerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDocumentOwner() {
		return documentOwnerESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcActorSelect> getEditors() {
		if (editors == null) {
			editors = new EObjectResolvingEList.Unsettable<IfcActorSelect>(IfcActorSelect.class, this, Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__EDITORS);
		}
		return editors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEditors() {
		if (editors != null) ((InternalEList.Unsettable<?>)editors).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEditors() {
		return editors != null && ((InternalEList.Unsettable<?>)editors).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateAndTime getCreationTime() {
		if (creationTime != null && creationTime.eIsProxy()) {
			InternalEObject oldCreationTime = (InternalEObject)creationTime;
			creationTime = (IfcDateAndTime)eResolveProxy(oldCreationTime);
			if (creationTime != oldCreationTime) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__CREATION_TIME, oldCreationTime, creationTime));
			}
		}
		return creationTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateAndTime basicGetCreationTime() {
		return creationTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationTime(IfcDateAndTime newCreationTime) {
		IfcDateAndTime oldCreationTime = creationTime;
		creationTime = newCreationTime;
		boolean oldCreationTimeESet = creationTimeESet;
		creationTimeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__CREATION_TIME, oldCreationTime, creationTime, !oldCreationTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCreationTime() {
		IfcDateAndTime oldCreationTime = creationTime;
		boolean oldCreationTimeESet = creationTimeESet;
		creationTime = null;
		creationTimeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__CREATION_TIME, oldCreationTime, null, oldCreationTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCreationTime() {
		return creationTimeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateAndTime getLastRevisionTime() {
		if (lastRevisionTime != null && lastRevisionTime.eIsProxy()) {
			InternalEObject oldLastRevisionTime = (InternalEObject)lastRevisionTime;
			lastRevisionTime = (IfcDateAndTime)eResolveProxy(oldLastRevisionTime);
			if (lastRevisionTime != oldLastRevisionTime) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__LAST_REVISION_TIME, oldLastRevisionTime, lastRevisionTime));
			}
		}
		return lastRevisionTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateAndTime basicGetLastRevisionTime() {
		return lastRevisionTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastRevisionTime(IfcDateAndTime newLastRevisionTime) {
		IfcDateAndTime oldLastRevisionTime = lastRevisionTime;
		lastRevisionTime = newLastRevisionTime;
		boolean oldLastRevisionTimeESet = lastRevisionTimeESet;
		lastRevisionTimeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__LAST_REVISION_TIME, oldLastRevisionTime, lastRevisionTime, !oldLastRevisionTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLastRevisionTime() {
		IfcDateAndTime oldLastRevisionTime = lastRevisionTime;
		boolean oldLastRevisionTimeESet = lastRevisionTimeESet;
		lastRevisionTime = null;
		lastRevisionTimeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__LAST_REVISION_TIME, oldLastRevisionTime, null, oldLastRevisionTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLastRevisionTime() {
		return lastRevisionTimeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDocumentElectronicFormat getElectronicFormat() {
		if (electronicFormat != null && electronicFormat.eIsProxy()) {
			InternalEObject oldElectronicFormat = (InternalEObject)electronicFormat;
			electronicFormat = (IfcDocumentElectronicFormat)eResolveProxy(oldElectronicFormat);
			if (electronicFormat != oldElectronicFormat) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__ELECTRONIC_FORMAT, oldElectronicFormat, electronicFormat));
			}
		}
		return electronicFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDocumentElectronicFormat basicGetElectronicFormat() {
		return electronicFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElectronicFormat(IfcDocumentElectronicFormat newElectronicFormat) {
		IfcDocumentElectronicFormat oldElectronicFormat = electronicFormat;
		electronicFormat = newElectronicFormat;
		boolean oldElectronicFormatESet = electronicFormatESet;
		electronicFormatESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__ELECTRONIC_FORMAT, oldElectronicFormat, electronicFormat, !oldElectronicFormatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetElectronicFormat() {
		IfcDocumentElectronicFormat oldElectronicFormat = electronicFormat;
		boolean oldElectronicFormatESet = electronicFormatESet;
		electronicFormat = null;
		electronicFormatESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__ELECTRONIC_FORMAT, oldElectronicFormat, null, oldElectronicFormatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetElectronicFormat() {
		return electronicFormatESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCalendarDate getValidFrom() {
		if (validFrom != null && validFrom.eIsProxy()) {
			InternalEObject oldValidFrom = (InternalEObject)validFrom;
			validFrom = (IfcCalendarDate)eResolveProxy(oldValidFrom);
			if (validFrom != oldValidFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__VALID_FROM, oldValidFrom, validFrom));
			}
		}
		return validFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCalendarDate basicGetValidFrom() {
		return validFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidFrom(IfcCalendarDate newValidFrom) {
		IfcCalendarDate oldValidFrom = validFrom;
		validFrom = newValidFrom;
		boolean oldValidFromESet = validFromESet;
		validFromESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__VALID_FROM, oldValidFrom, validFrom, !oldValidFromESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValidFrom() {
		IfcCalendarDate oldValidFrom = validFrom;
		boolean oldValidFromESet = validFromESet;
		validFrom = null;
		validFromESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__VALID_FROM, oldValidFrom, null, oldValidFromESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValidFrom() {
		return validFromESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCalendarDate getValidUntil() {
		if (validUntil != null && validUntil.eIsProxy()) {
			InternalEObject oldValidUntil = (InternalEObject)validUntil;
			validUntil = (IfcCalendarDate)eResolveProxy(oldValidUntil);
			if (validUntil != oldValidUntil) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__VALID_UNTIL, oldValidUntil, validUntil));
			}
		}
		return validUntil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCalendarDate basicGetValidUntil() {
		return validUntil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidUntil(IfcCalendarDate newValidUntil) {
		IfcCalendarDate oldValidUntil = validUntil;
		validUntil = newValidUntil;
		boolean oldValidUntilESet = validUntilESet;
		validUntilESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__VALID_UNTIL, oldValidUntil, validUntil, !oldValidUntilESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValidUntil() {
		IfcCalendarDate oldValidUntil = validUntil;
		boolean oldValidUntilESet = validUntilESet;
		validUntil = null;
		validUntilESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__VALID_UNTIL, oldValidUntil, null, oldValidUntilESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValidUntil() {
		return validUntilESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDocumentConfidentialityEnum getConfidentiality() {
		return confidentiality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfidentiality(IfcDocumentConfidentialityEnum newConfidentiality) {
		IfcDocumentConfidentialityEnum oldConfidentiality = confidentiality;
		confidentiality = newConfidentiality == null ? CONFIDENTIALITY_EDEFAULT : newConfidentiality;
		boolean oldConfidentialityESet = confidentialityESet;
		confidentialityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__CONFIDENTIALITY, oldConfidentiality, confidentiality, !oldConfidentialityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConfidentiality() {
		IfcDocumentConfidentialityEnum oldConfidentiality = confidentiality;
		boolean oldConfidentialityESet = confidentialityESet;
		confidentiality = CONFIDENTIALITY_EDEFAULT;
		confidentialityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__CONFIDENTIALITY, oldConfidentiality, CONFIDENTIALITY_EDEFAULT, oldConfidentialityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConfidentiality() {
		return confidentialityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDocumentStatusEnum getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(IfcDocumentStatusEnum newStatus) {
		IfcDocumentStatusEnum oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		boolean oldStatusESet = statusESet;
		statusESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__STATUS, oldStatus, status, !oldStatusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStatus() {
		IfcDocumentStatusEnum oldStatus = status;
		boolean oldStatusESet = statusESet;
		status = STATUS_EDEFAULT;
		statusESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__STATUS, oldStatus, STATUS_EDEFAULT, oldStatusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStatus() {
		return statusESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcDocumentInformationRelationship> getIsPointedTo() {
		if (isPointedTo == null) {
			isPointedTo = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse<IfcDocumentInformationRelationship>(IfcDocumentInformationRelationship.class, this, Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__IS_POINTED_TO, Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION_RELATIONSHIP__RELATED_DOCUMENTS);
		}
		return isPointedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsPointedTo() {
		if (isPointedTo != null) ((InternalEList.Unsettable<?>)isPointedTo).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsPointedTo() {
		return isPointedTo != null && ((InternalEList.Unsettable<?>)isPointedTo).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcDocumentInformationRelationship> getIsPointer() {
		if (isPointer == null) {
			isPointer = new EObjectWithInverseResolvingEList.Unsettable<IfcDocumentInformationRelationship>(IfcDocumentInformationRelationship.class, this, Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__IS_POINTER, Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION_RELATIONSHIP__RELATING_DOCUMENT);
		}
		return isPointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsPointer() {
		if (isPointer != null) ((InternalEList.Unsettable<?>)isPointer).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsPointer() {
		return isPointer != null && ((InternalEList.Unsettable<?>)isPointer).isSet();
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
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__DOCUMENT_REFERENCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDocumentReferences()).basicAdd(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__IS_POINTED_TO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsPointedTo()).basicAdd(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__IS_POINTER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsPointer()).basicAdd(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__DOCUMENT_REFERENCES:
				return ((InternalEList<?>)getDocumentReferences()).basicRemove(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__IS_POINTED_TO:
				return ((InternalEList<?>)getIsPointedTo()).basicRemove(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__IS_POINTER:
				return ((InternalEList<?>)getIsPointer()).basicRemove(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__DOCUMENT_ID:
				return getDocumentId();
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__NAME:
				return getName();
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__DESCRIPTION:
				return getDescription();
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__DOCUMENT_REFERENCES:
				return getDocumentReferences();
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__PURPOSE:
				return getPurpose();
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__INTENDED_USE:
				return getIntendedUse();
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__SCOPE:
				return getScope();
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__REVISION:
				return getRevision();
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__DOCUMENT_OWNER:
				if (resolve) return getDocumentOwner();
				return basicGetDocumentOwner();
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__EDITORS:
				return getEditors();
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__CREATION_TIME:
				if (resolve) return getCreationTime();
				return basicGetCreationTime();
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__LAST_REVISION_TIME:
				if (resolve) return getLastRevisionTime();
				return basicGetLastRevisionTime();
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__ELECTRONIC_FORMAT:
				if (resolve) return getElectronicFormat();
				return basicGetElectronicFormat();
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__VALID_FROM:
				if (resolve) return getValidFrom();
				return basicGetValidFrom();
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__VALID_UNTIL:
				if (resolve) return getValidUntil();
				return basicGetValidUntil();
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__CONFIDENTIALITY:
				return getConfidentiality();
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__STATUS:
				return getStatus();
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__IS_POINTED_TO:
				return getIsPointedTo();
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__IS_POINTER:
				return getIsPointer();
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
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__DOCUMENT_ID:
				setDocumentId((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__NAME:
				setName((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__DOCUMENT_REFERENCES:
				getDocumentReferences().clear();
				getDocumentReferences().addAll((Collection<? extends IfcDocumentReference>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__PURPOSE:
				setPurpose((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__INTENDED_USE:
				setIntendedUse((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__SCOPE:
				setScope((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__REVISION:
				setRevision((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__DOCUMENT_OWNER:
				setDocumentOwner((IfcActorSelect)newValue);
				return;
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__EDITORS:
				getEditors().clear();
				getEditors().addAll((Collection<? extends IfcActorSelect>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__CREATION_TIME:
				setCreationTime((IfcDateAndTime)newValue);
				return;
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__LAST_REVISION_TIME:
				setLastRevisionTime((IfcDateAndTime)newValue);
				return;
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__ELECTRONIC_FORMAT:
				setElectronicFormat((IfcDocumentElectronicFormat)newValue);
				return;
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__VALID_FROM:
				setValidFrom((IfcCalendarDate)newValue);
				return;
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__VALID_UNTIL:
				setValidUntil((IfcCalendarDate)newValue);
				return;
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__CONFIDENTIALITY:
				setConfidentiality((IfcDocumentConfidentialityEnum)newValue);
				return;
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__STATUS:
				setStatus((IfcDocumentStatusEnum)newValue);
				return;
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__IS_POINTED_TO:
				getIsPointedTo().clear();
				getIsPointedTo().addAll((Collection<? extends IfcDocumentInformationRelationship>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__IS_POINTER:
				getIsPointer().clear();
				getIsPointer().addAll((Collection<? extends IfcDocumentInformationRelationship>)newValue);
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
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__DOCUMENT_ID:
				setDocumentId(DOCUMENT_ID_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__DESCRIPTION:
				unsetDescription();
				return;
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__DOCUMENT_REFERENCES:
				unsetDocumentReferences();
				return;
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__PURPOSE:
				unsetPurpose();
				return;
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__INTENDED_USE:
				unsetIntendedUse();
				return;
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__SCOPE:
				unsetScope();
				return;
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__REVISION:
				unsetRevision();
				return;
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__DOCUMENT_OWNER:
				unsetDocumentOwner();
				return;
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__EDITORS:
				unsetEditors();
				return;
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__CREATION_TIME:
				unsetCreationTime();
				return;
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__LAST_REVISION_TIME:
				unsetLastRevisionTime();
				return;
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__ELECTRONIC_FORMAT:
				unsetElectronicFormat();
				return;
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__VALID_FROM:
				unsetValidFrom();
				return;
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__VALID_UNTIL:
				unsetValidUntil();
				return;
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__CONFIDENTIALITY:
				unsetConfidentiality();
				return;
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__STATUS:
				unsetStatus();
				return;
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__IS_POINTED_TO:
				unsetIsPointedTo();
				return;
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__IS_POINTER:
				unsetIsPointer();
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
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__DOCUMENT_ID:
				return DOCUMENT_ID_EDEFAULT == null ? documentId != null : !DOCUMENT_ID_EDEFAULT.equals(documentId);
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__DESCRIPTION:
				return isSetDescription();
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__DOCUMENT_REFERENCES:
				return isSetDocumentReferences();
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__PURPOSE:
				return isSetPurpose();
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__INTENDED_USE:
				return isSetIntendedUse();
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__SCOPE:
				return isSetScope();
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__REVISION:
				return isSetRevision();
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__DOCUMENT_OWNER:
				return isSetDocumentOwner();
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__EDITORS:
				return isSetEditors();
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__CREATION_TIME:
				return isSetCreationTime();
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__LAST_REVISION_TIME:
				return isSetLastRevisionTime();
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__ELECTRONIC_FORMAT:
				return isSetElectronicFormat();
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__VALID_FROM:
				return isSetValidFrom();
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__VALID_UNTIL:
				return isSetValidUntil();
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__CONFIDENTIALITY:
				return isSetConfidentiality();
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__STATUS:
				return isSetStatus();
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__IS_POINTED_TO:
				return isSetIsPointedTo();
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__IS_POINTER:
				return isSetIsPointer();
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
		result.append(" (DocumentId: ");
		result.append(documentId);
		result.append(", Name: ");
		result.append(name);
		result.append(", Description: ");
		if (descriptionESet) result.append(description); else result.append("<unset>");
		result.append(", Purpose: ");
		if (purposeESet) result.append(purpose); else result.append("<unset>");
		result.append(", IntendedUse: ");
		if (intendedUseESet) result.append(intendedUse); else result.append("<unset>");
		result.append(", Scope: ");
		if (scopeESet) result.append(scope); else result.append("<unset>");
		result.append(", Revision: ");
		if (revisionESet) result.append(revision); else result.append("<unset>");
		result.append(", Confidentiality: ");
		if (confidentialityESet) result.append(confidentiality); else result.append("<unset>");
		result.append(", Status: ");
		if (statusESet) result.append(status); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcDocumentInformationImpl
