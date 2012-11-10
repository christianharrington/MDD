/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcCurve;
import ifc2x3tc1.IfcSurface;
import ifc2x3tc1.IfcSurfaceCurveSweptAreaSolid;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Surface Curve Swept Area Solid</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcSurfaceCurveSweptAreaSolidImpl#getDirectrix <em>Directrix</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSurfaceCurveSweptAreaSolidImpl#getStartParam <em>Start Param</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSurfaceCurveSweptAreaSolidImpl#getStartParamAsString <em>Start Param As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSurfaceCurveSweptAreaSolidImpl#getEndParam <em>End Param</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSurfaceCurveSweptAreaSolidImpl#getEndParamAsString <em>End Param As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSurfaceCurveSweptAreaSolidImpl#getReferenceSurface <em>Reference Surface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcSurfaceCurveSweptAreaSolidImpl extends IfcSweptAreaSolidImpl implements IfcSurfaceCurveSweptAreaSolid {
	/**
	 * The cached value of the '{@link #getDirectrix() <em>Directrix</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectrix()
	 * @generated
	 * @ordered
	 */
	protected IfcCurve directrix;

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
	 * The default value of the '{@link #getStartParamAsString() <em>Start Param As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartParamAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String START_PARAM_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartParamAsString() <em>Start Param As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartParamAsString()
	 * @generated
	 * @ordered
	 */
	protected String startParamAsString = START_PARAM_AS_STRING_EDEFAULT;

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
	 * The default value of the '{@link #getEndParamAsString() <em>End Param As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndParamAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String END_PARAM_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndParamAsString() <em>End Param As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndParamAsString()
	 * @generated
	 * @ordered
	 */
	protected String endParamAsString = END_PARAM_AS_STRING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReferenceSurface() <em>Reference Surface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceSurface()
	 * @generated
	 * @ordered
	 */
	protected IfcSurface referenceSurface;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcSurfaceCurveSweptAreaSolid();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurve getDirectrix() {
		if (directrix != null && directrix.eIsProxy()) {
			InternalEObject oldDirectrix = (InternalEObject)directrix;
			directrix = (IfcCurve)eResolveProxy(oldDirectrix);
			if (directrix != oldDirectrix) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_SURFACE_CURVE_SWEPT_AREA_SOLID__DIRECTRIX, oldDirectrix, directrix));
			}
		}
		return directrix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurve basicGetDirectrix() {
		return directrix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirectrix(IfcCurve newDirectrix) {
		IfcCurve oldDirectrix = directrix;
		directrix = newDirectrix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SURFACE_CURVE_SWEPT_AREA_SOLID__DIRECTRIX, oldDirectrix, directrix));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SURFACE_CURVE_SWEPT_AREA_SOLID__START_PARAM, oldStartParam, startParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStartParamAsString() {
		return startParamAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartParamAsString(String newStartParamAsString) {
		String oldStartParamAsString = startParamAsString;
		startParamAsString = newStartParamAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SURFACE_CURVE_SWEPT_AREA_SOLID__START_PARAM_AS_STRING, oldStartParamAsString, startParamAsString));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SURFACE_CURVE_SWEPT_AREA_SOLID__END_PARAM, oldEndParam, endParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndParamAsString() {
		return endParamAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndParamAsString(String newEndParamAsString) {
		String oldEndParamAsString = endParamAsString;
		endParamAsString = newEndParamAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SURFACE_CURVE_SWEPT_AREA_SOLID__END_PARAM_AS_STRING, oldEndParamAsString, endParamAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSurface getReferenceSurface() {
		if (referenceSurface != null && referenceSurface.eIsProxy()) {
			InternalEObject oldReferenceSurface = (InternalEObject)referenceSurface;
			referenceSurface = (IfcSurface)eResolveProxy(oldReferenceSurface);
			if (referenceSurface != oldReferenceSurface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_SURFACE_CURVE_SWEPT_AREA_SOLID__REFERENCE_SURFACE, oldReferenceSurface, referenceSurface));
			}
		}
		return referenceSurface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSurface basicGetReferenceSurface() {
		return referenceSurface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceSurface(IfcSurface newReferenceSurface) {
		IfcSurface oldReferenceSurface = referenceSurface;
		referenceSurface = newReferenceSurface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SURFACE_CURVE_SWEPT_AREA_SOLID__REFERENCE_SURFACE, oldReferenceSurface, referenceSurface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_SURFACE_CURVE_SWEPT_AREA_SOLID__DIRECTRIX:
				if (resolve) return getDirectrix();
				return basicGetDirectrix();
			case Ifc2x3tc1Package.IFC_SURFACE_CURVE_SWEPT_AREA_SOLID__START_PARAM:
				return getStartParam();
			case Ifc2x3tc1Package.IFC_SURFACE_CURVE_SWEPT_AREA_SOLID__START_PARAM_AS_STRING:
				return getStartParamAsString();
			case Ifc2x3tc1Package.IFC_SURFACE_CURVE_SWEPT_AREA_SOLID__END_PARAM:
				return getEndParam();
			case Ifc2x3tc1Package.IFC_SURFACE_CURVE_SWEPT_AREA_SOLID__END_PARAM_AS_STRING:
				return getEndParamAsString();
			case Ifc2x3tc1Package.IFC_SURFACE_CURVE_SWEPT_AREA_SOLID__REFERENCE_SURFACE:
				if (resolve) return getReferenceSurface();
				return basicGetReferenceSurface();
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
			case Ifc2x3tc1Package.IFC_SURFACE_CURVE_SWEPT_AREA_SOLID__DIRECTRIX:
				setDirectrix((IfcCurve)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SURFACE_CURVE_SWEPT_AREA_SOLID__START_PARAM:
				setStartParam((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SURFACE_CURVE_SWEPT_AREA_SOLID__START_PARAM_AS_STRING:
				setStartParamAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SURFACE_CURVE_SWEPT_AREA_SOLID__END_PARAM:
				setEndParam((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SURFACE_CURVE_SWEPT_AREA_SOLID__END_PARAM_AS_STRING:
				setEndParamAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SURFACE_CURVE_SWEPT_AREA_SOLID__REFERENCE_SURFACE:
				setReferenceSurface((IfcSurface)newValue);
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
			case Ifc2x3tc1Package.IFC_SURFACE_CURVE_SWEPT_AREA_SOLID__DIRECTRIX:
				setDirectrix((IfcCurve)null);
				return;
			case Ifc2x3tc1Package.IFC_SURFACE_CURVE_SWEPT_AREA_SOLID__START_PARAM:
				setStartParam(START_PARAM_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_SURFACE_CURVE_SWEPT_AREA_SOLID__START_PARAM_AS_STRING:
				setStartParamAsString(START_PARAM_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_SURFACE_CURVE_SWEPT_AREA_SOLID__END_PARAM:
				setEndParam(END_PARAM_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_SURFACE_CURVE_SWEPT_AREA_SOLID__END_PARAM_AS_STRING:
				setEndParamAsString(END_PARAM_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_SURFACE_CURVE_SWEPT_AREA_SOLID__REFERENCE_SURFACE:
				setReferenceSurface((IfcSurface)null);
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
			case Ifc2x3tc1Package.IFC_SURFACE_CURVE_SWEPT_AREA_SOLID__DIRECTRIX:
				return directrix != null;
			case Ifc2x3tc1Package.IFC_SURFACE_CURVE_SWEPT_AREA_SOLID__START_PARAM:
				return startParam != START_PARAM_EDEFAULT;
			case Ifc2x3tc1Package.IFC_SURFACE_CURVE_SWEPT_AREA_SOLID__START_PARAM_AS_STRING:
				return START_PARAM_AS_STRING_EDEFAULT == null ? startParamAsString != null : !START_PARAM_AS_STRING_EDEFAULT.equals(startParamAsString);
			case Ifc2x3tc1Package.IFC_SURFACE_CURVE_SWEPT_AREA_SOLID__END_PARAM:
				return endParam != END_PARAM_EDEFAULT;
			case Ifc2x3tc1Package.IFC_SURFACE_CURVE_SWEPT_AREA_SOLID__END_PARAM_AS_STRING:
				return END_PARAM_AS_STRING_EDEFAULT == null ? endParamAsString != null : !END_PARAM_AS_STRING_EDEFAULT.equals(endParamAsString);
			case Ifc2x3tc1Package.IFC_SURFACE_CURVE_SWEPT_AREA_SOLID__REFERENCE_SURFACE:
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
		result.append(" (StartParam: ");
		result.append(startParam);
		result.append(", StartParamAsString: ");
		result.append(startParamAsString);
		result.append(", EndParam: ");
		result.append(endParam);
		result.append(", EndParamAsString: ");
		result.append(endParamAsString);
		result.append(')');
		return result.toString();
	}

} //IfcSurfaceCurveSweptAreaSolidImpl
