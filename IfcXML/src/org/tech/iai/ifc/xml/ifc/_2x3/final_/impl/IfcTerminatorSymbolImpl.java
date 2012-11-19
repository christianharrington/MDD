/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.AnnotatedCurveType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTerminatorSymbol;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Terminator Symbol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTerminatorSymbolImpl#getAnnotatedCurve <em>Annotated Curve</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcTerminatorSymbolImpl extends IfcAnnotationSymbolOccurrenceImpl implements IfcTerminatorSymbol {
	/**
	 * The cached value of the '{@link #getAnnotatedCurve() <em>Annotated Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotatedCurve()
	 * @generated
	 * @ordered
	 */
	protected AnnotatedCurveType annotatedCurve;

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
		return FinalPackage.eINSTANCE.getIfcTerminatorSymbol();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotatedCurveType getAnnotatedCurve() {
		return annotatedCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotatedCurve(AnnotatedCurveType newAnnotatedCurve, NotificationChain msgs) {
		AnnotatedCurveType oldAnnotatedCurve = annotatedCurve;
		annotatedCurve = newAnnotatedCurve;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TERMINATOR_SYMBOL__ANNOTATED_CURVE, oldAnnotatedCurve, newAnnotatedCurve);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotatedCurve(AnnotatedCurveType newAnnotatedCurve) {
		if (newAnnotatedCurve != annotatedCurve) {
			NotificationChain msgs = null;
			if (annotatedCurve != null)
				msgs = ((InternalEObject)annotatedCurve).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_TERMINATOR_SYMBOL__ANNOTATED_CURVE, null, msgs);
			if (newAnnotatedCurve != null)
				msgs = ((InternalEObject)newAnnotatedCurve).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_TERMINATOR_SYMBOL__ANNOTATED_CURVE, null, msgs);
			msgs = basicSetAnnotatedCurve(newAnnotatedCurve, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TERMINATOR_SYMBOL__ANNOTATED_CURVE, newAnnotatedCurve, newAnnotatedCurve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_TERMINATOR_SYMBOL__ANNOTATED_CURVE:
				return basicSetAnnotatedCurve(null, msgs);
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
			case FinalPackage.IFC_TERMINATOR_SYMBOL__ANNOTATED_CURVE:
				return getAnnotatedCurve();
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
			case FinalPackage.IFC_TERMINATOR_SYMBOL__ANNOTATED_CURVE:
				setAnnotatedCurve((AnnotatedCurveType)newValue);
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
			case FinalPackage.IFC_TERMINATOR_SYMBOL__ANNOTATED_CURVE:
				setAnnotatedCurve((AnnotatedCurveType)null);
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
			case FinalPackage.IFC_TERMINATOR_SYMBOL__ANNOTATED_CURVE:
				return annotatedCurve != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcTerminatorSymbolImpl
