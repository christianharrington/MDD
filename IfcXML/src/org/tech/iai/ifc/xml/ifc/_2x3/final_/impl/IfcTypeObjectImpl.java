/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.HasPropertySetsType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTypeObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Type Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTypeObjectImpl#getApplicableOccurrence <em>Applicable Occurrence</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTypeObjectImpl#getHasPropertySets <em>Has Property Sets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcTypeObjectImpl extends IfcObjectDefinitionImpl implements IfcTypeObject {
	/**
	 * The default value of the '{@link #getApplicableOccurrence() <em>Applicable Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicableOccurrence()
	 * @generated
	 * @ordered
	 */
	protected static final String APPLICABLE_OCCURRENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApplicableOccurrence() <em>Applicable Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicableOccurrence()
	 * @generated
	 * @ordered
	 */
	protected String applicableOccurrence = APPLICABLE_OCCURRENCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasPropertySets() <em>Has Property Sets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasPropertySets()
	 * @generated
	 * @ordered
	 */
	protected HasPropertySetsType hasPropertySets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcTypeObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcTypeObject();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApplicableOccurrence() {
		return applicableOccurrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicableOccurrence(String newApplicableOccurrence) {
		String oldApplicableOccurrence = applicableOccurrence;
		applicableOccurrence = newApplicableOccurrence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TYPE_OBJECT__APPLICABLE_OCCURRENCE, oldApplicableOccurrence, applicableOccurrence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HasPropertySetsType getHasPropertySets() {
		return hasPropertySets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasPropertySets(HasPropertySetsType newHasPropertySets, NotificationChain msgs) {
		HasPropertySetsType oldHasPropertySets = hasPropertySets;
		hasPropertySets = newHasPropertySets;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TYPE_OBJECT__HAS_PROPERTY_SETS, oldHasPropertySets, newHasPropertySets);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasPropertySets(HasPropertySetsType newHasPropertySets) {
		if (newHasPropertySets != hasPropertySets) {
			NotificationChain msgs = null;
			if (hasPropertySets != null)
				msgs = ((InternalEObject)hasPropertySets).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_TYPE_OBJECT__HAS_PROPERTY_SETS, null, msgs);
			if (newHasPropertySets != null)
				msgs = ((InternalEObject)newHasPropertySets).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_TYPE_OBJECT__HAS_PROPERTY_SETS, null, msgs);
			msgs = basicSetHasPropertySets(newHasPropertySets, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TYPE_OBJECT__HAS_PROPERTY_SETS, newHasPropertySets, newHasPropertySets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_TYPE_OBJECT__HAS_PROPERTY_SETS:
				return basicSetHasPropertySets(null, msgs);
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
			case FinalPackage.IFC_TYPE_OBJECT__APPLICABLE_OCCURRENCE:
				return getApplicableOccurrence();
			case FinalPackage.IFC_TYPE_OBJECT__HAS_PROPERTY_SETS:
				return getHasPropertySets();
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
			case FinalPackage.IFC_TYPE_OBJECT__APPLICABLE_OCCURRENCE:
				setApplicableOccurrence((String)newValue);
				return;
			case FinalPackage.IFC_TYPE_OBJECT__HAS_PROPERTY_SETS:
				setHasPropertySets((HasPropertySetsType)newValue);
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
			case FinalPackage.IFC_TYPE_OBJECT__APPLICABLE_OCCURRENCE:
				setApplicableOccurrence(APPLICABLE_OCCURRENCE_EDEFAULT);
				return;
			case FinalPackage.IFC_TYPE_OBJECT__HAS_PROPERTY_SETS:
				setHasPropertySets((HasPropertySetsType)null);
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
			case FinalPackage.IFC_TYPE_OBJECT__APPLICABLE_OCCURRENCE:
				return APPLICABLE_OCCURRENCE_EDEFAULT == null ? applicableOccurrence != null : !APPLICABLE_OCCURRENCE_EDEFAULT.equals(applicableOccurrence);
			case FinalPackage.IFC_TYPE_OBJECT__HAS_PROPERTY_SETS:
				return hasPropertySets != null;
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
		result.append(" (applicableOccurrence: ");
		result.append(applicableOccurrence);
		result.append(')');
		return result.toString();
	}

} //IfcTypeObjectImpl
