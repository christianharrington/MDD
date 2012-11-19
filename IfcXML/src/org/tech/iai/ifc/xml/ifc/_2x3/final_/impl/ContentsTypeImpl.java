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

import org.tech.iai.ifc.xml.ifc._2x3.final_.ContentsType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAnnotationCurveOccurrence;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAnnotationSymbolOccurrence;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAnnotationTextOccurrence;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contents Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ContentsTypeImpl#getIfcDraughtingCalloutElement <em>Ifc Draughting Callout Element</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ContentsTypeImpl#getIfcAnnotationCurveOccurrenceGroup <em>Ifc Annotation Curve Occurrence Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ContentsTypeImpl#getIfcAnnotationCurveOccurrence <em>Ifc Annotation Curve Occurrence</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ContentsTypeImpl#getIfcAnnotationTextOccurrence <em>Ifc Annotation Text Occurrence</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ContentsTypeImpl#getIfcAnnotationSymbolOccurrenceGroup <em>Ifc Annotation Symbol Occurrence Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ContentsTypeImpl#getIfcAnnotationSymbolOccurrence <em>Ifc Annotation Symbol Occurrence</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ContentsTypeImpl#getArraySize <em>Array Size</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ContentsTypeImpl#getCType <em>CType</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ContentsTypeImpl#getItemType <em>Item Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContentsTypeImpl extends EObjectImpl implements ContentsType {
	/**
	 * The cached value of the '{@link #getIfcDraughtingCalloutElement() <em>Ifc Draughting Callout Element</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcDraughtingCalloutElement()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcDraughtingCalloutElement;

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
	protected static final QName ITEM_TYPE_EDEFAULT = (QName)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.eINSTANCE.getQName(), "ifc:IfcDraughtingCalloutElement");

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
	protected ContentsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getContentsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcDraughtingCalloutElement() {
		if (ifcDraughtingCalloutElement == null) {
			ifcDraughtingCalloutElement = new BasicFeatureMap(this, FinalPackage.CONTENTS_TYPE__IFC_DRAUGHTING_CALLOUT_ELEMENT);
		}
		return ifcDraughtingCalloutElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcAnnotationCurveOccurrenceGroup() {
		return (FeatureMap)getIfcDraughtingCalloutElement().<FeatureMap.Entry>list(FinalPackage.eINSTANCE.getContentsType_IfcAnnotationCurveOccurrenceGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcAnnotationCurveOccurrence> getIfcAnnotationCurveOccurrence() {
		return getIfcAnnotationCurveOccurrenceGroup().list(FinalPackage.eINSTANCE.getContentsType_IfcAnnotationCurveOccurrence());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcAnnotationTextOccurrence> getIfcAnnotationTextOccurrence() {
		return getIfcDraughtingCalloutElement().list(FinalPackage.eINSTANCE.getContentsType_IfcAnnotationTextOccurrence());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcAnnotationSymbolOccurrenceGroup() {
		return (FeatureMap)getIfcDraughtingCalloutElement().<FeatureMap.Entry>list(FinalPackage.eINSTANCE.getContentsType_IfcAnnotationSymbolOccurrenceGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcAnnotationSymbolOccurrence> getIfcAnnotationSymbolOccurrence() {
		return getIfcAnnotationSymbolOccurrenceGroup().list(FinalPackage.eINSTANCE.getContentsType_IfcAnnotationSymbolOccurrence());
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.CONTENTS_TYPE__ARRAY_SIZE, oldArraySize, arraySize));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.CONTENTS_TYPE__CTYPE, oldCType, cType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.CONTENTS_TYPE__ITEM_TYPE, oldItemType, itemType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.CONTENTS_TYPE__IFC_DRAUGHTING_CALLOUT_ELEMENT:
				return ((InternalEList<?>)getIfcDraughtingCalloutElement()).basicRemove(otherEnd, msgs);
			case FinalPackage.CONTENTS_TYPE__IFC_ANNOTATION_CURVE_OCCURRENCE_GROUP:
				return ((InternalEList<?>)getIfcAnnotationCurveOccurrenceGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.CONTENTS_TYPE__IFC_ANNOTATION_CURVE_OCCURRENCE:
				return ((InternalEList<?>)getIfcAnnotationCurveOccurrence()).basicRemove(otherEnd, msgs);
			case FinalPackage.CONTENTS_TYPE__IFC_ANNOTATION_TEXT_OCCURRENCE:
				return ((InternalEList<?>)getIfcAnnotationTextOccurrence()).basicRemove(otherEnd, msgs);
			case FinalPackage.CONTENTS_TYPE__IFC_ANNOTATION_SYMBOL_OCCURRENCE_GROUP:
				return ((InternalEList<?>)getIfcAnnotationSymbolOccurrenceGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.CONTENTS_TYPE__IFC_ANNOTATION_SYMBOL_OCCURRENCE:
				return ((InternalEList<?>)getIfcAnnotationSymbolOccurrence()).basicRemove(otherEnd, msgs);
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
			case FinalPackage.CONTENTS_TYPE__IFC_DRAUGHTING_CALLOUT_ELEMENT:
				if (coreType) return getIfcDraughtingCalloutElement();
				return ((FeatureMap.Internal)getIfcDraughtingCalloutElement()).getWrapper();
			case FinalPackage.CONTENTS_TYPE__IFC_ANNOTATION_CURVE_OCCURRENCE_GROUP:
				if (coreType) return getIfcAnnotationCurveOccurrenceGroup();
				return ((FeatureMap.Internal)getIfcAnnotationCurveOccurrenceGroup()).getWrapper();
			case FinalPackage.CONTENTS_TYPE__IFC_ANNOTATION_CURVE_OCCURRENCE:
				return getIfcAnnotationCurveOccurrence();
			case FinalPackage.CONTENTS_TYPE__IFC_ANNOTATION_TEXT_OCCURRENCE:
				return getIfcAnnotationTextOccurrence();
			case FinalPackage.CONTENTS_TYPE__IFC_ANNOTATION_SYMBOL_OCCURRENCE_GROUP:
				if (coreType) return getIfcAnnotationSymbolOccurrenceGroup();
				return ((FeatureMap.Internal)getIfcAnnotationSymbolOccurrenceGroup()).getWrapper();
			case FinalPackage.CONTENTS_TYPE__IFC_ANNOTATION_SYMBOL_OCCURRENCE:
				return getIfcAnnotationSymbolOccurrence();
			case FinalPackage.CONTENTS_TYPE__ARRAY_SIZE:
				return getArraySize();
			case FinalPackage.CONTENTS_TYPE__CTYPE:
				return getCType();
			case FinalPackage.CONTENTS_TYPE__ITEM_TYPE:
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
			case FinalPackage.CONTENTS_TYPE__IFC_DRAUGHTING_CALLOUT_ELEMENT:
				((FeatureMap.Internal)getIfcDraughtingCalloutElement()).set(newValue);
				return;
			case FinalPackage.CONTENTS_TYPE__IFC_ANNOTATION_CURVE_OCCURRENCE_GROUP:
				((FeatureMap.Internal)getIfcAnnotationCurveOccurrenceGroup()).set(newValue);
				return;
			case FinalPackage.CONTENTS_TYPE__IFC_ANNOTATION_CURVE_OCCURRENCE:
				getIfcAnnotationCurveOccurrence().clear();
				getIfcAnnotationCurveOccurrence().addAll((Collection<? extends IfcAnnotationCurveOccurrence>)newValue);
				return;
			case FinalPackage.CONTENTS_TYPE__IFC_ANNOTATION_TEXT_OCCURRENCE:
				getIfcAnnotationTextOccurrence().clear();
				getIfcAnnotationTextOccurrence().addAll((Collection<? extends IfcAnnotationTextOccurrence>)newValue);
				return;
			case FinalPackage.CONTENTS_TYPE__IFC_ANNOTATION_SYMBOL_OCCURRENCE_GROUP:
				((FeatureMap.Internal)getIfcAnnotationSymbolOccurrenceGroup()).set(newValue);
				return;
			case FinalPackage.CONTENTS_TYPE__IFC_ANNOTATION_SYMBOL_OCCURRENCE:
				getIfcAnnotationSymbolOccurrence().clear();
				getIfcAnnotationSymbolOccurrence().addAll((Collection<? extends IfcAnnotationSymbolOccurrence>)newValue);
				return;
			case FinalPackage.CONTENTS_TYPE__ARRAY_SIZE:
				setArraySize((List<BigInteger>)newValue);
				return;
			case FinalPackage.CONTENTS_TYPE__CTYPE:
				setCType((List<AggregateType>)newValue);
				return;
			case FinalPackage.CONTENTS_TYPE__ITEM_TYPE:
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
			case FinalPackage.CONTENTS_TYPE__IFC_DRAUGHTING_CALLOUT_ELEMENT:
				getIfcDraughtingCalloutElement().clear();
				return;
			case FinalPackage.CONTENTS_TYPE__IFC_ANNOTATION_CURVE_OCCURRENCE_GROUP:
				getIfcAnnotationCurveOccurrenceGroup().clear();
				return;
			case FinalPackage.CONTENTS_TYPE__IFC_ANNOTATION_CURVE_OCCURRENCE:
				getIfcAnnotationCurveOccurrence().clear();
				return;
			case FinalPackage.CONTENTS_TYPE__IFC_ANNOTATION_TEXT_OCCURRENCE:
				getIfcAnnotationTextOccurrence().clear();
				return;
			case FinalPackage.CONTENTS_TYPE__IFC_ANNOTATION_SYMBOL_OCCURRENCE_GROUP:
				getIfcAnnotationSymbolOccurrenceGroup().clear();
				return;
			case FinalPackage.CONTENTS_TYPE__IFC_ANNOTATION_SYMBOL_OCCURRENCE:
				getIfcAnnotationSymbolOccurrence().clear();
				return;
			case FinalPackage.CONTENTS_TYPE__ARRAY_SIZE:
				setArraySize(ARRAY_SIZE_EDEFAULT);
				return;
			case FinalPackage.CONTENTS_TYPE__CTYPE:
				setCType(CTYPE_EDEFAULT);
				return;
			case FinalPackage.CONTENTS_TYPE__ITEM_TYPE:
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
			case FinalPackage.CONTENTS_TYPE__IFC_DRAUGHTING_CALLOUT_ELEMENT:
				return ifcDraughtingCalloutElement != null && !ifcDraughtingCalloutElement.isEmpty();
			case FinalPackage.CONTENTS_TYPE__IFC_ANNOTATION_CURVE_OCCURRENCE_GROUP:
				return !getIfcAnnotationCurveOccurrenceGroup().isEmpty();
			case FinalPackage.CONTENTS_TYPE__IFC_ANNOTATION_CURVE_OCCURRENCE:
				return !getIfcAnnotationCurveOccurrence().isEmpty();
			case FinalPackage.CONTENTS_TYPE__IFC_ANNOTATION_TEXT_OCCURRENCE:
				return !getIfcAnnotationTextOccurrence().isEmpty();
			case FinalPackage.CONTENTS_TYPE__IFC_ANNOTATION_SYMBOL_OCCURRENCE_GROUP:
				return !getIfcAnnotationSymbolOccurrenceGroup().isEmpty();
			case FinalPackage.CONTENTS_TYPE__IFC_ANNOTATION_SYMBOL_OCCURRENCE:
				return !getIfcAnnotationSymbolOccurrence().isEmpty();
			case FinalPackage.CONTENTS_TYPE__ARRAY_SIZE:
				return ARRAY_SIZE_EDEFAULT == null ? arraySize != null : !ARRAY_SIZE_EDEFAULT.equals(arraySize);
			case FinalPackage.CONTENTS_TYPE__CTYPE:
				return CTYPE_EDEFAULT == null ? cType != null : !CTYPE_EDEFAULT.equals(cType);
			case FinalPackage.CONTENTS_TYPE__ITEM_TYPE:
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
		result.append(" (ifcDraughtingCalloutElement: ");
		result.append(ifcDraughtingCalloutElement);
		result.append(", arraySize: ");
		result.append(arraySize);
		result.append(", cType: ");
		result.append(cType);
		result.append(", itemType: ");
		result.append(itemType);
		result.append(')');
		return result.toString();
	}

} //ContentsTypeImpl
