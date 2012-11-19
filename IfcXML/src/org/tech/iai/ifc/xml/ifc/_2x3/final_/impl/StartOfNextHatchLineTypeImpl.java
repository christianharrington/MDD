/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcOneDirectionRepeatFactor;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPositiveLengthMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.StartOfNextHatchLineType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Start Of Next Hatch Line Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.StartOfNextHatchLineTypeImpl#getIfcOneDirectionRepeatFactorGroup <em>Ifc One Direction Repeat Factor Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.StartOfNextHatchLineTypeImpl#getIfcOneDirectionRepeatFactor <em>Ifc One Direction Repeat Factor</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.StartOfNextHatchLineTypeImpl#getIfcPositiveLengthMeasure <em>Ifc Positive Length Measure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StartOfNextHatchLineTypeImpl extends EObjectImpl implements StartOfNextHatchLineType {
	/**
	 * The cached value of the '{@link #getIfcOneDirectionRepeatFactorGroup() <em>Ifc One Direction Repeat Factor Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcOneDirectionRepeatFactorGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcOneDirectionRepeatFactorGroup;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StartOfNextHatchLineTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getStartOfNextHatchLineType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcOneDirectionRepeatFactorGroup() {
		if (ifcOneDirectionRepeatFactorGroup == null) {
			ifcOneDirectionRepeatFactorGroup = new BasicFeatureMap(this, FinalPackage.START_OF_NEXT_HATCH_LINE_TYPE__IFC_ONE_DIRECTION_REPEAT_FACTOR_GROUP);
		}
		return ifcOneDirectionRepeatFactorGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcOneDirectionRepeatFactor getIfcOneDirectionRepeatFactor() {
		return (IfcOneDirectionRepeatFactor)getIfcOneDirectionRepeatFactorGroup().get(FinalPackage.eINSTANCE.getStartOfNextHatchLineType_IfcOneDirectionRepeatFactor(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcOneDirectionRepeatFactor(IfcOneDirectionRepeatFactor newIfcOneDirectionRepeatFactor, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcOneDirectionRepeatFactorGroup()).basicAdd(FinalPackage.eINSTANCE.getStartOfNextHatchLineType_IfcOneDirectionRepeatFactor(), newIfcOneDirectionRepeatFactor, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcOneDirectionRepeatFactor(IfcOneDirectionRepeatFactor newIfcOneDirectionRepeatFactor) {
		((FeatureMap.Internal)getIfcOneDirectionRepeatFactorGroup()).set(FinalPackage.eINSTANCE.getStartOfNextHatchLineType_IfcOneDirectionRepeatFactor(), newIfcOneDirectionRepeatFactor);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.START_OF_NEXT_HATCH_LINE_TYPE__IFC_POSITIVE_LENGTH_MEASURE, oldIfcPositiveLengthMeasure, newIfcPositiveLengthMeasure);
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
				msgs = ((InternalEObject)ifcPositiveLengthMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.START_OF_NEXT_HATCH_LINE_TYPE__IFC_POSITIVE_LENGTH_MEASURE, null, msgs);
			if (newIfcPositiveLengthMeasure != null)
				msgs = ((InternalEObject)newIfcPositiveLengthMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.START_OF_NEXT_HATCH_LINE_TYPE__IFC_POSITIVE_LENGTH_MEASURE, null, msgs);
			msgs = basicSetIfcPositiveLengthMeasure(newIfcPositiveLengthMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.START_OF_NEXT_HATCH_LINE_TYPE__IFC_POSITIVE_LENGTH_MEASURE, newIfcPositiveLengthMeasure, newIfcPositiveLengthMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.START_OF_NEXT_HATCH_LINE_TYPE__IFC_ONE_DIRECTION_REPEAT_FACTOR_GROUP:
				return ((InternalEList<?>)getIfcOneDirectionRepeatFactorGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.START_OF_NEXT_HATCH_LINE_TYPE__IFC_ONE_DIRECTION_REPEAT_FACTOR:
				return basicSetIfcOneDirectionRepeatFactor(null, msgs);
			case FinalPackage.START_OF_NEXT_HATCH_LINE_TYPE__IFC_POSITIVE_LENGTH_MEASURE:
				return basicSetIfcPositiveLengthMeasure(null, msgs);
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
			case FinalPackage.START_OF_NEXT_HATCH_LINE_TYPE__IFC_ONE_DIRECTION_REPEAT_FACTOR_GROUP:
				if (coreType) return getIfcOneDirectionRepeatFactorGroup();
				return ((FeatureMap.Internal)getIfcOneDirectionRepeatFactorGroup()).getWrapper();
			case FinalPackage.START_OF_NEXT_HATCH_LINE_TYPE__IFC_ONE_DIRECTION_REPEAT_FACTOR:
				return getIfcOneDirectionRepeatFactor();
			case FinalPackage.START_OF_NEXT_HATCH_LINE_TYPE__IFC_POSITIVE_LENGTH_MEASURE:
				return getIfcPositiveLengthMeasure();
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
			case FinalPackage.START_OF_NEXT_HATCH_LINE_TYPE__IFC_ONE_DIRECTION_REPEAT_FACTOR_GROUP:
				((FeatureMap.Internal)getIfcOneDirectionRepeatFactorGroup()).set(newValue);
				return;
			case FinalPackage.START_OF_NEXT_HATCH_LINE_TYPE__IFC_ONE_DIRECTION_REPEAT_FACTOR:
				setIfcOneDirectionRepeatFactor((IfcOneDirectionRepeatFactor)newValue);
				return;
			case FinalPackage.START_OF_NEXT_HATCH_LINE_TYPE__IFC_POSITIVE_LENGTH_MEASURE:
				setIfcPositiveLengthMeasure((IfcPositiveLengthMeasureType)newValue);
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
			case FinalPackage.START_OF_NEXT_HATCH_LINE_TYPE__IFC_ONE_DIRECTION_REPEAT_FACTOR_GROUP:
				getIfcOneDirectionRepeatFactorGroup().clear();
				return;
			case FinalPackage.START_OF_NEXT_HATCH_LINE_TYPE__IFC_ONE_DIRECTION_REPEAT_FACTOR:
				setIfcOneDirectionRepeatFactor((IfcOneDirectionRepeatFactor)null);
				return;
			case FinalPackage.START_OF_NEXT_HATCH_LINE_TYPE__IFC_POSITIVE_LENGTH_MEASURE:
				setIfcPositiveLengthMeasure((IfcPositiveLengthMeasureType)null);
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
			case FinalPackage.START_OF_NEXT_HATCH_LINE_TYPE__IFC_ONE_DIRECTION_REPEAT_FACTOR_GROUP:
				return ifcOneDirectionRepeatFactorGroup != null && !ifcOneDirectionRepeatFactorGroup.isEmpty();
			case FinalPackage.START_OF_NEXT_HATCH_LINE_TYPE__IFC_ONE_DIRECTION_REPEAT_FACTOR:
				return getIfcOneDirectionRepeatFactor() != null;
			case FinalPackage.START_OF_NEXT_HATCH_LINE_TYPE__IFC_POSITIVE_LENGTH_MEASURE:
				return ifcPositiveLengthMeasure != null;
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
		result.append(" (ifcOneDirectionRepeatFactorGroup: ");
		result.append(ifcOneDirectionRepeatFactorGroup);
		result.append(')');
		return result.toString();
	}

} //StartOfNextHatchLineTypeImpl
