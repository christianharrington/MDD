/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcShapeAspect;
import ifc2x3tc1.IfcWindowPanelOperationEnum;
import ifc2x3tc1.IfcWindowPanelPositionEnum;
import ifc2x3tc1.IfcWindowPanelProperties;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Window Panel Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcWindowPanelPropertiesImpl#getOperationType <em>Operation Type</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcWindowPanelPropertiesImpl#getPanelPosition <em>Panel Position</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcWindowPanelPropertiesImpl#getFrameDepth <em>Frame Depth</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcWindowPanelPropertiesImpl#getFrameDepthAsString <em>Frame Depth As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcWindowPanelPropertiesImpl#getFrameThickness <em>Frame Thickness</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcWindowPanelPropertiesImpl#getFrameThicknessAsString <em>Frame Thickness As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcWindowPanelPropertiesImpl#getShapeAspectStyle <em>Shape Aspect Style</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcWindowPanelPropertiesImpl extends IfcPropertySetDefinitionImpl implements IfcWindowPanelProperties {
	/**
	 * The default value of the '{@link #getOperationType() <em>Operation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationType()
	 * @generated
	 * @ordered
	 */
	protected static final IfcWindowPanelOperationEnum OPERATION_TYPE_EDEFAULT = IfcWindowPanelOperationEnum.NULL;

	/**
	 * The cached value of the '{@link #getOperationType() <em>Operation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationType()
	 * @generated
	 * @ordered
	 */
	protected IfcWindowPanelOperationEnum operationType = OPERATION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPanelPosition() <em>Panel Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanelPosition()
	 * @generated
	 * @ordered
	 */
	protected static final IfcWindowPanelPositionEnum PANEL_POSITION_EDEFAULT = IfcWindowPanelPositionEnum.NULL;

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
	protected static final double FRAME_DEPTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFrameDepth() <em>Frame Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrameDepth()
	 * @generated
	 * @ordered
	 */
	protected double frameDepth = FRAME_DEPTH_EDEFAULT;

	/**
	 * This is true if the Frame Depth attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean frameDepthESet;

	/**
	 * The default value of the '{@link #getFrameDepthAsString() <em>Frame Depth As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrameDepthAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String FRAME_DEPTH_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrameDepthAsString() <em>Frame Depth As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrameDepthAsString()
	 * @generated
	 * @ordered
	 */
	protected String frameDepthAsString = FRAME_DEPTH_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Frame Depth As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean frameDepthAsStringESet;

	/**
	 * The default value of the '{@link #getFrameThickness() <em>Frame Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrameThickness()
	 * @generated
	 * @ordered
	 */
	protected static final double FRAME_THICKNESS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFrameThickness() <em>Frame Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrameThickness()
	 * @generated
	 * @ordered
	 */
	protected double frameThickness = FRAME_THICKNESS_EDEFAULT;

	/**
	 * This is true if the Frame Thickness attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean frameThicknessESet;

	/**
	 * The default value of the '{@link #getFrameThicknessAsString() <em>Frame Thickness As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrameThicknessAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String FRAME_THICKNESS_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrameThicknessAsString() <em>Frame Thickness As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrameThicknessAsString()
	 * @generated
	 * @ordered
	 */
	protected String frameThicknessAsString = FRAME_THICKNESS_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Frame Thickness As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean frameThicknessAsStringESet;

	/**
	 * The cached value of the '{@link #getShapeAspectStyle() <em>Shape Aspect Style</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShapeAspectStyle()
	 * @generated
	 * @ordered
	 */
	protected IfcShapeAspect shapeAspectStyle;

	/**
	 * This is true if the Shape Aspect Style reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean shapeAspectStyleESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcWindowPanelPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcWindowPanelProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcWindowPanelOperationEnum getOperationType() {
		return operationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationType(IfcWindowPanelOperationEnum newOperationType) {
		IfcWindowPanelOperationEnum oldOperationType = operationType;
		operationType = newOperationType == null ? OPERATION_TYPE_EDEFAULT : newOperationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_WINDOW_PANEL_PROPERTIES__OPERATION_TYPE, oldOperationType, operationType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_WINDOW_PANEL_PROPERTIES__PANEL_POSITION, oldPanelPosition, panelPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFrameDepth() {
		return frameDepth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrameDepth(double newFrameDepth) {
		double oldFrameDepth = frameDepth;
		frameDepth = newFrameDepth;
		boolean oldFrameDepthESet = frameDepthESet;
		frameDepthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_WINDOW_PANEL_PROPERTIES__FRAME_DEPTH, oldFrameDepth, frameDepth, !oldFrameDepthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFrameDepth() {
		double oldFrameDepth = frameDepth;
		boolean oldFrameDepthESet = frameDepthESet;
		frameDepth = FRAME_DEPTH_EDEFAULT;
		frameDepthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_WINDOW_PANEL_PROPERTIES__FRAME_DEPTH, oldFrameDepth, FRAME_DEPTH_EDEFAULT, oldFrameDepthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFrameDepth() {
		return frameDepthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFrameDepthAsString() {
		return frameDepthAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrameDepthAsString(String newFrameDepthAsString) {
		String oldFrameDepthAsString = frameDepthAsString;
		frameDepthAsString = newFrameDepthAsString;
		boolean oldFrameDepthAsStringESet = frameDepthAsStringESet;
		frameDepthAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_WINDOW_PANEL_PROPERTIES__FRAME_DEPTH_AS_STRING, oldFrameDepthAsString, frameDepthAsString, !oldFrameDepthAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFrameDepthAsString() {
		String oldFrameDepthAsString = frameDepthAsString;
		boolean oldFrameDepthAsStringESet = frameDepthAsStringESet;
		frameDepthAsString = FRAME_DEPTH_AS_STRING_EDEFAULT;
		frameDepthAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_WINDOW_PANEL_PROPERTIES__FRAME_DEPTH_AS_STRING, oldFrameDepthAsString, FRAME_DEPTH_AS_STRING_EDEFAULT, oldFrameDepthAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFrameDepthAsString() {
		return frameDepthAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFrameThickness() {
		return frameThickness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrameThickness(double newFrameThickness) {
		double oldFrameThickness = frameThickness;
		frameThickness = newFrameThickness;
		boolean oldFrameThicknessESet = frameThicknessESet;
		frameThicknessESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_WINDOW_PANEL_PROPERTIES__FRAME_THICKNESS, oldFrameThickness, frameThickness, !oldFrameThicknessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFrameThickness() {
		double oldFrameThickness = frameThickness;
		boolean oldFrameThicknessESet = frameThicknessESet;
		frameThickness = FRAME_THICKNESS_EDEFAULT;
		frameThicknessESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_WINDOW_PANEL_PROPERTIES__FRAME_THICKNESS, oldFrameThickness, FRAME_THICKNESS_EDEFAULT, oldFrameThicknessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFrameThickness() {
		return frameThicknessESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFrameThicknessAsString() {
		return frameThicknessAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrameThicknessAsString(String newFrameThicknessAsString) {
		String oldFrameThicknessAsString = frameThicknessAsString;
		frameThicknessAsString = newFrameThicknessAsString;
		boolean oldFrameThicknessAsStringESet = frameThicknessAsStringESet;
		frameThicknessAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_WINDOW_PANEL_PROPERTIES__FRAME_THICKNESS_AS_STRING, oldFrameThicknessAsString, frameThicknessAsString, !oldFrameThicknessAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFrameThicknessAsString() {
		String oldFrameThicknessAsString = frameThicknessAsString;
		boolean oldFrameThicknessAsStringESet = frameThicknessAsStringESet;
		frameThicknessAsString = FRAME_THICKNESS_AS_STRING_EDEFAULT;
		frameThicknessAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_WINDOW_PANEL_PROPERTIES__FRAME_THICKNESS_AS_STRING, oldFrameThicknessAsString, FRAME_THICKNESS_AS_STRING_EDEFAULT, oldFrameThicknessAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFrameThicknessAsString() {
		return frameThicknessAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcShapeAspect getShapeAspectStyle() {
		if (shapeAspectStyle != null && shapeAspectStyle.eIsProxy()) {
			InternalEObject oldShapeAspectStyle = (InternalEObject)shapeAspectStyle;
			shapeAspectStyle = (IfcShapeAspect)eResolveProxy(oldShapeAspectStyle);
			if (shapeAspectStyle != oldShapeAspectStyle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_WINDOW_PANEL_PROPERTIES__SHAPE_ASPECT_STYLE, oldShapeAspectStyle, shapeAspectStyle));
			}
		}
		return shapeAspectStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcShapeAspect basicGetShapeAspectStyle() {
		return shapeAspectStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShapeAspectStyle(IfcShapeAspect newShapeAspectStyle) {
		IfcShapeAspect oldShapeAspectStyle = shapeAspectStyle;
		shapeAspectStyle = newShapeAspectStyle;
		boolean oldShapeAspectStyleESet = shapeAspectStyleESet;
		shapeAspectStyleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_WINDOW_PANEL_PROPERTIES__SHAPE_ASPECT_STYLE, oldShapeAspectStyle, shapeAspectStyle, !oldShapeAspectStyleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetShapeAspectStyle() {
		IfcShapeAspect oldShapeAspectStyle = shapeAspectStyle;
		boolean oldShapeAspectStyleESet = shapeAspectStyleESet;
		shapeAspectStyle = null;
		shapeAspectStyleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_WINDOW_PANEL_PROPERTIES__SHAPE_ASPECT_STYLE, oldShapeAspectStyle, null, oldShapeAspectStyleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetShapeAspectStyle() {
		return shapeAspectStyleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_WINDOW_PANEL_PROPERTIES__OPERATION_TYPE:
				return getOperationType();
			case Ifc2x3tc1Package.IFC_WINDOW_PANEL_PROPERTIES__PANEL_POSITION:
				return getPanelPosition();
			case Ifc2x3tc1Package.IFC_WINDOW_PANEL_PROPERTIES__FRAME_DEPTH:
				return getFrameDepth();
			case Ifc2x3tc1Package.IFC_WINDOW_PANEL_PROPERTIES__FRAME_DEPTH_AS_STRING:
				return getFrameDepthAsString();
			case Ifc2x3tc1Package.IFC_WINDOW_PANEL_PROPERTIES__FRAME_THICKNESS:
				return getFrameThickness();
			case Ifc2x3tc1Package.IFC_WINDOW_PANEL_PROPERTIES__FRAME_THICKNESS_AS_STRING:
				return getFrameThicknessAsString();
			case Ifc2x3tc1Package.IFC_WINDOW_PANEL_PROPERTIES__SHAPE_ASPECT_STYLE:
				if (resolve) return getShapeAspectStyle();
				return basicGetShapeAspectStyle();
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
			case Ifc2x3tc1Package.IFC_WINDOW_PANEL_PROPERTIES__OPERATION_TYPE:
				setOperationType((IfcWindowPanelOperationEnum)newValue);
				return;
			case Ifc2x3tc1Package.IFC_WINDOW_PANEL_PROPERTIES__PANEL_POSITION:
				setPanelPosition((IfcWindowPanelPositionEnum)newValue);
				return;
			case Ifc2x3tc1Package.IFC_WINDOW_PANEL_PROPERTIES__FRAME_DEPTH:
				setFrameDepth((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_WINDOW_PANEL_PROPERTIES__FRAME_DEPTH_AS_STRING:
				setFrameDepthAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_WINDOW_PANEL_PROPERTIES__FRAME_THICKNESS:
				setFrameThickness((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_WINDOW_PANEL_PROPERTIES__FRAME_THICKNESS_AS_STRING:
				setFrameThicknessAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_WINDOW_PANEL_PROPERTIES__SHAPE_ASPECT_STYLE:
				setShapeAspectStyle((IfcShapeAspect)newValue);
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
			case Ifc2x3tc1Package.IFC_WINDOW_PANEL_PROPERTIES__OPERATION_TYPE:
				setOperationType(OPERATION_TYPE_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_WINDOW_PANEL_PROPERTIES__PANEL_POSITION:
				setPanelPosition(PANEL_POSITION_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_WINDOW_PANEL_PROPERTIES__FRAME_DEPTH:
				unsetFrameDepth();
				return;
			case Ifc2x3tc1Package.IFC_WINDOW_PANEL_PROPERTIES__FRAME_DEPTH_AS_STRING:
				unsetFrameDepthAsString();
				return;
			case Ifc2x3tc1Package.IFC_WINDOW_PANEL_PROPERTIES__FRAME_THICKNESS:
				unsetFrameThickness();
				return;
			case Ifc2x3tc1Package.IFC_WINDOW_PANEL_PROPERTIES__FRAME_THICKNESS_AS_STRING:
				unsetFrameThicknessAsString();
				return;
			case Ifc2x3tc1Package.IFC_WINDOW_PANEL_PROPERTIES__SHAPE_ASPECT_STYLE:
				unsetShapeAspectStyle();
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
			case Ifc2x3tc1Package.IFC_WINDOW_PANEL_PROPERTIES__OPERATION_TYPE:
				return operationType != OPERATION_TYPE_EDEFAULT;
			case Ifc2x3tc1Package.IFC_WINDOW_PANEL_PROPERTIES__PANEL_POSITION:
				return panelPosition != PANEL_POSITION_EDEFAULT;
			case Ifc2x3tc1Package.IFC_WINDOW_PANEL_PROPERTIES__FRAME_DEPTH:
				return isSetFrameDepth();
			case Ifc2x3tc1Package.IFC_WINDOW_PANEL_PROPERTIES__FRAME_DEPTH_AS_STRING:
				return isSetFrameDepthAsString();
			case Ifc2x3tc1Package.IFC_WINDOW_PANEL_PROPERTIES__FRAME_THICKNESS:
				return isSetFrameThickness();
			case Ifc2x3tc1Package.IFC_WINDOW_PANEL_PROPERTIES__FRAME_THICKNESS_AS_STRING:
				return isSetFrameThicknessAsString();
			case Ifc2x3tc1Package.IFC_WINDOW_PANEL_PROPERTIES__SHAPE_ASPECT_STYLE:
				return isSetShapeAspectStyle();
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
		result.append(" (OperationType: ");
		result.append(operationType);
		result.append(", PanelPosition: ");
		result.append(panelPosition);
		result.append(", FrameDepth: ");
		if (frameDepthESet) result.append(frameDepth); else result.append("<unset>");
		result.append(", FrameDepthAsString: ");
		if (frameDepthAsStringESet) result.append(frameDepthAsString); else result.append("<unset>");
		result.append(", FrameThickness: ");
		if (frameThicknessESet) result.append(frameThickness); else result.append("<unset>");
		result.append(", FrameThicknessAsString: ");
		if (frameThicknessAsStringESet) result.append(frameThicknessAsString); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcWindowPanelPropertiesImpl
