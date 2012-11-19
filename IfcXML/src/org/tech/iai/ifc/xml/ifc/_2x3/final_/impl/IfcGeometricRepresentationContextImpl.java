/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcGeometricRepresentationContext;
import org.tech.iai.ifc.xml.ifc._2x3.final_.TrueNorthType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.WorldCoordinateSystemType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Geometric Representation Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcGeometricRepresentationContextImpl#getCoordinateSpaceDimension <em>Coordinate Space Dimension</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcGeometricRepresentationContextImpl#getPrecision <em>Precision</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcGeometricRepresentationContextImpl#getWorldCoordinateSystem <em>World Coordinate System</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcGeometricRepresentationContextImpl#getTrueNorth <em>True North</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcGeometricRepresentationContextImpl extends IfcRepresentationContextImpl implements IfcGeometricRepresentationContext {
	/**
	 * The default value of the '{@link #getCoordinateSpaceDimension() <em>Coordinate Space Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinateSpaceDimension()
	 * @generated
	 * @ordered
	 */
	protected static final long COORDINATE_SPACE_DIMENSION_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getCoordinateSpaceDimension() <em>Coordinate Space Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinateSpaceDimension()
	 * @generated
	 * @ordered
	 */
	protected long coordinateSpaceDimension = COORDINATE_SPACE_DIMENSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected static final Double PRECISION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected Double precision = PRECISION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWorldCoordinateSystem() <em>World Coordinate System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorldCoordinateSystem()
	 * @generated
	 * @ordered
	 */
	protected WorldCoordinateSystemType worldCoordinateSystem;

	/**
	 * The cached value of the '{@link #getTrueNorth() <em>True North</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrueNorth()
	 * @generated
	 * @ordered
	 */
	protected TrueNorthType trueNorth;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcGeometricRepresentationContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcGeometricRepresentationContext();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getCoordinateSpaceDimension() {
		return coordinateSpaceDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordinateSpaceDimension(long newCoordinateSpaceDimension) {
		long oldCoordinateSpaceDimension = coordinateSpaceDimension;
		coordinateSpaceDimension = newCoordinateSpaceDimension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__COORDINATE_SPACE_DIMENSION, oldCoordinateSpaceDimension, coordinateSpaceDimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getPrecision() {
		return precision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecision(Double newPrecision) {
		Double oldPrecision = precision;
		precision = newPrecision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__PRECISION, oldPrecision, precision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorldCoordinateSystemType getWorldCoordinateSystem() {
		return worldCoordinateSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorldCoordinateSystem(WorldCoordinateSystemType newWorldCoordinateSystem, NotificationChain msgs) {
		WorldCoordinateSystemType oldWorldCoordinateSystem = worldCoordinateSystem;
		worldCoordinateSystem = newWorldCoordinateSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__WORLD_COORDINATE_SYSTEM, oldWorldCoordinateSystem, newWorldCoordinateSystem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorldCoordinateSystem(WorldCoordinateSystemType newWorldCoordinateSystem) {
		if (newWorldCoordinateSystem != worldCoordinateSystem) {
			NotificationChain msgs = null;
			if (worldCoordinateSystem != null)
				msgs = ((InternalEObject)worldCoordinateSystem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__WORLD_COORDINATE_SYSTEM, null, msgs);
			if (newWorldCoordinateSystem != null)
				msgs = ((InternalEObject)newWorldCoordinateSystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__WORLD_COORDINATE_SYSTEM, null, msgs);
			msgs = basicSetWorldCoordinateSystem(newWorldCoordinateSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__WORLD_COORDINATE_SYSTEM, newWorldCoordinateSystem, newWorldCoordinateSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrueNorthType getTrueNorth() {
		return trueNorth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrueNorth(TrueNorthType newTrueNorth, NotificationChain msgs) {
		TrueNorthType oldTrueNorth = trueNorth;
		trueNorth = newTrueNorth;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__TRUE_NORTH, oldTrueNorth, newTrueNorth);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrueNorth(TrueNorthType newTrueNorth) {
		if (newTrueNorth != trueNorth) {
			NotificationChain msgs = null;
			if (trueNorth != null)
				msgs = ((InternalEObject)trueNorth).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__TRUE_NORTH, null, msgs);
			if (newTrueNorth != null)
				msgs = ((InternalEObject)newTrueNorth).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__TRUE_NORTH, null, msgs);
			msgs = basicSetTrueNorth(newTrueNorth, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__TRUE_NORTH, newTrueNorth, newTrueNorth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__WORLD_COORDINATE_SYSTEM:
				return basicSetWorldCoordinateSystem(null, msgs);
			case FinalPackage.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__TRUE_NORTH:
				return basicSetTrueNorth(null, msgs);
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
			case FinalPackage.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__COORDINATE_SPACE_DIMENSION:
				return getCoordinateSpaceDimension();
			case FinalPackage.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__PRECISION:
				return getPrecision();
			case FinalPackage.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__WORLD_COORDINATE_SYSTEM:
				return getWorldCoordinateSystem();
			case FinalPackage.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__TRUE_NORTH:
				return getTrueNorth();
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
			case FinalPackage.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__COORDINATE_SPACE_DIMENSION:
				setCoordinateSpaceDimension((Long)newValue);
				return;
			case FinalPackage.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__PRECISION:
				setPrecision((Double)newValue);
				return;
			case FinalPackage.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__WORLD_COORDINATE_SYSTEM:
				setWorldCoordinateSystem((WorldCoordinateSystemType)newValue);
				return;
			case FinalPackage.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__TRUE_NORTH:
				setTrueNorth((TrueNorthType)newValue);
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
			case FinalPackage.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__COORDINATE_SPACE_DIMENSION:
				setCoordinateSpaceDimension(COORDINATE_SPACE_DIMENSION_EDEFAULT);
				return;
			case FinalPackage.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__PRECISION:
				setPrecision(PRECISION_EDEFAULT);
				return;
			case FinalPackage.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__WORLD_COORDINATE_SYSTEM:
				setWorldCoordinateSystem((WorldCoordinateSystemType)null);
				return;
			case FinalPackage.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__TRUE_NORTH:
				setTrueNorth((TrueNorthType)null);
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
			case FinalPackage.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__COORDINATE_SPACE_DIMENSION:
				return coordinateSpaceDimension != COORDINATE_SPACE_DIMENSION_EDEFAULT;
			case FinalPackage.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__PRECISION:
				return PRECISION_EDEFAULT == null ? precision != null : !PRECISION_EDEFAULT.equals(precision);
			case FinalPackage.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__WORLD_COORDINATE_SYSTEM:
				return worldCoordinateSystem != null;
			case FinalPackage.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__TRUE_NORTH:
				return trueNorth != null;
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
		result.append(" (coordinateSpaceDimension: ");
		result.append(coordinateSpaceDimension);
		result.append(", precision: ");
		result.append(precision);
		result.append(')');
		return result.toString();
	}

} //IfcGeometricRepresentationContextImpl
