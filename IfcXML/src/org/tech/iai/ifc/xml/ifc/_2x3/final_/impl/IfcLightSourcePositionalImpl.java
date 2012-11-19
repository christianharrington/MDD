/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLightSourcePositional;
import org.tech.iai.ifc.xml.ifc._2x3.final_.PositionType2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Light Source Positional</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcLightSourcePositionalImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcLightSourcePositionalImpl#getRadius <em>Radius</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcLightSourcePositionalImpl#getConstantAttenuation <em>Constant Attenuation</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcLightSourcePositionalImpl#getDistanceAttenuation <em>Distance Attenuation</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcLightSourcePositionalImpl#getQuadricAttenuation <em>Quadric Attenuation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcLightSourcePositionalImpl extends IfcLightSourceImpl implements IfcLightSourcePositional {
	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected PositionType2 position;

	/**
	 * The default value of the '{@link #getRadius() <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadius()
	 * @generated
	 * @ordered
	 */
	protected static final double RADIUS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRadius() <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadius()
	 * @generated
	 * @ordered
	 */
	protected double radius = RADIUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstantAttenuation() <em>Constant Attenuation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstantAttenuation()
	 * @generated
	 * @ordered
	 */
	protected static final double CONSTANT_ATTENUATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getConstantAttenuation() <em>Constant Attenuation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstantAttenuation()
	 * @generated
	 * @ordered
	 */
	protected double constantAttenuation = CONSTANT_ATTENUATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDistanceAttenuation() <em>Distance Attenuation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceAttenuation()
	 * @generated
	 * @ordered
	 */
	protected static final double DISTANCE_ATTENUATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDistanceAttenuation() <em>Distance Attenuation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceAttenuation()
	 * @generated
	 * @ordered
	 */
	protected double distanceAttenuation = DISTANCE_ATTENUATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuadricAttenuation() <em>Quadric Attenuation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuadricAttenuation()
	 * @generated
	 * @ordered
	 */
	protected static final double QUADRIC_ATTENUATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getQuadricAttenuation() <em>Quadric Attenuation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuadricAttenuation()
	 * @generated
	 * @ordered
	 */
	protected double quadricAttenuation = QUADRIC_ATTENUATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcLightSourcePositionalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcLightSourcePositional();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionType2 getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPosition(PositionType2 newPosition, NotificationChain msgs) {
		PositionType2 oldPosition = position;
		position = newPosition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_LIGHT_SOURCE_POSITIONAL__POSITION, oldPosition, newPosition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(PositionType2 newPosition) {
		if (newPosition != position) {
			NotificationChain msgs = null;
			if (position != null)
				msgs = ((InternalEObject)position).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_LIGHT_SOURCE_POSITIONAL__POSITION, null, msgs);
			if (newPosition != null)
				msgs = ((InternalEObject)newPosition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_LIGHT_SOURCE_POSITIONAL__POSITION, null, msgs);
			msgs = basicSetPosition(newPosition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_LIGHT_SOURCE_POSITIONAL__POSITION, newPosition, newPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRadius(double newRadius) {
		double oldRadius = radius;
		radius = newRadius;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_LIGHT_SOURCE_POSITIONAL__RADIUS, oldRadius, radius));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getConstantAttenuation() {
		return constantAttenuation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstantAttenuation(double newConstantAttenuation) {
		double oldConstantAttenuation = constantAttenuation;
		constantAttenuation = newConstantAttenuation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_LIGHT_SOURCE_POSITIONAL__CONSTANT_ATTENUATION, oldConstantAttenuation, constantAttenuation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDistanceAttenuation() {
		return distanceAttenuation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistanceAttenuation(double newDistanceAttenuation) {
		double oldDistanceAttenuation = distanceAttenuation;
		distanceAttenuation = newDistanceAttenuation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_LIGHT_SOURCE_POSITIONAL__DISTANCE_ATTENUATION, oldDistanceAttenuation, distanceAttenuation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getQuadricAttenuation() {
		return quadricAttenuation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuadricAttenuation(double newQuadricAttenuation) {
		double oldQuadricAttenuation = quadricAttenuation;
		quadricAttenuation = newQuadricAttenuation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_LIGHT_SOURCE_POSITIONAL__QUADRIC_ATTENUATION, oldQuadricAttenuation, quadricAttenuation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_LIGHT_SOURCE_POSITIONAL__POSITION:
				return basicSetPosition(null, msgs);
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
			case FinalPackage.IFC_LIGHT_SOURCE_POSITIONAL__POSITION:
				return getPosition();
			case FinalPackage.IFC_LIGHT_SOURCE_POSITIONAL__RADIUS:
				return getRadius();
			case FinalPackage.IFC_LIGHT_SOURCE_POSITIONAL__CONSTANT_ATTENUATION:
				return getConstantAttenuation();
			case FinalPackage.IFC_LIGHT_SOURCE_POSITIONAL__DISTANCE_ATTENUATION:
				return getDistanceAttenuation();
			case FinalPackage.IFC_LIGHT_SOURCE_POSITIONAL__QUADRIC_ATTENUATION:
				return getQuadricAttenuation();
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
			case FinalPackage.IFC_LIGHT_SOURCE_POSITIONAL__POSITION:
				setPosition((PositionType2)newValue);
				return;
			case FinalPackage.IFC_LIGHT_SOURCE_POSITIONAL__RADIUS:
				setRadius((Double)newValue);
				return;
			case FinalPackage.IFC_LIGHT_SOURCE_POSITIONAL__CONSTANT_ATTENUATION:
				setConstantAttenuation((Double)newValue);
				return;
			case FinalPackage.IFC_LIGHT_SOURCE_POSITIONAL__DISTANCE_ATTENUATION:
				setDistanceAttenuation((Double)newValue);
				return;
			case FinalPackage.IFC_LIGHT_SOURCE_POSITIONAL__QUADRIC_ATTENUATION:
				setQuadricAttenuation((Double)newValue);
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
			case FinalPackage.IFC_LIGHT_SOURCE_POSITIONAL__POSITION:
				setPosition((PositionType2)null);
				return;
			case FinalPackage.IFC_LIGHT_SOURCE_POSITIONAL__RADIUS:
				setRadius(RADIUS_EDEFAULT);
				return;
			case FinalPackage.IFC_LIGHT_SOURCE_POSITIONAL__CONSTANT_ATTENUATION:
				setConstantAttenuation(CONSTANT_ATTENUATION_EDEFAULT);
				return;
			case FinalPackage.IFC_LIGHT_SOURCE_POSITIONAL__DISTANCE_ATTENUATION:
				setDistanceAttenuation(DISTANCE_ATTENUATION_EDEFAULT);
				return;
			case FinalPackage.IFC_LIGHT_SOURCE_POSITIONAL__QUADRIC_ATTENUATION:
				setQuadricAttenuation(QUADRIC_ATTENUATION_EDEFAULT);
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
			case FinalPackage.IFC_LIGHT_SOURCE_POSITIONAL__POSITION:
				return position != null;
			case FinalPackage.IFC_LIGHT_SOURCE_POSITIONAL__RADIUS:
				return radius != RADIUS_EDEFAULT;
			case FinalPackage.IFC_LIGHT_SOURCE_POSITIONAL__CONSTANT_ATTENUATION:
				return constantAttenuation != CONSTANT_ATTENUATION_EDEFAULT;
			case FinalPackage.IFC_LIGHT_SOURCE_POSITIONAL__DISTANCE_ATTENUATION:
				return distanceAttenuation != DISTANCE_ATTENUATION_EDEFAULT;
			case FinalPackage.IFC_LIGHT_SOURCE_POSITIONAL__QUADRIC_ATTENUATION:
				return quadricAttenuation != QUADRIC_ATTENUATION_EDEFAULT;
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
		result.append(" (radius: ");
		result.append(radius);
		result.append(", constantAttenuation: ");
		result.append(constantAttenuation);
		result.append(", distanceAttenuation: ");
		result.append(distanceAttenuation);
		result.append(", quadricAttenuation: ");
		result.append(quadricAttenuation);
		result.append(')');
		return result.toString();
	}

} //IfcLightSourcePositionalImpl
