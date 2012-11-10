/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcApplication;
import ifc2x3tc1.IfcChangeActionEnum;
import ifc2x3tc1.IfcOwnerHistory;
import ifc2x3tc1.IfcPersonAndOrganization;
import ifc2x3tc1.IfcStateEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Owner History</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcOwnerHistoryImpl#getOwningUser <em>Owning User</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcOwnerHistoryImpl#getOwningApplication <em>Owning Application</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcOwnerHistoryImpl#getState <em>State</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcOwnerHistoryImpl#getChangeAction <em>Change Action</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcOwnerHistoryImpl#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcOwnerHistoryImpl#getLastModifyingUser <em>Last Modifying User</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcOwnerHistoryImpl#getLastModifyingApplication <em>Last Modifying Application</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcOwnerHistoryImpl#getCreationDate <em>Creation Date</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcOwnerHistoryImpl extends EObjectImpl implements IfcOwnerHistory {
	/**
	 * The cached value of the '{@link #getOwningUser() <em>Owning User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningUser()
	 * @generated
	 * @ordered
	 */
	protected IfcPersonAndOrganization owningUser;

	/**
	 * The cached value of the '{@link #getOwningApplication() <em>Owning Application</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningApplication()
	 * @generated
	 * @ordered
	 */
	protected IfcApplication owningApplication;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final IfcStateEnum STATE_EDEFAULT = IfcStateEnum.NULL;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected IfcStateEnum state = STATE_EDEFAULT;

	/**
	 * This is true if the State attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean stateESet;

	/**
	 * The default value of the '{@link #getChangeAction() <em>Change Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeAction()
	 * @generated
	 * @ordered
	 */
	protected static final IfcChangeActionEnum CHANGE_ACTION_EDEFAULT = IfcChangeActionEnum.NULL;

	/**
	 * The cached value of the '{@link #getChangeAction() <em>Change Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeAction()
	 * @generated
	 * @ordered
	 */
	protected IfcChangeActionEnum changeAction = CHANGE_ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastModifiedDate() <em>Last Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedDate()
	 * @generated
	 * @ordered
	 */
	protected static final int LAST_MODIFIED_DATE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLastModifiedDate() <em>Last Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedDate()
	 * @generated
	 * @ordered
	 */
	protected int lastModifiedDate = LAST_MODIFIED_DATE_EDEFAULT;

	/**
	 * This is true if the Last Modified Date attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lastModifiedDateESet;

	/**
	 * The cached value of the '{@link #getLastModifyingUser() <em>Last Modifying User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifyingUser()
	 * @generated
	 * @ordered
	 */
	protected IfcPersonAndOrganization lastModifyingUser;

	/**
	 * This is true if the Last Modifying User reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lastModifyingUserESet;

	/**
	 * The cached value of the '{@link #getLastModifyingApplication() <em>Last Modifying Application</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifyingApplication()
	 * @generated
	 * @ordered
	 */
	protected IfcApplication lastModifyingApplication;

	/**
	 * This is true if the Last Modifying Application reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lastModifyingApplicationESet;

	/**
	 * The default value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected static final int CREATION_DATE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected int creationDate = CREATION_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcOwnerHistoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcOwnerHistory();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPersonAndOrganization getOwningUser() {
		if (owningUser != null && owningUser.eIsProxy()) {
			InternalEObject oldOwningUser = (InternalEObject)owningUser;
			owningUser = (IfcPersonAndOrganization)eResolveProxy(oldOwningUser);
			if (owningUser != oldOwningUser) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_OWNER_HISTORY__OWNING_USER, oldOwningUser, owningUser));
			}
		}
		return owningUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPersonAndOrganization basicGetOwningUser() {
		return owningUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningUser(IfcPersonAndOrganization newOwningUser) {
		IfcPersonAndOrganization oldOwningUser = owningUser;
		owningUser = newOwningUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_OWNER_HISTORY__OWNING_USER, oldOwningUser, owningUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcApplication getOwningApplication() {
		if (owningApplication != null && owningApplication.eIsProxy()) {
			InternalEObject oldOwningApplication = (InternalEObject)owningApplication;
			owningApplication = (IfcApplication)eResolveProxy(oldOwningApplication);
			if (owningApplication != oldOwningApplication) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_OWNER_HISTORY__OWNING_APPLICATION, oldOwningApplication, owningApplication));
			}
		}
		return owningApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcApplication basicGetOwningApplication() {
		return owningApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningApplication(IfcApplication newOwningApplication) {
		IfcApplication oldOwningApplication = owningApplication;
		owningApplication = newOwningApplication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_OWNER_HISTORY__OWNING_APPLICATION, oldOwningApplication, owningApplication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStateEnum getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(IfcStateEnum newState) {
		IfcStateEnum oldState = state;
		state = newState == null ? STATE_EDEFAULT : newState;
		boolean oldStateESet = stateESet;
		stateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_OWNER_HISTORY__STATE, oldState, state, !oldStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetState() {
		IfcStateEnum oldState = state;
		boolean oldStateESet = stateESet;
		state = STATE_EDEFAULT;
		stateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_OWNER_HISTORY__STATE, oldState, STATE_EDEFAULT, oldStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetState() {
		return stateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcChangeActionEnum getChangeAction() {
		return changeAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeAction(IfcChangeActionEnum newChangeAction) {
		IfcChangeActionEnum oldChangeAction = changeAction;
		changeAction = newChangeAction == null ? CHANGE_ACTION_EDEFAULT : newChangeAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_OWNER_HISTORY__CHANGE_ACTION, oldChangeAction, changeAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLastModifiedDate() {
		return lastModifiedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastModifiedDate(int newLastModifiedDate) {
		int oldLastModifiedDate = lastModifiedDate;
		lastModifiedDate = newLastModifiedDate;
		boolean oldLastModifiedDateESet = lastModifiedDateESet;
		lastModifiedDateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_OWNER_HISTORY__LAST_MODIFIED_DATE, oldLastModifiedDate, lastModifiedDate, !oldLastModifiedDateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLastModifiedDate() {
		int oldLastModifiedDate = lastModifiedDate;
		boolean oldLastModifiedDateESet = lastModifiedDateESet;
		lastModifiedDate = LAST_MODIFIED_DATE_EDEFAULT;
		lastModifiedDateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_OWNER_HISTORY__LAST_MODIFIED_DATE, oldLastModifiedDate, LAST_MODIFIED_DATE_EDEFAULT, oldLastModifiedDateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLastModifiedDate() {
		return lastModifiedDateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPersonAndOrganization getLastModifyingUser() {
		if (lastModifyingUser != null && lastModifyingUser.eIsProxy()) {
			InternalEObject oldLastModifyingUser = (InternalEObject)lastModifyingUser;
			lastModifyingUser = (IfcPersonAndOrganization)eResolveProxy(oldLastModifyingUser);
			if (lastModifyingUser != oldLastModifyingUser) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_OWNER_HISTORY__LAST_MODIFYING_USER, oldLastModifyingUser, lastModifyingUser));
			}
		}
		return lastModifyingUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPersonAndOrganization basicGetLastModifyingUser() {
		return lastModifyingUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastModifyingUser(IfcPersonAndOrganization newLastModifyingUser) {
		IfcPersonAndOrganization oldLastModifyingUser = lastModifyingUser;
		lastModifyingUser = newLastModifyingUser;
		boolean oldLastModifyingUserESet = lastModifyingUserESet;
		lastModifyingUserESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_OWNER_HISTORY__LAST_MODIFYING_USER, oldLastModifyingUser, lastModifyingUser, !oldLastModifyingUserESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLastModifyingUser() {
		IfcPersonAndOrganization oldLastModifyingUser = lastModifyingUser;
		boolean oldLastModifyingUserESet = lastModifyingUserESet;
		lastModifyingUser = null;
		lastModifyingUserESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_OWNER_HISTORY__LAST_MODIFYING_USER, oldLastModifyingUser, null, oldLastModifyingUserESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLastModifyingUser() {
		return lastModifyingUserESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcApplication getLastModifyingApplication() {
		if (lastModifyingApplication != null && lastModifyingApplication.eIsProxy()) {
			InternalEObject oldLastModifyingApplication = (InternalEObject)lastModifyingApplication;
			lastModifyingApplication = (IfcApplication)eResolveProxy(oldLastModifyingApplication);
			if (lastModifyingApplication != oldLastModifyingApplication) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_OWNER_HISTORY__LAST_MODIFYING_APPLICATION, oldLastModifyingApplication, lastModifyingApplication));
			}
		}
		return lastModifyingApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcApplication basicGetLastModifyingApplication() {
		return lastModifyingApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastModifyingApplication(IfcApplication newLastModifyingApplication) {
		IfcApplication oldLastModifyingApplication = lastModifyingApplication;
		lastModifyingApplication = newLastModifyingApplication;
		boolean oldLastModifyingApplicationESet = lastModifyingApplicationESet;
		lastModifyingApplicationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_OWNER_HISTORY__LAST_MODIFYING_APPLICATION, oldLastModifyingApplication, lastModifyingApplication, !oldLastModifyingApplicationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLastModifyingApplication() {
		IfcApplication oldLastModifyingApplication = lastModifyingApplication;
		boolean oldLastModifyingApplicationESet = lastModifyingApplicationESet;
		lastModifyingApplication = null;
		lastModifyingApplicationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_OWNER_HISTORY__LAST_MODIFYING_APPLICATION, oldLastModifyingApplication, null, oldLastModifyingApplicationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLastModifyingApplication() {
		return lastModifyingApplicationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCreationDate() {
		return creationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationDate(int newCreationDate) {
		int oldCreationDate = creationDate;
		creationDate = newCreationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_OWNER_HISTORY__CREATION_DATE, oldCreationDate, creationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_OWNER_HISTORY__OWNING_USER:
				if (resolve) return getOwningUser();
				return basicGetOwningUser();
			case Ifc2x3tc1Package.IFC_OWNER_HISTORY__OWNING_APPLICATION:
				if (resolve) return getOwningApplication();
				return basicGetOwningApplication();
			case Ifc2x3tc1Package.IFC_OWNER_HISTORY__STATE:
				return getState();
			case Ifc2x3tc1Package.IFC_OWNER_HISTORY__CHANGE_ACTION:
				return getChangeAction();
			case Ifc2x3tc1Package.IFC_OWNER_HISTORY__LAST_MODIFIED_DATE:
				return getLastModifiedDate();
			case Ifc2x3tc1Package.IFC_OWNER_HISTORY__LAST_MODIFYING_USER:
				if (resolve) return getLastModifyingUser();
				return basicGetLastModifyingUser();
			case Ifc2x3tc1Package.IFC_OWNER_HISTORY__LAST_MODIFYING_APPLICATION:
				if (resolve) return getLastModifyingApplication();
				return basicGetLastModifyingApplication();
			case Ifc2x3tc1Package.IFC_OWNER_HISTORY__CREATION_DATE:
				return getCreationDate();
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
			case Ifc2x3tc1Package.IFC_OWNER_HISTORY__OWNING_USER:
				setOwningUser((IfcPersonAndOrganization)newValue);
				return;
			case Ifc2x3tc1Package.IFC_OWNER_HISTORY__OWNING_APPLICATION:
				setOwningApplication((IfcApplication)newValue);
				return;
			case Ifc2x3tc1Package.IFC_OWNER_HISTORY__STATE:
				setState((IfcStateEnum)newValue);
				return;
			case Ifc2x3tc1Package.IFC_OWNER_HISTORY__CHANGE_ACTION:
				setChangeAction((IfcChangeActionEnum)newValue);
				return;
			case Ifc2x3tc1Package.IFC_OWNER_HISTORY__LAST_MODIFIED_DATE:
				setLastModifiedDate((Integer)newValue);
				return;
			case Ifc2x3tc1Package.IFC_OWNER_HISTORY__LAST_MODIFYING_USER:
				setLastModifyingUser((IfcPersonAndOrganization)newValue);
				return;
			case Ifc2x3tc1Package.IFC_OWNER_HISTORY__LAST_MODIFYING_APPLICATION:
				setLastModifyingApplication((IfcApplication)newValue);
				return;
			case Ifc2x3tc1Package.IFC_OWNER_HISTORY__CREATION_DATE:
				setCreationDate((Integer)newValue);
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
			case Ifc2x3tc1Package.IFC_OWNER_HISTORY__OWNING_USER:
				setOwningUser((IfcPersonAndOrganization)null);
				return;
			case Ifc2x3tc1Package.IFC_OWNER_HISTORY__OWNING_APPLICATION:
				setOwningApplication((IfcApplication)null);
				return;
			case Ifc2x3tc1Package.IFC_OWNER_HISTORY__STATE:
				unsetState();
				return;
			case Ifc2x3tc1Package.IFC_OWNER_HISTORY__CHANGE_ACTION:
				setChangeAction(CHANGE_ACTION_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_OWNER_HISTORY__LAST_MODIFIED_DATE:
				unsetLastModifiedDate();
				return;
			case Ifc2x3tc1Package.IFC_OWNER_HISTORY__LAST_MODIFYING_USER:
				unsetLastModifyingUser();
				return;
			case Ifc2x3tc1Package.IFC_OWNER_HISTORY__LAST_MODIFYING_APPLICATION:
				unsetLastModifyingApplication();
				return;
			case Ifc2x3tc1Package.IFC_OWNER_HISTORY__CREATION_DATE:
				setCreationDate(CREATION_DATE_EDEFAULT);
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
			case Ifc2x3tc1Package.IFC_OWNER_HISTORY__OWNING_USER:
				return owningUser != null;
			case Ifc2x3tc1Package.IFC_OWNER_HISTORY__OWNING_APPLICATION:
				return owningApplication != null;
			case Ifc2x3tc1Package.IFC_OWNER_HISTORY__STATE:
				return isSetState();
			case Ifc2x3tc1Package.IFC_OWNER_HISTORY__CHANGE_ACTION:
				return changeAction != CHANGE_ACTION_EDEFAULT;
			case Ifc2x3tc1Package.IFC_OWNER_HISTORY__LAST_MODIFIED_DATE:
				return isSetLastModifiedDate();
			case Ifc2x3tc1Package.IFC_OWNER_HISTORY__LAST_MODIFYING_USER:
				return isSetLastModifyingUser();
			case Ifc2x3tc1Package.IFC_OWNER_HISTORY__LAST_MODIFYING_APPLICATION:
				return isSetLastModifyingApplication();
			case Ifc2x3tc1Package.IFC_OWNER_HISTORY__CREATION_DATE:
				return creationDate != CREATION_DATE_EDEFAULT;
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
		result.append(" (State: ");
		if (stateESet) result.append(state); else result.append("<unset>");
		result.append(", ChangeAction: ");
		result.append(changeAction);
		result.append(", LastModifiedDate: ");
		if (lastModifiedDateESet) result.append(lastModifiedDate); else result.append("<unset>");
		result.append(", CreationDate: ");
		result.append(creationDate);
		result.append(')');
		return result.toString();
	}

} //IfcOwnerHistoryImpl
