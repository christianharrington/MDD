/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTrapeziumProfileDef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Trapezium Profile Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTrapeziumProfileDefImpl#getBottomXDim <em>Bottom XDim</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTrapeziumProfileDefImpl#getTopXDim <em>Top XDim</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTrapeziumProfileDefImpl#getYDim <em>YDim</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTrapeziumProfileDefImpl#getTopXOffset <em>Top XOffset</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcTrapeziumProfileDefImpl extends IfcParameterizedProfileDefImpl implements IfcTrapeziumProfileDef {
	/**
	 * The default value of the '{@link #getBottomXDim() <em>Bottom XDim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBottomXDim()
	 * @generated
	 * @ordered
	 */
	protected static final double BOTTOM_XDIM_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBottomXDim() <em>Bottom XDim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBottomXDim()
	 * @generated
	 * @ordered
	 */
	protected double bottomXDim = BOTTOM_XDIM_EDEFAULT;

	/**
	 * The default value of the '{@link #getTopXDim() <em>Top XDim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopXDim()
	 * @generated
	 * @ordered
	 */
	protected static final double TOP_XDIM_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTopXDim() <em>Top XDim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopXDim()
	 * @generated
	 * @ordered
	 */
	protected double topXDim = TOP_XDIM_EDEFAULT;

	/**
	 * The default value of the '{@link #getYDim() <em>YDim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYDim()
	 * @generated
	 * @ordered
	 */
	protected static final double YDIM_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getYDim() <em>YDim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYDim()
	 * @generated
	 * @ordered
	 */
	protected double yDim = YDIM_EDEFAULT;

	/**
	 * The default value of the '{@link #getTopXOffset() <em>Top XOffset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopXOffset()
	 * @generated
	 * @ordered
	 */
	protected static final double TOP_XOFFSET_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTopXOffset() <em>Top XOffset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopXOffset()
	 * @generated
	 * @ordered
	 */
	protected double topXOffset = TOP_XOFFSET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcTrapeziumProfileDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcTrapeziumProfileDef();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBottomXDim() {
		return bottomXDim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBottomXDim(double newBottomXDim) {
		double oldBottomXDim = bottomXDim;
		bottomXDim = newBottomXDim;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TRAPEZIUM_PROFILE_DEF__BOTTOM_XDIM, oldBottomXDim, bottomXDim));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTopXDim() {
		return topXDim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopXDim(double newTopXDim) {
		double oldTopXDim = topXDim;
		topXDim = newTopXDim;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TRAPEZIUM_PROFILE_DEF__TOP_XDIM, oldTopXDim, topXDim));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getYDim() {
		return yDim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYDim(double newYDim) {
		double oldYDim = yDim;
		yDim = newYDim;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TRAPEZIUM_PROFILE_DEF__YDIM, oldYDim, yDim));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTopXOffset() {
		return topXOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopXOffset(double newTopXOffset) {
		double oldTopXOffset = topXOffset;
		topXOffset = newTopXOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TRAPEZIUM_PROFILE_DEF__TOP_XOFFSET, oldTopXOffset, topXOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalPackage.IFC_TRAPEZIUM_PROFILE_DEF__BOTTOM_XDIM:
				return getBottomXDim();
			case FinalPackage.IFC_TRAPEZIUM_PROFILE_DEF__TOP_XDIM:
				return getTopXDim();
			case FinalPackage.IFC_TRAPEZIUM_PROFILE_DEF__YDIM:
				return getYDim();
			case FinalPackage.IFC_TRAPEZIUM_PROFILE_DEF__TOP_XOFFSET:
				return getTopXOffset();
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
			case FinalPackage.IFC_TRAPEZIUM_PROFILE_DEF__BOTTOM_XDIM:
				setBottomXDim((Double)newValue);
				return;
			case FinalPackage.IFC_TRAPEZIUM_PROFILE_DEF__TOP_XDIM:
				setTopXDim((Double)newValue);
				return;
			case FinalPackage.IFC_TRAPEZIUM_PROFILE_DEF__YDIM:
				setYDim((Double)newValue);
				return;
			case FinalPackage.IFC_TRAPEZIUM_PROFILE_DEF__TOP_XOFFSET:
				setTopXOffset((Double)newValue);
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
			case FinalPackage.IFC_TRAPEZIUM_PROFILE_DEF__BOTTOM_XDIM:
				setBottomXDim(BOTTOM_XDIM_EDEFAULT);
				return;
			case FinalPackage.IFC_TRAPEZIUM_PROFILE_DEF__TOP_XDIM:
				setTopXDim(TOP_XDIM_EDEFAULT);
				return;
			case FinalPackage.IFC_TRAPEZIUM_PROFILE_DEF__YDIM:
				setYDim(YDIM_EDEFAULT);
				return;
			case FinalPackage.IFC_TRAPEZIUM_PROFILE_DEF__TOP_XOFFSET:
				setTopXOffset(TOP_XOFFSET_EDEFAULT);
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
			case FinalPackage.IFC_TRAPEZIUM_PROFILE_DEF__BOTTOM_XDIM:
				return bottomXDim != BOTTOM_XDIM_EDEFAULT;
			case FinalPackage.IFC_TRAPEZIUM_PROFILE_DEF__TOP_XDIM:
				return topXDim != TOP_XDIM_EDEFAULT;
			case FinalPackage.IFC_TRAPEZIUM_PROFILE_DEF__YDIM:
				return yDim != YDIM_EDEFAULT;
			case FinalPackage.IFC_TRAPEZIUM_PROFILE_DEF__TOP_XOFFSET:
				return topXOffset != TOP_XOFFSET_EDEFAULT;
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
		result.append(" (bottomXDim: ");
		result.append(bottomXDim);
		result.append(", topXDim: ");
		result.append(topXDim);
		result.append(", yDim: ");
		result.append(yDim);
		result.append(", topXOffset: ");
		result.append(topXOffset);
		result.append(')');
		return result.toString();
	}

} //IfcTrapeziumProfileDefImpl
