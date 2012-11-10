/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcStructuralLoadTemperature;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Structural Load Temperature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralLoadTemperatureImpl#getDeltaT_Constant <em>Delta TConstant</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralLoadTemperatureImpl#getDeltaT_ConstantAsString <em>Delta TConstant As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralLoadTemperatureImpl#getDeltaT_Y <em>Delta TY</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralLoadTemperatureImpl#getDeltaT_YAsString <em>Delta TYAs String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralLoadTemperatureImpl#getDeltaT_Z <em>Delta TZ</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralLoadTemperatureImpl#getDeltaT_ZAsString <em>Delta TZAs String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcStructuralLoadTemperatureImpl extends IfcStructuralLoadStaticImpl implements IfcStructuralLoadTemperature {
	/**
	 * The default value of the '{@link #getDeltaT_Constant() <em>Delta TConstant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaT_Constant()
	 * @generated
	 * @ordered
	 */
	protected static final double DELTA_TCONSTANT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDeltaT_Constant() <em>Delta TConstant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaT_Constant()
	 * @generated
	 * @ordered
	 */
	protected double deltaT_Constant = DELTA_TCONSTANT_EDEFAULT;

	/**
	 * This is true if the Delta TConstant attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean deltaT_ConstantESet;

	/**
	 * The default value of the '{@link #getDeltaT_ConstantAsString() <em>Delta TConstant As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaT_ConstantAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String DELTA_TCONSTANT_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeltaT_ConstantAsString() <em>Delta TConstant As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaT_ConstantAsString()
	 * @generated
	 * @ordered
	 */
	protected String deltaT_ConstantAsString = DELTA_TCONSTANT_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Delta TConstant As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean deltaT_ConstantAsStringESet;

	/**
	 * The default value of the '{@link #getDeltaT_Y() <em>Delta TY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaT_Y()
	 * @generated
	 * @ordered
	 */
	protected static final double DELTA_TY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDeltaT_Y() <em>Delta TY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaT_Y()
	 * @generated
	 * @ordered
	 */
	protected double deltaT_Y = DELTA_TY_EDEFAULT;

	/**
	 * This is true if the Delta TY attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean deltaT_YESet;

	/**
	 * The default value of the '{@link #getDeltaT_YAsString() <em>Delta TYAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaT_YAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String DELTA_TYAS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeltaT_YAsString() <em>Delta TYAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaT_YAsString()
	 * @generated
	 * @ordered
	 */
	protected String deltaT_YAsString = DELTA_TYAS_STRING_EDEFAULT;

	/**
	 * This is true if the Delta TYAs String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean deltaT_YAsStringESet;

	/**
	 * The default value of the '{@link #getDeltaT_Z() <em>Delta TZ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaT_Z()
	 * @generated
	 * @ordered
	 */
	protected static final double DELTA_TZ_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDeltaT_Z() <em>Delta TZ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaT_Z()
	 * @generated
	 * @ordered
	 */
	protected double deltaT_Z = DELTA_TZ_EDEFAULT;

	/**
	 * This is true if the Delta TZ attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean deltaT_ZESet;

	/**
	 * The default value of the '{@link #getDeltaT_ZAsString() <em>Delta TZAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaT_ZAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String DELTA_TZAS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeltaT_ZAsString() <em>Delta TZAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaT_ZAsString()
	 * @generated
	 * @ordered
	 */
	protected String deltaT_ZAsString = DELTA_TZAS_STRING_EDEFAULT;

	/**
	 * This is true if the Delta TZAs String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean deltaT_ZAsStringESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcStructuralLoadTemperatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadTemperature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDeltaT_Constant() {
		return deltaT_Constant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeltaT_Constant(double newDeltaT_Constant) {
		double oldDeltaT_Constant = deltaT_Constant;
		deltaT_Constant = newDeltaT_Constant;
		boolean oldDeltaT_ConstantESet = deltaT_ConstantESet;
		deltaT_ConstantESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_TEMPERATURE__DELTA_TCONSTANT, oldDeltaT_Constant, deltaT_Constant, !oldDeltaT_ConstantESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDeltaT_Constant() {
		double oldDeltaT_Constant = deltaT_Constant;
		boolean oldDeltaT_ConstantESet = deltaT_ConstantESet;
		deltaT_Constant = DELTA_TCONSTANT_EDEFAULT;
		deltaT_ConstantESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_TEMPERATURE__DELTA_TCONSTANT, oldDeltaT_Constant, DELTA_TCONSTANT_EDEFAULT, oldDeltaT_ConstantESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDeltaT_Constant() {
		return deltaT_ConstantESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeltaT_ConstantAsString() {
		return deltaT_ConstantAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeltaT_ConstantAsString(String newDeltaT_ConstantAsString) {
		String oldDeltaT_ConstantAsString = deltaT_ConstantAsString;
		deltaT_ConstantAsString = newDeltaT_ConstantAsString;
		boolean oldDeltaT_ConstantAsStringESet = deltaT_ConstantAsStringESet;
		deltaT_ConstantAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_TEMPERATURE__DELTA_TCONSTANT_AS_STRING, oldDeltaT_ConstantAsString, deltaT_ConstantAsString, !oldDeltaT_ConstantAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDeltaT_ConstantAsString() {
		String oldDeltaT_ConstantAsString = deltaT_ConstantAsString;
		boolean oldDeltaT_ConstantAsStringESet = deltaT_ConstantAsStringESet;
		deltaT_ConstantAsString = DELTA_TCONSTANT_AS_STRING_EDEFAULT;
		deltaT_ConstantAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_TEMPERATURE__DELTA_TCONSTANT_AS_STRING, oldDeltaT_ConstantAsString, DELTA_TCONSTANT_AS_STRING_EDEFAULT, oldDeltaT_ConstantAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDeltaT_ConstantAsString() {
		return deltaT_ConstantAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDeltaT_Y() {
		return deltaT_Y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeltaT_Y(double newDeltaT_Y) {
		double oldDeltaT_Y = deltaT_Y;
		deltaT_Y = newDeltaT_Y;
		boolean oldDeltaT_YESet = deltaT_YESet;
		deltaT_YESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_TEMPERATURE__DELTA_TY, oldDeltaT_Y, deltaT_Y, !oldDeltaT_YESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDeltaT_Y() {
		double oldDeltaT_Y = deltaT_Y;
		boolean oldDeltaT_YESet = deltaT_YESet;
		deltaT_Y = DELTA_TY_EDEFAULT;
		deltaT_YESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_TEMPERATURE__DELTA_TY, oldDeltaT_Y, DELTA_TY_EDEFAULT, oldDeltaT_YESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDeltaT_Y() {
		return deltaT_YESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeltaT_YAsString() {
		return deltaT_YAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeltaT_YAsString(String newDeltaT_YAsString) {
		String oldDeltaT_YAsString = deltaT_YAsString;
		deltaT_YAsString = newDeltaT_YAsString;
		boolean oldDeltaT_YAsStringESet = deltaT_YAsStringESet;
		deltaT_YAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_TEMPERATURE__DELTA_TYAS_STRING, oldDeltaT_YAsString, deltaT_YAsString, !oldDeltaT_YAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDeltaT_YAsString() {
		String oldDeltaT_YAsString = deltaT_YAsString;
		boolean oldDeltaT_YAsStringESet = deltaT_YAsStringESet;
		deltaT_YAsString = DELTA_TYAS_STRING_EDEFAULT;
		deltaT_YAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_TEMPERATURE__DELTA_TYAS_STRING, oldDeltaT_YAsString, DELTA_TYAS_STRING_EDEFAULT, oldDeltaT_YAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDeltaT_YAsString() {
		return deltaT_YAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDeltaT_Z() {
		return deltaT_Z;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeltaT_Z(double newDeltaT_Z) {
		double oldDeltaT_Z = deltaT_Z;
		deltaT_Z = newDeltaT_Z;
		boolean oldDeltaT_ZESet = deltaT_ZESet;
		deltaT_ZESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_TEMPERATURE__DELTA_TZ, oldDeltaT_Z, deltaT_Z, !oldDeltaT_ZESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDeltaT_Z() {
		double oldDeltaT_Z = deltaT_Z;
		boolean oldDeltaT_ZESet = deltaT_ZESet;
		deltaT_Z = DELTA_TZ_EDEFAULT;
		deltaT_ZESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_TEMPERATURE__DELTA_TZ, oldDeltaT_Z, DELTA_TZ_EDEFAULT, oldDeltaT_ZESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDeltaT_Z() {
		return deltaT_ZESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeltaT_ZAsString() {
		return deltaT_ZAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeltaT_ZAsString(String newDeltaT_ZAsString) {
		String oldDeltaT_ZAsString = deltaT_ZAsString;
		deltaT_ZAsString = newDeltaT_ZAsString;
		boolean oldDeltaT_ZAsStringESet = deltaT_ZAsStringESet;
		deltaT_ZAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_TEMPERATURE__DELTA_TZAS_STRING, oldDeltaT_ZAsString, deltaT_ZAsString, !oldDeltaT_ZAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDeltaT_ZAsString() {
		String oldDeltaT_ZAsString = deltaT_ZAsString;
		boolean oldDeltaT_ZAsStringESet = deltaT_ZAsStringESet;
		deltaT_ZAsString = DELTA_TZAS_STRING_EDEFAULT;
		deltaT_ZAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_TEMPERATURE__DELTA_TZAS_STRING, oldDeltaT_ZAsString, DELTA_TZAS_STRING_EDEFAULT, oldDeltaT_ZAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDeltaT_ZAsString() {
		return deltaT_ZAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_TEMPERATURE__DELTA_TCONSTANT:
				return getDeltaT_Constant();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_TEMPERATURE__DELTA_TCONSTANT_AS_STRING:
				return getDeltaT_ConstantAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_TEMPERATURE__DELTA_TY:
				return getDeltaT_Y();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_TEMPERATURE__DELTA_TYAS_STRING:
				return getDeltaT_YAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_TEMPERATURE__DELTA_TZ:
				return getDeltaT_Z();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_TEMPERATURE__DELTA_TZAS_STRING:
				return getDeltaT_ZAsString();
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_TEMPERATURE__DELTA_TCONSTANT:
				setDeltaT_Constant((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_TEMPERATURE__DELTA_TCONSTANT_AS_STRING:
				setDeltaT_ConstantAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_TEMPERATURE__DELTA_TY:
				setDeltaT_Y((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_TEMPERATURE__DELTA_TYAS_STRING:
				setDeltaT_YAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_TEMPERATURE__DELTA_TZ:
				setDeltaT_Z((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_TEMPERATURE__DELTA_TZAS_STRING:
				setDeltaT_ZAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_TEMPERATURE__DELTA_TCONSTANT:
				unsetDeltaT_Constant();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_TEMPERATURE__DELTA_TCONSTANT_AS_STRING:
				unsetDeltaT_ConstantAsString();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_TEMPERATURE__DELTA_TY:
				unsetDeltaT_Y();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_TEMPERATURE__DELTA_TYAS_STRING:
				unsetDeltaT_YAsString();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_TEMPERATURE__DELTA_TZ:
				unsetDeltaT_Z();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_TEMPERATURE__DELTA_TZAS_STRING:
				unsetDeltaT_ZAsString();
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_TEMPERATURE__DELTA_TCONSTANT:
				return isSetDeltaT_Constant();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_TEMPERATURE__DELTA_TCONSTANT_AS_STRING:
				return isSetDeltaT_ConstantAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_TEMPERATURE__DELTA_TY:
				return isSetDeltaT_Y();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_TEMPERATURE__DELTA_TYAS_STRING:
				return isSetDeltaT_YAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_TEMPERATURE__DELTA_TZ:
				return isSetDeltaT_Z();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_TEMPERATURE__DELTA_TZAS_STRING:
				return isSetDeltaT_ZAsString();
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
		result.append(" (DeltaT_Constant: ");
		if (deltaT_ConstantESet) result.append(deltaT_Constant); else result.append("<unset>");
		result.append(", DeltaT_ConstantAsString: ");
		if (deltaT_ConstantAsStringESet) result.append(deltaT_ConstantAsString); else result.append("<unset>");
		result.append(", DeltaT_Y: ");
		if (deltaT_YESet) result.append(deltaT_Y); else result.append("<unset>");
		result.append(", DeltaT_YAsString: ");
		if (deltaT_YAsStringESet) result.append(deltaT_YAsString); else result.append("<unset>");
		result.append(", DeltaT_Z: ");
		if (deltaT_ZESet) result.append(deltaT_Z); else result.append("<unset>");
		result.append(", DeltaT_ZAsString: ");
		if (deltaT_ZAsStringESet) result.append(deltaT_ZAsString); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcStructuralLoadTemperatureImpl
