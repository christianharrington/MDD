/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcBoundingBox;
import ifc2x3tc1.IfcCartesianPoint;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Bounding Box</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcBoundingBoxImpl#getCorner <em>Corner</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcBoundingBoxImpl#getXDim <em>XDim</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcBoundingBoxImpl#getXDimAsString <em>XDim As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcBoundingBoxImpl#getYDim <em>YDim</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcBoundingBoxImpl#getYDimAsString <em>YDim As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcBoundingBoxImpl#getZDim <em>ZDim</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcBoundingBoxImpl#getZDimAsString <em>ZDim As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcBoundingBoxImpl#getDim <em>Dim</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcBoundingBoxImpl extends IfcGeometricRepresentationItemImpl implements IfcBoundingBox {
	/**
	 * The cached value of the '{@link #getCorner() <em>Corner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorner()
	 * @generated
	 * @ordered
	 */
	protected IfcCartesianPoint corner;

	/**
	 * The default value of the '{@link #getXDim() <em>XDim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXDim()
	 * @generated
	 * @ordered
	 */
	protected static final double XDIM_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getXDim() <em>XDim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXDim()
	 * @generated
	 * @ordered
	 */
	protected double xDim = XDIM_EDEFAULT;

	/**
	 * The default value of the '{@link #getXDimAsString() <em>XDim As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXDimAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String XDIM_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXDimAsString() <em>XDim As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXDimAsString()
	 * @generated
	 * @ordered
	 */
	protected String xDimAsString = XDIM_AS_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getYDim() <em>YDim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYDim()
	 * @generated
	 * @ordered
	 */
	protected static final double YDIM_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getYDim() <em>YDim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYDim()
	 * @generated
	 * @ordered
	 */
	protected double yDim = YDIM_EDEFAULT;

	/**
	 * The default value of the '{@link #getYDimAsString() <em>YDim As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYDimAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String YDIM_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYDimAsString() <em>YDim As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYDimAsString()
	 * @generated
	 * @ordered
	 */
	protected String yDimAsString = YDIM_AS_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getZDim() <em>ZDim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZDim()
	 * @generated
	 * @ordered
	 */
	protected static final double ZDIM_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getZDim() <em>ZDim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZDim()
	 * @generated
	 * @ordered
	 */
	protected double zDim = ZDIM_EDEFAULT;

	/**
	 * The default value of the '{@link #getZDimAsString() <em>ZDim As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZDimAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String ZDIM_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZDimAsString() <em>ZDim As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZDimAsString()
	 * @generated
	 * @ordered
	 */
	protected String zDimAsString = ZDIM_AS_STRING_EDEFAULT;

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
	protected IfcBoundingBoxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcBoundingBox();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCartesianPoint getCorner() {
		if (corner != null && corner.eIsProxy()) {
			InternalEObject oldCorner = (InternalEObject)corner;
			corner = (IfcCartesianPoint)eResolveProxy(oldCorner);
			if (corner != oldCorner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_BOUNDING_BOX__CORNER, oldCorner, corner));
			}
		}
		return corner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCartesianPoint basicGetCorner() {
		return corner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorner(IfcCartesianPoint newCorner) {
		IfcCartesianPoint oldCorner = corner;
		corner = newCorner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_BOUNDING_BOX__CORNER, oldCorner, corner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getXDim() {
		return xDim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXDim(double newXDim) {
		double oldXDim = xDim;
		xDim = newXDim;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_BOUNDING_BOX__XDIM, oldXDim, xDim));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXDimAsString() {
		return xDimAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXDimAsString(String newXDimAsString) {
		String oldXDimAsString = xDimAsString;
		xDimAsString = newXDimAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_BOUNDING_BOX__XDIM_AS_STRING, oldXDimAsString, xDimAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getYDim() {
		return yDim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYDim(double newYDim) {
		double oldYDim = yDim;
		yDim = newYDim;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_BOUNDING_BOX__YDIM, oldYDim, yDim));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getYDimAsString() {
		return yDimAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYDimAsString(String newYDimAsString) {
		String oldYDimAsString = yDimAsString;
		yDimAsString = newYDimAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_BOUNDING_BOX__YDIM_AS_STRING, oldYDimAsString, yDimAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getZDim() {
		return zDim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZDim(double newZDim) {
		double oldZDim = zDim;
		zDim = newZDim;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_BOUNDING_BOX__ZDIM, oldZDim, zDim));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getZDimAsString() {
		return zDimAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZDimAsString(String newZDimAsString) {
		String oldZDimAsString = zDimAsString;
		zDimAsString = newZDimAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_BOUNDING_BOX__ZDIM_AS_STRING, oldZDimAsString, zDimAsString));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_BOUNDING_BOX__DIM, oldDim, dim, !oldDimESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_BOUNDING_BOX__DIM, oldDim, DIM_EDEFAULT, oldDimESet));
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
			case Ifc2x3tc1Package.IFC_BOUNDING_BOX__CORNER:
				if (resolve) return getCorner();
				return basicGetCorner();
			case Ifc2x3tc1Package.IFC_BOUNDING_BOX__XDIM:
				return getXDim();
			case Ifc2x3tc1Package.IFC_BOUNDING_BOX__XDIM_AS_STRING:
				return getXDimAsString();
			case Ifc2x3tc1Package.IFC_BOUNDING_BOX__YDIM:
				return getYDim();
			case Ifc2x3tc1Package.IFC_BOUNDING_BOX__YDIM_AS_STRING:
				return getYDimAsString();
			case Ifc2x3tc1Package.IFC_BOUNDING_BOX__ZDIM:
				return getZDim();
			case Ifc2x3tc1Package.IFC_BOUNDING_BOX__ZDIM_AS_STRING:
				return getZDimAsString();
			case Ifc2x3tc1Package.IFC_BOUNDING_BOX__DIM:
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
			case Ifc2x3tc1Package.IFC_BOUNDING_BOX__CORNER:
				setCorner((IfcCartesianPoint)newValue);
				return;
			case Ifc2x3tc1Package.IFC_BOUNDING_BOX__XDIM:
				setXDim((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_BOUNDING_BOX__XDIM_AS_STRING:
				setXDimAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_BOUNDING_BOX__YDIM:
				setYDim((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_BOUNDING_BOX__YDIM_AS_STRING:
				setYDimAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_BOUNDING_BOX__ZDIM:
				setZDim((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_BOUNDING_BOX__ZDIM_AS_STRING:
				setZDimAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_BOUNDING_BOX__DIM:
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
			case Ifc2x3tc1Package.IFC_BOUNDING_BOX__CORNER:
				setCorner((IfcCartesianPoint)null);
				return;
			case Ifc2x3tc1Package.IFC_BOUNDING_BOX__XDIM:
				setXDim(XDIM_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_BOUNDING_BOX__XDIM_AS_STRING:
				setXDimAsString(XDIM_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_BOUNDING_BOX__YDIM:
				setYDim(YDIM_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_BOUNDING_BOX__YDIM_AS_STRING:
				setYDimAsString(YDIM_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_BOUNDING_BOX__ZDIM:
				setZDim(ZDIM_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_BOUNDING_BOX__ZDIM_AS_STRING:
				setZDimAsString(ZDIM_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_BOUNDING_BOX__DIM:
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
			case Ifc2x3tc1Package.IFC_BOUNDING_BOX__CORNER:
				return corner != null;
			case Ifc2x3tc1Package.IFC_BOUNDING_BOX__XDIM:
				return xDim != XDIM_EDEFAULT;
			case Ifc2x3tc1Package.IFC_BOUNDING_BOX__XDIM_AS_STRING:
				return XDIM_AS_STRING_EDEFAULT == null ? xDimAsString != null : !XDIM_AS_STRING_EDEFAULT.equals(xDimAsString);
			case Ifc2x3tc1Package.IFC_BOUNDING_BOX__YDIM:
				return yDim != YDIM_EDEFAULT;
			case Ifc2x3tc1Package.IFC_BOUNDING_BOX__YDIM_AS_STRING:
				return YDIM_AS_STRING_EDEFAULT == null ? yDimAsString != null : !YDIM_AS_STRING_EDEFAULT.equals(yDimAsString);
			case Ifc2x3tc1Package.IFC_BOUNDING_BOX__ZDIM:
				return zDim != ZDIM_EDEFAULT;
			case Ifc2x3tc1Package.IFC_BOUNDING_BOX__ZDIM_AS_STRING:
				return ZDIM_AS_STRING_EDEFAULT == null ? zDimAsString != null : !ZDIM_AS_STRING_EDEFAULT.equals(zDimAsString);
			case Ifc2x3tc1Package.IFC_BOUNDING_BOX__DIM:
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
		result.append(" (XDim: ");
		result.append(xDim);
		result.append(", XDimAsString: ");
		result.append(xDimAsString);
		result.append(", YDim: ");
		result.append(yDim);
		result.append(", YDimAsString: ");
		result.append(yDimAsString);
		result.append(", ZDim: ");
		result.append(zDim);
		result.append(", ZDimAsString: ");
		result.append(zDimAsString);
		result.append(", Dim: ");
		if (dimESet) result.append(dim); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcBoundingBoxImpl
