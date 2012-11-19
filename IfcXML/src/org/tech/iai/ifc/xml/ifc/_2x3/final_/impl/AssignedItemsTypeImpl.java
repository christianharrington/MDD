/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import java.math.BigInteger;

import java.util.Collection;
import java.util.List;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.AggregateType;
import org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonFactory;
import org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonPackage;

import org.tech.iai.ifc.xml.ifc._2x3.final_.AssignedItemsType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRepresentation;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRepresentationItem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assigned Items Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.AssignedItemsTypeImpl#getIfcLayeredItem <em>Ifc Layered Item</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.AssignedItemsTypeImpl#getIfcRepresentationItemGroup <em>Ifc Representation Item Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.AssignedItemsTypeImpl#getIfcRepresentationItem <em>Ifc Representation Item</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.AssignedItemsTypeImpl#getIfcRepresentationGroup <em>Ifc Representation Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.AssignedItemsTypeImpl#getIfcRepresentation <em>Ifc Representation</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.AssignedItemsTypeImpl#getArraySize <em>Array Size</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.AssignedItemsTypeImpl#getCType <em>CType</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.AssignedItemsTypeImpl#getItemType <em>Item Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssignedItemsTypeImpl extends EObjectImpl implements AssignedItemsType {
	/**
	 * The cached value of the '{@link #getIfcLayeredItem() <em>Ifc Layered Item</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcLayeredItem()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcLayeredItem;

	/**
	 * The default value of the '{@link #getArraySize() <em>Array Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArraySize()
	 * @generated
	 * @ordered
	 */
	protected static final List<BigInteger> ARRAY_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArraySize() <em>Array Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArraySize()
	 * @generated
	 * @ordered
	 */
	protected List<BigInteger> arraySize = ARRAY_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCType() <em>CType</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCType()
	 * @generated
	 * @ordered
	 */
	@SuppressWarnings("unchecked")
	protected static final List<AggregateType> CTYPE_EDEFAULT = (List<AggregateType>)CommonFactory.eINSTANCE.createFromString(CommonPackage.eINSTANCE.getCTypeType(), "set");

	/**
	 * The cached value of the '{@link #getCType() <em>CType</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCType()
	 * @generated
	 * @ordered
	 */
	protected List<AggregateType> cType = CTYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getItemType() <em>Item Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemType()
	 * @generated
	 * @ordered
	 */
	protected static final QName ITEM_TYPE_EDEFAULT = (QName)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.eINSTANCE.getQName(), "ifc:IfcLayeredItem");

	/**
	 * The cached value of the '{@link #getItemType() <em>Item Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemType()
	 * @generated
	 * @ordered
	 */
	protected QName itemType = ITEM_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignedItemsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getAssignedItemsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcLayeredItem() {
		if (ifcLayeredItem == null) {
			ifcLayeredItem = new BasicFeatureMap(this, FinalPackage.ASSIGNED_ITEMS_TYPE__IFC_LAYERED_ITEM);
		}
		return ifcLayeredItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcRepresentationItemGroup() {
		return (FeatureMap)getIfcLayeredItem().<FeatureMap.Entry>list(FinalPackage.eINSTANCE.getAssignedItemsType_IfcRepresentationItemGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcRepresentationItem> getIfcRepresentationItem() {
		return getIfcRepresentationItemGroup().list(FinalPackage.eINSTANCE.getAssignedItemsType_IfcRepresentationItem());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcRepresentationGroup() {
		return (FeatureMap)getIfcLayeredItem().<FeatureMap.Entry>list(FinalPackage.eINSTANCE.getAssignedItemsType_IfcRepresentationGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcRepresentation> getIfcRepresentation() {
		return getIfcRepresentationGroup().list(FinalPackage.eINSTANCE.getAssignedItemsType_IfcRepresentation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<BigInteger> getArraySize() {
		return arraySize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArraySize(List<BigInteger> newArraySize) {
		List<BigInteger> oldArraySize = arraySize;
		arraySize = newArraySize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.ASSIGNED_ITEMS_TYPE__ARRAY_SIZE, oldArraySize, arraySize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<AggregateType> getCType() {
		return cType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCType(List<AggregateType> newCType) {
		List<AggregateType> oldCType = cType;
		cType = newCType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.ASSIGNED_ITEMS_TYPE__CTYPE, oldCType, cType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName getItemType() {
		return itemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemType(QName newItemType) {
		QName oldItemType = itemType;
		itemType = newItemType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.ASSIGNED_ITEMS_TYPE__ITEM_TYPE, oldItemType, itemType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.ASSIGNED_ITEMS_TYPE__IFC_LAYERED_ITEM:
				return ((InternalEList<?>)getIfcLayeredItem()).basicRemove(otherEnd, msgs);
			case FinalPackage.ASSIGNED_ITEMS_TYPE__IFC_REPRESENTATION_ITEM_GROUP:
				return ((InternalEList<?>)getIfcRepresentationItemGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.ASSIGNED_ITEMS_TYPE__IFC_REPRESENTATION_ITEM:
				return ((InternalEList<?>)getIfcRepresentationItem()).basicRemove(otherEnd, msgs);
			case FinalPackage.ASSIGNED_ITEMS_TYPE__IFC_REPRESENTATION_GROUP:
				return ((InternalEList<?>)getIfcRepresentationGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.ASSIGNED_ITEMS_TYPE__IFC_REPRESENTATION:
				return ((InternalEList<?>)getIfcRepresentation()).basicRemove(otherEnd, msgs);
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
			case FinalPackage.ASSIGNED_ITEMS_TYPE__IFC_LAYERED_ITEM:
				if (coreType) return getIfcLayeredItem();
				return ((FeatureMap.Internal)getIfcLayeredItem()).getWrapper();
			case FinalPackage.ASSIGNED_ITEMS_TYPE__IFC_REPRESENTATION_ITEM_GROUP:
				if (coreType) return getIfcRepresentationItemGroup();
				return ((FeatureMap.Internal)getIfcRepresentationItemGroup()).getWrapper();
			case FinalPackage.ASSIGNED_ITEMS_TYPE__IFC_REPRESENTATION_ITEM:
				return getIfcRepresentationItem();
			case FinalPackage.ASSIGNED_ITEMS_TYPE__IFC_REPRESENTATION_GROUP:
				if (coreType) return getIfcRepresentationGroup();
				return ((FeatureMap.Internal)getIfcRepresentationGroup()).getWrapper();
			case FinalPackage.ASSIGNED_ITEMS_TYPE__IFC_REPRESENTATION:
				return getIfcRepresentation();
			case FinalPackage.ASSIGNED_ITEMS_TYPE__ARRAY_SIZE:
				return getArraySize();
			case FinalPackage.ASSIGNED_ITEMS_TYPE__CTYPE:
				return getCType();
			case FinalPackage.ASSIGNED_ITEMS_TYPE__ITEM_TYPE:
				return getItemType();
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
			case FinalPackage.ASSIGNED_ITEMS_TYPE__IFC_LAYERED_ITEM:
				((FeatureMap.Internal)getIfcLayeredItem()).set(newValue);
				return;
			case FinalPackage.ASSIGNED_ITEMS_TYPE__IFC_REPRESENTATION_ITEM_GROUP:
				((FeatureMap.Internal)getIfcRepresentationItemGroup()).set(newValue);
				return;
			case FinalPackage.ASSIGNED_ITEMS_TYPE__IFC_REPRESENTATION_GROUP:
				((FeatureMap.Internal)getIfcRepresentationGroup()).set(newValue);
				return;
			case FinalPackage.ASSIGNED_ITEMS_TYPE__IFC_REPRESENTATION:
				getIfcRepresentation().clear();
				getIfcRepresentation().addAll((Collection<? extends IfcRepresentation>)newValue);
				return;
			case FinalPackage.ASSIGNED_ITEMS_TYPE__ARRAY_SIZE:
				setArraySize((List<BigInteger>)newValue);
				return;
			case FinalPackage.ASSIGNED_ITEMS_TYPE__CTYPE:
				setCType((List<AggregateType>)newValue);
				return;
			case FinalPackage.ASSIGNED_ITEMS_TYPE__ITEM_TYPE:
				setItemType((QName)newValue);
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
			case FinalPackage.ASSIGNED_ITEMS_TYPE__IFC_LAYERED_ITEM:
				getIfcLayeredItem().clear();
				return;
			case FinalPackage.ASSIGNED_ITEMS_TYPE__IFC_REPRESENTATION_ITEM_GROUP:
				getIfcRepresentationItemGroup().clear();
				return;
			case FinalPackage.ASSIGNED_ITEMS_TYPE__IFC_REPRESENTATION_GROUP:
				getIfcRepresentationGroup().clear();
				return;
			case FinalPackage.ASSIGNED_ITEMS_TYPE__IFC_REPRESENTATION:
				getIfcRepresentation().clear();
				return;
			case FinalPackage.ASSIGNED_ITEMS_TYPE__ARRAY_SIZE:
				setArraySize(ARRAY_SIZE_EDEFAULT);
				return;
			case FinalPackage.ASSIGNED_ITEMS_TYPE__CTYPE:
				setCType(CTYPE_EDEFAULT);
				return;
			case FinalPackage.ASSIGNED_ITEMS_TYPE__ITEM_TYPE:
				setItemType(ITEM_TYPE_EDEFAULT);
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
			case FinalPackage.ASSIGNED_ITEMS_TYPE__IFC_LAYERED_ITEM:
				return ifcLayeredItem != null && !ifcLayeredItem.isEmpty();
			case FinalPackage.ASSIGNED_ITEMS_TYPE__IFC_REPRESENTATION_ITEM_GROUP:
				return !getIfcRepresentationItemGroup().isEmpty();
			case FinalPackage.ASSIGNED_ITEMS_TYPE__IFC_REPRESENTATION_ITEM:
				return !getIfcRepresentationItem().isEmpty();
			case FinalPackage.ASSIGNED_ITEMS_TYPE__IFC_REPRESENTATION_GROUP:
				return !getIfcRepresentationGroup().isEmpty();
			case FinalPackage.ASSIGNED_ITEMS_TYPE__IFC_REPRESENTATION:
				return !getIfcRepresentation().isEmpty();
			case FinalPackage.ASSIGNED_ITEMS_TYPE__ARRAY_SIZE:
				return ARRAY_SIZE_EDEFAULT == null ? arraySize != null : !ARRAY_SIZE_EDEFAULT.equals(arraySize);
			case FinalPackage.ASSIGNED_ITEMS_TYPE__CTYPE:
				return CTYPE_EDEFAULT == null ? cType != null : !CTYPE_EDEFAULT.equals(cType);
			case FinalPackage.ASSIGNED_ITEMS_TYPE__ITEM_TYPE:
				return ITEM_TYPE_EDEFAULT == null ? itemType != null : !ITEM_TYPE_EDEFAULT.equals(itemType);
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
		result.append(" (ifcLayeredItem: ");
		result.append(ifcLayeredItem);
		result.append(", arraySize: ");
		result.append(arraySize);
		result.append(", cType: ");
		result.append(cType);
		result.append(", itemType: ");
		result.append(itemType);
		result.append(')');
		return result.toString();
	}

} //AssignedItemsTypeImpl
