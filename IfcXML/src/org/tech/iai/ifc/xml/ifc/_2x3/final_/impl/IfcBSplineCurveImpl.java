/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.Logical;

import org.tech.iai.ifc.xml.ifc._2x3.final_.ControlPointsListType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcBSplineCurve;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcBSplineCurveForm;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc BSpline Curve</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcBSplineCurveImpl#getDegree <em>Degree</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcBSplineCurveImpl#getControlPointsList <em>Control Points List</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcBSplineCurveImpl#getCurveForm <em>Curve Form</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcBSplineCurveImpl#getClosedCurve <em>Closed Curve</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcBSplineCurveImpl#getSelfIntersect <em>Self Intersect</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class IfcBSplineCurveImpl extends IfcBoundedCurveImpl implements IfcBSplineCurve {
	/**
	 * The default value of the '{@link #getDegree() <em>Degree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegree()
	 * @generated
	 * @ordered
	 */
	protected static final long DEGREE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getDegree() <em>Degree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegree()
	 * @generated
	 * @ordered
	 */
	protected long degree = DEGREE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getControlPointsList() <em>Control Points List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlPointsList()
	 * @generated
	 * @ordered
	 */
	protected ControlPointsListType controlPointsList;

	/**
	 * The default value of the '{@link #getCurveForm() <em>Curve Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurveForm()
	 * @generated
	 * @ordered
	 */
	protected static final IfcBSplineCurveForm CURVE_FORM_EDEFAULT = IfcBSplineCurveForm.POLYLINE_FORM;

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
	 * The default value of the '{@link #getClosedCurve() <em>Closed Curve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClosedCurve()
	 * @generated
	 * @ordered
	 */
	protected static final Logical CLOSED_CURVE_EDEFAULT = Logical.FALSE;

	/**
	 * The cached value of the '{@link #getClosedCurve() <em>Closed Curve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClosedCurve()
	 * @generated
	 * @ordered
	 */
	protected Logical closedCurve = CLOSED_CURVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSelfIntersect() <em>Self Intersect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelfIntersect()
	 * @generated
	 * @ordered
	 */
	protected static final Logical SELF_INTERSECT_EDEFAULT = Logical.FALSE;

	/**
	 * The cached value of the '{@link #getSelfIntersect() <em>Self Intersect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelfIntersect()
	 * @generated
	 * @ordered
	 */
	protected Logical selfIntersect = SELF_INTERSECT_EDEFAULT;

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
		return FinalPackage.eINSTANCE.getIfcBSplineCurve();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getDegree() {
		return degree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDegree(long newDegree) {
		long oldDegree = degree;
		degree = newDegree;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_BSPLINE_CURVE__DEGREE, oldDegree, degree));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlPointsListType getControlPointsList() {
		return controlPointsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlPointsList(ControlPointsListType newControlPointsList, NotificationChain msgs) {
		ControlPointsListType oldControlPointsList = controlPointsList;
		controlPointsList = newControlPointsList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_BSPLINE_CURVE__CONTROL_POINTS_LIST, oldControlPointsList, newControlPointsList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlPointsList(ControlPointsListType newControlPointsList) {
		if (newControlPointsList != controlPointsList) {
			NotificationChain msgs = null;
			if (controlPointsList != null)
				msgs = ((InternalEObject)controlPointsList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_BSPLINE_CURVE__CONTROL_POINTS_LIST, null, msgs);
			if (newControlPointsList != null)
				msgs = ((InternalEObject)newControlPointsList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_BSPLINE_CURVE__CONTROL_POINTS_LIST, null, msgs);
			msgs = basicSetControlPointsList(newControlPointsList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_BSPLINE_CURVE__CONTROL_POINTS_LIST, newControlPointsList, newControlPointsList));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_BSPLINE_CURVE__CURVE_FORM, oldCurveForm, curveForm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Logical getClosedCurve() {
		return closedCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClosedCurve(Logical newClosedCurve) {
		Logical oldClosedCurve = closedCurve;
		closedCurve = newClosedCurve == null ? CLOSED_CURVE_EDEFAULT : newClosedCurve;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_BSPLINE_CURVE__CLOSED_CURVE, oldClosedCurve, closedCurve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Logical getSelfIntersect() {
		return selfIntersect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelfIntersect(Logical newSelfIntersect) {
		Logical oldSelfIntersect = selfIntersect;
		selfIntersect = newSelfIntersect == null ? SELF_INTERSECT_EDEFAULT : newSelfIntersect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_BSPLINE_CURVE__SELF_INTERSECT, oldSelfIntersect, selfIntersect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_BSPLINE_CURVE__CONTROL_POINTS_LIST:
				return basicSetControlPointsList(null, msgs);
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
			case FinalPackage.IFC_BSPLINE_CURVE__DEGREE:
				return getDegree();
			case FinalPackage.IFC_BSPLINE_CURVE__CONTROL_POINTS_LIST:
				return getControlPointsList();
			case FinalPackage.IFC_BSPLINE_CURVE__CURVE_FORM:
				return getCurveForm();
			case FinalPackage.IFC_BSPLINE_CURVE__CLOSED_CURVE:
				return getClosedCurve();
			case FinalPackage.IFC_BSPLINE_CURVE__SELF_INTERSECT:
				return getSelfIntersect();
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
			case FinalPackage.IFC_BSPLINE_CURVE__DEGREE:
				setDegree((Long)newValue);
				return;
			case FinalPackage.IFC_BSPLINE_CURVE__CONTROL_POINTS_LIST:
				setControlPointsList((ControlPointsListType)newValue);
				return;
			case FinalPackage.IFC_BSPLINE_CURVE__CURVE_FORM:
				setCurveForm((IfcBSplineCurveForm)newValue);
				return;
			case FinalPackage.IFC_BSPLINE_CURVE__CLOSED_CURVE:
				setClosedCurve((Logical)newValue);
				return;
			case FinalPackage.IFC_BSPLINE_CURVE__SELF_INTERSECT:
				setSelfIntersect((Logical)newValue);
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
			case FinalPackage.IFC_BSPLINE_CURVE__DEGREE:
				setDegree(DEGREE_EDEFAULT);
				return;
			case FinalPackage.IFC_BSPLINE_CURVE__CONTROL_POINTS_LIST:
				setControlPointsList((ControlPointsListType)null);
				return;
			case FinalPackage.IFC_BSPLINE_CURVE__CURVE_FORM:
				setCurveForm(CURVE_FORM_EDEFAULT);
				return;
			case FinalPackage.IFC_BSPLINE_CURVE__CLOSED_CURVE:
				setClosedCurve(CLOSED_CURVE_EDEFAULT);
				return;
			case FinalPackage.IFC_BSPLINE_CURVE__SELF_INTERSECT:
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
			case FinalPackage.IFC_BSPLINE_CURVE__DEGREE:
				return degree != DEGREE_EDEFAULT;
			case FinalPackage.IFC_BSPLINE_CURVE__CONTROL_POINTS_LIST:
				return controlPointsList != null;
			case FinalPackage.IFC_BSPLINE_CURVE__CURVE_FORM:
				return curveForm != CURVE_FORM_EDEFAULT;
			case FinalPackage.IFC_BSPLINE_CURVE__CLOSED_CURVE:
				return closedCurve != CLOSED_CURVE_EDEFAULT;
			case FinalPackage.IFC_BSPLINE_CURVE__SELF_INTERSECT:
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
		result.append(" (degree: ");
		result.append(degree);
		result.append(", curveForm: ");
		result.append(curveForm);
		result.append(", closedCurve: ");
		result.append(closedCurve);
		result.append(", selfIntersect: ");
		result.append(selfIntersect);
		result.append(')');
		return result.toString();
	}

} //IfcBSplineCurveImpl
