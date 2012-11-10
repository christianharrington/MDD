/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcReinforcingMesh;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Reinforcing Mesh</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcReinforcingMeshImpl#getMeshLength <em>Mesh Length</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcReinforcingMeshImpl#getMeshLengthAsString <em>Mesh Length As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcReinforcingMeshImpl#getMeshWidth <em>Mesh Width</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcReinforcingMeshImpl#getMeshWidthAsString <em>Mesh Width As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcReinforcingMeshImpl#getLongitudinalBarNominalDiameter <em>Longitudinal Bar Nominal Diameter</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcReinforcingMeshImpl#getLongitudinalBarNominalDiameterAsString <em>Longitudinal Bar Nominal Diameter As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcReinforcingMeshImpl#getTransverseBarNominalDiameter <em>Transverse Bar Nominal Diameter</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcReinforcingMeshImpl#getTransverseBarNominalDiameterAsString <em>Transverse Bar Nominal Diameter As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcReinforcingMeshImpl#getLongitudinalBarCrossSectionArea <em>Longitudinal Bar Cross Section Area</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcReinforcingMeshImpl#getLongitudinalBarCrossSectionAreaAsString <em>Longitudinal Bar Cross Section Area As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcReinforcingMeshImpl#getTransverseBarCrossSectionArea <em>Transverse Bar Cross Section Area</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcReinforcingMeshImpl#getTransverseBarCrossSectionAreaAsString <em>Transverse Bar Cross Section Area As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcReinforcingMeshImpl#getLongitudinalBarSpacing <em>Longitudinal Bar Spacing</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcReinforcingMeshImpl#getLongitudinalBarSpacingAsString <em>Longitudinal Bar Spacing As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcReinforcingMeshImpl#getTransverseBarSpacing <em>Transverse Bar Spacing</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcReinforcingMeshImpl#getTransverseBarSpacingAsString <em>Transverse Bar Spacing As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcReinforcingMeshImpl extends IfcReinforcingElementImpl implements IfcReinforcingMesh {
	/**
	 * The default value of the '{@link #getMeshLength() <em>Mesh Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeshLength()
	 * @generated
	 * @ordered
	 */
	protected static final double MESH_LENGTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMeshLength() <em>Mesh Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeshLength()
	 * @generated
	 * @ordered
	 */
	protected double meshLength = MESH_LENGTH_EDEFAULT;

	/**
	 * This is true if the Mesh Length attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean meshLengthESet;

	/**
	 * The default value of the '{@link #getMeshLengthAsString() <em>Mesh Length As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeshLengthAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String MESH_LENGTH_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMeshLengthAsString() <em>Mesh Length As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeshLengthAsString()
	 * @generated
	 * @ordered
	 */
	protected String meshLengthAsString = MESH_LENGTH_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Mesh Length As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean meshLengthAsStringESet;

	/**
	 * The default value of the '{@link #getMeshWidth() <em>Mesh Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeshWidth()
	 * @generated
	 * @ordered
	 */
	protected static final double MESH_WIDTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMeshWidth() <em>Mesh Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeshWidth()
	 * @generated
	 * @ordered
	 */
	protected double meshWidth = MESH_WIDTH_EDEFAULT;

	/**
	 * This is true if the Mesh Width attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean meshWidthESet;

	/**
	 * The default value of the '{@link #getMeshWidthAsString() <em>Mesh Width As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeshWidthAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String MESH_WIDTH_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMeshWidthAsString() <em>Mesh Width As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeshWidthAsString()
	 * @generated
	 * @ordered
	 */
	protected String meshWidthAsString = MESH_WIDTH_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Mesh Width As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean meshWidthAsStringESet;

	/**
	 * The default value of the '{@link #getLongitudinalBarNominalDiameter() <em>Longitudinal Bar Nominal Diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitudinalBarNominalDiameter()
	 * @generated
	 * @ordered
	 */
	protected static final double LONGITUDINAL_BAR_NOMINAL_DIAMETER_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLongitudinalBarNominalDiameter() <em>Longitudinal Bar Nominal Diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitudinalBarNominalDiameter()
	 * @generated
	 * @ordered
	 */
	protected double longitudinalBarNominalDiameter = LONGITUDINAL_BAR_NOMINAL_DIAMETER_EDEFAULT;

	/**
	 * The default value of the '{@link #getLongitudinalBarNominalDiameterAsString() <em>Longitudinal Bar Nominal Diameter As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitudinalBarNominalDiameterAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String LONGITUDINAL_BAR_NOMINAL_DIAMETER_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLongitudinalBarNominalDiameterAsString() <em>Longitudinal Bar Nominal Diameter As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitudinalBarNominalDiameterAsString()
	 * @generated
	 * @ordered
	 */
	protected String longitudinalBarNominalDiameterAsString = LONGITUDINAL_BAR_NOMINAL_DIAMETER_AS_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransverseBarNominalDiameter() <em>Transverse Bar Nominal Diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransverseBarNominalDiameter()
	 * @generated
	 * @ordered
	 */
	protected static final double TRANSVERSE_BAR_NOMINAL_DIAMETER_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTransverseBarNominalDiameter() <em>Transverse Bar Nominal Diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransverseBarNominalDiameter()
	 * @generated
	 * @ordered
	 */
	protected double transverseBarNominalDiameter = TRANSVERSE_BAR_NOMINAL_DIAMETER_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransverseBarNominalDiameterAsString() <em>Transverse Bar Nominal Diameter As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransverseBarNominalDiameterAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSVERSE_BAR_NOMINAL_DIAMETER_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransverseBarNominalDiameterAsString() <em>Transverse Bar Nominal Diameter As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransverseBarNominalDiameterAsString()
	 * @generated
	 * @ordered
	 */
	protected String transverseBarNominalDiameterAsString = TRANSVERSE_BAR_NOMINAL_DIAMETER_AS_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getLongitudinalBarCrossSectionArea() <em>Longitudinal Bar Cross Section Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitudinalBarCrossSectionArea()
	 * @generated
	 * @ordered
	 */
	protected static final double LONGITUDINAL_BAR_CROSS_SECTION_AREA_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLongitudinalBarCrossSectionArea() <em>Longitudinal Bar Cross Section Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitudinalBarCrossSectionArea()
	 * @generated
	 * @ordered
	 */
	protected double longitudinalBarCrossSectionArea = LONGITUDINAL_BAR_CROSS_SECTION_AREA_EDEFAULT;

	/**
	 * The default value of the '{@link #getLongitudinalBarCrossSectionAreaAsString() <em>Longitudinal Bar Cross Section Area As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitudinalBarCrossSectionAreaAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String LONGITUDINAL_BAR_CROSS_SECTION_AREA_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLongitudinalBarCrossSectionAreaAsString() <em>Longitudinal Bar Cross Section Area As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitudinalBarCrossSectionAreaAsString()
	 * @generated
	 * @ordered
	 */
	protected String longitudinalBarCrossSectionAreaAsString = LONGITUDINAL_BAR_CROSS_SECTION_AREA_AS_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransverseBarCrossSectionArea() <em>Transverse Bar Cross Section Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransverseBarCrossSectionArea()
	 * @generated
	 * @ordered
	 */
	protected static final double TRANSVERSE_BAR_CROSS_SECTION_AREA_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTransverseBarCrossSectionArea() <em>Transverse Bar Cross Section Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransverseBarCrossSectionArea()
	 * @generated
	 * @ordered
	 */
	protected double transverseBarCrossSectionArea = TRANSVERSE_BAR_CROSS_SECTION_AREA_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransverseBarCrossSectionAreaAsString() <em>Transverse Bar Cross Section Area As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransverseBarCrossSectionAreaAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSVERSE_BAR_CROSS_SECTION_AREA_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransverseBarCrossSectionAreaAsString() <em>Transverse Bar Cross Section Area As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransverseBarCrossSectionAreaAsString()
	 * @generated
	 * @ordered
	 */
	protected String transverseBarCrossSectionAreaAsString = TRANSVERSE_BAR_CROSS_SECTION_AREA_AS_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getLongitudinalBarSpacing() <em>Longitudinal Bar Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitudinalBarSpacing()
	 * @generated
	 * @ordered
	 */
	protected static final double LONGITUDINAL_BAR_SPACING_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLongitudinalBarSpacing() <em>Longitudinal Bar Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitudinalBarSpacing()
	 * @generated
	 * @ordered
	 */
	protected double longitudinalBarSpacing = LONGITUDINAL_BAR_SPACING_EDEFAULT;

	/**
	 * The default value of the '{@link #getLongitudinalBarSpacingAsString() <em>Longitudinal Bar Spacing As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitudinalBarSpacingAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String LONGITUDINAL_BAR_SPACING_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLongitudinalBarSpacingAsString() <em>Longitudinal Bar Spacing As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitudinalBarSpacingAsString()
	 * @generated
	 * @ordered
	 */
	protected String longitudinalBarSpacingAsString = LONGITUDINAL_BAR_SPACING_AS_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransverseBarSpacing() <em>Transverse Bar Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransverseBarSpacing()
	 * @generated
	 * @ordered
	 */
	protected static final double TRANSVERSE_BAR_SPACING_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTransverseBarSpacing() <em>Transverse Bar Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransverseBarSpacing()
	 * @generated
	 * @ordered
	 */
	protected double transverseBarSpacing = TRANSVERSE_BAR_SPACING_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransverseBarSpacingAsString() <em>Transverse Bar Spacing As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransverseBarSpacingAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSVERSE_BAR_SPACING_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransverseBarSpacingAsString() <em>Transverse Bar Spacing As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransverseBarSpacingAsString()
	 * @generated
	 * @ordered
	 */
	protected String transverseBarSpacingAsString = TRANSVERSE_BAR_SPACING_AS_STRING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcReinforcingMeshImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcReinforcingMesh();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMeshLength() {
		return meshLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeshLength(double newMeshLength) {
		double oldMeshLength = meshLength;
		meshLength = newMeshLength;
		boolean oldMeshLengthESet = meshLengthESet;
		meshLengthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REINFORCING_MESH__MESH_LENGTH, oldMeshLength, meshLength, !oldMeshLengthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMeshLength() {
		double oldMeshLength = meshLength;
		boolean oldMeshLengthESet = meshLengthESet;
		meshLength = MESH_LENGTH_EDEFAULT;
		meshLengthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_REINFORCING_MESH__MESH_LENGTH, oldMeshLength, MESH_LENGTH_EDEFAULT, oldMeshLengthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMeshLength() {
		return meshLengthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMeshLengthAsString() {
		return meshLengthAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeshLengthAsString(String newMeshLengthAsString) {
		String oldMeshLengthAsString = meshLengthAsString;
		meshLengthAsString = newMeshLengthAsString;
		boolean oldMeshLengthAsStringESet = meshLengthAsStringESet;
		meshLengthAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REINFORCING_MESH__MESH_LENGTH_AS_STRING, oldMeshLengthAsString, meshLengthAsString, !oldMeshLengthAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMeshLengthAsString() {
		String oldMeshLengthAsString = meshLengthAsString;
		boolean oldMeshLengthAsStringESet = meshLengthAsStringESet;
		meshLengthAsString = MESH_LENGTH_AS_STRING_EDEFAULT;
		meshLengthAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_REINFORCING_MESH__MESH_LENGTH_AS_STRING, oldMeshLengthAsString, MESH_LENGTH_AS_STRING_EDEFAULT, oldMeshLengthAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMeshLengthAsString() {
		return meshLengthAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMeshWidth() {
		return meshWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeshWidth(double newMeshWidth) {
		double oldMeshWidth = meshWidth;
		meshWidth = newMeshWidth;
		boolean oldMeshWidthESet = meshWidthESet;
		meshWidthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REINFORCING_MESH__MESH_WIDTH, oldMeshWidth, meshWidth, !oldMeshWidthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMeshWidth() {
		double oldMeshWidth = meshWidth;
		boolean oldMeshWidthESet = meshWidthESet;
		meshWidth = MESH_WIDTH_EDEFAULT;
		meshWidthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_REINFORCING_MESH__MESH_WIDTH, oldMeshWidth, MESH_WIDTH_EDEFAULT, oldMeshWidthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMeshWidth() {
		return meshWidthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMeshWidthAsString() {
		return meshWidthAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeshWidthAsString(String newMeshWidthAsString) {
		String oldMeshWidthAsString = meshWidthAsString;
		meshWidthAsString = newMeshWidthAsString;
		boolean oldMeshWidthAsStringESet = meshWidthAsStringESet;
		meshWidthAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REINFORCING_MESH__MESH_WIDTH_AS_STRING, oldMeshWidthAsString, meshWidthAsString, !oldMeshWidthAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMeshWidthAsString() {
		String oldMeshWidthAsString = meshWidthAsString;
		boolean oldMeshWidthAsStringESet = meshWidthAsStringESet;
		meshWidthAsString = MESH_WIDTH_AS_STRING_EDEFAULT;
		meshWidthAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_REINFORCING_MESH__MESH_WIDTH_AS_STRING, oldMeshWidthAsString, MESH_WIDTH_AS_STRING_EDEFAULT, oldMeshWidthAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMeshWidthAsString() {
		return meshWidthAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLongitudinalBarNominalDiameter() {
		return longitudinalBarNominalDiameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongitudinalBarNominalDiameter(double newLongitudinalBarNominalDiameter) {
		double oldLongitudinalBarNominalDiameter = longitudinalBarNominalDiameter;
		longitudinalBarNominalDiameter = newLongitudinalBarNominalDiameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REINFORCING_MESH__LONGITUDINAL_BAR_NOMINAL_DIAMETER, oldLongitudinalBarNominalDiameter, longitudinalBarNominalDiameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLongitudinalBarNominalDiameterAsString() {
		return longitudinalBarNominalDiameterAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongitudinalBarNominalDiameterAsString(String newLongitudinalBarNominalDiameterAsString) {
		String oldLongitudinalBarNominalDiameterAsString = longitudinalBarNominalDiameterAsString;
		longitudinalBarNominalDiameterAsString = newLongitudinalBarNominalDiameterAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REINFORCING_MESH__LONGITUDINAL_BAR_NOMINAL_DIAMETER_AS_STRING, oldLongitudinalBarNominalDiameterAsString, longitudinalBarNominalDiameterAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTransverseBarNominalDiameter() {
		return transverseBarNominalDiameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransverseBarNominalDiameter(double newTransverseBarNominalDiameter) {
		double oldTransverseBarNominalDiameter = transverseBarNominalDiameter;
		transverseBarNominalDiameter = newTransverseBarNominalDiameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REINFORCING_MESH__TRANSVERSE_BAR_NOMINAL_DIAMETER, oldTransverseBarNominalDiameter, transverseBarNominalDiameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransverseBarNominalDiameterAsString() {
		return transverseBarNominalDiameterAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransverseBarNominalDiameterAsString(String newTransverseBarNominalDiameterAsString) {
		String oldTransverseBarNominalDiameterAsString = transverseBarNominalDiameterAsString;
		transverseBarNominalDiameterAsString = newTransverseBarNominalDiameterAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REINFORCING_MESH__TRANSVERSE_BAR_NOMINAL_DIAMETER_AS_STRING, oldTransverseBarNominalDiameterAsString, transverseBarNominalDiameterAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLongitudinalBarCrossSectionArea() {
		return longitudinalBarCrossSectionArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongitudinalBarCrossSectionArea(double newLongitudinalBarCrossSectionArea) {
		double oldLongitudinalBarCrossSectionArea = longitudinalBarCrossSectionArea;
		longitudinalBarCrossSectionArea = newLongitudinalBarCrossSectionArea;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REINFORCING_MESH__LONGITUDINAL_BAR_CROSS_SECTION_AREA, oldLongitudinalBarCrossSectionArea, longitudinalBarCrossSectionArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLongitudinalBarCrossSectionAreaAsString() {
		return longitudinalBarCrossSectionAreaAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongitudinalBarCrossSectionAreaAsString(String newLongitudinalBarCrossSectionAreaAsString) {
		String oldLongitudinalBarCrossSectionAreaAsString = longitudinalBarCrossSectionAreaAsString;
		longitudinalBarCrossSectionAreaAsString = newLongitudinalBarCrossSectionAreaAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REINFORCING_MESH__LONGITUDINAL_BAR_CROSS_SECTION_AREA_AS_STRING, oldLongitudinalBarCrossSectionAreaAsString, longitudinalBarCrossSectionAreaAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTransverseBarCrossSectionArea() {
		return transverseBarCrossSectionArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransverseBarCrossSectionArea(double newTransverseBarCrossSectionArea) {
		double oldTransverseBarCrossSectionArea = transverseBarCrossSectionArea;
		transverseBarCrossSectionArea = newTransverseBarCrossSectionArea;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REINFORCING_MESH__TRANSVERSE_BAR_CROSS_SECTION_AREA, oldTransverseBarCrossSectionArea, transverseBarCrossSectionArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransverseBarCrossSectionAreaAsString() {
		return transverseBarCrossSectionAreaAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransverseBarCrossSectionAreaAsString(String newTransverseBarCrossSectionAreaAsString) {
		String oldTransverseBarCrossSectionAreaAsString = transverseBarCrossSectionAreaAsString;
		transverseBarCrossSectionAreaAsString = newTransverseBarCrossSectionAreaAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REINFORCING_MESH__TRANSVERSE_BAR_CROSS_SECTION_AREA_AS_STRING, oldTransverseBarCrossSectionAreaAsString, transverseBarCrossSectionAreaAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLongitudinalBarSpacing() {
		return longitudinalBarSpacing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongitudinalBarSpacing(double newLongitudinalBarSpacing) {
		double oldLongitudinalBarSpacing = longitudinalBarSpacing;
		longitudinalBarSpacing = newLongitudinalBarSpacing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REINFORCING_MESH__LONGITUDINAL_BAR_SPACING, oldLongitudinalBarSpacing, longitudinalBarSpacing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLongitudinalBarSpacingAsString() {
		return longitudinalBarSpacingAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongitudinalBarSpacingAsString(String newLongitudinalBarSpacingAsString) {
		String oldLongitudinalBarSpacingAsString = longitudinalBarSpacingAsString;
		longitudinalBarSpacingAsString = newLongitudinalBarSpacingAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REINFORCING_MESH__LONGITUDINAL_BAR_SPACING_AS_STRING, oldLongitudinalBarSpacingAsString, longitudinalBarSpacingAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTransverseBarSpacing() {
		return transverseBarSpacing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransverseBarSpacing(double newTransverseBarSpacing) {
		double oldTransverseBarSpacing = transverseBarSpacing;
		transverseBarSpacing = newTransverseBarSpacing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REINFORCING_MESH__TRANSVERSE_BAR_SPACING, oldTransverseBarSpacing, transverseBarSpacing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransverseBarSpacingAsString() {
		return transverseBarSpacingAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransverseBarSpacingAsString(String newTransverseBarSpacingAsString) {
		String oldTransverseBarSpacingAsString = transverseBarSpacingAsString;
		transverseBarSpacingAsString = newTransverseBarSpacingAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REINFORCING_MESH__TRANSVERSE_BAR_SPACING_AS_STRING, oldTransverseBarSpacingAsString, transverseBarSpacingAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__MESH_LENGTH:
				return getMeshLength();
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__MESH_LENGTH_AS_STRING:
				return getMeshLengthAsString();
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__MESH_WIDTH:
				return getMeshWidth();
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__MESH_WIDTH_AS_STRING:
				return getMeshWidthAsString();
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__LONGITUDINAL_BAR_NOMINAL_DIAMETER:
				return getLongitudinalBarNominalDiameter();
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__LONGITUDINAL_BAR_NOMINAL_DIAMETER_AS_STRING:
				return getLongitudinalBarNominalDiameterAsString();
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__TRANSVERSE_BAR_NOMINAL_DIAMETER:
				return getTransverseBarNominalDiameter();
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__TRANSVERSE_BAR_NOMINAL_DIAMETER_AS_STRING:
				return getTransverseBarNominalDiameterAsString();
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__LONGITUDINAL_BAR_CROSS_SECTION_AREA:
				return getLongitudinalBarCrossSectionArea();
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__LONGITUDINAL_BAR_CROSS_SECTION_AREA_AS_STRING:
				return getLongitudinalBarCrossSectionAreaAsString();
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__TRANSVERSE_BAR_CROSS_SECTION_AREA:
				return getTransverseBarCrossSectionArea();
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__TRANSVERSE_BAR_CROSS_SECTION_AREA_AS_STRING:
				return getTransverseBarCrossSectionAreaAsString();
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__LONGITUDINAL_BAR_SPACING:
				return getLongitudinalBarSpacing();
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__LONGITUDINAL_BAR_SPACING_AS_STRING:
				return getLongitudinalBarSpacingAsString();
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__TRANSVERSE_BAR_SPACING:
				return getTransverseBarSpacing();
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__TRANSVERSE_BAR_SPACING_AS_STRING:
				return getTransverseBarSpacingAsString();
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
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__MESH_LENGTH:
				setMeshLength((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__MESH_LENGTH_AS_STRING:
				setMeshLengthAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__MESH_WIDTH:
				setMeshWidth((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__MESH_WIDTH_AS_STRING:
				setMeshWidthAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__LONGITUDINAL_BAR_NOMINAL_DIAMETER:
				setLongitudinalBarNominalDiameter((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__LONGITUDINAL_BAR_NOMINAL_DIAMETER_AS_STRING:
				setLongitudinalBarNominalDiameterAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__TRANSVERSE_BAR_NOMINAL_DIAMETER:
				setTransverseBarNominalDiameter((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__TRANSVERSE_BAR_NOMINAL_DIAMETER_AS_STRING:
				setTransverseBarNominalDiameterAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__LONGITUDINAL_BAR_CROSS_SECTION_AREA:
				setLongitudinalBarCrossSectionArea((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__LONGITUDINAL_BAR_CROSS_SECTION_AREA_AS_STRING:
				setLongitudinalBarCrossSectionAreaAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__TRANSVERSE_BAR_CROSS_SECTION_AREA:
				setTransverseBarCrossSectionArea((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__TRANSVERSE_BAR_CROSS_SECTION_AREA_AS_STRING:
				setTransverseBarCrossSectionAreaAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__LONGITUDINAL_BAR_SPACING:
				setLongitudinalBarSpacing((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__LONGITUDINAL_BAR_SPACING_AS_STRING:
				setLongitudinalBarSpacingAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__TRANSVERSE_BAR_SPACING:
				setTransverseBarSpacing((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__TRANSVERSE_BAR_SPACING_AS_STRING:
				setTransverseBarSpacingAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__MESH_LENGTH:
				unsetMeshLength();
				return;
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__MESH_LENGTH_AS_STRING:
				unsetMeshLengthAsString();
				return;
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__MESH_WIDTH:
				unsetMeshWidth();
				return;
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__MESH_WIDTH_AS_STRING:
				unsetMeshWidthAsString();
				return;
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__LONGITUDINAL_BAR_NOMINAL_DIAMETER:
				setLongitudinalBarNominalDiameter(LONGITUDINAL_BAR_NOMINAL_DIAMETER_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__LONGITUDINAL_BAR_NOMINAL_DIAMETER_AS_STRING:
				setLongitudinalBarNominalDiameterAsString(LONGITUDINAL_BAR_NOMINAL_DIAMETER_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__TRANSVERSE_BAR_NOMINAL_DIAMETER:
				setTransverseBarNominalDiameter(TRANSVERSE_BAR_NOMINAL_DIAMETER_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__TRANSVERSE_BAR_NOMINAL_DIAMETER_AS_STRING:
				setTransverseBarNominalDiameterAsString(TRANSVERSE_BAR_NOMINAL_DIAMETER_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__LONGITUDINAL_BAR_CROSS_SECTION_AREA:
				setLongitudinalBarCrossSectionArea(LONGITUDINAL_BAR_CROSS_SECTION_AREA_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__LONGITUDINAL_BAR_CROSS_SECTION_AREA_AS_STRING:
				setLongitudinalBarCrossSectionAreaAsString(LONGITUDINAL_BAR_CROSS_SECTION_AREA_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__TRANSVERSE_BAR_CROSS_SECTION_AREA:
				setTransverseBarCrossSectionArea(TRANSVERSE_BAR_CROSS_SECTION_AREA_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__TRANSVERSE_BAR_CROSS_SECTION_AREA_AS_STRING:
				setTransverseBarCrossSectionAreaAsString(TRANSVERSE_BAR_CROSS_SECTION_AREA_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__LONGITUDINAL_BAR_SPACING:
				setLongitudinalBarSpacing(LONGITUDINAL_BAR_SPACING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__LONGITUDINAL_BAR_SPACING_AS_STRING:
				setLongitudinalBarSpacingAsString(LONGITUDINAL_BAR_SPACING_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__TRANSVERSE_BAR_SPACING:
				setTransverseBarSpacing(TRANSVERSE_BAR_SPACING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__TRANSVERSE_BAR_SPACING_AS_STRING:
				setTransverseBarSpacingAsString(TRANSVERSE_BAR_SPACING_AS_STRING_EDEFAULT);
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
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__MESH_LENGTH:
				return isSetMeshLength();
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__MESH_LENGTH_AS_STRING:
				return isSetMeshLengthAsString();
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__MESH_WIDTH:
				return isSetMeshWidth();
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__MESH_WIDTH_AS_STRING:
				return isSetMeshWidthAsString();
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__LONGITUDINAL_BAR_NOMINAL_DIAMETER:
				return longitudinalBarNominalDiameter != LONGITUDINAL_BAR_NOMINAL_DIAMETER_EDEFAULT;
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__LONGITUDINAL_BAR_NOMINAL_DIAMETER_AS_STRING:
				return LONGITUDINAL_BAR_NOMINAL_DIAMETER_AS_STRING_EDEFAULT == null ? longitudinalBarNominalDiameterAsString != null : !LONGITUDINAL_BAR_NOMINAL_DIAMETER_AS_STRING_EDEFAULT.equals(longitudinalBarNominalDiameterAsString);
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__TRANSVERSE_BAR_NOMINAL_DIAMETER:
				return transverseBarNominalDiameter != TRANSVERSE_BAR_NOMINAL_DIAMETER_EDEFAULT;
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__TRANSVERSE_BAR_NOMINAL_DIAMETER_AS_STRING:
				return TRANSVERSE_BAR_NOMINAL_DIAMETER_AS_STRING_EDEFAULT == null ? transverseBarNominalDiameterAsString != null : !TRANSVERSE_BAR_NOMINAL_DIAMETER_AS_STRING_EDEFAULT.equals(transverseBarNominalDiameterAsString);
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__LONGITUDINAL_BAR_CROSS_SECTION_AREA:
				return longitudinalBarCrossSectionArea != LONGITUDINAL_BAR_CROSS_SECTION_AREA_EDEFAULT;
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__LONGITUDINAL_BAR_CROSS_SECTION_AREA_AS_STRING:
				return LONGITUDINAL_BAR_CROSS_SECTION_AREA_AS_STRING_EDEFAULT == null ? longitudinalBarCrossSectionAreaAsString != null : !LONGITUDINAL_BAR_CROSS_SECTION_AREA_AS_STRING_EDEFAULT.equals(longitudinalBarCrossSectionAreaAsString);
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__TRANSVERSE_BAR_CROSS_SECTION_AREA:
				return transverseBarCrossSectionArea != TRANSVERSE_BAR_CROSS_SECTION_AREA_EDEFAULT;
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__TRANSVERSE_BAR_CROSS_SECTION_AREA_AS_STRING:
				return TRANSVERSE_BAR_CROSS_SECTION_AREA_AS_STRING_EDEFAULT == null ? transverseBarCrossSectionAreaAsString != null : !TRANSVERSE_BAR_CROSS_SECTION_AREA_AS_STRING_EDEFAULT.equals(transverseBarCrossSectionAreaAsString);
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__LONGITUDINAL_BAR_SPACING:
				return longitudinalBarSpacing != LONGITUDINAL_BAR_SPACING_EDEFAULT;
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__LONGITUDINAL_BAR_SPACING_AS_STRING:
				return LONGITUDINAL_BAR_SPACING_AS_STRING_EDEFAULT == null ? longitudinalBarSpacingAsString != null : !LONGITUDINAL_BAR_SPACING_AS_STRING_EDEFAULT.equals(longitudinalBarSpacingAsString);
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__TRANSVERSE_BAR_SPACING:
				return transverseBarSpacing != TRANSVERSE_BAR_SPACING_EDEFAULT;
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__TRANSVERSE_BAR_SPACING_AS_STRING:
				return TRANSVERSE_BAR_SPACING_AS_STRING_EDEFAULT == null ? transverseBarSpacingAsString != null : !TRANSVERSE_BAR_SPACING_AS_STRING_EDEFAULT.equals(transverseBarSpacingAsString);
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
		result.append(" (MeshLength: ");
		if (meshLengthESet) result.append(meshLength); else result.append("<unset>");
		result.append(", MeshLengthAsString: ");
		if (meshLengthAsStringESet) result.append(meshLengthAsString); else result.append("<unset>");
		result.append(", MeshWidth: ");
		if (meshWidthESet) result.append(meshWidth); else result.append("<unset>");
		result.append(", MeshWidthAsString: ");
		if (meshWidthAsStringESet) result.append(meshWidthAsString); else result.append("<unset>");
		result.append(", LongitudinalBarNominalDiameter: ");
		result.append(longitudinalBarNominalDiameter);
		result.append(", LongitudinalBarNominalDiameterAsString: ");
		result.append(longitudinalBarNominalDiameterAsString);
		result.append(", TransverseBarNominalDiameter: ");
		result.append(transverseBarNominalDiameter);
		result.append(", TransverseBarNominalDiameterAsString: ");
		result.append(transverseBarNominalDiameterAsString);
		result.append(", LongitudinalBarCrossSectionArea: ");
		result.append(longitudinalBarCrossSectionArea);
		result.append(", LongitudinalBarCrossSectionAreaAsString: ");
		result.append(longitudinalBarCrossSectionAreaAsString);
		result.append(", TransverseBarCrossSectionArea: ");
		result.append(transverseBarCrossSectionArea);
		result.append(", TransverseBarCrossSectionAreaAsString: ");
		result.append(transverseBarCrossSectionAreaAsString);
		result.append(", LongitudinalBarSpacing: ");
		result.append(longitudinalBarSpacing);
		result.append(", LongitudinalBarSpacingAsString: ");
		result.append(longitudinalBarSpacingAsString);
		result.append(", TransverseBarSpacing: ");
		result.append(transverseBarSpacing);
		result.append(", TransverseBarSpacingAsString: ");
		result.append(transverseBarSpacingAsString);
		result.append(')');
		return result.toString();
	}

} //IfcReinforcingMeshImpl
