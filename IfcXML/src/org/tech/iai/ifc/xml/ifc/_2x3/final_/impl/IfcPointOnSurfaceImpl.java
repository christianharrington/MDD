/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.BasisSurfaceType1;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPointOnSurface;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Point On Surface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcPointOnSurfaceImpl#getBasisSurface <em>Basis Surface</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcPointOnSurfaceImpl#getPointParameterU <em>Point Parameter U</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcPointOnSurfaceImpl#getPointParameterV <em>Point Parameter V</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcPointOnSurfaceImpl extends IfcPointImpl implements IfcPointOnSurface {
	/**
	 * The cached value of the '{@link #getBasisSurface() <em>Basis Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasisSurface()
	 * @generated
	 * @ordered
	 */
	protected BasisSurfaceType1 basisSurface;

	/**
	 * The default value of the '{@link #getPointParameterU() <em>Point Parameter U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointParameterU()
	 * @generated
	 * @ordered
	 */
	protected static final double POINT_PARAMETER_U_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPointParameterU() <em>Point Parameter U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointParameterU()
	 * @generated
	 * @ordered
	 */
	protected double pointParameterU = POINT_PARAMETER_U_EDEFAULT;

	/**
	 * The default value of the '{@link #getPointParameterV() <em>Point Parameter V</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointParameterV()
	 * @generated
	 * @ordered
	 */
	protected static final double POINT_PARAMETER_V_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPointParameterV() <em>Point Parameter V</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointParameterV()
	 * @generated
	 * @ordered
	 */
	protected double pointParameterV = POINT_PARAMETER_V_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcPointOnSurfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcPointOnSurface();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasisSurfaceType1 getBasisSurface() {
		return basisSurface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBasisSurface(BasisSurfaceType1 newBasisSurface, NotificationChain msgs) {
		BasisSurfaceType1 oldBasisSurface = basisSurface;
		basisSurface = newBasisSurface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_POINT_ON_SURFACE__BASIS_SURFACE, oldBasisSurface, newBasisSurface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasisSurface(BasisSurfaceType1 newBasisSurface) {
		if (newBasisSurface != basisSurface) {
			NotificationChain msgs = null;
			if (basisSurface != null)
				msgs = ((InternalEObject)basisSurface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_POINT_ON_SURFACE__BASIS_SURFACE, null, msgs);
			if (newBasisSurface != null)
				msgs = ((InternalEObject)newBasisSurface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_POINT_ON_SURFACE__BASIS_SURFACE, null, msgs);
			msgs = basicSetBasisSurface(newBasisSurface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_POINT_ON_SURFACE__BASIS_SURFACE, newBasisSurface, newBasisSurface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPointParameterU() {
		return pointParameterU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointParameterU(double newPointParameterU) {
		double oldPointParameterU = pointParameterU;
		pointParameterU = newPointParameterU;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_POINT_ON_SURFACE__POINT_PARAMETER_U, oldPointParameterU, pointParameterU));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPointParameterV() {
		return pointParameterV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointParameterV(double newPointParameterV) {
		double oldPointParameterV = pointParameterV;
		pointParameterV = newPointParameterV;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_POINT_ON_SURFACE__POINT_PARAMETER_V, oldPointParameterV, pointParameterV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_POINT_ON_SURFACE__BASIS_SURFACE:
				return basicSetBasisSurface(null, msgs);
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
			case FinalPackage.IFC_POINT_ON_SURFACE__BASIS_SURFACE:
				return getBasisSurface();
			case FinalPackage.IFC_POINT_ON_SURFACE__POINT_PARAMETER_U:
				return getPointParameterU();
			case FinalPackage.IFC_POINT_ON_SURFACE__POINT_PARAMETER_V:
				return getPointParameterV();
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
			case FinalPackage.IFC_POINT_ON_SURFACE__BASIS_SURFACE:
				setBasisSurface((BasisSurfaceType1)newValue);
				return;
			case FinalPackage.IFC_POINT_ON_SURFACE__POINT_PARAMETER_U:
				setPointParameterU((Double)newValue);
				return;
			case FinalPackage.IFC_POINT_ON_SURFACE__POINT_PARAMETER_V:
				setPointParameterV((Double)newValue);
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
			case FinalPackage.IFC_POINT_ON_SURFACE__BASIS_SURFACE:
				setBasisSurface((BasisSurfaceType1)null);
				return;
			case FinalPackage.IFC_POINT_ON_SURFACE__POINT_PARAMETER_U:
				setPointParameterU(POINT_PARAMETER_U_EDEFAULT);
				return;
			case FinalPackage.IFC_POINT_ON_SURFACE__POINT_PARAMETER_V:
				setPointParameterV(POINT_PARAMETER_V_EDEFAULT);
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
			case FinalPackage.IFC_POINT_ON_SURFACE__BASIS_SURFACE:
				return basisSurface != null;
			case FinalPackage.IFC_POINT_ON_SURFACE__POINT_PARAMETER_U:
				return pointParameterU != POINT_PARAMETER_U_EDEFAULT;
			case FinalPackage.IFC_POINT_ON_SURFACE__POINT_PARAMETER_V:
				return pointParameterV != POINT_PARAMETER_V_EDEFAULT;
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
		result.append(" (pointParameterU: ");
		result.append(pointParameterU);
		result.append(", pointParameterV: ");
		result.append(pointParameterV);
		result.append(')');
		return result.toString();
	}

} //IfcPointOnSurfaceImpl
