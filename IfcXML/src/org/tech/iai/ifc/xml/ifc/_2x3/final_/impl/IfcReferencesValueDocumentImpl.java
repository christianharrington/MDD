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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcReferencesValueDocument;
import org.tech.iai.ifc.xml.ifc._2x3.final_.ReferencedDocumentType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.ReferencingValuesType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc References Value Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcReferencesValueDocumentImpl#getReferencedDocument <em>Referenced Document</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcReferencesValueDocumentImpl#getReferencingValues <em>Referencing Values</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcReferencesValueDocumentImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcReferencesValueDocumentImpl#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcReferencesValueDocumentImpl extends EntityImpl implements IfcReferencesValueDocument {
	/**
	 * The cached value of the '{@link #getReferencedDocument() <em>Referenced Document</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedDocument()
	 * @generated
	 * @ordered
	 */
	protected ReferencedDocumentType referencedDocument;

	/**
	 * The cached value of the '{@link #getReferencingValues() <em>Referencing Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencingValues()
	 * @generated
	 * @ordered
	 */
	protected ReferencingValuesType referencingValues;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcReferencesValueDocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcReferencesValueDocument();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferencedDocumentType getReferencedDocument() {
		return referencedDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferencedDocument(ReferencedDocumentType newReferencedDocument, NotificationChain msgs) {
		ReferencedDocumentType oldReferencedDocument = referencedDocument;
		referencedDocument = newReferencedDocument;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REFERENCES_VALUE_DOCUMENT__REFERENCED_DOCUMENT, oldReferencedDocument, newReferencedDocument);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedDocument(ReferencedDocumentType newReferencedDocument) {
		if (newReferencedDocument != referencedDocument) {
			NotificationChain msgs = null;
			if (referencedDocument != null)
				msgs = ((InternalEObject)referencedDocument).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REFERENCES_VALUE_DOCUMENT__REFERENCED_DOCUMENT, null, msgs);
			if (newReferencedDocument != null)
				msgs = ((InternalEObject)newReferencedDocument).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REFERENCES_VALUE_DOCUMENT__REFERENCED_DOCUMENT, null, msgs);
			msgs = basicSetReferencedDocument(newReferencedDocument, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REFERENCES_VALUE_DOCUMENT__REFERENCED_DOCUMENT, newReferencedDocument, newReferencedDocument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferencingValuesType getReferencingValues() {
		return referencingValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferencingValues(ReferencingValuesType newReferencingValues, NotificationChain msgs) {
		ReferencingValuesType oldReferencingValues = referencingValues;
		referencingValues = newReferencingValues;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REFERENCES_VALUE_DOCUMENT__REFERENCING_VALUES, oldReferencingValues, newReferencingValues);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencingValues(ReferencingValuesType newReferencingValues) {
		if (newReferencingValues != referencingValues) {
			NotificationChain msgs = null;
			if (referencingValues != null)
				msgs = ((InternalEObject)referencingValues).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REFERENCES_VALUE_DOCUMENT__REFERENCING_VALUES, null, msgs);
			if (newReferencingValues != null)
				msgs = ((InternalEObject)newReferencingValues).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REFERENCES_VALUE_DOCUMENT__REFERENCING_VALUES, null, msgs);
			msgs = basicSetReferencingValues(newReferencingValues, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REFERENCES_VALUE_DOCUMENT__REFERENCING_VALUES, newReferencingValues, newReferencingValues));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REFERENCES_VALUE_DOCUMENT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REFERENCES_VALUE_DOCUMENT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_REFERENCES_VALUE_DOCUMENT__REFERENCED_DOCUMENT:
				return basicSetReferencedDocument(null, msgs);
			case FinalPackage.IFC_REFERENCES_VALUE_DOCUMENT__REFERENCING_VALUES:
				return basicSetReferencingValues(null, msgs);
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
			case FinalPackage.IFC_REFERENCES_VALUE_DOCUMENT__REFERENCED_DOCUMENT:
				return getReferencedDocument();
			case FinalPackage.IFC_REFERENCES_VALUE_DOCUMENT__REFERENCING_VALUES:
				return getReferencingValues();
			case FinalPackage.IFC_REFERENCES_VALUE_DOCUMENT__NAME:
				return getName();
			case FinalPackage.IFC_REFERENCES_VALUE_DOCUMENT__DESCRIPTION:
				return getDescription();
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
			case FinalPackage.IFC_REFERENCES_VALUE_DOCUMENT__REFERENCED_DOCUMENT:
				setReferencedDocument((ReferencedDocumentType)newValue);
				return;
			case FinalPackage.IFC_REFERENCES_VALUE_DOCUMENT__REFERENCING_VALUES:
				setReferencingValues((ReferencingValuesType)newValue);
				return;
			case FinalPackage.IFC_REFERENCES_VALUE_DOCUMENT__NAME:
				setName((String)newValue);
				return;
			case FinalPackage.IFC_REFERENCES_VALUE_DOCUMENT__DESCRIPTION:
				setDescription((String)newValue);
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
			case FinalPackage.IFC_REFERENCES_VALUE_DOCUMENT__REFERENCED_DOCUMENT:
				setReferencedDocument((ReferencedDocumentType)null);
				return;
			case FinalPackage.IFC_REFERENCES_VALUE_DOCUMENT__REFERENCING_VALUES:
				setReferencingValues((ReferencingValuesType)null);
				return;
			case FinalPackage.IFC_REFERENCES_VALUE_DOCUMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FinalPackage.IFC_REFERENCES_VALUE_DOCUMENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case FinalPackage.IFC_REFERENCES_VALUE_DOCUMENT__REFERENCED_DOCUMENT:
				return referencedDocument != null;
			case FinalPackage.IFC_REFERENCES_VALUE_DOCUMENT__REFERENCING_VALUES:
				return referencingValues != null;
			case FinalPackage.IFC_REFERENCES_VALUE_DOCUMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FinalPackage.IFC_REFERENCES_VALUE_DOCUMENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //IfcReferencesValueDocumentImpl
