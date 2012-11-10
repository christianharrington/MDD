/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcDoorLiningProperties;
import ifc2x3tc1.IfcShapeAspect;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Door Lining Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcDoorLiningPropertiesImpl#getLiningDepth <em>Lining Depth</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcDoorLiningPropertiesImpl#getLiningDepthAsString <em>Lining Depth As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcDoorLiningPropertiesImpl#getLiningThickness <em>Lining Thickness</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcDoorLiningPropertiesImpl#getLiningThicknessAsString <em>Lining Thickness As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcDoorLiningPropertiesImpl#getThresholdDepth <em>Threshold Depth</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcDoorLiningPropertiesImpl#getThresholdDepthAsString <em>Threshold Depth As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcDoorLiningPropertiesImpl#getThresholdThickness <em>Threshold Thickness</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcDoorLiningPropertiesImpl#getThresholdThicknessAsString <em>Threshold Thickness As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcDoorLiningPropertiesImpl#getTransomThickness <em>Transom Thickness</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcDoorLiningPropertiesImpl#getTransomThicknessAsString <em>Transom Thickness As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcDoorLiningPropertiesImpl#getTransomOffset <em>Transom Offset</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcDoorLiningPropertiesImpl#getTransomOffsetAsString <em>Transom Offset As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcDoorLiningPropertiesImpl#getLiningOffset <em>Lining Offset</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcDoorLiningPropertiesImpl#getLiningOffsetAsString <em>Lining Offset As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcDoorLiningPropertiesImpl#getThresholdOffset <em>Threshold Offset</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcDoorLiningPropertiesImpl#getThresholdOffsetAsString <em>Threshold Offset As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcDoorLiningPropertiesImpl#getCasingThickness <em>Casing Thickness</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcDoorLiningPropertiesImpl#getCasingThicknessAsString <em>Casing Thickness As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcDoorLiningPropertiesImpl#getCasingDepth <em>Casing Depth</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcDoorLiningPropertiesImpl#getCasingDepthAsString <em>Casing Depth As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcDoorLiningPropertiesImpl#getShapeAspectStyle <em>Shape Aspect Style</em>}</li>
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
	protected static final double LINING_DEPTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLiningDepth() <em>Lining Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiningDepth()
	 * @generated
	 * @ordered
	 */
	protected double liningDepth = LINING_DEPTH_EDEFAULT;

	/**
	 * This is true if the Lining Depth attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean liningDepthESet;

	/**
	 * The default value of the '{@link #getLiningDepthAsString() <em>Lining Depth As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiningDepthAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String LINING_DEPTH_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLiningDepthAsString() <em>Lining Depth As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiningDepthAsString()
	 * @generated
	 * @ordered
	 */
	protected String liningDepthAsString = LINING_DEPTH_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Lining Depth As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean liningDepthAsStringESet;

	/**
	 * The default value of the '{@link #getLiningThickness() <em>Lining Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiningThickness()
	 * @generated
	 * @ordered
	 */
	protected static final double LINING_THICKNESS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLiningThickness() <em>Lining Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiningThickness()
	 * @generated
	 * @ordered
	 */
	protected double liningThickness = LINING_THICKNESS_EDEFAULT;

	/**
	 * This is true if the Lining Thickness attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean liningThicknessESet;

	/**
	 * The default value of the '{@link #getLiningThicknessAsString() <em>Lining Thickness As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiningThicknessAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String LINING_THICKNESS_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLiningThicknessAsString() <em>Lining Thickness As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiningThicknessAsString()
	 * @generated
	 * @ordered
	 */
	protected String liningThicknessAsString = LINING_THICKNESS_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Lining Thickness As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean liningThicknessAsStringESet;

	/**
	 * The default value of the '{@link #getThresholdDepth() <em>Threshold Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThresholdDepth()
	 * @generated
	 * @ordered
	 */
	protected static final double THRESHOLD_DEPTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getThresholdDepth() <em>Threshold Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThresholdDepth()
	 * @generated
	 * @ordered
	 */
	protected double thresholdDepth = THRESHOLD_DEPTH_EDEFAULT;

	/**
	 * This is true if the Threshold Depth attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean thresholdDepthESet;

	/**
	 * The default value of the '{@link #getThresholdDepthAsString() <em>Threshold Depth As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThresholdDepthAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String THRESHOLD_DEPTH_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThresholdDepthAsString() <em>Threshold Depth As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThresholdDepthAsString()
	 * @generated
	 * @ordered
	 */
	protected String thresholdDepthAsString = THRESHOLD_DEPTH_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Threshold Depth As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean thresholdDepthAsStringESet;

	/**
	 * The default value of the '{@link #getThresholdThickness() <em>Threshold Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThresholdThickness()
	 * @generated
	 * @ordered
	 */
	protected static final double THRESHOLD_THICKNESS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getThresholdThickness() <em>Threshold Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThresholdThickness()
	 * @generated
	 * @ordered
	 */
	protected double thresholdThickness = THRESHOLD_THICKNESS_EDEFAULT;

	/**
	 * This is true if the Threshold Thickness attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean thresholdThicknessESet;

	/**
	 * The default value of the '{@link #getThresholdThicknessAsString() <em>Threshold Thickness As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThresholdThicknessAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String THRESHOLD_THICKNESS_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThresholdThicknessAsString() <em>Threshold Thickness As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThresholdThicknessAsString()
	 * @generated
	 * @ordered
	 */
	protected String thresholdThicknessAsString = THRESHOLD_THICKNESS_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Threshold Thickness As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean thresholdThicknessAsStringESet;

	/**
	 * The default value of the '{@link #getTransomThickness() <em>Transom Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransomThickness()
	 * @generated
	 * @ordered
	 */
	protected static final double TRANSOM_THICKNESS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTransomThickness() <em>Transom Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransomThickness()
	 * @generated
	 * @ordered
	 */
	protected double transomThickness = TRANSOM_THICKNESS_EDEFAULT;

	/**
	 * This is true if the Transom Thickness attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean transomThicknessESet;

	/**
	 * The default value of the '{@link #getTransomThicknessAsString() <em>Transom Thickness As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransomThicknessAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSOM_THICKNESS_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransomThicknessAsString() <em>Transom Thickness As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransomThicknessAsString()
	 * @generated
	 * @ordered
	 */
	protected String transomThicknessAsString = TRANSOM_THICKNESS_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Transom Thickness As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean transomThicknessAsStringESet;

	/**
	 * The default value of the '{@link #getTransomOffset() <em>Transom Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransomOffset()
	 * @generated
	 * @ordered
	 */
	protected static final double TRANSOM_OFFSET_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTransomOffset() <em>Transom Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransomOffset()
	 * @generated
	 * @ordered
	 */
	protected double transomOffset = TRANSOM_OFFSET_EDEFAULT;

	/**
	 * This is true if the Transom Offset attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean transomOffsetESet;

	/**
	 * The default value of the '{@link #getTransomOffsetAsString() <em>Transom Offset As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransomOffsetAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSOM_OFFSET_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransomOffsetAsString() <em>Transom Offset As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransomOffsetAsString()
	 * @generated
	 * @ordered
	 */
	protected String transomOffsetAsString = TRANSOM_OFFSET_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Transom Offset As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean transomOffsetAsStringESet;

	/**
	 * The default value of the '{@link #getLiningOffset() <em>Lining Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiningOffset()
	 * @generated
	 * @ordered
	 */
	protected static final double LINING_OFFSET_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLiningOffset() <em>Lining Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiningOffset()
	 * @generated
	 * @ordered
	 */
	protected double liningOffset = LINING_OFFSET_EDEFAULT;

	/**
	 * This is true if the Lining Offset attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean liningOffsetESet;

	/**
	 * The default value of the '{@link #getLiningOffsetAsString() <em>Lining Offset As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiningOffsetAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String LINING_OFFSET_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLiningOffsetAsString() <em>Lining Offset As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiningOffsetAsString()
	 * @generated
	 * @ordered
	 */
	protected String liningOffsetAsString = LINING_OFFSET_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Lining Offset As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean liningOffsetAsStringESet;

	/**
	 * The default value of the '{@link #getThresholdOffset() <em>Threshold Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThresholdOffset()
	 * @generated
	 * @ordered
	 */
	protected static final double THRESHOLD_OFFSET_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getThresholdOffset() <em>Threshold Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThresholdOffset()
	 * @generated
	 * @ordered
	 */
	protected double thresholdOffset = THRESHOLD_OFFSET_EDEFAULT;

	/**
	 * This is true if the Threshold Offset attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean thresholdOffsetESet;

	/**
	 * The default value of the '{@link #getThresholdOffsetAsString() <em>Threshold Offset As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThresholdOffsetAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String THRESHOLD_OFFSET_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThresholdOffsetAsString() <em>Threshold Offset As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThresholdOffsetAsString()
	 * @generated
	 * @ordered
	 */
	protected String thresholdOffsetAsString = THRESHOLD_OFFSET_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Threshold Offset As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean thresholdOffsetAsStringESet;

	/**
	 * The default value of the '{@link #getCasingThickness() <em>Casing Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCasingThickness()
	 * @generated
	 * @ordered
	 */
	protected static final double CASING_THICKNESS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCasingThickness() <em>Casing Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCasingThickness()
	 * @generated
	 * @ordered
	 */
	protected double casingThickness = CASING_THICKNESS_EDEFAULT;

	/**
	 * This is true if the Casing Thickness attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean casingThicknessESet;

	/**
	 * The default value of the '{@link #getCasingThicknessAsString() <em>Casing Thickness As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCasingThicknessAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String CASING_THICKNESS_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCasingThicknessAsString() <em>Casing Thickness As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCasingThicknessAsString()
	 * @generated
	 * @ordered
	 */
	protected String casingThicknessAsString = CASING_THICKNESS_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Casing Thickness As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean casingThicknessAsStringESet;

	/**
	 * The default value of the '{@link #getCasingDepth() <em>Casing Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCasingDepth()
	 * @generated
	 * @ordered
	 */
	protected static final double CASING_DEPTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCasingDepth() <em>Casing Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCasingDepth()
	 * @generated
	 * @ordered
	 */
	protected double casingDepth = CASING_DEPTH_EDEFAULT;

	/**
	 * This is true if the Casing Depth attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean casingDepthESet;

	/**
	 * The default value of the '{@link #getCasingDepthAsString() <em>Casing Depth As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCasingDepthAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String CASING_DEPTH_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCasingDepthAsString() <em>Casing Depth As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCasingDepthAsString()
	 * @generated
	 * @ordered
	 */
	protected String casingDepthAsString = CASING_DEPTH_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Casing Depth As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean casingDepthAsStringESet;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcDoorLiningProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLiningDepth() {
		return liningDepth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLiningDepth(double newLiningDepth) {
		double oldLiningDepth = liningDepth;
		liningDepth = newLiningDepth;
		boolean oldLiningDepthESet = liningDepthESet;
		liningDepthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__LINING_DEPTH, oldLiningDepth, liningDepth, !oldLiningDepthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLiningDepth() {
		double oldLiningDepth = liningDepth;
		boolean oldLiningDepthESet = liningDepthESet;
		liningDepth = LINING_DEPTH_EDEFAULT;
		liningDepthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__LINING_DEPTH, oldLiningDepth, LINING_DEPTH_EDEFAULT, oldLiningDepthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLiningDepth() {
		return liningDepthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiningDepthAsString() {
		return liningDepthAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLiningDepthAsString(String newLiningDepthAsString) {
		String oldLiningDepthAsString = liningDepthAsString;
		liningDepthAsString = newLiningDepthAsString;
		boolean oldLiningDepthAsStringESet = liningDepthAsStringESet;
		liningDepthAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__LINING_DEPTH_AS_STRING, oldLiningDepthAsString, liningDepthAsString, !oldLiningDepthAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLiningDepthAsString() {
		String oldLiningDepthAsString = liningDepthAsString;
		boolean oldLiningDepthAsStringESet = liningDepthAsStringESet;
		liningDepthAsString = LINING_DEPTH_AS_STRING_EDEFAULT;
		liningDepthAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__LINING_DEPTH_AS_STRING, oldLiningDepthAsString, LINING_DEPTH_AS_STRING_EDEFAULT, oldLiningDepthAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLiningDepthAsString() {
		return liningDepthAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLiningThickness() {
		return liningThickness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLiningThickness(double newLiningThickness) {
		double oldLiningThickness = liningThickness;
		liningThickness = newLiningThickness;
		boolean oldLiningThicknessESet = liningThicknessESet;
		liningThicknessESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__LINING_THICKNESS, oldLiningThickness, liningThickness, !oldLiningThicknessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLiningThickness() {
		double oldLiningThickness = liningThickness;
		boolean oldLiningThicknessESet = liningThicknessESet;
		liningThickness = LINING_THICKNESS_EDEFAULT;
		liningThicknessESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__LINING_THICKNESS, oldLiningThickness, LINING_THICKNESS_EDEFAULT, oldLiningThicknessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLiningThickness() {
		return liningThicknessESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiningThicknessAsString() {
		return liningThicknessAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLiningThicknessAsString(String newLiningThicknessAsString) {
		String oldLiningThicknessAsString = liningThicknessAsString;
		liningThicknessAsString = newLiningThicknessAsString;
		boolean oldLiningThicknessAsStringESet = liningThicknessAsStringESet;
		liningThicknessAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__LINING_THICKNESS_AS_STRING, oldLiningThicknessAsString, liningThicknessAsString, !oldLiningThicknessAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLiningThicknessAsString() {
		String oldLiningThicknessAsString = liningThicknessAsString;
		boolean oldLiningThicknessAsStringESet = liningThicknessAsStringESet;
		liningThicknessAsString = LINING_THICKNESS_AS_STRING_EDEFAULT;
		liningThicknessAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__LINING_THICKNESS_AS_STRING, oldLiningThicknessAsString, LINING_THICKNESS_AS_STRING_EDEFAULT, oldLiningThicknessAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLiningThicknessAsString() {
		return liningThicknessAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getThresholdDepth() {
		return thresholdDepth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThresholdDepth(double newThresholdDepth) {
		double oldThresholdDepth = thresholdDepth;
		thresholdDepth = newThresholdDepth;
		boolean oldThresholdDepthESet = thresholdDepthESet;
		thresholdDepthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__THRESHOLD_DEPTH, oldThresholdDepth, thresholdDepth, !oldThresholdDepthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetThresholdDepth() {
		double oldThresholdDepth = thresholdDepth;
		boolean oldThresholdDepthESet = thresholdDepthESet;
		thresholdDepth = THRESHOLD_DEPTH_EDEFAULT;
		thresholdDepthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__THRESHOLD_DEPTH, oldThresholdDepth, THRESHOLD_DEPTH_EDEFAULT, oldThresholdDepthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetThresholdDepth() {
		return thresholdDepthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getThresholdDepthAsString() {
		return thresholdDepthAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThresholdDepthAsString(String newThresholdDepthAsString) {
		String oldThresholdDepthAsString = thresholdDepthAsString;
		thresholdDepthAsString = newThresholdDepthAsString;
		boolean oldThresholdDepthAsStringESet = thresholdDepthAsStringESet;
		thresholdDepthAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__THRESHOLD_DEPTH_AS_STRING, oldThresholdDepthAsString, thresholdDepthAsString, !oldThresholdDepthAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetThresholdDepthAsString() {
		String oldThresholdDepthAsString = thresholdDepthAsString;
		boolean oldThresholdDepthAsStringESet = thresholdDepthAsStringESet;
		thresholdDepthAsString = THRESHOLD_DEPTH_AS_STRING_EDEFAULT;
		thresholdDepthAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__THRESHOLD_DEPTH_AS_STRING, oldThresholdDepthAsString, THRESHOLD_DEPTH_AS_STRING_EDEFAULT, oldThresholdDepthAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetThresholdDepthAsString() {
		return thresholdDepthAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getThresholdThickness() {
		return thresholdThickness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThresholdThickness(double newThresholdThickness) {
		double oldThresholdThickness = thresholdThickness;
		thresholdThickness = newThresholdThickness;
		boolean oldThresholdThicknessESet = thresholdThicknessESet;
		thresholdThicknessESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__THRESHOLD_THICKNESS, oldThresholdThickness, thresholdThickness, !oldThresholdThicknessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetThresholdThickness() {
		double oldThresholdThickness = thresholdThickness;
		boolean oldThresholdThicknessESet = thresholdThicknessESet;
		thresholdThickness = THRESHOLD_THICKNESS_EDEFAULT;
		thresholdThicknessESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__THRESHOLD_THICKNESS, oldThresholdThickness, THRESHOLD_THICKNESS_EDEFAULT, oldThresholdThicknessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetThresholdThickness() {
		return thresholdThicknessESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getThresholdThicknessAsString() {
		return thresholdThicknessAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThresholdThicknessAsString(String newThresholdThicknessAsString) {
		String oldThresholdThicknessAsString = thresholdThicknessAsString;
		thresholdThicknessAsString = newThresholdThicknessAsString;
		boolean oldThresholdThicknessAsStringESet = thresholdThicknessAsStringESet;
		thresholdThicknessAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__THRESHOLD_THICKNESS_AS_STRING, oldThresholdThicknessAsString, thresholdThicknessAsString, !oldThresholdThicknessAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetThresholdThicknessAsString() {
		String oldThresholdThicknessAsString = thresholdThicknessAsString;
		boolean oldThresholdThicknessAsStringESet = thresholdThicknessAsStringESet;
		thresholdThicknessAsString = THRESHOLD_THICKNESS_AS_STRING_EDEFAULT;
		thresholdThicknessAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__THRESHOLD_THICKNESS_AS_STRING, oldThresholdThicknessAsString, THRESHOLD_THICKNESS_AS_STRING_EDEFAULT, oldThresholdThicknessAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetThresholdThicknessAsString() {
		return thresholdThicknessAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTransomThickness() {
		return transomThickness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransomThickness(double newTransomThickness) {
		double oldTransomThickness = transomThickness;
		transomThickness = newTransomThickness;
		boolean oldTransomThicknessESet = transomThicknessESet;
		transomThicknessESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__TRANSOM_THICKNESS, oldTransomThickness, transomThickness, !oldTransomThicknessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTransomThickness() {
		double oldTransomThickness = transomThickness;
		boolean oldTransomThicknessESet = transomThicknessESet;
		transomThickness = TRANSOM_THICKNESS_EDEFAULT;
		transomThicknessESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__TRANSOM_THICKNESS, oldTransomThickness, TRANSOM_THICKNESS_EDEFAULT, oldTransomThicknessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTransomThickness() {
		return transomThicknessESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransomThicknessAsString() {
		return transomThicknessAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransomThicknessAsString(String newTransomThicknessAsString) {
		String oldTransomThicknessAsString = transomThicknessAsString;
		transomThicknessAsString = newTransomThicknessAsString;
		boolean oldTransomThicknessAsStringESet = transomThicknessAsStringESet;
		transomThicknessAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__TRANSOM_THICKNESS_AS_STRING, oldTransomThicknessAsString, transomThicknessAsString, !oldTransomThicknessAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTransomThicknessAsString() {
		String oldTransomThicknessAsString = transomThicknessAsString;
		boolean oldTransomThicknessAsStringESet = transomThicknessAsStringESet;
		transomThicknessAsString = TRANSOM_THICKNESS_AS_STRING_EDEFAULT;
		transomThicknessAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__TRANSOM_THICKNESS_AS_STRING, oldTransomThicknessAsString, TRANSOM_THICKNESS_AS_STRING_EDEFAULT, oldTransomThicknessAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTransomThicknessAsString() {
		return transomThicknessAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTransomOffset() {
		return transomOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransomOffset(double newTransomOffset) {
		double oldTransomOffset = transomOffset;
		transomOffset = newTransomOffset;
		boolean oldTransomOffsetESet = transomOffsetESet;
		transomOffsetESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__TRANSOM_OFFSET, oldTransomOffset, transomOffset, !oldTransomOffsetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTransomOffset() {
		double oldTransomOffset = transomOffset;
		boolean oldTransomOffsetESet = transomOffsetESet;
		transomOffset = TRANSOM_OFFSET_EDEFAULT;
		transomOffsetESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__TRANSOM_OFFSET, oldTransomOffset, TRANSOM_OFFSET_EDEFAULT, oldTransomOffsetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTransomOffset() {
		return transomOffsetESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransomOffsetAsString() {
		return transomOffsetAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransomOffsetAsString(String newTransomOffsetAsString) {
		String oldTransomOffsetAsString = transomOffsetAsString;
		transomOffsetAsString = newTransomOffsetAsString;
		boolean oldTransomOffsetAsStringESet = transomOffsetAsStringESet;
		transomOffsetAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__TRANSOM_OFFSET_AS_STRING, oldTransomOffsetAsString, transomOffsetAsString, !oldTransomOffsetAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTransomOffsetAsString() {
		String oldTransomOffsetAsString = transomOffsetAsString;
		boolean oldTransomOffsetAsStringESet = transomOffsetAsStringESet;
		transomOffsetAsString = TRANSOM_OFFSET_AS_STRING_EDEFAULT;
		transomOffsetAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__TRANSOM_OFFSET_AS_STRING, oldTransomOffsetAsString, TRANSOM_OFFSET_AS_STRING_EDEFAULT, oldTransomOffsetAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTransomOffsetAsString() {
		return transomOffsetAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLiningOffset() {
		return liningOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLiningOffset(double newLiningOffset) {
		double oldLiningOffset = liningOffset;
		liningOffset = newLiningOffset;
		boolean oldLiningOffsetESet = liningOffsetESet;
		liningOffsetESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__LINING_OFFSET, oldLiningOffset, liningOffset, !oldLiningOffsetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLiningOffset() {
		double oldLiningOffset = liningOffset;
		boolean oldLiningOffsetESet = liningOffsetESet;
		liningOffset = LINING_OFFSET_EDEFAULT;
		liningOffsetESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__LINING_OFFSET, oldLiningOffset, LINING_OFFSET_EDEFAULT, oldLiningOffsetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLiningOffset() {
		return liningOffsetESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiningOffsetAsString() {
		return liningOffsetAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLiningOffsetAsString(String newLiningOffsetAsString) {
		String oldLiningOffsetAsString = liningOffsetAsString;
		liningOffsetAsString = newLiningOffsetAsString;
		boolean oldLiningOffsetAsStringESet = liningOffsetAsStringESet;
		liningOffsetAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__LINING_OFFSET_AS_STRING, oldLiningOffsetAsString, liningOffsetAsString, !oldLiningOffsetAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLiningOffsetAsString() {
		String oldLiningOffsetAsString = liningOffsetAsString;
		boolean oldLiningOffsetAsStringESet = liningOffsetAsStringESet;
		liningOffsetAsString = LINING_OFFSET_AS_STRING_EDEFAULT;
		liningOffsetAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__LINING_OFFSET_AS_STRING, oldLiningOffsetAsString, LINING_OFFSET_AS_STRING_EDEFAULT, oldLiningOffsetAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLiningOffsetAsString() {
		return liningOffsetAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getThresholdOffset() {
		return thresholdOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThresholdOffset(double newThresholdOffset) {
		double oldThresholdOffset = thresholdOffset;
		thresholdOffset = newThresholdOffset;
		boolean oldThresholdOffsetESet = thresholdOffsetESet;
		thresholdOffsetESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__THRESHOLD_OFFSET, oldThresholdOffset, thresholdOffset, !oldThresholdOffsetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetThresholdOffset() {
		double oldThresholdOffset = thresholdOffset;
		boolean oldThresholdOffsetESet = thresholdOffsetESet;
		thresholdOffset = THRESHOLD_OFFSET_EDEFAULT;
		thresholdOffsetESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__THRESHOLD_OFFSET, oldThresholdOffset, THRESHOLD_OFFSET_EDEFAULT, oldThresholdOffsetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetThresholdOffset() {
		return thresholdOffsetESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getThresholdOffsetAsString() {
		return thresholdOffsetAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThresholdOffsetAsString(String newThresholdOffsetAsString) {
		String oldThresholdOffsetAsString = thresholdOffsetAsString;
		thresholdOffsetAsString = newThresholdOffsetAsString;
		boolean oldThresholdOffsetAsStringESet = thresholdOffsetAsStringESet;
		thresholdOffsetAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__THRESHOLD_OFFSET_AS_STRING, oldThresholdOffsetAsString, thresholdOffsetAsString, !oldThresholdOffsetAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetThresholdOffsetAsString() {
		String oldThresholdOffsetAsString = thresholdOffsetAsString;
		boolean oldThresholdOffsetAsStringESet = thresholdOffsetAsStringESet;
		thresholdOffsetAsString = THRESHOLD_OFFSET_AS_STRING_EDEFAULT;
		thresholdOffsetAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__THRESHOLD_OFFSET_AS_STRING, oldThresholdOffsetAsString, THRESHOLD_OFFSET_AS_STRING_EDEFAULT, oldThresholdOffsetAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetThresholdOffsetAsString() {
		return thresholdOffsetAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCasingThickness() {
		return casingThickness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCasingThickness(double newCasingThickness) {
		double oldCasingThickness = casingThickness;
		casingThickness = newCasingThickness;
		boolean oldCasingThicknessESet = casingThicknessESet;
		casingThicknessESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__CASING_THICKNESS, oldCasingThickness, casingThickness, !oldCasingThicknessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCasingThickness() {
		double oldCasingThickness = casingThickness;
		boolean oldCasingThicknessESet = casingThicknessESet;
		casingThickness = CASING_THICKNESS_EDEFAULT;
		casingThicknessESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__CASING_THICKNESS, oldCasingThickness, CASING_THICKNESS_EDEFAULT, oldCasingThicknessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCasingThickness() {
		return casingThicknessESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCasingThicknessAsString() {
		return casingThicknessAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCasingThicknessAsString(String newCasingThicknessAsString) {
		String oldCasingThicknessAsString = casingThicknessAsString;
		casingThicknessAsString = newCasingThicknessAsString;
		boolean oldCasingThicknessAsStringESet = casingThicknessAsStringESet;
		casingThicknessAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__CASING_THICKNESS_AS_STRING, oldCasingThicknessAsString, casingThicknessAsString, !oldCasingThicknessAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCasingThicknessAsString() {
		String oldCasingThicknessAsString = casingThicknessAsString;
		boolean oldCasingThicknessAsStringESet = casingThicknessAsStringESet;
		casingThicknessAsString = CASING_THICKNESS_AS_STRING_EDEFAULT;
		casingThicknessAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__CASING_THICKNESS_AS_STRING, oldCasingThicknessAsString, CASING_THICKNESS_AS_STRING_EDEFAULT, oldCasingThicknessAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCasingThicknessAsString() {
		return casingThicknessAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCasingDepth() {
		return casingDepth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCasingDepth(double newCasingDepth) {
		double oldCasingDepth = casingDepth;
		casingDepth = newCasingDepth;
		boolean oldCasingDepthESet = casingDepthESet;
		casingDepthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__CASING_DEPTH, oldCasingDepth, casingDepth, !oldCasingDepthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCasingDepth() {
		double oldCasingDepth = casingDepth;
		boolean oldCasingDepthESet = casingDepthESet;
		casingDepth = CASING_DEPTH_EDEFAULT;
		casingDepthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__CASING_DEPTH, oldCasingDepth, CASING_DEPTH_EDEFAULT, oldCasingDepthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCasingDepth() {
		return casingDepthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCasingDepthAsString() {
		return casingDepthAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCasingDepthAsString(String newCasingDepthAsString) {
		String oldCasingDepthAsString = casingDepthAsString;
		casingDepthAsString = newCasingDepthAsString;
		boolean oldCasingDepthAsStringESet = casingDepthAsStringESet;
		casingDepthAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__CASING_DEPTH_AS_STRING, oldCasingDepthAsString, casingDepthAsString, !oldCasingDepthAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCasingDepthAsString() {
		String oldCasingDepthAsString = casingDepthAsString;
		boolean oldCasingDepthAsStringESet = casingDepthAsStringESet;
		casingDepthAsString = CASING_DEPTH_AS_STRING_EDEFAULT;
		casingDepthAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__CASING_DEPTH_AS_STRING, oldCasingDepthAsString, CASING_DEPTH_AS_STRING_EDEFAULT, oldCasingDepthAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCasingDepthAsString() {
		return casingDepthAsStringESet;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__SHAPE_ASPECT_STYLE, oldShapeAspectStyle, shapeAspectStyle));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__SHAPE_ASPECT_STYLE, oldShapeAspectStyle, shapeAspectStyle, !oldShapeAspectStyleESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__SHAPE_ASPECT_STYLE, oldShapeAspectStyle, null, oldShapeAspectStyleESet));
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
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__LINING_DEPTH:
				return getLiningDepth();
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__LINING_DEPTH_AS_STRING:
				return getLiningDepthAsString();
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__LINING_THICKNESS:
				return getLiningThickness();
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__LINING_THICKNESS_AS_STRING:
				return getLiningThicknessAsString();
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__THRESHOLD_DEPTH:
				return getThresholdDepth();
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__THRESHOLD_DEPTH_AS_STRING:
				return getThresholdDepthAsString();
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__THRESHOLD_THICKNESS:
				return getThresholdThickness();
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__THRESHOLD_THICKNESS_AS_STRING:
				return getThresholdThicknessAsString();
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__TRANSOM_THICKNESS:
				return getTransomThickness();
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__TRANSOM_THICKNESS_AS_STRING:
				return getTransomThicknessAsString();
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__TRANSOM_OFFSET:
				return getTransomOffset();
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__TRANSOM_OFFSET_AS_STRING:
				return getTransomOffsetAsString();
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__LINING_OFFSET:
				return getLiningOffset();
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__LINING_OFFSET_AS_STRING:
				return getLiningOffsetAsString();
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__THRESHOLD_OFFSET:
				return getThresholdOffset();
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__THRESHOLD_OFFSET_AS_STRING:
				return getThresholdOffsetAsString();
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__CASING_THICKNESS:
				return getCasingThickness();
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__CASING_THICKNESS_AS_STRING:
				return getCasingThicknessAsString();
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__CASING_DEPTH:
				return getCasingDepth();
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__CASING_DEPTH_AS_STRING:
				return getCasingDepthAsString();
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__SHAPE_ASPECT_STYLE:
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
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__LINING_DEPTH:
				setLiningDepth((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__LINING_DEPTH_AS_STRING:
				setLiningDepthAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__LINING_THICKNESS:
				setLiningThickness((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__LINING_THICKNESS_AS_STRING:
				setLiningThicknessAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__THRESHOLD_DEPTH:
				setThresholdDepth((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__THRESHOLD_DEPTH_AS_STRING:
				setThresholdDepthAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__THRESHOLD_THICKNESS:
				setThresholdThickness((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__THRESHOLD_THICKNESS_AS_STRING:
				setThresholdThicknessAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__TRANSOM_THICKNESS:
				setTransomThickness((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__TRANSOM_THICKNESS_AS_STRING:
				setTransomThicknessAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__TRANSOM_OFFSET:
				setTransomOffset((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__TRANSOM_OFFSET_AS_STRING:
				setTransomOffsetAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__LINING_OFFSET:
				setLiningOffset((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__LINING_OFFSET_AS_STRING:
				setLiningOffsetAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__THRESHOLD_OFFSET:
				setThresholdOffset((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__THRESHOLD_OFFSET_AS_STRING:
				setThresholdOffsetAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__CASING_THICKNESS:
				setCasingThickness((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__CASING_THICKNESS_AS_STRING:
				setCasingThicknessAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__CASING_DEPTH:
				setCasingDepth((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__CASING_DEPTH_AS_STRING:
				setCasingDepthAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__SHAPE_ASPECT_STYLE:
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
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__LINING_DEPTH:
				unsetLiningDepth();
				return;
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__LINING_DEPTH_AS_STRING:
				unsetLiningDepthAsString();
				return;
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__LINING_THICKNESS:
				unsetLiningThickness();
				return;
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__LINING_THICKNESS_AS_STRING:
				unsetLiningThicknessAsString();
				return;
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__THRESHOLD_DEPTH:
				unsetThresholdDepth();
				return;
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__THRESHOLD_DEPTH_AS_STRING:
				unsetThresholdDepthAsString();
				return;
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__THRESHOLD_THICKNESS:
				unsetThresholdThickness();
				return;
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__THRESHOLD_THICKNESS_AS_STRING:
				unsetThresholdThicknessAsString();
				return;
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__TRANSOM_THICKNESS:
				unsetTransomThickness();
				return;
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__TRANSOM_THICKNESS_AS_STRING:
				unsetTransomThicknessAsString();
				return;
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__TRANSOM_OFFSET:
				unsetTransomOffset();
				return;
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__TRANSOM_OFFSET_AS_STRING:
				unsetTransomOffsetAsString();
				return;
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__LINING_OFFSET:
				unsetLiningOffset();
				return;
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__LINING_OFFSET_AS_STRING:
				unsetLiningOffsetAsString();
				return;
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__THRESHOLD_OFFSET:
				unsetThresholdOffset();
				return;
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__THRESHOLD_OFFSET_AS_STRING:
				unsetThresholdOffsetAsString();
				return;
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__CASING_THICKNESS:
				unsetCasingThickness();
				return;
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__CASING_THICKNESS_AS_STRING:
				unsetCasingThicknessAsString();
				return;
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__CASING_DEPTH:
				unsetCasingDepth();
				return;
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__CASING_DEPTH_AS_STRING:
				unsetCasingDepthAsString();
				return;
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__SHAPE_ASPECT_STYLE:
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
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__LINING_DEPTH:
				return isSetLiningDepth();
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__LINING_DEPTH_AS_STRING:
				return isSetLiningDepthAsString();
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__LINING_THICKNESS:
				return isSetLiningThickness();
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__LINING_THICKNESS_AS_STRING:
				return isSetLiningThicknessAsString();
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__THRESHOLD_DEPTH:
				return isSetThresholdDepth();
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__THRESHOLD_DEPTH_AS_STRING:
				return isSetThresholdDepthAsString();
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__THRESHOLD_THICKNESS:
				return isSetThresholdThickness();
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__THRESHOLD_THICKNESS_AS_STRING:
				return isSetThresholdThicknessAsString();
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__TRANSOM_THICKNESS:
				return isSetTransomThickness();
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__TRANSOM_THICKNESS_AS_STRING:
				return isSetTransomThicknessAsString();
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__TRANSOM_OFFSET:
				return isSetTransomOffset();
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__TRANSOM_OFFSET_AS_STRING:
				return isSetTransomOffsetAsString();
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__LINING_OFFSET:
				return isSetLiningOffset();
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__LINING_OFFSET_AS_STRING:
				return isSetLiningOffsetAsString();
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__THRESHOLD_OFFSET:
				return isSetThresholdOffset();
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__THRESHOLD_OFFSET_AS_STRING:
				return isSetThresholdOffsetAsString();
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__CASING_THICKNESS:
				return isSetCasingThickness();
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__CASING_THICKNESS_AS_STRING:
				return isSetCasingThicknessAsString();
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__CASING_DEPTH:
				return isSetCasingDepth();
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__CASING_DEPTH_AS_STRING:
				return isSetCasingDepthAsString();
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__SHAPE_ASPECT_STYLE:
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
		result.append(" (LiningDepth: ");
		if (liningDepthESet) result.append(liningDepth); else result.append("<unset>");
		result.append(", LiningDepthAsString: ");
		if (liningDepthAsStringESet) result.append(liningDepthAsString); else result.append("<unset>");
		result.append(", LiningThickness: ");
		if (liningThicknessESet) result.append(liningThickness); else result.append("<unset>");
		result.append(", LiningThicknessAsString: ");
		if (liningThicknessAsStringESet) result.append(liningThicknessAsString); else result.append("<unset>");
		result.append(", ThresholdDepth: ");
		if (thresholdDepthESet) result.append(thresholdDepth); else result.append("<unset>");
		result.append(", ThresholdDepthAsString: ");
		if (thresholdDepthAsStringESet) result.append(thresholdDepthAsString); else result.append("<unset>");
		result.append(", ThresholdThickness: ");
		if (thresholdThicknessESet) result.append(thresholdThickness); else result.append("<unset>");
		result.append(", ThresholdThicknessAsString: ");
		if (thresholdThicknessAsStringESet) result.append(thresholdThicknessAsString); else result.append("<unset>");
		result.append(", TransomThickness: ");
		if (transomThicknessESet) result.append(transomThickness); else result.append("<unset>");
		result.append(", TransomThicknessAsString: ");
		if (transomThicknessAsStringESet) result.append(transomThicknessAsString); else result.append("<unset>");
		result.append(", TransomOffset: ");
		if (transomOffsetESet) result.append(transomOffset); else result.append("<unset>");
		result.append(", TransomOffsetAsString: ");
		if (transomOffsetAsStringESet) result.append(transomOffsetAsString); else result.append("<unset>");
		result.append(", LiningOffset: ");
		if (liningOffsetESet) result.append(liningOffset); else result.append("<unset>");
		result.append(", LiningOffsetAsString: ");
		if (liningOffsetAsStringESet) result.append(liningOffsetAsString); else result.append("<unset>");
		result.append(", ThresholdOffset: ");
		if (thresholdOffsetESet) result.append(thresholdOffset); else result.append("<unset>");
		result.append(", ThresholdOffsetAsString: ");
		if (thresholdOffsetAsStringESet) result.append(thresholdOffsetAsString); else result.append("<unset>");
		result.append(", CasingThickness: ");
		if (casingThicknessESet) result.append(casingThickness); else result.append("<unset>");
		result.append(", CasingThicknessAsString: ");
		if (casingThicknessAsStringESet) result.append(casingThicknessAsString); else result.append("<unset>");
		result.append(", CasingDepth: ");
		if (casingDepthESet) result.append(casingDepth); else result.append("<unset>");
		result.append(", CasingDepthAsString: ");
		if (casingDepthAsStringESet) result.append(casingDepthAsString); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcDoorLiningPropertiesImpl
