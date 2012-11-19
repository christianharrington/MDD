/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.BasisSurfaceType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRectangularTrimmedSurface;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rectangular Trimmed Surface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRectangularTrimmedSurfaceImpl#getBasisSurface <em>Basis Surface</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRectangularTrimmedSurfaceImpl#getU1 <em>U1</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRectangularTrimmedSurfaceImpl#getV1 <em>V1</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRectangularTrimmedSurfaceImpl#getU2 <em>U2</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRectangularTrimmedSurfaceImpl#getV2 <em>V2</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRectangularTrimmedSurfaceImpl#isUsense <em>Usense</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRectangularTrimmedSurfaceImpl#isVsense <em>Vsense</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRectangularTrimmedSurfaceImpl extends IfcBoundedSurfaceImpl implements IfcRectangularTrimmedSurface {
	/**
	 * The cached value of the '{@link #getBasisSurface() <em>Basis Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasisSurface()
	 * @generated
	 * @ordered
	 */
	protected BasisSurfaceType basisSurface;

	/**
	 * The default value of the '{@link #getU1() <em>U1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getU1()
	 * @generated
	 * @ordered
	 */
	protected static final double U1_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getU1() <em>U1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getU1()
	 * @generated
	 * @ordered
	 */
	protected double u1 = U1_EDEFAULT;

	/**
	 * The default value of the '{@link #getV1() <em>V1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getV1()
	 * @generated
	 * @ordered
	 */
	protected static final double V1_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getV1() <em>V1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getV1()
	 * @generated
	 * @ordered
	 */
	protected double v1 = V1_EDEFAULT;

	/**
	 * The default value of the '{@link #getU2() <em>U2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getU2()
	 * @generated
	 * @ordered
	 */
	protected static final double U2_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getU2() <em>U2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getU2()
	 * @generated
	 * @ordered
	 */
	protected double u2 = U2_EDEFAULT;

	/**
	 * The default value of the '{@link #getV2() <em>V2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getV2()
	 * @generated
	 * @ordered
	 */
	protected static final double V2_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getV2() <em>V2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getV2()
	 * @generated
	 * @ordered
	 */
	protected double v2 = V2_EDEFAULT;

	/**
	 * The default value of the '{@link #isUsense() <em>Usense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUsense()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USENSE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUsense() <em>Usense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUsense()
	 * @generated
	 * @ordered
	 */
	protected boolean usense = USENSE_EDEFAULT;

	/**
	 * The default value of the '{@link #isVsense() <em>Vsense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVsense()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VSENSE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVsense() <em>Vsense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVsense()
	 * @generated
	 * @ordered
	 */
	protected boolean vsense = VSENSE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRectangularTrimmedSurfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcRectangularTrimmedSurface();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasisSurfaceType getBasisSurface() {
		return basisSurface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBasisSurface(BasisSurfaceType newBasisSurface, NotificationChain msgs) {
		BasisSurfaceType oldBasisSurface = basisSurface;
		basisSurface = newBasisSurface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_RECTANGULAR_TRIMMED_SURFACE__BASIS_SURFACE, oldBasisSurface, newBasisSurface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasisSurface(BasisSurfaceType newBasisSurface) {
		if (newBasisSurface != basisSurface) {
			NotificationChain msgs = null;
			if (basisSurface != null)
				msgs = ((InternalEObject)basisSurface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_RECTANGULAR_TRIMMED_SURFACE__BASIS_SURFACE, null, msgs);
			if (newBasisSurface != null)
				msgs = ((InternalEObject)newBasisSurface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_RECTANGULAR_TRIMMED_SURFACE__BASIS_SURFACE, null, msgs);
			msgs = basicSetBasisSurface(newBasisSurface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_RECTANGULAR_TRIMMED_SURFACE__BASIS_SURFACE, newBasisSurface, newBasisSurface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getU1() {
		return u1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setU1(double newU1) {
		double oldU1 = u1;
		u1 = newU1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_RECTANGULAR_TRIMMED_SURFACE__U1, oldU1, u1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getV1() {
		return v1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setV1(double newV1) {
		double oldV1 = v1;
		v1 = newV1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_RECTANGULAR_TRIMMED_SURFACE__V1, oldV1, v1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getU2() {
		return u2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setU2(double newU2) {
		double oldU2 = u2;
		u2 = newU2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_RECTANGULAR_TRIMMED_SURFACE__U2, oldU2, u2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getV2() {
		return v2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setV2(double newV2) {
		double oldV2 = v2;
		v2 = newV2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_RECTANGULAR_TRIMMED_SURFACE__V2, oldV2, v2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUsense() {
		return usense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsense(boolean newUsense) {
		boolean oldUsense = usense;
		usense = newUsense;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_RECTANGULAR_TRIMMED_SURFACE__USENSE, oldUsense, usense));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVsense() {
		return vsense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVsense(boolean newVsense) {
		boolean oldVsense = vsense;
		vsense = newVsense;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_RECTANGULAR_TRIMMED_SURFACE__VSENSE, oldVsense, vsense));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_RECTANGULAR_TRIMMED_SURFACE__BASIS_SURFACE:
				return basicSetBasisSurface(null, msgs);
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
			case FinalPackage.IFC_RECTANGULAR_TRIMMED_SURFACE__BASIS_SURFACE:
				return getBasisSurface();
			case FinalPackage.IFC_RECTANGULAR_TRIMMED_SURFACE__U1:
				return getU1();
			case FinalPackage.IFC_RECTANGULAR_TRIMMED_SURFACE__V1:
				return getV1();
			case FinalPackage.IFC_RECTANGULAR_TRIMMED_SURFACE__U2:
				return getU2();
			case FinalPackage.IFC_RECTANGULAR_TRIMMED_SURFACE__V2:
				return getV2();
			case FinalPackage.IFC_RECTANGULAR_TRIMMED_SURFACE__USENSE:
				return isUsense();
			case FinalPackage.IFC_RECTANGULAR_TRIMMED_SURFACE__VSENSE:
				return isVsense();
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
			case FinalPackage.IFC_RECTANGULAR_TRIMMED_SURFACE__BASIS_SURFACE:
				setBasisSurface((BasisSurfaceType)newValue);
				return;
			case FinalPackage.IFC_RECTANGULAR_TRIMMED_SURFACE__U1:
				setU1((Double)newValue);
				return;
			case FinalPackage.IFC_RECTANGULAR_TRIMMED_SURFACE__V1:
				setV1((Double)newValue);
				return;
			case FinalPackage.IFC_RECTANGULAR_TRIMMED_SURFACE__U2:
				setU2((Double)newValue);
				return;
			case FinalPackage.IFC_RECTANGULAR_TRIMMED_SURFACE__V2:
				setV2((Double)newValue);
				return;
			case FinalPackage.IFC_RECTANGULAR_TRIMMED_SURFACE__USENSE:
				setUsense((Boolean)newValue);
				return;
			case FinalPackage.IFC_RECTANGULAR_TRIMMED_SURFACE__VSENSE:
				setVsense((Boolean)newValue);
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
			case FinalPackage.IFC_RECTANGULAR_TRIMMED_SURFACE__BASIS_SURFACE:
				setBasisSurface((BasisSurfaceType)null);
				return;
			case FinalPackage.IFC_RECTANGULAR_TRIMMED_SURFACE__U1:
				setU1(U1_EDEFAULT);
				return;
			case FinalPackage.IFC_RECTANGULAR_TRIMMED_SURFACE__V1:
				setV1(V1_EDEFAULT);
				return;
			case FinalPackage.IFC_RECTANGULAR_TRIMMED_SURFACE__U2:
				setU2(U2_EDEFAULT);
				return;
			case FinalPackage.IFC_RECTANGULAR_TRIMMED_SURFACE__V2:
				setV2(V2_EDEFAULT);
				return;
			case FinalPackage.IFC_RECTANGULAR_TRIMMED_SURFACE__USENSE:
				setUsense(USENSE_EDEFAULT);
				return;
			case FinalPackage.IFC_RECTANGULAR_TRIMMED_SURFACE__VSENSE:
				setVsense(VSENSE_EDEFAULT);
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
			case FinalPackage.IFC_RECTANGULAR_TRIMMED_SURFACE__BASIS_SURFACE:
				return basisSurface != null;
			case FinalPackage.IFC_RECTANGULAR_TRIMMED_SURFACE__U1:
				return u1 != U1_EDEFAULT;
			case FinalPackage.IFC_RECTANGULAR_TRIMMED_SURFACE__V1:
				return v1 != V1_EDEFAULT;
			case FinalPackage.IFC_RECTANGULAR_TRIMMED_SURFACE__U2:
				return u2 != U2_EDEFAULT;
			case FinalPackage.IFC_RECTANGULAR_TRIMMED_SURFACE__V2:
				return v2 != V2_EDEFAULT;
			case FinalPackage.IFC_RECTANGULAR_TRIMMED_SURFACE__USENSE:
				return usense != USENSE_EDEFAULT;
			case FinalPackage.IFC_RECTANGULAR_TRIMMED_SURFACE__VSENSE:
				return vsense != VSENSE_EDEFAULT;
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
		result.append(" (u1: ");
		result.append(u1);
		result.append(", v1: ");
		result.append(v1);
		result.append(", u2: ");
		result.append(u2);
		result.append(", v2: ");
		result.append(v2);
		result.append(", usense: ");
		result.append(usense);
		result.append(", vsense: ");
		result.append(vsense);
		result.append(')');
		return result.toString();
	}

} //IfcRectangularTrimmedSurfaceImpl
