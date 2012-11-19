/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import java.math.BigInteger;

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

import org.tech.iai.ifc.xml.ifc._2x3.final_.ElementsType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCurve;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPoint;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurface;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Elements Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ElementsTypeImpl#getIfcGeometricSetSelect <em>Ifc Geometric Set Select</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ElementsTypeImpl#getIfcPointGroup <em>Ifc Point Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ElementsTypeImpl#getIfcPoint <em>Ifc Point</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ElementsTypeImpl#getIfcCurveGroup <em>Ifc Curve Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ElementsTypeImpl#getIfcCurve <em>Ifc Curve</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ElementsTypeImpl#getIfcSurfaceGroup <em>Ifc Surface Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ElementsTypeImpl#getIfcSurface <em>Ifc Surface</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ElementsTypeImpl#getArraySize <em>Array Size</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ElementsTypeImpl#getCType <em>CType</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ElementsTypeImpl#getItemType <em>Item Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElementsTypeImpl extends EObjectImpl implements ElementsType {
	/**
	 * The cached value of the '{@link #getIfcGeometricSetSelect() <em>Ifc Geometric Set Select</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcGeometricSetSelect()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcGeometricSetSelect;

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
	protected static final QName ITEM_TYPE_EDEFAULT = (QName)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.eINSTANCE.getQName(), "ifc:IfcGeometricSetSelect");

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
	protected ElementsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getElementsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcGeometricSetSelect() {
		if (ifcGeometricSetSelect == null) {
			ifcGeometricSetSelect = new BasicFeatureMap(this, FinalPackage.ELEMENTS_TYPE__IFC_GEOMETRIC_SET_SELECT);
		}
		return ifcGeometricSetSelect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcPointGroup() {
		return (FeatureMap)getIfcGeometricSetSelect().<FeatureMap.Entry>list(FinalPackage.eINSTANCE.getElementsType_IfcPointGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcPoint> getIfcPoint() {
		return getIfcPointGroup().list(FinalPackage.eINSTANCE.getElementsType_IfcPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcCurveGroup() {
		return (FeatureMap)getIfcGeometricSetSelect().<FeatureMap.Entry>list(FinalPackage.eINSTANCE.getElementsType_IfcCurveGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcCurve> getIfcCurve() {
		return getIfcCurveGroup().list(FinalPackage.eINSTANCE.getElementsType_IfcCurve());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcSurfaceGroup() {
		return (FeatureMap)getIfcGeometricSetSelect().<FeatureMap.Entry>list(FinalPackage.eINSTANCE.getElementsType_IfcSurfaceGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcSurface> getIfcSurface() {
		return getIfcSurfaceGroup().list(FinalPackage.eINSTANCE.getElementsType_IfcSurface());
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.ELEMENTS_TYPE__ARRAY_SIZE, oldArraySize, arraySize));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.ELEMENTS_TYPE__CTYPE, oldCType, cType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.ELEMENTS_TYPE__ITEM_TYPE, oldItemType, itemType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.ELEMENTS_TYPE__IFC_GEOMETRIC_SET_SELECT:
				return ((InternalEList<?>)getIfcGeometricSetSelect()).basicRemove(otherEnd, msgs);
			case FinalPackage.ELEMENTS_TYPE__IFC_POINT_GROUP:
				return ((InternalEList<?>)getIfcPointGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.ELEMENTS_TYPE__IFC_POINT:
				return ((InternalEList<?>)getIfcPoint()).basicRemove(otherEnd, msgs);
			case FinalPackage.ELEMENTS_TYPE__IFC_CURVE_GROUP:
				return ((InternalEList<?>)getIfcCurveGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.ELEMENTS_TYPE__IFC_CURVE:
				return ((InternalEList<?>)getIfcCurve()).basicRemove(otherEnd, msgs);
			case FinalPackage.ELEMENTS_TYPE__IFC_SURFACE_GROUP:
				return ((InternalEList<?>)getIfcSurfaceGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.ELEMENTS_TYPE__IFC_SURFACE:
				return ((InternalEList<?>)getIfcSurface()).basicRemove(otherEnd, msgs);
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
			case FinalPackage.ELEMENTS_TYPE__IFC_GEOMETRIC_SET_SELECT:
				if (coreType) return getIfcGeometricSetSelect();
				return ((FeatureMap.Internal)getIfcGeometricSetSelect()).getWrapper();
			case FinalPackage.ELEMENTS_TYPE__IFC_POINT_GROUP:
				if (coreType) return getIfcPointGroup();
				return ((FeatureMap.Internal)getIfcPointGroup()).getWrapper();
			case FinalPackage.ELEMENTS_TYPE__IFC_POINT:
				return getIfcPoint();
			case FinalPackage.ELEMENTS_TYPE__IFC_CURVE_GROUP:
				if (coreType) return getIfcCurveGroup();
				return ((FeatureMap.Internal)getIfcCurveGroup()).getWrapper();
			case FinalPackage.ELEMENTS_TYPE__IFC_CURVE:
				return getIfcCurve();
			case FinalPackage.ELEMENTS_TYPE__IFC_SURFACE_GROUP:
				if (coreType) return getIfcSurfaceGroup();
				return ((FeatureMap.Internal)getIfcSurfaceGroup()).getWrapper();
			case FinalPackage.ELEMENTS_TYPE__IFC_SURFACE:
				return getIfcSurface();
			case FinalPackage.ELEMENTS_TYPE__ARRAY_SIZE:
				return getArraySize();
			case FinalPackage.ELEMENTS_TYPE__CTYPE:
				return getCType();
			case FinalPackage.ELEMENTS_TYPE__ITEM_TYPE:
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
			case FinalPackage.ELEMENTS_TYPE__IFC_GEOMETRIC_SET_SELECT:
				((FeatureMap.Internal)getIfcGeometricSetSelect()).set(newValue);
				return;
			case FinalPackage.ELEMENTS_TYPE__IFC_POINT_GROUP:
				((FeatureMap.Internal)getIfcPointGroup()).set(newValue);
				return;
			case FinalPackage.ELEMENTS_TYPE__IFC_CURVE_GROUP:
				((FeatureMap.Internal)getIfcCurveGroup()).set(newValue);
				return;
			case FinalPackage.ELEMENTS_TYPE__IFC_SURFACE_GROUP:
				((FeatureMap.Internal)getIfcSurfaceGroup()).set(newValue);
				return;
			case FinalPackage.ELEMENTS_TYPE__ARRAY_SIZE:
				setArraySize((List<BigInteger>)newValue);
				return;
			case FinalPackage.ELEMENTS_TYPE__CTYPE:
				setCType((List<AggregateType>)newValue);
				return;
			case FinalPackage.ELEMENTS_TYPE__ITEM_TYPE:
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
			case FinalPackage.ELEMENTS_TYPE__IFC_GEOMETRIC_SET_SELECT:
				getIfcGeometricSetSelect().clear();
				return;
			case FinalPackage.ELEMENTS_TYPE__IFC_POINT_GROUP:
				getIfcPointGroup().clear();
				return;
			case FinalPackage.ELEMENTS_TYPE__IFC_CURVE_GROUP:
				getIfcCurveGroup().clear();
				return;
			case FinalPackage.ELEMENTS_TYPE__IFC_SURFACE_GROUP:
				getIfcSurfaceGroup().clear();
				return;
			case FinalPackage.ELEMENTS_TYPE__ARRAY_SIZE:
				setArraySize(ARRAY_SIZE_EDEFAULT);
				return;
			case FinalPackage.ELEMENTS_TYPE__CTYPE:
				setCType(CTYPE_EDEFAULT);
				return;
			case FinalPackage.ELEMENTS_TYPE__ITEM_TYPE:
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
			case FinalPackage.ELEMENTS_TYPE__IFC_GEOMETRIC_SET_SELECT:
				return ifcGeometricSetSelect != null && !ifcGeometricSetSelect.isEmpty();
			case FinalPackage.ELEMENTS_TYPE__IFC_POINT_GROUP:
				return !getIfcPointGroup().isEmpty();
			case FinalPackage.ELEMENTS_TYPE__IFC_POINT:
				return !getIfcPoint().isEmpty();
			case FinalPackage.ELEMENTS_TYPE__IFC_CURVE_GROUP:
				return !getIfcCurveGroup().isEmpty();
			case FinalPackage.ELEMENTS_TYPE__IFC_CURVE:
				return !getIfcCurve().isEmpty();
			case FinalPackage.ELEMENTS_TYPE__IFC_SURFACE_GROUP:
				return !getIfcSurfaceGroup().isEmpty();
			case FinalPackage.ELEMENTS_TYPE__IFC_SURFACE:
				return !getIfcSurface().isEmpty();
			case FinalPackage.ELEMENTS_TYPE__ARRAY_SIZE:
				return ARRAY_SIZE_EDEFAULT == null ? arraySize != null : !ARRAY_SIZE_EDEFAULT.equals(arraySize);
			case FinalPackage.ELEMENTS_TYPE__CTYPE:
				return CTYPE_EDEFAULT == null ? cType != null : !CTYPE_EDEFAULT.equals(cType);
			case FinalPackage.ELEMENTS_TYPE__ITEM_TYPE:
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
		result.append(" (ifcGeometricSetSelect: ");
		result.append(ifcGeometricSetSelect);
		result.append(", arraySize: ");
		result.append(arraySize);
		result.append(", cType: ");
		result.append(cType);
		result.append(", itemType: ");
		result.append(itemType);
		result.append(')');
		return result.toString();
	}

} //ElementsTypeImpl
