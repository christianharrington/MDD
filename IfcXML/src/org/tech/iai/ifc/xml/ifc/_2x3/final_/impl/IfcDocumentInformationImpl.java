/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.EntityImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.CreationTimeType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.DocumentOwnerType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.DocumentReferencesType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.EditorsType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.ElectronicFormatType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDocumentConfidentialityEnum;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDocumentInformation;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDocumentStatusEnum;
import org.tech.iai.ifc.xml.ifc._2x3.final_.LastRevisionTimeType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.ValidFromType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.ValidUntilType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Document Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDocumentInformationImpl#getDocumentId <em>Document Id</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDocumentInformationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDocumentInformationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDocumentInformationImpl#getDocumentReferences <em>Document References</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDocumentInformationImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDocumentInformationImpl#getIntendedUse <em>Intended Use</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDocumentInformationImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDocumentInformationImpl#getRevision <em>Revision</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDocumentInformationImpl#getDocumentOwner <em>Document Owner</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDocumentInformationImpl#getEditors <em>Editors</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDocumentInformationImpl#getCreationTime <em>Creation Time</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDocumentInformationImpl#getLastRevisionTime <em>Last Revision Time</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDocumentInformationImpl#getElectronicFormat <em>Electronic Format</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDocumentInformationImpl#getValidFrom <em>Valid From</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDocumentInformationImpl#getValidUntil <em>Valid Until</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDocumentInformationImpl#getConfidentiality <em>Confidentiality</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDocumentInformationImpl#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcDocumentInformationImpl extends EntityImpl implements IfcDocumentInformation {
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
	 * The cached value of the '{@link #getDocumentReferences() <em>Document References</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentReferences()
	 * @generated
	 * @ordered
	 */
	protected DocumentReferencesType documentReferences;

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
	 * The cached value of the '{@link #getDocumentOwner() <em>Document Owner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentOwner()
	 * @generated
	 * @ordered
	 */
	protected DocumentOwnerType documentOwner;

	/**
	 * The cached value of the '{@link #getEditors() <em>Editors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditors()
	 * @generated
	 * @ordered
	 */
	protected EditorsType editors;

	/**
	 * The cached value of the '{@link #getCreationTime() <em>Creation Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationTime()
	 * @generated
	 * @ordered
	 */
	protected CreationTimeType creationTime;

	/**
	 * The cached value of the '{@link #getLastRevisionTime() <em>Last Revision Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastRevisionTime()
	 * @generated
	 * @ordered
	 */
	protected LastRevisionTimeType lastRevisionTime;

	/**
	 * The cached value of the '{@link #getElectronicFormat() <em>Electronic Format</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElectronicFormat()
	 * @generated
	 * @ordered
	 */
	protected ElectronicFormatType electronicFormat;

	/**
	 * The cached value of the '{@link #getValidFrom() <em>Valid From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidFrom()
	 * @generated
	 * @ordered
	 */
	protected ValidFromType validFrom;

	/**
	 * The cached value of the '{@link #getValidUntil() <em>Valid Until</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidUntil()
	 * @generated
	 * @ordered
	 */
	protected ValidUntilType validUntil;

	/**
	 * The default value of the '{@link #getConfidentiality() <em>Confidentiality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidentiality()
	 * @generated
	 * @ordered
	 */
	protected static final IfcDocumentConfidentialityEnum CONFIDENTIALITY_EDEFAULT = null;

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
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final IfcDocumentStatusEnum STATUS_EDEFAULT = null;

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
		return FinalPackage.eINSTANCE.getIfcDocumentInformation();
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DOCUMENT_INFORMATION__DOCUMENT_ID, oldDocumentId, documentId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DOCUMENT_INFORMATION__NAME, oldName, name));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DOCUMENT_INFORMATION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentReferencesType getDocumentReferences() {
		return documentReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentReferences(DocumentReferencesType newDocumentReferences, NotificationChain msgs) {
		DocumentReferencesType oldDocumentReferences = documentReferences;
		documentReferences = newDocumentReferences;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DOCUMENT_INFORMATION__DOCUMENT_REFERENCES, oldDocumentReferences, newDocumentReferences);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentReferences(DocumentReferencesType newDocumentReferences) {
		if (newDocumentReferences != documentReferences) {
			NotificationChain msgs = null;
			if (documentReferences != null)
				msgs = ((InternalEObject)documentReferences).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DOCUMENT_INFORMATION__DOCUMENT_REFERENCES, null, msgs);
			if (newDocumentReferences != null)
				msgs = ((InternalEObject)newDocumentReferences).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DOCUMENT_INFORMATION__DOCUMENT_REFERENCES, null, msgs);
			msgs = basicSetDocumentReferences(newDocumentReferences, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DOCUMENT_INFORMATION__DOCUMENT_REFERENCES, newDocumentReferences, newDocumentReferences));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DOCUMENT_INFORMATION__PURPOSE, oldPurpose, purpose));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DOCUMENT_INFORMATION__INTENDED_USE, oldIntendedUse, intendedUse));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DOCUMENT_INFORMATION__SCOPE, oldScope, scope));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DOCUMENT_INFORMATION__REVISION, oldRevision, revision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentOwnerType getDocumentOwner() {
		return documentOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentOwner(DocumentOwnerType newDocumentOwner, NotificationChain msgs) {
		DocumentOwnerType oldDocumentOwner = documentOwner;
		documentOwner = newDocumentOwner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DOCUMENT_INFORMATION__DOCUMENT_OWNER, oldDocumentOwner, newDocumentOwner);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentOwner(DocumentOwnerType newDocumentOwner) {
		if (newDocumentOwner != documentOwner) {
			NotificationChain msgs = null;
			if (documentOwner != null)
				msgs = ((InternalEObject)documentOwner).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DOCUMENT_INFORMATION__DOCUMENT_OWNER, null, msgs);
			if (newDocumentOwner != null)
				msgs = ((InternalEObject)newDocumentOwner).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DOCUMENT_INFORMATION__DOCUMENT_OWNER, null, msgs);
			msgs = basicSetDocumentOwner(newDocumentOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DOCUMENT_INFORMATION__DOCUMENT_OWNER, newDocumentOwner, newDocumentOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EditorsType getEditors() {
		return editors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEditors(EditorsType newEditors, NotificationChain msgs) {
		EditorsType oldEditors = editors;
		editors = newEditors;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DOCUMENT_INFORMATION__EDITORS, oldEditors, newEditors);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditors(EditorsType newEditors) {
		if (newEditors != editors) {
			NotificationChain msgs = null;
			if (editors != null)
				msgs = ((InternalEObject)editors).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DOCUMENT_INFORMATION__EDITORS, null, msgs);
			if (newEditors != null)
				msgs = ((InternalEObject)newEditors).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DOCUMENT_INFORMATION__EDITORS, null, msgs);
			msgs = basicSetEditors(newEditors, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DOCUMENT_INFORMATION__EDITORS, newEditors, newEditors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreationTimeType getCreationTime() {
		return creationTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreationTime(CreationTimeType newCreationTime, NotificationChain msgs) {
		CreationTimeType oldCreationTime = creationTime;
		creationTime = newCreationTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DOCUMENT_INFORMATION__CREATION_TIME, oldCreationTime, newCreationTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationTime(CreationTimeType newCreationTime) {
		if (newCreationTime != creationTime) {
			NotificationChain msgs = null;
			if (creationTime != null)
				msgs = ((InternalEObject)creationTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DOCUMENT_INFORMATION__CREATION_TIME, null, msgs);
			if (newCreationTime != null)
				msgs = ((InternalEObject)newCreationTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DOCUMENT_INFORMATION__CREATION_TIME, null, msgs);
			msgs = basicSetCreationTime(newCreationTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DOCUMENT_INFORMATION__CREATION_TIME, newCreationTime, newCreationTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LastRevisionTimeType getLastRevisionTime() {
		return lastRevisionTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLastRevisionTime(LastRevisionTimeType newLastRevisionTime, NotificationChain msgs) {
		LastRevisionTimeType oldLastRevisionTime = lastRevisionTime;
		lastRevisionTime = newLastRevisionTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DOCUMENT_INFORMATION__LAST_REVISION_TIME, oldLastRevisionTime, newLastRevisionTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastRevisionTime(LastRevisionTimeType newLastRevisionTime) {
		if (newLastRevisionTime != lastRevisionTime) {
			NotificationChain msgs = null;
			if (lastRevisionTime != null)
				msgs = ((InternalEObject)lastRevisionTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DOCUMENT_INFORMATION__LAST_REVISION_TIME, null, msgs);
			if (newLastRevisionTime != null)
				msgs = ((InternalEObject)newLastRevisionTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DOCUMENT_INFORMATION__LAST_REVISION_TIME, null, msgs);
			msgs = basicSetLastRevisionTime(newLastRevisionTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DOCUMENT_INFORMATION__LAST_REVISION_TIME, newLastRevisionTime, newLastRevisionTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectronicFormatType getElectronicFormat() {
		return electronicFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElectronicFormat(ElectronicFormatType newElectronicFormat, NotificationChain msgs) {
		ElectronicFormatType oldElectronicFormat = electronicFormat;
		electronicFormat = newElectronicFormat;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DOCUMENT_INFORMATION__ELECTRONIC_FORMAT, oldElectronicFormat, newElectronicFormat);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElectronicFormat(ElectronicFormatType newElectronicFormat) {
		if (newElectronicFormat != electronicFormat) {
			NotificationChain msgs = null;
			if (electronicFormat != null)
				msgs = ((InternalEObject)electronicFormat).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DOCUMENT_INFORMATION__ELECTRONIC_FORMAT, null, msgs);
			if (newElectronicFormat != null)
				msgs = ((InternalEObject)newElectronicFormat).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DOCUMENT_INFORMATION__ELECTRONIC_FORMAT, null, msgs);
			msgs = basicSetElectronicFormat(newElectronicFormat, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DOCUMENT_INFORMATION__ELECTRONIC_FORMAT, newElectronicFormat, newElectronicFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidFromType getValidFrom() {
		return validFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidFrom(ValidFromType newValidFrom, NotificationChain msgs) {
		ValidFromType oldValidFrom = validFrom;
		validFrom = newValidFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DOCUMENT_INFORMATION__VALID_FROM, oldValidFrom, newValidFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidFrom(ValidFromType newValidFrom) {
		if (newValidFrom != validFrom) {
			NotificationChain msgs = null;
			if (validFrom != null)
				msgs = ((InternalEObject)validFrom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DOCUMENT_INFORMATION__VALID_FROM, null, msgs);
			if (newValidFrom != null)
				msgs = ((InternalEObject)newValidFrom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DOCUMENT_INFORMATION__VALID_FROM, null, msgs);
			msgs = basicSetValidFrom(newValidFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DOCUMENT_INFORMATION__VALID_FROM, newValidFrom, newValidFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidUntilType getValidUntil() {
		return validUntil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidUntil(ValidUntilType newValidUntil, NotificationChain msgs) {
		ValidUntilType oldValidUntil = validUntil;
		validUntil = newValidUntil;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DOCUMENT_INFORMATION__VALID_UNTIL, oldValidUntil, newValidUntil);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidUntil(ValidUntilType newValidUntil) {
		if (newValidUntil != validUntil) {
			NotificationChain msgs = null;
			if (validUntil != null)
				msgs = ((InternalEObject)validUntil).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DOCUMENT_INFORMATION__VALID_UNTIL, null, msgs);
			if (newValidUntil != null)
				msgs = ((InternalEObject)newValidUntil).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DOCUMENT_INFORMATION__VALID_UNTIL, null, msgs);
			msgs = basicSetValidUntil(newValidUntil, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DOCUMENT_INFORMATION__VALID_UNTIL, newValidUntil, newValidUntil));
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
		confidentiality = newConfidentiality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DOCUMENT_INFORMATION__CONFIDENTIALITY, oldConfidentiality, confidentiality));
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
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DOCUMENT_INFORMATION__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_DOCUMENT_INFORMATION__DOCUMENT_REFERENCES:
				return basicSetDocumentReferences(null, msgs);
			case FinalPackage.IFC_DOCUMENT_INFORMATION__DOCUMENT_OWNER:
				return basicSetDocumentOwner(null, msgs);
			case FinalPackage.IFC_DOCUMENT_INFORMATION__EDITORS:
				return basicSetEditors(null, msgs);
			case FinalPackage.IFC_DOCUMENT_INFORMATION__CREATION_TIME:
				return basicSetCreationTime(null, msgs);
			case FinalPackage.IFC_DOCUMENT_INFORMATION__LAST_REVISION_TIME:
				return basicSetLastRevisionTime(null, msgs);
			case FinalPackage.IFC_DOCUMENT_INFORMATION__ELECTRONIC_FORMAT:
				return basicSetElectronicFormat(null, msgs);
			case FinalPackage.IFC_DOCUMENT_INFORMATION__VALID_FROM:
				return basicSetValidFrom(null, msgs);
			case FinalPackage.IFC_DOCUMENT_INFORMATION__VALID_UNTIL:
				return basicSetValidUntil(null, msgs);
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
			case FinalPackage.IFC_DOCUMENT_INFORMATION__DOCUMENT_ID:
				return getDocumentId();
			case FinalPackage.IFC_DOCUMENT_INFORMATION__NAME:
				return getName();
			case FinalPackage.IFC_DOCUMENT_INFORMATION__DESCRIPTION:
				return getDescription();
			case FinalPackage.IFC_DOCUMENT_INFORMATION__DOCUMENT_REFERENCES:
				return getDocumentReferences();
			case FinalPackage.IFC_DOCUMENT_INFORMATION__PURPOSE:
				return getPurpose();
			case FinalPackage.IFC_DOCUMENT_INFORMATION__INTENDED_USE:
				return getIntendedUse();
			case FinalPackage.IFC_DOCUMENT_INFORMATION__SCOPE:
				return getScope();
			case FinalPackage.IFC_DOCUMENT_INFORMATION__REVISION:
				return getRevision();
			case FinalPackage.IFC_DOCUMENT_INFORMATION__DOCUMENT_OWNER:
				return getDocumentOwner();
			case FinalPackage.IFC_DOCUMENT_INFORMATION__EDITORS:
				return getEditors();
			case FinalPackage.IFC_DOCUMENT_INFORMATION__CREATION_TIME:
				return getCreationTime();
			case FinalPackage.IFC_DOCUMENT_INFORMATION__LAST_REVISION_TIME:
				return getLastRevisionTime();
			case FinalPackage.IFC_DOCUMENT_INFORMATION__ELECTRONIC_FORMAT:
				return getElectronicFormat();
			case FinalPackage.IFC_DOCUMENT_INFORMATION__VALID_FROM:
				return getValidFrom();
			case FinalPackage.IFC_DOCUMENT_INFORMATION__VALID_UNTIL:
				return getValidUntil();
			case FinalPackage.IFC_DOCUMENT_INFORMATION__CONFIDENTIALITY:
				return getConfidentiality();
			case FinalPackage.IFC_DOCUMENT_INFORMATION__STATUS:
				return getStatus();
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
			case FinalPackage.IFC_DOCUMENT_INFORMATION__DOCUMENT_ID:
				setDocumentId((String)newValue);
				return;
			case FinalPackage.IFC_DOCUMENT_INFORMATION__NAME:
				setName((String)newValue);
				return;
			case FinalPackage.IFC_DOCUMENT_INFORMATION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case FinalPackage.IFC_DOCUMENT_INFORMATION__DOCUMENT_REFERENCES:
				setDocumentReferences((DocumentReferencesType)newValue);
				return;
			case FinalPackage.IFC_DOCUMENT_INFORMATION__PURPOSE:
				setPurpose((String)newValue);
				return;
			case FinalPackage.IFC_DOCUMENT_INFORMATION__INTENDED_USE:
				setIntendedUse((String)newValue);
				return;
			case FinalPackage.IFC_DOCUMENT_INFORMATION__SCOPE:
				setScope((String)newValue);
				return;
			case FinalPackage.IFC_DOCUMENT_INFORMATION__REVISION:
				setRevision((String)newValue);
				return;
			case FinalPackage.IFC_DOCUMENT_INFORMATION__DOCUMENT_OWNER:
				setDocumentOwner((DocumentOwnerType)newValue);
				return;
			case FinalPackage.IFC_DOCUMENT_INFORMATION__EDITORS:
				setEditors((EditorsType)newValue);
				return;
			case FinalPackage.IFC_DOCUMENT_INFORMATION__CREATION_TIME:
				setCreationTime((CreationTimeType)newValue);
				return;
			case FinalPackage.IFC_DOCUMENT_INFORMATION__LAST_REVISION_TIME:
				setLastRevisionTime((LastRevisionTimeType)newValue);
				return;
			case FinalPackage.IFC_DOCUMENT_INFORMATION__ELECTRONIC_FORMAT:
				setElectronicFormat((ElectronicFormatType)newValue);
				return;
			case FinalPackage.IFC_DOCUMENT_INFORMATION__VALID_FROM:
				setValidFrom((ValidFromType)newValue);
				return;
			case FinalPackage.IFC_DOCUMENT_INFORMATION__VALID_UNTIL:
				setValidUntil((ValidUntilType)newValue);
				return;
			case FinalPackage.IFC_DOCUMENT_INFORMATION__CONFIDENTIALITY:
				setConfidentiality((IfcDocumentConfidentialityEnum)newValue);
				return;
			case FinalPackage.IFC_DOCUMENT_INFORMATION__STATUS:
				setStatus((IfcDocumentStatusEnum)newValue);
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
			case FinalPackage.IFC_DOCUMENT_INFORMATION__DOCUMENT_ID:
				setDocumentId(DOCUMENT_ID_EDEFAULT);
				return;
			case FinalPackage.IFC_DOCUMENT_INFORMATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FinalPackage.IFC_DOCUMENT_INFORMATION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case FinalPackage.IFC_DOCUMENT_INFORMATION__DOCUMENT_REFERENCES:
				setDocumentReferences((DocumentReferencesType)null);
				return;
			case FinalPackage.IFC_DOCUMENT_INFORMATION__PURPOSE:
				setPurpose(PURPOSE_EDEFAULT);
				return;
			case FinalPackage.IFC_DOCUMENT_INFORMATION__INTENDED_USE:
				setIntendedUse(INTENDED_USE_EDEFAULT);
				return;
			case FinalPackage.IFC_DOCUMENT_INFORMATION__SCOPE:
				setScope(SCOPE_EDEFAULT);
				return;
			case FinalPackage.IFC_DOCUMENT_INFORMATION__REVISION:
				setRevision(REVISION_EDEFAULT);
				return;
			case FinalPackage.IFC_DOCUMENT_INFORMATION__DOCUMENT_OWNER:
				setDocumentOwner((DocumentOwnerType)null);
				return;
			case FinalPackage.IFC_DOCUMENT_INFORMATION__EDITORS:
				setEditors((EditorsType)null);
				return;
			case FinalPackage.IFC_DOCUMENT_INFORMATION__CREATION_TIME:
				setCreationTime((CreationTimeType)null);
				return;
			case FinalPackage.IFC_DOCUMENT_INFORMATION__LAST_REVISION_TIME:
				setLastRevisionTime((LastRevisionTimeType)null);
				return;
			case FinalPackage.IFC_DOCUMENT_INFORMATION__ELECTRONIC_FORMAT:
				setElectronicFormat((ElectronicFormatType)null);
				return;
			case FinalPackage.IFC_DOCUMENT_INFORMATION__VALID_FROM:
				setValidFrom((ValidFromType)null);
				return;
			case FinalPackage.IFC_DOCUMENT_INFORMATION__VALID_UNTIL:
				setValidUntil((ValidUntilType)null);
				return;
			case FinalPackage.IFC_DOCUMENT_INFORMATION__CONFIDENTIALITY:
				setConfidentiality(CONFIDENTIALITY_EDEFAULT);
				return;
			case FinalPackage.IFC_DOCUMENT_INFORMATION__STATUS:
				setStatus(STATUS_EDEFAULT);
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
			case FinalPackage.IFC_DOCUMENT_INFORMATION__DOCUMENT_ID:
				return DOCUMENT_ID_EDEFAULT == null ? documentId != null : !DOCUMENT_ID_EDEFAULT.equals(documentId);
			case FinalPackage.IFC_DOCUMENT_INFORMATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FinalPackage.IFC_DOCUMENT_INFORMATION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case FinalPackage.IFC_DOCUMENT_INFORMATION__DOCUMENT_REFERENCES:
				return documentReferences != null;
			case FinalPackage.IFC_DOCUMENT_INFORMATION__PURPOSE:
				return PURPOSE_EDEFAULT == null ? purpose != null : !PURPOSE_EDEFAULT.equals(purpose);
			case FinalPackage.IFC_DOCUMENT_INFORMATION__INTENDED_USE:
				return INTENDED_USE_EDEFAULT == null ? intendedUse != null : !INTENDED_USE_EDEFAULT.equals(intendedUse);
			case FinalPackage.IFC_DOCUMENT_INFORMATION__SCOPE:
				return SCOPE_EDEFAULT == null ? scope != null : !SCOPE_EDEFAULT.equals(scope);
			case FinalPackage.IFC_DOCUMENT_INFORMATION__REVISION:
				return REVISION_EDEFAULT == null ? revision != null : !REVISION_EDEFAULT.equals(revision);
			case FinalPackage.IFC_DOCUMENT_INFORMATION__DOCUMENT_OWNER:
				return documentOwner != null;
			case FinalPackage.IFC_DOCUMENT_INFORMATION__EDITORS:
				return editors != null;
			case FinalPackage.IFC_DOCUMENT_INFORMATION__CREATION_TIME:
				return creationTime != null;
			case FinalPackage.IFC_DOCUMENT_INFORMATION__LAST_REVISION_TIME:
				return lastRevisionTime != null;
			case FinalPackage.IFC_DOCUMENT_INFORMATION__ELECTRONIC_FORMAT:
				return electronicFormat != null;
			case FinalPackage.IFC_DOCUMENT_INFORMATION__VALID_FROM:
				return validFrom != null;
			case FinalPackage.IFC_DOCUMENT_INFORMATION__VALID_UNTIL:
				return validUntil != null;
			case FinalPackage.IFC_DOCUMENT_INFORMATION__CONFIDENTIALITY:
				return CONFIDENTIALITY_EDEFAULT == null ? confidentiality != null : !CONFIDENTIALITY_EDEFAULT.equals(confidentiality);
			case FinalPackage.IFC_DOCUMENT_INFORMATION__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
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
		result.append(" (documentId: ");
		result.append(documentId);
		result.append(", name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", purpose: ");
		result.append(purpose);
		result.append(", intendedUse: ");
		result.append(intendedUse);
		result.append(", scope: ");
		result.append(scope);
		result.append(", revision: ");
		result.append(revision);
		result.append(", confidentiality: ");
		result.append(confidentiality);
		result.append(", status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //IfcDocumentInformationImpl
