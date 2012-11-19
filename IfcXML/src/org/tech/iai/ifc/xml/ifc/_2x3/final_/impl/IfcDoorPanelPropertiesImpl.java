/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDoorPanelOperationEnum;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDoorPanelPositionEnum;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDoorPanelProperties;
import org.tech.iai.ifc.xml.ifc._2x3.final_.ShapeAspectStyleType3;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Door Panel Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDoorPanelPropertiesImpl#getPanelDepth <em>Panel Depth</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDoorPanelPropertiesImpl#getPanelOperation <em>Panel Operation</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDoorPanelPropertiesImpl#getPanelWidth <em>Panel Width</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDoorPanelPropertiesImpl#getPanelPosition <em>Panel Position</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDoorPanelPropertiesImpl#getShapeAspectStyle <em>Shape Aspect Style</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcDoorPanelPropertiesImpl extends IfcPropertySetDefinitionImpl implements IfcDoorPanelProperties {
	/**
	 * The default value of the '{@link #getPanelDepth() <em>Panel Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanelDepth()
	 * @generated
	 * @ordered
	 */
	protected static final Double PANEL_DEPTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPanelDepth() <em>Panel Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanelDepth()
	 * @generated
	 * @ordered
	 */
	protected Double panelDepth = PANEL_DEPTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getPanelOperation() <em>Panel Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanelOperation()
	 * @generated
	 * @ordered
	 */
	protected static final IfcDoorPanelOperationEnum PANEL_OPERATION_EDEFAULT = IfcDoorPanelOperationEnum.SWINGING;

	/**
	 * The cached value of the '{@link #getPanelOperation() <em>Panel Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanelOperation()
	 * @generated
	 * @ordered
	 */
	protected IfcDoorPanelOperationEnum panelOperation = PANEL_OPERATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPanelWidth() <em>Panel Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanelWidth()
	 * @generated
	 * @ordered
	 */
	protected static final Double PANEL_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPanelWidth() <em>Panel Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanelWidth()
	 * @generated
	 * @ordered
	 */
	protected Double panelWidth = PANEL_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getPanelPosition() <em>Panel Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanelPosition()
	 * @generated
	 * @ordered
	 */
	protected static final IfcDoorPanelPositionEnum PANEL_POSITION_EDEFAULT = IfcDoorPanelPositionEnum.LEFT;

	/**
	 * The cached value of the '{@link #getPanelPosition() <em>Panel Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanelPosition()
	 * @generated
	 * @ordered
	 */
	protected IfcDoorPanelPositionEnum panelPosition = PANEL_POSITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getShapeAspectStyle() <em>Shape Aspect Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShapeAspectStyle()
	 * @generated
	 * @ordered
	 */
	protected ShapeAspectStyleType3 shapeAspectStyle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcDoorPanelPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcDoorPanelProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getPanelDepth() {
		return panelDepth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPanelDepth(Double newPanelDepth) {
		Double oldPanelDepth = panelDepth;
		panelDepth = newPanelDepth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DOOR_PANEL_PROPERTIES__PANEL_DEPTH, oldPanelDepth, panelDepth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDoorPanelOperationEnum getPanelOperation() {
		return panelOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPanelOperation(IfcDoorPanelOperationEnum newPanelOperation) {
		IfcDoorPanelOperationEnum oldPanelOperation = panelOperation;
		panelOperation = newPanelOperation == null ? PANEL_OPERATION_EDEFAULT : newPanelOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DOOR_PANEL_PROPERTIES__PANEL_OPERATION, oldPanelOperation, panelOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getPanelWidth() {
		return panelWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPanelWidth(Double newPanelWidth) {
		Double oldPanelWidth = panelWidth;
		panelWidth = newPanelWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DOOR_PANEL_PROPERTIES__PANEL_WIDTH, oldPanelWidth, panelWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDoorPanelPositionEnum getPanelPosition() {
		return panelPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPanelPosition(IfcDoorPanelPositionEnum newPanelPosition) {
		IfcDoorPanelPositionEnum oldPanelPosition = panelPosition;
		panelPosition = newPanelPosition == null ? PANEL_POSITION_EDEFAULT : newPanelPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DOOR_PANEL_PROPERTIES__PANEL_POSITION, oldPanelPosition, panelPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShapeAspectStyleType3 getShapeAspectStyle() {
		return shapeAspectStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShapeAspectStyle(ShapeAspectStyleType3 newShapeAspectStyle, NotificationChain msgs) {
		ShapeAspectStyleType3 oldShapeAspectStyle = shapeAspectStyle;
		shapeAspectStyle = newShapeAspectStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DOOR_PANEL_PROPERTIES__SHAPE_ASPECT_STYLE, oldShapeAspectStyle, newShapeAspectStyle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShapeAspectStyle(ShapeAspectStyleType3 newShapeAspectStyle) {
		if (newShapeAspectStyle != shapeAspectStyle) {
			NotificationChain msgs = null;
			if (shapeAspectStyle != null)
				msgs = ((InternalEObject)shapeAspectStyle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DOOR_PANEL_PROPERTIES__SHAPE_ASPECT_STYLE, null, msgs);
			if (newShapeAspectStyle != null)
				msgs = ((InternalEObject)newShapeAspectStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DOOR_PANEL_PROPERTIES__SHAPE_ASPECT_STYLE, null, msgs);
			msgs = basicSetShapeAspectStyle(newShapeAspectStyle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DOOR_PANEL_PROPERTIES__SHAPE_ASPECT_STYLE, newShapeAspectStyle, newShapeAspectStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_DOOR_PANEL_PROPERTIES__SHAPE_ASPECT_STYLE:
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
			case FinalPackage.IFC_DOOR_PANEL_PROPERTIES__PANEL_DEPTH:
				return getPanelDepth();
			case FinalPackage.IFC_DOOR_PANEL_PROPERTIES__PANEL_OPERATION:
				return getPanelOperation();
			case FinalPackage.IFC_DOOR_PANEL_PROPERTIES__PANEL_WIDTH:
				return getPanelWidth();
			case FinalPackage.IFC_DOOR_PANEL_PROPERTIES__PANEL_POSITION:
				return getPanelPosition();
			case FinalPackage.IFC_DOOR_PANEL_PROPERTIES__SHAPE_ASPECT_STYLE:
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
			case FinalPackage.IFC_DOOR_PANEL_PROPERTIES__PANEL_DEPTH:
				setPanelDepth((Double)newValue);
				return;
			case FinalPackage.IFC_DOOR_PANEL_PROPERTIES__PANEL_OPERATION:
				setPanelOperation((IfcDoorPanelOperationEnum)newValue);
				return;
			case FinalPackage.IFC_DOOR_PANEL_PROPERTIES__PANEL_WIDTH:
				setPanelWidth((Double)newValue);
				return;
			case FinalPackage.IFC_DOOR_PANEL_PROPERTIES__PANEL_POSITION:
				setPanelPosition((IfcDoorPanelPositionEnum)newValue);
				return;
			case FinalPackage.IFC_DOOR_PANEL_PROPERTIES__SHAPE_ASPECT_STYLE:
				setShapeAspectStyle((ShapeAspectStyleType3)newValue);
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
			case FinalPackage.IFC_DOOR_PANEL_PROPERTIES__PANEL_DEPTH:
				setPanelDepth(PANEL_DEPTH_EDEFAULT);
				return;
			case FinalPackage.IFC_DOOR_PANEL_PROPERTIES__PANEL_OPERATION:
				setPanelOperation(PANEL_OPERATION_EDEFAULT);
				return;
			case FinalPackage.IFC_DOOR_PANEL_PROPERTIES__PANEL_WIDTH:
				setPanelWidth(PANEL_WIDTH_EDEFAULT);
				return;
			case FinalPackage.IFC_DOOR_PANEL_PROPERTIES__PANEL_POSITION:
				setPanelPosition(PANEL_POSITION_EDEFAULT);
				return;
			case FinalPackage.IFC_DOOR_PANEL_PROPERTIES__SHAPE_ASPECT_STYLE:
				setShapeAspectStyle((ShapeAspectStyleType3)null);
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
			case FinalPackage.IFC_DOOR_PANEL_PROPERTIES__PANEL_DEPTH:
				return PANEL_DEPTH_EDEFAULT == null ? panelDepth != null : !PANEL_DEPTH_EDEFAULT.equals(panelDepth);
			case FinalPackage.IFC_DOOR_PANEL_PROPERTIES__PANEL_OPERATION:
				return panelOperation != PANEL_OPERATION_EDEFAULT;
			case FinalPackage.IFC_DOOR_PANEL_PROPERTIES__PANEL_WIDTH:
				return PANEL_WIDTH_EDEFAULT == null ? panelWidth != null : !PANEL_WIDTH_EDEFAULT.equals(panelWidth);
			case FinalPackage.IFC_DOOR_PANEL_PROPERTIES__PANEL_POSITION:
				return panelPosition != PANEL_POSITION_EDEFAULT;
			case FinalPackage.IFC_DOOR_PANEL_PROPERTIES__SHAPE_ASPECT_STYLE:
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
		result.append(" (panelDepth: ");
		result.append(panelDepth);
		result.append(", panelOperation: ");
		result.append(panelOperation);
		result.append(", panelWidth: ");
		result.append(panelWidth);
		result.append(", panelPosition: ");
		result.append(panelPosition);
		result.append(')');
		return result.toString();
	}

} //IfcDoorPanelPropertiesImpl
