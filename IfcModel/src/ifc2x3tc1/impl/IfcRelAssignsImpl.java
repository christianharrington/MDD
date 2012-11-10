/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcObjectDefinition;
import ifc2x3tc1.IfcObjectTypeEnum;
import ifc2x3tc1.IfcRelAssigns;

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
 * An implementation of the model object '<em><b>Ifc Rel Assigns</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcRelAssignsImpl#getRelatedObjects <em>Related Objects</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRelAssignsImpl#getRelatedObjectsType <em>Related Objects Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelAssignsImpl extends IfcRelationshipImpl implements IfcRelAssigns {
	/**
	 * The cached value of the '{@link #getRelatedObjects() <em>Related Objects</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcObjectDefinition> relatedObjects;

	/**
	 * The default value of the '{@link #getRelatedObjectsType() <em>Related Objects Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedObjectsType()
	 * @generated
	 * @ordered
	 */
	protected static final IfcObjectTypeEnum RELATED_OBJECTS_TYPE_EDEFAULT = IfcObjectTypeEnum.NULL;

	/**
	 * The cached value of the '{@link #getRelatedObjectsType() <em>Related Objects Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedObjectsType()
	 * @generated
	 * @ordered
	 */
	protected IfcObjectTypeEnum relatedObjectsType = RELATED_OBJECTS_TYPE_EDEFAULT;

	/**
	 * This is true if the Related Objects Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean relatedObjectsTypeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelAssignsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcRelAssigns();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcObjectDefinition> getRelatedObjects() {
		if (relatedObjects == null) {
			relatedObjects = new EObjectWithInverseResolvingEList.ManyInverse<IfcObjectDefinition>(IfcObjectDefinition.class, this, Ifc2x3tc1Package.IFC_REL_ASSIGNS__RELATED_OBJECTS, Ifc2x3tc1Package.IFC_OBJECT_DEFINITION__HAS_ASSIGNMENTS);
		}
		return relatedObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcObjectTypeEnum getRelatedObjectsType() {
		return relatedObjectsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedObjectsType(IfcObjectTypeEnum newRelatedObjectsType) {
		IfcObjectTypeEnum oldRelatedObjectsType = relatedObjectsType;
		relatedObjectsType = newRelatedObjectsType == null ? RELATED_OBJECTS_TYPE_EDEFAULT : newRelatedObjectsType;
		boolean oldRelatedObjectsTypeESet = relatedObjectsTypeESet;
		relatedObjectsTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_ASSIGNS__RELATED_OBJECTS_TYPE, oldRelatedObjectsType, relatedObjectsType, !oldRelatedObjectsTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRelatedObjectsType() {
		IfcObjectTypeEnum oldRelatedObjectsType = relatedObjectsType;
		boolean oldRelatedObjectsTypeESet = relatedObjectsTypeESet;
		relatedObjectsType = RELATED_OBJECTS_TYPE_EDEFAULT;
		relatedObjectsTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_REL_ASSIGNS__RELATED_OBJECTS_TYPE, oldRelatedObjectsType, RELATED_OBJECTS_TYPE_EDEFAULT, oldRelatedObjectsTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRelatedObjectsType() {
		return relatedObjectsTypeESet;
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
			case Ifc2x3tc1Package.IFC_REL_ASSIGNS__RELATED_OBJECTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRelatedObjects()).basicAdd(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_REL_ASSIGNS__RELATED_OBJECTS:
				return ((InternalEList<?>)getRelatedObjects()).basicRemove(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_REL_ASSIGNS__RELATED_OBJECTS:
				return getRelatedObjects();
			case Ifc2x3tc1Package.IFC_REL_ASSIGNS__RELATED_OBJECTS_TYPE:
				return getRelatedObjectsType();
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
			case Ifc2x3tc1Package.IFC_REL_ASSIGNS__RELATED_OBJECTS:
				getRelatedObjects().clear();
				getRelatedObjects().addAll((Collection<? extends IfcObjectDefinition>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REL_ASSIGNS__RELATED_OBJECTS_TYPE:
				setRelatedObjectsType((IfcObjectTypeEnum)newValue);
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
			case Ifc2x3tc1Package.IFC_REL_ASSIGNS__RELATED_OBJECTS:
				getRelatedObjects().clear();
				return;
			case Ifc2x3tc1Package.IFC_REL_ASSIGNS__RELATED_OBJECTS_TYPE:
				unsetRelatedObjectsType();
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
			case Ifc2x3tc1Package.IFC_REL_ASSIGNS__RELATED_OBJECTS:
				return relatedObjects != null && !relatedObjects.isEmpty();
			case Ifc2x3tc1Package.IFC_REL_ASSIGNS__RELATED_OBJECTS_TYPE:
				return isSetRelatedObjectsType();
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
		result.append(" (RelatedObjectsType: ");
		if (relatedObjectsTypeESet) result.append(relatedObjectsType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcRelAssignsImpl
