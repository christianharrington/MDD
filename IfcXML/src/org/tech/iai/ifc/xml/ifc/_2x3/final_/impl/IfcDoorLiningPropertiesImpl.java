/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDoorLiningProperties;
import org.tech.iai.ifc.xml.ifc._2x3.final_.ShapeAspectStyleType4;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Door Lining Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDoorLiningPropertiesImpl#getLiningDepth <em>Lining Depth</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDoorLiningPropertiesImpl#getLiningThickness <em>Lining Thickness</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDoorLiningPropertiesImpl#getThresholdDepth <em>Threshold Depth</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDoorLiningPropertiesImpl#getThresholdThickness <em>Threshold Thickness</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDoorLiningPropertiesImpl#getTransomThickness <em>Transom Thickness</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDoorLiningPropertiesImpl#getTransomOffset <em>Transom Offset</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDoorLiningPropertiesImpl#getLiningOffset <em>Lining Offset</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDoorLiningPropertiesImpl#getThresholdOffset <em>Threshold Offset</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDoorLiningPropertiesImpl#getCasingThickness <em>Casing Thickness</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDoorLiningPropertiesImpl#getCasingDepth <em>Casing Depth</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDoorLiningPropertiesImpl#getShapeAspectStyle <em>Shape Aspect Style</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcDoorLiningPropertiesImpl extends IfcPropertySetDefinitionImpl implements IfcDoorLiningProperties {
	/**
	 * The default value of the '{@link #getLiningDepth() <em>Lining Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiningDepth()
	 * @generated
	 * @ordered
	 */
	protected static final Double LINING_DEPTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLiningDepth() <em>Lining Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiningDepth()
	 * @generated
	 * @ordered
	 */
	protected Double liningDepth = LINING_DEPTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getLiningThickness() <em>Lining Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiningThickness()
	 * @generated
	 * @ordered
	 */
	protected static final Double LINING_THICKNESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLiningThickness() <em>Lining Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiningThickness()
	 * @generated
	 * @ordered
	 */
	protected Double liningThickness = LINING_THICKNESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getThresholdDepth() <em>Threshold Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThresholdDepth()
	 * @generated
	 * @ordered
	 */
	protected static final Double THRESHOLD_DEPTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThresholdDepth() <em>Threshold Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThresholdDepth()
	 * @generated
	 * @ordered
	 */
	protected Double thresholdDepth = THRESHOLD_DEPTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getThresholdThickness() <em>Threshold Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThresholdThickness()
	 * @generated
	 * @ordered
	 */
	protected static final Double THRESHOLD_THICKNESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThresholdThickness() <em>Threshold Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThresholdThickness()
	 * @generated
	 * @ordered
	 */
	protected Double thresholdThickness = THRESHOLD_THICKNESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransomThickness() <em>Transom Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransomThickness()
	 * @generated
	 * @ordered
	 */
	protected static final Double TRANSOM_THICKNESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransomThickness() <em>Transom Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransomThickness()
	 * @generated
	 * @ordered
	 */
	protected Double transomThickness = TRANSOM_THICKNESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransomOffset() <em>Transom Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransomOffset()
	 * @generated
	 * @ordered
	 */
	protected static final Double TRANSOM_OFFSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransomOffset() <em>Transom Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransomOffset()
	 * @generated
	 * @ordered
	 */
	protected Double transomOffset = TRANSOM_OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getLiningOffset() <em>Lining Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiningOffset()
	 * @generated
	 * @ordered
	 */
	protected static final Double LINING_OFFSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLiningOffset() <em>Lining Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiningOffset()
	 * @generated
	 * @ordered
	 */
	protected Double liningOffset = LINING_OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getThresholdOffset() <em>Threshold Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThresholdOffset()
	 * @generated
	 * @ordered
	 */
	protected static final Double THRESHOLD_OFFSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThresholdOffset() <em>Threshold Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThresholdOffset()
	 * @generated
	 * @ordered
	 */
	protected Double thresholdOffset = THRESHOLD_OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getCasingThickness() <em>Casing Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCasingThickness()
	 * @generated
	 * @ordered
	 */
	protected static final Double CASING_THICKNESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCasingThickness() <em>Casing Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCasingThickness()
	 * @generated
	 * @ordered
	 */
	protected Double casingThickness = CASING_THICKNESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCasingDepth() <em>Casing Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCasingDepth()
	 * @generated
	 * @ordered
	 */
	protected static final Double CASING_DEPTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCasingDepth() <em>Casing Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCasingDepth()
	 * @generated
	 * @ordered
	 */
	protected Double casingDepth = CASING_DEPTH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getShapeAspectStyle() <em>Shape Aspect Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShapeAspectStyle()
	 * @generated
	 * @ordered
	 */
	protected ShapeAspectStyleType4 shapeAspectStyle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcDoorLiningPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcDoorLiningProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getLiningDepth() {
		return liningDepth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLiningDepth(Double newLiningDepth) {
		Double oldLiningDepth = liningDepth;
		liningDepth = newLiningDepth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DOOR_LINING_PROPERTIES__LINING_DEPTH, oldLiningDepth, liningDepth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getLiningThickness() {
		return liningThickness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLiningThickness(Double newLiningThickness) {
		Double oldLiningThickness = liningThickness;
		liningThickness = newLiningThickness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DOOR_LINING_PROPERTIES__LINING_THICKNESS, oldLiningThickness, liningThickness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getThresholdDepth() {
		return thresholdDepth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThresholdDepth(Double newThresholdDepth) {
		Double oldThresholdDepth = thresholdDepth;
		thresholdDepth = newThresholdDepth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DOOR_LINING_PROPERTIES__THRESHOLD_DEPTH, oldThresholdDepth, thresholdDepth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getThresholdThickness() {
		return thresholdThickness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThresholdThickness(Double newThresholdThickness) {
		Double oldThresholdThickness = thresholdThickness;
		thresholdThickness = newThresholdThickness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DOOR_LINING_PROPERTIES__THRESHOLD_THICKNESS, oldThresholdThickness, thresholdThickness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getTransomThickness() {
		return transomThickness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransomThickness(Double newTransomThickness) {
		Double oldTransomThickness = transomThickness;
		transomThickness = newTransomThickness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DOOR_LINING_PROPERTIES__TRANSOM_THICKNESS, oldTransomThickness, transomThickness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getTransomOffset() {
		return transomOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransomOffset(Double newTransomOffset) {
		Double oldTransomOffset = transomOffset;
		transomOffset = newTransomOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DOOR_LINING_PROPERTIES__TRANSOM_OFFSET, oldTransomOffset, transomOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getLiningOffset() {
		return liningOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLiningOffset(Double newLiningOffset) {
		Double oldLiningOffset = liningOffset;
		liningOffset = newLiningOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DOOR_LINING_PROPERTIES__LINING_OFFSET, oldLiningOffset, liningOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getThresholdOffset() {
		return thresholdOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThresholdOffset(Double newThresholdOffset) {
		Double oldThresholdOffset = thresholdOffset;
		thresholdOffset = newThresholdOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DOOR_LINING_PROPERTIES__THRESHOLD_OFFSET, oldThresholdOffset, thresholdOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getCasingThickness() {
		return casingThickness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCasingThickness(Double newCasingThickness) {
		Double oldCasingThickness = casingThickness;
		casingThickness = newCasingThickness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DOOR_LINING_PROPERTIES__CASING_THICKNESS, oldCasingThickness, casingThickness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getCasingDepth() {
		return casingDepth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCasingDepth(Double newCasingDepth) {
		Double oldCasingDepth = casingDepth;
		casingDepth = newCasingDepth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DOOR_LINING_PROPERTIES__CASING_DEPTH, oldCasingDepth, casingDepth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShapeAspectStyleType4 getShapeAspectStyle() {
		return shapeAspectStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShapeAspectStyle(ShapeAspectStyleType4 newShapeAspectStyle, NotificationChain msgs) {
		ShapeAspectStyleType4 oldShapeAspectStyle = shapeAspectStyle;
		shapeAspectStyle = newShapeAspectStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DOOR_LINING_PROPERTIES__SHAPE_ASPECT_STYLE, oldShapeAspectStyle, newShapeAspectStyle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShapeAspectStyle(ShapeAspectStyleType4 newShapeAspectStyle) {
		if (newShapeAspectStyle != shapeAspectStyle) {
			NotificationChain msgs = null;
			if (shapeAspectStyle != null)
				msgs = ((InternalEObject)shapeAspectStyle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DOOR_LINING_PROPERTIES__SHAPE_ASPECT_STYLE, null, msgs);
			if (newShapeAspectStyle != null)
				msgs = ((InternalEObject)newShapeAspectStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DOOR_LINING_PROPERTIES__SHAPE_ASPECT_STYLE, null, msgs);
			msgs = basicSetShapeAspectStyle(newShapeAspectStyle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DOOR_LINING_PROPERTIES__SHAPE_ASPECT_STYLE, newShapeAspectStyle, newShapeAspectStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_DOOR_LINING_PROPERTIES__SHAPE_ASPECT_STYLE:
				return basicSetShapeAspectStyle(null, msgs);
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
			case FinalPackage.IFC_DOOR_LINING_PROPERTIES__LINING_DEPTH:
				return getLiningDepth();
			case FinalPackage.IFC_DOOR_LINING_PROPERTIES__LINING_THICKNESS:
				return getLiningThickness();
			case FinalPackage.IFC_DOOR_LINING_PROPERTIES__THRESHOLD_DEPTH:
				return getThresholdDepth();
			case FinalPackage.IFC_DOOR_LINING_PROPERTIES__THRESHOLD_THICKNESS:
				return getThresholdThickness();
			case FinalPackage.IFC_DOOR_LINING_PROPERTIES__TRANSOM_THICKNESS:
				return getTransomThickness();
			case FinalPackage.IFC_DOOR_LINING_PROPERTIES__TRANSOM_OFFSET:
				return getTransomOffset();
			case FinalPackage.IFC_DOOR_LINING_PROPERTIES__LINING_OFFSET:
				return getLiningOffset();
			case FinalPackage.IFC_DOOR_LINING_PROPERTIES__THRESHOLD_OFFSET:
				return getThresholdOffset();
			case FinalPackage.IFC_DOOR_LINING_PROPERTIES__CASING_THICKNESS:
				return getCasingThickness();
			case FinalPackage.IFC_DOOR_LINING_PROPERTIES__CASING_DEPTH:
				return getCasingDepth();
			case FinalPackage.IFC_DOOR_LINING_PROPERTIES__SHAPE_ASPECT_STYLE:
				return getShapeAspectStyle();
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
			case FinalPackage.IFC_DOOR_LINING_PROPERTIES__LINING_DEPTH:
				setLiningDepth((Double)newValue);
				return;
			case FinalPackage.IFC_DOOR_LINING_PROPERTIES__LINING_THICKNESS:
				setLiningThickness((Double)newValue);
				return;
			case FinalPackage.IFC_DOOR_LINING_PROPERTIES__THRESHOLD_DEPTH:
				setThresholdDepth((Double)newValue);
				return;
			case FinalPackage.IFC_DOOR_LINING_PROPERTIES__THRESHOLD_THICKNESS:
				setThresholdThickness((Double)newValue);
				return;
			case FinalPackage.IFC_DOOR_LINING_PROPERTIES__TRANSOM_THICKNESS:
				setTransomThickness((Double)newValue);
				return;
			case FinalPackage.IFC_DOOR_LINING_PROPERTIES__TRANSOM_OFFSET:
				setTransomOffset((Double)newValue);
				return;
			case FinalPackage.IFC_DOOR_LINING_PROPERTIES__LINING_OFFSET:
				setLiningOffset((Double)newValue);
				return;
			case FinalPackage.IFC_DOOR_LINING_PROPERTIES__THRESHOLD_OFFSET:
				setThresholdOffset((Double)newValue);
				return;
			case FinalPackage.IFC_DOOR_LINING_PROPERTIES__CASING_THICKNESS:
				setCasingThickness((Double)newValue);
				return;
			case FinalPackage.IFC_DOOR_LINING_PROPERTIES__CASING_DEPTH:
				setCasingDepth((Double)newValue);
				return;
			case FinalPackage.IFC_DOOR_LINING_PROPERTIES__SHAPE_ASPECT_STYLE:
				setShapeAspectStyle((ShapeAspectStyleType4)newValue);
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
			case FinalPackage.IFC_DOOR_LINING_PROPERTIES__LINING_DEPTH:
				setLiningDepth(LINING_DEPTH_EDEFAULT);
				return;
			case FinalPackage.IFC_DOOR_LINING_PROPERTIES__LINING_THICKNESS:
				setLiningThickness(LINING_THICKNESS_EDEFAULT);
				return;
			case FinalPackage.IFC_DOOR_LINING_PROPERTIES__THRESHOLD_DEPTH:
				setThresholdDepth(THRESHOLD_DEPTH_EDEFAULT);
				return;
			case FinalPackage.IFC_DOOR_LINING_PROPERTIES__THRESHOLD_THICKNESS:
				setThresholdThickness(THRESHOLD_THICKNESS_EDEFAULT);
				return;
			case FinalPackage.IFC_DOOR_LINING_PROPERTIES__TRANSOM_THICKNESS:
				setTransomThickness(TRANSOM_THICKNESS_EDEFAULT);
				return;
			case FinalPackage.IFC_DOOR_LINING_PROPERTIES__TRANSOM_OFFSET:
				setTransomOffset(TRANSOM_OFFSET_EDEFAULT);
				return;
			case FinalPackage.IFC_DOOR_LINING_PROPERTIES__LINING_OFFSET:
				setLiningOffset(LINING_OFFSET_EDEFAULT);
				return;
			case FinalPackage.IFC_DOOR_LINING_PROPERTIES__THRESHOLD_OFFSET:
				setThresholdOffset(THRESHOLD_OFFSET_EDEFAULT);
				return;
			case FinalPackage.IFC_DOOR_LINING_PROPERTIES__CASING_THICKNESS:
				setCasingThickness(CASING_THICKNESS_EDEFAULT);
				return;
			case FinalPackage.IFC_DOOR_LINING_PROPERTIES__CASING_DEPTH:
				setCasingDepth(CASING_DEPTH_EDEFAULT);
				return;
			case FinalPackage.IFC_DOOR_LINING_PROPERTIES__SHAPE_ASPECT_STYLE:
				setShapeAspectStyle((ShapeAspectStyleType4)null);
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
			case FinalPackage.IFC_DOOR_LINING_PROPERTIES__LINING_DEPTH:
				return LINING_DEPTH_EDEFAULT == null ? liningDepth != null : !LINING_DEPTH_EDEFAULT.equals(liningDepth);
			case FinalPackage.IFC_DOOR_LINING_PROPERTIES__LINING_THICKNESS:
				return LINING_THICKNESS_EDEFAULT == null ? liningThickness != null : !LINING_THICKNESS_EDEFAULT.equals(liningThickness);
			case FinalPackage.IFC_DOOR_LINING_PROPERTIES__THRESHOLD_DEPTH:
				return THRESHOLD_DEPTH_EDEFAULT == null ? thresholdDepth != null : !THRESHOLD_DEPTH_EDEFAULT.equals(thresholdDepth);
			case FinalPackage.IFC_DOOR_LINING_PROPERTIES__THRESHOLD_THICKNESS:
				return THRESHOLD_THICKNESS_EDEFAULT == null ? thresholdThickness != null : !THRESHOLD_THICKNESS_EDEFAULT.equals(thresholdThickness);
			case FinalPackage.IFC_DOOR_LINING_PROPERTIES__TRANSOM_THICKNESS:
				return TRANSOM_THICKNESS_EDEFAULT == null ? transomThickness != null : !TRANSOM_THICKNESS_EDEFAULT.equals(transomThickness);
			case FinalPackage.IFC_DOOR_LINING_PROPERTIES__TRANSOM_OFFSET:
				return TRANSOM_OFFSET_EDEFAULT == null ? transomOffset != null : !TRANSOM_OFFSET_EDEFAULT.equals(transomOffset);
			case FinalPackage.IFC_DOOR_LINING_PROPERTIES__LINING_OFFSET:
				return LINING_OFFSET_EDEFAULT == null ? liningOffset != null : !LINING_OFFSET_EDEFAULT.equals(liningOffset);
			case FinalPackage.IFC_DOOR_LINING_PROPERTIES__THRESHOLD_OFFSET:
				return THRESHOLD_OFFSET_EDEFAULT == null ? thresholdOffset != null : !THRESHOLD_OFFSET_EDEFAULT.equals(thresholdOffset);
			case FinalPackage.IFC_DOOR_LINING_PROPERTIES__CASING_THICKNESS:
				return CASING_THICKNESS_EDEFAULT == null ? casingThickness != null : !CASING_THICKNESS_EDEFAULT.equals(casingThickness);
			case FinalPackage.IFC_DOOR_LINING_PROPERTIES__CASING_DEPTH:
				return CASING_DEPTH_EDEFAULT == null ? casingDepth != null : !CASING_DEPTH_EDEFAULT.equals(casingDepth);
			case FinalPackage.IFC_DOOR_LINING_PROPERTIES__SHAPE_ASPECT_STYLE:
				return shapeAspectStyle != null;
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
		result.append(" (liningDepth: ");
		result.append(liningDepth);
		result.append(", liningThickness: ");
		result.append(liningThickness);
		result.append(", thresholdDepth: ");
		result.append(thresholdDepth);
		result.append(", thresholdThickness: ");
		result.append(thresholdThickness);
		result.append(", transomThickness: ");
		result.append(transomThickness);
		result.append(", transomOffset: ");
		result.append(transomOffset);
		result.append(", liningOffset: ");
		result.append(liningOffset);
		result.append(", thresholdOffset: ");
		result.append(thresholdOffset);
		result.append(", casingThickness: ");
		result.append(casingThickness);
		result.append(", casingDepth: ");
		result.append(casingDepth);
		result.append(')');
		return result.toString();
	}

} //IfcDoorLiningPropertiesImpl
