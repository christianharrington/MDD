/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPermeableCoveringOperationEnum;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPermeableCoveringProperties;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcWindowPanelPositionEnum;
import org.tech.iai.ifc.xml.ifc._2x3.final_.ShapeAspectStyleType2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Permeable Covering Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcPermeableCoveringPropertiesImpl#getOperationType <em>Operation Type</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcPermeableCoveringPropertiesImpl#getPanelPosition <em>Panel Position</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcPermeableCoveringPropertiesImpl#getFrameDepth <em>Frame Depth</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcPermeableCoveringPropertiesImpl#getFrameThickness <em>Frame Thickness</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcPermeableCoveringPropertiesImpl#getShapeAspectStyle <em>Shape Aspect Style</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcPermeableCoveringPropertiesImpl extends IfcPropertySetDefinitionImpl implements IfcPermeableCoveringProperties {
	/**
	 * The default value of the '{@link #getOperationType() <em>Operation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationType()
	 * @generated
	 * @ordered
	 */
	protected static final IfcPermeableCoveringOperationEnum OPERATION_TYPE_EDEFAULT = IfcPermeableCoveringOperationEnum.GRILL;

	/**
	 * The cached value of the '{@link #getOperationType() <em>Operation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationType()
	 * @generated
	 * @ordered
	 */
	protected IfcPermeableCoveringOperationEnum operationType = OPERATION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPanelPosition() <em>Panel Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanelPosition()
	 * @generated
	 * @ordered
	 */
	protected static final IfcWindowPanelPositionEnum PANEL_POSITION_EDEFAULT = IfcWindowPanelPositionEnum.LEFT;

	/**
	 * The cached value of the '{@link #getPanelPosition() <em>Panel Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanelPosition()
	 * @generated
	 * @ordered
	 */
	protected IfcWindowPanelPositionEnum panelPosition = PANEL_POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFrameDepth() <em>Frame Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrameDepth()
	 * @generated
	 * @ordered
	 */
	protected static final Double FRAME_DEPTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrameDepth() <em>Frame Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrameDepth()
	 * @generated
	 * @ordered
	 */
	protected Double frameDepth = FRAME_DEPTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getFrameThickness() <em>Frame Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrameThickness()
	 * @generated
	 * @ordered
	 */
	protected static final Double FRAME_THICKNESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrameThickness() <em>Frame Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrameThickness()
	 * @generated
	 * @ordered
	 */
	protected Double frameThickness = FRAME_THICKNESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getShapeAspectStyle() <em>Shape Aspect Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShapeAspectStyle()
	 * @generated
	 * @ordered
	 */
	protected ShapeAspectStyleType2 shapeAspectStyle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcPermeableCoveringPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcPermeableCoveringProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPermeableCoveringOperationEnum getOperationType() {
		return operationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationType(IfcPermeableCoveringOperationEnum newOperationType) {
		IfcPermeableCoveringOperationEnum oldOperationType = operationType;
		operationType = newOperationType == null ? OPERATION_TYPE_EDEFAULT : newOperationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PERMEABLE_COVERING_PROPERTIES__OPERATION_TYPE, oldOperationType, operationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcWindowPanelPositionEnum getPanelPosition() {
		return panelPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPanelPosition(IfcWindowPanelPositionEnum newPanelPosition) {
		IfcWindowPanelPositionEnum oldPanelPosition = panelPosition;
		panelPosition = newPanelPosition == null ? PANEL_POSITION_EDEFAULT : newPanelPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PERMEABLE_COVERING_PROPERTIES__PANEL_POSITION, oldPanelPosition, panelPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getFrameDepth() {
		return frameDepth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrameDepth(Double newFrameDepth) {
		Double oldFrameDepth = frameDepth;
		frameDepth = newFrameDepth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PERMEABLE_COVERING_PROPERTIES__FRAME_DEPTH, oldFrameDepth, frameDepth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getFrameThickness() {
		return frameThickness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrameThickness(Double newFrameThickness) {
		Double oldFrameThickness = frameThickness;
		frameThickness = newFrameThickness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PERMEABLE_COVERING_PROPERTIES__FRAME_THICKNESS, oldFrameThickness, frameThickness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShapeAspectStyleType2 getShapeAspectStyle() {
		return shapeAspectStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShapeAspectStyle(ShapeAspectStyleType2 newShapeAspectStyle, NotificationChain msgs) {
		ShapeAspectStyleType2 oldShapeAspectStyle = shapeAspectStyle;
		shapeAspectStyle = newShapeAspectStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PERMEABLE_COVERING_PROPERTIES__SHAPE_ASPECT_STYLE, oldShapeAspectStyle, newShapeAspectStyle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShapeAspectStyle(ShapeAspectStyleType2 newShapeAspectStyle) {
		if (newShapeAspectStyle != shapeAspectStyle) {
			NotificationChain msgs = null;
			if (shapeAspectStyle != null)
				msgs = ((InternalEObject)shapeAspectStyle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PERMEABLE_COVERING_PROPERTIES__SHAPE_ASPECT_STYLE, null, msgs);
			if (newShapeAspectStyle != null)
				msgs = ((InternalEObject)newShapeAspectStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PERMEABLE_COVERING_PROPERTIES__SHAPE_ASPECT_STYLE, null, msgs);
			msgs = basicSetShapeAspectStyle(newShapeAspectStyle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PERMEABLE_COVERING_PROPERTIES__SHAPE_ASPECT_STYLE, newShapeAspectStyle, newShapeAspectStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_PERMEABLE_COVERING_PROPERTIES__SHAPE_ASPECT_STYLE:
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
			case FinalPackage.IFC_PERMEABLE_COVERING_PROPERTIES__OPERATION_TYPE:
				return getOperationType();
			case FinalPackage.IFC_PERMEABLE_COVERING_PROPERTIES__PANEL_POSITION:
				return getPanelPosition();
			case FinalPackage.IFC_PERMEABLE_COVERING_PROPERTIES__FRAME_DEPTH:
				return getFrameDepth();
			case FinalPackage.IFC_PERMEABLE_COVERING_PROPERTIES__FRAME_THICKNESS:
				return getFrameThickness();
			case FinalPackage.IFC_PERMEABLE_COVERING_PROPERTIES__SHAPE_ASPECT_STYLE:
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
			case FinalPackage.IFC_PERMEABLE_COVERING_PROPERTIES__OPERATION_TYPE:
				setOperationType((IfcPermeableCoveringOperationEnum)newValue);
				return;
			case FinalPackage.IFC_PERMEABLE_COVERING_PROPERTIES__PANEL_POSITION:
				setPanelPosition((IfcWindowPanelPositionEnum)newValue);
				return;
			case FinalPackage.IFC_PERMEABLE_COVERING_PROPERTIES__FRAME_DEPTH:
				setFrameDepth((Double)newValue);
				return;
			case FinalPackage.IFC_PERMEABLE_COVERING_PROPERTIES__FRAME_THICKNESS:
				setFrameThickness((Double)newValue);
				return;
			case FinalPackage.IFC_PERMEABLE_COVERING_PROPERTIES__SHAPE_ASPECT_STYLE:
				setShapeAspectStyle((ShapeAspectStyleType2)newValue);
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
			case FinalPackage.IFC_PERMEABLE_COVERING_PROPERTIES__OPERATION_TYPE:
				setOperationType(OPERATION_TYPE_EDEFAULT);
				return;
			case FinalPackage.IFC_PERMEABLE_COVERING_PROPERTIES__PANEL_POSITION:
				setPanelPosition(PANEL_POSITION_EDEFAULT);
				return;
			case FinalPackage.IFC_PERMEABLE_COVERING_PROPERTIES__FRAME_DEPTH:
				setFrameDepth(FRAME_DEPTH_EDEFAULT);
				return;
			case FinalPackage.IFC_PERMEABLE_COVERING_PROPERTIES__FRAME_THICKNESS:
				setFrameThickness(FRAME_THICKNESS_EDEFAULT);
				return;
			case FinalPackage.IFC_PERMEABLE_COVERING_PROPERTIES__SHAPE_ASPECT_STYLE:
				setShapeAspectStyle((ShapeAspectStyleType2)null);
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
			case FinalPackage.IFC_PERMEABLE_COVERING_PROPERTIES__OPERATION_TYPE:
				return operationType != OPERATION_TYPE_EDEFAULT;
			case FinalPackage.IFC_PERMEABLE_COVERING_PROPERTIES__PANEL_POSITION:
				return panelPosition != PANEL_POSITION_EDEFAULT;
			case FinalPackage.IFC_PERMEABLE_COVERING_PROPERTIES__FRAME_DEPTH:
				return FRAME_DEPTH_EDEFAULT == null ? frameDepth != null : !FRAME_DEPTH_EDEFAULT.equals(frameDepth);
			case FinalPackage.IFC_PERMEABLE_COVERING_PROPERTIES__FRAME_THICKNESS:
				return FRAME_THICKNESS_EDEFAULT == null ? frameThickness != null : !FRAME_THICKNESS_EDEFAULT.equals(frameThickness);
			case FinalPackage.IFC_PERMEABLE_COVERING_PROPERTIES__SHAPE_ASPECT_STYLE:
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
		result.append(" (operationType: ");
		result.append(operationType);
		result.append(", panelPosition: ");
		result.append(panelPosition);
		result.append(", frameDepth: ");
		result.append(frameDepth);
		result.append(", frameThickness: ");
		result.append(frameThickness);
		result.append(')');
		return result.toString();
	}

} //IfcPermeableCoveringPropertiesImpl
