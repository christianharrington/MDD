/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcComplexProperty;
import ifc2x3tc1.IfcProperty;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Complex Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcComplexPropertyImpl#getUsageName <em>Usage Name</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcComplexPropertyImpl#getHasProperties <em>Has Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcComplexPropertyImpl extends IfcPropertyImpl implements IfcComplexProperty {
	/**
	 * The default value of the '{@link #getUsageName() <em>Usage Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageName()
	 * @generated
	 * @ordered
	 */
	protected static final String USAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsageName() <em>Usage Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageName()
	 * @generated
	 * @ordered
	 */
	protected String usageName = USAGE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasProperties() <em>Has Properties</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcProperty> hasProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcComplexPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcComplexProperty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsageName() {
		return usageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsageName(String newUsageName) {
		String oldUsageName = usageName;
		usageName = newUsageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_COMPLEX_PROPERTY__USAGE_NAME, oldUsageName, usageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcProperty> getHasProperties() {
		if (hasProperties == null) {
			hasProperties = new EObjectWithInverseResolvingEList.ManyInverse<IfcProperty>(IfcProperty.class, this, Ifc2x3tc1Package.IFC_COMPLEX_PROPERTY__HAS_PROPERTIES, Ifc2x3tc1Package.IFC_PROPERTY__PART_OF_COMPLEX);
		}
		return hasProperties;
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
			case Ifc2x3tc1Package.IFC_COMPLEX_PROPERTY__HAS_PROPERTIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasProperties()).basicAdd(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_COMPLEX_PROPERTY__HAS_PROPERTIES:
				return ((InternalEList<?>)getHasProperties()).basicRemove(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_COMPLEX_PROPERTY__USAGE_NAME:
				return getUsageName();
			case Ifc2x3tc1Package.IFC_COMPLEX_PROPERTY__HAS_PROPERTIES:
				return getHasProperties();
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
			case Ifc2x3tc1Package.IFC_COMPLEX_PROPERTY__USAGE_NAME:
				setUsageName((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_COMPLEX_PROPERTY__HAS_PROPERTIES:
				getHasProperties().clear();
				getHasProperties().addAll((Collection<? extends IfcProperty>)newValue);
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
			case Ifc2x3tc1Package.IFC_COMPLEX_PROPERTY__USAGE_NAME:
				setUsageName(USAGE_NAME_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_COMPLEX_PROPERTY__HAS_PROPERTIES:
				getHasProperties().clear();
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
			case Ifc2x3tc1Package.IFC_COMPLEX_PROPERTY__USAGE_NAME:
				return USAGE_NAME_EDEFAULT == null ? usageName != null : !USAGE_NAME_EDEFAULT.equals(usageName);
			case Ifc2x3tc1Package.IFC_COMPLEX_PROPERTY__HAS_PROPERTIES:
				return hasProperties != null && !hasProperties.isEmpty();
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
		result.append(" (UsageName: ");
		result.append(usageName);
		result.append(')');
		return result.toString();
	}

} //IfcComplexPropertyImpl
