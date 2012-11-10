/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcFillAreaStyleTileShapeSelect;
import ifc2x3tc1.IfcFillAreaStyleTiles;
import ifc2x3tc1.IfcOneDirectionRepeatFactor;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Fill Area Style Tiles</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcFillAreaStyleTilesImpl#getTilingPattern <em>Tiling Pattern</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcFillAreaStyleTilesImpl#getTiles <em>Tiles</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcFillAreaStyleTilesImpl#getTilingScale <em>Tiling Scale</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcFillAreaStyleTilesImpl#getTilingScaleAsString <em>Tiling Scale As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcFillAreaStyleTilesImpl extends IfcGeometricRepresentationItemImpl implements IfcFillAreaStyleTiles {
	/**
	 * The cached value of the '{@link #getTilingPattern() <em>Tiling Pattern</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTilingPattern()
	 * @generated
	 * @ordered
	 */
	protected IfcOneDirectionRepeatFactor tilingPattern;

	/**
	 * The cached value of the '{@link #getTiles() <em>Tiles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTiles()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcFillAreaStyleTileShapeSelect> tiles;

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
	 * The default value of the '{@link #getTilingScaleAsString() <em>Tiling Scale As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTilingScaleAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String TILING_SCALE_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTilingScaleAsString() <em>Tiling Scale As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTilingScaleAsString()
	 * @generated
	 * @ordered
	 */
	protected String tilingScaleAsString = TILING_SCALE_AS_STRING_EDEFAULT;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcFillAreaStyleTiles();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcOneDirectionRepeatFactor getTilingPattern() {
		if (tilingPattern != null && tilingPattern.eIsProxy()) {
			InternalEObject oldTilingPattern = (InternalEObject)tilingPattern;
			tilingPattern = (IfcOneDirectionRepeatFactor)eResolveProxy(oldTilingPattern);
			if (tilingPattern != oldTilingPattern) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_FILL_AREA_STYLE_TILES__TILING_PATTERN, oldTilingPattern, tilingPattern));
			}
		}
		return tilingPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcOneDirectionRepeatFactor basicGetTilingPattern() {
		return tilingPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTilingPattern(IfcOneDirectionRepeatFactor newTilingPattern) {
		IfcOneDirectionRepeatFactor oldTilingPattern = tilingPattern;
		tilingPattern = newTilingPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_FILL_AREA_STYLE_TILES__TILING_PATTERN, oldTilingPattern, tilingPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcFillAreaStyleTileShapeSelect> getTiles() {
		if (tiles == null) {
			tiles = new EObjectResolvingEList<IfcFillAreaStyleTileShapeSelect>(IfcFillAreaStyleTileShapeSelect.class, this, Ifc2x3tc1Package.IFC_FILL_AREA_STYLE_TILES__TILES);
		}
		return tiles;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_FILL_AREA_STYLE_TILES__TILING_SCALE, oldTilingScale, tilingScale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTilingScaleAsString() {
		return tilingScaleAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTilingScaleAsString(String newTilingScaleAsString) {
		String oldTilingScaleAsString = tilingScaleAsString;
		tilingScaleAsString = newTilingScaleAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_FILL_AREA_STYLE_TILES__TILING_SCALE_AS_STRING, oldTilingScaleAsString, tilingScaleAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_FILL_AREA_STYLE_TILES__TILING_PATTERN:
				if (resolve) return getTilingPattern();
				return basicGetTilingPattern();
			case Ifc2x3tc1Package.IFC_FILL_AREA_STYLE_TILES__TILES:
				return getTiles();
			case Ifc2x3tc1Package.IFC_FILL_AREA_STYLE_TILES__TILING_SCALE:
				return getTilingScale();
			case Ifc2x3tc1Package.IFC_FILL_AREA_STYLE_TILES__TILING_SCALE_AS_STRING:
				return getTilingScaleAsString();
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
			case Ifc2x3tc1Package.IFC_FILL_AREA_STYLE_TILES__TILING_PATTERN:
				setTilingPattern((IfcOneDirectionRepeatFactor)newValue);
				return;
			case Ifc2x3tc1Package.IFC_FILL_AREA_STYLE_TILES__TILES:
				getTiles().clear();
				getTiles().addAll((Collection<? extends IfcFillAreaStyleTileShapeSelect>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_FILL_AREA_STYLE_TILES__TILING_SCALE:
				setTilingScale((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_FILL_AREA_STYLE_TILES__TILING_SCALE_AS_STRING:
				setTilingScaleAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_FILL_AREA_STYLE_TILES__TILING_PATTERN:
				setTilingPattern((IfcOneDirectionRepeatFactor)null);
				return;
			case Ifc2x3tc1Package.IFC_FILL_AREA_STYLE_TILES__TILES:
				getTiles().clear();
				return;
			case Ifc2x3tc1Package.IFC_FILL_AREA_STYLE_TILES__TILING_SCALE:
				setTilingScale(TILING_SCALE_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_FILL_AREA_STYLE_TILES__TILING_SCALE_AS_STRING:
				setTilingScaleAsString(TILING_SCALE_AS_STRING_EDEFAULT);
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
			case Ifc2x3tc1Package.IFC_FILL_AREA_STYLE_TILES__TILING_PATTERN:
				return tilingPattern != null;
			case Ifc2x3tc1Package.IFC_FILL_AREA_STYLE_TILES__TILES:
				return tiles != null && !tiles.isEmpty();
			case Ifc2x3tc1Package.IFC_FILL_AREA_STYLE_TILES__TILING_SCALE:
				return tilingScale != TILING_SCALE_EDEFAULT;
			case Ifc2x3tc1Package.IFC_FILL_AREA_STYLE_TILES__TILING_SCALE_AS_STRING:
				return TILING_SCALE_AS_STRING_EDEFAULT == null ? tilingScaleAsString != null : !TILING_SCALE_AS_STRING_EDEFAULT.equals(tilingScaleAsString);
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
		result.append(" (TilingScale: ");
		result.append(tilingScale);
		result.append(", TilingScaleAsString: ");
		result.append(tilingScaleAsString);
		result.append(')');
		return result.toString();
	}

} //IfcFillAreaStyleTilesImpl
