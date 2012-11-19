/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.BasisCurveType2;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPointOnCurve;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Point On Curve</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcPointOnCurveImpl#getBasisCurve <em>Basis Curve</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcPointOnCurveImpl#getPointParameter <em>Point Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcPointOnCurveImpl extends IfcPointImpl implements IfcPointOnCurve {
	/**
	 * The cached value of the '{@link #getBasisCurve() <em>Basis Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasisCurve()
	 * @generated
	 * @ordered
	 */
	protected BasisCurveType2 basisCurve;

	/**
	 * The default value of the '{@link #getPointParameter() <em>Point Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointParameter()
	 * @generated
	 * @ordered
	 */
	protected static final double POINT_PARAMETER_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPointParameter() <em>Point Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointParameter()
	 * @generated
	 * @ordered
	 */
	protected double pointParameter = POINT_PARAMETER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcPointOnCurveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcPointOnCurve();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasisCurveType2 getBasisCurve() {
		return basisCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBasisCurve(BasisCurveType2 newBasisCurve, NotificationChain msgs) {
		BasisCurveType2 oldBasisCurve = basisCurve;
		basisCurve = newBasisCurve;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_POINT_ON_CURVE__BASIS_CURVE, oldBasisCurve, newBasisCurve);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasisCurve(BasisCurveType2 newBasisCurve) {
		if (newBasisCurve != basisCurve) {
			NotificationChain msgs = null;
			if (basisCurve != null)
				msgs = ((InternalEObject)basisCurve).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_POINT_ON_CURVE__BASIS_CURVE, null, msgs);
			if (newBasisCurve != null)
				msgs = ((InternalEObject)newBasisCurve).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_POINT_ON_CURVE__BASIS_CURVE, null, msgs);
			msgs = basicSetBasisCurve(newBasisCurve, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_POINT_ON_CURVE__BASIS_CURVE, newBasisCurve, newBasisCurve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPointParameter() {
		return pointParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointParameter(double newPointParameter) {
		double oldPointParameter = pointParameter;
		pointParameter = newPointParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_POINT_ON_CURVE__POINT_PARAMETER, oldPointParameter, pointParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_POINT_ON_CURVE__BASIS_CURVE:
				return basicSetBasisCurve(null, msgs);
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
			case FinalPackage.IFC_POINT_ON_CURVE__BASIS_CURVE:
				return getBasisCurve();
			case FinalPackage.IFC_POINT_ON_CURVE__POINT_PARAMETER:
				return getPointParameter();
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
			case FinalPackage.IFC_POINT_ON_CURVE__BASIS_CURVE:
				setBasisCurve((BasisCurveType2)newValue);
				return;
			case FinalPackage.IFC_POINT_ON_CURVE__POINT_PARAMETER:
				setPointParameter((Double)newValue);
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
			case FinalPackage.IFC_POINT_ON_CURVE__BASIS_CURVE:
				setBasisCurve((BasisCurveType2)null);
				return;
			case FinalPackage.IFC_POINT_ON_CURVE__POINT_PARAMETER:
				setPointParameter(POINT_PARAMETER_EDEFAULT);
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
			case FinalPackage.IFC_POINT_ON_CURVE__BASIS_CURVE:
				return basisCurve != null;
			case FinalPackage.IFC_POINT_ON_CURVE__POINT_PARAMETER:
				return pointParameter != POINT_PARAMETER_EDEFAULT;
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
		result.append(" (pointParameter: ");
		result.append(pointParameter);
		result.append(')');
		return result.toString();
	}

} //IfcPointOnCurveImpl
