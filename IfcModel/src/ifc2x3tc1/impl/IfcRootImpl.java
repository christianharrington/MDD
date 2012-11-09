/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcGloballyUniqueId;
import ifc2x3tc1.IfcOwnerHistory;
import ifc2x3tc1.IfcRoot;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcRootImpl#getGlobalId <em>Global Id</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRootImpl#getOwnerHistory <em>Owner History</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRootImpl#getName <em>Name</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRootImpl#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRootImpl extends EObjectImpl implements IfcRoot {
	/**
	 * The cached value of the '{@link #getGlobalId() <em>Global Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalId()
	 * @generated
	 * @ordered
	 */
	protected IfcGloballyUniqueId globalId;

	/**
	 * The cached value of the '{@link #getOwnerHistory() <em>Owner History</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnerHistory()
	 * @generated
	 * @ordered
	 */
	protected IfcOwnerHistory ownerHistory;

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
	protected IfcRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcRoot();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcGloballyUniqueId getGlobalId() {
		if (globalId != null && globalId.eIsProxy()) {
			InternalEObject oldGlobalId = (InternalEObject)globalId;
			globalId = (IfcGloballyUniqueId)eResolveProxy(oldGlobalId);
			if (globalId != oldGlobalId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_ROOT__GLOBAL_ID, oldGlobalId, globalId));
			}
		}
		return globalId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcGloballyUniqueId basicGetGlobalId() {
		return globalId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlobalId(IfcGloballyUniqueId newGlobalId, NotificationChain msgs) {
		IfcGloballyUniqueId oldGlobalId = globalId;
		globalId = newGlobalId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ROOT__GLOBAL_ID, oldGlobalId, newGlobalId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobalId(IfcGloballyUniqueId newGlobalId) {
		if (newGlobalId != globalId) {
			NotificationChain msgs = null;
			if (globalId != null)
				msgs = ((InternalEObject)globalId).eInverseRemove(this, Ifc2x3tc1Package.IFC_GLOBALLY_UNIQUE_ID__IFC_ROOT, IfcGloballyUniqueId.class, msgs);
			if (newGlobalId != null)
				msgs = ((InternalEObject)newGlobalId).eInverseAdd(this, Ifc2x3tc1Package.IFC_GLOBALLY_UNIQUE_ID__IFC_ROOT, IfcGloballyUniqueId.class, msgs);
			msgs = basicSetGlobalId(newGlobalId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ROOT__GLOBAL_ID, newGlobalId, newGlobalId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcOwnerHistory getOwnerHistory() {
		if (ownerHistory != null && ownerHistory.eIsProxy()) {
			InternalEObject oldOwnerHistory = (InternalEObject)ownerHistory;
			ownerHistory = (IfcOwnerHistory)eResolveProxy(oldOwnerHistory);
			if (ownerHistory != oldOwnerHistory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_ROOT__OWNER_HISTORY, oldOwnerHistory, ownerHistory));
			}
		}
		return ownerHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcOwnerHistory basicGetOwnerHistory() {
		return ownerHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnerHistory(IfcOwnerHistory newOwnerHistory) {
		IfcOwnerHistory oldOwnerHistory = ownerHistory;
		ownerHistory = newOwnerHistory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ROOT__OWNER_HISTORY, oldOwnerHistory, ownerHistory));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ROOT__NAME, oldName, name, !oldNameESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_ROOT__NAME, oldName, NAME_EDEFAULT, oldNameESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ROOT__DESCRIPTION, oldDescription, description, !oldDescriptionESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_ROOT__DESCRIPTION, oldDescription, DESCRIPTION_EDEFAULT, oldDescriptionESet));
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
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_ROOT__GLOBAL_ID:
				if (globalId != null)
					msgs = ((InternalEObject)globalId).eInverseRemove(this, Ifc2x3tc1Package.IFC_GLOBALLY_UNIQUE_ID__IFC_ROOT, IfcGloballyUniqueId.class, msgs);
				return basicSetGlobalId((IfcGloballyUniqueId)otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_ROOT__GLOBAL_ID:
				return basicSetGlobalId(null, msgs);
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
			case Ifc2x3tc1Package.IFC_ROOT__GLOBAL_ID:
				if (resolve) return getGlobalId();
				return basicGetGlobalId();
			case Ifc2x3tc1Package.IFC_ROOT__OWNER_HISTORY:
				if (resolve) return getOwnerHistory();
				return basicGetOwnerHistory();
			case Ifc2x3tc1Package.IFC_ROOT__NAME:
				return getName();
			case Ifc2x3tc1Package.IFC_ROOT__DESCRIPTION:
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
			case Ifc2x3tc1Package.IFC_ROOT__GLOBAL_ID:
				setGlobalId((IfcGloballyUniqueId)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ROOT__OWNER_HISTORY:
				setOwnerHistory((IfcOwnerHistory)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ROOT__NAME:
				setName((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ROOT__DESCRIPTION:
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
			case Ifc2x3tc1Package.IFC_ROOT__GLOBAL_ID:
				setGlobalId((IfcGloballyUniqueId)null);
				return;
			case Ifc2x3tc1Package.IFC_ROOT__OWNER_HISTORY:
				setOwnerHistory((IfcOwnerHistory)null);
				return;
			case Ifc2x3tc1Package.IFC_ROOT__NAME:
				unsetName();
				return;
			case Ifc2x3tc1Package.IFC_ROOT__DESCRIPTION:
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
			case Ifc2x3tc1Package.IFC_ROOT__GLOBAL_ID:
				return globalId != null;
			case Ifc2x3tc1Package.IFC_ROOT__OWNER_HISTORY:
				return ownerHistory != null;
			case Ifc2x3tc1Package.IFC_ROOT__NAME:
				return isSetName();
			case Ifc2x3tc1Package.IFC_ROOT__DESCRIPTION:
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

} //IfcRootImpl
