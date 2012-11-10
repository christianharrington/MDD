/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcAppliedValue;
import ifc2x3tc1.IfcDocumentSelect;
import ifc2x3tc1.IfcReferencesValueDocument;

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
 * An implementation of the model object '<em><b>Ifc References Value Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcReferencesValueDocumentImpl#getReferencedDocument <em>Referenced Document</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcReferencesValueDocumentImpl#getReferencingValues <em>Referencing Values</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcReferencesValueDocumentImpl#getName <em>Name</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcReferencesValueDocumentImpl#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcReferencesValueDocumentImpl extends EObjectImpl implements IfcReferencesValueDocument {
	/**
	 * The cached value of the '{@link #getReferencedDocument() <em>Referenced Document</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedDocument()
	 * @generated
	 * @ordered
	 */
	protected IfcDocumentSelect referencedDocument;

	/**
	 * The cached value of the '{@link #getReferencingValues() <em>Referencing Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencingValues()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcAppliedValue> referencingValues;

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
	 * This is true if the Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nameESet;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcReferencesValueDocument();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDocumentSelect getReferencedDocument() {
		if (referencedDocument != null && referencedDocument.eIsProxy()) {
			InternalEObject oldReferencedDocument = (InternalEObject)referencedDocument;
			referencedDocument = (IfcDocumentSelect)eResolveProxy(oldReferencedDocument);
			if (referencedDocument != oldReferencedDocument) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_REFERENCES_VALUE_DOCUMENT__REFERENCED_DOCUMENT, oldReferencedDocument, referencedDocument));
			}
		}
		return referencedDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDocumentSelect basicGetReferencedDocument() {
		return referencedDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedDocument(IfcDocumentSelect newReferencedDocument) {
		IfcDocumentSelect oldReferencedDocument = referencedDocument;
		referencedDocument = newReferencedDocument;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REFERENCES_VALUE_DOCUMENT__REFERENCED_DOCUMENT, oldReferencedDocument, referencedDocument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcAppliedValue> getReferencingValues() {
		if (referencingValues == null) {
			referencingValues = new EObjectWithInverseResolvingEList.ManyInverse<IfcAppliedValue>(IfcAppliedValue.class, this, Ifc2x3tc1Package.IFC_REFERENCES_VALUE_DOCUMENT__REFERENCING_VALUES, Ifc2x3tc1Package.IFC_APPLIED_VALUE__VALUES_REFERENCED);
		}
		return referencingValues;
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
		boolean oldNameESet = nameESet;
		nameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REFERENCES_VALUE_DOCUMENT__NAME, oldName, name, !oldNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetName() {
		String oldName = name;
		boolean oldNameESet = nameESet;
		name = NAME_EDEFAULT;
		nameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_REFERENCES_VALUE_DOCUMENT__NAME, oldName, NAME_EDEFAULT, oldNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetName() {
		return nameESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REFERENCES_VALUE_DOCUMENT__DESCRIPTION, oldDescription, description, !oldDescriptionESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_REFERENCES_VALUE_DOCUMENT__DESCRIPTION, oldDescription, DESCRIPTION_EDEFAULT, oldDescriptionESet));
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_REFERENCES_VALUE_DOCUMENT__REFERENCING_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferencingValues()).basicAdd(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_REFERENCES_VALUE_DOCUMENT__REFERENCING_VALUES:
				return ((InternalEList<?>)getReferencingValues()).basicRemove(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_REFERENCES_VALUE_DOCUMENT__REFERENCED_DOCUMENT:
				if (resolve) return getReferencedDocument();
				return basicGetReferencedDocument();
			case Ifc2x3tc1Package.IFC_REFERENCES_VALUE_DOCUMENT__REFERENCING_VALUES:
				return getReferencingValues();
			case Ifc2x3tc1Package.IFC_REFERENCES_VALUE_DOCUMENT__NAME:
				return getName();
			case Ifc2x3tc1Package.IFC_REFERENCES_VALUE_DOCUMENT__DESCRIPTION:
				return getDescription();
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
			case Ifc2x3tc1Package.IFC_REFERENCES_VALUE_DOCUMENT__REFERENCED_DOCUMENT:
				setReferencedDocument((IfcDocumentSelect)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REFERENCES_VALUE_DOCUMENT__REFERENCING_VALUES:
				getReferencingValues().clear();
				getReferencingValues().addAll((Collection<? extends IfcAppliedValue>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REFERENCES_VALUE_DOCUMENT__NAME:
				setName((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REFERENCES_VALUE_DOCUMENT__DESCRIPTION:
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
			case Ifc2x3tc1Package.IFC_REFERENCES_VALUE_DOCUMENT__REFERENCED_DOCUMENT:
				setReferencedDocument((IfcDocumentSelect)null);
				return;
			case Ifc2x3tc1Package.IFC_REFERENCES_VALUE_DOCUMENT__REFERENCING_VALUES:
				getReferencingValues().clear();
				return;
			case Ifc2x3tc1Package.IFC_REFERENCES_VALUE_DOCUMENT__NAME:
				unsetName();
				return;
			case Ifc2x3tc1Package.IFC_REFERENCES_VALUE_DOCUMENT__DESCRIPTION:
				unsetDescription();
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
			case Ifc2x3tc1Package.IFC_REFERENCES_VALUE_DOCUMENT__REFERENCED_DOCUMENT:
				return referencedDocument != null;
			case Ifc2x3tc1Package.IFC_REFERENCES_VALUE_DOCUMENT__REFERENCING_VALUES:
				return referencingValues != null && !referencingValues.isEmpty();
			case Ifc2x3tc1Package.IFC_REFERENCES_VALUE_DOCUMENT__NAME:
				return isSetName();
			case Ifc2x3tc1Package.IFC_REFERENCES_VALUE_DOCUMENT__DESCRIPTION:
				return isSetDescription();
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
		result.append(" (Name: ");
		if (nameESet) result.append(name); else result.append("<unset>");
		result.append(", Description: ");
		if (descriptionESet) result.append(description); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcReferencesValueDocumentImpl
