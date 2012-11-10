/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcElementCompositionEnum;
import ifc2x3tc1.IfcRelContainedInSpatialStructure;
import ifc2x3tc1.IfcRelReferencedInSpatialStructure;
import ifc2x3tc1.IfcRelServicesBuildings;
import ifc2x3tc1.IfcSpatialStructureElement;

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
 * An implementation of the model object '<em><b>Ifc Spatial Structure Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcSpatialStructureElementImpl#getLongName <em>Long Name</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSpatialStructureElementImpl#getCompositionType <em>Composition Type</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSpatialStructureElementImpl#getReferencesElements <em>References Elements</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSpatialStructureElementImpl#getServicedBySystems <em>Serviced By Systems</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSpatialStructureElementImpl#getContainsElements <em>Contains Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcSpatialStructureElementImpl extends IfcProductImpl implements IfcSpatialStructureElement {
	/**
	 * The default value of the '{@link #getLongName() <em>Long Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongName()
	 * @generated
	 * @ordered
	 */
	protected static final String LONG_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLongName() <em>Long Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongName()
	 * @generated
	 * @ordered
	 */
	protected String longName = LONG_NAME_EDEFAULT;

	/**
	 * This is true if the Long Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean longNameESet;

	/**
	 * The default value of the '{@link #getCompositionType() <em>Composition Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositionType()
	 * @generated
	 * @ordered
	 */
	protected static final IfcElementCompositionEnum COMPOSITION_TYPE_EDEFAULT = IfcElementCompositionEnum.NULL;

	/**
	 * The cached value of the '{@link #getCompositionType() <em>Composition Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositionType()
	 * @generated
	 * @ordered
	 */
	protected IfcElementCompositionEnum compositionType = COMPOSITION_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReferencesElements() <em>References Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencesElements()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcRelReferencedInSpatialStructure> referencesElements;

	/**
	 * The cached value of the '{@link #getServicedBySystems() <em>Serviced By Systems</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicedBySystems()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcRelServicesBuildings> servicedBySystems;

	/**
	 * The cached value of the '{@link #getContainsElements() <em>Contains Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsElements()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcRelContainedInSpatialStructure> containsElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSpatialStructureElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcSpatialStructureElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLongName() {
		return longName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongName(String newLongName) {
		String oldLongName = longName;
		longName = newLongName;
		boolean oldLongNameESet = longNameESet;
		longNameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SPATIAL_STRUCTURE_ELEMENT__LONG_NAME, oldLongName, longName, !oldLongNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLongName() {
		String oldLongName = longName;
		boolean oldLongNameESet = longNameESet;
		longName = LONG_NAME_EDEFAULT;
		longNameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SPATIAL_STRUCTURE_ELEMENT__LONG_NAME, oldLongName, LONG_NAME_EDEFAULT, oldLongNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLongName() {
		return longNameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElementCompositionEnum getCompositionType() {
		return compositionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompositionType(IfcElementCompositionEnum newCompositionType) {
		IfcElementCompositionEnum oldCompositionType = compositionType;
		compositionType = newCompositionType == null ? COMPOSITION_TYPE_EDEFAULT : newCompositionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SPATIAL_STRUCTURE_ELEMENT__COMPOSITION_TYPE, oldCompositionType, compositionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcRelReferencedInSpatialStructure> getReferencesElements() {
		if (referencesElements == null) {
			referencesElements = new EObjectWithInverseResolvingEList.Unsettable<IfcRelReferencedInSpatialStructure>(IfcRelReferencedInSpatialStructure.class, this, Ifc2x3tc1Package.IFC_SPATIAL_STRUCTURE_ELEMENT__REFERENCES_ELEMENTS, Ifc2x3tc1Package.IFC_REL_REFERENCED_IN_SPATIAL_STRUCTURE__RELATING_STRUCTURE);
		}
		return referencesElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReferencesElements() {
		if (referencesElements != null) ((InternalEList.Unsettable<?>)referencesElements).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReferencesElements() {
		return referencesElements != null && ((InternalEList.Unsettable<?>)referencesElements).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcRelServicesBuildings> getServicedBySystems() {
		if (servicedBySystems == null) {
			servicedBySystems = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse<IfcRelServicesBuildings>(IfcRelServicesBuildings.class, this, Ifc2x3tc1Package.IFC_SPATIAL_STRUCTURE_ELEMENT__SERVICED_BY_SYSTEMS, Ifc2x3tc1Package.IFC_REL_SERVICES_BUILDINGS__RELATED_BUILDINGS);
		}
		return servicedBySystems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetServicedBySystems() {
		if (servicedBySystems != null) ((InternalEList.Unsettable<?>)servicedBySystems).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetServicedBySystems() {
		return servicedBySystems != null && ((InternalEList.Unsettable<?>)servicedBySystems).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcRelContainedInSpatialStructure> getContainsElements() {
		if (containsElements == null) {
			containsElements = new EObjectWithInverseResolvingEList.Unsettable<IfcRelContainedInSpatialStructure>(IfcRelContainedInSpatialStructure.class, this, Ifc2x3tc1Package.IFC_SPATIAL_STRUCTURE_ELEMENT__CONTAINS_ELEMENTS, Ifc2x3tc1Package.IFC_REL_CONTAINED_IN_SPATIAL_STRUCTURE__RELATING_STRUCTURE);
		}
		return containsElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetContainsElements() {
		if (containsElements != null) ((InternalEList.Unsettable<?>)containsElements).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetContainsElements() {
		return containsElements != null && ((InternalEList.Unsettable<?>)containsElements).isSet();
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
			case Ifc2x3tc1Package.IFC_SPATIAL_STRUCTURE_ELEMENT__REFERENCES_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferencesElements()).basicAdd(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_SPATIAL_STRUCTURE_ELEMENT__SERVICED_BY_SYSTEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getServicedBySystems()).basicAdd(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_SPATIAL_STRUCTURE_ELEMENT__CONTAINS_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContainsElements()).basicAdd(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_SPATIAL_STRUCTURE_ELEMENT__REFERENCES_ELEMENTS:
				return ((InternalEList<?>)getReferencesElements()).basicRemove(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_SPATIAL_STRUCTURE_ELEMENT__SERVICED_BY_SYSTEMS:
				return ((InternalEList<?>)getServicedBySystems()).basicRemove(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_SPATIAL_STRUCTURE_ELEMENT__CONTAINS_ELEMENTS:
				return ((InternalEList<?>)getContainsElements()).basicRemove(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_SPATIAL_STRUCTURE_ELEMENT__LONG_NAME:
				return getLongName();
			case Ifc2x3tc1Package.IFC_SPATIAL_STRUCTURE_ELEMENT__COMPOSITION_TYPE:
				return getCompositionType();
			case Ifc2x3tc1Package.IFC_SPATIAL_STRUCTURE_ELEMENT__REFERENCES_ELEMENTS:
				return getReferencesElements();
			case Ifc2x3tc1Package.IFC_SPATIAL_STRUCTURE_ELEMENT__SERVICED_BY_SYSTEMS:
				return getServicedBySystems();
			case Ifc2x3tc1Package.IFC_SPATIAL_STRUCTURE_ELEMENT__CONTAINS_ELEMENTS:
				return getContainsElements();
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
			case Ifc2x3tc1Package.IFC_SPATIAL_STRUCTURE_ELEMENT__LONG_NAME:
				setLongName((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SPATIAL_STRUCTURE_ELEMENT__COMPOSITION_TYPE:
				setCompositionType((IfcElementCompositionEnum)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SPATIAL_STRUCTURE_ELEMENT__REFERENCES_ELEMENTS:
				getReferencesElements().clear();
				getReferencesElements().addAll((Collection<? extends IfcRelReferencedInSpatialStructure>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SPATIAL_STRUCTURE_ELEMENT__SERVICED_BY_SYSTEMS:
				getServicedBySystems().clear();
				getServicedBySystems().addAll((Collection<? extends IfcRelServicesBuildings>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SPATIAL_STRUCTURE_ELEMENT__CONTAINS_ELEMENTS:
				getContainsElements().clear();
				getContainsElements().addAll((Collection<? extends IfcRelContainedInSpatialStructure>)newValue);
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
			case Ifc2x3tc1Package.IFC_SPATIAL_STRUCTURE_ELEMENT__LONG_NAME:
				unsetLongName();
				return;
			case Ifc2x3tc1Package.IFC_SPATIAL_STRUCTURE_ELEMENT__COMPOSITION_TYPE:
				setCompositionType(COMPOSITION_TYPE_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_SPATIAL_STRUCTURE_ELEMENT__REFERENCES_ELEMENTS:
				unsetReferencesElements();
				return;
			case Ifc2x3tc1Package.IFC_SPATIAL_STRUCTURE_ELEMENT__SERVICED_BY_SYSTEMS:
				unsetServicedBySystems();
				return;
			case Ifc2x3tc1Package.IFC_SPATIAL_STRUCTURE_ELEMENT__CONTAINS_ELEMENTS:
				unsetContainsElements();
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
			case Ifc2x3tc1Package.IFC_SPATIAL_STRUCTURE_ELEMENT__LONG_NAME:
				return isSetLongName();
			case Ifc2x3tc1Package.IFC_SPATIAL_STRUCTURE_ELEMENT__COMPOSITION_TYPE:
				return compositionType != COMPOSITION_TYPE_EDEFAULT;
			case Ifc2x3tc1Package.IFC_SPATIAL_STRUCTURE_ELEMENT__REFERENCES_ELEMENTS:
				return isSetReferencesElements();
			case Ifc2x3tc1Package.IFC_SPATIAL_STRUCTURE_ELEMENT__SERVICED_BY_SYSTEMS:
				return isSetServicedBySystems();
			case Ifc2x3tc1Package.IFC_SPATIAL_STRUCTURE_ELEMENT__CONTAINS_ELEMENTS:
				return isSetContainsElements();
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
		result.append(" (LongName: ");
		if (longNameESet) result.append(longName); else result.append("<unset>");
		result.append(", CompositionType: ");
		result.append(compositionType);
		result.append(')');
		return result.toString();
	}

} //IfcSpatialStructureElementImpl
