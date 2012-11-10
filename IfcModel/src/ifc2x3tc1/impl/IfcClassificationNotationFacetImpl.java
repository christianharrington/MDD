/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcClassificationNotationFacet;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Classification Notation Facet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcClassificationNotationFacetImpl#getNotationValue <em>Notation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcClassificationNotationFacetImpl extends EObjectImpl implements IfcClassificationNotationFacet {
	/**
	 * The default value of the '{@link #getNotationValue() <em>Notation Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotationValue()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTATION_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNotationValue() <em>Notation Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotationValue()
	 * @generated
	 * @ordered
	 */
	protected String notationValue = NOTATION_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcClassificationNotationFacetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcClassificationNotationFacet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNotationValue() {
		return notationValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotationValue(String newNotationValue) {
		String oldNotationValue = notationValue;
		notationValue = newNotationValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CLASSIFICATION_NOTATION_FACET__NOTATION_VALUE, oldNotationValue, notationValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_CLASSIFICATION_NOTATION_FACET__NOTATION_VALUE:
				return getNotationValue();
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
			case Ifc2x3tc1Package.IFC_CLASSIFICATION_NOTATION_FACET__NOTATION_VALUE:
				setNotationValue((String)newValue);
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
			case Ifc2x3tc1Package.IFC_CLASSIFICATION_NOTATION_FACET__NOTATION_VALUE:
				setNotationValue(NOTATION_VALUE_EDEFAULT);
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
			case Ifc2x3tc1Package.IFC_CLASSIFICATION_NOTATION_FACET__NOTATION_VALUE:
				return NOTATION_VALUE_EDEFAULT == null ? notationValue != null : !NOTATION_VALUE_EDEFAULT.equals(notationValue);
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
		result.append(" (NotationValue: ");
		result.append(notationValue);
		result.append(')');
		return result.toString();
	}

} //IfcClassificationNotationFacetImpl
