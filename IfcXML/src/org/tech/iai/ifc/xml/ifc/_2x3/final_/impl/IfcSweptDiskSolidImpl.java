/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.DirectrixType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSweptDiskSolid;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Swept Disk Solid</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSweptDiskSolidImpl#getDirectrix <em>Directrix</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSweptDiskSolidImpl#getRadius <em>Radius</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSweptDiskSolidImpl#getInnerRadius <em>Inner Radius</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSweptDiskSolidImpl#getStartParam <em>Start Param</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSweptDiskSolidImpl#getEndParam <em>End Param</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcSweptDiskSolidImpl extends IfcSolidModelImpl implements IfcSweptDiskSolid {
	/**
	 * The cached value of the '{@link #getDirectrix() <em>Directrix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectrix()
	 * @generated
	 * @ordered
	 */
	protected DirectrixType directrix;

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
	 * The default value of the '{@link #getInnerRadius() <em>Inner Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerRadius()
	 * @generated
	 * @ordered
	 */
	protected static final Double INNER_RADIUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInnerRadius() <em>Inner Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerRadius()
	 * @generated
	 * @ordered
	 */
	protected Double innerRadius = INNER_RADIUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartParam() <em>Start Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartParam()
	 * @generated
	 * @ordered
	 */
	protected static final double START_PARAM_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getStartParam() <em>Start Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartParam()
	 * @generated
	 * @ordered
	 */
	protected double startParam = START_PARAM_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndParam() <em>End Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndParam()
	 * @generated
	 * @ordered
	 */
	protected static final double END_PARAM_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getEndParam() <em>End Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndParam()
	 * @generated
	 * @ordered
	 */
	protected double endParam = END_PARAM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSweptDiskSolidImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcSweptDiskSolid();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectrixType getDirectrix() {
		return directrix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDirectrix(DirectrixType newDirectrix, NotificationChain msgs) {
		DirectrixType oldDirectrix = directrix;
		directrix = newDirectrix;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SWEPT_DISK_SOLID__DIRECTRIX, oldDirectrix, newDirectrix);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirectrix(DirectrixType newDirectrix) {
		if (newDirectrix != directrix) {
			NotificationChain msgs = null;
			if (directrix != null)
				msgs = ((InternalEObject)directrix).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SWEPT_DISK_SOLID__DIRECTRIX, null, msgs);
			if (newDirectrix != null)
				msgs = ((InternalEObject)newDirectrix).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SWEPT_DISK_SOLID__DIRECTRIX, null, msgs);
			msgs = basicSetDirectrix(newDirectrix, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SWEPT_DISK_SOLID__DIRECTRIX, newDirectrix, newDirectrix));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SWEPT_DISK_SOLID__RADIUS, oldRadius, radius));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getInnerRadius() {
		return innerRadius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInnerRadius(Double newInnerRadius) {
		Double oldInnerRadius = innerRadius;
		innerRadius = newInnerRadius;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SWEPT_DISK_SOLID__INNER_RADIUS, oldInnerRadius, innerRadius));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getStartParam() {
		return startParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartParam(double newStartParam) {
		double oldStartParam = startParam;
		startParam = newStartParam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SWEPT_DISK_SOLID__START_PARAM, oldStartParam, startParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getEndParam() {
		return endParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndParam(double newEndParam) {
		double oldEndParam = endParam;
		endParam = newEndParam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SWEPT_DISK_SOLID__END_PARAM, oldEndParam, endParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_SWEPT_DISK_SOLID__DIRECTRIX:
				return basicSetDirectrix(null, msgs);
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
			case FinalPackage.IFC_SWEPT_DISK_SOLID__DIRECTRIX:
				return getDirectrix();
			case FinalPackage.IFC_SWEPT_DISK_SOLID__RADIUS:
				return getRadius();
			case FinalPackage.IFC_SWEPT_DISK_SOLID__INNER_RADIUS:
				return getInnerRadius();
			case FinalPackage.IFC_SWEPT_DISK_SOLID__START_PARAM:
				return getStartParam();
			case FinalPackage.IFC_SWEPT_DISK_SOLID__END_PARAM:
				return getEndParam();
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
			case FinalPackage.IFC_SWEPT_DISK_SOLID__DIRECTRIX:
				setDirectrix((DirectrixType)newValue);
				return;
			case FinalPackage.IFC_SWEPT_DISK_SOLID__RADIUS:
				setRadius((Double)newValue);
				return;
			case FinalPackage.IFC_SWEPT_DISK_SOLID__INNER_RADIUS:
				setInnerRadius((Double)newValue);
				return;
			case FinalPackage.IFC_SWEPT_DISK_SOLID__START_PARAM:
				setStartParam((Double)newValue);
				return;
			case FinalPackage.IFC_SWEPT_DISK_SOLID__END_PARAM:
				setEndParam((Double)newValue);
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
			case FinalPackage.IFC_SWEPT_DISK_SOLID__DIRECTRIX:
				setDirectrix((DirectrixType)null);
				return;
			case FinalPackage.IFC_SWEPT_DISK_SOLID__RADIUS:
				setRadius(RADIUS_EDEFAULT);
				return;
			case FinalPackage.IFC_SWEPT_DISK_SOLID__INNER_RADIUS:
				setInnerRadius(INNER_RADIUS_EDEFAULT);
				return;
			case FinalPackage.IFC_SWEPT_DISK_SOLID__START_PARAM:
				setStartParam(START_PARAM_EDEFAULT);
				return;
			case FinalPackage.IFC_SWEPT_DISK_SOLID__END_PARAM:
				setEndParam(END_PARAM_EDEFAULT);
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
			case FinalPackage.IFC_SWEPT_DISK_SOLID__DIRECTRIX:
				return directrix != null;
			case FinalPackage.IFC_SWEPT_DISK_SOLID__RADIUS:
				return radius != RADIUS_EDEFAULT;
			case FinalPackage.IFC_SWEPT_DISK_SOLID__INNER_RADIUS:
				return INNER_RADIUS_EDEFAULT == null ? innerRadius != null : !INNER_RADIUS_EDEFAULT.equals(innerRadius);
			case FinalPackage.IFC_SWEPT_DISK_SOLID__START_PARAM:
				return startParam != START_PARAM_EDEFAULT;
			case FinalPackage.IFC_SWEPT_DISK_SOLID__END_PARAM:
				return endParam != END_PARAM_EDEFAULT;
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
		result.append(", innerRadius: ");
		result.append(innerRadius);
		result.append(", startParam: ");
		result.append(startParam);
		result.append(", endParam: ");
		result.append(endParam);
		result.append(')');
		return result.toString();
	}

} //IfcSweptDiskSolidImpl
