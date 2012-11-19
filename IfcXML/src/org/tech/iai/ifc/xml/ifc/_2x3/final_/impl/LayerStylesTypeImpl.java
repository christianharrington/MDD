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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCurveStyle;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFillAreaStyle;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcNullStyleType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceStyle;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSymbolStyle;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextStyle;
import org.tech.iai.ifc.xml.ifc._2x3.final_.LayerStylesType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Layer Styles Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.LayerStylesTypeImpl#getIfcPresentationStyleSelect <em>Ifc Presentation Style Select</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.LayerStylesTypeImpl#getIfcNullStyle <em>Ifc Null Style</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.LayerStylesTypeImpl#getIfcCurveStyle <em>Ifc Curve Style</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.LayerStylesTypeImpl#getIfcSymbolStyle <em>Ifc Symbol Style</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.LayerStylesTypeImpl#getIfcFillAreaStyle <em>Ifc Fill Area Style</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.LayerStylesTypeImpl#getIfcTextStyle <em>Ifc Text Style</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.LayerStylesTypeImpl#getIfcSurfaceStyle <em>Ifc Surface Style</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.LayerStylesTypeImpl#getArraySize <em>Array Size</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.LayerStylesTypeImpl#getCType <em>CType</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.LayerStylesTypeImpl#getItemType <em>Item Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LayerStylesTypeImpl extends EObjectImpl implements LayerStylesType {
	/**
	 * The cached value of the '{@link #getIfcPresentationStyleSelect() <em>Ifc Presentation Style Select</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcPresentationStyleSelect()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcPresentationStyleSelect;

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
	protected static final QName ITEM_TYPE_EDEFAULT = (QName)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.eINSTANCE.getQName(), "ifc:IfcPresentationStyleSelect");

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
	protected LayerStylesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getLayerStylesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcPresentationStyleSelect() {
		if (ifcPresentationStyleSelect == null) {
			ifcPresentationStyleSelect = new BasicFeatureMap(this, FinalPackage.LAYER_STYLES_TYPE__IFC_PRESENTATION_STYLE_SELECT);
		}
		return ifcPresentationStyleSelect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcNullStyleType> getIfcNullStyle() {
		return getIfcPresentationStyleSelect().list(FinalPackage.eINSTANCE.getLayerStylesType_IfcNullStyle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcCurveStyle> getIfcCurveStyle() {
		return getIfcPresentationStyleSelect().list(FinalPackage.eINSTANCE.getLayerStylesType_IfcCurveStyle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcSymbolStyle> getIfcSymbolStyle() {
		return getIfcPresentationStyleSelect().list(FinalPackage.eINSTANCE.getLayerStylesType_IfcSymbolStyle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcFillAreaStyle> getIfcFillAreaStyle() {
		return getIfcPresentationStyleSelect().list(FinalPackage.eINSTANCE.getLayerStylesType_IfcFillAreaStyle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcTextStyle> getIfcTextStyle() {
		return getIfcPresentationStyleSelect().list(FinalPackage.eINSTANCE.getLayerStylesType_IfcTextStyle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcSurfaceStyle> getIfcSurfaceStyle() {
		return getIfcPresentationStyleSelect().list(FinalPackage.eINSTANCE.getLayerStylesType_IfcSurfaceStyle());
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.LAYER_STYLES_TYPE__ARRAY_SIZE, oldArraySize, arraySize));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.LAYER_STYLES_TYPE__CTYPE, oldCType, cType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.LAYER_STYLES_TYPE__ITEM_TYPE, oldItemType, itemType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.LAYER_STYLES_TYPE__IFC_PRESENTATION_STYLE_SELECT:
				return ((InternalEList<?>)getIfcPresentationStyleSelect()).basicRemove(otherEnd, msgs);
			case FinalPackage.LAYER_STYLES_TYPE__IFC_NULL_STYLE:
				return ((InternalEList<?>)getIfcNullStyle()).basicRemove(otherEnd, msgs);
			case FinalPackage.LAYER_STYLES_TYPE__IFC_CURVE_STYLE:
				return ((InternalEList<?>)getIfcCurveStyle()).basicRemove(otherEnd, msgs);
			case FinalPackage.LAYER_STYLES_TYPE__IFC_SYMBOL_STYLE:
				return ((InternalEList<?>)getIfcSymbolStyle()).basicRemove(otherEnd, msgs);
			case FinalPackage.LAYER_STYLES_TYPE__IFC_FILL_AREA_STYLE:
				return ((InternalEList<?>)getIfcFillAreaStyle()).basicRemove(otherEnd, msgs);
			case FinalPackage.LAYER_STYLES_TYPE__IFC_TEXT_STYLE:
				return ((InternalEList<?>)getIfcTextStyle()).basicRemove(otherEnd, msgs);
			case FinalPackage.LAYER_STYLES_TYPE__IFC_SURFACE_STYLE:
				return ((InternalEList<?>)getIfcSurfaceStyle()).basicRemove(otherEnd, msgs);
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
			case FinalPackage.LAYER_STYLES_TYPE__IFC_PRESENTATION_STYLE_SELECT:
				if (coreType) return getIfcPresentationStyleSelect();
				return ((FeatureMap.Internal)getIfcPresentationStyleSelect()).getWrapper();
			case FinalPackage.LAYER_STYLES_TYPE__IFC_NULL_STYLE:
				return getIfcNullStyle();
			case FinalPackage.LAYER_STYLES_TYPE__IFC_CURVE_STYLE:
				return getIfcCurveStyle();
			case FinalPackage.LAYER_STYLES_TYPE__IFC_SYMBOL_STYLE:
				return getIfcSymbolStyle();
			case FinalPackage.LAYER_STYLES_TYPE__IFC_FILL_AREA_STYLE:
				return getIfcFillAreaStyle();
			case FinalPackage.LAYER_STYLES_TYPE__IFC_TEXT_STYLE:
				return getIfcTextStyle();
			case FinalPackage.LAYER_STYLES_TYPE__IFC_SURFACE_STYLE:
				return getIfcSurfaceStyle();
			case FinalPackage.LAYER_STYLES_TYPE__ARRAY_SIZE:
				return getArraySize();
			case FinalPackage.LAYER_STYLES_TYPE__CTYPE:
				return getCType();
			case FinalPackage.LAYER_STYLES_TYPE__ITEM_TYPE:
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
			case FinalPackage.LAYER_STYLES_TYPE__IFC_PRESENTATION_STYLE_SELECT:
				((FeatureMap.Internal)getIfcPresentationStyleSelect()).set(newValue);
				return;
			case FinalPackage.LAYER_STYLES_TYPE__IFC_NULL_STYLE:
				getIfcNullStyle().clear();
				getIfcNullStyle().addAll((Collection<? extends IfcNullStyleType>)newValue);
				return;
			case FinalPackage.LAYER_STYLES_TYPE__IFC_CURVE_STYLE:
				getIfcCurveStyle().clear();
				getIfcCurveStyle().addAll((Collection<? extends IfcCurveStyle>)newValue);
				return;
			case FinalPackage.LAYER_STYLES_TYPE__IFC_SYMBOL_STYLE:
				getIfcSymbolStyle().clear();
				getIfcSymbolStyle().addAll((Collection<? extends IfcSymbolStyle>)newValue);
				return;
			case FinalPackage.LAYER_STYLES_TYPE__IFC_FILL_AREA_STYLE:
				getIfcFillAreaStyle().clear();
				getIfcFillAreaStyle().addAll((Collection<? extends IfcFillAreaStyle>)newValue);
				return;
			case FinalPackage.LAYER_STYLES_TYPE__IFC_TEXT_STYLE:
				getIfcTextStyle().clear();
				getIfcTextStyle().addAll((Collection<? extends IfcTextStyle>)newValue);
				return;
			case FinalPackage.LAYER_STYLES_TYPE__IFC_SURFACE_STYLE:
				getIfcSurfaceStyle().clear();
				getIfcSurfaceStyle().addAll((Collection<? extends IfcSurfaceStyle>)newValue);
				return;
			case FinalPackage.LAYER_STYLES_TYPE__ARRAY_SIZE:
				setArraySize((List<BigInteger>)newValue);
				return;
			case FinalPackage.LAYER_STYLES_TYPE__CTYPE:
				setCType((List<AggregateType>)newValue);
				return;
			case FinalPackage.LAYER_STYLES_TYPE__ITEM_TYPE:
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
			case FinalPackage.LAYER_STYLES_TYPE__IFC_PRESENTATION_STYLE_SELECT:
				getIfcPresentationStyleSelect().clear();
				return;
			case FinalPackage.LAYER_STYLES_TYPE__IFC_NULL_STYLE:
				getIfcNullStyle().clear();
				return;
			case FinalPackage.LAYER_STYLES_TYPE__IFC_CURVE_STYLE:
				getIfcCurveStyle().clear();
				return;
			case FinalPackage.LAYER_STYLES_TYPE__IFC_SYMBOL_STYLE:
				getIfcSymbolStyle().clear();
				return;
			case FinalPackage.LAYER_STYLES_TYPE__IFC_FILL_AREA_STYLE:
				getIfcFillAreaStyle().clear();
				return;
			case FinalPackage.LAYER_STYLES_TYPE__IFC_TEXT_STYLE:
				getIfcTextStyle().clear();
				return;
			case FinalPackage.LAYER_STYLES_TYPE__IFC_SURFACE_STYLE:
				getIfcSurfaceStyle().clear();
				return;
			case FinalPackage.LAYER_STYLES_TYPE__ARRAY_SIZE:
				setArraySize(ARRAY_SIZE_EDEFAULT);
				return;
			case FinalPackage.LAYER_STYLES_TYPE__CTYPE:
				setCType(CTYPE_EDEFAULT);
				return;
			case FinalPackage.LAYER_STYLES_TYPE__ITEM_TYPE:
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
			case FinalPackage.LAYER_STYLES_TYPE__IFC_PRESENTATION_STYLE_SELECT:
				return ifcPresentationStyleSelect != null && !ifcPresentationStyleSelect.isEmpty();
			case FinalPackage.LAYER_STYLES_TYPE__IFC_NULL_STYLE:
				return !getIfcNullStyle().isEmpty();
			case FinalPackage.LAYER_STYLES_TYPE__IFC_CURVE_STYLE:
				return !getIfcCurveStyle().isEmpty();
			case FinalPackage.LAYER_STYLES_TYPE__IFC_SYMBOL_STYLE:
				return !getIfcSymbolStyle().isEmpty();
			case FinalPackage.LAYER_STYLES_TYPE__IFC_FILL_AREA_STYLE:
				return !getIfcFillAreaStyle().isEmpty();
			case FinalPackage.LAYER_STYLES_TYPE__IFC_TEXT_STYLE:
				return !getIfcTextStyle().isEmpty();
			case FinalPackage.LAYER_STYLES_TYPE__IFC_SURFACE_STYLE:
				return !getIfcSurfaceStyle().isEmpty();
			case FinalPackage.LAYER_STYLES_TYPE__ARRAY_SIZE:
				return ARRAY_SIZE_EDEFAULT == null ? arraySize != null : !ARRAY_SIZE_EDEFAULT.equals(arraySize);
			case FinalPackage.LAYER_STYLES_TYPE__CTYPE:
				return CTYPE_EDEFAULT == null ? cType != null : !CTYPE_EDEFAULT.equals(cType);
			case FinalPackage.LAYER_STYLES_TYPE__ITEM_TYPE:
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
		result.append(" (ifcPresentationStyleSelect: ");
		result.append(ifcPresentationStyleSelect);
		result.append(", arraySize: ");
		result.append(arraySize);
		result.append(", cType: ");
		result.append(cType);
		result.append(", itemType: ");
		result.append(itemType);
		result.append(')');
		return result.toString();
	}

} //LayerStylesTypeImpl
