/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcPlanarExtent;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Planar Extent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcPlanarExtentImpl#getSizeInX <em>Size In X</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcPlanarExtentImpl#getSizeInXAsString <em>Size In XAs String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcPlanarExtentImpl#getSizeInY <em>Size In Y</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcPlanarExtentImpl#getSizeInYAsString <em>Size In YAs String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcPlanarExtentImpl extends IfcGeometricRepresentationItemImpl implements IfcPlanarExtent {
	/**
	 * The default value of the '{@link #getSizeInX() <em>Size In X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeInX()
	 * @generated
	 * @ordered
	 */
	protected static final double SIZE_IN_X_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSizeInX() <em>Size In X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeInX()
	 * @generated
	 * @ordered
	 */
	protected double sizeInX = SIZE_IN_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getSizeInXAsString() <em>Size In XAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeInXAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String SIZE_IN_XAS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSizeInXAsString() <em>Size In XAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeInXAsString()
	 * @generated
	 * @ordered
	 */
	protected String sizeInXAsString = SIZE_IN_XAS_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getSizeInY() <em>Size In Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeInY()
	 * @generated
	 * @ordered
	 */
	protected static final double SIZE_IN_Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSizeInY() <em>Size In Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeInY()
	 * @generated
	 * @ordered
	 */
	protected double sizeInY = SIZE_IN_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getSizeInYAsString() <em>Size In YAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeInYAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String SIZE_IN_YAS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSizeInYAsString() <em>Size In YAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeInYAsString()
	 * @generated
	 * @ordered
	 */
	protected String sizeInYAsString = SIZE_IN_YAS_STRING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcPlanarExtentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcPlanarExtent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSizeInX() {
		return sizeInX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSizeInX(double newSizeInX) {
		double oldSizeInX = sizeInX;
		sizeInX = newSizeInX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PLANAR_EXTENT__SIZE_IN_X, oldSizeInX, sizeInX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSizeInXAsString() {
		return sizeInXAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSizeInXAsString(String newSizeInXAsString) {
		String oldSizeInXAsString = sizeInXAsString;
		sizeInXAsString = newSizeInXAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PLANAR_EXTENT__SIZE_IN_XAS_STRING, oldSizeInXAsString, sizeInXAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSizeInY() {
		return sizeInY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSizeInY(double newSizeInY) {
		double oldSizeInY = sizeInY;
		sizeInY = newSizeInY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PLANAR_EXTENT__SIZE_IN_Y, oldSizeInY, sizeInY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSizeInYAsString() {
		return sizeInYAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSizeInYAsString(String newSizeInYAsString) {
		String oldSizeInYAsString = sizeInYAsString;
		sizeInYAsString = newSizeInYAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PLANAR_EXTENT__SIZE_IN_YAS_STRING, oldSizeInYAsString, sizeInYAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_PLANAR_EXTENT__SIZE_IN_X:
				return getSizeInX();
			case Ifc2x3tc1Package.IFC_PLANAR_EXTENT__SIZE_IN_XAS_STRING:
				return getSizeInXAsString();
			case Ifc2x3tc1Package.IFC_PLANAR_EXTENT__SIZE_IN_Y:
				return getSizeInY();
			case Ifc2x3tc1Package.IFC_PLANAR_EXTENT__SIZE_IN_YAS_STRING:
				return getSizeInYAsString();
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
			case Ifc2x3tc1Package.IFC_PLANAR_EXTENT__SIZE_IN_X:
				setSizeInX((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_PLANAR_EXTENT__SIZE_IN_XAS_STRING:
				setSizeInXAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_PLANAR_EXTENT__SIZE_IN_Y:
				setSizeInY((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_PLANAR_EXTENT__SIZE_IN_YAS_STRING:
				setSizeInYAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_PLANAR_EXTENT__SIZE_IN_X:
				setSizeInX(SIZE_IN_X_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_PLANAR_EXTENT__SIZE_IN_XAS_STRING:
				setSizeInXAsString(SIZE_IN_XAS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_PLANAR_EXTENT__SIZE_IN_Y:
				setSizeInY(SIZE_IN_Y_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_PLANAR_EXTENT__SIZE_IN_YAS_STRING:
				setSizeInYAsString(SIZE_IN_YAS_STRING_EDEFAULT);
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
			case Ifc2x3tc1Package.IFC_PLANAR_EXTENT__SIZE_IN_X:
				return sizeInX != SIZE_IN_X_EDEFAULT;
			case Ifc2x3tc1Package.IFC_PLANAR_EXTENT__SIZE_IN_XAS_STRING:
				return SIZE_IN_XAS_STRING_EDEFAULT == null ? sizeInXAsString != null : !SIZE_IN_XAS_STRING_EDEFAULT.equals(sizeInXAsString);
			case Ifc2x3tc1Package.IFC_PLANAR_EXTENT__SIZE_IN_Y:
				return sizeInY != SIZE_IN_Y_EDEFAULT;
			case Ifc2x3tc1Package.IFC_PLANAR_EXTENT__SIZE_IN_YAS_STRING:
				return SIZE_IN_YAS_STRING_EDEFAULT == null ? sizeInYAsString != null : !SIZE_IN_YAS_STRING_EDEFAULT.equals(sizeInYAsString);
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
		result.append(" (SizeInX: ");
		result.append(sizeInX);
		result.append(", SizeInXAsString: ");
		result.append(sizeInXAsString);
		result.append(", SizeInY: ");
		result.append(sizeInY);
		result.append(", SizeInYAsString: ");
		result.append(sizeInYAsString);
		result.append(')');
		return result.toString();
	}

} //IfcPlanarExtentImpl
