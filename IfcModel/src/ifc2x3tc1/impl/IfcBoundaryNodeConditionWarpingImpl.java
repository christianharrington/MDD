/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcBoundaryNodeConditionWarping;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Boundary Node Condition Warping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcBoundaryNodeConditionWarpingImpl#getWarpingStiffness <em>Warping Stiffness</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcBoundaryNodeConditionWarpingImpl#getWarpingStiffnessAsString <em>Warping Stiffness As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcBoundaryNodeConditionWarpingImpl extends IfcBoundaryNodeConditionImpl implements IfcBoundaryNodeConditionWarping {
	/**
	 * The default value of the '{@link #getWarpingStiffness() <em>Warping Stiffness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarpingStiffness()
	 * @generated
	 * @ordered
	 */
	protected static final double WARPING_STIFFNESS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWarpingStiffness() <em>Warping Stiffness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarpingStiffness()
	 * @generated
	 * @ordered
	 */
	protected double warpingStiffness = WARPING_STIFFNESS_EDEFAULT;

	/**
	 * This is true if the Warping Stiffness attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean warpingStiffnessESet;

	/**
	 * The default value of the '{@link #getWarpingStiffnessAsString() <em>Warping Stiffness As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarpingStiffnessAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String WARPING_STIFFNESS_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWarpingStiffnessAsString() <em>Warping Stiffness As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarpingStiffnessAsString()
	 * @generated
	 * @ordered
	 */
	protected String warpingStiffnessAsString = WARPING_STIFFNESS_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Warping Stiffness As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean warpingStiffnessAsStringESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcBoundaryNodeConditionWarpingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryNodeConditionWarping();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWarpingStiffness() {
		return warpingStiffness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWarpingStiffness(double newWarpingStiffness) {
		double oldWarpingStiffness = warpingStiffness;
		warpingStiffness = newWarpingStiffness;
		boolean oldWarpingStiffnessESet = warpingStiffnessESet;
		warpingStiffnessESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION_WARPING__WARPING_STIFFNESS, oldWarpingStiffness, warpingStiffness, !oldWarpingStiffnessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWarpingStiffness() {
		double oldWarpingStiffness = warpingStiffness;
		boolean oldWarpingStiffnessESet = warpingStiffnessESet;
		warpingStiffness = WARPING_STIFFNESS_EDEFAULT;
		warpingStiffnessESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION_WARPING__WARPING_STIFFNESS, oldWarpingStiffness, WARPING_STIFFNESS_EDEFAULT, oldWarpingStiffnessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWarpingStiffness() {
		return warpingStiffnessESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWarpingStiffnessAsString() {
		return warpingStiffnessAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWarpingStiffnessAsString(String newWarpingStiffnessAsString) {
		String oldWarpingStiffnessAsString = warpingStiffnessAsString;
		warpingStiffnessAsString = newWarpingStiffnessAsString;
		boolean oldWarpingStiffnessAsStringESet = warpingStiffnessAsStringESet;
		warpingStiffnessAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION_WARPING__WARPING_STIFFNESS_AS_STRING, oldWarpingStiffnessAsString, warpingStiffnessAsString, !oldWarpingStiffnessAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWarpingStiffnessAsString() {
		String oldWarpingStiffnessAsString = warpingStiffnessAsString;
		boolean oldWarpingStiffnessAsStringESet = warpingStiffnessAsStringESet;
		warpingStiffnessAsString = WARPING_STIFFNESS_AS_STRING_EDEFAULT;
		warpingStiffnessAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION_WARPING__WARPING_STIFFNESS_AS_STRING, oldWarpingStiffnessAsString, WARPING_STIFFNESS_AS_STRING_EDEFAULT, oldWarpingStiffnessAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWarpingStiffnessAsString() {
		return warpingStiffnessAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION_WARPING__WARPING_STIFFNESS:
				return getWarpingStiffness();
			case Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION_WARPING__WARPING_STIFFNESS_AS_STRING:
				return getWarpingStiffnessAsString();
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
			case Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION_WARPING__WARPING_STIFFNESS:
				setWarpingStiffness((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION_WARPING__WARPING_STIFFNESS_AS_STRING:
				setWarpingStiffnessAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION_WARPING__WARPING_STIFFNESS:
				unsetWarpingStiffness();
				return;
			case Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION_WARPING__WARPING_STIFFNESS_AS_STRING:
				unsetWarpingStiffnessAsString();
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
			case Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION_WARPING__WARPING_STIFFNESS:
				return isSetWarpingStiffness();
			case Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION_WARPING__WARPING_STIFFNESS_AS_STRING:
				return isSetWarpingStiffnessAsString();
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
		result.append(" (WarpingStiffness: ");
		if (warpingStiffnessESet) result.append(warpingStiffness); else result.append("<unset>");
		result.append(", WarpingStiffnessAsString: ");
		if (warpingStiffnessAsStringESet) result.append(warpingStiffnessAsString); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcBoundaryNodeConditionWarpingImpl
