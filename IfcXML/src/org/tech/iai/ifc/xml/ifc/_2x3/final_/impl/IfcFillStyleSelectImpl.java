/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcColourSpecification;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcExternallyDefinedHatchStyle;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFillAreaStyleHatching;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFillAreaStyleTiles;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFillStyleSelect;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPreDefinedColour;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Fill Style Select</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcFillStyleSelectImpl#getIfcFillAreaStyleHatching <em>Ifc Fill Area Style Hatching</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcFillStyleSelectImpl#getIfcFillAreaStyleTiles <em>Ifc Fill Area Style Tiles</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcFillStyleSelectImpl#getIfcColourSpecificationGroup <em>Ifc Colour Specification Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcFillStyleSelectImpl#getIfcColourSpecification <em>Ifc Colour Specification</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcFillStyleSelectImpl#getIfcPreDefinedColourGroup <em>Ifc Pre Defined Colour Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcFillStyleSelectImpl#getIfcPreDefinedColour <em>Ifc Pre Defined Colour</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcFillStyleSelectImpl#getIfcExternallyDefinedHatchStyle <em>Ifc Externally Defined Hatch Style</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcFillStyleSelectImpl extends EObjectImpl implements IfcFillStyleSelect {
	/**
	 * The cached value of the '{@link #getIfcFillAreaStyleHatching() <em>Ifc Fill Area Style Hatching</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcFillAreaStyleHatching()
	 * @generated
	 * @ordered
	 */
	protected IfcFillAreaStyleHatching ifcFillAreaStyleHatching;

	/**
	 * The cached value of the '{@link #getIfcFillAreaStyleTiles() <em>Ifc Fill Area Style Tiles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcFillAreaStyleTiles()
	 * @generated
	 * @ordered
	 */
	protected IfcFillAreaStyleTiles ifcFillAreaStyleTiles;

	/**
	 * The cached value of the '{@link #getIfcColourSpecificationGroup() <em>Ifc Colour Specification Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcColourSpecificationGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcColourSpecificationGroup;

	/**
	 * The cached value of the '{@link #getIfcPreDefinedColourGroup() <em>Ifc Pre Defined Colour Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcPreDefinedColourGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcPreDefinedColourGroup;

	/**
	 * The cached value of the '{@link #getIfcExternallyDefinedHatchStyle() <em>Ifc Externally Defined Hatch Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcExternallyDefinedHatchStyle()
	 * @generated
	 * @ordered
	 */
	protected IfcExternallyDefinedHatchStyle ifcExternallyDefinedHatchStyle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcFillStyleSelectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcFillStyleSelect();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFillAreaStyleHatching getIfcFillAreaStyleHatching() {
		return ifcFillAreaStyleHatching;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcFillAreaStyleHatching(IfcFillAreaStyleHatching newIfcFillAreaStyleHatching, NotificationChain msgs) {
		IfcFillAreaStyleHatching oldIfcFillAreaStyleHatching = ifcFillAreaStyleHatching;
		ifcFillAreaStyleHatching = newIfcFillAreaStyleHatching;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_FILL_STYLE_SELECT__IFC_FILL_AREA_STYLE_HATCHING, oldIfcFillAreaStyleHatching, newIfcFillAreaStyleHatching);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcFillAreaStyleHatching(IfcFillAreaStyleHatching newIfcFillAreaStyleHatching) {
		if (newIfcFillAreaStyleHatching != ifcFillAreaStyleHatching) {
			NotificationChain msgs = null;
			if (ifcFillAreaStyleHatching != null)
				msgs = ((InternalEObject)ifcFillAreaStyleHatching).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_FILL_STYLE_SELECT__IFC_FILL_AREA_STYLE_HATCHING, null, msgs);
			if (newIfcFillAreaStyleHatching != null)
				msgs = ((InternalEObject)newIfcFillAreaStyleHatching).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_FILL_STYLE_SELECT__IFC_FILL_AREA_STYLE_HATCHING, null, msgs);
			msgs = basicSetIfcFillAreaStyleHatching(newIfcFillAreaStyleHatching, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_FILL_STYLE_SELECT__IFC_FILL_AREA_STYLE_HATCHING, newIfcFillAreaStyleHatching, newIfcFillAreaStyleHatching));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFillAreaStyleTiles getIfcFillAreaStyleTiles() {
		return ifcFillAreaStyleTiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcFillAreaStyleTiles(IfcFillAreaStyleTiles newIfcFillAreaStyleTiles, NotificationChain msgs) {
		IfcFillAreaStyleTiles oldIfcFillAreaStyleTiles = ifcFillAreaStyleTiles;
		ifcFillAreaStyleTiles = newIfcFillAreaStyleTiles;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_FILL_STYLE_SELECT__IFC_FILL_AREA_STYLE_TILES, oldIfcFillAreaStyleTiles, newIfcFillAreaStyleTiles);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcFillAreaStyleTiles(IfcFillAreaStyleTiles newIfcFillAreaStyleTiles) {
		if (newIfcFillAreaStyleTiles != ifcFillAreaStyleTiles) {
			NotificationChain msgs = null;
			if (ifcFillAreaStyleTiles != null)
				msgs = ((InternalEObject)ifcFillAreaStyleTiles).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_FILL_STYLE_SELECT__IFC_FILL_AREA_STYLE_TILES, null, msgs);
			if (newIfcFillAreaStyleTiles != null)
				msgs = ((InternalEObject)newIfcFillAreaStyleTiles).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_FILL_STYLE_SELECT__IFC_FILL_AREA_STYLE_TILES, null, msgs);
			msgs = basicSetIfcFillAreaStyleTiles(newIfcFillAreaStyleTiles, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_FILL_STYLE_SELECT__IFC_FILL_AREA_STYLE_TILES, newIfcFillAreaStyleTiles, newIfcFillAreaStyleTiles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcColourSpecificationGroup() {
		if (ifcColourSpecificationGroup == null) {
			ifcColourSpecificationGroup = new BasicFeatureMap(this, FinalPackage.IFC_FILL_STYLE_SELECT__IFC_COLOUR_SPECIFICATION_GROUP);
		}
		return ifcColourSpecificationGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcColourSpecification getIfcColourSpecification() {
		return (IfcColourSpecification)getIfcColourSpecificationGroup().get(FinalPackage.eINSTANCE.getIfcFillStyleSelect_IfcColourSpecification(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcColourSpecification(IfcColourSpecification newIfcColourSpecification, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcColourSpecificationGroup()).basicAdd(FinalPackage.eINSTANCE.getIfcFillStyleSelect_IfcColourSpecification(), newIfcColourSpecification, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcPreDefinedColourGroup() {
		if (ifcPreDefinedColourGroup == null) {
			ifcPreDefinedColourGroup = new BasicFeatureMap(this, FinalPackage.IFC_FILL_STYLE_SELECT__IFC_PRE_DEFINED_COLOUR_GROUP);
		}
		return ifcPreDefinedColourGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPreDefinedColour getIfcPreDefinedColour() {
		return (IfcPreDefinedColour)getIfcPreDefinedColourGroup().get(FinalPackage.eINSTANCE.getIfcFillStyleSelect_IfcPreDefinedColour(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcPreDefinedColour(IfcPreDefinedColour newIfcPreDefinedColour, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcPreDefinedColourGroup()).basicAdd(FinalPackage.eINSTANCE.getIfcFillStyleSelect_IfcPreDefinedColour(), newIfcPreDefinedColour, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcExternallyDefinedHatchStyle getIfcExternallyDefinedHatchStyle() {
		return ifcExternallyDefinedHatchStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcExternallyDefinedHatchStyle(IfcExternallyDefinedHatchStyle newIfcExternallyDefinedHatchStyle, NotificationChain msgs) {
		IfcExternallyDefinedHatchStyle oldIfcExternallyDefinedHatchStyle = ifcExternallyDefinedHatchStyle;
		ifcExternallyDefinedHatchStyle = newIfcExternallyDefinedHatchStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_FILL_STYLE_SELECT__IFC_EXTERNALLY_DEFINED_HATCH_STYLE, oldIfcExternallyDefinedHatchStyle, newIfcExternallyDefinedHatchStyle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcExternallyDefinedHatchStyle(IfcExternallyDefinedHatchStyle newIfcExternallyDefinedHatchStyle) {
		if (newIfcExternallyDefinedHatchStyle != ifcExternallyDefinedHatchStyle) {
			NotificationChain msgs = null;
			if (ifcExternallyDefinedHatchStyle != null)
				msgs = ((InternalEObject)ifcExternallyDefinedHatchStyle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_FILL_STYLE_SELECT__IFC_EXTERNALLY_DEFINED_HATCH_STYLE, null, msgs);
			if (newIfcExternallyDefinedHatchStyle != null)
				msgs = ((InternalEObject)newIfcExternallyDefinedHatchStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_FILL_STYLE_SELECT__IFC_EXTERNALLY_DEFINED_HATCH_STYLE, null, msgs);
			msgs = basicSetIfcExternallyDefinedHatchStyle(newIfcExternallyDefinedHatchStyle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_FILL_STYLE_SELECT__IFC_EXTERNALLY_DEFINED_HATCH_STYLE, newIfcExternallyDefinedHatchStyle, newIfcExternallyDefinedHatchStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_FILL_STYLE_SELECT__IFC_FILL_AREA_STYLE_HATCHING:
				return basicSetIfcFillAreaStyleHatching(null, msgs);
			case FinalPackage.IFC_FILL_STYLE_SELECT__IFC_FILL_AREA_STYLE_TILES:
				return basicSetIfcFillAreaStyleTiles(null, msgs);
			case FinalPackage.IFC_FILL_STYLE_SELECT__IFC_COLOUR_SPECIFICATION_GROUP:
				return ((InternalEList<?>)getIfcColourSpecificationGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.IFC_FILL_STYLE_SELECT__IFC_COLOUR_SPECIFICATION:
				return basicSetIfcColourSpecification(null, msgs);
			case FinalPackage.IFC_FILL_STYLE_SELECT__IFC_PRE_DEFINED_COLOUR_GROUP:
				return ((InternalEList<?>)getIfcPreDefinedColourGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.IFC_FILL_STYLE_SELECT__IFC_PRE_DEFINED_COLOUR:
				return basicSetIfcPreDefinedColour(null, msgs);
			case FinalPackage.IFC_FILL_STYLE_SELECT__IFC_EXTERNALLY_DEFINED_HATCH_STYLE:
				return basicSetIfcExternallyDefinedHatchStyle(null, msgs);
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
			case FinalPackage.IFC_FILL_STYLE_SELECT__IFC_FILL_AREA_STYLE_HATCHING:
				return getIfcFillAreaStyleHatching();
			case FinalPackage.IFC_FILL_STYLE_SELECT__IFC_FILL_AREA_STYLE_TILES:
				return getIfcFillAreaStyleTiles();
			case FinalPackage.IFC_FILL_STYLE_SELECT__IFC_COLOUR_SPECIFICATION_GROUP:
				if (coreType) return getIfcColourSpecificationGroup();
				return ((FeatureMap.Internal)getIfcColourSpecificationGroup()).getWrapper();
			case FinalPackage.IFC_FILL_STYLE_SELECT__IFC_COLOUR_SPECIFICATION:
				return getIfcColourSpecification();
			case FinalPackage.IFC_FILL_STYLE_SELECT__IFC_PRE_DEFINED_COLOUR_GROUP:
				if (coreType) return getIfcPreDefinedColourGroup();
				return ((FeatureMap.Internal)getIfcPreDefinedColourGroup()).getWrapper();
			case FinalPackage.IFC_FILL_STYLE_SELECT__IFC_PRE_DEFINED_COLOUR:
				return getIfcPreDefinedColour();
			case FinalPackage.IFC_FILL_STYLE_SELECT__IFC_EXTERNALLY_DEFINED_HATCH_STYLE:
				return getIfcExternallyDefinedHatchStyle();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FinalPackage.IFC_FILL_STYLE_SELECT__IFC_FILL_AREA_STYLE_HATCHING:
				setIfcFillAreaStyleHatching((IfcFillAreaStyleHatching)newValue);
				return;
			case FinalPackage.IFC_FILL_STYLE_SELECT__IFC_FILL_AREA_STYLE_TILES:
				setIfcFillAreaStyleTiles((IfcFillAreaStyleTiles)newValue);
				return;
			case FinalPackage.IFC_FILL_STYLE_SELECT__IFC_COLOUR_SPECIFICATION_GROUP:
				((FeatureMap.Internal)getIfcColourSpecificationGroup()).set(newValue);
				return;
			case FinalPackage.IFC_FILL_STYLE_SELECT__IFC_PRE_DEFINED_COLOUR_GROUP:
				((FeatureMap.Internal)getIfcPreDefinedColourGroup()).set(newValue);
				return;
			case FinalPackage.IFC_FILL_STYLE_SELECT__IFC_EXTERNALLY_DEFINED_HATCH_STYLE:
				setIfcExternallyDefinedHatchStyle((IfcExternallyDefinedHatchStyle)newValue);
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
			case FinalPackage.IFC_FILL_STYLE_SELECT__IFC_FILL_AREA_STYLE_HATCHING:
				setIfcFillAreaStyleHatching((IfcFillAreaStyleHatching)null);
				return;
			case FinalPackage.IFC_FILL_STYLE_SELECT__IFC_FILL_AREA_STYLE_TILES:
				setIfcFillAreaStyleTiles((IfcFillAreaStyleTiles)null);
				return;
			case FinalPackage.IFC_FILL_STYLE_SELECT__IFC_COLOUR_SPECIFICATION_GROUP:
				getIfcColourSpecificationGroup().clear();
				return;
			case FinalPackage.IFC_FILL_STYLE_SELECT__IFC_PRE_DEFINED_COLOUR_GROUP:
				getIfcPreDefinedColourGroup().clear();
				return;
			case FinalPackage.IFC_FILL_STYLE_SELECT__IFC_EXTERNALLY_DEFINED_HATCH_STYLE:
				setIfcExternallyDefinedHatchStyle((IfcExternallyDefinedHatchStyle)null);
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
			case FinalPackage.IFC_FILL_STYLE_SELECT__IFC_FILL_AREA_STYLE_HATCHING:
				return ifcFillAreaStyleHatching != null;
			case FinalPackage.IFC_FILL_STYLE_SELECT__IFC_FILL_AREA_STYLE_TILES:
				return ifcFillAreaStyleTiles != null;
			case FinalPackage.IFC_FILL_STYLE_SELECT__IFC_COLOUR_SPECIFICATION_GROUP:
				return ifcColourSpecificationGroup != null && !ifcColourSpecificationGroup.isEmpty();
			case FinalPackage.IFC_FILL_STYLE_SELECT__IFC_COLOUR_SPECIFICATION:
				return getIfcColourSpecification() != null;
			case FinalPackage.IFC_FILL_STYLE_SELECT__IFC_PRE_DEFINED_COLOUR_GROUP:
				return ifcPreDefinedColourGroup != null && !ifcPreDefinedColourGroup.isEmpty();
			case FinalPackage.IFC_FILL_STYLE_SELECT__IFC_PRE_DEFINED_COLOUR:
				return getIfcPreDefinedColour() != null;
			case FinalPackage.IFC_FILL_STYLE_SELECT__IFC_EXTERNALLY_DEFINED_HATCH_STYLE:
				return ifcExternallyDefinedHatchStyle != null;
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
		result.append(" (ifcColourSpecificationGroup: ");
		result.append(ifcColourSpecificationGroup);
		result.append(", ifcPreDefinedColourGroup: ");
		result.append(ifcPreDefinedColourGroup);
		result.append(')');
		return result.toString();
	}

} //IfcFillStyleSelectImpl
