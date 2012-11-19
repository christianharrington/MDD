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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDescriptiveMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLengthMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcNormalisedRatioMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPositiveLengthMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPositiveRatioMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRatioMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.WordSpacingType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Word Spacing Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.WordSpacingTypeImpl#getIfcRatioMeasure <em>Ifc Ratio Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.WordSpacingTypeImpl#getIfcLengthMeasure <em>Ifc Length Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.WordSpacingTypeImpl#getIfcDescriptiveMeasure <em>Ifc Descriptive Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.WordSpacingTypeImpl#getIfcPositiveLengthMeasure <em>Ifc Positive Length Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.WordSpacingTypeImpl#getIfcNormalisedRatioMeasure <em>Ifc Normalised Ratio Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.WordSpacingTypeImpl#getIfcPositiveRatioMeasure <em>Ifc Positive Ratio Measure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WordSpacingTypeImpl extends EObjectImpl implements WordSpacingType {
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
	 * The cached value of the '{@link #getIfcLengthMeasure() <em>Ifc Length Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcLengthMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcLengthMeasureType ifcLengthMeasure;

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
	 * The cached value of the '{@link #getIfcPositiveLengthMeasure() <em>Ifc Positive Length Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcPositiveLengthMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcPositiveLengthMeasureType ifcPositiveLengthMeasure;

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
	 * The cached value of the '{@link #getIfcPositiveRatioMeasure() <em>Ifc Positive Ratio Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcPositiveRatioMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcPositiveRatioMeasureType ifcPositiveRatioMeasure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WordSpacingTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getWordSpacingType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.WORD_SPACING_TYPE__IFC_RATIO_MEASURE, oldIfcRatioMeasure, newIfcRatioMeasure);
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
				msgs = ((InternalEObject)ifcRatioMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.WORD_SPACING_TYPE__IFC_RATIO_MEASURE, null, msgs);
			if (newIfcRatioMeasure != null)
				msgs = ((InternalEObject)newIfcRatioMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.WORD_SPACING_TYPE__IFC_RATIO_MEASURE, null, msgs);
			msgs = basicSetIfcRatioMeasure(newIfcRatioMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.WORD_SPACING_TYPE__IFC_RATIO_MEASURE, newIfcRatioMeasure, newIfcRatioMeasure));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.WORD_SPACING_TYPE__IFC_LENGTH_MEASURE, oldIfcLengthMeasure, newIfcLengthMeasure);
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
				msgs = ((InternalEObject)ifcLengthMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.WORD_SPACING_TYPE__IFC_LENGTH_MEASURE, null, msgs);
			if (newIfcLengthMeasure != null)
				msgs = ((InternalEObject)newIfcLengthMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.WORD_SPACING_TYPE__IFC_LENGTH_MEASURE, null, msgs);
			msgs = basicSetIfcLengthMeasure(newIfcLengthMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.WORD_SPACING_TYPE__IFC_LENGTH_MEASURE, newIfcLengthMeasure, newIfcLengthMeasure));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.WORD_SPACING_TYPE__IFC_DESCRIPTIVE_MEASURE, oldIfcDescriptiveMeasure, newIfcDescriptiveMeasure);
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
				msgs = ((InternalEObject)ifcDescriptiveMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.WORD_SPACING_TYPE__IFC_DESCRIPTIVE_MEASURE, null, msgs);
			if (newIfcDescriptiveMeasure != null)
				msgs = ((InternalEObject)newIfcDescriptiveMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.WORD_SPACING_TYPE__IFC_DESCRIPTIVE_MEASURE, null, msgs);
			msgs = basicSetIfcDescriptiveMeasure(newIfcDescriptiveMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.WORD_SPACING_TYPE__IFC_DESCRIPTIVE_MEASURE, newIfcDescriptiveMeasure, newIfcDescriptiveMeasure));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.WORD_SPACING_TYPE__IFC_POSITIVE_LENGTH_MEASURE, oldIfcPositiveLengthMeasure, newIfcPositiveLengthMeasure);
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
				msgs = ((InternalEObject)ifcPositiveLengthMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.WORD_SPACING_TYPE__IFC_POSITIVE_LENGTH_MEASURE, null, msgs);
			if (newIfcPositiveLengthMeasure != null)
				msgs = ((InternalEObject)newIfcPositiveLengthMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.WORD_SPACING_TYPE__IFC_POSITIVE_LENGTH_MEASURE, null, msgs);
			msgs = basicSetIfcPositiveLengthMeasure(newIfcPositiveLengthMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.WORD_SPACING_TYPE__IFC_POSITIVE_LENGTH_MEASURE, newIfcPositiveLengthMeasure, newIfcPositiveLengthMeasure));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.WORD_SPACING_TYPE__IFC_NORMALISED_RATIO_MEASURE, oldIfcNormalisedRatioMeasure, newIfcNormalisedRatioMeasure);
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
				msgs = ((InternalEObject)ifcNormalisedRatioMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.WORD_SPACING_TYPE__IFC_NORMALISED_RATIO_MEASURE, null, msgs);
			if (newIfcNormalisedRatioMeasure != null)
				msgs = ((InternalEObject)newIfcNormalisedRatioMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.WORD_SPACING_TYPE__IFC_NORMALISED_RATIO_MEASURE, null, msgs);
			msgs = basicSetIfcNormalisedRatioMeasure(newIfcNormalisedRatioMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.WORD_SPACING_TYPE__IFC_NORMALISED_RATIO_MEASURE, newIfcNormalisedRatioMeasure, newIfcNormalisedRatioMeasure));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.WORD_SPACING_TYPE__IFC_POSITIVE_RATIO_MEASURE, oldIfcPositiveRatioMeasure, newIfcPositiveRatioMeasure);
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
				msgs = ((InternalEObject)ifcPositiveRatioMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.WORD_SPACING_TYPE__IFC_POSITIVE_RATIO_MEASURE, null, msgs);
			if (newIfcPositiveRatioMeasure != null)
				msgs = ((InternalEObject)newIfcPositiveRatioMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.WORD_SPACING_TYPE__IFC_POSITIVE_RATIO_MEASURE, null, msgs);
			msgs = basicSetIfcPositiveRatioMeasure(newIfcPositiveRatioMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.WORD_SPACING_TYPE__IFC_POSITIVE_RATIO_MEASURE, newIfcPositiveRatioMeasure, newIfcPositiveRatioMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.WORD_SPACING_TYPE__IFC_RATIO_MEASURE:
				return basicSetIfcRatioMeasure(null, msgs);
			case FinalPackage.WORD_SPACING_TYPE__IFC_LENGTH_MEASURE:
				return basicSetIfcLengthMeasure(null, msgs);
			case FinalPackage.WORD_SPACING_TYPE__IFC_DESCRIPTIVE_MEASURE:
				return basicSetIfcDescriptiveMeasure(null, msgs);
			case FinalPackage.WORD_SPACING_TYPE__IFC_POSITIVE_LENGTH_MEASURE:
				return basicSetIfcPositiveLengthMeasure(null, msgs);
			case FinalPackage.WORD_SPACING_TYPE__IFC_NORMALISED_RATIO_MEASURE:
				return basicSetIfcNormalisedRatioMeasure(null, msgs);
			case FinalPackage.WORD_SPACING_TYPE__IFC_POSITIVE_RATIO_MEASURE:
				return basicSetIfcPositiveRatioMeasure(null, msgs);
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
			case FinalPackage.WORD_SPACING_TYPE__IFC_RATIO_MEASURE:
				return getIfcRatioMeasure();
			case FinalPackage.WORD_SPACING_TYPE__IFC_LENGTH_MEASURE:
				return getIfcLengthMeasure();
			case FinalPackage.WORD_SPACING_TYPE__IFC_DESCRIPTIVE_MEASURE:
				return getIfcDescriptiveMeasure();
			case FinalPackage.WORD_SPACING_TYPE__IFC_POSITIVE_LENGTH_MEASURE:
				return getIfcPositiveLengthMeasure();
			case FinalPackage.WORD_SPACING_TYPE__IFC_NORMALISED_RATIO_MEASURE:
				return getIfcNormalisedRatioMeasure();
			case FinalPackage.WORD_SPACING_TYPE__IFC_POSITIVE_RATIO_MEASURE:
				return getIfcPositiveRatioMeasure();
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
			case FinalPackage.WORD_SPACING_TYPE__IFC_RATIO_MEASURE:
				setIfcRatioMeasure((IfcRatioMeasureType)newValue);
				return;
			case FinalPackage.WORD_SPACING_TYPE__IFC_LENGTH_MEASURE:
				setIfcLengthMeasure((IfcLengthMeasureType)newValue);
				return;
			case FinalPackage.WORD_SPACING_TYPE__IFC_DESCRIPTIVE_MEASURE:
				setIfcDescriptiveMeasure((IfcDescriptiveMeasureType)newValue);
				return;
			case FinalPackage.WORD_SPACING_TYPE__IFC_POSITIVE_LENGTH_MEASURE:
				setIfcPositiveLengthMeasure((IfcPositiveLengthMeasureType)newValue);
				return;
			case FinalPackage.WORD_SPACING_TYPE__IFC_NORMALISED_RATIO_MEASURE:
				setIfcNormalisedRatioMeasure((IfcNormalisedRatioMeasureType)newValue);
				return;
			case FinalPackage.WORD_SPACING_TYPE__IFC_POSITIVE_RATIO_MEASURE:
				setIfcPositiveRatioMeasure((IfcPositiveRatioMeasureType)newValue);
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
			case FinalPackage.WORD_SPACING_TYPE__IFC_RATIO_MEASURE:
				setIfcRatioMeasure((IfcRatioMeasureType)null);
				return;
			case FinalPackage.WORD_SPACING_TYPE__IFC_LENGTH_MEASURE:
				setIfcLengthMeasure((IfcLengthMeasureType)null);
				return;
			case FinalPackage.WORD_SPACING_TYPE__IFC_DESCRIPTIVE_MEASURE:
				setIfcDescriptiveMeasure((IfcDescriptiveMeasureType)null);
				return;
			case FinalPackage.WORD_SPACING_TYPE__IFC_POSITIVE_LENGTH_MEASURE:
				setIfcPositiveLengthMeasure((IfcPositiveLengthMeasureType)null);
				return;
			case FinalPackage.WORD_SPACING_TYPE__IFC_NORMALISED_RATIO_MEASURE:
				setIfcNormalisedRatioMeasure((IfcNormalisedRatioMeasureType)null);
				return;
			case FinalPackage.WORD_SPACING_TYPE__IFC_POSITIVE_RATIO_MEASURE:
				setIfcPositiveRatioMeasure((IfcPositiveRatioMeasureType)null);
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
			case FinalPackage.WORD_SPACING_TYPE__IFC_RATIO_MEASURE:
				return ifcRatioMeasure != null;
			case FinalPackage.WORD_SPACING_TYPE__IFC_LENGTH_MEASURE:
				return ifcLengthMeasure != null;
			case FinalPackage.WORD_SPACING_TYPE__IFC_DESCRIPTIVE_MEASURE:
				return ifcDescriptiveMeasure != null;
			case FinalPackage.WORD_SPACING_TYPE__IFC_POSITIVE_LENGTH_MEASURE:
				return ifcPositiveLengthMeasure != null;
			case FinalPackage.WORD_SPACING_TYPE__IFC_NORMALISED_RATIO_MEASURE:
				return ifcNormalisedRatioMeasure != null;
			case FinalPackage.WORD_SPACING_TYPE__IFC_POSITIVE_RATIO_MEASURE:
				return ifcPositiveRatioMeasure != null;
		}
		return super.eIsSet(featureID);
	}

} //WordSpacingTypeImpl
