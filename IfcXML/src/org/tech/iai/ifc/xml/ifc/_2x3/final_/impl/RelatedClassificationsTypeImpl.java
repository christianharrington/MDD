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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcClassificationNotation;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcClassificationReference;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatedClassificationsType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Related Classifications Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.RelatedClassificationsTypeImpl#getIfcClassificationNotationSelect <em>Ifc Classification Notation Select</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.RelatedClassificationsTypeImpl#getIfcClassificationNotation <em>Ifc Classification Notation</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.RelatedClassificationsTypeImpl#getIfcClassificationReference <em>Ifc Classification Reference</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.RelatedClassificationsTypeImpl#getArraySize <em>Array Size</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.RelatedClassificationsTypeImpl#getCType <em>CType</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.RelatedClassificationsTypeImpl#getItemType <em>Item Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelatedClassificationsTypeImpl extends EObjectImpl implements RelatedClassificationsType {
	/**
	 * The cached value of the '{@link #getIfcClassificationNotationSelect() <em>Ifc Classification Notation Select</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcClassificationNotationSelect()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcClassificationNotationSelect;

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
	protected static final QName ITEM_TYPE_EDEFAULT = (QName)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.eINSTANCE.getQName(), "ifc:IfcClassificationNotationSelect");

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
	protected RelatedClassificationsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getRelatedClassificationsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcClassificationNotationSelect() {
		if (ifcClassificationNotationSelect == null) {
			ifcClassificationNotationSelect = new BasicFeatureMap(this, FinalPackage.RELATED_CLASSIFICATIONS_TYPE__IFC_CLASSIFICATION_NOTATION_SELECT);
		}
		return ifcClassificationNotationSelect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcClassificationNotation> getIfcClassificationNotation() {
		return getIfcClassificationNotationSelect().list(FinalPackage.eINSTANCE.getRelatedClassificationsType_IfcClassificationNotation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcClassificationReference> getIfcClassificationReference() {
		return getIfcClassificationNotationSelect().list(FinalPackage.eINSTANCE.getRelatedClassificationsType_IfcClassificationReference());
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.RELATED_CLASSIFICATIONS_TYPE__ARRAY_SIZE, oldArraySize, arraySize));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.RELATED_CLASSIFICATIONS_TYPE__CTYPE, oldCType, cType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.RELATED_CLASSIFICATIONS_TYPE__ITEM_TYPE, oldItemType, itemType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.RELATED_CLASSIFICATIONS_TYPE__IFC_CLASSIFICATION_NOTATION_SELECT:
				return ((InternalEList<?>)getIfcClassificationNotationSelect()).basicRemove(otherEnd, msgs);
			case FinalPackage.RELATED_CLASSIFICATIONS_TYPE__IFC_CLASSIFICATION_NOTATION:
				return ((InternalEList<?>)getIfcClassificationNotation()).basicRemove(otherEnd, msgs);
			case FinalPackage.RELATED_CLASSIFICATIONS_TYPE__IFC_CLASSIFICATION_REFERENCE:
				return ((InternalEList<?>)getIfcClassificationReference()).basicRemove(otherEnd, msgs);
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
			case FinalPackage.RELATED_CLASSIFICATIONS_TYPE__IFC_CLASSIFICATION_NOTATION_SELECT:
				if (coreType) return getIfcClassificationNotationSelect();
				return ((FeatureMap.Internal)getIfcClassificationNotationSelect()).getWrapper();
			case FinalPackage.RELATED_CLASSIFICATIONS_TYPE__IFC_CLASSIFICATION_NOTATION:
				return getIfcClassificationNotation();
			case FinalPackage.RELATED_CLASSIFICATIONS_TYPE__IFC_CLASSIFICATION_REFERENCE:
				return getIfcClassificationReference();
			case FinalPackage.RELATED_CLASSIFICATIONS_TYPE__ARRAY_SIZE:
				return getArraySize();
			case FinalPackage.RELATED_CLASSIFICATIONS_TYPE__CTYPE:
				return getCType();
			case FinalPackage.RELATED_CLASSIFICATIONS_TYPE__ITEM_TYPE:
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
			case FinalPackage.RELATED_CLASSIFICATIONS_TYPE__IFC_CLASSIFICATION_NOTATION_SELECT:
				((FeatureMap.Internal)getIfcClassificationNotationSelect()).set(newValue);
				return;
			case FinalPackage.RELATED_CLASSIFICATIONS_TYPE__IFC_CLASSIFICATION_NOTATION:
				getIfcClassificationNotation().clear();
				getIfcClassificationNotation().addAll((Collection<? extends IfcClassificationNotation>)newValue);
				return;
			case FinalPackage.RELATED_CLASSIFICATIONS_TYPE__IFC_CLASSIFICATION_REFERENCE:
				getIfcClassificationReference().clear();
				getIfcClassificationReference().addAll((Collection<? extends IfcClassificationReference>)newValue);
				return;
			case FinalPackage.RELATED_CLASSIFICATIONS_TYPE__ARRAY_SIZE:
				setArraySize((List<BigInteger>)newValue);
				return;
			case FinalPackage.RELATED_CLASSIFICATIONS_TYPE__CTYPE:
				setCType((List<AggregateType>)newValue);
				return;
			case FinalPackage.RELATED_CLASSIFICATIONS_TYPE__ITEM_TYPE:
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
			case FinalPackage.RELATED_CLASSIFICATIONS_TYPE__IFC_CLASSIFICATION_NOTATION_SELECT:
				getIfcClassificationNotationSelect().clear();
				return;
			case FinalPackage.RELATED_CLASSIFICATIONS_TYPE__IFC_CLASSIFICATION_NOTATION:
				getIfcClassificationNotation().clear();
				return;
			case FinalPackage.RELATED_CLASSIFICATIONS_TYPE__IFC_CLASSIFICATION_REFERENCE:
				getIfcClassificationReference().clear();
				return;
			case FinalPackage.RELATED_CLASSIFICATIONS_TYPE__ARRAY_SIZE:
				setArraySize(ARRAY_SIZE_EDEFAULT);
				return;
			case FinalPackage.RELATED_CLASSIFICATIONS_TYPE__CTYPE:
				setCType(CTYPE_EDEFAULT);
				return;
			case FinalPackage.RELATED_CLASSIFICATIONS_TYPE__ITEM_TYPE:
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
			case FinalPackage.RELATED_CLASSIFICATIONS_TYPE__IFC_CLASSIFICATION_NOTATION_SELECT:
				return ifcClassificationNotationSelect != null && !ifcClassificationNotationSelect.isEmpty();
			case FinalPackage.RELATED_CLASSIFICATIONS_TYPE__IFC_CLASSIFICATION_NOTATION:
				return !getIfcClassificationNotation().isEmpty();
			case FinalPackage.RELATED_CLASSIFICATIONS_TYPE__IFC_CLASSIFICATION_REFERENCE:
				return !getIfcClassificationReference().isEmpty();
			case FinalPackage.RELATED_CLASSIFICATIONS_TYPE__ARRAY_SIZE:
				return ARRAY_SIZE_EDEFAULT == null ? arraySize != null : !ARRAY_SIZE_EDEFAULT.equals(arraySize);
			case FinalPackage.RELATED_CLASSIFICATIONS_TYPE__CTYPE:
				return CTYPE_EDEFAULT == null ? cType != null : !CTYPE_EDEFAULT.equals(cType);
			case FinalPackage.RELATED_CLASSIFICATIONS_TYPE__ITEM_TYPE:
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
		result.append(" (ifcClassificationNotationSelect: ");
		result.append(ifcClassificationNotationSelect);
		result.append(", arraySize: ");
		result.append(arraySize);
		result.append(", cType: ");
		result.append(cType);
		result.append(", itemType: ");
		result.append(itemType);
		result.append(')');
		return result.toString();
	}

} //RelatedClassificationsTypeImpl