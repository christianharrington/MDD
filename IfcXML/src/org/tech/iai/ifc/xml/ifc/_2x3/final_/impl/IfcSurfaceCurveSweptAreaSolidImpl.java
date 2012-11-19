/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.DirectrixType1;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceCurveSweptAreaSolid;
import org.tech.iai.ifc.xml.ifc._2x3.final_.ReferenceSurfaceType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Surface Curve Swept Area Solid</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSurfaceCurveSweptAreaSolidImpl#getDirectrix <em>Directrix</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSurfaceCurveSweptAreaSolidImpl#getStartParam <em>Start Param</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSurfaceCurveSweptAreaSolidImpl#getEndParam <em>End Param</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSurfaceCurveSweptAreaSolidImpl#getReferenceSurface <em>Reference Surface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcSurfaceCurveSweptAreaSolidImpl extends IfcSweptAreaSolidImpl implements IfcSurfaceCurveSweptAreaSolid {
	/**
	 * The cached value of the '{@link #getDirectrix() <em>Directrix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectrix()
	 * @generated
	 * @ordered
	 */
	protected DirectrixType1 directrix;

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
	 * The cached value of the '{@link #getReferenceSurface() <em>Reference Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceSurface()
	 * @generated
	 * @ordered
	 */
	protected ReferenceSurfaceType referenceSurface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSurfaceCurveSweptAreaSolidImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcSurfaceCurveSweptAreaSolid();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectrixType1 getDirectrix() {
		return directrix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDirectrix(DirectrixType1 newDirectrix, NotificationChain msgs) {
		DirectrixType1 oldDirectrix = directrix;
		directrix = newDirectrix;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SURFACE_CURVE_SWEPT_AREA_SOLID__DIRECTRIX, oldDirectrix, newDirectrix);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirectrix(DirectrixType1 newDirectrix) {
		if (newDirectrix != directrix) {
			NotificationChain msgs = null;
			if (directrix != null)
				msgs = ((InternalEObject)directrix).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SURFACE_CURVE_SWEPT_AREA_SOLID__DIRECTRIX, null, msgs);
			if (newDirectrix != null)
				msgs = ((InternalEObject)newDirectrix).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SURFACE_CURVE_SWEPT_AREA_SOLID__DIRECTRIX, null, msgs);
			msgs = basicSetDirectrix(newDirectrix, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SURFACE_CURVE_SWEPT_AREA_SOLID__DIRECTRIX, newDirectrix, newDirectrix));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SURFACE_CURVE_SWEPT_AREA_SOLID__START_PARAM, oldStartParam, startParam));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SURFACE_CURVE_SWEPT_AREA_SOLID__END_PARAM, oldEndParam, endParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceSurfaceType getReferenceSurface() {
		return referenceSurface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceSurface(ReferenceSurfaceType newReferenceSurface, NotificationChain msgs) {
		ReferenceSurfaceType oldReferenceSurface = referenceSurface;
		referenceSurface = newReferenceSurface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SURFACE_CURVE_SWEPT_AREA_SOLID__REFERENCE_SURFACE, oldReferenceSurface, newReferenceSurface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceSurface(ReferenceSurfaceType newReferenceSurface) {
		if (newReferenceSurface != referenceSurface) {
			NotificationChain msgs = null;
			if (referenceSurface != null)
				msgs = ((InternalEObject)referenceSurface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SURFACE_CURVE_SWEPT_AREA_SOLID__REFERENCE_SURFACE, null, msgs);
			if (newReferenceSurface != null)
				msgs = ((InternalEObject)newReferenceSurface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SURFACE_CURVE_SWEPT_AREA_SOLID__REFERENCE_SURFACE, null, msgs);
			msgs = basicSetReferenceSurface(newReferenceSurface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SURFACE_CURVE_SWEPT_AREA_SOLID__REFERENCE_SURFACE, newReferenceSurface, newReferenceSurface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_SURFACE_CURVE_SWEPT_AREA_SOLID__DIRECTRIX:
				return basicSetDirectrix(null, msgs);
			case FinalPackage.IFC_SURFACE_CURVE_SWEPT_AREA_SOLID__REFERENCE_SURFACE:
				return basicSetReferenceSurface(null, msgs);
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
			case FinalPackage.IFC_SURFACE_CURVE_SWEPT_AREA_SOLID__DIRECTRIX:
				return getDirectrix();
			case FinalPackage.IFC_SURFACE_CURVE_SWEPT_AREA_SOLID__START_PARAM:
				return getStartParam();
			case FinalPackage.IFC_SURFACE_CURVE_SWEPT_AREA_SOLID__END_PARAM:
				return getEndParam();
			case FinalPackage.IFC_SURFACE_CURVE_SWEPT_AREA_SOLID__REFERENCE_SURFACE:
				return getReferenceSurface();
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
			case FinalPackage.IFC_SURFACE_CURVE_SWEPT_AREA_SOLID__DIRECTRIX:
				setDirectrix((DirectrixType1)newValue);
				return;
			case FinalPackage.IFC_SURFACE_CURVE_SWEPT_AREA_SOLID__START_PARAM:
				setStartParam((Double)newValue);
				return;
			case FinalPackage.IFC_SURFACE_CURVE_SWEPT_AREA_SOLID__END_PARAM:
				setEndParam((Double)newValue);
				return;
			case FinalPackage.IFC_SURFACE_CURVE_SWEPT_AREA_SOLID__REFERENCE_SURFACE:
				setReferenceSurface((ReferenceSurfaceType)newValue);
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
			case FinalPackage.IFC_SURFACE_CURVE_SWEPT_AREA_SOLID__DIRECTRIX:
				setDirectrix((DirectrixType1)null);
				return;
			case FinalPackage.IFC_SURFACE_CURVE_SWEPT_AREA_SOLID__START_PARAM:
				setStartParam(START_PARAM_EDEFAULT);
				return;
			case FinalPackage.IFC_SURFACE_CURVE_SWEPT_AREA_SOLID__END_PARAM:
				setEndParam(END_PARAM_EDEFAULT);
				return;
			case FinalPackage.IFC_SURFACE_CURVE_SWEPT_AREA_SOLID__REFERENCE_SURFACE:
				setReferenceSurface((ReferenceSurfaceType)null);
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
			case FinalPackage.IFC_SURFACE_CURVE_SWEPT_AREA_SOLID__DIRECTRIX:
				return directrix != null;
			case FinalPackage.IFC_SURFACE_CURVE_SWEPT_AREA_SOLID__START_PARAM:
				return startParam != START_PARAM_EDEFAULT;
			case FinalPackage.IFC_SURFACE_CURVE_SWEPT_AREA_SOLID__END_PARAM:
				return endParam != END_PARAM_EDEFAULT;
			case FinalPackage.IFC_SURFACE_CURVE_SWEPT_AREA_SOLID__REFERENCE_SURFACE:
				return referenceSurface != null;
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
		result.append(" (startParam: ");
		result.append(startParam);
		result.append(", endParam: ");
		result.append(endParam);
		result.append(')');
		return result.toString();
	}

} //IfcSurfaceCurveSweptAreaSolidImpl
