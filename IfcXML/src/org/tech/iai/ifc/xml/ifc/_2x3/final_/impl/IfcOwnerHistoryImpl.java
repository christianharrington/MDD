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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcChangeActionEnum;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcOwnerHistory;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStateEnum;
import org.tech.iai.ifc.xml.ifc._2x3.final_.LastModifyingApplicationType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.LastModifyingUserType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.OwningApplicationType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.OwningUserType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Owner History</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcOwnerHistoryImpl#getOwningUser <em>Owning User</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcOwnerHistoryImpl#getOwningApplication <em>Owning Application</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcOwnerHistoryImpl#getState <em>State</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcOwnerHistoryImpl#getChangeAction <em>Change Action</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcOwnerHistoryImpl#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcOwnerHistoryImpl#getLastModifyingUser <em>Last Modifying User</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcOwnerHistoryImpl#getLastModifyingApplication <em>Last Modifying Application</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcOwnerHistoryImpl#getCreationDate <em>Creation Date</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcOwnerHistoryImpl extends EntityImpl implements IfcOwnerHistory {
	/**
	 * The cached value of the '{@link #getOwningUser() <em>Owning User</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningUser()
	 * @generated
	 * @ordered
	 */
	protected OwningUserType owningUser;

	/**
	 * The cached value of the '{@link #getOwningApplication() <em>Owning Application</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningApplication()
	 * @generated
	 * @ordered
	 */
	protected OwningApplicationType owningApplication;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final IfcStateEnum STATE_EDEFAULT = null;

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
	 * The default value of the '{@link #getChangeAction() <em>Change Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeAction()
	 * @generated
	 * @ordered
	 */
	protected static final IfcChangeActionEnum CHANGE_ACTION_EDEFAULT = IfcChangeActionEnum.NOCHANGE;

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
	protected static final Long LAST_MODIFIED_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastModifiedDate() <em>Last Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedDate()
	 * @generated
	 * @ordered
	 */
	protected Long lastModifiedDate = LAST_MODIFIED_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLastModifyingUser() <em>Last Modifying User</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifyingUser()
	 * @generated
	 * @ordered
	 */
	protected LastModifyingUserType lastModifyingUser;

	/**
	 * The cached value of the '{@link #getLastModifyingApplication() <em>Last Modifying Application</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifyingApplication()
	 * @generated
	 * @ordered
	 */
	protected LastModifyingApplicationType lastModifyingApplication;

	/**
	 * The default value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected static final long CREATION_DATE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected long creationDate = CREATION_DATE_EDEFAULT;

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
		return FinalPackage.eINSTANCE.getIfcOwnerHistory();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwningUserType getOwningUser() {
		return owningUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningUser(OwningUserType newOwningUser, NotificationChain msgs) {
		OwningUserType oldOwningUser = owningUser;
		owningUser = newOwningUser;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_OWNER_HISTORY__OWNING_USER, oldOwningUser, newOwningUser);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningUser(OwningUserType newOwningUser) {
		if (newOwningUser != owningUser) {
			NotificationChain msgs = null;
			if (owningUser != null)
				msgs = ((InternalEObject)owningUser).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_OWNER_HISTORY__OWNING_USER, null, msgs);
			if (newOwningUser != null)
				msgs = ((InternalEObject)newOwningUser).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_OWNER_HISTORY__OWNING_USER, null, msgs);
			msgs = basicSetOwningUser(newOwningUser, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_OWNER_HISTORY__OWNING_USER, newOwningUser, newOwningUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwningApplicationType getOwningApplication() {
		return owningApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningApplication(OwningApplicationType newOwningApplication, NotificationChain msgs) {
		OwningApplicationType oldOwningApplication = owningApplication;
		owningApplication = newOwningApplication;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_OWNER_HISTORY__OWNING_APPLICATION, oldOwningApplication, newOwningApplication);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningApplication(OwningApplicationType newOwningApplication) {
		if (newOwningApplication != owningApplication) {
			NotificationChain msgs = null;
			if (owningApplication != null)
				msgs = ((InternalEObject)owningApplication).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_OWNER_HISTORY__OWNING_APPLICATION, null, msgs);
			if (newOwningApplication != null)
				msgs = ((InternalEObject)newOwningApplication).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_OWNER_HISTORY__OWNING_APPLICATION, null, msgs);
			msgs = basicSetOwningApplication(newOwningApplication, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_OWNER_HISTORY__OWNING_APPLICATION, newOwningApplication, newOwningApplication));
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
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_OWNER_HISTORY__STATE, oldState, state));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_OWNER_HISTORY__CHANGE_ACTION, oldChangeAction, changeAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getLastModifiedDate() {
		return lastModifiedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastModifiedDate(Long newLastModifiedDate) {
		Long oldLastModifiedDate = lastModifiedDate;
		lastModifiedDate = newLastModifiedDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_OWNER_HISTORY__LAST_MODIFIED_DATE, oldLastModifiedDate, lastModifiedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LastModifyingUserType getLastModifyingUser() {
		return lastModifyingUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLastModifyingUser(LastModifyingUserType newLastModifyingUser, NotificationChain msgs) {
		LastModifyingUserType oldLastModifyingUser = lastModifyingUser;
		lastModifyingUser = newLastModifyingUser;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_OWNER_HISTORY__LAST_MODIFYING_USER, oldLastModifyingUser, newLastModifyingUser);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastModifyingUser(LastModifyingUserType newLastModifyingUser) {
		if (newLastModifyingUser != lastModifyingUser) {
			NotificationChain msgs = null;
			if (lastModifyingUser != null)
				msgs = ((InternalEObject)lastModifyingUser).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_OWNER_HISTORY__LAST_MODIFYING_USER, null, msgs);
			if (newLastModifyingUser != null)
				msgs = ((InternalEObject)newLastModifyingUser).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_OWNER_HISTORY__LAST_MODIFYING_USER, null, msgs);
			msgs = basicSetLastModifyingUser(newLastModifyingUser, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_OWNER_HISTORY__LAST_MODIFYING_USER, newLastModifyingUser, newLastModifyingUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LastModifyingApplicationType getLastModifyingApplication() {
		return lastModifyingApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLastModifyingApplication(LastModifyingApplicationType newLastModifyingApplication, NotificationChain msgs) {
		LastModifyingApplicationType oldLastModifyingApplication = lastModifyingApplication;
		lastModifyingApplication = newLastModifyingApplication;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_OWNER_HISTORY__LAST_MODIFYING_APPLICATION, oldLastModifyingApplication, newLastModifyingApplication);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastModifyingApplication(LastModifyingApplicationType newLastModifyingApplication) {
		if (newLastModifyingApplication != lastModifyingApplication) {
			NotificationChain msgs = null;
			if (lastModifyingApplication != null)
				msgs = ((InternalEObject)lastModifyingApplication).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_OWNER_HISTORY__LAST_MODIFYING_APPLICATION, null, msgs);
			if (newLastModifyingApplication != null)
				msgs = ((InternalEObject)newLastModifyingApplication).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_OWNER_HISTORY__LAST_MODIFYING_APPLICATION, null, msgs);
			msgs = basicSetLastModifyingApplication(newLastModifyingApplication, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_OWNER_HISTORY__LAST_MODIFYING_APPLICATION, newLastModifyingApplication, newLastModifyingApplication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getCreationDate() {
		return creationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationDate(long newCreationDate) {
		long oldCreationDate = creationDate;
		creationDate = newCreationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_OWNER_HISTORY__CREATION_DATE, oldCreationDate, creationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_OWNER_HISTORY__OWNING_USER:
				return basicSetOwningUser(null, msgs);
			case FinalPackage.IFC_OWNER_HISTORY__OWNING_APPLICATION:
				return basicSetOwningApplication(null, msgs);
			case FinalPackage.IFC_OWNER_HISTORY__LAST_MODIFYING_USER:
				return basicSetLastModifyingUser(null, msgs);
			case FinalPackage.IFC_OWNER_HISTORY__LAST_MODIFYING_APPLICATION:
				return basicSetLastModifyingApplication(null, msgs);
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
			case FinalPackage.IFC_OWNER_HISTORY__OWNING_USER:
				return getOwningUser();
			case FinalPackage.IFC_OWNER_HISTORY__OWNING_APPLICATION:
				return getOwningApplication();
			case FinalPackage.IFC_OWNER_HISTORY__STATE:
				return getState();
			case FinalPackage.IFC_OWNER_HISTORY__CHANGE_ACTION:
				return getChangeAction();
			case FinalPackage.IFC_OWNER_HISTORY__LAST_MODIFIED_DATE:
				return getLastModifiedDate();
			case FinalPackage.IFC_OWNER_HISTORY__LAST_MODIFYING_USER:
				return getLastModifyingUser();
			case FinalPackage.IFC_OWNER_HISTORY__LAST_MODIFYING_APPLICATION:
				return getLastModifyingApplication();
			case FinalPackage.IFC_OWNER_HISTORY__CREATION_DATE:
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
			case FinalPackage.IFC_OWNER_HISTORY__OWNING_USER:
				setOwningUser((OwningUserType)newValue);
				return;
			case FinalPackage.IFC_OWNER_HISTORY__OWNING_APPLICATION:
				setOwningApplication((OwningApplicationType)newValue);
				return;
			case FinalPackage.IFC_OWNER_HISTORY__STATE:
				setState((IfcStateEnum)newValue);
				return;
			case FinalPackage.IFC_OWNER_HISTORY__CHANGE_ACTION:
				setChangeAction((IfcChangeActionEnum)newValue);
				return;
			case FinalPackage.IFC_OWNER_HISTORY__LAST_MODIFIED_DATE:
				setLastModifiedDate((Long)newValue);
				return;
			case FinalPackage.IFC_OWNER_HISTORY__LAST_MODIFYING_USER:
				setLastModifyingUser((LastModifyingUserType)newValue);
				return;
			case FinalPackage.IFC_OWNER_HISTORY__LAST_MODIFYING_APPLICATION:
				setLastModifyingApplication((LastModifyingApplicationType)newValue);
				return;
			case FinalPackage.IFC_OWNER_HISTORY__CREATION_DATE:
				setCreationDate((Long)newValue);
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
			case FinalPackage.IFC_OWNER_HISTORY__OWNING_USER:
				setOwningUser((OwningUserType)null);
				return;
			case FinalPackage.IFC_OWNER_HISTORY__OWNING_APPLICATION:
				setOwningApplication((OwningApplicationType)null);
				return;
			case FinalPackage.IFC_OWNER_HISTORY__STATE:
				setState(STATE_EDEFAULT);
				return;
			case FinalPackage.IFC_OWNER_HISTORY__CHANGE_ACTION:
				setChangeAction(CHANGE_ACTION_EDEFAULT);
				return;
			case FinalPackage.IFC_OWNER_HISTORY__LAST_MODIFIED_DATE:
				setLastModifiedDate(LAST_MODIFIED_DATE_EDEFAULT);
				return;
			case FinalPackage.IFC_OWNER_HISTORY__LAST_MODIFYING_USER:
				setLastModifyingUser((LastModifyingUserType)null);
				return;
			case FinalPackage.IFC_OWNER_HISTORY__LAST_MODIFYING_APPLICATION:
				setLastModifyingApplication((LastModifyingApplicationType)null);
				return;
			case FinalPackage.IFC_OWNER_HISTORY__CREATION_DATE:
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
			case FinalPackage.IFC_OWNER_HISTORY__OWNING_USER:
				return owningUser != null;
			case FinalPackage.IFC_OWNER_HISTORY__OWNING_APPLICATION:
				return owningApplication != null;
			case FinalPackage.IFC_OWNER_HISTORY__STATE:
				return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
			case FinalPackage.IFC_OWNER_HISTORY__CHANGE_ACTION:
				return changeAction != CHANGE_ACTION_EDEFAULT;
			case FinalPackage.IFC_OWNER_HISTORY__LAST_MODIFIED_DATE:
				return LAST_MODIFIED_DATE_EDEFAULT == null ? lastModifiedDate != null : !LAST_MODIFIED_DATE_EDEFAULT.equals(lastModifiedDate);
			case FinalPackage.IFC_OWNER_HISTORY__LAST_MODIFYING_USER:
				return lastModifyingUser != null;
			case FinalPackage.IFC_OWNER_HISTORY__LAST_MODIFYING_APPLICATION:
				return lastModifyingApplication != null;
			case FinalPackage.IFC_OWNER_HISTORY__CREATION_DATE:
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
		result.append(" (state: ");
		result.append(state);
		result.append(", changeAction: ");
		result.append(changeAction);
		result.append(", lastModifiedDate: ");
		result.append(lastModifiedDate);
		result.append(", creationDate: ");
		result.append(creationDate);
		result.append(')');
		return result.toString();
	}

} //IfcOwnerHistoryImpl
