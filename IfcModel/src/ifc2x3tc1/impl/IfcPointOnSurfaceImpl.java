/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcPointOnSurface;
import ifc2x3tc1.IfcSurface;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Point On Surface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcPointOnSurfaceImpl#getBasisSurface <em>Basis Surface</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcPointOnSurfaceImpl#getPointParameterU <em>Point Parameter U</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcPointOnSurfaceImpl#getPointParameterUAsString <em>Point Parameter UAs String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcPointOnSurfaceImpl#getPointParameterV <em>Point Parameter V</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcPointOnSurfaceImpl#getPointParameterVAsString <em>Point Parameter VAs String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcPointOnSurfaceImpl#getDim <em>Dim</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcPointOnSurfaceImpl extends IfcPointImpl implements IfcPointOnSurface {
	/**
	 * The cached value of the '{@link #getBasisSurface() <em>Basis Surface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasisSurface()
	 * @generated
	 * @ordered
	 */
	protected IfcSurface basisSurface;

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
	 * The default value of the '{@link #getPointParameterUAsString() <em>Point Parameter UAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointParameterUAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String POINT_PARAMETER_UAS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPointParameterUAsString() <em>Point Parameter UAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointParameterUAsString()
	 * @generated
	 * @ordered
	 */
	protected String pointParameterUAsString = POINT_PARAMETER_UAS_STRING_EDEFAULT;

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
	 * The default value of the '{@link #getPointParameterVAsString() <em>Point Parameter VAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointParameterVAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String POINT_PARAMETER_VAS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPointParameterVAsString() <em>Point Parameter VAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointParameterVAsString()
	 * @generated
	 * @ordered
	 */
	protected String pointParameterVAsString = POINT_PARAMETER_VAS_STRING_EDEFAULT;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcPointOnSurface();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSurface getBasisSurface() {
		if (basisSurface != null && basisSurface.eIsProxy()) {
			InternalEObject oldBasisSurface = (InternalEObject)basisSurface;
			basisSurface = (IfcSurface)eResolveProxy(oldBasisSurface);
			if (basisSurface != oldBasisSurface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_POINT_ON_SURFACE__BASIS_SURFACE, oldBasisSurface, basisSurface));
			}
		}
		return basisSurface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSurface basicGetBasisSurface() {
		return basisSurface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasisSurface(IfcSurface newBasisSurface) {
		IfcSurface oldBasisSurface = basisSurface;
		basisSurface = newBasisSurface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_POINT_ON_SURFACE__BASIS_SURFACE, oldBasisSurface, basisSurface));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_POINT_ON_SURFACE__POINT_PARAMETER_U, oldPointParameterU, pointParameterU));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPointParameterUAsString() {
		return pointParameterUAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointParameterUAsString(String newPointParameterUAsString) {
		String oldPointParameterUAsString = pointParameterUAsString;
		pointParameterUAsString = newPointParameterUAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_POINT_ON_SURFACE__POINT_PARAMETER_UAS_STRING, oldPointParameterUAsString, pointParameterUAsString));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_POINT_ON_SURFACE__POINT_PARAMETER_V, oldPointParameterV, pointParameterV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPointParameterVAsString() {
		return pointParameterVAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointParameterVAsString(String newPointParameterVAsString) {
		String oldPointParameterVAsString = pointParameterVAsString;
		pointParameterVAsString = newPointParameterVAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_POINT_ON_SURFACE__POINT_PARAMETER_VAS_STRING, oldPointParameterVAsString, pointParameterVAsString));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_POINT_ON_SURFACE__DIM, oldDim, dim, !oldDimESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_POINT_ON_SURFACE__DIM, oldDim, DIM_EDEFAULT, oldDimESet));
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
			case Ifc2x3tc1Package.IFC_POINT_ON_SURFACE__BASIS_SURFACE:
				if (resolve) return getBasisSurface();
				return basicGetBasisSurface();
			case Ifc2x3tc1Package.IFC_POINT_ON_SURFACE__POINT_PARAMETER_U:
				return getPointParameterU();
			case Ifc2x3tc1Package.IFC_POINT_ON_SURFACE__POINT_PARAMETER_UAS_STRING:
				return getPointParameterUAsString();
			case Ifc2x3tc1Package.IFC_POINT_ON_SURFACE__POINT_PARAMETER_V:
				return getPointParameterV();
			case Ifc2x3tc1Package.IFC_POINT_ON_SURFACE__POINT_PARAMETER_VAS_STRING:
				return getPointParameterVAsString();
			case Ifc2x3tc1Package.IFC_POINT_ON_SURFACE__DIM:
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
			case Ifc2x3tc1Package.IFC_POINT_ON_SURFACE__BASIS_SURFACE:
				setBasisSurface((IfcSurface)newValue);
				return;
			case Ifc2x3tc1Package.IFC_POINT_ON_SURFACE__POINT_PARAMETER_U:
				setPointParameterU((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_POINT_ON_SURFACE__POINT_PARAMETER_UAS_STRING:
				setPointParameterUAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_POINT_ON_SURFACE__POINT_PARAMETER_V:
				setPointParameterV((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_POINT_ON_SURFACE__POINT_PARAMETER_VAS_STRING:
				setPointParameterVAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_POINT_ON_SURFACE__DIM:
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
			case Ifc2x3tc1Package.IFC_POINT_ON_SURFACE__BASIS_SURFACE:
				setBasisSurface((IfcSurface)null);
				return;
			case Ifc2x3tc1Package.IFC_POINT_ON_SURFACE__POINT_PARAMETER_U:
				setPointParameterU(POINT_PARAMETER_U_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_POINT_ON_SURFACE__POINT_PARAMETER_UAS_STRING:
				setPointParameterUAsString(POINT_PARAMETER_UAS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_POINT_ON_SURFACE__POINT_PARAMETER_V:
				setPointParameterV(POINT_PARAMETER_V_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_POINT_ON_SURFACE__POINT_PARAMETER_VAS_STRING:
				setPointParameterVAsString(POINT_PARAMETER_VAS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_POINT_ON_SURFACE__DIM:
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
			case Ifc2x3tc1Package.IFC_POINT_ON_SURFACE__BASIS_SURFACE:
				return basisSurface != null;
			case Ifc2x3tc1Package.IFC_POINT_ON_SURFACE__POINT_PARAMETER_U:
				return pointParameterU != POINT_PARAMETER_U_EDEFAULT;
			case Ifc2x3tc1Package.IFC_POINT_ON_SURFACE__POINT_PARAMETER_UAS_STRING:
				return POINT_PARAMETER_UAS_STRING_EDEFAULT == null ? pointParameterUAsString != null : !POINT_PARAMETER_UAS_STRING_EDEFAULT.equals(pointParameterUAsString);
			case Ifc2x3tc1Package.IFC_POINT_ON_SURFACE__POINT_PARAMETER_V:
				return pointParameterV != POINT_PARAMETER_V_EDEFAULT;
			case Ifc2x3tc1Package.IFC_POINT_ON_SURFACE__POINT_PARAMETER_VAS_STRING:
				return POINT_PARAMETER_VAS_STRING_EDEFAULT == null ? pointParameterVAsString != null : !POINT_PARAMETER_VAS_STRING_EDEFAULT.equals(pointParameterVAsString);
			case Ifc2x3tc1Package.IFC_POINT_ON_SURFACE__DIM:
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
		result.append(" (PointParameterU: ");
		result.append(pointParameterU);
		result.append(", PointParameterUAsString: ");
		result.append(pointParameterUAsString);
		result.append(", PointParameterV: ");
		result.append(pointParameterV);
		result.append(", PointParameterVAsString: ");
		result.append(pointParameterVAsString);
		result.append(", Dim: ");
		if (dimESet) result.append(dim); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcPointOnSurfaceImpl
