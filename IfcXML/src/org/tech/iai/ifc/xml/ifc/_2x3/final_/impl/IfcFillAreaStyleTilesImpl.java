/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFillAreaStyleTiles;
import org.tech.iai.ifc.xml.ifc._2x3.final_.TilesType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.TilingPatternType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Fill Area Style Tiles</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcFillAreaStyleTilesImpl#getTilingPattern <em>Tiling Pattern</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcFillAreaStyleTilesImpl#getTiles <em>Tiles</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcFillAreaStyleTilesImpl#getTilingScale <em>Tiling Scale</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcFillAreaStyleTilesImpl extends IfcGeometricRepresentationItemImpl implements IfcFillAreaStyleTiles {
	/**
	 * The cached value of the '{@link #getTilingPattern() <em>Tiling Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTilingPattern()
	 * @generated
	 * @ordered
	 */
	protected TilingPatternType tilingPattern;

	/**
	 * The cached value of the '{@link #getTiles() <em>Tiles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTiles()
	 * @generated
	 * @ordered
	 */
	protected TilesType tiles;

	/**
	 * The default value of the '{@link #getTilingScale() <em>Tiling Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTilingScale()
	 * @generated
	 * @ordered
	 */
	protected static final double TILING_SCALE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTilingScale() <em>Tiling Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTilingScale()
	 * @generated
	 * @ordered
	 */
	protected double tilingScale = TILING_SCALE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcFillAreaStyleTilesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcFillAreaStyleTiles();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TilingPatternType getTilingPattern() {
		return tilingPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTilingPattern(TilingPatternType newTilingPattern, NotificationChain msgs) {
		TilingPatternType oldTilingPattern = tilingPattern;
		tilingPattern = newTilingPattern;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_FILL_AREA_STYLE_TILES__TILING_PATTERN, oldTilingPattern, newTilingPattern);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTilingPattern(TilingPatternType newTilingPattern) {
		if (newTilingPattern != tilingPattern) {
			NotificationChain msgs = null;
			if (tilingPattern != null)
				msgs = ((InternalEObject)tilingPattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_FILL_AREA_STYLE_TILES__TILING_PATTERN, null, msgs);
			if (newTilingPattern != null)
				msgs = ((InternalEObject)newTilingPattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_FILL_AREA_STYLE_TILES__TILING_PATTERN, null, msgs);
			msgs = basicSetTilingPattern(newTilingPattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_FILL_AREA_STYLE_TILES__TILING_PATTERN, newTilingPattern, newTilingPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TilesType getTiles() {
		return tiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTiles(TilesType newTiles, NotificationChain msgs) {
		TilesType oldTiles = tiles;
		tiles = newTiles;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_FILL_AREA_STYLE_TILES__TILES, oldTiles, newTiles);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTiles(TilesType newTiles) {
		if (newTiles != tiles) {
			NotificationChain msgs = null;
			if (tiles != null)
				msgs = ((InternalEObject)tiles).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_FILL_AREA_STYLE_TILES__TILES, null, msgs);
			if (newTiles != null)
				msgs = ((InternalEObject)newTiles).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_FILL_AREA_STYLE_TILES__TILES, null, msgs);
			msgs = basicSetTiles(newTiles, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_FILL_AREA_STYLE_TILES__TILES, newTiles, newTiles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTilingScale() {
		return tilingScale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTilingScale(double newTilingScale) {
		double oldTilingScale = tilingScale;
		tilingScale = newTilingScale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_FILL_AREA_STYLE_TILES__TILING_SCALE, oldTilingScale, tilingScale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_FILL_AREA_STYLE_TILES__TILING_PATTERN:
				return basicSetTilingPattern(null, msgs);
			case FinalPackage.IFC_FILL_AREA_STYLE_TILES__TILES:
				return basicSetTiles(null, msgs);
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
			case FinalPackage.IFC_FILL_AREA_STYLE_TILES__TILING_PATTERN:
				return getTilingPattern();
			case FinalPackage.IFC_FILL_AREA_STYLE_TILES__TILES:
				return getTiles();
			case FinalPackage.IFC_FILL_AREA_STYLE_TILES__TILING_SCALE:
				return getTilingScale();
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
			case FinalPackage.IFC_FILL_AREA_STYLE_TILES__TILING_PATTERN:
				setTilingPattern((TilingPatternType)newValue);
				return;
			case FinalPackage.IFC_FILL_AREA_STYLE_TILES__TILES:
				setTiles((TilesType)newValue);
				return;
			case FinalPackage.IFC_FILL_AREA_STYLE_TILES__TILING_SCALE:
				setTilingScale((Double)newValue);
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
			case FinalPackage.IFC_FILL_AREA_STYLE_TILES__TILING_PATTERN:
				setTilingPattern((TilingPatternType)null);
				return;
			case FinalPackage.IFC_FILL_AREA_STYLE_TILES__TILES:
				setTiles((TilesType)null);
				return;
			case FinalPackage.IFC_FILL_AREA_STYLE_TILES__TILING_SCALE:
				setTilingScale(TILING_SCALE_EDEFAULT);
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
			case FinalPackage.IFC_FILL_AREA_STYLE_TILES__TILING_PATTERN:
				return tilingPattern != null;
			case FinalPackage.IFC_FILL_AREA_STYLE_TILES__TILES:
				return tiles != null;
			case FinalPackage.IFC_FILL_AREA_STYLE_TILES__TILING_SCALE:
				return tilingScale != TILING_SCALE_EDEFAULT;
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
		result.append(" (tilingScale: ");
		result.append(tilingScale);
		result.append(')');
		return result.toString();
	}

} //IfcFillAreaStyleTilesImpl
