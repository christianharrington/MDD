/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcHalfSpaceSolid;
import ifc2x3tc1.IfcSurface;
import ifc2x3tc1.Tristate;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Half Space Solid</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcHalfSpaceSolidImpl#getBaseSurface <em>Base Surface</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcHalfSpaceSolidImpl#getAgreementFlag <em>Agreement Flag</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcHalfSpaceSolidImpl#getDim <em>Dim</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcHalfSpaceSolidImpl extends IfcGeometricRepresentationItemImpl implements IfcHalfSpaceSolid {
	/**
	 * The cached value of the '{@link #getBaseSurface() <em>Base Surface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseSurface()
	 * @generated
	 * @ordered
	 */
	protected IfcSurface baseSurface;

	/**
	 * The default value of the '{@link #getAgreementFlag() <em>Agreement Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgreementFlag()
	 * @generated
	 * @ordered
	 */
	protected static final Tristate AGREEMENT_FLAG_EDEFAULT = Tristate.TRUE;

	/**
	 * The cached value of the '{@link #getAgreementFlag() <em>Agreement Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgreementFlag()
	 * @generated
	 * @ordered
	 */
	protected Tristate agreementFlag = AGREEMENT_FLAG_EDEFAULT;

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
	protected IfcHalfSpaceSolidImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcHalfSpaceSolid();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSurface getBaseSurface() {
		if (baseSurface != null && baseSurface.eIsProxy()) {
			InternalEObject oldBaseSurface = (InternalEObject)baseSurface;
			baseSurface = (IfcSurface)eResolveProxy(oldBaseSurface);
			if (baseSurface != oldBaseSurface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_HALF_SPACE_SOLID__BASE_SURFACE, oldBaseSurface, baseSurface));
			}
		}
		return baseSurface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSurface basicGetBaseSurface() {
		return baseSurface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseSurface(IfcSurface newBaseSurface) {
		IfcSurface oldBaseSurface = baseSurface;
		baseSurface = newBaseSurface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_HALF_SPACE_SOLID__BASE_SURFACE, oldBaseSurface, baseSurface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tristate getAgreementFlag() {
		return agreementFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgreementFlag(Tristate newAgreementFlag) {
		Tristate oldAgreementFlag = agreementFlag;
		agreementFlag = newAgreementFlag == null ? AGREEMENT_FLAG_EDEFAULT : newAgreementFlag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_HALF_SPACE_SOLID__AGREEMENT_FLAG, oldAgreementFlag, agreementFlag));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_HALF_SPACE_SOLID__DIM, oldDim, dim, !oldDimESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_HALF_SPACE_SOLID__DIM, oldDim, DIM_EDEFAULT, oldDimESet));
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_HALF_SPACE_SOLID__BASE_SURFACE:
				if (resolve) return getBaseSurface();
				return basicGetBaseSurface();
			case Ifc2x3tc1Package.IFC_HALF_SPACE_SOLID__AGREEMENT_FLAG:
				return getAgreementFlag();
			case Ifc2x3tc1Package.IFC_HALF_SPACE_SOLID__DIM:
				return getDim();
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
			case Ifc2x3tc1Package.IFC_HALF_SPACE_SOLID__BASE_SURFACE:
				setBaseSurface((IfcSurface)newValue);
				return;
			case Ifc2x3tc1Package.IFC_HALF_SPACE_SOLID__AGREEMENT_FLAG:
				setAgreementFlag((Tristate)newValue);
				return;
			case Ifc2x3tc1Package.IFC_HALF_SPACE_SOLID__DIM:
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
			case Ifc2x3tc1Package.IFC_HALF_SPACE_SOLID__BASE_SURFACE:
				setBaseSurface((IfcSurface)null);
				return;
			case Ifc2x3tc1Package.IFC_HALF_SPACE_SOLID__AGREEMENT_FLAG:
				setAgreementFlag(AGREEMENT_FLAG_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_HALF_SPACE_SOLID__DIM:
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
			case Ifc2x3tc1Package.IFC_HALF_SPACE_SOLID__BASE_SURFACE:
				return baseSurface != null;
			case Ifc2x3tc1Package.IFC_HALF_SPACE_SOLID__AGREEMENT_FLAG:
				return agreementFlag != AGREEMENT_FLAG_EDEFAULT;
			case Ifc2x3tc1Package.IFC_HALF_SPACE_SOLID__DIM:
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
		result.append(" (AgreementFlag: ");
		result.append(agreementFlag);
		result.append(", Dim: ");
		if (dimESet) result.append(dim); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcHalfSpaceSolidImpl
