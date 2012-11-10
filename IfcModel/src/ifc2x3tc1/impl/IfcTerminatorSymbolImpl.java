/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcAnnotationCurveOccurrence;
import ifc2x3tc1.IfcTerminatorSymbol;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Terminator Symbol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcTerminatorSymbolImpl#getAnnotatedCurve <em>Annotated Curve</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcTerminatorSymbolImpl extends IfcAnnotationSymbolOccurrenceImpl implements IfcTerminatorSymbol {
	/**
	 * The cached value of the '{@link #getAnnotatedCurve() <em>Annotated Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotatedCurve()
	 * @generated
	 * @ordered
	 */
	protected IfcAnnotationCurveOccurrence annotatedCurve;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcTerminatorSymbolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcTerminatorSymbol();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAnnotationCurveOccurrence getAnnotatedCurve() {
		if (annotatedCurve != null && annotatedCurve.eIsProxy()) {
			InternalEObject oldAnnotatedCurve = (InternalEObject)annotatedCurve;
			annotatedCurve = (IfcAnnotationCurveOccurrence)eResolveProxy(oldAnnotatedCurve);
			if (annotatedCurve != oldAnnotatedCurve) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_TERMINATOR_SYMBOL__ANNOTATED_CURVE, oldAnnotatedCurve, annotatedCurve));
			}
		}
		return annotatedCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAnnotationCurveOccurrence basicGetAnnotatedCurve() {
		return annotatedCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotatedCurve(IfcAnnotationCurveOccurrence newAnnotatedCurve) {
		IfcAnnotationCurveOccurrence oldAnnotatedCurve = annotatedCurve;
		annotatedCurve = newAnnotatedCurve;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TERMINATOR_SYMBOL__ANNOTATED_CURVE, oldAnnotatedCurve, annotatedCurve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_TERMINATOR_SYMBOL__ANNOTATED_CURVE:
				if (resolve) return getAnnotatedCurve();
				return basicGetAnnotatedCurve();
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
			case Ifc2x3tc1Package.IFC_TERMINATOR_SYMBOL__ANNOTATED_CURVE:
				setAnnotatedCurve((IfcAnnotationCurveOccurrence)newValue);
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
			case Ifc2x3tc1Package.IFC_TERMINATOR_SYMBOL__ANNOTATED_CURVE:
				setAnnotatedCurve((IfcAnnotationCurveOccurrence)null);
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
			case Ifc2x3tc1Package.IFC_TERMINATOR_SYMBOL__ANNOTATED_CURVE:
				return annotatedCurve != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcTerminatorSymbolImpl
