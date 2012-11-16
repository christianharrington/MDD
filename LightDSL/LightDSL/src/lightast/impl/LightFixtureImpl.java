/**
 */
package lightast.impl;

import java.util.Collection;
import lightast.Lamp;
import lightast.LightFixture;
import lightast.LightFixtureType;
import lightast.LightastPackage;
import lightast.Material;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Light Fixture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lightast.impl.LightFixtureImpl#getConsistsOf <em>Consists Of</em>}</li>
 *   <li>{@link lightast.impl.LightFixtureImpl#getPredefinedType <em>Predefined Type</em>}</li>
 *   <li>{@link lightast.impl.LightFixtureImpl#getLamps <em>Lamps</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LightFixtureImpl extends EObjectImpl implements LightFixture {
	/**
	 * The cached value of the '{@link #getConsistsOf() <em>Consists Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsistsOf()
	 * @generated
	 * @ordered
	 */
	protected Material consistsOf;

	/**
	 * The default value of the '{@link #getPredefinedType() <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredefinedType()
	 * @generated
	 * @ordered
	 */
	protected static final LightFixtureType PREDEFINED_TYPE_EDEFAULT = LightFixtureType.POINTSOURCE;

	/**
	 * The cached value of the '{@link #getPredefinedType() <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredefinedType()
	 * @generated
	 * @ordered
	 */
	protected LightFixtureType predefinedType = PREDEFINED_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLamps() <em>Lamps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLamps()
	 * @generated
	 * @ordered
	 */
	protected EList<Lamp> lamps;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LightFixtureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LightastPackage.Literals.LIGHT_FIXTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Material getConsistsOf() {
		if (consistsOf != null && consistsOf.eIsProxy()) {
			InternalEObject oldConsistsOf = (InternalEObject)consistsOf;
			consistsOf = (Material)eResolveProxy(oldConsistsOf);
			if (consistsOf != oldConsistsOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LightastPackage.LIGHT_FIXTURE__CONSISTS_OF, oldConsistsOf, consistsOf));
			}
		}
		return consistsOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Material basicGetConsistsOf() {
		return consistsOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsistsOf(Material newConsistsOf) {
		Material oldConsistsOf = consistsOf;
		consistsOf = newConsistsOf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LightastPackage.LIGHT_FIXTURE__CONSISTS_OF, oldConsistsOf, consistsOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LightFixtureType getPredefinedType() {
		return predefinedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredefinedType(LightFixtureType newPredefinedType) {
		LightFixtureType oldPredefinedType = predefinedType;
		predefinedType = newPredefinedType == null ? PREDEFINED_TYPE_EDEFAULT : newPredefinedType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LightastPackage.LIGHT_FIXTURE__PREDEFINED_TYPE, oldPredefinedType, predefinedType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Lamp> getLamps() {
		if (lamps == null) {
			lamps = new EObjectContainmentEList<Lamp>(Lamp.class, this, LightastPackage.LIGHT_FIXTURE__LAMPS);
		}
		return lamps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LightastPackage.LIGHT_FIXTURE__LAMPS:
				return ((InternalEList<?>)getLamps()).basicRemove(otherEnd, msgs);
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
			case LightastPackage.LIGHT_FIXTURE__CONSISTS_OF:
				if (resolve) return getConsistsOf();
				return basicGetConsistsOf();
			case LightastPackage.LIGHT_FIXTURE__PREDEFINED_TYPE:
				return getPredefinedType();
			case LightastPackage.LIGHT_FIXTURE__LAMPS:
				return getLamps();
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
			case LightastPackage.LIGHT_FIXTURE__CONSISTS_OF:
				setConsistsOf((Material)newValue);
				return;
			case LightastPackage.LIGHT_FIXTURE__PREDEFINED_TYPE:
				setPredefinedType((LightFixtureType)newValue);
				return;
			case LightastPackage.LIGHT_FIXTURE__LAMPS:
				getLamps().clear();
				getLamps().addAll((Collection<? extends Lamp>)newValue);
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
			case LightastPackage.LIGHT_FIXTURE__CONSISTS_OF:
				setConsistsOf((Material)null);
				return;
			case LightastPackage.LIGHT_FIXTURE__PREDEFINED_TYPE:
				setPredefinedType(PREDEFINED_TYPE_EDEFAULT);
				return;
			case LightastPackage.LIGHT_FIXTURE__LAMPS:
				getLamps().clear();
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
			case LightastPackage.LIGHT_FIXTURE__CONSISTS_OF:
				return consistsOf != null;
			case LightastPackage.LIGHT_FIXTURE__PREDEFINED_TYPE:
				return predefinedType != PREDEFINED_TYPE_EDEFAULT;
			case LightastPackage.LIGHT_FIXTURE__LAMPS:
				return lamps != null && !lamps.isEmpty();
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
		result.append(" (PredefinedType: ");
		result.append(predefinedType);
		result.append(')');
		return result.toString();
	}

} //LightFixtureImpl
