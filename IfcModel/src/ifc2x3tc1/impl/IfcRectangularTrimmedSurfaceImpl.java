/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcRectangularTrimmedSurface;
import ifc2x3tc1.IfcSurface;
import ifc2x3tc1.Tristate;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rectangular Trimmed Surface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcRectangularTrimmedSurfaceImpl#getBasisSurface <em>Basis Surface</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRectangularTrimmedSurfaceImpl#getU1 <em>U1</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRectangularTrimmedSurfaceImpl#getU1AsString <em>U1 As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRectangularTrimmedSurfaceImpl#getV1 <em>V1</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRectangularTrimmedSurfaceImpl#getV1AsString <em>V1 As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRectangularTrimmedSurfaceImpl#getU2 <em>U2</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRectangularTrimmedSurfaceImpl#getU2AsString <em>U2 As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRectangularTrimmedSurfaceImpl#getV2 <em>V2</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRectangularTrimmedSurfaceImpl#getV2AsString <em>V2 As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRectangularTrimmedSurfaceImpl#getUsense <em>Usense</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRectangularTrimmedSurfaceImpl#getVsense <em>Vsense</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRectangularTrimmedSurfaceImpl#getDim <em>Dim</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRectangularTrimmedSurfaceImpl extends IfcBoundedSurfaceImpl implements IfcRectangularTrimmedSurface {
	/**
	 * The cached value of the '{@link #getBasisSurface() <em>Basis Surface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasisSurface()
	 * @generated
	 * @ordered
	 */
	protected IfcSurface basisSurface;

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
	 * The default value of the '{@link #getU1AsString() <em>U1 As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getU1AsString()
	 * @generated
	 * @ordered
	 */
	protected static final String U1_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getU1AsString() <em>U1 As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getU1AsString()
	 * @generated
	 * @ordered
	 */
	protected String u1AsString = U1_AS_STRING_EDEFAULT;

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
	 * The default value of the '{@link #getV1AsString() <em>V1 As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getV1AsString()
	 * @generated
	 * @ordered
	 */
	protected static final String V1_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getV1AsString() <em>V1 As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getV1AsString()
	 * @generated
	 * @ordered
	 */
	protected String v1AsString = V1_AS_STRING_EDEFAULT;

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
	 * The default value of the '{@link #getU2AsString() <em>U2 As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getU2AsString()
	 * @generated
	 * @ordered
	 */
	protected static final String U2_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getU2AsString() <em>U2 As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getU2AsString()
	 * @generated
	 * @ordered
	 */
	protected String u2AsString = U2_AS_STRING_EDEFAULT;

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
	 * The default value of the '{@link #getV2AsString() <em>V2 As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getV2AsString()
	 * @generated
	 * @ordered
	 */
	protected static final String V2_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getV2AsString() <em>V2 As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getV2AsString()
	 * @generated
	 * @ordered
	 */
	protected String v2AsString = V2_AS_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsense() <em>Usense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsense()
	 * @generated
	 * @ordered
	 */
	protected static final Tristate USENSE_EDEFAULT = Tristate.TRUE;

	/**
	 * The cached value of the '{@link #getUsense() <em>Usense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsense()
	 * @generated
	 * @ordered
	 */
	protected Tristate usense = USENSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVsense() <em>Vsense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVsense()
	 * @generated
	 * @ordered
	 */
	protected static final Tristate VSENSE_EDEFAULT = Tristate.TRUE;

	/**
	 * The cached value of the '{@link #getVsense() <em>Vsense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVsense()
	 * @generated
	 * @ordered
	 */
	protected Tristate vsense = VSENSE_EDEFAULT;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcRectangularTrimmedSurface();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSurface getBasisSurface() {
		if (basisSurface != null && basisSurface.eIsProxy()) {
			InternalEObject oldBasisSurface = (InternalEObject)basisSurface;
			basisSurface = (IfcSurface)eResolveProxy(oldBasisSurface);
			if (basisSurface != oldBasisSurface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__BASIS_SURFACE, oldBasisSurface, basisSurface));
			}
		}
		return basisSurface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSurface basicGetBasisSurface() {
		return basisSurface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasisSurface(IfcSurface newBasisSurface) {
		IfcSurface oldBasisSurface = basisSurface;
		basisSurface = newBasisSurface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__BASIS_SURFACE, oldBasisSurface, basisSurface));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__U1, oldU1, u1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getU1AsString() {
		return u1AsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setU1AsString(String newU1AsString) {
		String oldU1AsString = u1AsString;
		u1AsString = newU1AsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__U1_AS_STRING, oldU1AsString, u1AsString));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__V1, oldV1, v1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getV1AsString() {
		return v1AsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setV1AsString(String newV1AsString) {
		String oldV1AsString = v1AsString;
		v1AsString = newV1AsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__V1_AS_STRING, oldV1AsString, v1AsString));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__U2, oldU2, u2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getU2AsString() {
		return u2AsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setU2AsString(String newU2AsString) {
		String oldU2AsString = u2AsString;
		u2AsString = newU2AsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__U2_AS_STRING, oldU2AsString, u2AsString));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__V2, oldV2, v2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getV2AsString() {
		return v2AsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setV2AsString(String newV2AsString) {
		String oldV2AsString = v2AsString;
		v2AsString = newV2AsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__V2_AS_STRING, oldV2AsString, v2AsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tristate getUsense() {
		return usense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsense(Tristate newUsense) {
		Tristate oldUsense = usense;
		usense = newUsense == null ? USENSE_EDEFAULT : newUsense;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__USENSE, oldUsense, usense));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tristate getVsense() {
		return vsense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVsense(Tristate newVsense) {
		Tristate oldVsense = vsense;
		vsense = newVsense == null ? VSENSE_EDEFAULT : newVsense;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__VSENSE, oldVsense, vsense));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__DIM, oldDim, dim, !oldDimESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__DIM, oldDim, DIM_EDEFAULT, oldDimESet));
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
			case Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__BASIS_SURFACE:
				if (resolve) return getBasisSurface();
				return basicGetBasisSurface();
			case Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__U1:
				return getU1();
			case Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__U1_AS_STRING:
				return getU1AsString();
			case Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__V1:
				return getV1();
			case Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__V1_AS_STRING:
				return getV1AsString();
			case Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__U2:
				return getU2();
			case Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__U2_AS_STRING:
				return getU2AsString();
			case Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__V2:
				return getV2();
			case Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__V2_AS_STRING:
				return getV2AsString();
			case Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__USENSE:
				return getUsense();
			case Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__VSENSE:
				return getVsense();
			case Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__DIM:
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
			case Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__BASIS_SURFACE:
				setBasisSurface((IfcSurface)newValue);
				return;
			case Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__U1:
				setU1((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__U1_AS_STRING:
				setU1AsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__V1:
				setV1((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__V1_AS_STRING:
				setV1AsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__U2:
				setU2((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__U2_AS_STRING:
				setU2AsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__V2:
				setV2((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__V2_AS_STRING:
				setV2AsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__USENSE:
				setUsense((Tristate)newValue);
				return;
			case Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__VSENSE:
				setVsense((Tristate)newValue);
				return;
			case Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__DIM:
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
			case Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__BASIS_SURFACE:
				setBasisSurface((IfcSurface)null);
				return;
			case Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__U1:
				setU1(U1_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__U1_AS_STRING:
				setU1AsString(U1_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__V1:
				setV1(V1_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__V1_AS_STRING:
				setV1AsString(V1_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__U2:
				setU2(U2_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__U2_AS_STRING:
				setU2AsString(U2_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__V2:
				setV2(V2_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__V2_AS_STRING:
				setV2AsString(V2_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__USENSE:
				setUsense(USENSE_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__VSENSE:
				setVsense(VSENSE_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__DIM:
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
			case Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__BASIS_SURFACE:
				return basisSurface != null;
			case Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__U1:
				return u1 != U1_EDEFAULT;
			case Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__U1_AS_STRING:
				return U1_AS_STRING_EDEFAULT == null ? u1AsString != null : !U1_AS_STRING_EDEFAULT.equals(u1AsString);
			case Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__V1:
				return v1 != V1_EDEFAULT;
			case Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__V1_AS_STRING:
				return V1_AS_STRING_EDEFAULT == null ? v1AsString != null : !V1_AS_STRING_EDEFAULT.equals(v1AsString);
			case Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__U2:
				return u2 != U2_EDEFAULT;
			case Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__U2_AS_STRING:
				return U2_AS_STRING_EDEFAULT == null ? u2AsString != null : !U2_AS_STRING_EDEFAULT.equals(u2AsString);
			case Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__V2:
				return v2 != V2_EDEFAULT;
			case Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__V2_AS_STRING:
				return V2_AS_STRING_EDEFAULT == null ? v2AsString != null : !V2_AS_STRING_EDEFAULT.equals(v2AsString);
			case Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__USENSE:
				return usense != USENSE_EDEFAULT;
			case Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__VSENSE:
				return vsense != VSENSE_EDEFAULT;
			case Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__DIM:
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
		result.append(" (U1: ");
		result.append(u1);
		result.append(", U1AsString: ");
		result.append(u1AsString);
		result.append(", V1: ");
		result.append(v1);
		result.append(", V1AsString: ");
		result.append(v1AsString);
		result.append(", U2: ");
		result.append(u2);
		result.append(", U2AsString: ");
		result.append(u2AsString);
		result.append(", V2: ");
		result.append(v2);
		result.append(", V2AsString: ");
		result.append(v2AsString);
		result.append(", Usense: ");
		result.append(usense);
		result.append(", Vsense: ");
		result.append(vsense);
		result.append(", Dim: ");
		if (dimESet) result.append(dim); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcRectangularTrimmedSurfaceImpl
