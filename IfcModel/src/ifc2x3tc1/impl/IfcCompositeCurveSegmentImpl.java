/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcCompositeCurve;
import ifc2x3tc1.IfcCompositeCurveSegment;
import ifc2x3tc1.IfcCurve;
import ifc2x3tc1.IfcTransitionCode;
import ifc2x3tc1.Tristate;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Composite Curve Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcCompositeCurveSegmentImpl#getTransition <em>Transition</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcCompositeCurveSegmentImpl#getSameSense <em>Same Sense</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcCompositeCurveSegmentImpl#getParentCurve <em>Parent Curve</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcCompositeCurveSegmentImpl#getUsingCurves <em>Using Curves</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcCompositeCurveSegmentImpl#getDim <em>Dim</em>}</li>
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
	protected static final IfcTransitionCode TRANSITION_EDEFAULT = IfcTransitionCode.NULL;

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
	 * The default value of the '{@link #getSameSense() <em>Same Sense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSameSense()
	 * @generated
	 * @ordered
	 */
	protected static final Tristate SAME_SENSE_EDEFAULT = Tristate.TRUE;

	/**
	 * The cached value of the '{@link #getSameSense() <em>Same Sense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSameSense()
	 * @generated
	 * @ordered
	 */
	protected Tristate sameSense = SAME_SENSE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParentCurve() <em>Parent Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentCurve()
	 * @generated
	 * @ordered
	 */
	protected IfcCurve parentCurve;

	/**
	 * The cached value of the '{@link #getUsingCurves() <em>Using Curves</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsingCurves()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcCompositeCurve> usingCurves;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcCompositeCurveSegment();
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_COMPOSITE_CURVE_SEGMENT__TRANSITION, oldTransition, transition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tristate getSameSense() {
		return sameSense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSameSense(Tristate newSameSense) {
		Tristate oldSameSense = sameSense;
		sameSense = newSameSense == null ? SAME_SENSE_EDEFAULT : newSameSense;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_COMPOSITE_CURVE_SEGMENT__SAME_SENSE, oldSameSense, sameSense));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurve getParentCurve() {
		if (parentCurve != null && parentCurve.eIsProxy()) {
			InternalEObject oldParentCurve = (InternalEObject)parentCurve;
			parentCurve = (IfcCurve)eResolveProxy(oldParentCurve);
			if (parentCurve != oldParentCurve) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_COMPOSITE_CURVE_SEGMENT__PARENT_CURVE, oldParentCurve, parentCurve));
			}
		}
		return parentCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurve basicGetParentCurve() {
		return parentCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentCurve(IfcCurve newParentCurve) {
		IfcCurve oldParentCurve = parentCurve;
		parentCurve = newParentCurve;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_COMPOSITE_CURVE_SEGMENT__PARENT_CURVE, oldParentCurve, parentCurve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcCompositeCurve> getUsingCurves() {
		if (usingCurves == null) {
			usingCurves = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse<IfcCompositeCurve>(IfcCompositeCurve.class, this, Ifc2x3tc1Package.IFC_COMPOSITE_CURVE_SEGMENT__USING_CURVES, Ifc2x3tc1Package.IFC_COMPOSITE_CURVE__SEGMENTS);
		}
		return usingCurves;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUsingCurves() {
		if (usingCurves != null) ((InternalEList.Unsettable<?>)usingCurves).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUsingCurves() {
		return usingCurves != null && ((InternalEList.Unsettable<?>)usingCurves).isSet();
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_COMPOSITE_CURVE_SEGMENT__DIM, oldDim, dim, !oldDimESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_COMPOSITE_CURVE_SEGMENT__DIM, oldDim, DIM_EDEFAULT, oldDimESet));
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_COMPOSITE_CURVE_SEGMENT__USING_CURVES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUsingCurves()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_COMPOSITE_CURVE_SEGMENT__USING_CURVES:
				return ((InternalEList<?>)getUsingCurves()).basicRemove(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_COMPOSITE_CURVE_SEGMENT__TRANSITION:
				return getTransition();
			case Ifc2x3tc1Package.IFC_COMPOSITE_CURVE_SEGMENT__SAME_SENSE:
				return getSameSense();
			case Ifc2x3tc1Package.IFC_COMPOSITE_CURVE_SEGMENT__PARENT_CURVE:
				if (resolve) return getParentCurve();
				return basicGetParentCurve();
			case Ifc2x3tc1Package.IFC_COMPOSITE_CURVE_SEGMENT__USING_CURVES:
				return getUsingCurves();
			case Ifc2x3tc1Package.IFC_COMPOSITE_CURVE_SEGMENT__DIM:
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
			case Ifc2x3tc1Package.IFC_COMPOSITE_CURVE_SEGMENT__TRANSITION:
				setTransition((IfcTransitionCode)newValue);
				return;
			case Ifc2x3tc1Package.IFC_COMPOSITE_CURVE_SEGMENT__SAME_SENSE:
				setSameSense((Tristate)newValue);
				return;
			case Ifc2x3tc1Package.IFC_COMPOSITE_CURVE_SEGMENT__PARENT_CURVE:
				setParentCurve((IfcCurve)newValue);
				return;
			case Ifc2x3tc1Package.IFC_COMPOSITE_CURVE_SEGMENT__USING_CURVES:
				getUsingCurves().clear();
				getUsingCurves().addAll((Collection<? extends IfcCompositeCurve>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_COMPOSITE_CURVE_SEGMENT__DIM:
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
			case Ifc2x3tc1Package.IFC_COMPOSITE_CURVE_SEGMENT__TRANSITION:
				setTransition(TRANSITION_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_COMPOSITE_CURVE_SEGMENT__SAME_SENSE:
				setSameSense(SAME_SENSE_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_COMPOSITE_CURVE_SEGMENT__PARENT_CURVE:
				setParentCurve((IfcCurve)null);
				return;
			case Ifc2x3tc1Package.IFC_COMPOSITE_CURVE_SEGMENT__USING_CURVES:
				unsetUsingCurves();
				return;
			case Ifc2x3tc1Package.IFC_COMPOSITE_CURVE_SEGMENT__DIM:
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
			case Ifc2x3tc1Package.IFC_COMPOSITE_CURVE_SEGMENT__TRANSITION:
				return transition != TRANSITION_EDEFAULT;
			case Ifc2x3tc1Package.IFC_COMPOSITE_CURVE_SEGMENT__SAME_SENSE:
				return sameSense != SAME_SENSE_EDEFAULT;
			case Ifc2x3tc1Package.IFC_COMPOSITE_CURVE_SEGMENT__PARENT_CURVE:
				return parentCurve != null;
			case Ifc2x3tc1Package.IFC_COMPOSITE_CURVE_SEGMENT__USING_CURVES:
				return isSetUsingCurves();
			case Ifc2x3tc1Package.IFC_COMPOSITE_CURVE_SEGMENT__DIM:
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
		result.append(" (Transition: ");
		result.append(transition);
		result.append(", SameSense: ");
		result.append(sameSense);
		result.append(", Dim: ");
		if (dimESet) result.append(dim); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcCompositeCurveSegmentImpl
