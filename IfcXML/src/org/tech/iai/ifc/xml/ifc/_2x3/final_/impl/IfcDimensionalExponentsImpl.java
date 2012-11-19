/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.EntityImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDimensionalExponents;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Dimensional Exponents</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDimensionalExponentsImpl#getLengthExponent <em>Length Exponent</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDimensionalExponentsImpl#getMassExponent <em>Mass Exponent</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDimensionalExponentsImpl#getTimeExponent <em>Time Exponent</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDimensionalExponentsImpl#getElectricCurrentExponent <em>Electric Current Exponent</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDimensionalExponentsImpl#getThermodynamicTemperatureExponent <em>Thermodynamic Temperature Exponent</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDimensionalExponentsImpl#getAmountOfSubstanceExponent <em>Amount Of Substance Exponent</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDimensionalExponentsImpl#getLuminousIntensityExponent <em>Luminous Intensity Exponent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcDimensionalExponentsImpl extends EntityImpl implements IfcDimensionalExponents {
	/**
	 * The default value of the '{@link #getLengthExponent() <em>Length Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLengthExponent()
	 * @generated
	 * @ordered
	 */
	protected static final long LENGTH_EXPONENT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getLengthExponent() <em>Length Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLengthExponent()
	 * @generated
	 * @ordered
	 */
	protected long lengthExponent = LENGTH_EXPONENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMassExponent() <em>Mass Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMassExponent()
	 * @generated
	 * @ordered
	 */
	protected static final long MASS_EXPONENT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMassExponent() <em>Mass Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMassExponent()
	 * @generated
	 * @ordered
	 */
	protected long massExponent = MASS_EXPONENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeExponent() <em>Time Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeExponent()
	 * @generated
	 * @ordered
	 */
	protected static final long TIME_EXPONENT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTimeExponent() <em>Time Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeExponent()
	 * @generated
	 * @ordered
	 */
	protected long timeExponent = TIME_EXPONENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getElectricCurrentExponent() <em>Electric Current Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElectricCurrentExponent()
	 * @generated
	 * @ordered
	 */
	protected static final long ELECTRIC_CURRENT_EXPONENT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getElectricCurrentExponent() <em>Electric Current Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElectricCurrentExponent()
	 * @generated
	 * @ordered
	 */
	protected long electricCurrentExponent = ELECTRIC_CURRENT_EXPONENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getThermodynamicTemperatureExponent() <em>Thermodynamic Temperature Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermodynamicTemperatureExponent()
	 * @generated
	 * @ordered
	 */
	protected static final long THERMODYNAMIC_TEMPERATURE_EXPONENT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getThermodynamicTemperatureExponent() <em>Thermodynamic Temperature Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermodynamicTemperatureExponent()
	 * @generated
	 * @ordered
	 */
	protected long thermodynamicTemperatureExponent = THERMODYNAMIC_TEMPERATURE_EXPONENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmountOfSubstanceExponent() <em>Amount Of Substance Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountOfSubstanceExponent()
	 * @generated
	 * @ordered
	 */
	protected static final long AMOUNT_OF_SUBSTANCE_EXPONENT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getAmountOfSubstanceExponent() <em>Amount Of Substance Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountOfSubstanceExponent()
	 * @generated
	 * @ordered
	 */
	protected long amountOfSubstanceExponent = AMOUNT_OF_SUBSTANCE_EXPONENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLuminousIntensityExponent() <em>Luminous Intensity Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLuminousIntensityExponent()
	 * @generated
	 * @ordered
	 */
	protected static final long LUMINOUS_INTENSITY_EXPONENT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getLuminousIntensityExponent() <em>Luminous Intensity Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLuminousIntensityExponent()
	 * @generated
	 * @ordered
	 */
	protected long luminousIntensityExponent = LUMINOUS_INTENSITY_EXPONENT_EDEFAULT;

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
		return FinalPackage.eINSTANCE.getIfcDimensionalExponents();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getLengthExponent() {
		return lengthExponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLengthExponent(long newLengthExponent) {
		long oldLengthExponent = lengthExponent;
		lengthExponent = newLengthExponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DIMENSIONAL_EXPONENTS__LENGTH_EXPONENT, oldLengthExponent, lengthExponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMassExponent() {
		return massExponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMassExponent(long newMassExponent) {
		long oldMassExponent = massExponent;
		massExponent = newMassExponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DIMENSIONAL_EXPONENTS__MASS_EXPONENT, oldMassExponent, massExponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTimeExponent() {
		return timeExponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeExponent(long newTimeExponent) {
		long oldTimeExponent = timeExponent;
		timeExponent = newTimeExponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DIMENSIONAL_EXPONENTS__TIME_EXPONENT, oldTimeExponent, timeExponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getElectricCurrentExponent() {
		return electricCurrentExponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElectricCurrentExponent(long newElectricCurrentExponent) {
		long oldElectricCurrentExponent = electricCurrentExponent;
		electricCurrentExponent = newElectricCurrentExponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DIMENSIONAL_EXPONENTS__ELECTRIC_CURRENT_EXPONENT, oldElectricCurrentExponent, electricCurrentExponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getThermodynamicTemperatureExponent() {
		return thermodynamicTemperatureExponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThermodynamicTemperatureExponent(long newThermodynamicTemperatureExponent) {
		long oldThermodynamicTemperatureExponent = thermodynamicTemperatureExponent;
		thermodynamicTemperatureExponent = newThermodynamicTemperatureExponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DIMENSIONAL_EXPONENTS__THERMODYNAMIC_TEMPERATURE_EXPONENT, oldThermodynamicTemperatureExponent, thermodynamicTemperatureExponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getAmountOfSubstanceExponent() {
		return amountOfSubstanceExponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmountOfSubstanceExponent(long newAmountOfSubstanceExponent) {
		long oldAmountOfSubstanceExponent = amountOfSubstanceExponent;
		amountOfSubstanceExponent = newAmountOfSubstanceExponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DIMENSIONAL_EXPONENTS__AMOUNT_OF_SUBSTANCE_EXPONENT, oldAmountOfSubstanceExponent, amountOfSubstanceExponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getLuminousIntensityExponent() {
		return luminousIntensityExponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLuminousIntensityExponent(long newLuminousIntensityExponent) {
		long oldLuminousIntensityExponent = luminousIntensityExponent;
		luminousIntensityExponent = newLuminousIntensityExponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DIMENSIONAL_EXPONENTS__LUMINOUS_INTENSITY_EXPONENT, oldLuminousIntensityExponent, luminousIntensityExponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalPackage.IFC_DIMENSIONAL_EXPONENTS__LENGTH_EXPONENT:
				return getLengthExponent();
			case FinalPackage.IFC_DIMENSIONAL_EXPONENTS__MASS_EXPONENT:
				return getMassExponent();
			case FinalPackage.IFC_DIMENSIONAL_EXPONENTS__TIME_EXPONENT:
				return getTimeExponent();
			case FinalPackage.IFC_DIMENSIONAL_EXPONENTS__ELECTRIC_CURRENT_EXPONENT:
				return getElectricCurrentExponent();
			case FinalPackage.IFC_DIMENSIONAL_EXPONENTS__THERMODYNAMIC_TEMPERATURE_EXPONENT:
				return getThermodynamicTemperatureExponent();
			case FinalPackage.IFC_DIMENSIONAL_EXPONENTS__AMOUNT_OF_SUBSTANCE_EXPONENT:
				return getAmountOfSubstanceExponent();
			case FinalPackage.IFC_DIMENSIONAL_EXPONENTS__LUMINOUS_INTENSITY_EXPONENT:
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
			case FinalPackage.IFC_DIMENSIONAL_EXPONENTS__LENGTH_EXPONENT:
				setLengthExponent((Long)newValue);
				return;
			case FinalPackage.IFC_DIMENSIONAL_EXPONENTS__MASS_EXPONENT:
				setMassExponent((Long)newValue);
				return;
			case FinalPackage.IFC_DIMENSIONAL_EXPONENTS__TIME_EXPONENT:
				setTimeExponent((Long)newValue);
				return;
			case FinalPackage.IFC_DIMENSIONAL_EXPONENTS__ELECTRIC_CURRENT_EXPONENT:
				setElectricCurrentExponent((Long)newValue);
				return;
			case FinalPackage.IFC_DIMENSIONAL_EXPONENTS__THERMODYNAMIC_TEMPERATURE_EXPONENT:
				setThermodynamicTemperatureExponent((Long)newValue);
				return;
			case FinalPackage.IFC_DIMENSIONAL_EXPONENTS__AMOUNT_OF_SUBSTANCE_EXPONENT:
				setAmountOfSubstanceExponent((Long)newValue);
				return;
			case FinalPackage.IFC_DIMENSIONAL_EXPONENTS__LUMINOUS_INTENSITY_EXPONENT:
				setLuminousIntensityExponent((Long)newValue);
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
			case FinalPackage.IFC_DIMENSIONAL_EXPONENTS__LENGTH_EXPONENT:
				setLengthExponent(LENGTH_EXPONENT_EDEFAULT);
				return;
			case FinalPackage.IFC_DIMENSIONAL_EXPONENTS__MASS_EXPONENT:
				setMassExponent(MASS_EXPONENT_EDEFAULT);
				return;
			case FinalPackage.IFC_DIMENSIONAL_EXPONENTS__TIME_EXPONENT:
				setTimeExponent(TIME_EXPONENT_EDEFAULT);
				return;
			case FinalPackage.IFC_DIMENSIONAL_EXPONENTS__ELECTRIC_CURRENT_EXPONENT:
				setElectricCurrentExponent(ELECTRIC_CURRENT_EXPONENT_EDEFAULT);
				return;
			case FinalPackage.IFC_DIMENSIONAL_EXPONENTS__THERMODYNAMIC_TEMPERATURE_EXPONENT:
				setThermodynamicTemperatureExponent(THERMODYNAMIC_TEMPERATURE_EXPONENT_EDEFAULT);
				return;
			case FinalPackage.IFC_DIMENSIONAL_EXPONENTS__AMOUNT_OF_SUBSTANCE_EXPONENT:
				setAmountOfSubstanceExponent(AMOUNT_OF_SUBSTANCE_EXPONENT_EDEFAULT);
				return;
			case FinalPackage.IFC_DIMENSIONAL_EXPONENTS__LUMINOUS_INTENSITY_EXPONENT:
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
			case FinalPackage.IFC_DIMENSIONAL_EXPONENTS__LENGTH_EXPONENT:
				return lengthExponent != LENGTH_EXPONENT_EDEFAULT;
			case FinalPackage.IFC_DIMENSIONAL_EXPONENTS__MASS_EXPONENT:
				return massExponent != MASS_EXPONENT_EDEFAULT;
			case FinalPackage.IFC_DIMENSIONAL_EXPONENTS__TIME_EXPONENT:
				return timeExponent != TIME_EXPONENT_EDEFAULT;
			case FinalPackage.IFC_DIMENSIONAL_EXPONENTS__ELECTRIC_CURRENT_EXPONENT:
				return electricCurrentExponent != ELECTRIC_CURRENT_EXPONENT_EDEFAULT;
			case FinalPackage.IFC_DIMENSIONAL_EXPONENTS__THERMODYNAMIC_TEMPERATURE_EXPONENT:
				return thermodynamicTemperatureExponent != THERMODYNAMIC_TEMPERATURE_EXPONENT_EDEFAULT;
			case FinalPackage.IFC_DIMENSIONAL_EXPONENTS__AMOUNT_OF_SUBSTANCE_EXPONENT:
				return amountOfSubstanceExponent != AMOUNT_OF_SUBSTANCE_EXPONENT_EDEFAULT;
			case FinalPackage.IFC_DIMENSIONAL_EXPONENTS__LUMINOUS_INTENSITY_EXPONENT:
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
		result.append(" (lengthExponent: ");
		result.append(lengthExponent);
		result.append(", massExponent: ");
		result.append(massExponent);
		result.append(", timeExponent: ");
		result.append(timeExponent);
		result.append(", electricCurrentExponent: ");
		result.append(electricCurrentExponent);
		result.append(", thermodynamicTemperatureExponent: ");
		result.append(thermodynamicTemperatureExponent);
		result.append(", amountOfSubstanceExponent: ");
		result.append(amountOfSubstanceExponent);
		result.append(", luminousIntensityExponent: ");
		result.append(luminousIntensityExponent);
		result.append(')');
		return result.toString();
	}

} //IfcDimensionalExponentsImpl
