/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcCurve;
import ifc2x3tc1.IfcPointOnCurve;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Point On Curve</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcPointOnCurveImpl#getBasisCurve <em>Basis Curve</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcPointOnCurveImpl#getPointParameter <em>Point Parameter</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcPointOnCurveImpl#getPointParameterAsString <em>Point Parameter As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcPointOnCurveImpl#getDim <em>Dim</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcPointOnCurveImpl extends IfcPointImpl implements IfcPointOnCurve {
	/**
	 * The cached value of the '{@link #getBasisCurve() <em>Basis Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasisCurve()
	 * @generated
	 * @ordered
	 */
	protected IfcCurve basisCurve;

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
	 * The default value of the '{@link #getPointParameterAsString() <em>Point Parameter As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointParameterAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String POINT_PARAMETER_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPointParameterAsString() <em>Point Parameter As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointParameterAsString()
	 * @generated
	 * @ordered
	 */
	protected String pointParameterAsString = POINT_PARAMETER_AS_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getDim() <em>Dim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDim()
	 * @generated
	 * @ordered
	 */
	protected static final int DIM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDim() <em>Dim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDim()
	 * @generated
	 * @ordered
	 */
	protected int dim = DIM_EDEFAULT;

	/**
	 * This is true if the Dim attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dimESet;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcPointOnCurve();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurve getBasisCurve() {
		if (basisCurve != null && basisCurve.eIsProxy()) {
			InternalEObject oldBasisCurve = (InternalEObject)basisCurve;
			basisCurve = (IfcCurve)eResolveProxy(oldBasisCurve);
			if (basisCurve != oldBasisCurve) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_POINT_ON_CURVE__BASIS_CURVE, oldBasisCurve, basisCurve));
			}
		}
		return basisCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurve basicGetBasisCurve() {
		return basisCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasisCurve(IfcCurve newBasisCurve) {
		IfcCurve oldBasisCurve = basisCurve;
		basisCurve = newBasisCurve;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_POINT_ON_CURVE__BASIS_CURVE, oldBasisCurve, basisCurve));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_POINT_ON_CURVE__POINT_PARAMETER, oldPointParameter, pointParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPointParameterAsString() {
		return pointParameterAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointParameterAsString(String newPointParameterAsString) {
		String oldPointParameterAsString = pointParameterAsString;
		pointParameterAsString = newPointParameterAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_POINT_ON_CURVE__POINT_PARAMETER_AS_STRING, oldPointParameterAsString, pointParameterAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDim() {
		return dim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDim(int newDim) {
		int oldDim = dim;
		dim = newDim;
		boolean oldDimESet = dimESet;
		dimESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_POINT_ON_CURVE__DIM, oldDim, dim, !oldDimESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDim() {
		int oldDim = dim;
		boolean oldDimESet = dimESet;
		dim = DIM_EDEFAULT;
		dimESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_POINT_ON_CURVE__DIM, oldDim, DIM_EDEFAULT, oldDimESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDim() {
		return dimESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_POINT_ON_CURVE__BASIS_CURVE:
				if (resolve) return getBasisCurve();
				return basicGetBasisCurve();
			case Ifc2x3tc1Package.IFC_POINT_ON_CURVE__POINT_PARAMETER:
				return getPointParameter();
			case Ifc2x3tc1Package.IFC_POINT_ON_CURVE__POINT_PARAMETER_AS_STRING:
				return getPointParameterAsString();
			case Ifc2x3tc1Package.IFC_POINT_ON_CURVE__DIM:
				return getDim();
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
			case Ifc2x3tc1Package.IFC_POINT_ON_CURVE__BASIS_CURVE:
				setBasisCurve((IfcCurve)newValue);
				return;
			case Ifc2x3tc1Package.IFC_POINT_ON_CURVE__POINT_PARAMETER:
				setPointParameter((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_POINT_ON_CURVE__POINT_PARAMETER_AS_STRING:
				setPointParameterAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_POINT_ON_CURVE__DIM:
				setDim((Integer)newValue);
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
			case Ifc2x3tc1Package.IFC_POINT_ON_CURVE__BASIS_CURVE:
				setBasisCurve((IfcCurve)null);
				return;
			case Ifc2x3tc1Package.IFC_POINT_ON_CURVE__POINT_PARAMETER:
				setPointParameter(POINT_PARAMETER_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_POINT_ON_CURVE__POINT_PARAMETER_AS_STRING:
				setPointParameterAsString(POINT_PARAMETER_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_POINT_ON_CURVE__DIM:
				unsetDim();
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
			case Ifc2x3tc1Package.IFC_POINT_ON_CURVE__BASIS_CURVE:
				return basisCurve != null;
			case Ifc2x3tc1Package.IFC_POINT_ON_CURVE__POINT_PARAMETER:
				return pointParameter != POINT_PARAMETER_EDEFAULT;
			case Ifc2x3tc1Package.IFC_POINT_ON_CURVE__POINT_PARAMETER_AS_STRING:
				return POINT_PARAMETER_AS_STRING_EDEFAULT == null ? pointParameterAsString != null : !POINT_PARAMETER_AS_STRING_EDEFAULT.equals(pointParameterAsString);
			case Ifc2x3tc1Package.IFC_POINT_ON_CURVE__DIM:
				return isSetDim();
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
		result.append(" (PointParameter: ");
		result.append(pointParameter);
		result.append(", PointParameterAsString: ");
		result.append(pointParameterAsString);
		result.append(", Dim: ");
		if (dimESet) result.append(dim); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcPointOnCurveImpl
