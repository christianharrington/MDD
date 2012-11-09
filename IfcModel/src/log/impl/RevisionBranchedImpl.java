/**
 */
package log.impl;

import log.LogPackage;
import log.RevisionBranched;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import store.Revision;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Revision Branched</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link log.impl.RevisionBranchedImpl#getOldrevision <em>Oldrevision</em>}</li>
 *   <li>{@link log.impl.RevisionBranchedImpl#getNewrevision <em>Newrevision</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RevisionBranchedImpl extends LogActionImpl implements RevisionBranched {
	/**
	 * The cached value of the '{@link #getOldrevision() <em>Oldrevision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldrevision()
	 * @generated
	 * @ordered
	 */
	protected Revision oldrevision;

	/**
	 * The cached value of the '{@link #getNewrevision() <em>Newrevision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewrevision()
	 * @generated
	 * @ordered
	 */
	protected Revision newrevision;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RevisionBranchedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogPackage.Literals.REVISION_BRANCHED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Revision getOldrevision() {
		if (oldrevision != null && oldrevision.eIsProxy()) {
			InternalEObject oldOldrevision = (InternalEObject)oldrevision;
			oldrevision = (Revision)eResolveProxy(oldOldrevision);
			if (oldrevision != oldOldrevision) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogPackage.REVISION_BRANCHED__OLDREVISION, oldOldrevision, oldrevision));
			}
		}
		return oldrevision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Revision basicGetOldrevision() {
		return oldrevision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOldrevision(Revision newOldrevision) {
		Revision oldOldrevision = oldrevision;
		oldrevision = newOldrevision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogPackage.REVISION_BRANCHED__OLDREVISION, oldOldrevision, oldrevision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Revision getNewrevision() {
		if (newrevision != null && newrevision.eIsProxy()) {
			InternalEObject oldNewrevision = (InternalEObject)newrevision;
			newrevision = (Revision)eResolveProxy(oldNewrevision);
			if (newrevision != oldNewrevision) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogPackage.REVISION_BRANCHED__NEWREVISION, oldNewrevision, newrevision));
			}
		}
		return newrevision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Revision basicGetNewrevision() {
		return newrevision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewrevision(Revision newNewrevision) {
		Revision oldNewrevision = newrevision;
		newrevision = newNewrevision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogPackage.REVISION_BRANCHED__NEWREVISION, oldNewrevision, newrevision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LogPackage.REVISION_BRANCHED__OLDREVISION:
				if (resolve) return getOldrevision();
				return basicGetOldrevision();
			case LogPackage.REVISION_BRANCHED__NEWREVISION:
				if (resolve) return getNewrevision();
				return basicGetNewrevision();
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
			case LogPackage.REVISION_BRANCHED__OLDREVISION:
				setOldrevision((Revision)newValue);
				return;
			case LogPackage.REVISION_BRANCHED__NEWREVISION:
				setNewrevision((Revision)newValue);
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
			case LogPackage.REVISION_BRANCHED__OLDREVISION:
				setOldrevision((Revision)null);
				return;
			case LogPackage.REVISION_BRANCHED__NEWREVISION:
				setNewrevision((Revision)null);
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
			case LogPackage.REVISION_BRANCHED__OLDREVISION:
				return oldrevision != null;
			case LogPackage.REVISION_BRANCHED__NEWREVISION:
				return newrevision != null;
		}
		return super.eIsSet(featureID);
	}

} //RevisionBranchedImpl
