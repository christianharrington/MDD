/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcDoorPanelOperationEnum;
import ifc2x3tc1.IfcDoorPanelPositionEnum;
import ifc2x3tc1.IfcDoorPanelProperties;
import ifc2x3tc1.IfcShapeAspect;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Door Panel Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcDoorPanelPropertiesImpl#getPanelDepth <em>Panel Depth</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcDoorPanelPropertiesImpl#getPanelDepthAsString <em>Panel Depth As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcDoorPanelPropertiesImpl#getPanelOperation <em>Panel Operation</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcDoorPanelPropertiesImpl#getPanelWidth <em>Panel Width</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcDoorPanelPropertiesImpl#getPanelWidthAsString <em>Panel Width As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcDoorPanelPropertiesImpl#getPanelPosition <em>Panel Position</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcDoorPanelPropertiesImpl#getShapeAspectStyle <em>Shape Aspect Style</em>}</li>
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
	protected static final double PANEL_DEPTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPanelDepth() <em>Panel Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanelDepth()
	 * @generated
	 * @ordered
	 */
	protected double panelDepth = PANEL_DEPTH_EDEFAULT;

	/**
	 * This is true if the Panel Depth attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean panelDepthESet;

	/**
	 * The default value of the '{@link #getPanelDepthAsString() <em>Panel Depth As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanelDepthAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String PANEL_DEPTH_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPanelDepthAsString() <em>Panel Depth As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanelDepthAsString()
	 * @generated
	 * @ordered
	 */
	protected String panelDepthAsString = PANEL_DEPTH_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Panel Depth As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean panelDepthAsStringESet;

	/**
	 * The default value of the '{@link #getPanelOperation() <em>Panel Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanelOperation()
	 * @generated
	 * @ordered
	 */
	protected static final IfcDoorPanelOperationEnum PANEL_OPERATION_EDEFAULT = IfcDoorPanelOperationEnum.NULL;

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
	protected static final double PANEL_WIDTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPanelWidth() <em>Panel Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanelWidth()
	 * @generated
	 * @ordered
	 */
	protected double panelWidth = PANEL_WIDTH_EDEFAULT;

	/**
	 * This is true if the Panel Width attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean panelWidthESet;

	/**
	 * The default value of the '{@link #getPanelWidthAsString() <em>Panel Width As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanelWidthAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String PANEL_WIDTH_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPanelWidthAsString() <em>Panel Width As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanelWidthAsString()
	 * @generated
	 * @ordered
	 */
	protected String panelWidthAsString = PANEL_WIDTH_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Panel Width As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean panelWidthAsStringESet;

	/**
	 * The default value of the '{@link #getPanelPosition() <em>Panel Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanelPosition()
	 * @generated
	 * @ordered
	 */
	protected static final IfcDoorPanelPositionEnum PANEL_POSITION_EDEFAULT = IfcDoorPanelPositionEnum.NULL;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcDoorPanelProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPanelDepth() {
		return panelDepth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPanelDepth(double newPanelDepth) {
		double oldPanelDepth = panelDepth;
		panelDepth = newPanelDepth;
		boolean oldPanelDepthESet = panelDepthESet;
		panelDepthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DOOR_PANEL_PROPERTIES__PANEL_DEPTH, oldPanelDepth, panelDepth, !oldPanelDepthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPanelDepth() {
		double oldPanelDepth = panelDepth;
		boolean oldPanelDepthESet = panelDepthESet;
		panelDepth = PANEL_DEPTH_EDEFAULT;
		panelDepthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_DOOR_PANEL_PROPERTIES__PANEL_DEPTH, oldPanelDepth, PANEL_DEPTH_EDEFAULT, oldPanelDepthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPanelDepth() {
		return panelDepthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPanelDepthAsString() {
		return panelDepthAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPanelDepthAsString(String newPanelDepthAsString) {
		String oldPanelDepthAsString = panelDepthAsString;
		panelDepthAsString = newPanelDepthAsString;
		boolean oldPanelDepthAsStringESet = panelDepthAsStringESet;
		panelDepthAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DOOR_PANEL_PROPERTIES__PANEL_DEPTH_AS_STRING, oldPanelDepthAsString, panelDepthAsString, !oldPanelDepthAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPanelDepthAsString() {
		String oldPanelDepthAsString = panelDepthAsString;
		boolean oldPanelDepthAsStringESet = panelDepthAsStringESet;
		panelDepthAsString = PANEL_DEPTH_AS_STRING_EDEFAULT;
		panelDepthAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_DOOR_PANEL_PROPERTIES__PANEL_DEPTH_AS_STRING, oldPanelDepthAsString, PANEL_DEPTH_AS_STRING_EDEFAULT, oldPanelDepthAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPanelDepthAsString() {
		return panelDepthAsStringESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DOOR_PANEL_PROPERTIES__PANEL_OPERATION, oldPanelOperation, panelOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPanelWidth() {
		return panelWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPanelWidth(double newPanelWidth) {
		double oldPanelWidth = panelWidth;
		panelWidth = newPanelWidth;
		boolean oldPanelWidthESet = panelWidthESet;
		panelWidthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DOOR_PANEL_PROPERTIES__PANEL_WIDTH, oldPanelWidth, panelWidth, !oldPanelWidthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPanelWidth() {
		double oldPanelWidth = panelWidth;
		boolean oldPanelWidthESet = panelWidthESet;
		panelWidth = PANEL_WIDTH_EDEFAULT;
		panelWidthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_DOOR_PANEL_PROPERTIES__PANEL_WIDTH, oldPanelWidth, PANEL_WIDTH_EDEFAULT, oldPanelWidthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPanelWidth() {
		return panelWidthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPanelWidthAsString() {
		return panelWidthAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPanelWidthAsString(String newPanelWidthAsString) {
		String oldPanelWidthAsString = panelWidthAsString;
		panelWidthAsString = newPanelWidthAsString;
		boolean oldPanelWidthAsStringESet = panelWidthAsStringESet;
		panelWidthAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DOOR_PANEL_PROPERTIES__PANEL_WIDTH_AS_STRING, oldPanelWidthAsString, panelWidthAsString, !oldPanelWidthAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPanelWidthAsString() {
		String oldPanelWidthAsString = panelWidthAsString;
		boolean oldPanelWidthAsStringESet = panelWidthAsStringESet;
		panelWidthAsString = PANEL_WIDTH_AS_STRING_EDEFAULT;
		panelWidthAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_DOOR_PANEL_PROPERTIES__PANEL_WIDTH_AS_STRING, oldPanelWidthAsString, PANEL_WIDTH_AS_STRING_EDEFAULT, oldPanelWidthAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPanelWidthAsString() {
		return panelWidthAsStringESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DOOR_PANEL_PROPERTIES__PANEL_POSITION, oldPanelPosition, panelPosition));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_DOOR_PANEL_PROPERTIES__SHAPE_ASPECT_STYLE, oldShapeAspectStyle, shapeAspectStyle));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DOOR_PANEL_PROPERTIES__SHAPE_ASPECT_STYLE, oldShapeAspectStyle, shapeAspectStyle, !oldShapeAspectStyleESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_DOOR_PANEL_PROPERTIES__SHAPE_ASPECT_STYLE, oldShapeAspectStyle, null, oldShapeAspectStyleESet));
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
			case Ifc2x3tc1Package.IFC_DOOR_PANEL_PROPERTIES__PANEL_DEPTH:
				return getPanelDepth();
			case Ifc2x3tc1Package.IFC_DOOR_PANEL_PROPERTIES__PANEL_DEPTH_AS_STRING:
				return getPanelDepthAsString();
			case Ifc2x3tc1Package.IFC_DOOR_PANEL_PROPERTIES__PANEL_OPERATION:
				return getPanelOperation();
			case Ifc2x3tc1Package.IFC_DOOR_PANEL_PROPERTIES__PANEL_WIDTH:
				return getPanelWidth();
			case Ifc2x3tc1Package.IFC_DOOR_PANEL_PROPERTIES__PANEL_WIDTH_AS_STRING:
				return getPanelWidthAsString();
			case Ifc2x3tc1Package.IFC_DOOR_PANEL_PROPERTIES__PANEL_POSITION:
				return getPanelPosition();
			case Ifc2x3tc1Package.IFC_DOOR_PANEL_PROPERTIES__SHAPE_ASPECT_STYLE:
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
			case Ifc2x3tc1Package.IFC_DOOR_PANEL_PROPERTIES__PANEL_DEPTH:
				setPanelDepth((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_DOOR_PANEL_PROPERTIES__PANEL_DEPTH_AS_STRING:
				setPanelDepthAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_DOOR_PANEL_PROPERTIES__PANEL_OPERATION:
				setPanelOperation((IfcDoorPanelOperationEnum)newValue);
				return;
			case Ifc2x3tc1Package.IFC_DOOR_PANEL_PROPERTIES__PANEL_WIDTH:
				setPanelWidth((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_DOOR_PANEL_PROPERTIES__PANEL_WIDTH_AS_STRING:
				setPanelWidthAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_DOOR_PANEL_PROPERTIES__PANEL_POSITION:
				setPanelPosition((IfcDoorPanelPositionEnum)newValue);
				return;
			case Ifc2x3tc1Package.IFC_DOOR_PANEL_PROPERTIES__SHAPE_ASPECT_STYLE:
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
			case Ifc2x3tc1Package.IFC_DOOR_PANEL_PROPERTIES__PANEL_DEPTH:
				unsetPanelDepth();
				return;
			case Ifc2x3tc1Package.IFC_DOOR_PANEL_PROPERTIES__PANEL_DEPTH_AS_STRING:
				unsetPanelDepthAsString();
				return;
			case Ifc2x3tc1Package.IFC_DOOR_PANEL_PROPERTIES__PANEL_OPERATION:
				setPanelOperation(PANEL_OPERATION_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_DOOR_PANEL_PROPERTIES__PANEL_WIDTH:
				unsetPanelWidth();
				return;
			case Ifc2x3tc1Package.IFC_DOOR_PANEL_PROPERTIES__PANEL_WIDTH_AS_STRING:
				unsetPanelWidthAsString();
				return;
			case Ifc2x3tc1Package.IFC_DOOR_PANEL_PROPERTIES__PANEL_POSITION:
				setPanelPosition(PANEL_POSITION_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_DOOR_PANEL_PROPERTIES__SHAPE_ASPECT_STYLE:
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
			case Ifc2x3tc1Package.IFC_DOOR_PANEL_PROPERTIES__PANEL_DEPTH:
				return isSetPanelDepth();
			case Ifc2x3tc1Package.IFC_DOOR_PANEL_PROPERTIES__PANEL_DEPTH_AS_STRING:
				return isSetPanelDepthAsString();
			case Ifc2x3tc1Package.IFC_DOOR_PANEL_PROPERTIES__PANEL_OPERATION:
				return panelOperation != PANEL_OPERATION_EDEFAULT;
			case Ifc2x3tc1Package.IFC_DOOR_PANEL_PROPERTIES__PANEL_WIDTH:
				return isSetPanelWidth();
			case Ifc2x3tc1Package.IFC_DOOR_PANEL_PROPERTIES__PANEL_WIDTH_AS_STRING:
				return isSetPanelWidthAsString();
			case Ifc2x3tc1Package.IFC_DOOR_PANEL_PROPERTIES__PANEL_POSITION:
				return panelPosition != PANEL_POSITION_EDEFAULT;
			case Ifc2x3tc1Package.IFC_DOOR_PANEL_PROPERTIES__SHAPE_ASPECT_STYLE:
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
		result.append(" (PanelDepth: ");
		if (panelDepthESet) result.append(panelDepth); else result.append("<unset>");
		result.append(", PanelDepthAsString: ");
		if (panelDepthAsStringESet) result.append(panelDepthAsString); else result.append("<unset>");
		result.append(", PanelOperation: ");
		result.append(panelOperation);
		result.append(", PanelWidth: ");
		if (panelWidthESet) result.append(panelWidth); else result.append("<unset>");
		result.append(", PanelWidthAsString: ");
		if (panelWidthAsStringESet) result.append(panelWidthAsString); else result.append("<unset>");
		result.append(", PanelPosition: ");
		result.append(panelPosition);
		result.append(')');
		return result.toString();
	}

} //IfcDoorPanelPropertiesImpl
