/**
 */
package store.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import store.ActionState;
import store.LongActionState;
import store.StorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Long Action State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link store.impl.LongActionStateImpl#getProgress <em>Progress</em>}</li>
 *   <li>{@link store.impl.LongActionStateImpl#getState <em>State</em>}</li>
 *   <li>{@link store.impl.LongActionStateImpl#getErrors <em>Errors</em>}</li>
 *   <li>{@link store.impl.LongActionStateImpl#getWarnings <em>Warnings</em>}</li>
 *   <li>{@link store.impl.LongActionStateImpl#getInfos <em>Infos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LongActionStateImpl extends EObjectImpl implements LongActionState {
	/**
	 * The default value of the '{@link #getProgress() <em>Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgress()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PROGRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProgress() <em>Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgress()
	 * @generated
	 * @ordered
	 */
	protected Integer progress = PROGRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final ActionState STATE_EDEFAULT = ActionState.UNKNOWN;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected ActionState state = STATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getErrors() <em>Errors</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrors()
	 * @generated
	 * @ordered
	 */
	protected EList<String> errors;

	/**
	 * The cached value of the '{@link #getWarnings() <em>Warnings</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarnings()
	 * @generated
	 * @ordered
	 */
	protected EList<String> warnings;

	/**
	 * The cached value of the '{@link #getInfos() <em>Infos</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfos()
	 * @generated
	 * @ordered
	 */
	protected EList<String> infos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LongActionStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StorePackage.Literals.LONG_ACTION_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getProgress() {
		return progress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgress(Integer newProgress) {
		Integer oldProgress = progress;
		progress = newProgress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.LONG_ACTION_STATE__PROGRESS, oldProgress, progress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionState getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(ActionState newState) {
		ActionState oldState = state;
		state = newState == null ? STATE_EDEFAULT : newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.LONG_ACTION_STATE__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getErrors() {
		if (errors == null) {
			errors = new EDataTypeUniqueEList<String>(String.class, this, StorePackage.LONG_ACTION_STATE__ERRORS);
		}
		return errors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getWarnings() {
		if (warnings == null) {
			warnings = new EDataTypeUniqueEList<String>(String.class, this, StorePackage.LONG_ACTION_STATE__WARNINGS);
		}
		return warnings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getInfos() {
		if (infos == null) {
			infos = new EDataTypeUniqueEList<String>(String.class, this, StorePackage.LONG_ACTION_STATE__INFOS);
		}
		return infos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StorePackage.LONG_ACTION_STATE__PROGRESS:
				return getProgress();
			case StorePackage.LONG_ACTION_STATE__STATE:
				return getState();
			case StorePackage.LONG_ACTION_STATE__ERRORS:
				return getErrors();
			case StorePackage.LONG_ACTION_STATE__WARNINGS:
				return getWarnings();
			case StorePackage.LONG_ACTION_STATE__INFOS:
				return getInfos();
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
			case StorePackage.LONG_ACTION_STATE__PROGRESS:
				setProgress((Integer)newValue);
				return;
			case StorePackage.LONG_ACTION_STATE__STATE:
				setState((ActionState)newValue);
				return;
			case StorePackage.LONG_ACTION_STATE__ERRORS:
				getErrors().clear();
				getErrors().addAll((Collection<? extends String>)newValue);
				return;
			case StorePackage.LONG_ACTION_STATE__WARNINGS:
				getWarnings().clear();
				getWarnings().addAll((Collection<? extends String>)newValue);
				return;
			case StorePackage.LONG_ACTION_STATE__INFOS:
				getInfos().clear();
				getInfos().addAll((Collection<? extends String>)newValue);
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
			case StorePackage.LONG_ACTION_STATE__PROGRESS:
				setProgress(PROGRESS_EDEFAULT);
				return;
			case StorePackage.LONG_ACTION_STATE__STATE:
				setState(STATE_EDEFAULT);
				return;
			case StorePackage.LONG_ACTION_STATE__ERRORS:
				getErrors().clear();
				return;
			case StorePackage.LONG_ACTION_STATE__WARNINGS:
				getWarnings().clear();
				return;
			case StorePackage.LONG_ACTION_STATE__INFOS:
				getInfos().clear();
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
			case StorePackage.LONG_ACTION_STATE__PROGRESS:
				return PROGRESS_EDEFAULT == null ? progress != null : !PROGRESS_EDEFAULT.equals(progress);
			case StorePackage.LONG_ACTION_STATE__STATE:
				return state != STATE_EDEFAULT;
			case StorePackage.LONG_ACTION_STATE__ERRORS:
				return errors != null && !errors.isEmpty();
			case StorePackage.LONG_ACTION_STATE__WARNINGS:
				return warnings != null && !warnings.isEmpty();
			case StorePackage.LONG_ACTION_STATE__INFOS:
				return infos != null && !infos.isEmpty();
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
		result.append(" (progress: ");
		result.append(progress);
		result.append(", state: ");
		result.append(state);
		result.append(", errors: ");
		result.append(errors);
		result.append(", warnings: ");
		result.append(warnings);
		result.append(", infos: ");
		result.append(infos);
		result.append(')');
		return result.toString();
	}

} //LongActionStateImpl
