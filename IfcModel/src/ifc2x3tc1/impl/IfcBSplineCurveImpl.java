/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcBSplineCurve;
import ifc2x3tc1.IfcBSplineCurveForm;
import ifc2x3tc1.IfcCartesianPoint;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc BSpline Curve</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcBSplineCurveImpl#getDegree <em>Degree</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcBSplineCurveImpl#getControlPointsList <em>Control Points List</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcBSplineCurveImpl#getCurveForm <em>Curve Form</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcBSplineCurveImpl#isClosedCurve <em>Closed Curve</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcBSplineCurveImpl#isSelfIntersect <em>Self Intersect</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcBSplineCurveImpl extends IfcBoundedCurveImpl implements IfcBSplineCurve {
	/**
	 * The default value of the '{@link #getDegree() <em>Degree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegree()
	 * @generated
	 * @ordered
	 */
	protected static final int DEGREE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDegree() <em>Degree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegree()
	 * @generated
	 * @ordered
	 */
	protected int degree = DEGREE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getControlPointsList() <em>Control Points List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlPointsList()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcCartesianPoint> controlPointsList;

	/**
	 * The default value of the '{@link #getCurveForm() <em>Curve Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurveForm()
	 * @generated
	 * @ordered
	 */
	protected static final IfcBSplineCurveForm CURVE_FORM_EDEFAULT = IfcBSplineCurveForm.NULL;

	/**
	 * The cached value of the '{@link #getCurveForm() <em>Curve Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurveForm()
	 * @generated
	 * @ordered
	 */
	protected IfcBSplineCurveForm curveForm = CURVE_FORM_EDEFAULT;

	/**
	 * The default value of the '{@link #isClosedCurve() <em>Closed Curve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isClosedCurve()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CLOSED_CURVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isClosedCurve() <em>Closed Curve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isClosedCurve()
	 * @generated
	 * @ordered
	 */
	protected boolean closedCurve = CLOSED_CURVE_EDEFAULT;

	/**
	 * The default value of the '{@link #isSelfIntersect() <em>Self Intersect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSelfIntersect()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SELF_INTERSECT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSelfIntersect() <em>Self Intersect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSelfIntersect()
	 * @generated
	 * @ordered
	 */
	protected boolean selfIntersect = SELF_INTERSECT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcBSplineCurveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcBSplineCurve();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDegree() {
		return degree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDegree(int newDegree) {
		int oldDegree = degree;
		degree = newDegree;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_BSPLINE_CURVE__DEGREE, oldDegree, degree));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcCartesianPoint> getControlPointsList() {
		if (controlPointsList == null) {
			controlPointsList = new EObjectResolvingEList<IfcCartesianPoint>(IfcCartesianPoint.class, this, Ifc2x3tc1Package.IFC_BSPLINE_CURVE__CONTROL_POINTS_LIST);
		}
		return controlPointsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBSplineCurveForm getCurveForm() {
		return curveForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurveForm(IfcBSplineCurveForm newCurveForm) {
		IfcBSplineCurveForm oldCurveForm = curveForm;
		curveForm = newCurveForm == null ? CURVE_FORM_EDEFAULT : newCurveForm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_BSPLINE_CURVE__CURVE_FORM, oldCurveForm, curveForm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isClosedCurve() {
		return closedCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClosedCurve(boolean newClosedCurve) {
		boolean oldClosedCurve = closedCurve;
		closedCurve = newClosedCurve;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_BSPLINE_CURVE__CLOSED_CURVE, oldClosedCurve, closedCurve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSelfIntersect() {
		return selfIntersect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelfIntersect(boolean newSelfIntersect) {
		boolean oldSelfIntersect = selfIntersect;
		selfIntersect = newSelfIntersect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_BSPLINE_CURVE__SELF_INTERSECT, oldSelfIntersect, selfIntersect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_BSPLINE_CURVE__DEGREE:
				return getDegree();
			case Ifc2x3tc1Package.IFC_BSPLINE_CURVE__CONTROL_POINTS_LIST:
				return getControlPointsList();
			case Ifc2x3tc1Package.IFC_BSPLINE_CURVE__CURVE_FORM:
				return getCurveForm();
			case Ifc2x3tc1Package.IFC_BSPLINE_CURVE__CLOSED_CURVE:
				return isClosedCurve();
			case Ifc2x3tc1Package.IFC_BSPLINE_CURVE__SELF_INTERSECT:
				return isSelfIntersect();
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
			case Ifc2x3tc1Package.IFC_BSPLINE_CURVE__DEGREE:
				setDegree((Integer)newValue);
				return;
			case Ifc2x3tc1Package.IFC_BSPLINE_CURVE__CONTROL_POINTS_LIST:
				getControlPointsList().clear();
				getControlPointsList().addAll((Collection<? extends IfcCartesianPoint>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_BSPLINE_CURVE__CURVE_FORM:
				setCurveForm((IfcBSplineCurveForm)newValue);
				return;
			case Ifc2x3tc1Package.IFC_BSPLINE_CURVE__CLOSED_CURVE:
				setClosedCurve((Boolean)newValue);
				return;
			case Ifc2x3tc1Package.IFC_BSPLINE_CURVE__SELF_INTERSECT:
				setSelfIntersect((Boolean)newValue);
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
			case Ifc2x3tc1Package.IFC_BSPLINE_CURVE__DEGREE:
				setDegree(DEGREE_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_BSPLINE_CURVE__CONTROL_POINTS_LIST:
				getControlPointsList().clear();
				return;
			case Ifc2x3tc1Package.IFC_BSPLINE_CURVE__CURVE_FORM:
				setCurveForm(CURVE_FORM_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_BSPLINE_CURVE__CLOSED_CURVE:
				setClosedCurve(CLOSED_CURVE_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_BSPLINE_CURVE__SELF_INTERSECT:
				setSelfIntersect(SELF_INTERSECT_EDEFAULT);
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
			case Ifc2x3tc1Package.IFC_BSPLINE_CURVE__DEGREE:
				return degree != DEGREE_EDEFAULT;
			case Ifc2x3tc1Package.IFC_BSPLINE_CURVE__CONTROL_POINTS_LIST:
				return controlPointsList != null && !controlPointsList.isEmpty();
			case Ifc2x3tc1Package.IFC_BSPLINE_CURVE__CURVE_FORM:
				return curveForm != CURVE_FORM_EDEFAULT;
			case Ifc2x3tc1Package.IFC_BSPLINE_CURVE__CLOSED_CURVE:
				return closedCurve != CLOSED_CURVE_EDEFAULT;
			case Ifc2x3tc1Package.IFC_BSPLINE_CURVE__SELF_INTERSECT:
				return selfIntersect != SELF_INTERSECT_EDEFAULT;
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
		result.append(" (Degree: ");
		result.append(degree);
		result.append(", CurveForm: ");
		result.append(curveForm);
		result.append(", ClosedCurve: ");
		result.append(closedCurve);
		result.append(", SelfIntersect: ");
		result.append(selfIntersect);
		result.append(')');
		return result.toString();
	}

} //IfcBSplineCurveImpl
