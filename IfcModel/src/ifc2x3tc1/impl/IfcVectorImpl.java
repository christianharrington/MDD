/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcDirection;
import ifc2x3tc1.IfcVector;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Vector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcVectorImpl#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcVectorImpl#getMagnitude <em>Magnitude</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcVectorImpl#getMagnitudeAsString <em>Magnitude As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcVectorImpl#getDim <em>Dim</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcVectorImpl extends IfcGeometricRepresentationItemImpl implements IfcVector {
	/**
	 * The cached value of the '{@link #getOrientation() <em>Orientation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected IfcDirection orientation;

	/**
	 * The default value of the '{@link #getMagnitude() <em>Magnitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMagnitude()
	 * @generated
	 * @ordered
	 */
	protected static final double MAGNITUDE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMagnitude() <em>Magnitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMagnitude()
	 * @generated
	 * @ordered
	 */
	protected double magnitude = MAGNITUDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMagnitudeAsString() <em>Magnitude As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMagnitudeAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String MAGNITUDE_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMagnitudeAsString() <em>Magnitude As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMagnitudeAsString()
	 * @generated
	 * @ordered
	 */
	protected String magnitudeAsString = MAGNITUDE_AS_STRING_EDEFAULT;

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
	protected IfcVectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcVector();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDirection getOrientation() {
		if (orientation != null && orientation.eIsProxy()) {
			InternalEObject oldOrientation = (InternalEObject)orientation;
			orientation = (IfcDirection)eResolveProxy(oldOrientation);
			if (orientation != oldOrientation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_VECTOR__ORIENTATION, oldOrientation, orientation));
			}
		}
		return orientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDirection basicGetOrientation() {
		return orientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrientation(IfcDirection newOrientation) {
		IfcDirection oldOrientation = orientation;
		orientation = newOrientation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_VECTOR__ORIENTATION, oldOrientation, orientation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMagnitude() {
		return magnitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMagnitude(double newMagnitude) {
		double oldMagnitude = magnitude;
		magnitude = newMagnitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_VECTOR__MAGNITUDE, oldMagnitude, magnitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMagnitudeAsString() {
		return magnitudeAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMagnitudeAsString(String newMagnitudeAsString) {
		String oldMagnitudeAsString = magnitudeAsString;
		magnitudeAsString = newMagnitudeAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_VECTOR__MAGNITUDE_AS_STRING, oldMagnitudeAsString, magnitudeAsString));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_VECTOR__DIM, oldDim, dim, !oldDimESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_VECTOR__DIM, oldDim, DIM_EDEFAULT, oldDimESet));
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
			case Ifc2x3tc1Package.IFC_VECTOR__ORIENTATION:
				if (resolve) return getOrientation();
				return basicGetOrientation();
			case Ifc2x3tc1Package.IFC_VECTOR__MAGNITUDE:
				return getMagnitude();
			case Ifc2x3tc1Package.IFC_VECTOR__MAGNITUDE_AS_STRING:
				return getMagnitudeAsString();
			case Ifc2x3tc1Package.IFC_VECTOR__DIM:
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
			case Ifc2x3tc1Package.IFC_VECTOR__ORIENTATION:
				setOrientation((IfcDirection)newValue);
				return;
			case Ifc2x3tc1Package.IFC_VECTOR__MAGNITUDE:
				setMagnitude((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_VECTOR__MAGNITUDE_AS_STRING:
				setMagnitudeAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_VECTOR__DIM:
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
			case Ifc2x3tc1Package.IFC_VECTOR__ORIENTATION:
				setOrientation((IfcDirection)null);
				return;
			case Ifc2x3tc1Package.IFC_VECTOR__MAGNITUDE:
				setMagnitude(MAGNITUDE_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_VECTOR__MAGNITUDE_AS_STRING:
				setMagnitudeAsString(MAGNITUDE_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_VECTOR__DIM:
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
			case Ifc2x3tc1Package.IFC_VECTOR__ORIENTATION:
				return orientation != null;
			case Ifc2x3tc1Package.IFC_VECTOR__MAGNITUDE:
				return magnitude != MAGNITUDE_EDEFAULT;
			case Ifc2x3tc1Package.IFC_VECTOR__MAGNITUDE_AS_STRING:
				return MAGNITUDE_AS_STRING_EDEFAULT == null ? magnitudeAsString != null : !MAGNITUDE_AS_STRING_EDEFAULT.equals(magnitudeAsString);
			case Ifc2x3tc1Package.IFC_VECTOR__DIM:
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
		result.append(" (Magnitude: ");
		result.append(magnitude);
		result.append(", MagnitudeAsString: ");
		result.append(magnitudeAsString);
		result.append(", Dim: ");
		if (dimESet) result.append(dim); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcVectorImpl
