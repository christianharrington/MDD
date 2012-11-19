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

import org.tech.iai.ifc.xml.ifc._2x3.final_.FillStylesType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcColourSpecification;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcExternallyDefinedHatchStyle;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFillAreaStyleHatching;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFillAreaStyleTiles;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPreDefinedColour;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fill Styles Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.FillStylesTypeImpl#getIfcFillStyleSelect <em>Ifc Fill Style Select</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.FillStylesTypeImpl#getIfcFillAreaStyleHatching <em>Ifc Fill Area Style Hatching</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.FillStylesTypeImpl#getIfcFillAreaStyleTiles <em>Ifc Fill Area Style Tiles</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.FillStylesTypeImpl#getIfcColourSpecificationGroup <em>Ifc Colour Specification Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.FillStylesTypeImpl#getIfcColourSpecification <em>Ifc Colour Specification</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.FillStylesTypeImpl#getIfcPreDefinedColourGroup <em>Ifc Pre Defined Colour Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.FillStylesTypeImpl#getIfcPreDefinedColour <em>Ifc Pre Defined Colour</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.FillStylesTypeImpl#getIfcExternallyDefinedHatchStyle <em>Ifc Externally Defined Hatch Style</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.FillStylesTypeImpl#getArraySize <em>Array Size</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.FillStylesTypeImpl#getCType <em>CType</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.FillStylesTypeImpl#getItemType <em>Item Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FillStylesTypeImpl extends EObjectImpl implements FillStylesType {
	/**
	 * The cached value of the '{@link #getIfcFillStyleSelect() <em>Ifc Fill Style Select</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcFillStyleSelect()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcFillStyleSelect;

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
	protected static final QName ITEM_TYPE_EDEFAULT = (QName)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.eINSTANCE.getQName(), "ifc:IfcFillStyleSelect");

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
	protected FillStylesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getFillStylesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcFillStyleSelect() {
		if (ifcFillStyleSelect == null) {
			ifcFillStyleSelect = new BasicFeatureMap(this, FinalPackage.FILL_STYLES_TYPE__IFC_FILL_STYLE_SELECT);
		}
		return ifcFillStyleSelect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcFillAreaStyleHatching> getIfcFillAreaStyleHatching() {
		return getIfcFillStyleSelect().list(FinalPackage.eINSTANCE.getFillStylesType_IfcFillAreaStyleHatching());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcFillAreaStyleTiles> getIfcFillAreaStyleTiles() {
		return getIfcFillStyleSelect().list(FinalPackage.eINSTANCE.getFillStylesType_IfcFillAreaStyleTiles());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcColourSpecificationGroup() {
		return (FeatureMap)getIfcFillStyleSelect().<FeatureMap.Entry>list(FinalPackage.eINSTANCE.getFillStylesType_IfcColourSpecificationGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcColourSpecification> getIfcColourSpecification() {
		return getIfcColourSpecificationGroup().list(FinalPackage.eINSTANCE.getFillStylesType_IfcColourSpecification());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcPreDefinedColourGroup() {
		return (FeatureMap)getIfcFillStyleSelect().<FeatureMap.Entry>list(FinalPackage.eINSTANCE.getFillStylesType_IfcPreDefinedColourGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcPreDefinedColour> getIfcPreDefinedColour() {
		return getIfcPreDefinedColourGroup().list(FinalPackage.eINSTANCE.getFillStylesType_IfcPreDefinedColour());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcExternallyDefinedHatchStyle> getIfcExternallyDefinedHatchStyle() {
		return getIfcFillStyleSelect().list(FinalPackage.eINSTANCE.getFillStylesType_IfcExternallyDefinedHatchStyle());
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.FILL_STYLES_TYPE__ARRAY_SIZE, oldArraySize, arraySize));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.FILL_STYLES_TYPE__CTYPE, oldCType, cType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.FILL_STYLES_TYPE__ITEM_TYPE, oldItemType, itemType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.FILL_STYLES_TYPE__IFC_FILL_STYLE_SELECT:
				return ((InternalEList<?>)getIfcFillStyleSelect()).basicRemove(otherEnd, msgs);
			case FinalPackage.FILL_STYLES_TYPE__IFC_FILL_AREA_STYLE_HATCHING:
				return ((InternalEList<?>)getIfcFillAreaStyleHatching()).basicRemove(otherEnd, msgs);
			case FinalPackage.FILL_STYLES_TYPE__IFC_FILL_AREA_STYLE_TILES:
				return ((InternalEList<?>)getIfcFillAreaStyleTiles()).basicRemove(otherEnd, msgs);
			case FinalPackage.FILL_STYLES_TYPE__IFC_COLOUR_SPECIFICATION_GROUP:
				return ((InternalEList<?>)getIfcColourSpecificationGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.FILL_STYLES_TYPE__IFC_COLOUR_SPECIFICATION:
				return ((InternalEList<?>)getIfcColourSpecification()).basicRemove(otherEnd, msgs);
			case FinalPackage.FILL_STYLES_TYPE__IFC_PRE_DEFINED_COLOUR_GROUP:
				return ((InternalEList<?>)getIfcPreDefinedColourGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.FILL_STYLES_TYPE__IFC_PRE_DEFINED_COLOUR:
				return ((InternalEList<?>)getIfcPreDefinedColour()).basicRemove(otherEnd, msgs);
			case FinalPackage.FILL_STYLES_TYPE__IFC_EXTERNALLY_DEFINED_HATCH_STYLE:
				return ((InternalEList<?>)getIfcExternallyDefinedHatchStyle()).basicRemove(otherEnd, msgs);
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
			case FinalPackage.FILL_STYLES_TYPE__IFC_FILL_STYLE_SELECT:
				if (coreType) return getIfcFillStyleSelect();
				return ((FeatureMap.Internal)getIfcFillStyleSelect()).getWrapper();
			case FinalPackage.FILL_STYLES_TYPE__IFC_FILL_AREA_STYLE_HATCHING:
				return getIfcFillAreaStyleHatching();
			case FinalPackage.FILL_STYLES_TYPE__IFC_FILL_AREA_STYLE_TILES:
				return getIfcFillAreaStyleTiles();
			case FinalPackage.FILL_STYLES_TYPE__IFC_COLOUR_SPECIFICATION_GROUP:
				if (coreType) return getIfcColourSpecificationGroup();
				return ((FeatureMap.Internal)getIfcColourSpecificationGroup()).getWrapper();
			case FinalPackage.FILL_STYLES_TYPE__IFC_COLOUR_SPECIFICATION:
				return getIfcColourSpecification();
			case FinalPackage.FILL_STYLES_TYPE__IFC_PRE_DEFINED_COLOUR_GROUP:
				if (coreType) return getIfcPreDefinedColourGroup();
				return ((FeatureMap.Internal)getIfcPreDefinedColourGroup()).getWrapper();
			case FinalPackage.FILL_STYLES_TYPE__IFC_PRE_DEFINED_COLOUR:
				return getIfcPreDefinedColour();
			case FinalPackage.FILL_STYLES_TYPE__IFC_EXTERNALLY_DEFINED_HATCH_STYLE:
				return getIfcExternallyDefinedHatchStyle();
			case FinalPackage.FILL_STYLES_TYPE__ARRAY_SIZE:
				return getArraySize();
			case FinalPackage.FILL_STYLES_TYPE__CTYPE:
				return getCType();
			case FinalPackage.FILL_STYLES_TYPE__ITEM_TYPE:
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
			case FinalPackage.FILL_STYLES_TYPE__IFC_FILL_STYLE_SELECT:
				((FeatureMap.Internal)getIfcFillStyleSelect()).set(newValue);
				return;
			case FinalPackage.FILL_STYLES_TYPE__IFC_FILL_AREA_STYLE_HATCHING:
				getIfcFillAreaStyleHatching().clear();
				getIfcFillAreaStyleHatching().addAll((Collection<? extends IfcFillAreaStyleHatching>)newValue);
				return;
			case FinalPackage.FILL_STYLES_TYPE__IFC_FILL_AREA_STYLE_TILES:
				getIfcFillAreaStyleTiles().clear();
				getIfcFillAreaStyleTiles().addAll((Collection<? extends IfcFillAreaStyleTiles>)newValue);
				return;
			case FinalPackage.FILL_STYLES_TYPE__IFC_COLOUR_SPECIFICATION_GROUP:
				((FeatureMap.Internal)getIfcColourSpecificationGroup()).set(newValue);
				return;
			case FinalPackage.FILL_STYLES_TYPE__IFC_PRE_DEFINED_COLOUR_GROUP:
				((FeatureMap.Internal)getIfcPreDefinedColourGroup()).set(newValue);
				return;
			case FinalPackage.FILL_STYLES_TYPE__IFC_EXTERNALLY_DEFINED_HATCH_STYLE:
				getIfcExternallyDefinedHatchStyle().clear();
				getIfcExternallyDefinedHatchStyle().addAll((Collection<? extends IfcExternallyDefinedHatchStyle>)newValue);
				return;
			case FinalPackage.FILL_STYLES_TYPE__ARRAY_SIZE:
				setArraySize((List<BigInteger>)newValue);
				return;
			case FinalPackage.FILL_STYLES_TYPE__CTYPE:
				setCType((List<AggregateType>)newValue);
				return;
			case FinalPackage.FILL_STYLES_TYPE__ITEM_TYPE:
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
			case FinalPackage.FILL_STYLES_TYPE__IFC_FILL_STYLE_SELECT:
				getIfcFillStyleSelect().clear();
				return;
			case FinalPackage.FILL_STYLES_TYPE__IFC_FILL_AREA_STYLE_HATCHING:
				getIfcFillAreaStyleHatching().clear();
				return;
			case FinalPackage.FILL_STYLES_TYPE__IFC_FILL_AREA_STYLE_TILES:
				getIfcFillAreaStyleTiles().clear();
				return;
			case FinalPackage.FILL_STYLES_TYPE__IFC_COLOUR_SPECIFICATION_GROUP:
				getIfcColourSpecificationGroup().clear();
				return;
			case FinalPackage.FILL_STYLES_TYPE__IFC_PRE_DEFINED_COLOUR_GROUP:
				getIfcPreDefinedColourGroup().clear();
				return;
			case FinalPackage.FILL_STYLES_TYPE__IFC_EXTERNALLY_DEFINED_HATCH_STYLE:
				getIfcExternallyDefinedHatchStyle().clear();
				return;
			case FinalPackage.FILL_STYLES_TYPE__ARRAY_SIZE:
				setArraySize(ARRAY_SIZE_EDEFAULT);
				return;
			case FinalPackage.FILL_STYLES_TYPE__CTYPE:
				setCType(CTYPE_EDEFAULT);
				return;
			case FinalPackage.FILL_STYLES_TYPE__ITEM_TYPE:
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
			case FinalPackage.FILL_STYLES_TYPE__IFC_FILL_STYLE_SELECT:
				return ifcFillStyleSelect != null && !ifcFillStyleSelect.isEmpty();
			case FinalPackage.FILL_STYLES_TYPE__IFC_FILL_AREA_STYLE_HATCHING:
				return !getIfcFillAreaStyleHatching().isEmpty();
			case FinalPackage.FILL_STYLES_TYPE__IFC_FILL_AREA_STYLE_TILES:
				return !getIfcFillAreaStyleTiles().isEmpty();
			case FinalPackage.FILL_STYLES_TYPE__IFC_COLOUR_SPECIFICATION_GROUP:
				return !getIfcColourSpecificationGroup().isEmpty();
			case FinalPackage.FILL_STYLES_TYPE__IFC_COLOUR_SPECIFICATION:
				return !getIfcColourSpecification().isEmpty();
			case FinalPackage.FILL_STYLES_TYPE__IFC_PRE_DEFINED_COLOUR_GROUP:
				return !getIfcPreDefinedColourGroup().isEmpty();
			case FinalPackage.FILL_STYLES_TYPE__IFC_PRE_DEFINED_COLOUR:
				return !getIfcPreDefinedColour().isEmpty();
			case FinalPackage.FILL_STYLES_TYPE__IFC_EXTERNALLY_DEFINED_HATCH_STYLE:
				return !getIfcExternallyDefinedHatchStyle().isEmpty();
			case FinalPackage.FILL_STYLES_TYPE__ARRAY_SIZE:
				return ARRAY_SIZE_EDEFAULT == null ? arraySize != null : !ARRAY_SIZE_EDEFAULT.equals(arraySize);
			case FinalPackage.FILL_STYLES_TYPE__CTYPE:
				return CTYPE_EDEFAULT == null ? cType != null : !CTYPE_EDEFAULT.equals(cType);
			case FinalPackage.FILL_STYLES_TYPE__ITEM_TYPE:
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
		result.append(" (ifcFillStyleSelect: ");
		result.append(ifcFillStyleSelect);
		result.append(", arraySize: ");
		result.append(arraySize);
		result.append(", cType: ");
		result.append(cType);
		result.append(", itemType: ");
		result.append(itemType);
		result.append(')');
		return result.toString();
	}

} //FillStylesTypeImpl
