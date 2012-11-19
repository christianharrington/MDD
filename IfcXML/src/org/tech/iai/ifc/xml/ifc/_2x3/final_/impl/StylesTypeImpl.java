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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcExternallyDefinedSurfaceStyle;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceStyleLighting;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceStyleRefraction;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceStyleShading;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceStyleWithTextures;
import org.tech.iai.ifc.xml.ifc._2x3.final_.StylesType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Styles Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.StylesTypeImpl#getIfcSurfaceStyleElementSelect <em>Ifc Surface Style Element Select</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.StylesTypeImpl#getIfcSurfaceStyleShadingGroup <em>Ifc Surface Style Shading Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.StylesTypeImpl#getIfcSurfaceStyleShading <em>Ifc Surface Style Shading</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.StylesTypeImpl#getIfcSurfaceStyleLighting <em>Ifc Surface Style Lighting</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.StylesTypeImpl#getIfcSurfaceStyleWithTextures <em>Ifc Surface Style With Textures</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.StylesTypeImpl#getIfcExternallyDefinedSurfaceStyle <em>Ifc Externally Defined Surface Style</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.StylesTypeImpl#getIfcSurfaceStyleRefraction <em>Ifc Surface Style Refraction</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.StylesTypeImpl#getArraySize <em>Array Size</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.StylesTypeImpl#getCType <em>CType</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.StylesTypeImpl#getItemType <em>Item Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StylesTypeImpl extends EObjectImpl implements StylesType {
	/**
	 * The cached value of the '{@link #getIfcSurfaceStyleElementSelect() <em>Ifc Surface Style Element Select</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcSurfaceStyleElementSelect()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcSurfaceStyleElementSelect;

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
	protected static final QName ITEM_TYPE_EDEFAULT = (QName)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.eINSTANCE.getQName(), "ifc:IfcSurfaceStyleElementSelect");

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
	protected StylesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getStylesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcSurfaceStyleElementSelect() {
		if (ifcSurfaceStyleElementSelect == null) {
			ifcSurfaceStyleElementSelect = new BasicFeatureMap(this, FinalPackage.STYLES_TYPE__IFC_SURFACE_STYLE_ELEMENT_SELECT);
		}
		return ifcSurfaceStyleElementSelect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcSurfaceStyleShadingGroup() {
		return (FeatureMap)getIfcSurfaceStyleElementSelect().<FeatureMap.Entry>list(FinalPackage.eINSTANCE.getStylesType_IfcSurfaceStyleShadingGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcSurfaceStyleShading> getIfcSurfaceStyleShading() {
		return getIfcSurfaceStyleShadingGroup().list(FinalPackage.eINSTANCE.getStylesType_IfcSurfaceStyleShading());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcSurfaceStyleLighting> getIfcSurfaceStyleLighting() {
		return getIfcSurfaceStyleElementSelect().list(FinalPackage.eINSTANCE.getStylesType_IfcSurfaceStyleLighting());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcSurfaceStyleWithTextures> getIfcSurfaceStyleWithTextures() {
		return getIfcSurfaceStyleElementSelect().list(FinalPackage.eINSTANCE.getStylesType_IfcSurfaceStyleWithTextures());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcExternallyDefinedSurfaceStyle> getIfcExternallyDefinedSurfaceStyle() {
		return getIfcSurfaceStyleElementSelect().list(FinalPackage.eINSTANCE.getStylesType_IfcExternallyDefinedSurfaceStyle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcSurfaceStyleRefraction> getIfcSurfaceStyleRefraction() {
		return getIfcSurfaceStyleElementSelect().list(FinalPackage.eINSTANCE.getStylesType_IfcSurfaceStyleRefraction());
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.STYLES_TYPE__ARRAY_SIZE, oldArraySize, arraySize));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.STYLES_TYPE__CTYPE, oldCType, cType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.STYLES_TYPE__ITEM_TYPE, oldItemType, itemType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.STYLES_TYPE__IFC_SURFACE_STYLE_ELEMENT_SELECT:
				return ((InternalEList<?>)getIfcSurfaceStyleElementSelect()).basicRemove(otherEnd, msgs);
			case FinalPackage.STYLES_TYPE__IFC_SURFACE_STYLE_SHADING_GROUP:
				return ((InternalEList<?>)getIfcSurfaceStyleShadingGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.STYLES_TYPE__IFC_SURFACE_STYLE_SHADING:
				return ((InternalEList<?>)getIfcSurfaceStyleShading()).basicRemove(otherEnd, msgs);
			case FinalPackage.STYLES_TYPE__IFC_SURFACE_STYLE_LIGHTING:
				return ((InternalEList<?>)getIfcSurfaceStyleLighting()).basicRemove(otherEnd, msgs);
			case FinalPackage.STYLES_TYPE__IFC_SURFACE_STYLE_WITH_TEXTURES:
				return ((InternalEList<?>)getIfcSurfaceStyleWithTextures()).basicRemove(otherEnd, msgs);
			case FinalPackage.STYLES_TYPE__IFC_EXTERNALLY_DEFINED_SURFACE_STYLE:
				return ((InternalEList<?>)getIfcExternallyDefinedSurfaceStyle()).basicRemove(otherEnd, msgs);
			case FinalPackage.STYLES_TYPE__IFC_SURFACE_STYLE_REFRACTION:
				return ((InternalEList<?>)getIfcSurfaceStyleRefraction()).basicRemove(otherEnd, msgs);
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
			case FinalPackage.STYLES_TYPE__IFC_SURFACE_STYLE_ELEMENT_SELECT:
				if (coreType) return getIfcSurfaceStyleElementSelect();
				return ((FeatureMap.Internal)getIfcSurfaceStyleElementSelect()).getWrapper();
			case FinalPackage.STYLES_TYPE__IFC_SURFACE_STYLE_SHADING_GROUP:
				if (coreType) return getIfcSurfaceStyleShadingGroup();
				return ((FeatureMap.Internal)getIfcSurfaceStyleShadingGroup()).getWrapper();
			case FinalPackage.STYLES_TYPE__IFC_SURFACE_STYLE_SHADING:
				return getIfcSurfaceStyleShading();
			case FinalPackage.STYLES_TYPE__IFC_SURFACE_STYLE_LIGHTING:
				return getIfcSurfaceStyleLighting();
			case FinalPackage.STYLES_TYPE__IFC_SURFACE_STYLE_WITH_TEXTURES:
				return getIfcSurfaceStyleWithTextures();
			case FinalPackage.STYLES_TYPE__IFC_EXTERNALLY_DEFINED_SURFACE_STYLE:
				return getIfcExternallyDefinedSurfaceStyle();
			case FinalPackage.STYLES_TYPE__IFC_SURFACE_STYLE_REFRACTION:
				return getIfcSurfaceStyleRefraction();
			case FinalPackage.STYLES_TYPE__ARRAY_SIZE:
				return getArraySize();
			case FinalPackage.STYLES_TYPE__CTYPE:
				return getCType();
			case FinalPackage.STYLES_TYPE__ITEM_TYPE:
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
			case FinalPackage.STYLES_TYPE__IFC_SURFACE_STYLE_ELEMENT_SELECT:
				((FeatureMap.Internal)getIfcSurfaceStyleElementSelect()).set(newValue);
				return;
			case FinalPackage.STYLES_TYPE__IFC_SURFACE_STYLE_SHADING_GROUP:
				((FeatureMap.Internal)getIfcSurfaceStyleShadingGroup()).set(newValue);
				return;
			case FinalPackage.STYLES_TYPE__IFC_SURFACE_STYLE_SHADING:
				getIfcSurfaceStyleShading().clear();
				getIfcSurfaceStyleShading().addAll((Collection<? extends IfcSurfaceStyleShading>)newValue);
				return;
			case FinalPackage.STYLES_TYPE__IFC_SURFACE_STYLE_LIGHTING:
				getIfcSurfaceStyleLighting().clear();
				getIfcSurfaceStyleLighting().addAll((Collection<? extends IfcSurfaceStyleLighting>)newValue);
				return;
			case FinalPackage.STYLES_TYPE__IFC_SURFACE_STYLE_WITH_TEXTURES:
				getIfcSurfaceStyleWithTextures().clear();
				getIfcSurfaceStyleWithTextures().addAll((Collection<? extends IfcSurfaceStyleWithTextures>)newValue);
				return;
			case FinalPackage.STYLES_TYPE__IFC_EXTERNALLY_DEFINED_SURFACE_STYLE:
				getIfcExternallyDefinedSurfaceStyle().clear();
				getIfcExternallyDefinedSurfaceStyle().addAll((Collection<? extends IfcExternallyDefinedSurfaceStyle>)newValue);
				return;
			case FinalPackage.STYLES_TYPE__IFC_SURFACE_STYLE_REFRACTION:
				getIfcSurfaceStyleRefraction().clear();
				getIfcSurfaceStyleRefraction().addAll((Collection<? extends IfcSurfaceStyleRefraction>)newValue);
				return;
			case FinalPackage.STYLES_TYPE__ARRAY_SIZE:
				setArraySize((List<BigInteger>)newValue);
				return;
			case FinalPackage.STYLES_TYPE__CTYPE:
				setCType((List<AggregateType>)newValue);
				return;
			case FinalPackage.STYLES_TYPE__ITEM_TYPE:
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
			case FinalPackage.STYLES_TYPE__IFC_SURFACE_STYLE_ELEMENT_SELECT:
				getIfcSurfaceStyleElementSelect().clear();
				return;
			case FinalPackage.STYLES_TYPE__IFC_SURFACE_STYLE_SHADING_GROUP:
				getIfcSurfaceStyleShadingGroup().clear();
				return;
			case FinalPackage.STYLES_TYPE__IFC_SURFACE_STYLE_SHADING:
				getIfcSurfaceStyleShading().clear();
				return;
			case FinalPackage.STYLES_TYPE__IFC_SURFACE_STYLE_LIGHTING:
				getIfcSurfaceStyleLighting().clear();
				return;
			case FinalPackage.STYLES_TYPE__IFC_SURFACE_STYLE_WITH_TEXTURES:
				getIfcSurfaceStyleWithTextures().clear();
				return;
			case FinalPackage.STYLES_TYPE__IFC_EXTERNALLY_DEFINED_SURFACE_STYLE:
				getIfcExternallyDefinedSurfaceStyle().clear();
				return;
			case FinalPackage.STYLES_TYPE__IFC_SURFACE_STYLE_REFRACTION:
				getIfcSurfaceStyleRefraction().clear();
				return;
			case FinalPackage.STYLES_TYPE__ARRAY_SIZE:
				setArraySize(ARRAY_SIZE_EDEFAULT);
				return;
			case FinalPackage.STYLES_TYPE__CTYPE:
				setCType(CTYPE_EDEFAULT);
				return;
			case FinalPackage.STYLES_TYPE__ITEM_TYPE:
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
			case FinalPackage.STYLES_TYPE__IFC_SURFACE_STYLE_ELEMENT_SELECT:
				return ifcSurfaceStyleElementSelect != null && !ifcSurfaceStyleElementSelect.isEmpty();
			case FinalPackage.STYLES_TYPE__IFC_SURFACE_STYLE_SHADING_GROUP:
				return !getIfcSurfaceStyleShadingGroup().isEmpty();
			case FinalPackage.STYLES_TYPE__IFC_SURFACE_STYLE_SHADING:
				return !getIfcSurfaceStyleShading().isEmpty();
			case FinalPackage.STYLES_TYPE__IFC_SURFACE_STYLE_LIGHTING:
				return !getIfcSurfaceStyleLighting().isEmpty();
			case FinalPackage.STYLES_TYPE__IFC_SURFACE_STYLE_WITH_TEXTURES:
				return !getIfcSurfaceStyleWithTextures().isEmpty();
			case FinalPackage.STYLES_TYPE__IFC_EXTERNALLY_DEFINED_SURFACE_STYLE:
				return !getIfcExternallyDefinedSurfaceStyle().isEmpty();
			case FinalPackage.STYLES_TYPE__IFC_SURFACE_STYLE_REFRACTION:
				return !getIfcSurfaceStyleRefraction().isEmpty();
			case FinalPackage.STYLES_TYPE__ARRAY_SIZE:
				return ARRAY_SIZE_EDEFAULT == null ? arraySize != null : !ARRAY_SIZE_EDEFAULT.equals(arraySize);
			case FinalPackage.STYLES_TYPE__CTYPE:
				return CTYPE_EDEFAULT == null ? cType != null : !CTYPE_EDEFAULT.equals(cType);
			case FinalPackage.STYLES_TYPE__ITEM_TYPE:
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
		result.append(" (ifcSurfaceStyleElementSelect: ");
		result.append(ifcSurfaceStyleElementSelect);
		result.append(", arraySize: ");
		result.append(arraySize);
		result.append(", cType: ");
		result.append(cType);
		result.append(", itemType: ");
		result.append(itemType);
		result.append(')');
		return result.toString();
	}

} //StylesTypeImpl
