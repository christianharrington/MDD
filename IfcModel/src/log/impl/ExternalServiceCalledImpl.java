/**
 */
package log.impl;

import java.util.Collection;

import log.ExternalServiceCalled;
import log.LogPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import store.NotifictionResultEnum;
import store.Service;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Service Called</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link log.impl.ExternalServiceCalledImpl#getService <em>Service</em>}</li>
 *   <li>{@link log.impl.ExternalServiceCalledImpl#getState <em>State</em>}</li>
 *   <li>{@link log.impl.ExternalServiceCalledImpl#getPercentage <em>Percentage</em>}</li>
 *   <li>{@link log.impl.ExternalServiceCalledImpl#getInfos <em>Infos</em>}</li>
 *   <li>{@link log.impl.ExternalServiceCalledImpl#getWarnings <em>Warnings</em>}</li>
 *   <li>{@link log.impl.ExternalServiceCalledImpl#getErrors <em>Errors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExternalServiceCalledImpl extends LogActionImpl implements ExternalServiceCalled {
	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected Service service;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final NotifictionResultEnum STATE_EDEFAULT = NotifictionResultEnum.ERROR;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected NotifictionResultEnum state = STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPercentage() <em>Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentage()
	 * @generated
	 * @ordered
	 */
	protected static final int PERCENTAGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPercentage() <em>Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentage()
	 * @generated
	 * @ordered
	 */
	protected int percentage = PERCENTAGE_EDEFAULT;

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
	 * The cached value of the '{@link #getWarnings() <em>Warnings</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarnings()
	 * @generated
	 * @ordered
	 */
	protected EList<String> warnings;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalServiceCalledImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogPackage.Literals.EXTERNAL_SERVICE_CALLED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service getService() {
		if (service != null && service.eIsProxy()) {
			InternalEObject oldService = (InternalEObject)service;
			service = (Service)eResolveProxy(oldService);
			if (service != oldService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogPackage.EXTERNAL_SERVICE_CALLED__SERVICE, oldService, service));
			}
		}
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service basicGetService() {
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setService(Service newService) {
		Service oldService = service;
		service = newService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogPackage.EXTERNAL_SERVICE_CALLED__SERVICE, oldService, service));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotifictionResultEnum getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(NotifictionResultEnum newState) {
		NotifictionResultEnum oldState = state;
		state = newState == null ? STATE_EDEFAULT : newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogPackage.EXTERNAL_SERVICE_CALLED__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPercentage() {
		return percentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPercentage(int newPercentage) {
		int oldPercentage = percentage;
		percentage = newPercentage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogPackage.EXTERNAL_SERVICE_CALLED__PERCENTAGE, oldPercentage, percentage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getInfos() {
		if (infos == null) {
			infos = new EDataTypeUniqueEList<String>(String.class, this, LogPackage.EXTERNAL_SERVICE_CALLED__INFOS);
		}
		return infos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getWarnings() {
		if (warnings == null) {
			warnings = new EDataTypeUniqueEList<String>(String.class, this, LogPackage.EXTERNAL_SERVICE_CALLED__WARNINGS);
		}
		return warnings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getErrors() {
		if (errors == null) {
			errors = new EDataTypeUniqueEList<String>(String.class, this, LogPackage.EXTERNAL_SERVICE_CALLED__ERRORS);
		}
		return errors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LogPackage.EXTERNAL_SERVICE_CALLED__SERVICE:
				if (resolve) return getService();
				return basicGetService();
			case LogPackage.EXTERNAL_SERVICE_CALLED__STATE:
				return getState();
			case LogPackage.EXTERNAL_SERVICE_CALLED__PERCENTAGE:
				return getPercentage();
			case LogPackage.EXTERNAL_SERVICE_CALLED__INFOS:
				return getInfos();
			case LogPackage.EXTERNAL_SERVICE_CALLED__WARNINGS:
				return getWarnings();
			case LogPackage.EXTERNAL_SERVICE_CALLED__ERRORS:
				return getErrors();
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
			case LogPackage.EXTERNAL_SERVICE_CALLED__SERVICE:
				setService((Service)newValue);
				return;
			case LogPackage.EXTERNAL_SERVICE_CALLED__STATE:
				setState((NotifictionResultEnum)newValue);
				return;
			case LogPackage.EXTERNAL_SERVICE_CALLED__PERCENTAGE:
				setPercentage((Integer)newValue);
				return;
			case LogPackage.EXTERNAL_SERVICE_CALLED__INFOS:
				getInfos().clear();
				getInfos().addAll((Collection<? extends String>)newValue);
				return;
			case LogPackage.EXTERNAL_SERVICE_CALLED__WARNINGS:
				getWarnings().clear();
				getWarnings().addAll((Collection<? extends String>)newValue);
				return;
			case LogPackage.EXTERNAL_SERVICE_CALLED__ERRORS:
				getErrors().clear();
				getErrors().addAll((Collection<? extends String>)newValue);
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
			case LogPackage.EXTERNAL_SERVICE_CALLED__SERVICE:
				setService((Service)null);
				return;
			case LogPackage.EXTERNAL_SERVICE_CALLED__STATE:
				setState(STATE_EDEFAULT);
				return;
			case LogPackage.EXTERNAL_SERVICE_CALLED__PERCENTAGE:
				setPercentage(PERCENTAGE_EDEFAULT);
				return;
			case LogPackage.EXTERNAL_SERVICE_CALLED__INFOS:
				getInfos().clear();
				return;
			case LogPackage.EXTERNAL_SERVICE_CALLED__WARNINGS:
				getWarnings().clear();
				return;
			case LogPackage.EXTERNAL_SERVICE_CALLED__ERRORS:
				getErrors().clear();
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
			case LogPackage.EXTERNAL_SERVICE_CALLED__SERVICE:
				return service != null;
			case LogPackage.EXTERNAL_SERVICE_CALLED__STATE:
				return state != STATE_EDEFAULT;
			case LogPackage.EXTERNAL_SERVICE_CALLED__PERCENTAGE:
				return percentage != PERCENTAGE_EDEFAULT;
			case LogPackage.EXTERNAL_SERVICE_CALLED__INFOS:
				return infos != null && !infos.isEmpty();
			case LogPackage.EXTERNAL_SERVICE_CALLED__WARNINGS:
				return warnings != null && !warnings.isEmpty();
			case LogPackage.EXTERNAL_SERVICE_CALLED__ERRORS:
				return errors != null && !errors.isEmpty();
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
		result.append(", percentage: ");
		result.append(percentage);
		result.append(", infos: ");
		result.append(infos);
		result.append(", warnings: ");
		result.append(warnings);
		result.append(", errors: ");
		result.append(errors);
		result.append(')');
		return result.toString();
	}

} //ExternalServiceCalledImpl
