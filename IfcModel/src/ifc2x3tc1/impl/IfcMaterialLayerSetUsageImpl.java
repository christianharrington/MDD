/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcDirectionSenseEnum;
import ifc2x3tc1.IfcLayerSetDirectionEnum;
import ifc2x3tc1.IfcMaterialLayerSet;
import ifc2x3tc1.IfcMaterialLayerSetUsage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Material Layer Set Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcMaterialLayerSetUsageImpl#getForLayerSet <em>For Layer Set</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcMaterialLayerSetUsageImpl#getLayerSetDirection <em>Layer Set Direction</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcMaterialLayerSetUsageImpl#getDirectionSense <em>Direction Sense</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcMaterialLayerSetUsageImpl#getOffsetFromReferenceLine <em>Offset From Reference Line</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcMaterialLayerSetUsageImpl#getOffsetFromReferenceLineAsString <em>Offset From Reference Line As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcMaterialLayerSetUsageImpl extends EObjectImpl implements IfcMaterialLayerSetUsage {
	/**
	 * The cached value of the '{@link #getForLayerSet() <em>For Layer Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForLayerSet()
	 * @generated
	 * @ordered
	 */
	protected IfcMaterialLayerSet forLayerSet;

	/**
	 * The default value of the '{@link #getLayerSetDirection() <em>Layer Set Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayerSetDirection()
	 * @generated
	 * @ordered
	 */
	protected static final IfcLayerSetDirectionEnum LAYER_SET_DIRECTION_EDEFAULT = IfcLayerSetDirectionEnum.NULL;

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
	protected static final IfcDirectionSenseEnum DIRECTION_SENSE_EDEFAULT = IfcDirectionSenseEnum.NULL;

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
	 * The default value of the '{@link #getOffsetFromReferenceLineAsString() <em>Offset From Reference Line As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffsetFromReferenceLineAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String OFFSET_FROM_REFERENCE_LINE_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOffsetFromReferenceLineAsString() <em>Offset From Reference Line As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffsetFromReferenceLineAsString()
	 * @generated
	 * @ordered
	 */
	protected String offsetFromReferenceLineAsString = OFFSET_FROM_REFERENCE_LINE_AS_STRING_EDEFAULT;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcMaterialLayerSetUsage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMaterialLayerSet getForLayerSet() {
		if (forLayerSet != null && forLayerSet.eIsProxy()) {
			InternalEObject oldForLayerSet = (InternalEObject)forLayerSet;
			forLayerSet = (IfcMaterialLayerSet)eResolveProxy(oldForLayerSet);
			if (forLayerSet != oldForLayerSet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_MATERIAL_LAYER_SET_USAGE__FOR_LAYER_SET, oldForLayerSet, forLayerSet));
			}
		}
		return forLayerSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMaterialLayerSet basicGetForLayerSet() {
		return forLayerSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForLayerSet(IfcMaterialLayerSet newForLayerSet) {
		IfcMaterialLayerSet oldForLayerSet = forLayerSet;
		forLayerSet = newForLayerSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_MATERIAL_LAYER_SET_USAGE__FOR_LAYER_SET, oldForLayerSet, forLayerSet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_MATERIAL_LAYER_SET_USAGE__LAYER_SET_DIRECTION, oldLayerSetDirection, layerSetDirection));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_MATERIAL_LAYER_SET_USAGE__DIRECTION_SENSE, oldDirectionSense, directionSense));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_MATERIAL_LAYER_SET_USAGE__OFFSET_FROM_REFERENCE_LINE, oldOffsetFromReferenceLine, offsetFromReferenceLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOffsetFromReferenceLineAsString() {
		return offsetFromReferenceLineAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffsetFromReferenceLineAsString(String newOffsetFromReferenceLineAsString) {
		String oldOffsetFromReferenceLineAsString = offsetFromReferenceLineAsString;
		offsetFromReferenceLineAsString = newOffsetFromReferenceLineAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_MATERIAL_LAYER_SET_USAGE__OFFSET_FROM_REFERENCE_LINE_AS_STRING, oldOffsetFromReferenceLineAsString, offsetFromReferenceLineAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_MATERIAL_LAYER_SET_USAGE__FOR_LAYER_SET:
				if (resolve) return getForLayerSet();
				return basicGetForLayerSet();
			case Ifc2x3tc1Package.IFC_MATERIAL_LAYER_SET_USAGE__LAYER_SET_DIRECTION:
				return getLayerSetDirection();
			case Ifc2x3tc1Package.IFC_MATERIAL_LAYER_SET_USAGE__DIRECTION_SENSE:
				return getDirectionSense();
			case Ifc2x3tc1Package.IFC_MATERIAL_LAYER_SET_USAGE__OFFSET_FROM_REFERENCE_LINE:
				return getOffsetFromReferenceLine();
			case Ifc2x3tc1Package.IFC_MATERIAL_LAYER_SET_USAGE__OFFSET_FROM_REFERENCE_LINE_AS_STRING:
				return getOffsetFromReferenceLineAsString();
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
			case Ifc2x3tc1Package.IFC_MATERIAL_LAYER_SET_USAGE__FOR_LAYER_SET:
				setForLayerSet((IfcMaterialLayerSet)newValue);
				return;
			case Ifc2x3tc1Package.IFC_MATERIAL_LAYER_SET_USAGE__LAYER_SET_DIRECTION:
				setLayerSetDirection((IfcLayerSetDirectionEnum)newValue);
				return;
			case Ifc2x3tc1Package.IFC_MATERIAL_LAYER_SET_USAGE__DIRECTION_SENSE:
				setDirectionSense((IfcDirectionSenseEnum)newValue);
				return;
			case Ifc2x3tc1Package.IFC_MATERIAL_LAYER_SET_USAGE__OFFSET_FROM_REFERENCE_LINE:
				setOffsetFromReferenceLine((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_MATERIAL_LAYER_SET_USAGE__OFFSET_FROM_REFERENCE_LINE_AS_STRING:
				setOffsetFromReferenceLineAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_MATERIAL_LAYER_SET_USAGE__FOR_LAYER_SET:
				setForLayerSet((IfcMaterialLayerSet)null);
				return;
			case Ifc2x3tc1Package.IFC_MATERIAL_LAYER_SET_USAGE__LAYER_SET_DIRECTION:
				setLayerSetDirection(LAYER_SET_DIRECTION_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_MATERIAL_LAYER_SET_USAGE__DIRECTION_SENSE:
				setDirectionSense(DIRECTION_SENSE_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_MATERIAL_LAYER_SET_USAGE__OFFSET_FROM_REFERENCE_LINE:
				setOffsetFromReferenceLine(OFFSET_FROM_REFERENCE_LINE_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_MATERIAL_LAYER_SET_USAGE__OFFSET_FROM_REFERENCE_LINE_AS_STRING:
				setOffsetFromReferenceLineAsString(OFFSET_FROM_REFERENCE_LINE_AS_STRING_EDEFAULT);
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
			case Ifc2x3tc1Package.IFC_MATERIAL_LAYER_SET_USAGE__FOR_LAYER_SET:
				return forLayerSet != null;
			case Ifc2x3tc1Package.IFC_MATERIAL_LAYER_SET_USAGE__LAYER_SET_DIRECTION:
				return layerSetDirection != LAYER_SET_DIRECTION_EDEFAULT;
			case Ifc2x3tc1Package.IFC_MATERIAL_LAYER_SET_USAGE__DIRECTION_SENSE:
				return directionSense != DIRECTION_SENSE_EDEFAULT;
			case Ifc2x3tc1Package.IFC_MATERIAL_LAYER_SET_USAGE__OFFSET_FROM_REFERENCE_LINE:
				return offsetFromReferenceLine != OFFSET_FROM_REFERENCE_LINE_EDEFAULT;
			case Ifc2x3tc1Package.IFC_MATERIAL_LAYER_SET_USAGE__OFFSET_FROM_REFERENCE_LINE_AS_STRING:
				return OFFSET_FROM_REFERENCE_LINE_AS_STRING_EDEFAULT == null ? offsetFromReferenceLineAsString != null : !OFFSET_FROM_REFERENCE_LINE_AS_STRING_EDEFAULT.equals(offsetFromReferenceLineAsString);
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
		result.append(" (LayerSetDirection: ");
		result.append(layerSetDirection);
		result.append(", DirectionSense: ");
		result.append(directionSense);
		result.append(", OffsetFromReferenceLine: ");
		result.append(offsetFromReferenceLine);
		result.append(", OffsetFromReferenceLineAsString: ");
		result.append(offsetFromReferenceLineAsString);
		result.append(')');
		return result.toString();
	}

} //IfcMaterialLayerSetUsageImpl
