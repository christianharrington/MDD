/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcCurve;
import ifc2x3tc1.IfcTrimmedCurve;
import ifc2x3tc1.IfcTrimmingPreference;
import ifc2x3tc1.IfcTrimmingSelect;
import ifc2x3tc1.Tristate;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Trimmed Curve</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcTrimmedCurveImpl#getBasisCurve <em>Basis Curve</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTrimmedCurveImpl#getTrim1 <em>Trim1</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTrimmedCurveImpl#getTrim2 <em>Trim2</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTrimmedCurveImpl#getSenseAgreement <em>Sense Agreement</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTrimmedCurveImpl#getMasterRepresentation <em>Master Representation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcTrimmedCurveImpl extends IfcBoundedCurveImpl implements IfcTrimmedCurve {
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
	 * The cached value of the '{@link #getTrim1() <em>Trim1</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrim1()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcTrimmingSelect> trim1;

	/**
	 * The cached value of the '{@link #getTrim2() <em>Trim2</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrim2()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcTrimmingSelect> trim2;

	/**
	 * The default value of the '{@link #getSenseAgreement() <em>Sense Agreement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSenseAgreement()
	 * @generated
	 * @ordered
	 */
	protected static final Tristate SENSE_AGREEMENT_EDEFAULT = Tristate.TRUE;

	/**
	 * The cached value of the '{@link #getSenseAgreement() <em>Sense Agreement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSenseAgreement()
	 * @generated
	 * @ordered
	 */
	protected Tristate senseAgreement = SENSE_AGREEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMasterRepresentation() <em>Master Representation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterRepresentation()
	 * @generated
	 * @ordered
	 */
	protected static final IfcTrimmingPreference MASTER_REPRESENTATION_EDEFAULT = IfcTrimmingPreference.NULL;

	/**
	 * The cached value of the '{@link #getMasterRepresentation() <em>Master Representation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterRepresentation()
	 * @generated
	 * @ordered
	 */
	protected IfcTrimmingPreference masterRepresentation = MASTER_REPRESENTATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcTrimmedCurveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcTrimmedCurve();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_TRIMMED_CURVE__BASIS_CURVE, oldBasisCurve, basisCurve));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TRIMMED_CURVE__BASIS_CURVE, oldBasisCurve, basisCurve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcTrimmingSelect> getTrim1() {
		if (trim1 == null) {
			trim1 = new EObjectResolvingEList<IfcTrimmingSelect>(IfcTrimmingSelect.class, this, Ifc2x3tc1Package.IFC_TRIMMED_CURVE__TRIM1);
		}
		return trim1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcTrimmingSelect> getTrim2() {
		if (trim2 == null) {
			trim2 = new EObjectResolvingEList<IfcTrimmingSelect>(IfcTrimmingSelect.class, this, Ifc2x3tc1Package.IFC_TRIMMED_CURVE__TRIM2);
		}
		return trim2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tristate getSenseAgreement() {
		return senseAgreement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSenseAgreement(Tristate newSenseAgreement) {
		Tristate oldSenseAgreement = senseAgreement;
		senseAgreement = newSenseAgreement == null ? SENSE_AGREEMENT_EDEFAULT : newSenseAgreement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TRIMMED_CURVE__SENSE_AGREEMENT, oldSenseAgreement, senseAgreement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTrimmingPreference getMasterRepresentation() {
		return masterRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMasterRepresentation(IfcTrimmingPreference newMasterRepresentation) {
		IfcTrimmingPreference oldMasterRepresentation = masterRepresentation;
		masterRepresentation = newMasterRepresentation == null ? MASTER_REPRESENTATION_EDEFAULT : newMasterRepresentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TRIMMED_CURVE__MASTER_REPRESENTATION, oldMasterRepresentation, masterRepresentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_TRIMMED_CURVE__BASIS_CURVE:
				if (resolve) return getBasisCurve();
				return basicGetBasisCurve();
			case Ifc2x3tc1Package.IFC_TRIMMED_CURVE__TRIM1:
				return getTrim1();
			case Ifc2x3tc1Package.IFC_TRIMMED_CURVE__TRIM2:
				return getTrim2();
			case Ifc2x3tc1Package.IFC_TRIMMED_CURVE__SENSE_AGREEMENT:
				return getSenseAgreement();
			case Ifc2x3tc1Package.IFC_TRIMMED_CURVE__MASTER_REPRESENTATION:
				return getMasterRepresentation();
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
			case Ifc2x3tc1Package.IFC_TRIMMED_CURVE__BASIS_CURVE:
				setBasisCurve((IfcCurve)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TRIMMED_CURVE__TRIM1:
				getTrim1().clear();
				getTrim1().addAll((Collection<? extends IfcTrimmingSelect>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TRIMMED_CURVE__TRIM2:
				getTrim2().clear();
				getTrim2().addAll((Collection<? extends IfcTrimmingSelect>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TRIMMED_CURVE__SENSE_AGREEMENT:
				setSenseAgreement((Tristate)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TRIMMED_CURVE__MASTER_REPRESENTATION:
				setMasterRepresentation((IfcTrimmingPreference)newValue);
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
			case Ifc2x3tc1Package.IFC_TRIMMED_CURVE__BASIS_CURVE:
				setBasisCurve((IfcCurve)null);
				return;
			case Ifc2x3tc1Package.IFC_TRIMMED_CURVE__TRIM1:
				getTrim1().clear();
				return;
			case Ifc2x3tc1Package.IFC_TRIMMED_CURVE__TRIM2:
				getTrim2().clear();
				return;
			case Ifc2x3tc1Package.IFC_TRIMMED_CURVE__SENSE_AGREEMENT:
				setSenseAgreement(SENSE_AGREEMENT_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_TRIMMED_CURVE__MASTER_REPRESENTATION:
				setMasterRepresentation(MASTER_REPRESENTATION_EDEFAULT);
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
			case Ifc2x3tc1Package.IFC_TRIMMED_CURVE__BASIS_CURVE:
				return basisCurve != null;
			case Ifc2x3tc1Package.IFC_TRIMMED_CURVE__TRIM1:
				return trim1 != null && !trim1.isEmpty();
			case Ifc2x3tc1Package.IFC_TRIMMED_CURVE__TRIM2:
				return trim2 != null && !trim2.isEmpty();
			case Ifc2x3tc1Package.IFC_TRIMMED_CURVE__SENSE_AGREEMENT:
				return senseAgreement != SENSE_AGREEMENT_EDEFAULT;
			case Ifc2x3tc1Package.IFC_TRIMMED_CURVE__MASTER_REPRESENTATION:
				return masterRepresentation != MASTER_REPRESENTATION_EDEFAULT;
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
		result.append(" (SenseAgreement: ");
		result.append(senseAgreement);
		result.append(", MasterRepresentation: ");
		result.append(masterRepresentation);
		result.append(')');
		return result.toString();
	}

} //IfcTrimmedCurveImpl
