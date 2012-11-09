/**
 */
package store.impl;

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

import store.GeoTag;
import store.Project;
import store.StorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Geo Tag</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link store.impl.GeoTagImpl#getEnabled <em>Enabled</em>}</li>
 *   <li>{@link store.impl.GeoTagImpl#getProjects <em>Projects</em>}</li>
 *   <li>{@link store.impl.GeoTagImpl#getX <em>X</em>}</li>
 *   <li>{@link store.impl.GeoTagImpl#getY <em>Y</em>}</li>
 *   <li>{@link store.impl.GeoTagImpl#getZ <em>Z</em>}</li>
 *   <li>{@link store.impl.GeoTagImpl#getEpsg <em>Epsg</em>}</li>
 *   <li>{@link store.impl.GeoTagImpl#getDirectionAngle <em>Direction Angle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeoTagImpl extends EObjectImpl implements GeoTag {
	/**
	 * The default value of the '{@link #getEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ENABLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabled()
	 * @generated
	 * @ordered
	 */
	protected Boolean enabled = ENABLED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProjects() <em>Projects</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjects()
	 * @generated
	 * @ordered
	 */
	protected EList<Project> projects;

	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final Double X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected Double x = X_EDEFAULT;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final Double Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected Double y = Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getZ() <em>Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ()
	 * @generated
	 * @ordered
	 */
	protected static final Double Z_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZ() <em>Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ()
	 * @generated
	 * @ordered
	 */
	protected Double z = Z_EDEFAULT;

	/**
	 * The default value of the '{@link #getEpsg() <em>Epsg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpsg()
	 * @generated
	 * @ordered
	 */
	protected static final Integer EPSG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEpsg() <em>Epsg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpsg()
	 * @generated
	 * @ordered
	 */
	protected Integer epsg = EPSG_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirectionAngle() <em>Direction Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectionAngle()
	 * @generated
	 * @ordered
	 */
	protected static final Double DIRECTION_ANGLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDirectionAngle() <em>Direction Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectionAngle()
	 * @generated
	 * @ordered
	 */
	protected Double directionAngle = DIRECTION_ANGLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeoTagImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StorePackage.Literals.GEO_TAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getEnabled() {
		return enabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnabled(Boolean newEnabled) {
		Boolean oldEnabled = enabled;
		enabled = newEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.GEO_TAG__ENABLED, oldEnabled, enabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Project> getProjects() {
		if (projects == null) {
			projects = new EObjectWithInverseResolvingEList<Project>(Project.class, this, StorePackage.GEO_TAG__PROJECTS, StorePackage.PROJECT__GEO_TAG);
		}
		return projects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(Double newX) {
		Double oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.GEO_TAG__X, oldX, x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(Double newY) {
		Double oldY = y;
		y = newY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.GEO_TAG__Y, oldY, y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getZ() {
		return z;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZ(Double newZ) {
		Double oldZ = z;
		z = newZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.GEO_TAG__Z, oldZ, z));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getEpsg() {
		return epsg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEpsg(Integer newEpsg) {
		Integer oldEpsg = epsg;
		epsg = newEpsg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.GEO_TAG__EPSG, oldEpsg, epsg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getDirectionAngle() {
		return directionAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirectionAngle(Double newDirectionAngle) {
		Double oldDirectionAngle = directionAngle;
		directionAngle = newDirectionAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.GEO_TAG__DIRECTION_ANGLE, oldDirectionAngle, directionAngle));
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
			case StorePackage.GEO_TAG__PROJECTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProjects()).basicAdd(otherEnd, msgs);
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
			case StorePackage.GEO_TAG__PROJECTS:
				return ((InternalEList<?>)getProjects()).basicRemove(otherEnd, msgs);
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
			case StorePackage.GEO_TAG__ENABLED:
				return getEnabled();
			case StorePackage.GEO_TAG__PROJECTS:
				return getProjects();
			case StorePackage.GEO_TAG__X:
				return getX();
			case StorePackage.GEO_TAG__Y:
				return getY();
			case StorePackage.GEO_TAG__Z:
				return getZ();
			case StorePackage.GEO_TAG__EPSG:
				return getEpsg();
			case StorePackage.GEO_TAG__DIRECTION_ANGLE:
				return getDirectionAngle();
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
			case StorePackage.GEO_TAG__ENABLED:
				setEnabled((Boolean)newValue);
				return;
			case StorePackage.GEO_TAG__PROJECTS:
				getProjects().clear();
				getProjects().addAll((Collection<? extends Project>)newValue);
				return;
			case StorePackage.GEO_TAG__X:
				setX((Double)newValue);
				return;
			case StorePackage.GEO_TAG__Y:
				setY((Double)newValue);
				return;
			case StorePackage.GEO_TAG__Z:
				setZ((Double)newValue);
				return;
			case StorePackage.GEO_TAG__EPSG:
				setEpsg((Integer)newValue);
				return;
			case StorePackage.GEO_TAG__DIRECTION_ANGLE:
				setDirectionAngle((Double)newValue);
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
			case StorePackage.GEO_TAG__ENABLED:
				setEnabled(ENABLED_EDEFAULT);
				return;
			case StorePackage.GEO_TAG__PROJECTS:
				getProjects().clear();
				return;
			case StorePackage.GEO_TAG__X:
				setX(X_EDEFAULT);
				return;
			case StorePackage.GEO_TAG__Y:
				setY(Y_EDEFAULT);
				return;
			case StorePackage.GEO_TAG__Z:
				setZ(Z_EDEFAULT);
				return;
			case StorePackage.GEO_TAG__EPSG:
				setEpsg(EPSG_EDEFAULT);
				return;
			case StorePackage.GEO_TAG__DIRECTION_ANGLE:
				setDirectionAngle(DIRECTION_ANGLE_EDEFAULT);
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
			case StorePackage.GEO_TAG__ENABLED:
				return ENABLED_EDEFAULT == null ? enabled != null : !ENABLED_EDEFAULT.equals(enabled);
			case StorePackage.GEO_TAG__PROJECTS:
				return projects != null && !projects.isEmpty();
			case StorePackage.GEO_TAG__X:
				return X_EDEFAULT == null ? x != null : !X_EDEFAULT.equals(x);
			case StorePackage.GEO_TAG__Y:
				return Y_EDEFAULT == null ? y != null : !Y_EDEFAULT.equals(y);
			case StorePackage.GEO_TAG__Z:
				return Z_EDEFAULT == null ? z != null : !Z_EDEFAULT.equals(z);
			case StorePackage.GEO_TAG__EPSG:
				return EPSG_EDEFAULT == null ? epsg != null : !EPSG_EDEFAULT.equals(epsg);
			case StorePackage.GEO_TAG__DIRECTION_ANGLE:
				return DIRECTION_ANGLE_EDEFAULT == null ? directionAngle != null : !DIRECTION_ANGLE_EDEFAULT.equals(directionAngle);
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
		result.append(" (enabled: ");
		result.append(enabled);
		result.append(", x: ");
		result.append(x);
		result.append(", y: ");
		result.append(y);
		result.append(", z: ");
		result.append(z);
		result.append(", epsg: ");
		result.append(epsg);
		result.append(", directionAngle: ");
		result.append(directionAngle);
		result.append(')');
		return result.toString();
	}

} //GeoTagImpl
