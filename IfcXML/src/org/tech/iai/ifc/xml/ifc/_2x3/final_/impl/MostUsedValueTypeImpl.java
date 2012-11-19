/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAmountOfSubstanceMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAreaMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcComplexNumberType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcContextDependentMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCountMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDescriptiveMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcElectricCurrentMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLengthMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLuminousIntensityMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMassMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcNormalisedRatioMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcNumericMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcParameterValueType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPlaneAngleMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPositiveLengthMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPositivePlaneAngleMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPositiveRatioMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRatioMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSolidAngleMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcThermodynamicTemperatureMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTimeMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcVolumeMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.MostUsedValueType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Most Used Value Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.MostUsedValueTypeImpl#getIfcVolumeMeasure <em>Ifc Volume Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.MostUsedValueTypeImpl#getIfcTimeMeasure <em>Ifc Time Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.MostUsedValueTypeImpl#getIfcThermodynamicTemperatureMeasure <em>Ifc Thermodynamic Temperature Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.MostUsedValueTypeImpl#getIfcSolidAngleMeasure <em>Ifc Solid Angle Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.MostUsedValueTypeImpl#getIfcPositiveRatioMeasure <em>Ifc Positive Ratio Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.MostUsedValueTypeImpl#getIfcRatioMeasure <em>Ifc Ratio Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.MostUsedValueTypeImpl#getIfcPositivePlaneAngleMeasure <em>Ifc Positive Plane Angle Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.MostUsedValueTypeImpl#getIfcPlaneAngleMeasure <em>Ifc Plane Angle Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.MostUsedValueTypeImpl#getIfcParameterValue <em>Ifc Parameter Value</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.MostUsedValueTypeImpl#getIfcNumericMeasure <em>Ifc Numeric Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.MostUsedValueTypeImpl#getIfcMassMeasure <em>Ifc Mass Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.MostUsedValueTypeImpl#getIfcPositiveLengthMeasure <em>Ifc Positive Length Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.MostUsedValueTypeImpl#getIfcLengthMeasure <em>Ifc Length Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.MostUsedValueTypeImpl#getIfcElectricCurrentMeasure <em>Ifc Electric Current Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.MostUsedValueTypeImpl#getIfcDescriptiveMeasure <em>Ifc Descriptive Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.MostUsedValueTypeImpl#getIfcCountMeasure <em>Ifc Count Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.MostUsedValueTypeImpl#getIfcContextDependentMeasure <em>Ifc Context Dependent Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.MostUsedValueTypeImpl#getIfcAreaMeasure <em>Ifc Area Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.MostUsedValueTypeImpl#getIfcAmountOfSubstanceMeasure <em>Ifc Amount Of Substance Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.MostUsedValueTypeImpl#getIfcLuminousIntensityMeasure <em>Ifc Luminous Intensity Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.MostUsedValueTypeImpl#getIfcNormalisedRatioMeasure <em>Ifc Normalised Ratio Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.MostUsedValueTypeImpl#getIfcComplexNumber <em>Ifc Complex Number</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MostUsedValueTypeImpl extends EObjectImpl implements MostUsedValueType {
	/**
	 * The cached value of the '{@link #getIfcVolumeMeasure() <em>Ifc Volume Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcVolumeMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcVolumeMeasureType ifcVolumeMeasure;

	/**
	 * The cached value of the '{@link #getIfcTimeMeasure() <em>Ifc Time Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcTimeMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcTimeMeasureType ifcTimeMeasure;

	/**
	 * The cached value of the '{@link #getIfcThermodynamicTemperatureMeasure() <em>Ifc Thermodynamic Temperature Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcThermodynamicTemperatureMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcThermodynamicTemperatureMeasureType ifcThermodynamicTemperatureMeasure;

	/**
	 * The cached value of the '{@link #getIfcSolidAngleMeasure() <em>Ifc Solid Angle Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcSolidAngleMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcSolidAngleMeasureType ifcSolidAngleMeasure;

	/**
	 * The cached value of the '{@link #getIfcPositiveRatioMeasure() <em>Ifc Positive Ratio Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcPositiveRatioMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcPositiveRatioMeasureType ifcPositiveRatioMeasure;

	/**
	 * The cached value of the '{@link #getIfcRatioMeasure() <em>Ifc Ratio Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcRatioMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcRatioMeasureType ifcRatioMeasure;

	/**
	 * The cached value of the '{@link #getIfcPositivePlaneAngleMeasure() <em>Ifc Positive Plane Angle Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcPositivePlaneAngleMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcPositivePlaneAngleMeasureType ifcPositivePlaneAngleMeasure;

	/**
	 * The cached value of the '{@link #getIfcPlaneAngleMeasure() <em>Ifc Plane Angle Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcPlaneAngleMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcPlaneAngleMeasureType ifcPlaneAngleMeasure;

	/**
	 * The cached value of the '{@link #getIfcParameterValue() <em>Ifc Parameter Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcParameterValue()
	 * @generated
	 * @ordered
	 */
	protected IfcParameterValueType ifcParameterValue;

	/**
	 * The cached value of the '{@link #getIfcNumericMeasure() <em>Ifc Numeric Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcNumericMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcNumericMeasureType ifcNumericMeasure;

	/**
	 * The cached value of the '{@link #getIfcMassMeasure() <em>Ifc Mass Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcMassMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcMassMeasureType ifcMassMeasure;

	/**
	 * The cached value of the '{@link #getIfcPositiveLengthMeasure() <em>Ifc Positive Length Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcPositiveLengthMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcPositiveLengthMeasureType ifcPositiveLengthMeasure;

	/**
	 * The cached value of the '{@link #getIfcLengthMeasure() <em>Ifc Length Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcLengthMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcLengthMeasureType ifcLengthMeasure;

	/**
	 * The cached value of the '{@link #getIfcElectricCurrentMeasure() <em>Ifc Electric Current Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcElectricCurrentMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcElectricCurrentMeasureType ifcElectricCurrentMeasure;

	/**
	 * The cached value of the '{@link #getIfcDescriptiveMeasure() <em>Ifc Descriptive Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcDescriptiveMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcDescriptiveMeasureType ifcDescriptiveMeasure;

	/**
	 * The cached value of the '{@link #getIfcCountMeasure() <em>Ifc Count Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcCountMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcCountMeasureType ifcCountMeasure;

	/**
	 * The cached value of the '{@link #getIfcContextDependentMeasure() <em>Ifc Context Dependent Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcContextDependentMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcContextDependentMeasureType ifcContextDependentMeasure;

	/**
	 * The cached value of the '{@link #getIfcAreaMeasure() <em>Ifc Area Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcAreaMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcAreaMeasureType ifcAreaMeasure;

	/**
	 * The cached value of the '{@link #getIfcAmountOfSubstanceMeasure() <em>Ifc Amount Of Substance Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcAmountOfSubstanceMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcAmountOfSubstanceMeasureType ifcAmountOfSubstanceMeasure;

	/**
	 * The cached value of the '{@link #getIfcLuminousIntensityMeasure() <em>Ifc Luminous Intensity Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcLuminousIntensityMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcLuminousIntensityMeasureType ifcLuminousIntensityMeasure;

	/**
	 * The cached value of the '{@link #getIfcNormalisedRatioMeasure() <em>Ifc Normalised Ratio Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcNormalisedRatioMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcNormalisedRatioMeasureType ifcNormalisedRatioMeasure;

	/**
	 * The cached value of the '{@link #getIfcComplexNumber() <em>Ifc Complex Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcComplexNumber()
	 * @generated
	 * @ordered
	 */
	protected IfcComplexNumberType ifcComplexNumber;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MostUsedValueTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getMostUsedValueType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcVolumeMeasureType getIfcVolumeMeasure() {
		return ifcVolumeMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcVolumeMeasure(IfcVolumeMeasureType newIfcVolumeMeasure, NotificationChain msgs) {
		IfcVolumeMeasureType oldIfcVolumeMeasure = ifcVolumeMeasure;
		ifcVolumeMeasure = newIfcVolumeMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.MOST_USED_VALUE_TYPE__IFC_VOLUME_MEASURE, oldIfcVolumeMeasure, newIfcVolumeMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcVolumeMeasure(IfcVolumeMeasureType newIfcVolumeMeasure) {
		if (newIfcVolumeMeasure != ifcVolumeMeasure) {
			NotificationChain msgs = null;
			if (ifcVolumeMeasure != null)
				msgs = ((InternalEObject)ifcVolumeMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.MOST_USED_VALUE_TYPE__IFC_VOLUME_MEASURE, null, msgs);
			if (newIfcVolumeMeasure != null)
				msgs = ((InternalEObject)newIfcVolumeMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.MOST_USED_VALUE_TYPE__IFC_VOLUME_MEASURE, null, msgs);
			msgs = basicSetIfcVolumeMeasure(newIfcVolumeMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.MOST_USED_VALUE_TYPE__IFC_VOLUME_MEASURE, newIfcVolumeMeasure, newIfcVolumeMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTimeMeasureType getIfcTimeMeasure() {
		return ifcTimeMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcTimeMeasure(IfcTimeMeasureType newIfcTimeMeasure, NotificationChain msgs) {
		IfcTimeMeasureType oldIfcTimeMeasure = ifcTimeMeasure;
		ifcTimeMeasure = newIfcTimeMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.MOST_USED_VALUE_TYPE__IFC_TIME_MEASURE, oldIfcTimeMeasure, newIfcTimeMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcTimeMeasure(IfcTimeMeasureType newIfcTimeMeasure) {
		if (newIfcTimeMeasure != ifcTimeMeasure) {
			NotificationChain msgs = null;
			if (ifcTimeMeasure != null)
				msgs = ((InternalEObject)ifcTimeMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.MOST_USED_VALUE_TYPE__IFC_TIME_MEASURE, null, msgs);
			if (newIfcTimeMeasure != null)
				msgs = ((InternalEObject)newIfcTimeMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.MOST_USED_VALUE_TYPE__IFC_TIME_MEASURE, null, msgs);
			msgs = basicSetIfcTimeMeasure(newIfcTimeMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.MOST_USED_VALUE_TYPE__IFC_TIME_MEASURE, newIfcTimeMeasure, newIfcTimeMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcThermodynamicTemperatureMeasureType getIfcThermodynamicTemperatureMeasure() {
		return ifcThermodynamicTemperatureMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcThermodynamicTemperatureMeasure(IfcThermodynamicTemperatureMeasureType newIfcThermodynamicTemperatureMeasure, NotificationChain msgs) {
		IfcThermodynamicTemperatureMeasureType oldIfcThermodynamicTemperatureMeasure = ifcThermodynamicTemperatureMeasure;
		ifcThermodynamicTemperatureMeasure = newIfcThermodynamicTemperatureMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.MOST_USED_VALUE_TYPE__IFC_THERMODYNAMIC_TEMPERATURE_MEASURE, oldIfcThermodynamicTemperatureMeasure, newIfcThermodynamicTemperatureMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcThermodynamicTemperatureMeasure(IfcThermodynamicTemperatureMeasureType newIfcThermodynamicTemperatureMeasure) {
		if (newIfcThermodynamicTemperatureMeasure != ifcThermodynamicTemperatureMeasure) {
			NotificationChain msgs = null;
			if (ifcThermodynamicTemperatureMeasure != null)
				msgs = ((InternalEObject)ifcThermodynamicTemperatureMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.MOST_USED_VALUE_TYPE__IFC_THERMODYNAMIC_TEMPERATURE_MEASURE, null, msgs);
			if (newIfcThermodynamicTemperatureMeasure != null)
				msgs = ((InternalEObject)newIfcThermodynamicTemperatureMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.MOST_USED_VALUE_TYPE__IFC_THERMODYNAMIC_TEMPERATURE_MEASURE, null, msgs);
			msgs = basicSetIfcThermodynamicTemperatureMeasure(newIfcThermodynamicTemperatureMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.MOST_USED_VALUE_TYPE__IFC_THERMODYNAMIC_TEMPERATURE_MEASURE, newIfcThermodynamicTemperatureMeasure, newIfcThermodynamicTemperatureMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSolidAngleMeasureType getIfcSolidAngleMeasure() {
		return ifcSolidAngleMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcSolidAngleMeasure(IfcSolidAngleMeasureType newIfcSolidAngleMeasure, NotificationChain msgs) {
		IfcSolidAngleMeasureType oldIfcSolidAngleMeasure = ifcSolidAngleMeasure;
		ifcSolidAngleMeasure = newIfcSolidAngleMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.MOST_USED_VALUE_TYPE__IFC_SOLID_ANGLE_MEASURE, oldIfcSolidAngleMeasure, newIfcSolidAngleMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcSolidAngleMeasure(IfcSolidAngleMeasureType newIfcSolidAngleMeasure) {
		if (newIfcSolidAngleMeasure != ifcSolidAngleMeasure) {
			NotificationChain msgs = null;
			if (ifcSolidAngleMeasure != null)
				msgs = ((InternalEObject)ifcSolidAngleMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.MOST_USED_VALUE_TYPE__IFC_SOLID_ANGLE_MEASURE, null, msgs);
			if (newIfcSolidAngleMeasure != null)
				msgs = ((InternalEObject)newIfcSolidAngleMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.MOST_USED_VALUE_TYPE__IFC_SOLID_ANGLE_MEASURE, null, msgs);
			msgs = basicSetIfcSolidAngleMeasure(newIfcSolidAngleMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.MOST_USED_VALUE_TYPE__IFC_SOLID_ANGLE_MEASURE, newIfcSolidAngleMeasure, newIfcSolidAngleMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPositiveRatioMeasureType getIfcPositiveRatioMeasure() {
		return ifcPositiveRatioMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcPositiveRatioMeasure(IfcPositiveRatioMeasureType newIfcPositiveRatioMeasure, NotificationChain msgs) {
		IfcPositiveRatioMeasureType oldIfcPositiveRatioMeasure = ifcPositiveRatioMeasure;
		ifcPositiveRatioMeasure = newIfcPositiveRatioMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.MOST_USED_VALUE_TYPE__IFC_POSITIVE_RATIO_MEASURE, oldIfcPositiveRatioMeasure, newIfcPositiveRatioMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcPositiveRatioMeasure(IfcPositiveRatioMeasureType newIfcPositiveRatioMeasure) {
		if (newIfcPositiveRatioMeasure != ifcPositiveRatioMeasure) {
			NotificationChain msgs = null;
			if (ifcPositiveRatioMeasure != null)
				msgs = ((InternalEObject)ifcPositiveRatioMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.MOST_USED_VALUE_TYPE__IFC_POSITIVE_RATIO_MEASURE, null, msgs);
			if (newIfcPositiveRatioMeasure != null)
				msgs = ((InternalEObject)newIfcPositiveRatioMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.MOST_USED_VALUE_TYPE__IFC_POSITIVE_RATIO_MEASURE, null, msgs);
			msgs = basicSetIfcPositiveRatioMeasure(newIfcPositiveRatioMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.MOST_USED_VALUE_TYPE__IFC_POSITIVE_RATIO_MEASURE, newIfcPositiveRatioMeasure, newIfcPositiveRatioMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRatioMeasureType getIfcRatioMeasure() {
		return ifcRatioMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcRatioMeasure(IfcRatioMeasureType newIfcRatioMeasure, NotificationChain msgs) {
		IfcRatioMeasureType oldIfcRatioMeasure = ifcRatioMeasure;
		ifcRatioMeasure = newIfcRatioMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.MOST_USED_VALUE_TYPE__IFC_RATIO_MEASURE, oldIfcRatioMeasure, newIfcRatioMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcRatioMeasure(IfcRatioMeasureType newIfcRatioMeasure) {
		if (newIfcRatioMeasure != ifcRatioMeasure) {
			NotificationChain msgs = null;
			if (ifcRatioMeasure != null)
				msgs = ((InternalEObject)ifcRatioMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.MOST_USED_VALUE_TYPE__IFC_RATIO_MEASURE, null, msgs);
			if (newIfcRatioMeasure != null)
				msgs = ((InternalEObject)newIfcRatioMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.MOST_USED_VALUE_TYPE__IFC_RATIO_MEASURE, null, msgs);
			msgs = basicSetIfcRatioMeasure(newIfcRatioMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.MOST_USED_VALUE_TYPE__IFC_RATIO_MEASURE, newIfcRatioMeasure, newIfcRatioMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPositivePlaneAngleMeasureType getIfcPositivePlaneAngleMeasure() {
		return ifcPositivePlaneAngleMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcPositivePlaneAngleMeasure(IfcPositivePlaneAngleMeasureType newIfcPositivePlaneAngleMeasure, NotificationChain msgs) {
		IfcPositivePlaneAngleMeasureType oldIfcPositivePlaneAngleMeasure = ifcPositivePlaneAngleMeasure;
		ifcPositivePlaneAngleMeasure = newIfcPositivePlaneAngleMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.MOST_USED_VALUE_TYPE__IFC_POSITIVE_PLANE_ANGLE_MEASURE, oldIfcPositivePlaneAngleMeasure, newIfcPositivePlaneAngleMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcPositivePlaneAngleMeasure(IfcPositivePlaneAngleMeasureType newIfcPositivePlaneAngleMeasure) {
		if (newIfcPositivePlaneAngleMeasure != ifcPositivePlaneAngleMeasure) {
			NotificationChain msgs = null;
			if (ifcPositivePlaneAngleMeasure != null)
				msgs = ((InternalEObject)ifcPositivePlaneAngleMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.MOST_USED_VALUE_TYPE__IFC_POSITIVE_PLANE_ANGLE_MEASURE, null, msgs);
			if (newIfcPositivePlaneAngleMeasure != null)
				msgs = ((InternalEObject)newIfcPositivePlaneAngleMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.MOST_USED_VALUE_TYPE__IFC_POSITIVE_PLANE_ANGLE_MEASURE, null, msgs);
			msgs = basicSetIfcPositivePlaneAngleMeasure(newIfcPositivePlaneAngleMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.MOST_USED_VALUE_TYPE__IFC_POSITIVE_PLANE_ANGLE_MEASURE, newIfcPositivePlaneAngleMeasure, newIfcPositivePlaneAngleMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPlaneAngleMeasureType getIfcPlaneAngleMeasure() {
		return ifcPlaneAngleMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcPlaneAngleMeasure(IfcPlaneAngleMeasureType newIfcPlaneAngleMeasure, NotificationChain msgs) {
		IfcPlaneAngleMeasureType oldIfcPlaneAngleMeasure = ifcPlaneAngleMeasure;
		ifcPlaneAngleMeasure = newIfcPlaneAngleMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.MOST_USED_VALUE_TYPE__IFC_PLANE_ANGLE_MEASURE, oldIfcPlaneAngleMeasure, newIfcPlaneAngleMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcPlaneAngleMeasure(IfcPlaneAngleMeasureType newIfcPlaneAngleMeasure) {
		if (newIfcPlaneAngleMeasure != ifcPlaneAngleMeasure) {
			NotificationChain msgs = null;
			if (ifcPlaneAngleMeasure != null)
				msgs = ((InternalEObject)ifcPlaneAngleMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.MOST_USED_VALUE_TYPE__IFC_PLANE_ANGLE_MEASURE, null, msgs);
			if (newIfcPlaneAngleMeasure != null)
				msgs = ((InternalEObject)newIfcPlaneAngleMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.MOST_USED_VALUE_TYPE__IFC_PLANE_ANGLE_MEASURE, null, msgs);
			msgs = basicSetIfcPlaneAngleMeasure(newIfcPlaneAngleMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.MOST_USED_VALUE_TYPE__IFC_PLANE_ANGLE_MEASURE, newIfcPlaneAngleMeasure, newIfcPlaneAngleMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcParameterValueType getIfcParameterValue() {
		return ifcParameterValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcParameterValue(IfcParameterValueType newIfcParameterValue, NotificationChain msgs) {
		IfcParameterValueType oldIfcParameterValue = ifcParameterValue;
		ifcParameterValue = newIfcParameterValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.MOST_USED_VALUE_TYPE__IFC_PARAMETER_VALUE, oldIfcParameterValue, newIfcParameterValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcParameterValue(IfcParameterValueType newIfcParameterValue) {
		if (newIfcParameterValue != ifcParameterValue) {
			NotificationChain msgs = null;
			if (ifcParameterValue != null)
				msgs = ((InternalEObject)ifcParameterValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.MOST_USED_VALUE_TYPE__IFC_PARAMETER_VALUE, null, msgs);
			if (newIfcParameterValue != null)
				msgs = ((InternalEObject)newIfcParameterValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.MOST_USED_VALUE_TYPE__IFC_PARAMETER_VALUE, null, msgs);
			msgs = basicSetIfcParameterValue(newIfcParameterValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.MOST_USED_VALUE_TYPE__IFC_PARAMETER_VALUE, newIfcParameterValue, newIfcParameterValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcNumericMeasureType getIfcNumericMeasure() {
		return ifcNumericMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcNumericMeasure(IfcNumericMeasureType newIfcNumericMeasure, NotificationChain msgs) {
		IfcNumericMeasureType oldIfcNumericMeasure = ifcNumericMeasure;
		ifcNumericMeasure = newIfcNumericMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.MOST_USED_VALUE_TYPE__IFC_NUMERIC_MEASURE, oldIfcNumericMeasure, newIfcNumericMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcNumericMeasure(IfcNumericMeasureType newIfcNumericMeasure) {
		if (newIfcNumericMeasure != ifcNumericMeasure) {
			NotificationChain msgs = null;
			if (ifcNumericMeasure != null)
				msgs = ((InternalEObject)ifcNumericMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.MOST_USED_VALUE_TYPE__IFC_NUMERIC_MEASURE, null, msgs);
			if (newIfcNumericMeasure != null)
				msgs = ((InternalEObject)newIfcNumericMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.MOST_USED_VALUE_TYPE__IFC_NUMERIC_MEASURE, null, msgs);
			msgs = basicSetIfcNumericMeasure(newIfcNumericMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.MOST_USED_VALUE_TYPE__IFC_NUMERIC_MEASURE, newIfcNumericMeasure, newIfcNumericMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMassMeasureType getIfcMassMeasure() {
		return ifcMassMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcMassMeasure(IfcMassMeasureType newIfcMassMeasure, NotificationChain msgs) {
		IfcMassMeasureType oldIfcMassMeasure = ifcMassMeasure;
		ifcMassMeasure = newIfcMassMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.MOST_USED_VALUE_TYPE__IFC_MASS_MEASURE, oldIfcMassMeasure, newIfcMassMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcMassMeasure(IfcMassMeasureType newIfcMassMeasure) {
		if (newIfcMassMeasure != ifcMassMeasure) {
			NotificationChain msgs = null;
			if (ifcMassMeasure != null)
				msgs = ((InternalEObject)ifcMassMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.MOST_USED_VALUE_TYPE__IFC_MASS_MEASURE, null, msgs);
			if (newIfcMassMeasure != null)
				msgs = ((InternalEObject)newIfcMassMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.MOST_USED_VALUE_TYPE__IFC_MASS_MEASURE, null, msgs);
			msgs = basicSetIfcMassMeasure(newIfcMassMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.MOST_USED_VALUE_TYPE__IFC_MASS_MEASURE, newIfcMassMeasure, newIfcMassMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPositiveLengthMeasureType getIfcPositiveLengthMeasure() {
		return ifcPositiveLengthMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcPositiveLengthMeasure(IfcPositiveLengthMeasureType newIfcPositiveLengthMeasure, NotificationChain msgs) {
		IfcPositiveLengthMeasureType oldIfcPositiveLengthMeasure = ifcPositiveLengthMeasure;
		ifcPositiveLengthMeasure = newIfcPositiveLengthMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.MOST_USED_VALUE_TYPE__IFC_POSITIVE_LENGTH_MEASURE, oldIfcPositiveLengthMeasure, newIfcPositiveLengthMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcPositiveLengthMeasure(IfcPositiveLengthMeasureType newIfcPositiveLengthMeasure) {
		if (newIfcPositiveLengthMeasure != ifcPositiveLengthMeasure) {
			NotificationChain msgs = null;
			if (ifcPositiveLengthMeasure != null)
				msgs = ((InternalEObject)ifcPositiveLengthMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.MOST_USED_VALUE_TYPE__IFC_POSITIVE_LENGTH_MEASURE, null, msgs);
			if (newIfcPositiveLengthMeasure != null)
				msgs = ((InternalEObject)newIfcPositiveLengthMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.MOST_USED_VALUE_TYPE__IFC_POSITIVE_LENGTH_MEASURE, null, msgs);
			msgs = basicSetIfcPositiveLengthMeasure(newIfcPositiveLengthMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.MOST_USED_VALUE_TYPE__IFC_POSITIVE_LENGTH_MEASURE, newIfcPositiveLengthMeasure, newIfcPositiveLengthMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLengthMeasureType getIfcLengthMeasure() {
		return ifcLengthMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcLengthMeasure(IfcLengthMeasureType newIfcLengthMeasure, NotificationChain msgs) {
		IfcLengthMeasureType oldIfcLengthMeasure = ifcLengthMeasure;
		ifcLengthMeasure = newIfcLengthMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.MOST_USED_VALUE_TYPE__IFC_LENGTH_MEASURE, oldIfcLengthMeasure, newIfcLengthMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcLengthMeasure(IfcLengthMeasureType newIfcLengthMeasure) {
		if (newIfcLengthMeasure != ifcLengthMeasure) {
			NotificationChain msgs = null;
			if (ifcLengthMeasure != null)
				msgs = ((InternalEObject)ifcLengthMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.MOST_USED_VALUE_TYPE__IFC_LENGTH_MEASURE, null, msgs);
			if (newIfcLengthMeasure != null)
				msgs = ((InternalEObject)newIfcLengthMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.MOST_USED_VALUE_TYPE__IFC_LENGTH_MEASURE, null, msgs);
			msgs = basicSetIfcLengthMeasure(newIfcLengthMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.MOST_USED_VALUE_TYPE__IFC_LENGTH_MEASURE, newIfcLengthMeasure, newIfcLengthMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElectricCurrentMeasureType getIfcElectricCurrentMeasure() {
		return ifcElectricCurrentMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcElectricCurrentMeasure(IfcElectricCurrentMeasureType newIfcElectricCurrentMeasure, NotificationChain msgs) {
		IfcElectricCurrentMeasureType oldIfcElectricCurrentMeasure = ifcElectricCurrentMeasure;
		ifcElectricCurrentMeasure = newIfcElectricCurrentMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.MOST_USED_VALUE_TYPE__IFC_ELECTRIC_CURRENT_MEASURE, oldIfcElectricCurrentMeasure, newIfcElectricCurrentMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcElectricCurrentMeasure(IfcElectricCurrentMeasureType newIfcElectricCurrentMeasure) {
		if (newIfcElectricCurrentMeasure != ifcElectricCurrentMeasure) {
			NotificationChain msgs = null;
			if (ifcElectricCurrentMeasure != null)
				msgs = ((InternalEObject)ifcElectricCurrentMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.MOST_USED_VALUE_TYPE__IFC_ELECTRIC_CURRENT_MEASURE, null, msgs);
			if (newIfcElectricCurrentMeasure != null)
				msgs = ((InternalEObject)newIfcElectricCurrentMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.MOST_USED_VALUE_TYPE__IFC_ELECTRIC_CURRENT_MEASURE, null, msgs);
			msgs = basicSetIfcElectricCurrentMeasure(newIfcElectricCurrentMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.MOST_USED_VALUE_TYPE__IFC_ELECTRIC_CURRENT_MEASURE, newIfcElectricCurrentMeasure, newIfcElectricCurrentMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDescriptiveMeasureType getIfcDescriptiveMeasure() {
		return ifcDescriptiveMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcDescriptiveMeasure(IfcDescriptiveMeasureType newIfcDescriptiveMeasure, NotificationChain msgs) {
		IfcDescriptiveMeasureType oldIfcDescriptiveMeasure = ifcDescriptiveMeasure;
		ifcDescriptiveMeasure = newIfcDescriptiveMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.MOST_USED_VALUE_TYPE__IFC_DESCRIPTIVE_MEASURE, oldIfcDescriptiveMeasure, newIfcDescriptiveMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcDescriptiveMeasure(IfcDescriptiveMeasureType newIfcDescriptiveMeasure) {
		if (newIfcDescriptiveMeasure != ifcDescriptiveMeasure) {
			NotificationChain msgs = null;
			if (ifcDescriptiveMeasure != null)
				msgs = ((InternalEObject)ifcDescriptiveMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.MOST_USED_VALUE_TYPE__IFC_DESCRIPTIVE_MEASURE, null, msgs);
			if (newIfcDescriptiveMeasure != null)
				msgs = ((InternalEObject)newIfcDescriptiveMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.MOST_USED_VALUE_TYPE__IFC_DESCRIPTIVE_MEASURE, null, msgs);
			msgs = basicSetIfcDescriptiveMeasure(newIfcDescriptiveMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.MOST_USED_VALUE_TYPE__IFC_DESCRIPTIVE_MEASURE, newIfcDescriptiveMeasure, newIfcDescriptiveMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCountMeasureType getIfcCountMeasure() {
		return ifcCountMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcCountMeasure(IfcCountMeasureType newIfcCountMeasure, NotificationChain msgs) {
		IfcCountMeasureType oldIfcCountMeasure = ifcCountMeasure;
		ifcCountMeasure = newIfcCountMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.MOST_USED_VALUE_TYPE__IFC_COUNT_MEASURE, oldIfcCountMeasure, newIfcCountMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcCountMeasure(IfcCountMeasureType newIfcCountMeasure) {
		if (newIfcCountMeasure != ifcCountMeasure) {
			NotificationChain msgs = null;
			if (ifcCountMeasure != null)
				msgs = ((InternalEObject)ifcCountMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.MOST_USED_VALUE_TYPE__IFC_COUNT_MEASURE, null, msgs);
			if (newIfcCountMeasure != null)
				msgs = ((InternalEObject)newIfcCountMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.MOST_USED_VALUE_TYPE__IFC_COUNT_MEASURE, null, msgs);
			msgs = basicSetIfcCountMeasure(newIfcCountMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.MOST_USED_VALUE_TYPE__IFC_COUNT_MEASURE, newIfcCountMeasure, newIfcCountMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcContextDependentMeasureType getIfcContextDependentMeasure() {
		return ifcContextDependentMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcContextDependentMeasure(IfcContextDependentMeasureType newIfcContextDependentMeasure, NotificationChain msgs) {
		IfcContextDependentMeasureType oldIfcContextDependentMeasure = ifcContextDependentMeasure;
		ifcContextDependentMeasure = newIfcContextDependentMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.MOST_USED_VALUE_TYPE__IFC_CONTEXT_DEPENDENT_MEASURE, oldIfcContextDependentMeasure, newIfcContextDependentMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcContextDependentMeasure(IfcContextDependentMeasureType newIfcContextDependentMeasure) {
		if (newIfcContextDependentMeasure != ifcContextDependentMeasure) {
			NotificationChain msgs = null;
			if (ifcContextDependentMeasure != null)
				msgs = ((InternalEObject)ifcContextDependentMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.MOST_USED_VALUE_TYPE__IFC_CONTEXT_DEPENDENT_MEASURE, null, msgs);
			if (newIfcContextDependentMeasure != null)
				msgs = ((InternalEObject)newIfcContextDependentMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.MOST_USED_VALUE_TYPE__IFC_CONTEXT_DEPENDENT_MEASURE, null, msgs);
			msgs = basicSetIfcContextDependentMeasure(newIfcContextDependentMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.MOST_USED_VALUE_TYPE__IFC_CONTEXT_DEPENDENT_MEASURE, newIfcContextDependentMeasure, newIfcContextDependentMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAreaMeasureType getIfcAreaMeasure() {
		return ifcAreaMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcAreaMeasure(IfcAreaMeasureType newIfcAreaMeasure, NotificationChain msgs) {
		IfcAreaMeasureType oldIfcAreaMeasure = ifcAreaMeasure;
		ifcAreaMeasure = newIfcAreaMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.MOST_USED_VALUE_TYPE__IFC_AREA_MEASURE, oldIfcAreaMeasure, newIfcAreaMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcAreaMeasure(IfcAreaMeasureType newIfcAreaMeasure) {
		if (newIfcAreaMeasure != ifcAreaMeasure) {
			NotificationChain msgs = null;
			if (ifcAreaMeasure != null)
				msgs = ((InternalEObject)ifcAreaMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.MOST_USED_VALUE_TYPE__IFC_AREA_MEASURE, null, msgs);
			if (newIfcAreaMeasure != null)
				msgs = ((InternalEObject)newIfcAreaMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.MOST_USED_VALUE_TYPE__IFC_AREA_MEASURE, null, msgs);
			msgs = basicSetIfcAreaMeasure(newIfcAreaMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.MOST_USED_VALUE_TYPE__IFC_AREA_MEASURE, newIfcAreaMeasure, newIfcAreaMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAmountOfSubstanceMeasureType getIfcAmountOfSubstanceMeasure() {
		return ifcAmountOfSubstanceMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcAmountOfSubstanceMeasure(IfcAmountOfSubstanceMeasureType newIfcAmountOfSubstanceMeasure, NotificationChain msgs) {
		IfcAmountOfSubstanceMeasureType oldIfcAmountOfSubstanceMeasure = ifcAmountOfSubstanceMeasure;
		ifcAmountOfSubstanceMeasure = newIfcAmountOfSubstanceMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.MOST_USED_VALUE_TYPE__IFC_AMOUNT_OF_SUBSTANCE_MEASURE, oldIfcAmountOfSubstanceMeasure, newIfcAmountOfSubstanceMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcAmountOfSubstanceMeasure(IfcAmountOfSubstanceMeasureType newIfcAmountOfSubstanceMeasure) {
		if (newIfcAmountOfSubstanceMeasure != ifcAmountOfSubstanceMeasure) {
			NotificationChain msgs = null;
			if (ifcAmountOfSubstanceMeasure != null)
				msgs = ((InternalEObject)ifcAmountOfSubstanceMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.MOST_USED_VALUE_TYPE__IFC_AMOUNT_OF_SUBSTANCE_MEASURE, null, msgs);
			if (newIfcAmountOfSubstanceMeasure != null)
				msgs = ((InternalEObject)newIfcAmountOfSubstanceMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.MOST_USED_VALUE_TYPE__IFC_AMOUNT_OF_SUBSTANCE_MEASURE, null, msgs);
			msgs = basicSetIfcAmountOfSubstanceMeasure(newIfcAmountOfSubstanceMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.MOST_USED_VALUE_TYPE__IFC_AMOUNT_OF_SUBSTANCE_MEASURE, newIfcAmountOfSubstanceMeasure, newIfcAmountOfSubstanceMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLuminousIntensityMeasureType getIfcLuminousIntensityMeasure() {
		return ifcLuminousIntensityMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcLuminousIntensityMeasure(IfcLuminousIntensityMeasureType newIfcLuminousIntensityMeasure, NotificationChain msgs) {
		IfcLuminousIntensityMeasureType oldIfcLuminousIntensityMeasure = ifcLuminousIntensityMeasure;
		ifcLuminousIntensityMeasure = newIfcLuminousIntensityMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.MOST_USED_VALUE_TYPE__IFC_LUMINOUS_INTENSITY_MEASURE, oldIfcLuminousIntensityMeasure, newIfcLuminousIntensityMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcLuminousIntensityMeasure(IfcLuminousIntensityMeasureType newIfcLuminousIntensityMeasure) {
		if (newIfcLuminousIntensityMeasure != ifcLuminousIntensityMeasure) {
			NotificationChain msgs = null;
			if (ifcLuminousIntensityMeasure != null)
				msgs = ((InternalEObject)ifcLuminousIntensityMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.MOST_USED_VALUE_TYPE__IFC_LUMINOUS_INTENSITY_MEASURE, null, msgs);
			if (newIfcLuminousIntensityMeasure != null)
				msgs = ((InternalEObject)newIfcLuminousIntensityMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.MOST_USED_VALUE_TYPE__IFC_LUMINOUS_INTENSITY_MEASURE, null, msgs);
			msgs = basicSetIfcLuminousIntensityMeasure(newIfcLuminousIntensityMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.MOST_USED_VALUE_TYPE__IFC_LUMINOUS_INTENSITY_MEASURE, newIfcLuminousIntensityMeasure, newIfcLuminousIntensityMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcNormalisedRatioMeasureType getIfcNormalisedRatioMeasure() {
		return ifcNormalisedRatioMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcNormalisedRatioMeasure(IfcNormalisedRatioMeasureType newIfcNormalisedRatioMeasure, NotificationChain msgs) {
		IfcNormalisedRatioMeasureType oldIfcNormalisedRatioMeasure = ifcNormalisedRatioMeasure;
		ifcNormalisedRatioMeasure = newIfcNormalisedRatioMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.MOST_USED_VALUE_TYPE__IFC_NORMALISED_RATIO_MEASURE, oldIfcNormalisedRatioMeasure, newIfcNormalisedRatioMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcNormalisedRatioMeasure(IfcNormalisedRatioMeasureType newIfcNormalisedRatioMeasure) {
		if (newIfcNormalisedRatioMeasure != ifcNormalisedRatioMeasure) {
			NotificationChain msgs = null;
			if (ifcNormalisedRatioMeasure != null)
				msgs = ((InternalEObject)ifcNormalisedRatioMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.MOST_USED_VALUE_TYPE__IFC_NORMALISED_RATIO_MEASURE, null, msgs);
			if (newIfcNormalisedRatioMeasure != null)
				msgs = ((InternalEObject)newIfcNormalisedRatioMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.MOST_USED_VALUE_TYPE__IFC_NORMALISED_RATIO_MEASURE, null, msgs);
			msgs = basicSetIfcNormalisedRatioMeasure(newIfcNormalisedRatioMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.MOST_USED_VALUE_TYPE__IFC_NORMALISED_RATIO_MEASURE, newIfcNormalisedRatioMeasure, newIfcNormalisedRatioMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcComplexNumberType getIfcComplexNumber() {
		return ifcComplexNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcComplexNumber(IfcComplexNumberType newIfcComplexNumber, NotificationChain msgs) {
		IfcComplexNumberType oldIfcComplexNumber = ifcComplexNumber;
		ifcComplexNumber = newIfcComplexNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.MOST_USED_VALUE_TYPE__IFC_COMPLEX_NUMBER, oldIfcComplexNumber, newIfcComplexNumber);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcComplexNumber(IfcComplexNumberType newIfcComplexNumber) {
		if (newIfcComplexNumber != ifcComplexNumber) {
			NotificationChain msgs = null;
			if (ifcComplexNumber != null)
				msgs = ((InternalEObject)ifcComplexNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.MOST_USED_VALUE_TYPE__IFC_COMPLEX_NUMBER, null, msgs);
			if (newIfcComplexNumber != null)
				msgs = ((InternalEObject)newIfcComplexNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.MOST_USED_VALUE_TYPE__IFC_COMPLEX_NUMBER, null, msgs);
			msgs = basicSetIfcComplexNumber(newIfcComplexNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.MOST_USED_VALUE_TYPE__IFC_COMPLEX_NUMBER, newIfcComplexNumber, newIfcComplexNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_VOLUME_MEASURE:
				return basicSetIfcVolumeMeasure(null, msgs);
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_TIME_MEASURE:
				return basicSetIfcTimeMeasure(null, msgs);
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_THERMODYNAMIC_TEMPERATURE_MEASURE:
				return basicSetIfcThermodynamicTemperatureMeasure(null, msgs);
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_SOLID_ANGLE_MEASURE:
				return basicSetIfcSolidAngleMeasure(null, msgs);
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_POSITIVE_RATIO_MEASURE:
				return basicSetIfcPositiveRatioMeasure(null, msgs);
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_RATIO_MEASURE:
				return basicSetIfcRatioMeasure(null, msgs);
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_POSITIVE_PLANE_ANGLE_MEASURE:
				return basicSetIfcPositivePlaneAngleMeasure(null, msgs);
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_PLANE_ANGLE_MEASURE:
				return basicSetIfcPlaneAngleMeasure(null, msgs);
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_PARAMETER_VALUE:
				return basicSetIfcParameterValue(null, msgs);
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_NUMERIC_MEASURE:
				return basicSetIfcNumericMeasure(null, msgs);
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_MASS_MEASURE:
				return basicSetIfcMassMeasure(null, msgs);
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_POSITIVE_LENGTH_MEASURE:
				return basicSetIfcPositiveLengthMeasure(null, msgs);
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_LENGTH_MEASURE:
				return basicSetIfcLengthMeasure(null, msgs);
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_ELECTRIC_CURRENT_MEASURE:
				return basicSetIfcElectricCurrentMeasure(null, msgs);
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_DESCRIPTIVE_MEASURE:
				return basicSetIfcDescriptiveMeasure(null, msgs);
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_COUNT_MEASURE:
				return basicSetIfcCountMeasure(null, msgs);
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_CONTEXT_DEPENDENT_MEASURE:
				return basicSetIfcContextDependentMeasure(null, msgs);
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_AREA_MEASURE:
				return basicSetIfcAreaMeasure(null, msgs);
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_AMOUNT_OF_SUBSTANCE_MEASURE:
				return basicSetIfcAmountOfSubstanceMeasure(null, msgs);
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_LUMINOUS_INTENSITY_MEASURE:
				return basicSetIfcLuminousIntensityMeasure(null, msgs);
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_NORMALISED_RATIO_MEASURE:
				return basicSetIfcNormalisedRatioMeasure(null, msgs);
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_COMPLEX_NUMBER:
				return basicSetIfcComplexNumber(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_VOLUME_MEASURE:
				return getIfcVolumeMeasure();
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_TIME_MEASURE:
				return getIfcTimeMeasure();
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_THERMODYNAMIC_TEMPERATURE_MEASURE:
				return getIfcThermodynamicTemperatureMeasure();
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_SOLID_ANGLE_MEASURE:
				return getIfcSolidAngleMeasure();
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_POSITIVE_RATIO_MEASURE:
				return getIfcPositiveRatioMeasure();
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_RATIO_MEASURE:
				return getIfcRatioMeasure();
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_POSITIVE_PLANE_ANGLE_MEASURE:
				return getIfcPositivePlaneAngleMeasure();
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_PLANE_ANGLE_MEASURE:
				return getIfcPlaneAngleMeasure();
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_PARAMETER_VALUE:
				return getIfcParameterValue();
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_NUMERIC_MEASURE:
				return getIfcNumericMeasure();
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_MASS_MEASURE:
				return getIfcMassMeasure();
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_POSITIVE_LENGTH_MEASURE:
				return getIfcPositiveLengthMeasure();
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_LENGTH_MEASURE:
				return getIfcLengthMeasure();
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_ELECTRIC_CURRENT_MEASURE:
				return getIfcElectricCurrentMeasure();
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_DESCRIPTIVE_MEASURE:
				return getIfcDescriptiveMeasure();
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_COUNT_MEASURE:
				return getIfcCountMeasure();
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_CONTEXT_DEPENDENT_MEASURE:
				return getIfcContextDependentMeasure();
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_AREA_MEASURE:
				return getIfcAreaMeasure();
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_AMOUNT_OF_SUBSTANCE_MEASURE:
				return getIfcAmountOfSubstanceMeasure();
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_LUMINOUS_INTENSITY_MEASURE:
				return getIfcLuminousIntensityMeasure();
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_NORMALISED_RATIO_MEASURE:
				return getIfcNormalisedRatioMeasure();
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_COMPLEX_NUMBER:
				return getIfcComplexNumber();
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
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_VOLUME_MEASURE:
				setIfcVolumeMeasure((IfcVolumeMeasureType)newValue);
				return;
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_TIME_MEASURE:
				setIfcTimeMeasure((IfcTimeMeasureType)newValue);
				return;
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_THERMODYNAMIC_TEMPERATURE_MEASURE:
				setIfcThermodynamicTemperatureMeasure((IfcThermodynamicTemperatureMeasureType)newValue);
				return;
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_SOLID_ANGLE_MEASURE:
				setIfcSolidAngleMeasure((IfcSolidAngleMeasureType)newValue);
				return;
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_POSITIVE_RATIO_MEASURE:
				setIfcPositiveRatioMeasure((IfcPositiveRatioMeasureType)newValue);
				return;
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_RATIO_MEASURE:
				setIfcRatioMeasure((IfcRatioMeasureType)newValue);
				return;
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_POSITIVE_PLANE_ANGLE_MEASURE:
				setIfcPositivePlaneAngleMeasure((IfcPositivePlaneAngleMeasureType)newValue);
				return;
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_PLANE_ANGLE_MEASURE:
				setIfcPlaneAngleMeasure((IfcPlaneAngleMeasureType)newValue);
				return;
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_PARAMETER_VALUE:
				setIfcParameterValue((IfcParameterValueType)newValue);
				return;
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_NUMERIC_MEASURE:
				setIfcNumericMeasure((IfcNumericMeasureType)newValue);
				return;
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_MASS_MEASURE:
				setIfcMassMeasure((IfcMassMeasureType)newValue);
				return;
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_POSITIVE_LENGTH_MEASURE:
				setIfcPositiveLengthMeasure((IfcPositiveLengthMeasureType)newValue);
				return;
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_LENGTH_MEASURE:
				setIfcLengthMeasure((IfcLengthMeasureType)newValue);
				return;
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_ELECTRIC_CURRENT_MEASURE:
				setIfcElectricCurrentMeasure((IfcElectricCurrentMeasureType)newValue);
				return;
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_DESCRIPTIVE_MEASURE:
				setIfcDescriptiveMeasure((IfcDescriptiveMeasureType)newValue);
				return;
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_COUNT_MEASURE:
				setIfcCountMeasure((IfcCountMeasureType)newValue);
				return;
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_CONTEXT_DEPENDENT_MEASURE:
				setIfcContextDependentMeasure((IfcContextDependentMeasureType)newValue);
				return;
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_AREA_MEASURE:
				setIfcAreaMeasure((IfcAreaMeasureType)newValue);
				return;
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_AMOUNT_OF_SUBSTANCE_MEASURE:
				setIfcAmountOfSubstanceMeasure((IfcAmountOfSubstanceMeasureType)newValue);
				return;
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_LUMINOUS_INTENSITY_MEASURE:
				setIfcLuminousIntensityMeasure((IfcLuminousIntensityMeasureType)newValue);
				return;
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_NORMALISED_RATIO_MEASURE:
				setIfcNormalisedRatioMeasure((IfcNormalisedRatioMeasureType)newValue);
				return;
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_COMPLEX_NUMBER:
				setIfcComplexNumber((IfcComplexNumberType)newValue);
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
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_VOLUME_MEASURE:
				setIfcVolumeMeasure((IfcVolumeMeasureType)null);
				return;
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_TIME_MEASURE:
				setIfcTimeMeasure((IfcTimeMeasureType)null);
				return;
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_THERMODYNAMIC_TEMPERATURE_MEASURE:
				setIfcThermodynamicTemperatureMeasure((IfcThermodynamicTemperatureMeasureType)null);
				return;
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_SOLID_ANGLE_MEASURE:
				setIfcSolidAngleMeasure((IfcSolidAngleMeasureType)null);
				return;
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_POSITIVE_RATIO_MEASURE:
				setIfcPositiveRatioMeasure((IfcPositiveRatioMeasureType)null);
				return;
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_RATIO_MEASURE:
				setIfcRatioMeasure((IfcRatioMeasureType)null);
				return;
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_POSITIVE_PLANE_ANGLE_MEASURE:
				setIfcPositivePlaneAngleMeasure((IfcPositivePlaneAngleMeasureType)null);
				return;
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_PLANE_ANGLE_MEASURE:
				setIfcPlaneAngleMeasure((IfcPlaneAngleMeasureType)null);
				return;
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_PARAMETER_VALUE:
				setIfcParameterValue((IfcParameterValueType)null);
				return;
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_NUMERIC_MEASURE:
				setIfcNumericMeasure((IfcNumericMeasureType)null);
				return;
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_MASS_MEASURE:
				setIfcMassMeasure((IfcMassMeasureType)null);
				return;
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_POSITIVE_LENGTH_MEASURE:
				setIfcPositiveLengthMeasure((IfcPositiveLengthMeasureType)null);
				return;
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_LENGTH_MEASURE:
				setIfcLengthMeasure((IfcLengthMeasureType)null);
				return;
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_ELECTRIC_CURRENT_MEASURE:
				setIfcElectricCurrentMeasure((IfcElectricCurrentMeasureType)null);
				return;
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_DESCRIPTIVE_MEASURE:
				setIfcDescriptiveMeasure((IfcDescriptiveMeasureType)null);
				return;
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_COUNT_MEASURE:
				setIfcCountMeasure((IfcCountMeasureType)null);
				return;
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_CONTEXT_DEPENDENT_MEASURE:
				setIfcContextDependentMeasure((IfcContextDependentMeasureType)null);
				return;
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_AREA_MEASURE:
				setIfcAreaMeasure((IfcAreaMeasureType)null);
				return;
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_AMOUNT_OF_SUBSTANCE_MEASURE:
				setIfcAmountOfSubstanceMeasure((IfcAmountOfSubstanceMeasureType)null);
				return;
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_LUMINOUS_INTENSITY_MEASURE:
				setIfcLuminousIntensityMeasure((IfcLuminousIntensityMeasureType)null);
				return;
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_NORMALISED_RATIO_MEASURE:
				setIfcNormalisedRatioMeasure((IfcNormalisedRatioMeasureType)null);
				return;
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_COMPLEX_NUMBER:
				setIfcComplexNumber((IfcComplexNumberType)null);
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
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_VOLUME_MEASURE:
				return ifcVolumeMeasure != null;
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_TIME_MEASURE:
				return ifcTimeMeasure != null;
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_THERMODYNAMIC_TEMPERATURE_MEASURE:
				return ifcThermodynamicTemperatureMeasure != null;
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_SOLID_ANGLE_MEASURE:
				return ifcSolidAngleMeasure != null;
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_POSITIVE_RATIO_MEASURE:
				return ifcPositiveRatioMeasure != null;
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_RATIO_MEASURE:
				return ifcRatioMeasure != null;
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_POSITIVE_PLANE_ANGLE_MEASURE:
				return ifcPositivePlaneAngleMeasure != null;
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_PLANE_ANGLE_MEASURE:
				return ifcPlaneAngleMeasure != null;
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_PARAMETER_VALUE:
				return ifcParameterValue != null;
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_NUMERIC_MEASURE:
				return ifcNumericMeasure != null;
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_MASS_MEASURE:
				return ifcMassMeasure != null;
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_POSITIVE_LENGTH_MEASURE:
				return ifcPositiveLengthMeasure != null;
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_LENGTH_MEASURE:
				return ifcLengthMeasure != null;
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_ELECTRIC_CURRENT_MEASURE:
				return ifcElectricCurrentMeasure != null;
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_DESCRIPTIVE_MEASURE:
				return ifcDescriptiveMeasure != null;
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_COUNT_MEASURE:
				return ifcCountMeasure != null;
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_CONTEXT_DEPENDENT_MEASURE:
				return ifcContextDependentMeasure != null;
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_AREA_MEASURE:
				return ifcAreaMeasure != null;
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_AMOUNT_OF_SUBSTANCE_MEASURE:
				return ifcAmountOfSubstanceMeasure != null;
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_LUMINOUS_INTENSITY_MEASURE:
				return ifcLuminousIntensityMeasure != null;
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_NORMALISED_RATIO_MEASURE:
				return ifcNormalisedRatioMeasure != null;
			case FinalPackage.MOST_USED_VALUE_TYPE__IFC_COMPLEX_NUMBER:
				return ifcComplexNumber != null;
		}
		return super.eIsSet(featureID);
	}

} //MostUsedValueTypeImpl
