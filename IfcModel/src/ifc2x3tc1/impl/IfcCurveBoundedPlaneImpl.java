/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcCurve;
import ifc2x3tc1.IfcCurveBoundedPlane;
import ifc2x3tc1.IfcPlane;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Curve Bounded Plane</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcCurveBoundedPlaneImpl#getBasisSurface <em>Basis Surface</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcCurveBoundedPlaneImpl#getOuterBoundary <em>Outer Boundary</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcCurveBoundedPlaneImpl#getInnerBoundaries <em>Inner Boundaries</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcCurveBoundedPlaneImpl#getDim <em>Dim</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcCurveBoundedPlaneImpl extends IfcBoundedSurfaceImpl implements IfcCurveBoundedPlane {
	/**
	 * The cached value of the '{@link #getBasisSurface() <em>Basis Surface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasisSurface()
	 * @generated
	 * @ordered
	 */
	protected IfcPlane basisSurface;

	/**
	 * The cached value of the '{@link #getOuterBoundary() <em>Outer Boundary</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuterBoundary()
	 * @generated
	 * @ordered
	 */
	protected IfcCurve outerBoundary;

	/**
	 * The cached value of the '{@link #getInnerBoundaries() <em>Inner Boundaries</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerBoundaries()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcCurve> innerBoundaries;

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
	protected IfcCurveBoundedPlaneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcCurveBoundedPlane();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPlane getBasisSurface() {
		if (basisSurface != null && basisSurface.eIsProxy()) {
			InternalEObject oldBasisSurface = (InternalEObject)basisSurface;
			basisSurface = (IfcPlane)eResolveProxy(oldBasisSurface);
			if (basisSurface != oldBasisSurface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_CURVE_BOUNDED_PLANE__BASIS_SURFACE, oldBasisSurface, basisSurface));
			}
		}
		return basisSurface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPlane basicGetBasisSurface() {
		return basisSurface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasisSurface(IfcPlane newBasisSurface) {
		IfcPlane oldBasisSurface = basisSurface;
		basisSurface = newBasisSurface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CURVE_BOUNDED_PLANE__BASIS_SURFACE, oldBasisSurface, basisSurface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurve getOuterBoundary() {
		if (outerBoundary != null && outerBoundary.eIsProxy()) {
			InternalEObject oldOuterBoundary = (InternalEObject)outerBoundary;
			outerBoundary = (IfcCurve)eResolveProxy(oldOuterBoundary);
			if (outerBoundary != oldOuterBoundary) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_CURVE_BOUNDED_PLANE__OUTER_BOUNDARY, oldOuterBoundary, outerBoundary));
			}
		}
		return outerBoundary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurve basicGetOuterBoundary() {
		return outerBoundary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOuterBoundary(IfcCurve newOuterBoundary) {
		IfcCurve oldOuterBoundary = outerBoundary;
		outerBoundary = newOuterBoundary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CURVE_BOUNDED_PLANE__OUTER_BOUNDARY, oldOuterBoundary, outerBoundary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcCurve> getInnerBoundaries() {
		if (innerBoundaries == null) {
			innerBoundaries = new EObjectResolvingEList<IfcCurve>(IfcCurve.class, this, Ifc2x3tc1Package.IFC_CURVE_BOUNDED_PLANE__INNER_BOUNDARIES);
		}
		return innerBoundaries;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CURVE_BOUNDED_PLANE__DIM, oldDim, dim, !oldDimESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_CURVE_BOUNDED_PLANE__DIM, oldDim, DIM_EDEFAULT, oldDimESet));
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
			case Ifc2x3tc1Package.IFC_CURVE_BOUNDED_PLANE__BASIS_SURFACE:
				if (resolve) return getBasisSurface();
				return basicGetBasisSurface();
			case Ifc2x3tc1Package.IFC_CURVE_BOUNDED_PLANE__OUTER_BOUNDARY:
				if (resolve) return getOuterBoundary();
				return basicGetOuterBoundary();
			case Ifc2x3tc1Package.IFC_CURVE_BOUNDED_PLANE__INNER_BOUNDARIES:
				return getInnerBoundaries();
			case Ifc2x3tc1Package.IFC_CURVE_BOUNDED_PLANE__DIM:
				return getDim();
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
			case Ifc2x3tc1Package.IFC_CURVE_BOUNDED_PLANE__BASIS_SURFACE:
				setBasisSurface((IfcPlane)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CURVE_BOUNDED_PLANE__OUTER_BOUNDARY:
				setOuterBoundary((IfcCurve)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CURVE_BOUNDED_PLANE__INNER_BOUNDARIES:
				getInnerBoundaries().clear();
				getInnerBoundaries().addAll((Collection<? extends IfcCurve>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CURVE_BOUNDED_PLANE__DIM:
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
			case Ifc2x3tc1Package.IFC_CURVE_BOUNDED_PLANE__BASIS_SURFACE:
				setBasisSurface((IfcPlane)null);
				return;
			case Ifc2x3tc1Package.IFC_CURVE_BOUNDED_PLANE__OUTER_BOUNDARY:
				setOuterBoundary((IfcCurve)null);
				return;
			case Ifc2x3tc1Package.IFC_CURVE_BOUNDED_PLANE__INNER_BOUNDARIES:
				getInnerBoundaries().clear();
				return;
			case Ifc2x3tc1Package.IFC_CURVE_BOUNDED_PLANE__DIM:
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
			case Ifc2x3tc1Package.IFC_CURVE_BOUNDED_PLANE__BASIS_SURFACE:
				return basisSurface != null;
			case Ifc2x3tc1Package.IFC_CURVE_BOUNDED_PLANE__OUTER_BOUNDARY:
				return outerBoundary != null;
			case Ifc2x3tc1Package.IFC_CURVE_BOUNDED_PLANE__INNER_BOUNDARIES:
				return innerBoundaries != null && !innerBoundaries.isEmpty();
			case Ifc2x3tc1Package.IFC_CURVE_BOUNDED_PLANE__DIM:
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
		result.append(" (Dim: ");
		if (dimESet) result.append(dim); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcCurveBoundedPlaneImpl
