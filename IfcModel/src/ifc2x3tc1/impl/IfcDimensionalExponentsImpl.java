/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcDimensionalExponents;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Dimensional Exponents</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcDimensionalExponentsImpl#getLengthExponent <em>Length Exponent</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcDimensionalExponentsImpl#getMassExponent <em>Mass Exponent</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcDimensionalExponentsImpl#getTimeExponent <em>Time Exponent</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcDimensionalExponentsImpl#getElectricCurrentExponent <em>Electric Current Exponent</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcDimensionalExponentsImpl#getThermodynamicTemperatureExponent <em>Thermodynamic Temperature Exponent</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcDimensionalExponentsImpl#getAmountOfSubstanceExponent <em>Amount Of Substance Exponent</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcDimensionalExponentsImpl#getLuminousIntensityExponent <em>Luminous Intensity Exponent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcDimensionalExponentsImpl extends EObjectImpl implements IfcDimensionalExponents {
	/**
	 * The default value of the '{@link #getLengthExponent() <em>Length Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLengthExponent()
	 * @generated
	 * @ordered
	 */
	protected static final int LENGTH_EXPONENT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLengthExponent() <em>Length Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLengthExponent()
	 * @generated
	 * @ordered
	 */
	protected int lengthExponent = LENGTH_EXPONENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMassExponent() <em>Mass Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMassExponent()
	 * @generated
	 * @ordered
	 */
	protected static final int MASS_EXPONENT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMassExponent() <em>Mass Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMassExponent()
	 * @generated
	 * @ordered
	 */
	protected int massExponent = MASS_EXPONENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeExponent() <em>Time Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeExponent()
	 * @generated
	 * @ordered
	 */
	protected static final int TIME_EXPONENT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTimeExponent() <em>Time Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeExponent()
	 * @generated
	 * @ordered
	 */
	protected int timeExponent = TIME_EXPONENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getElectricCurrentExponent() <em>Electric Current Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElectricCurrentExponent()
	 * @generated
	 * @ordered
	 */
	protected static final int ELECTRIC_CURRENT_EXPONENT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getElectricCurrentExponent() <em>Electric Current Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElectricCurrentExponent()
	 * @generated
	 * @ordered
	 */
	protected int electricCurrentExponent = ELECTRIC_CURRENT_EXPONENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getThermodynamicTemperatureExponent() <em>Thermodynamic Temperature Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermodynamicTemperatureExponent()
	 * @generated
	 * @ordered
	 */
	protected static final int THERMODYNAMIC_TEMPERATURE_EXPONENT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getThermodynamicTemperatureExponent() <em>Thermodynamic Temperature Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermodynamicTemperatureExponent()
	 * @generated
	 * @ordered
	 */
	protected int thermodynamicTemperatureExponent = THERMODYNAMIC_TEMPERATURE_EXPONENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmountOfSubstanceExponent() <em>Amount Of Substance Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountOfSubstanceExponent()
	 * @generated
	 * @ordered
	 */
	protected static final int AMOUNT_OF_SUBSTANCE_EXPONENT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAmountOfSubstanceExponent() <em>Amount Of Substance Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountOfSubstanceExponent()
	 * @generated
	 * @ordered
	 */
	protected int amountOfSubstanceExponent = AMOUNT_OF_SUBSTANCE_EXPONENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLuminousIntensityExponent() <em>Luminous Intensity Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLuminousIntensityExponent()
	 * @generated
	 * @ordered
	 */
	protected static final int LUMINOUS_INTENSITY_EXPONENT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLuminousIntensityExponent() <em>Luminous Intensity Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLuminousIntensityExponent()
	 * @generated
	 * @ordered
	 */
	protected int luminousIntensityExponent = LUMINOUS_INTENSITY_EXPONENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcDimensionalExponentsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcDimensionalExponents();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLengthExponent() {
		return lengthExponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLengthExponent(int newLengthExponent) {
		int oldLengthExponent = lengthExponent;
		lengthExponent = newLengthExponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DIMENSIONAL_EXPONENTS__LENGTH_EXPONENT, oldLengthExponent, lengthExponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMassExponent() {
		return massExponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMassExponent(int newMassExponent) {
		int oldMassExponent = massExponent;
		massExponent = newMassExponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DIMENSIONAL_EXPONENTS__MASS_EXPONENT, oldMassExponent, massExponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTimeExponent() {
		return timeExponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeExponent(int newTimeExponent) {
		int oldTimeExponent = timeExponent;
		timeExponent = newTimeExponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DIMENSIONAL_EXPONENTS__TIME_EXPONENT, oldTimeExponent, timeExponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getElectricCurrentExponent() {
		return electricCurrentExponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElectricCurrentExponent(int newElectricCurrentExponent) {
		int oldElectricCurrentExponent = electricCurrentExponent;
		electricCurrentExponent = newElectricCurrentExponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DIMENSIONAL_EXPONENTS__ELECTRIC_CURRENT_EXPONENT, oldElectricCurrentExponent, electricCurrentExponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getThermodynamicTemperatureExponent() {
		return thermodynamicTemperatureExponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThermodynamicTemperatureExponent(int newThermodynamicTemperatureExponent) {
		int oldThermodynamicTemperatureExponent = thermodynamicTemperatureExponent;
		thermodynamicTemperatureExponent = newThermodynamicTemperatureExponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DIMENSIONAL_EXPONENTS__THERMODYNAMIC_TEMPERATURE_EXPONENT, oldThermodynamicTemperatureExponent, thermodynamicTemperatureExponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAmountOfSubstanceExponent() {
		return amountOfSubstanceExponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmountOfSubstanceExponent(int newAmountOfSubstanceExponent) {
		int oldAmountOfSubstanceExponent = amountOfSubstanceExponent;
		amountOfSubstanceExponent = newAmountOfSubstanceExponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DIMENSIONAL_EXPONENTS__AMOUNT_OF_SUBSTANCE_EXPONENT, oldAmountOfSubstanceExponent, amountOfSubstanceExponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLuminousIntensityExponent() {
		return luminousIntensityExponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLuminousIntensityExponent(int newLuminousIntensityExponent) {
		int oldLuminousIntensityExponent = luminousIntensityExponent;
		luminousIntensityExponent = newLuminousIntensityExponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DIMENSIONAL_EXPONENTS__LUMINOUS_INTENSITY_EXPONENT, oldLuminousIntensityExponent, luminousIntensityExponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_DIMENSIONAL_EXPONENTS__LENGTH_EXPONENT:
				return getLengthExponent();
			case Ifc2x3tc1Package.IFC_DIMENSIONAL_EXPONENTS__MASS_EXPONENT:
				return getMassExponent();
			case Ifc2x3tc1Package.IFC_DIMENSIONAL_EXPONENTS__TIME_EXPONENT:
				return getTimeExponent();
			case Ifc2x3tc1Package.IFC_DIMENSIONAL_EXPONENTS__ELECTRIC_CURRENT_EXPONENT:
				return getElectricCurrentExponent();
			case Ifc2x3tc1Package.IFC_DIMENSIONAL_EXPONENTS__THERMODYNAMIC_TEMPERATURE_EXPONENT:
				return getThermodynamicTemperatureExponent();
			case Ifc2x3tc1Package.IFC_DIMENSIONAL_EXPONENTS__AMOUNT_OF_SUBSTANCE_EXPONENT:
				return getAmountOfSubstanceExponent();
			case Ifc2x3tc1Package.IFC_DIMENSIONAL_EXPONENTS__LUMINOUS_INTENSITY_EXPONENT:
				return getLuminousIntensityExponent();
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
			case Ifc2x3tc1Package.IFC_DIMENSIONAL_EXPONENTS__LENGTH_EXPONENT:
				setLengthExponent((Integer)newValue);
				return;
			case Ifc2x3tc1Package.IFC_DIMENSIONAL_EXPONENTS__MASS_EXPONENT:
				setMassExponent((Integer)newValue);
				return;
			case Ifc2x3tc1Package.IFC_DIMENSIONAL_EXPONENTS__TIME_EXPONENT:
				setTimeExponent((Integer)newValue);
				return;
			case Ifc2x3tc1Package.IFC_DIMENSIONAL_EXPONENTS__ELECTRIC_CURRENT_EXPONENT:
				setElectricCurrentExponent((Integer)newValue);
				return;
			case Ifc2x3tc1Package.IFC_DIMENSIONAL_EXPONENTS__THERMODYNAMIC_TEMPERATURE_EXPONENT:
				setThermodynamicTemperatureExponent((Integer)newValue);
				return;
			case Ifc2x3tc1Package.IFC_DIMENSIONAL_EXPONENTS__AMOUNT_OF_SUBSTANCE_EXPONENT:
				setAmountOfSubstanceExponent((Integer)newValue);
				return;
			case Ifc2x3tc1Package.IFC_DIMENSIONAL_EXPONENTS__LUMINOUS_INTENSITY_EXPONENT:
				setLuminousIntensityExponent((Integer)newValue);
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
			case Ifc2x3tc1Package.IFC_DIMENSIONAL_EXPONENTS__LENGTH_EXPONENT:
				setLengthExponent(LENGTH_EXPONENT_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_DIMENSIONAL_EXPONENTS__MASS_EXPONENT:
				setMassExponent(MASS_EXPONENT_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_DIMENSIONAL_EXPONENTS__TIME_EXPONENT:
				setTimeExponent(TIME_EXPONENT_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_DIMENSIONAL_EXPONENTS__ELECTRIC_CURRENT_EXPONENT:
				setElectricCurrentExponent(ELECTRIC_CURRENT_EXPONENT_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_DIMENSIONAL_EXPONENTS__THERMODYNAMIC_TEMPERATURE_EXPONENT:
				setThermodynamicTemperatureExponent(THERMODYNAMIC_TEMPERATURE_EXPONENT_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_DIMENSIONAL_EXPONENTS__AMOUNT_OF_SUBSTANCE_EXPONENT:
				setAmountOfSubstanceExponent(AMOUNT_OF_SUBSTANCE_EXPONENT_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_DIMENSIONAL_EXPONENTS__LUMINOUS_INTENSITY_EXPONENT:
				setLuminousIntensityExponent(LUMINOUS_INTENSITY_EXPONENT_EDEFAULT);
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
			case Ifc2x3tc1Package.IFC_DIMENSIONAL_EXPONENTS__LENGTH_EXPONENT:
				return lengthExponent != LENGTH_EXPONENT_EDEFAULT;
			case Ifc2x3tc1Package.IFC_DIMENSIONAL_EXPONENTS__MASS_EXPONENT:
				return massExponent != MASS_EXPONENT_EDEFAULT;
			case Ifc2x3tc1Package.IFC_DIMENSIONAL_EXPONENTS__TIME_EXPONENT:
				return timeExponent != TIME_EXPONENT_EDEFAULT;
			case Ifc2x3tc1Package.IFC_DIMENSIONAL_EXPONENTS__ELECTRIC_CURRENT_EXPONENT:
				return electricCurrentExponent != ELECTRIC_CURRENT_EXPONENT_EDEFAULT;
			case Ifc2x3tc1Package.IFC_DIMENSIONAL_EXPONENTS__THERMODYNAMIC_TEMPERATURE_EXPONENT:
				return thermodynamicTemperatureExponent != THERMODYNAMIC_TEMPERATURE_EXPONENT_EDEFAULT;
			case Ifc2x3tc1Package.IFC_DIMENSIONAL_EXPONENTS__AMOUNT_OF_SUBSTANCE_EXPONENT:
				return amountOfSubstanceExponent != AMOUNT_OF_SUBSTANCE_EXPONENT_EDEFAULT;
			case Ifc2x3tc1Package.IFC_DIMENSIONAL_EXPONENTS__LUMINOUS_INTENSITY_EXPONENT:
				return luminousIntensityExponent != LUMINOUS_INTENSITY_EXPONENT_EDEFAULT;
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
		result.append(" (LengthExponent: ");
		result.append(lengthExponent);
		result.append(", MassExponent: ");
		result.append(massExponent);
		result.append(", TimeExponent: ");
		result.append(timeExponent);
		result.append(", ElectricCurrentExponent: ");
		result.append(electricCurrentExponent);
		result.append(", ThermodynamicTemperatureExponent: ");
		result.append(thermodynamicTemperatureExponent);
		result.append(", AmountOfSubstanceExponent: ");
		result.append(amountOfSubstanceExponent);
		result.append(", LuminousIntensityExponent: ");
		result.append(luminousIntensityExponent);
		result.append(')');
		return result.toString();
	}

} //IfcDimensionalExponentsImpl
