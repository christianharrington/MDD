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

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcOrganization;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPerson;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPersonAndOrganization;
import org.tech.iai.ifc.xml.ifc._2x3.final_.SuppliersType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Suppliers Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.SuppliersTypeImpl#getIfcActorSelect <em>Ifc Actor Select</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.SuppliersTypeImpl#getIfcOrganization <em>Ifc Organization</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.SuppliersTypeImpl#getIfcPerson <em>Ifc Person</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.SuppliersTypeImpl#getIfcPersonAndOrganization <em>Ifc Person And Organization</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.SuppliersTypeImpl#getArraySize <em>Array Size</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.SuppliersTypeImpl#getCType <em>CType</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.SuppliersTypeImpl#getItemType <em>Item Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SuppliersTypeImpl extends EObjectImpl implements SuppliersType {
	/**
	 * The cached value of the '{@link #getIfcActorSelect() <em>Ifc Actor Select</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcActorSelect()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcActorSelect;

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
	protected static final QName ITEM_TYPE_EDEFAULT = (QName)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.eINSTANCE.getQName(), "ifc:IfcActorSelect");

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
	protected SuppliersTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getSuppliersType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcActorSelect() {
		if (ifcActorSelect == null) {
			ifcActorSelect = new BasicFeatureMap(this, FinalPackage.SUPPLIERS_TYPE__IFC_ACTOR_SELECT);
		}
		return ifcActorSelect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcOrganization> getIfcOrganization() {
		return getIfcActorSelect().list(FinalPackage.eINSTANCE.getSuppliersType_IfcOrganization());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcPerson> getIfcPerson() {
		return getIfcActorSelect().list(FinalPackage.eINSTANCE.getSuppliersType_IfcPerson());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcPersonAndOrganization> getIfcPersonAndOrganization() {
		return getIfcActorSelect().list(FinalPackage.eINSTANCE.getSuppliersType_IfcPersonAndOrganization());
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.SUPPLIERS_TYPE__ARRAY_SIZE, oldArraySize, arraySize));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.SUPPLIERS_TYPE__CTYPE, oldCType, cType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.SUPPLIERS_TYPE__ITEM_TYPE, oldItemType, itemType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.SUPPLIERS_TYPE__IFC_ACTOR_SELECT:
				return ((InternalEList<?>)getIfcActorSelect()).basicRemove(otherEnd, msgs);
			case FinalPackage.SUPPLIERS_TYPE__IFC_ORGANIZATION:
				return ((InternalEList<?>)getIfcOrganization()).basicRemove(otherEnd, msgs);
			case FinalPackage.SUPPLIERS_TYPE__IFC_PERSON:
				return ((InternalEList<?>)getIfcPerson()).basicRemove(otherEnd, msgs);
			case FinalPackage.SUPPLIERS_TYPE__IFC_PERSON_AND_ORGANIZATION:
				return ((InternalEList<?>)getIfcPersonAndOrganization()).basicRemove(otherEnd, msgs);
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
			case FinalPackage.SUPPLIERS_TYPE__IFC_ACTOR_SELECT:
				if (coreType) return getIfcActorSelect();
				return ((FeatureMap.Internal)getIfcActorSelect()).getWrapper();
			case FinalPackage.SUPPLIERS_TYPE__IFC_ORGANIZATION:
				return getIfcOrganization();
			case FinalPackage.SUPPLIERS_TYPE__IFC_PERSON:
				return getIfcPerson();
			case FinalPackage.SUPPLIERS_TYPE__IFC_PERSON_AND_ORGANIZATION:
				return getIfcPersonAndOrganization();
			case FinalPackage.SUPPLIERS_TYPE__ARRAY_SIZE:
				return getArraySize();
			case FinalPackage.SUPPLIERS_TYPE__CTYPE:
				return getCType();
			case FinalPackage.SUPPLIERS_TYPE__ITEM_TYPE:
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
			case FinalPackage.SUPPLIERS_TYPE__IFC_ACTOR_SELECT:
				((FeatureMap.Internal)getIfcActorSelect()).set(newValue);
				return;
			case FinalPackage.SUPPLIERS_TYPE__IFC_ORGANIZATION:
				getIfcOrganization().clear();
				getIfcOrganization().addAll((Collection<? extends IfcOrganization>)newValue);
				return;
			case FinalPackage.SUPPLIERS_TYPE__IFC_PERSON:
				getIfcPerson().clear();
				getIfcPerson().addAll((Collection<? extends IfcPerson>)newValue);
				return;
			case FinalPackage.SUPPLIERS_TYPE__IFC_PERSON_AND_ORGANIZATION:
				getIfcPersonAndOrganization().clear();
				getIfcPersonAndOrganization().addAll((Collection<? extends IfcPersonAndOrganization>)newValue);
				return;
			case FinalPackage.SUPPLIERS_TYPE__ARRAY_SIZE:
				setArraySize((List<BigInteger>)newValue);
				return;
			case FinalPackage.SUPPLIERS_TYPE__CTYPE:
				setCType((List<AggregateType>)newValue);
				return;
			case FinalPackage.SUPPLIERS_TYPE__ITEM_TYPE:
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
			case FinalPackage.SUPPLIERS_TYPE__IFC_ACTOR_SELECT:
				getIfcActorSelect().clear();
				return;
			case FinalPackage.SUPPLIERS_TYPE__IFC_ORGANIZATION:
				getIfcOrganization().clear();
				return;
			case FinalPackage.SUPPLIERS_TYPE__IFC_PERSON:
				getIfcPerson().clear();
				return;
			case FinalPackage.SUPPLIERS_TYPE__IFC_PERSON_AND_ORGANIZATION:
				getIfcPersonAndOrganization().clear();
				return;
			case FinalPackage.SUPPLIERS_TYPE__ARRAY_SIZE:
				setArraySize(ARRAY_SIZE_EDEFAULT);
				return;
			case FinalPackage.SUPPLIERS_TYPE__CTYPE:
				setCType(CTYPE_EDEFAULT);
				return;
			case FinalPackage.SUPPLIERS_TYPE__ITEM_TYPE:
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
			case FinalPackage.SUPPLIERS_TYPE__IFC_ACTOR_SELECT:
				return ifcActorSelect != null && !ifcActorSelect.isEmpty();
			case FinalPackage.SUPPLIERS_TYPE__IFC_ORGANIZATION:
				return !getIfcOrganization().isEmpty();
			case FinalPackage.SUPPLIERS_TYPE__IFC_PERSON:
				return !getIfcPerson().isEmpty();
			case FinalPackage.SUPPLIERS_TYPE__IFC_PERSON_AND_ORGANIZATION:
				return !getIfcPersonAndOrganization().isEmpty();
			case FinalPackage.SUPPLIERS_TYPE__ARRAY_SIZE:
				return ARRAY_SIZE_EDEFAULT == null ? arraySize != null : !ARRAY_SIZE_EDEFAULT.equals(arraySize);
			case FinalPackage.SUPPLIERS_TYPE__CTYPE:
				return CTYPE_EDEFAULT == null ? cType != null : !CTYPE_EDEFAULT.equals(cType);
			case FinalPackage.SUPPLIERS_TYPE__ITEM_TYPE:
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
		result.append(" (ifcActorSelect: ");
		result.append(ifcActorSelect);
		result.append(", arraySize: ");
		result.append(arraySize);
		result.append(", cType: ");
		result.append(cType);
		result.append(", itemType: ");
		result.append(itemType);
		result.append(')');
		return result.toString();
	}

} //SuppliersTypeImpl
