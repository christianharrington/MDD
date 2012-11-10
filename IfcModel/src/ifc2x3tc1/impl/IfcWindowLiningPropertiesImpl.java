/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcShapeAspect;
import ifc2x3tc1.IfcWindowLiningProperties;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Window Lining Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcWindowLiningPropertiesImpl#getLiningDepth <em>Lining Depth</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcWindowLiningPropertiesImpl#getLiningDepthAsString <em>Lining Depth As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcWindowLiningPropertiesImpl#getLiningThickness <em>Lining Thickness</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcWindowLiningPropertiesImpl#getLiningThicknessAsString <em>Lining Thickness As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcWindowLiningPropertiesImpl#getTransomThickness <em>Transom Thickness</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcWindowLiningPropertiesImpl#getTransomThicknessAsString <em>Transom Thickness As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcWindowLiningPropertiesImpl#getMullionThickness <em>Mullion Thickness</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcWindowLiningPropertiesImpl#getMullionThicknessAsString <em>Mullion Thickness As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcWindowLiningPropertiesImpl#getFirstTransomOffset <em>First Transom Offset</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcWindowLiningPropertiesImpl#getFirstTransomOffsetAsString <em>First Transom Offset As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcWindowLiningPropertiesImpl#getSecondTransomOffset <em>Second Transom Offset</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcWindowLiningPropertiesImpl#getSecondTransomOffsetAsString <em>Second Transom Offset As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcWindowLiningPropertiesImpl#getFirstMullionOffset <em>First Mullion Offset</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcWindowLiningPropertiesImpl#getFirstMullionOffsetAsString <em>First Mullion Offset As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcWindowLiningPropertiesImpl#getSecondMullionOffset <em>Second Mullion Offset</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcWindowLiningPropertiesImpl#getSecondMullionOffsetAsString <em>Second Mullion Offset As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcWindowLiningPropertiesImpl#getShapeAspectStyle <em>Shape Aspect Style</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcWindowLiningPropertiesImpl extends IfcPropertySetDefinitionImpl implements IfcWindowLiningProperties {
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
	 * The default value of the '{@link #getMullionThickness() <em>Mullion Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMullionThickness()
	 * @generated
	 * @ordered
	 */
	protected static final double MULLION_THICKNESS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMullionThickness() <em>Mullion Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMullionThickness()
	 * @generated
	 * @ordered
	 */
	protected double mullionThickness = MULLION_THICKNESS_EDEFAULT;

	/**
	 * This is true if the Mullion Thickness attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mullionThicknessESet;

	/**
	 * The default value of the '{@link #getMullionThicknessAsString() <em>Mullion Thickness As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMullionThicknessAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String MULLION_THICKNESS_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMullionThicknessAsString() <em>Mullion Thickness As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMullionThicknessAsString()
	 * @generated
	 * @ordered
	 */
	protected String mullionThicknessAsString = MULLION_THICKNESS_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Mullion Thickness As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mullionThicknessAsStringESet;

	/**
	 * The default value of the '{@link #getFirstTransomOffset() <em>First Transom Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstTransomOffset()
	 * @generated
	 * @ordered
	 */
	protected static final double FIRST_TRANSOM_OFFSET_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFirstTransomOffset() <em>First Transom Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstTransomOffset()
	 * @generated
	 * @ordered
	 */
	protected double firstTransomOffset = FIRST_TRANSOM_OFFSET_EDEFAULT;

	/**
	 * This is true if the First Transom Offset attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean firstTransomOffsetESet;

	/**
	 * The default value of the '{@link #getFirstTransomOffsetAsString() <em>First Transom Offset As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstTransomOffsetAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_TRANSOM_OFFSET_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstTransomOffsetAsString() <em>First Transom Offset As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstTransomOffsetAsString()
	 * @generated
	 * @ordered
	 */
	protected String firstTransomOffsetAsString = FIRST_TRANSOM_OFFSET_AS_STRING_EDEFAULT;

	/**
	 * This is true if the First Transom Offset As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean firstTransomOffsetAsStringESet;

	/**
	 * The default value of the '{@link #getSecondTransomOffset() <em>Second Transom Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondTransomOffset()
	 * @generated
	 * @ordered
	 */
	protected static final double SECOND_TRANSOM_OFFSET_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSecondTransomOffset() <em>Second Transom Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondTransomOffset()
	 * @generated
	 * @ordered
	 */
	protected double secondTransomOffset = SECOND_TRANSOM_OFFSET_EDEFAULT;

	/**
	 * This is true if the Second Transom Offset attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean secondTransomOffsetESet;

	/**
	 * The default value of the '{@link #getSecondTransomOffsetAsString() <em>Second Transom Offset As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondTransomOffsetAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String SECOND_TRANSOM_OFFSET_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecondTransomOffsetAsString() <em>Second Transom Offset As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondTransomOffsetAsString()
	 * @generated
	 * @ordered
	 */
	protected String secondTransomOffsetAsString = SECOND_TRANSOM_OFFSET_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Second Transom Offset As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean secondTransomOffsetAsStringESet;

	/**
	 * The default value of the '{@link #getFirstMullionOffset() <em>First Mullion Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstMullionOffset()
	 * @generated
	 * @ordered
	 */
	protected static final double FIRST_MULLION_OFFSET_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFirstMullionOffset() <em>First Mullion Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstMullionOffset()
	 * @generated
	 * @ordered
	 */
	protected double firstMullionOffset = FIRST_MULLION_OFFSET_EDEFAULT;

	/**
	 * This is true if the First Mullion Offset attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean firstMullionOffsetESet;

	/**
	 * The default value of the '{@link #getFirstMullionOffsetAsString() <em>First Mullion Offset As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstMullionOffsetAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_MULLION_OFFSET_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstMullionOffsetAsString() <em>First Mullion Offset As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstMullionOffsetAsString()
	 * @generated
	 * @ordered
	 */
	protected String firstMullionOffsetAsString = FIRST_MULLION_OFFSET_AS_STRING_EDEFAULT;

	/**
	 * This is true if the First Mullion Offset As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean firstMullionOffsetAsStringESet;

	/**
	 * The default value of the '{@link #getSecondMullionOffset() <em>Second Mullion Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondMullionOffset()
	 * @generated
	 * @ordered
	 */
	protected static final double SECOND_MULLION_OFFSET_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSecondMullionOffset() <em>Second Mullion Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondMullionOffset()
	 * @generated
	 * @ordered
	 */
	protected double secondMullionOffset = SECOND_MULLION_OFFSET_EDEFAULT;

	/**
	 * This is true if the Second Mullion Offset attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean secondMullionOffsetESet;

	/**
	 * The default value of the '{@link #getSecondMullionOffsetAsString() <em>Second Mullion Offset As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondMullionOffsetAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String SECOND_MULLION_OFFSET_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecondMullionOffsetAsString() <em>Second Mullion Offset As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondMullionOffsetAsString()
	 * @generated
	 * @ordered
	 */
	protected String secondMullionOffsetAsString = SECOND_MULLION_OFFSET_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Second Mullion Offset As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean secondMullionOffsetAsStringESet;

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
	protected IfcWindowLiningPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties();
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__LINING_DEPTH, oldLiningDepth, liningDepth, !oldLiningDepthESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__LINING_DEPTH, oldLiningDepth, LINING_DEPTH_EDEFAULT, oldLiningDepthESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__LINING_DEPTH_AS_STRING, oldLiningDepthAsString, liningDepthAsString, !oldLiningDepthAsStringESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__LINING_DEPTH_AS_STRING, oldLiningDepthAsString, LINING_DEPTH_AS_STRING_EDEFAULT, oldLiningDepthAsStringESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__LINING_THICKNESS, oldLiningThickness, liningThickness, !oldLiningThicknessESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__LINING_THICKNESS, oldLiningThickness, LINING_THICKNESS_EDEFAULT, oldLiningThicknessESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__LINING_THICKNESS_AS_STRING, oldLiningThicknessAsString, liningThicknessAsString, !oldLiningThicknessAsStringESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__LINING_THICKNESS_AS_STRING, oldLiningThicknessAsString, LINING_THICKNESS_AS_STRING_EDEFAULT, oldLiningThicknessAsStringESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__TRANSOM_THICKNESS, oldTransomThickness, transomThickness, !oldTransomThicknessESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__TRANSOM_THICKNESS, oldTransomThickness, TRANSOM_THICKNESS_EDEFAULT, oldTransomThicknessESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__TRANSOM_THICKNESS_AS_STRING, oldTransomThicknessAsString, transomThicknessAsString, !oldTransomThicknessAsStringESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__TRANSOM_THICKNESS_AS_STRING, oldTransomThicknessAsString, TRANSOM_THICKNESS_AS_STRING_EDEFAULT, oldTransomThicknessAsStringESet));
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
	public double getMullionThickness() {
		return mullionThickness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMullionThickness(double newMullionThickness) {
		double oldMullionThickness = mullionThickness;
		mullionThickness = newMullionThickness;
		boolean oldMullionThicknessESet = mullionThicknessESet;
		mullionThicknessESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__MULLION_THICKNESS, oldMullionThickness, mullionThickness, !oldMullionThicknessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMullionThickness() {
		double oldMullionThickness = mullionThickness;
		boolean oldMullionThicknessESet = mullionThicknessESet;
		mullionThickness = MULLION_THICKNESS_EDEFAULT;
		mullionThicknessESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__MULLION_THICKNESS, oldMullionThickness, MULLION_THICKNESS_EDEFAULT, oldMullionThicknessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMullionThickness() {
		return mullionThicknessESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMullionThicknessAsString() {
		return mullionThicknessAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMullionThicknessAsString(String newMullionThicknessAsString) {
		String oldMullionThicknessAsString = mullionThicknessAsString;
		mullionThicknessAsString = newMullionThicknessAsString;
		boolean oldMullionThicknessAsStringESet = mullionThicknessAsStringESet;
		mullionThicknessAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__MULLION_THICKNESS_AS_STRING, oldMullionThicknessAsString, mullionThicknessAsString, !oldMullionThicknessAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMullionThicknessAsString() {
		String oldMullionThicknessAsString = mullionThicknessAsString;
		boolean oldMullionThicknessAsStringESet = mullionThicknessAsStringESet;
		mullionThicknessAsString = MULLION_THICKNESS_AS_STRING_EDEFAULT;
		mullionThicknessAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__MULLION_THICKNESS_AS_STRING, oldMullionThicknessAsString, MULLION_THICKNESS_AS_STRING_EDEFAULT, oldMullionThicknessAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMullionThicknessAsString() {
		return mullionThicknessAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFirstTransomOffset() {
		return firstTransomOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstTransomOffset(double newFirstTransomOffset) {
		double oldFirstTransomOffset = firstTransomOffset;
		firstTransomOffset = newFirstTransomOffset;
		boolean oldFirstTransomOffsetESet = firstTransomOffsetESet;
		firstTransomOffsetESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__FIRST_TRANSOM_OFFSET, oldFirstTransomOffset, firstTransomOffset, !oldFirstTransomOffsetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFirstTransomOffset() {
		double oldFirstTransomOffset = firstTransomOffset;
		boolean oldFirstTransomOffsetESet = firstTransomOffsetESet;
		firstTransomOffset = FIRST_TRANSOM_OFFSET_EDEFAULT;
		firstTransomOffsetESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__FIRST_TRANSOM_OFFSET, oldFirstTransomOffset, FIRST_TRANSOM_OFFSET_EDEFAULT, oldFirstTransomOffsetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFirstTransomOffset() {
		return firstTransomOffsetESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstTransomOffsetAsString() {
		return firstTransomOffsetAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstTransomOffsetAsString(String newFirstTransomOffsetAsString) {
		String oldFirstTransomOffsetAsString = firstTransomOffsetAsString;
		firstTransomOffsetAsString = newFirstTransomOffsetAsString;
		boolean oldFirstTransomOffsetAsStringESet = firstTransomOffsetAsStringESet;
		firstTransomOffsetAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__FIRST_TRANSOM_OFFSET_AS_STRING, oldFirstTransomOffsetAsString, firstTransomOffsetAsString, !oldFirstTransomOffsetAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFirstTransomOffsetAsString() {
		String oldFirstTransomOffsetAsString = firstTransomOffsetAsString;
		boolean oldFirstTransomOffsetAsStringESet = firstTransomOffsetAsStringESet;
		firstTransomOffsetAsString = FIRST_TRANSOM_OFFSET_AS_STRING_EDEFAULT;
		firstTransomOffsetAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__FIRST_TRANSOM_OFFSET_AS_STRING, oldFirstTransomOffsetAsString, FIRST_TRANSOM_OFFSET_AS_STRING_EDEFAULT, oldFirstTransomOffsetAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFirstTransomOffsetAsString() {
		return firstTransomOffsetAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSecondTransomOffset() {
		return secondTransomOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondTransomOffset(double newSecondTransomOffset) {
		double oldSecondTransomOffset = secondTransomOffset;
		secondTransomOffset = newSecondTransomOffset;
		boolean oldSecondTransomOffsetESet = secondTransomOffsetESet;
		secondTransomOffsetESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__SECOND_TRANSOM_OFFSET, oldSecondTransomOffset, secondTransomOffset, !oldSecondTransomOffsetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSecondTransomOffset() {
		double oldSecondTransomOffset = secondTransomOffset;
		boolean oldSecondTransomOffsetESet = secondTransomOffsetESet;
		secondTransomOffset = SECOND_TRANSOM_OFFSET_EDEFAULT;
		secondTransomOffsetESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__SECOND_TRANSOM_OFFSET, oldSecondTransomOffset, SECOND_TRANSOM_OFFSET_EDEFAULT, oldSecondTransomOffsetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSecondTransomOffset() {
		return secondTransomOffsetESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecondTransomOffsetAsString() {
		return secondTransomOffsetAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondTransomOffsetAsString(String newSecondTransomOffsetAsString) {
		String oldSecondTransomOffsetAsString = secondTransomOffsetAsString;
		secondTransomOffsetAsString = newSecondTransomOffsetAsString;
		boolean oldSecondTransomOffsetAsStringESet = secondTransomOffsetAsStringESet;
		secondTransomOffsetAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__SECOND_TRANSOM_OFFSET_AS_STRING, oldSecondTransomOffsetAsString, secondTransomOffsetAsString, !oldSecondTransomOffsetAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSecondTransomOffsetAsString() {
		String oldSecondTransomOffsetAsString = secondTransomOffsetAsString;
		boolean oldSecondTransomOffsetAsStringESet = secondTransomOffsetAsStringESet;
		secondTransomOffsetAsString = SECOND_TRANSOM_OFFSET_AS_STRING_EDEFAULT;
		secondTransomOffsetAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__SECOND_TRANSOM_OFFSET_AS_STRING, oldSecondTransomOffsetAsString, SECOND_TRANSOM_OFFSET_AS_STRING_EDEFAULT, oldSecondTransomOffsetAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSecondTransomOffsetAsString() {
		return secondTransomOffsetAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFirstMullionOffset() {
		return firstMullionOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstMullionOffset(double newFirstMullionOffset) {
		double oldFirstMullionOffset = firstMullionOffset;
		firstMullionOffset = newFirstMullionOffset;
		boolean oldFirstMullionOffsetESet = firstMullionOffsetESet;
		firstMullionOffsetESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__FIRST_MULLION_OFFSET, oldFirstMullionOffset, firstMullionOffset, !oldFirstMullionOffsetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFirstMullionOffset() {
		double oldFirstMullionOffset = firstMullionOffset;
		boolean oldFirstMullionOffsetESet = firstMullionOffsetESet;
		firstMullionOffset = FIRST_MULLION_OFFSET_EDEFAULT;
		firstMullionOffsetESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__FIRST_MULLION_OFFSET, oldFirstMullionOffset, FIRST_MULLION_OFFSET_EDEFAULT, oldFirstMullionOffsetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFirstMullionOffset() {
		return firstMullionOffsetESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstMullionOffsetAsString() {
		return firstMullionOffsetAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstMullionOffsetAsString(String newFirstMullionOffsetAsString) {
		String oldFirstMullionOffsetAsString = firstMullionOffsetAsString;
		firstMullionOffsetAsString = newFirstMullionOffsetAsString;
		boolean oldFirstMullionOffsetAsStringESet = firstMullionOffsetAsStringESet;
		firstMullionOffsetAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__FIRST_MULLION_OFFSET_AS_STRING, oldFirstMullionOffsetAsString, firstMullionOffsetAsString, !oldFirstMullionOffsetAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFirstMullionOffsetAsString() {
		String oldFirstMullionOffsetAsString = firstMullionOffsetAsString;
		boolean oldFirstMullionOffsetAsStringESet = firstMullionOffsetAsStringESet;
		firstMullionOffsetAsString = FIRST_MULLION_OFFSET_AS_STRING_EDEFAULT;
		firstMullionOffsetAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__FIRST_MULLION_OFFSET_AS_STRING, oldFirstMullionOffsetAsString, FIRST_MULLION_OFFSET_AS_STRING_EDEFAULT, oldFirstMullionOffsetAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFirstMullionOffsetAsString() {
		return firstMullionOffsetAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSecondMullionOffset() {
		return secondMullionOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondMullionOffset(double newSecondMullionOffset) {
		double oldSecondMullionOffset = secondMullionOffset;
		secondMullionOffset = newSecondMullionOffset;
		boolean oldSecondMullionOffsetESet = secondMullionOffsetESet;
		secondMullionOffsetESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__SECOND_MULLION_OFFSET, oldSecondMullionOffset, secondMullionOffset, !oldSecondMullionOffsetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSecondMullionOffset() {
		double oldSecondMullionOffset = secondMullionOffset;
		boolean oldSecondMullionOffsetESet = secondMullionOffsetESet;
		secondMullionOffset = SECOND_MULLION_OFFSET_EDEFAULT;
		secondMullionOffsetESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__SECOND_MULLION_OFFSET, oldSecondMullionOffset, SECOND_MULLION_OFFSET_EDEFAULT, oldSecondMullionOffsetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSecondMullionOffset() {
		return secondMullionOffsetESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecondMullionOffsetAsString() {
		return secondMullionOffsetAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondMullionOffsetAsString(String newSecondMullionOffsetAsString) {
		String oldSecondMullionOffsetAsString = secondMullionOffsetAsString;
		secondMullionOffsetAsString = newSecondMullionOffsetAsString;
		boolean oldSecondMullionOffsetAsStringESet = secondMullionOffsetAsStringESet;
		secondMullionOffsetAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__SECOND_MULLION_OFFSET_AS_STRING, oldSecondMullionOffsetAsString, secondMullionOffsetAsString, !oldSecondMullionOffsetAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSecondMullionOffsetAsString() {
		String oldSecondMullionOffsetAsString = secondMullionOffsetAsString;
		boolean oldSecondMullionOffsetAsStringESet = secondMullionOffsetAsStringESet;
		secondMullionOffsetAsString = SECOND_MULLION_OFFSET_AS_STRING_EDEFAULT;
		secondMullionOffsetAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__SECOND_MULLION_OFFSET_AS_STRING, oldSecondMullionOffsetAsString, SECOND_MULLION_OFFSET_AS_STRING_EDEFAULT, oldSecondMullionOffsetAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSecondMullionOffsetAsString() {
		return secondMullionOffsetAsStringESet;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__SHAPE_ASPECT_STYLE, oldShapeAspectStyle, shapeAspectStyle));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__SHAPE_ASPECT_STYLE, oldShapeAspectStyle, shapeAspectStyle, !oldShapeAspectStyleESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__SHAPE_ASPECT_STYLE, oldShapeAspectStyle, null, oldShapeAspectStyleESet));
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
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__LINING_DEPTH:
				return getLiningDepth();
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__LINING_DEPTH_AS_STRING:
				return getLiningDepthAsString();
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__LINING_THICKNESS:
				return getLiningThickness();
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__LINING_THICKNESS_AS_STRING:
				return getLiningThicknessAsString();
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__TRANSOM_THICKNESS:
				return getTransomThickness();
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__TRANSOM_THICKNESS_AS_STRING:
				return getTransomThicknessAsString();
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__MULLION_THICKNESS:
				return getMullionThickness();
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__MULLION_THICKNESS_AS_STRING:
				return getMullionThicknessAsString();
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__FIRST_TRANSOM_OFFSET:
				return getFirstTransomOffset();
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__FIRST_TRANSOM_OFFSET_AS_STRING:
				return getFirstTransomOffsetAsString();
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__SECOND_TRANSOM_OFFSET:
				return getSecondTransomOffset();
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__SECOND_TRANSOM_OFFSET_AS_STRING:
				return getSecondTransomOffsetAsString();
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__FIRST_MULLION_OFFSET:
				return getFirstMullionOffset();
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__FIRST_MULLION_OFFSET_AS_STRING:
				return getFirstMullionOffsetAsString();
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__SECOND_MULLION_OFFSET:
				return getSecondMullionOffset();
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__SECOND_MULLION_OFFSET_AS_STRING:
				return getSecondMullionOffsetAsString();
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__SHAPE_ASPECT_STYLE:
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
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__LINING_DEPTH:
				setLiningDepth((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__LINING_DEPTH_AS_STRING:
				setLiningDepthAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__LINING_THICKNESS:
				setLiningThickness((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__LINING_THICKNESS_AS_STRING:
				setLiningThicknessAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__TRANSOM_THICKNESS:
				setTransomThickness((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__TRANSOM_THICKNESS_AS_STRING:
				setTransomThicknessAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__MULLION_THICKNESS:
				setMullionThickness((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__MULLION_THICKNESS_AS_STRING:
				setMullionThicknessAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__FIRST_TRANSOM_OFFSET:
				setFirstTransomOffset((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__FIRST_TRANSOM_OFFSET_AS_STRING:
				setFirstTransomOffsetAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__SECOND_TRANSOM_OFFSET:
				setSecondTransomOffset((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__SECOND_TRANSOM_OFFSET_AS_STRING:
				setSecondTransomOffsetAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__FIRST_MULLION_OFFSET:
				setFirstMullionOffset((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__FIRST_MULLION_OFFSET_AS_STRING:
				setFirstMullionOffsetAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__SECOND_MULLION_OFFSET:
				setSecondMullionOffset((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__SECOND_MULLION_OFFSET_AS_STRING:
				setSecondMullionOffsetAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__SHAPE_ASPECT_STYLE:
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
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__LINING_DEPTH:
				unsetLiningDepth();
				return;
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__LINING_DEPTH_AS_STRING:
				unsetLiningDepthAsString();
				return;
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__LINING_THICKNESS:
				unsetLiningThickness();
				return;
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__LINING_THICKNESS_AS_STRING:
				unsetLiningThicknessAsString();
				return;
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__TRANSOM_THICKNESS:
				unsetTransomThickness();
				return;
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__TRANSOM_THICKNESS_AS_STRING:
				unsetTransomThicknessAsString();
				return;
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__MULLION_THICKNESS:
				unsetMullionThickness();
				return;
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__MULLION_THICKNESS_AS_STRING:
				unsetMullionThicknessAsString();
				return;
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__FIRST_TRANSOM_OFFSET:
				unsetFirstTransomOffset();
				return;
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__FIRST_TRANSOM_OFFSET_AS_STRING:
				unsetFirstTransomOffsetAsString();
				return;
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__SECOND_TRANSOM_OFFSET:
				unsetSecondTransomOffset();
				return;
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__SECOND_TRANSOM_OFFSET_AS_STRING:
				unsetSecondTransomOffsetAsString();
				return;
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__FIRST_MULLION_OFFSET:
				unsetFirstMullionOffset();
				return;
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__FIRST_MULLION_OFFSET_AS_STRING:
				unsetFirstMullionOffsetAsString();
				return;
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__SECOND_MULLION_OFFSET:
				unsetSecondMullionOffset();
				return;
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__SECOND_MULLION_OFFSET_AS_STRING:
				unsetSecondMullionOffsetAsString();
				return;
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__SHAPE_ASPECT_STYLE:
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
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__LINING_DEPTH:
				return isSetLiningDepth();
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__LINING_DEPTH_AS_STRING:
				return isSetLiningDepthAsString();
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__LINING_THICKNESS:
				return isSetLiningThickness();
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__LINING_THICKNESS_AS_STRING:
				return isSetLiningThicknessAsString();
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__TRANSOM_THICKNESS:
				return isSetTransomThickness();
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__TRANSOM_THICKNESS_AS_STRING:
				return isSetTransomThicknessAsString();
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__MULLION_THICKNESS:
				return isSetMullionThickness();
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__MULLION_THICKNESS_AS_STRING:
				return isSetMullionThicknessAsString();
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__FIRST_TRANSOM_OFFSET:
				return isSetFirstTransomOffset();
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__FIRST_TRANSOM_OFFSET_AS_STRING:
				return isSetFirstTransomOffsetAsString();
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__SECOND_TRANSOM_OFFSET:
				return isSetSecondTransomOffset();
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__SECOND_TRANSOM_OFFSET_AS_STRING:
				return isSetSecondTransomOffsetAsString();
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__FIRST_MULLION_OFFSET:
				return isSetFirstMullionOffset();
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__FIRST_MULLION_OFFSET_AS_STRING:
				return isSetFirstMullionOffsetAsString();
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__SECOND_MULLION_OFFSET:
				return isSetSecondMullionOffset();
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__SECOND_MULLION_OFFSET_AS_STRING:
				return isSetSecondMullionOffsetAsString();
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__SHAPE_ASPECT_STYLE:
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
		result.append(", TransomThickness: ");
		if (transomThicknessESet) result.append(transomThickness); else result.append("<unset>");
		result.append(", TransomThicknessAsString: ");
		if (transomThicknessAsStringESet) result.append(transomThicknessAsString); else result.append("<unset>");
		result.append(", MullionThickness: ");
		if (mullionThicknessESet) result.append(mullionThickness); else result.append("<unset>");
		result.append(", MullionThicknessAsString: ");
		if (mullionThicknessAsStringESet) result.append(mullionThicknessAsString); else result.append("<unset>");
		result.append(", FirstTransomOffset: ");
		if (firstTransomOffsetESet) result.append(firstTransomOffset); else result.append("<unset>");
		result.append(", FirstTransomOffsetAsString: ");
		if (firstTransomOffsetAsStringESet) result.append(firstTransomOffsetAsString); else result.append("<unset>");
		result.append(", SecondTransomOffset: ");
		if (secondTransomOffsetESet) result.append(secondTransomOffset); else result.append("<unset>");
		result.append(", SecondTransomOffsetAsString: ");
		if (secondTransomOffsetAsStringESet) result.append(secondTransomOffsetAsString); else result.append("<unset>");
		result.append(", FirstMullionOffset: ");
		if (firstMullionOffsetESet) result.append(firstMullionOffset); else result.append("<unset>");
		result.append(", FirstMullionOffsetAsString: ");
		if (firstMullionOffsetAsStringESet) result.append(firstMullionOffsetAsString); else result.append("<unset>");
		result.append(", SecondMullionOffset: ");
		if (secondMullionOffsetESet) result.append(secondMullionOffset); else result.append("<unset>");
		result.append(", SecondMullionOffsetAsString: ");
		if (secondMullionOffsetAsStringESet) result.append(secondMullionOffsetAsString); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcWindowLiningPropertiesImpl
