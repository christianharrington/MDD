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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcBooleanType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcIdentifierType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcIntegerType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLabelType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLogicalType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRealType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.ParameterType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ParameterTypeImpl#getIfcSimpleValue <em>Ifc Simple Value</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ParameterTypeImpl#getIfcInteger <em>Ifc Integer</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ParameterTypeImpl#getIfcReal <em>Ifc Real</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ParameterTypeImpl#getIfcBoolean <em>Ifc Boolean</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ParameterTypeImpl#getIfcIdentifier <em>Ifc Identifier</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ParameterTypeImpl#getIfcText <em>Ifc Text</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ParameterTypeImpl#getIfcLabel <em>Ifc Label</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ParameterTypeImpl#getIfcLogical <em>Ifc Logical</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ParameterTypeImpl#getArraySize <em>Array Size</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ParameterTypeImpl#getCType <em>CType</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ParameterTypeImpl#getItemType <em>Item Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterTypeImpl extends EObjectImpl implements ParameterType {
	/**
	 * The cached value of the '{@link #getIfcSimpleValue() <em>Ifc Simple Value</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcSimpleValue()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcSimpleValue;

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
	protected static final List<AggregateType> CTYPE_EDEFAULT = (List<AggregateType>)CommonFactory.eINSTANCE.createFromString(CommonPackage.eINSTANCE.getCTypeType(), "list");

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
	protected static final QName ITEM_TYPE_EDEFAULT = (QName)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.eINSTANCE.getQName(), "ifc:IfcSimpleValue");

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
	protected ParameterTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getParameterType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcSimpleValue() {
		if (ifcSimpleValue == null) {
			ifcSimpleValue = new BasicFeatureMap(this, FinalPackage.PARAMETER_TYPE__IFC_SIMPLE_VALUE);
		}
		return ifcSimpleValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcIntegerType> getIfcInteger() {
		return getIfcSimpleValue().list(FinalPackage.eINSTANCE.getParameterType_IfcInteger());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcRealType> getIfcReal() {
		return getIfcSimpleValue().list(FinalPackage.eINSTANCE.getParameterType_IfcReal());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcBooleanType> getIfcBoolean() {
		return getIfcSimpleValue().list(FinalPackage.eINSTANCE.getParameterType_IfcBoolean());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcIdentifierType> getIfcIdentifier() {
		return getIfcSimpleValue().list(FinalPackage.eINSTANCE.getParameterType_IfcIdentifier());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcTextType> getIfcText() {
		return getIfcSimpleValue().list(FinalPackage.eINSTANCE.getParameterType_IfcText());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcLabelType> getIfcLabel() {
		return getIfcSimpleValue().list(FinalPackage.eINSTANCE.getParameterType_IfcLabel());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcLogicalType> getIfcLogical() {
		return getIfcSimpleValue().list(FinalPackage.eINSTANCE.getParameterType_IfcLogical());
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.PARAMETER_TYPE__ARRAY_SIZE, oldArraySize, arraySize));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.PARAMETER_TYPE__CTYPE, oldCType, cType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.PARAMETER_TYPE__ITEM_TYPE, oldItemType, itemType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.PARAMETER_TYPE__IFC_SIMPLE_VALUE:
				return ((InternalEList<?>)getIfcSimpleValue()).basicRemove(otherEnd, msgs);
			case FinalPackage.PARAMETER_TYPE__IFC_INTEGER:
				return ((InternalEList<?>)getIfcInteger()).basicRemove(otherEnd, msgs);
			case FinalPackage.PARAMETER_TYPE__IFC_REAL:
				return ((InternalEList<?>)getIfcReal()).basicRemove(otherEnd, msgs);
			case FinalPackage.PARAMETER_TYPE__IFC_BOOLEAN:
				return ((InternalEList<?>)getIfcBoolean()).basicRemove(otherEnd, msgs);
			case FinalPackage.PARAMETER_TYPE__IFC_IDENTIFIER:
				return ((InternalEList<?>)getIfcIdentifier()).basicRemove(otherEnd, msgs);
			case FinalPackage.PARAMETER_TYPE__IFC_TEXT:
				return ((InternalEList<?>)getIfcText()).basicRemove(otherEnd, msgs);
			case FinalPackage.PARAMETER_TYPE__IFC_LABEL:
				return ((InternalEList<?>)getIfcLabel()).basicRemove(otherEnd, msgs);
			case FinalPackage.PARAMETER_TYPE__IFC_LOGICAL:
				return ((InternalEList<?>)getIfcLogical()).basicRemove(otherEnd, msgs);
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
			case FinalPackage.PARAMETER_TYPE__IFC_SIMPLE_VALUE:
				if (coreType) return getIfcSimpleValue();
				return ((FeatureMap.Internal)getIfcSimpleValue()).getWrapper();
			case FinalPackage.PARAMETER_TYPE__IFC_INTEGER:
				return getIfcInteger();
			case FinalPackage.PARAMETER_TYPE__IFC_REAL:
				return getIfcReal();
			case FinalPackage.PARAMETER_TYPE__IFC_BOOLEAN:
				return getIfcBoolean();
			case FinalPackage.PARAMETER_TYPE__IFC_IDENTIFIER:
				return getIfcIdentifier();
			case FinalPackage.PARAMETER_TYPE__IFC_TEXT:
				return getIfcText();
			case FinalPackage.PARAMETER_TYPE__IFC_LABEL:
				return getIfcLabel();
			case FinalPackage.PARAMETER_TYPE__IFC_LOGICAL:
				return getIfcLogical();
			case FinalPackage.PARAMETER_TYPE__ARRAY_SIZE:
				return getArraySize();
			case FinalPackage.PARAMETER_TYPE__CTYPE:
				return getCType();
			case FinalPackage.PARAMETER_TYPE__ITEM_TYPE:
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
			case FinalPackage.PARAMETER_TYPE__IFC_SIMPLE_VALUE:
				((FeatureMap.Internal)getIfcSimpleValue()).set(newValue);
				return;
			case FinalPackage.PARAMETER_TYPE__IFC_INTEGER:
				getIfcInteger().clear();
				getIfcInteger().addAll((Collection<? extends IfcIntegerType>)newValue);
				return;
			case FinalPackage.PARAMETER_TYPE__IFC_REAL:
				getIfcReal().clear();
				getIfcReal().addAll((Collection<? extends IfcRealType>)newValue);
				return;
			case FinalPackage.PARAMETER_TYPE__IFC_BOOLEAN:
				getIfcBoolean().clear();
				getIfcBoolean().addAll((Collection<? extends IfcBooleanType>)newValue);
				return;
			case FinalPackage.PARAMETER_TYPE__IFC_IDENTIFIER:
				getIfcIdentifier().clear();
				getIfcIdentifier().addAll((Collection<? extends IfcIdentifierType>)newValue);
				return;
			case FinalPackage.PARAMETER_TYPE__IFC_TEXT:
				getIfcText().clear();
				getIfcText().addAll((Collection<? extends IfcTextType>)newValue);
				return;
			case FinalPackage.PARAMETER_TYPE__IFC_LABEL:
				getIfcLabel().clear();
				getIfcLabel().addAll((Collection<? extends IfcLabelType>)newValue);
				return;
			case FinalPackage.PARAMETER_TYPE__IFC_LOGICAL:
				getIfcLogical().clear();
				getIfcLogical().addAll((Collection<? extends IfcLogicalType>)newValue);
				return;
			case FinalPackage.PARAMETER_TYPE__ARRAY_SIZE:
				setArraySize((List<BigInteger>)newValue);
				return;
			case FinalPackage.PARAMETER_TYPE__CTYPE:
				setCType((List<AggregateType>)newValue);
				return;
			case FinalPackage.PARAMETER_TYPE__ITEM_TYPE:
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
			case FinalPackage.PARAMETER_TYPE__IFC_SIMPLE_VALUE:
				getIfcSimpleValue().clear();
				return;
			case FinalPackage.PARAMETER_TYPE__IFC_INTEGER:
				getIfcInteger().clear();
				return;
			case FinalPackage.PARAMETER_TYPE__IFC_REAL:
				getIfcReal().clear();
				return;
			case FinalPackage.PARAMETER_TYPE__IFC_BOOLEAN:
				getIfcBoolean().clear();
				return;
			case FinalPackage.PARAMETER_TYPE__IFC_IDENTIFIER:
				getIfcIdentifier().clear();
				return;
			case FinalPackage.PARAMETER_TYPE__IFC_TEXT:
				getIfcText().clear();
				return;
			case FinalPackage.PARAMETER_TYPE__IFC_LABEL:
				getIfcLabel().clear();
				return;
			case FinalPackage.PARAMETER_TYPE__IFC_LOGICAL:
				getIfcLogical().clear();
				return;
			case FinalPackage.PARAMETER_TYPE__ARRAY_SIZE:
				setArraySize(ARRAY_SIZE_EDEFAULT);
				return;
			case FinalPackage.PARAMETER_TYPE__CTYPE:
				setCType(CTYPE_EDEFAULT);
				return;
			case FinalPackage.PARAMETER_TYPE__ITEM_TYPE:
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
			case FinalPackage.PARAMETER_TYPE__IFC_SIMPLE_VALUE:
				return ifcSimpleValue != null && !ifcSimpleValue.isEmpty();
			case FinalPackage.PARAMETER_TYPE__IFC_INTEGER:
				return !getIfcInteger().isEmpty();
			case FinalPackage.PARAMETER_TYPE__IFC_REAL:
				return !getIfcReal().isEmpty();
			case FinalPackage.PARAMETER_TYPE__IFC_BOOLEAN:
				return !getIfcBoolean().isEmpty();
			case FinalPackage.PARAMETER_TYPE__IFC_IDENTIFIER:
				return !getIfcIdentifier().isEmpty();
			case FinalPackage.PARAMETER_TYPE__IFC_TEXT:
				return !getIfcText().isEmpty();
			case FinalPackage.PARAMETER_TYPE__IFC_LABEL:
				return !getIfcLabel().isEmpty();
			case FinalPackage.PARAMETER_TYPE__IFC_LOGICAL:
				return !getIfcLogical().isEmpty();
			case FinalPackage.PARAMETER_TYPE__ARRAY_SIZE:
				return ARRAY_SIZE_EDEFAULT == null ? arraySize != null : !ARRAY_SIZE_EDEFAULT.equals(arraySize);
			case FinalPackage.PARAMETER_TYPE__CTYPE:
				return CTYPE_EDEFAULT == null ? cType != null : !CTYPE_EDEFAULT.equals(cType);
			case FinalPackage.PARAMETER_TYPE__ITEM_TYPE:
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
		result.append(" (ifcSimpleValue: ");
		result.append(ifcSimpleValue);
		result.append(", arraySize: ");
		result.append(arraySize);
		result.append(", cType: ");
		result.append(cType);
		result.append(", itemType: ");
		result.append(itemType);
		result.append(')');
		return result.toString();
	}

} //ParameterTypeImpl
