/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcStructuralLoadSingleForceWarping;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Structural Load Single Force Warping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralLoadSingleForceWarpingImpl#getWarpingMoment <em>Warping Moment</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralLoadSingleForceWarpingImpl#getWarpingMomentAsString <em>Warping Moment As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcStructuralLoadSingleForceWarpingImpl extends IfcStructuralLoadSingleForceImpl implements IfcStructuralLoadSingleForceWarping {
	/**
	 * The default value of the '{@link #getWarpingMoment() <em>Warping Moment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarpingMoment()
	 * @generated
	 * @ordered
	 */
	protected static final double WARPING_MOMENT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWarpingMoment() <em>Warping Moment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarpingMoment()
	 * @generated
	 * @ordered
	 */
	protected double warpingMoment = WARPING_MOMENT_EDEFAULT;

	/**
	 * This is true if the Warping Moment attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean warpingMomentESet;

	/**
	 * The default value of the '{@link #getWarpingMomentAsString() <em>Warping Moment As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarpingMomentAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String WARPING_MOMENT_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWarpingMomentAsString() <em>Warping Moment As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarpingMomentAsString()
	 * @generated
	 * @ordered
	 */
	protected String warpingMomentAsString = WARPING_MOMENT_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Warping Moment As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean warpingMomentAsStringESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcStructuralLoadSingleForceWarpingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadSingleForceWarping();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWarpingMoment() {
		return warpingMoment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWarpingMoment(double newWarpingMoment) {
		double oldWarpingMoment = warpingMoment;
		warpingMoment = newWarpingMoment;
		boolean oldWarpingMomentESet = warpingMomentESet;
		warpingMomentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE_WARPING__WARPING_MOMENT, oldWarpingMoment, warpingMoment, !oldWarpingMomentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWarpingMoment() {
		double oldWarpingMoment = warpingMoment;
		boolean oldWarpingMomentESet = warpingMomentESet;
		warpingMoment = WARPING_MOMENT_EDEFAULT;
		warpingMomentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE_WARPING__WARPING_MOMENT, oldWarpingMoment, WARPING_MOMENT_EDEFAULT, oldWarpingMomentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWarpingMoment() {
		return warpingMomentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWarpingMomentAsString() {
		return warpingMomentAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWarpingMomentAsString(String newWarpingMomentAsString) {
		String oldWarpingMomentAsString = warpingMomentAsString;
		warpingMomentAsString = newWarpingMomentAsString;
		boolean oldWarpingMomentAsStringESet = warpingMomentAsStringESet;
		warpingMomentAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE_WARPING__WARPING_MOMENT_AS_STRING, oldWarpingMomentAsString, warpingMomentAsString, !oldWarpingMomentAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWarpingMomentAsString() {
		String oldWarpingMomentAsString = warpingMomentAsString;
		boolean oldWarpingMomentAsStringESet = warpingMomentAsStringESet;
		warpingMomentAsString = WARPING_MOMENT_AS_STRING_EDEFAULT;
		warpingMomentAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE_WARPING__WARPING_MOMENT_AS_STRING, oldWarpingMomentAsString, WARPING_MOMENT_AS_STRING_EDEFAULT, oldWarpingMomentAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWarpingMomentAsString() {
		return warpingMomentAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE_WARPING__WARPING_MOMENT:
				return getWarpingMoment();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE_WARPING__WARPING_MOMENT_AS_STRING:
				return getWarpingMomentAsString();
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE_WARPING__WARPING_MOMENT:
				setWarpingMoment((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE_WARPING__WARPING_MOMENT_AS_STRING:
				setWarpingMomentAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE_WARPING__WARPING_MOMENT:
				unsetWarpingMoment();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE_WARPING__WARPING_MOMENT_AS_STRING:
				unsetWarpingMomentAsString();
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE_WARPING__WARPING_MOMENT:
				return isSetWarpingMoment();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE_WARPING__WARPING_MOMENT_AS_STRING:
				return isSetWarpingMomentAsString();
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
		result.append(" (WarpingMoment: ");
		if (warpingMomentESet) result.append(warpingMoment); else result.append("<unset>");
		result.append(", WarpingMomentAsString: ");
		if (warpingMomentAsStringESet) result.append(warpingMomentAsString); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcStructuralLoadSingleForceWarpingImpl
