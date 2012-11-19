/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCompositeCurveSegment;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTransitionCode;
import org.tech.iai.ifc.xml.ifc._2x3.final_.ParentCurveType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Composite Curve Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcCompositeCurveSegmentImpl#getTransition <em>Transition</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcCompositeCurveSegmentImpl#isSameSense <em>Same Sense</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcCompositeCurveSegmentImpl#getParentCurve <em>Parent Curve</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcCompositeCurveSegmentImpl extends IfcGeometricRepresentationItemImpl implements IfcCompositeCurveSegment {
	/**
	 * The default value of the '{@link #getTransition() <em>Transition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransition()
	 * @generated
	 * @ordered
	 */
	protected static final IfcTransitionCode TRANSITION_EDEFAULT = IfcTransitionCode.DISCONTINUOUS;

	/**
	 * The cached value of the '{@link #getTransition() <em>Transition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransition()
	 * @generated
	 * @ordered
	 */
	protected IfcTransitionCode transition = TRANSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #isSameSense() <em>Same Sense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSameSense()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SAME_SENSE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSameSense() <em>Same Sense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSameSense()
	 * @generated
	 * @ordered
	 */
	protected boolean sameSense = SAME_SENSE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParentCurve() <em>Parent Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentCurve()
	 * @generated
	 * @ordered
	 */
	protected ParentCurveType parentCurve;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcCompositeCurveSegmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcCompositeCurveSegment();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTransitionCode getTransition() {
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransition(IfcTransitionCode newTransition) {
		IfcTransitionCode oldTransition = transition;
		transition = newTransition == null ? TRANSITION_EDEFAULT : newTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_COMPOSITE_CURVE_SEGMENT__TRANSITION, oldTransition, transition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSameSense() {
		return sameSense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSameSense(boolean newSameSense) {
		boolean oldSameSense = sameSense;
		sameSense = newSameSense;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_COMPOSITE_CURVE_SEGMENT__SAME_SENSE, oldSameSense, sameSense));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParentCurveType getParentCurve() {
		return parentCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentCurve(ParentCurveType newParentCurve, NotificationChain msgs) {
		ParentCurveType oldParentCurve = parentCurve;
		parentCurve = newParentCurve;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_COMPOSITE_CURVE_SEGMENT__PARENT_CURVE, oldParentCurve, newParentCurve);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentCurve(ParentCurveType newParentCurve) {
		if (newParentCurve != parentCurve) {
			NotificationChain msgs = null;
			if (parentCurve != null)
				msgs = ((InternalEObject)parentCurve).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_COMPOSITE_CURVE_SEGMENT__PARENT_CURVE, null, msgs);
			if (newParentCurve != null)
				msgs = ((InternalEObject)newParentCurve).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_COMPOSITE_CURVE_SEGMENT__PARENT_CURVE, null, msgs);
			msgs = basicSetParentCurve(newParentCurve, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_COMPOSITE_CURVE_SEGMENT__PARENT_CURVE, newParentCurve, newParentCurve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_COMPOSITE_CURVE_SEGMENT__PARENT_CURVE:
				return basicSetParentCurve(null, msgs);
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
			case FinalPackage.IFC_COMPOSITE_CURVE_SEGMENT__TRANSITION:
				return getTransition();
			case FinalPackage.IFC_COMPOSITE_CURVE_SEGMENT__SAME_SENSE:
				return isSameSense();
			case FinalPackage.IFC_COMPOSITE_CURVE_SEGMENT__PARENT_CURVE:
				return getParentCurve();
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
			case FinalPackage.IFC_COMPOSITE_CURVE_SEGMENT__TRANSITION:
				setTransition((IfcTransitionCode)newValue);
				return;
			case FinalPackage.IFC_COMPOSITE_CURVE_SEGMENT__SAME_SENSE:
				setSameSense((Boolean)newValue);
				return;
			case FinalPackage.IFC_COMPOSITE_CURVE_SEGMENT__PARENT_CURVE:
				setParentCurve((ParentCurveType)newValue);
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
			case FinalPackage.IFC_COMPOSITE_CURVE_SEGMENT__TRANSITION:
				setTransition(TRANSITION_EDEFAULT);
				return;
			case FinalPackage.IFC_COMPOSITE_CURVE_SEGMENT__SAME_SENSE:
				setSameSense(SAME_SENSE_EDEFAULT);
				return;
			case FinalPackage.IFC_COMPOSITE_CURVE_SEGMENT__PARENT_CURVE:
				setParentCurve((ParentCurveType)null);
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
			case FinalPackage.IFC_COMPOSITE_CURVE_SEGMENT__TRANSITION:
				return transition != TRANSITION_EDEFAULT;
			case FinalPackage.IFC_COMPOSITE_CURVE_SEGMENT__SAME_SENSE:
				return sameSense != SAME_SENSE_EDEFAULT;
			case FinalPackage.IFC_COMPOSITE_CURVE_SEGMENT__PARENT_CURVE:
				return parentCurve != null;
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
		result.append(" (transition: ");
		result.append(transition);
		result.append(", sameSense: ");
		result.append(sameSense);
		result.append(')');
		return result.toString();
	}

} //IfcCompositeCurveSegmentImpl
