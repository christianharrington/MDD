/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.BasisCurveType1;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTrimmedCurve;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTrimmingPreference;
import org.tech.iai.ifc.xml.ifc._2x3.final_.Trim1Type;
import org.tech.iai.ifc.xml.ifc._2x3.final_.Trim2Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Trimmed Curve</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTrimmedCurveImpl#getBasisCurve <em>Basis Curve</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTrimmedCurveImpl#getTrim1 <em>Trim1</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTrimmedCurveImpl#getTrim2 <em>Trim2</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTrimmedCurveImpl#isSenseAgreement <em>Sense Agreement</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTrimmedCurveImpl#getMasterRepresentation <em>Master Representation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcTrimmedCurveImpl extends IfcBoundedCurveImpl implements IfcTrimmedCurve {
	/**
	 * The cached value of the '{@link #getBasisCurve() <em>Basis Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasisCurve()
	 * @generated
	 * @ordered
	 */
	protected BasisCurveType1 basisCurve;

	/**
	 * The cached value of the '{@link #getTrim1() <em>Trim1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrim1()
	 * @generated
	 * @ordered
	 */
	protected Trim1Type trim1;

	/**
	 * The cached value of the '{@link #getTrim2() <em>Trim2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrim2()
	 * @generated
	 * @ordered
	 */
	protected Trim2Type trim2;

	/**
	 * The default value of the '{@link #isSenseAgreement() <em>Sense Agreement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSenseAgreement()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SENSE_AGREEMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSenseAgreement() <em>Sense Agreement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSenseAgreement()
	 * @generated
	 * @ordered
	 */
	protected boolean senseAgreement = SENSE_AGREEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMasterRepresentation() <em>Master Representation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterRepresentation()
	 * @generated
	 * @ordered
	 */
	protected static final IfcTrimmingPreference MASTER_REPRESENTATION_EDEFAULT = IfcTrimmingPreference.CARTESIAN;

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
		return FinalPackage.eINSTANCE.getIfcTrimmedCurve();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasisCurveType1 getBasisCurve() {
		return basisCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBasisCurve(BasisCurveType1 newBasisCurve, NotificationChain msgs) {
		BasisCurveType1 oldBasisCurve = basisCurve;
		basisCurve = newBasisCurve;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TRIMMED_CURVE__BASIS_CURVE, oldBasisCurve, newBasisCurve);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasisCurve(BasisCurveType1 newBasisCurve) {
		if (newBasisCurve != basisCurve) {
			NotificationChain msgs = null;
			if (basisCurve != null)
				msgs = ((InternalEObject)basisCurve).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_TRIMMED_CURVE__BASIS_CURVE, null, msgs);
			if (newBasisCurve != null)
				msgs = ((InternalEObject)newBasisCurve).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_TRIMMED_CURVE__BASIS_CURVE, null, msgs);
			msgs = basicSetBasisCurve(newBasisCurve, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TRIMMED_CURVE__BASIS_CURVE, newBasisCurve, newBasisCurve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trim1Type getTrim1() {
		return trim1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrim1(Trim1Type newTrim1, NotificationChain msgs) {
		Trim1Type oldTrim1 = trim1;
		trim1 = newTrim1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TRIMMED_CURVE__TRIM1, oldTrim1, newTrim1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrim1(Trim1Type newTrim1) {
		if (newTrim1 != trim1) {
			NotificationChain msgs = null;
			if (trim1 != null)
				msgs = ((InternalEObject)trim1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_TRIMMED_CURVE__TRIM1, null, msgs);
			if (newTrim1 != null)
				msgs = ((InternalEObject)newTrim1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_TRIMMED_CURVE__TRIM1, null, msgs);
			msgs = basicSetTrim1(newTrim1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TRIMMED_CURVE__TRIM1, newTrim1, newTrim1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trim2Type getTrim2() {
		return trim2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrim2(Trim2Type newTrim2, NotificationChain msgs) {
		Trim2Type oldTrim2 = trim2;
		trim2 = newTrim2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TRIMMED_CURVE__TRIM2, oldTrim2, newTrim2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrim2(Trim2Type newTrim2) {
		if (newTrim2 != trim2) {
			NotificationChain msgs = null;
			if (trim2 != null)
				msgs = ((InternalEObject)trim2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_TRIMMED_CURVE__TRIM2, null, msgs);
			if (newTrim2 != null)
				msgs = ((InternalEObject)newTrim2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_TRIMMED_CURVE__TRIM2, null, msgs);
			msgs = basicSetTrim2(newTrim2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TRIMMED_CURVE__TRIM2, newTrim2, newTrim2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSenseAgreement() {
		return senseAgreement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSenseAgreement(boolean newSenseAgreement) {
		boolean oldSenseAgreement = senseAgreement;
		senseAgreement = newSenseAgreement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TRIMMED_CURVE__SENSE_AGREEMENT, oldSenseAgreement, senseAgreement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TRIMMED_CURVE__MASTER_REPRESENTATION, oldMasterRepresentation, masterRepresentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_TRIMMED_CURVE__BASIS_CURVE:
				return basicSetBasisCurve(null, msgs);
			case FinalPackage.IFC_TRIMMED_CURVE__TRIM1:
				return basicSetTrim1(null, msgs);
			case FinalPackage.IFC_TRIMMED_CURVE__TRIM2:
				return basicSetTrim2(null, msgs);
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
			case FinalPackage.IFC_TRIMMED_CURVE__BASIS_CURVE:
				return getBasisCurve();
			case FinalPackage.IFC_TRIMMED_CURVE__TRIM1:
				return getTrim1();
			case FinalPackage.IFC_TRIMMED_CURVE__TRIM2:
				return getTrim2();
			case FinalPackage.IFC_TRIMMED_CURVE__SENSE_AGREEMENT:
				return isSenseAgreement();
			case FinalPackage.IFC_TRIMMED_CURVE__MASTER_REPRESENTATION:
				return getMasterRepresentation();
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
			case FinalPackage.IFC_TRIMMED_CURVE__BASIS_CURVE:
				setBasisCurve((BasisCurveType1)newValue);
				return;
			case FinalPackage.IFC_TRIMMED_CURVE__TRIM1:
				setTrim1((Trim1Type)newValue);
				return;
			case FinalPackage.IFC_TRIMMED_CURVE__TRIM2:
				setTrim2((Trim2Type)newValue);
				return;
			case FinalPackage.IFC_TRIMMED_CURVE__SENSE_AGREEMENT:
				setSenseAgreement((Boolean)newValue);
				return;
			case FinalPackage.IFC_TRIMMED_CURVE__MASTER_REPRESENTATION:
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
			case FinalPackage.IFC_TRIMMED_CURVE__BASIS_CURVE:
				setBasisCurve((BasisCurveType1)null);
				return;
			case FinalPackage.IFC_TRIMMED_CURVE__TRIM1:
				setTrim1((Trim1Type)null);
				return;
			case FinalPackage.IFC_TRIMMED_CURVE__TRIM2:
				setTrim2((Trim2Type)null);
				return;
			case FinalPackage.IFC_TRIMMED_CURVE__SENSE_AGREEMENT:
				setSenseAgreement(SENSE_AGREEMENT_EDEFAULT);
				return;
			case FinalPackage.IFC_TRIMMED_CURVE__MASTER_REPRESENTATION:
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
			case FinalPackage.IFC_TRIMMED_CURVE__BASIS_CURVE:
				return basisCurve != null;
			case FinalPackage.IFC_TRIMMED_CURVE__TRIM1:
				return trim1 != null;
			case FinalPackage.IFC_TRIMMED_CURVE__TRIM2:
				return trim2 != null;
			case FinalPackage.IFC_TRIMMED_CURVE__SENSE_AGREEMENT:
				return senseAgreement != SENSE_AGREEMENT_EDEFAULT;
			case FinalPackage.IFC_TRIMMED_CURVE__MASTER_REPRESENTATION:
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
		result.append(" (senseAgreement: ");
		result.append(senseAgreement);
		result.append(", masterRepresentation: ");
		result.append(masterRepresentation);
		result.append(')');
		return result.toString();
	}

} //IfcTrimmedCurveImpl
