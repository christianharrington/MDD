/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcPropertySetDefinition;
import ifc2x3tc1.IfcRelDefinesByType;
import ifc2x3tc1.IfcTypeObject;

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
 * An implementation of the model object '<em><b>Ifc Type Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcTypeObjectImpl#getApplicableOccurrence <em>Applicable Occurrence</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTypeObjectImpl#getHasPropertySets <em>Has Property Sets</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTypeObjectImpl#getObjectTypeOf <em>Object Type Of</em>}</li>
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
	 * This is true if the Applicable Occurrence attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean applicableOccurrenceESet;

	/**
	 * The cached value of the '{@link #getHasPropertySets() <em>Has Property Sets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasPropertySets()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcPropertySetDefinition> hasPropertySets;

	/**
	 * The cached value of the '{@link #getObjectTypeOf() <em>Object Type Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectTypeOf()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcRelDefinesByType> objectTypeOf;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcTypeObject();
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
		boolean oldApplicableOccurrenceESet = applicableOccurrenceESet;
		applicableOccurrenceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TYPE_OBJECT__APPLICABLE_OCCURRENCE, oldApplicableOccurrence, applicableOccurrence, !oldApplicableOccurrenceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetApplicableOccurrence() {
		String oldApplicableOccurrence = applicableOccurrence;
		boolean oldApplicableOccurrenceESet = applicableOccurrenceESet;
		applicableOccurrence = APPLICABLE_OCCURRENCE_EDEFAULT;
		applicableOccurrenceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_TYPE_OBJECT__APPLICABLE_OCCURRENCE, oldApplicableOccurrence, APPLICABLE_OCCURRENCE_EDEFAULT, oldApplicableOccurrenceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetApplicableOccurrence() {
		return applicableOccurrenceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcPropertySetDefinition> getHasPropertySets() {
		if (hasPropertySets == null) {
			hasPropertySets = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse<IfcPropertySetDefinition>(IfcPropertySetDefinition.class, this, Ifc2x3tc1Package.IFC_TYPE_OBJECT__HAS_PROPERTY_SETS, Ifc2x3tc1Package.IFC_PROPERTY_SET_DEFINITION__DEFINES_TYPE);
		}
		return hasPropertySets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHasPropertySets() {
		if (hasPropertySets != null) ((InternalEList.Unsettable<?>)hasPropertySets).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHasPropertySets() {
		return hasPropertySets != null && ((InternalEList.Unsettable<?>)hasPropertySets).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcRelDefinesByType> getObjectTypeOf() {
		if (objectTypeOf == null) {
			objectTypeOf = new EObjectWithInverseResolvingEList.Unsettable<IfcRelDefinesByType>(IfcRelDefinesByType.class, this, Ifc2x3tc1Package.IFC_TYPE_OBJECT__OBJECT_TYPE_OF, Ifc2x3tc1Package.IFC_REL_DEFINES_BY_TYPE__RELATING_TYPE);
		}
		return objectTypeOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetObjectTypeOf() {
		if (objectTypeOf != null) ((InternalEList.Unsettable<?>)objectTypeOf).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetObjectTypeOf() {
		return objectTypeOf != null && ((InternalEList.Unsettable<?>)objectTypeOf).isSet();
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
			case Ifc2x3tc1Package.IFC_TYPE_OBJECT__HAS_PROPERTY_SETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasPropertySets()).basicAdd(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_TYPE_OBJECT__OBJECT_TYPE_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getObjectTypeOf()).basicAdd(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_TYPE_OBJECT__HAS_PROPERTY_SETS:
				return ((InternalEList<?>)getHasPropertySets()).basicRemove(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_TYPE_OBJECT__OBJECT_TYPE_OF:
				return ((InternalEList<?>)getObjectTypeOf()).basicRemove(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_TYPE_OBJECT__APPLICABLE_OCCURRENCE:
				return getApplicableOccurrence();
			case Ifc2x3tc1Package.IFC_TYPE_OBJECT__HAS_PROPERTY_SETS:
				return getHasPropertySets();
			case Ifc2x3tc1Package.IFC_TYPE_OBJECT__OBJECT_TYPE_OF:
				return getObjectTypeOf();
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
			case Ifc2x3tc1Package.IFC_TYPE_OBJECT__APPLICABLE_OCCURRENCE:
				setApplicableOccurrence((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TYPE_OBJECT__HAS_PROPERTY_SETS:
				getHasPropertySets().clear();
				getHasPropertySets().addAll((Collection<? extends IfcPropertySetDefinition>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TYPE_OBJECT__OBJECT_TYPE_OF:
				getObjectTypeOf().clear();
				getObjectTypeOf().addAll((Collection<? extends IfcRelDefinesByType>)newValue);
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
			case Ifc2x3tc1Package.IFC_TYPE_OBJECT__APPLICABLE_OCCURRENCE:
				unsetApplicableOccurrence();
				return;
			case Ifc2x3tc1Package.IFC_TYPE_OBJECT__HAS_PROPERTY_SETS:
				unsetHasPropertySets();
				return;
			case Ifc2x3tc1Package.IFC_TYPE_OBJECT__OBJECT_TYPE_OF:
				unsetObjectTypeOf();
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
			case Ifc2x3tc1Package.IFC_TYPE_OBJECT__APPLICABLE_OCCURRENCE:
				return isSetApplicableOccurrence();
			case Ifc2x3tc1Package.IFC_TYPE_OBJECT__HAS_PROPERTY_SETS:
				return isSetHasPropertySets();
			case Ifc2x3tc1Package.IFC_TYPE_OBJECT__OBJECT_TYPE_OF:
				return isSetObjectTypeOf();
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
		result.append(" (ApplicableOccurrence: ");
		if (applicableOccurrenceESet) result.append(applicableOccurrence); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcTypeObjectImpl
