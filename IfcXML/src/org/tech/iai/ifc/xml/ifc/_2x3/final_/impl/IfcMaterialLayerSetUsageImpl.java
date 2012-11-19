/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.EntityImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.ForLayerSetType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDirectionSenseEnum;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLayerSetDirectionEnum;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMaterialLayerSetUsage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Material Layer Set Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcMaterialLayerSetUsageImpl#getForLayerSet <em>For Layer Set</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcMaterialLayerSetUsageImpl#getLayerSetDirection <em>Layer Set Direction</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcMaterialLayerSetUsageImpl#getDirectionSense <em>Direction Sense</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcMaterialLayerSetUsageImpl#getOffsetFromReferenceLine <em>Offset From Reference Line</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcMaterialLayerSetUsageImpl extends EntityImpl implements IfcMaterialLayerSetUsage {
	/**
	 * The cached value of the '{@link #getForLayerSet() <em>For Layer Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForLayerSet()
	 * @generated
	 * @ordered
	 */
	protected ForLayerSetType forLayerSet;

	/**
	 * The default value of the '{@link #getLayerSetDirection() <em>Layer Set Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayerSetDirection()
	 * @generated
	 * @ordered
	 */
	protected static final IfcLayerSetDirectionEnum LAYER_SET_DIRECTION_EDEFAULT = IfcLayerSetDirectionEnum.AXIS1;

	/**
	 * The cached value of the '{@link #getLayerSetDirection() <em>Layer Set Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayerSetDirection()
	 * @generated
	 * @ordered
	 */
	protected IfcLayerSetDirectionEnum layerSetDirection = LAYER_SET_DIRECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirectionSense() <em>Direction Sense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectionSense()
	 * @generated
	 * @ordered
	 */
	protected static final IfcDirectionSenseEnum DIRECTION_SENSE_EDEFAULT = IfcDirectionSenseEnum.POSITIVE;

	/**
	 * The cached value of the '{@link #getDirectionSense() <em>Direction Sense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectionSense()
	 * @generated
	 * @ordered
	 */
	protected IfcDirectionSenseEnum directionSense = DIRECTION_SENSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOffsetFromReferenceLine() <em>Offset From Reference Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffsetFromReferenceLine()
	 * @generated
	 * @ordered
	 */
	protected static final double OFFSET_FROM_REFERENCE_LINE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getOffsetFromReferenceLine() <em>Offset From Reference Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffsetFromReferenceLine()
	 * @generated
	 * @ordered
	 */
	protected double offsetFromReferenceLine = OFFSET_FROM_REFERENCE_LINE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcMaterialLayerSetUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcMaterialLayerSetUsage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForLayerSetType getForLayerSet() {
		return forLayerSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForLayerSet(ForLayerSetType newForLayerSet, NotificationChain msgs) {
		ForLayerSetType oldForLayerSet = forLayerSet;
		forLayerSet = newForLayerSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_MATERIAL_LAYER_SET_USAGE__FOR_LAYER_SET, oldForLayerSet, newForLayerSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForLayerSet(ForLayerSetType newForLayerSet) {
		if (newForLayerSet != forLayerSet) {
			NotificationChain msgs = null;
			if (forLayerSet != null)
				msgs = ((InternalEObject)forLayerSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_MATERIAL_LAYER_SET_USAGE__FOR_LAYER_SET, null, msgs);
			if (newForLayerSet != null)
				msgs = ((InternalEObject)newForLayerSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_MATERIAL_LAYER_SET_USAGE__FOR_LAYER_SET, null, msgs);
			msgs = basicSetForLayerSet(newForLayerSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_MATERIAL_LAYER_SET_USAGE__FOR_LAYER_SET, newForLayerSet, newForLayerSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLayerSetDirectionEnum getLayerSetDirection() {
		return layerSetDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayerSetDirection(IfcLayerSetDirectionEnum newLayerSetDirection) {
		IfcLayerSetDirectionEnum oldLayerSetDirection = layerSetDirection;
		layerSetDirection = newLayerSetDirection == null ? LAYER_SET_DIRECTION_EDEFAULT : newLayerSetDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_MATERIAL_LAYER_SET_USAGE__LAYER_SET_DIRECTION, oldLayerSetDirection, layerSetDirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDirectionSenseEnum getDirectionSense() {
		return directionSense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirectionSense(IfcDirectionSenseEnum newDirectionSense) {
		IfcDirectionSenseEnum oldDirectionSense = directionSense;
		directionSense = newDirectionSense == null ? DIRECTION_SENSE_EDEFAULT : newDirectionSense;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_MATERIAL_LAYER_SET_USAGE__DIRECTION_SENSE, oldDirectionSense, directionSense));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getOffsetFromReferenceLine() {
		return offsetFromReferenceLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffsetFromReferenceLine(double newOffsetFromReferenceLine) {
		double oldOffsetFromReferenceLine = offsetFromReferenceLine;
		offsetFromReferenceLine = newOffsetFromReferenceLine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_MATERIAL_LAYER_SET_USAGE__OFFSET_FROM_REFERENCE_LINE, oldOffsetFromReferenceLine, offsetFromReferenceLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_MATERIAL_LAYER_SET_USAGE__FOR_LAYER_SET:
				return basicSetForLayerSet(null, msgs);
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
			case FinalPackage.IFC_MATERIAL_LAYER_SET_USAGE__FOR_LAYER_SET:
				return getForLayerSet();
			case FinalPackage.IFC_MATERIAL_LAYER_SET_USAGE__LAYER_SET_DIRECTION:
				return getLayerSetDirection();
			case FinalPackage.IFC_MATERIAL_LAYER_SET_USAGE__DIRECTION_SENSE:
				return getDirectionSense();
			case FinalPackage.IFC_MATERIAL_LAYER_SET_USAGE__OFFSET_FROM_REFERENCE_LINE:
				return getOffsetFromReferenceLine();
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
			case FinalPackage.IFC_MATERIAL_LAYER_SET_USAGE__FOR_LAYER_SET:
				setForLayerSet((ForLayerSetType)newValue);
				return;
			case FinalPackage.IFC_MATERIAL_LAYER_SET_USAGE__LAYER_SET_DIRECTION:
				setLayerSetDirection((IfcLayerSetDirectionEnum)newValue);
				return;
			case FinalPackage.IFC_MATERIAL_LAYER_SET_USAGE__DIRECTION_SENSE:
				setDirectionSense((IfcDirectionSenseEnum)newValue);
				return;
			case FinalPackage.IFC_MATERIAL_LAYER_SET_USAGE__OFFSET_FROM_REFERENCE_LINE:
				setOffsetFromReferenceLine((Double)newValue);
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
			case FinalPackage.IFC_MATERIAL_LAYER_SET_USAGE__FOR_LAYER_SET:
				setForLayerSet((ForLayerSetType)null);
				return;
			case FinalPackage.IFC_MATERIAL_LAYER_SET_USAGE__LAYER_SET_DIRECTION:
				setLayerSetDirection(LAYER_SET_DIRECTION_EDEFAULT);
				return;
			case FinalPackage.IFC_MATERIAL_LAYER_SET_USAGE__DIRECTION_SENSE:
				setDirectionSense(DIRECTION_SENSE_EDEFAULT);
				return;
			case FinalPackage.IFC_MATERIAL_LAYER_SET_USAGE__OFFSET_FROM_REFERENCE_LINE:
				setOffsetFromReferenceLine(OFFSET_FROM_REFERENCE_LINE_EDEFAULT);
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
			case FinalPackage.IFC_MATERIAL_LAYER_SET_USAGE__FOR_LAYER_SET:
				return forLayerSet != null;
			case FinalPackage.IFC_MATERIAL_LAYER_SET_USAGE__LAYER_SET_DIRECTION:
				return layerSetDirection != LAYER_SET_DIRECTION_EDEFAULT;
			case FinalPackage.IFC_MATERIAL_LAYER_SET_USAGE__DIRECTION_SENSE:
				return directionSense != DIRECTION_SENSE_EDEFAULT;
			case FinalPackage.IFC_MATERIAL_LAYER_SET_USAGE__OFFSET_FROM_REFERENCE_LINE:
				return offsetFromReferenceLine != OFFSET_FROM_REFERENCE_LINE_EDEFAULT;
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
		result.append(" (layerSetDirection: ");
		result.append(layerSetDirection);
		result.append(", directionSense: ");
		result.append(directionSense);
		result.append(", offsetFromReferenceLine: ");
		result.append(offsetFromReferenceLine);
		result.append(')');
		return result.toString();
	}

} //IfcMaterialLayerSetUsageImpl
