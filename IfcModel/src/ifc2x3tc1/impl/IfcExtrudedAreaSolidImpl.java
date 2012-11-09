/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcDirection;
import ifc2x3tc1.IfcExtrudedAreaSolid;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Extruded Area Solid</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcExtrudedAreaSolidImpl#getExtrudedDirection <em>Extruded Direction</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcExtrudedAreaSolidImpl#getDepth <em>Depth</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcExtrudedAreaSolidImpl#getDepthAsString <em>Depth As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcExtrudedAreaSolidImpl extends IfcSweptAreaSolidImpl implements IfcExtrudedAreaSolid {
	/**
	 * The cached value of the '{@link #getExtrudedDirection() <em>Extruded Direction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrudedDirection()
	 * @generated
	 * @ordered
	 */
	protected IfcDirection extrudedDirection;

	/**
	 * The default value of the '{@link #getDepth() <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepth()
	 * @generated
	 * @ordered
	 */
	protected static final double DEPTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDepth() <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepth()
	 * @generated
	 * @ordered
	 */
	protected double depth = DEPTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getDepthAsString() <em>Depth As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepthAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPTH_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDepthAsString() <em>Depth As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepthAsString()
	 * @generated
	 * @ordered
	 */
	protected String depthAsString = DEPTH_AS_STRING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcExtrudedAreaSolidImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcExtrudedAreaSolid();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDirection getExtrudedDirection() {
		if (extrudedDirection != null && extrudedDirection.eIsProxy()) {
			InternalEObject oldExtrudedDirection = (InternalEObject)extrudedDirection;
			extrudedDirection = (IfcDirection)eResolveProxy(oldExtrudedDirection);
			if (extrudedDirection != oldExtrudedDirection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_EXTRUDED_AREA_SOLID__EXTRUDED_DIRECTION, oldExtrudedDirection, extrudedDirection));
			}
		}
		return extrudedDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDirection basicGetExtrudedDirection() {
		return extrudedDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtrudedDirection(IfcDirection newExtrudedDirection) {
		IfcDirection oldExtrudedDirection = extrudedDirection;
		extrudedDirection = newExtrudedDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_EXTRUDED_AREA_SOLID__EXTRUDED_DIRECTION, oldExtrudedDirection, extrudedDirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDepth() {
		return depth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepth(double newDepth) {
		double oldDepth = depth;
		depth = newDepth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_EXTRUDED_AREA_SOLID__DEPTH, oldDepth, depth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDepthAsString() {
		return depthAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepthAsString(String newDepthAsString) {
		String oldDepthAsString = depthAsString;
		depthAsString = newDepthAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_EXTRUDED_AREA_SOLID__DEPTH_AS_STRING, oldDepthAsString, depthAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_EXTRUDED_AREA_SOLID__EXTRUDED_DIRECTION:
				if (resolve) return getExtrudedDirection();
				return basicGetExtrudedDirection();
			case Ifc2x3tc1Package.IFC_EXTRUDED_AREA_SOLID__DEPTH:
				return getDepth();
			case Ifc2x3tc1Package.IFC_EXTRUDED_AREA_SOLID__DEPTH_AS_STRING:
				return getDepthAsString();
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
			case Ifc2x3tc1Package.IFC_EXTRUDED_AREA_SOLID__EXTRUDED_DIRECTION:
				setExtrudedDirection((IfcDirection)newValue);
				return;
			case Ifc2x3tc1Package.IFC_EXTRUDED_AREA_SOLID__DEPTH:
				setDepth((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_EXTRUDED_AREA_SOLID__DEPTH_AS_STRING:
				setDepthAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_EXTRUDED_AREA_SOLID__EXTRUDED_DIRECTION:
				setExtrudedDirection((IfcDirection)null);
				return;
			case Ifc2x3tc1Package.IFC_EXTRUDED_AREA_SOLID__DEPTH:
				setDepth(DEPTH_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_EXTRUDED_AREA_SOLID__DEPTH_AS_STRING:
				setDepthAsString(DEPTH_AS_STRING_EDEFAULT);
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
			case Ifc2x3tc1Package.IFC_EXTRUDED_AREA_SOLID__EXTRUDED_DIRECTION:
				return extrudedDirection != null;
			case Ifc2x3tc1Package.IFC_EXTRUDED_AREA_SOLID__DEPTH:
				return depth != DEPTH_EDEFAULT;
			case Ifc2x3tc1Package.IFC_EXTRUDED_AREA_SOLID__DEPTH_AS_STRING:
				return DEPTH_AS_STRING_EDEFAULT == null ? depthAsString != null : !DEPTH_AS_STRING_EDEFAULT.equals(depthAsString);
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
		result.append(" (Depth: ");
		result.append(depth);
		result.append(", DepthAsString: ");
		result.append(depthAsString);
		result.append(')');
		return result.toString();
	}

} //IfcExtrudedAreaSolidImpl
