/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFillAreaStyleTileShapeSelect;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFillAreaStyleTileSymbolWithStyle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Fill Area Style Tile Shape Select</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcFillAreaStyleTileShapeSelectImpl#getIfcFillAreaStyleTileSymbolWithStyle <em>Ifc Fill Area Style Tile Symbol With Style</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcFillAreaStyleTileShapeSelectImpl extends EObjectImpl implements IfcFillAreaStyleTileShapeSelect {
	/**
	 * The cached value of the '{@link #getIfcFillAreaStyleTileSymbolWithStyle() <em>Ifc Fill Area Style Tile Symbol With Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcFillAreaStyleTileSymbolWithStyle()
	 * @generated
	 * @ordered
	 */
	protected IfcFillAreaStyleTileSymbolWithStyle ifcFillAreaStyleTileSymbolWithStyle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcFillAreaStyleTileShapeSelectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcFillAreaStyleTileShapeSelect();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFillAreaStyleTileSymbolWithStyle getIfcFillAreaStyleTileSymbolWithStyle() {
		return ifcFillAreaStyleTileSymbolWithStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcFillAreaStyleTileSymbolWithStyle(IfcFillAreaStyleTileSymbolWithStyle newIfcFillAreaStyleTileSymbolWithStyle, NotificationChain msgs) {
		IfcFillAreaStyleTileSymbolWithStyle oldIfcFillAreaStyleTileSymbolWithStyle = ifcFillAreaStyleTileSymbolWithStyle;
		ifcFillAreaStyleTileSymbolWithStyle = newIfcFillAreaStyleTileSymbolWithStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_FILL_AREA_STYLE_TILE_SHAPE_SELECT__IFC_FILL_AREA_STYLE_TILE_SYMBOL_WITH_STYLE, oldIfcFillAreaStyleTileSymbolWithStyle, newIfcFillAreaStyleTileSymbolWithStyle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcFillAreaStyleTileSymbolWithStyle(IfcFillAreaStyleTileSymbolWithStyle newIfcFillAreaStyleTileSymbolWithStyle) {
		if (newIfcFillAreaStyleTileSymbolWithStyle != ifcFillAreaStyleTileSymbolWithStyle) {
			NotificationChain msgs = null;
			if (ifcFillAreaStyleTileSymbolWithStyle != null)
				msgs = ((InternalEObject)ifcFillAreaStyleTileSymbolWithStyle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_FILL_AREA_STYLE_TILE_SHAPE_SELECT__IFC_FILL_AREA_STYLE_TILE_SYMBOL_WITH_STYLE, null, msgs);
			if (newIfcFillAreaStyleTileSymbolWithStyle != null)
				msgs = ((InternalEObject)newIfcFillAreaStyleTileSymbolWithStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_FILL_AREA_STYLE_TILE_SHAPE_SELECT__IFC_FILL_AREA_STYLE_TILE_SYMBOL_WITH_STYLE, null, msgs);
			msgs = basicSetIfcFillAreaStyleTileSymbolWithStyle(newIfcFillAreaStyleTileSymbolWithStyle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_FILL_AREA_STYLE_TILE_SHAPE_SELECT__IFC_FILL_AREA_STYLE_TILE_SYMBOL_WITH_STYLE, newIfcFillAreaStyleTileSymbolWithStyle, newIfcFillAreaStyleTileSymbolWithStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_FILL_AREA_STYLE_TILE_SHAPE_SELECT__IFC_FILL_AREA_STYLE_TILE_SYMBOL_WITH_STYLE:
				return basicSetIfcFillAreaStyleTileSymbolWithStyle(null, msgs);
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
			case FinalPackage.IFC_FILL_AREA_STYLE_TILE_SHAPE_SELECT__IFC_FILL_AREA_STYLE_TILE_SYMBOL_WITH_STYLE:
				return getIfcFillAreaStyleTileSymbolWithStyle();
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
			case FinalPackage.IFC_FILL_AREA_STYLE_TILE_SHAPE_SELECT__IFC_FILL_AREA_STYLE_TILE_SYMBOL_WITH_STYLE:
				setIfcFillAreaStyleTileSymbolWithStyle((IfcFillAreaStyleTileSymbolWithStyle)newValue);
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
			case FinalPackage.IFC_FILL_AREA_STYLE_TILE_SHAPE_SELECT__IFC_FILL_AREA_STYLE_TILE_SYMBOL_WITH_STYLE:
				setIfcFillAreaStyleTileSymbolWithStyle((IfcFillAreaStyleTileSymbolWithStyle)null);
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
			case FinalPackage.IFC_FILL_AREA_STYLE_TILE_SHAPE_SELECT__IFC_FILL_AREA_STYLE_TILE_SYMBOL_WITH_STYLE:
				return ifcFillAreaStyleTileSymbolWithStyle != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcFillAreaStyleTileShapeSelectImpl
