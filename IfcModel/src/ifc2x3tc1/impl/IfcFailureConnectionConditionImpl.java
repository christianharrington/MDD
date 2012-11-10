/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcFailureConnectionCondition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Failure Connection Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcFailureConnectionConditionImpl#getTensionFailureX <em>Tension Failure X</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcFailureConnectionConditionImpl#getTensionFailureXAsString <em>Tension Failure XAs String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcFailureConnectionConditionImpl#getTensionFailureY <em>Tension Failure Y</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcFailureConnectionConditionImpl#getTensionFailureYAsString <em>Tension Failure YAs String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcFailureConnectionConditionImpl#getTensionFailureZ <em>Tension Failure Z</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcFailureConnectionConditionImpl#getTensionFailureZAsString <em>Tension Failure ZAs String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcFailureConnectionConditionImpl#getCompressionFailureX <em>Compression Failure X</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcFailureConnectionConditionImpl#getCompressionFailureXAsString <em>Compression Failure XAs String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcFailureConnectionConditionImpl#getCompressionFailureY <em>Compression Failure Y</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcFailureConnectionConditionImpl#getCompressionFailureYAsString <em>Compression Failure YAs String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcFailureConnectionConditionImpl#getCompressionFailureZ <em>Compression Failure Z</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcFailureConnectionConditionImpl#getCompressionFailureZAsString <em>Compression Failure ZAs String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcFailureConnectionConditionImpl extends IfcStructuralConnectionConditionImpl implements IfcFailureConnectionCondition {
	/**
	 * The default value of the '{@link #getTensionFailureX() <em>Tension Failure X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTensionFailureX()
	 * @generated
	 * @ordered
	 */
	protected static final double TENSION_FAILURE_X_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTensionFailureX() <em>Tension Failure X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTensionFailureX()
	 * @generated
	 * @ordered
	 */
	protected double tensionFailureX = TENSION_FAILURE_X_EDEFAULT;

	/**
	 * This is true if the Tension Failure X attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tensionFailureXESet;

	/**
	 * The default value of the '{@link #getTensionFailureXAsString() <em>Tension Failure XAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTensionFailureXAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String TENSION_FAILURE_XAS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTensionFailureXAsString() <em>Tension Failure XAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTensionFailureXAsString()
	 * @generated
	 * @ordered
	 */
	protected String tensionFailureXAsString = TENSION_FAILURE_XAS_STRING_EDEFAULT;

	/**
	 * This is true if the Tension Failure XAs String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tensionFailureXAsStringESet;

	/**
	 * The default value of the '{@link #getTensionFailureY() <em>Tension Failure Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTensionFailureY()
	 * @generated
	 * @ordered
	 */
	protected static final double TENSION_FAILURE_Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTensionFailureY() <em>Tension Failure Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTensionFailureY()
	 * @generated
	 * @ordered
	 */
	protected double tensionFailureY = TENSION_FAILURE_Y_EDEFAULT;

	/**
	 * This is true if the Tension Failure Y attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tensionFailureYESet;

	/**
	 * The default value of the '{@link #getTensionFailureYAsString() <em>Tension Failure YAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTensionFailureYAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String TENSION_FAILURE_YAS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTensionFailureYAsString() <em>Tension Failure YAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTensionFailureYAsString()
	 * @generated
	 * @ordered
	 */
	protected String tensionFailureYAsString = TENSION_FAILURE_YAS_STRING_EDEFAULT;

	/**
	 * This is true if the Tension Failure YAs String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tensionFailureYAsStringESet;

	/**
	 * The default value of the '{@link #getTensionFailureZ() <em>Tension Failure Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTensionFailureZ()
	 * @generated
	 * @ordered
	 */
	protected static final double TENSION_FAILURE_Z_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTensionFailureZ() <em>Tension Failure Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTensionFailureZ()
	 * @generated
	 * @ordered
	 */
	protected double tensionFailureZ = TENSION_FAILURE_Z_EDEFAULT;

	/**
	 * This is true if the Tension Failure Z attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tensionFailureZESet;

	/**
	 * The default value of the '{@link #getTensionFailureZAsString() <em>Tension Failure ZAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTensionFailureZAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String TENSION_FAILURE_ZAS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTensionFailureZAsString() <em>Tension Failure ZAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTensionFailureZAsString()
	 * @generated
	 * @ordered
	 */
	protected String tensionFailureZAsString = TENSION_FAILURE_ZAS_STRING_EDEFAULT;

	/**
	 * This is true if the Tension Failure ZAs String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tensionFailureZAsStringESet;

	/**
	 * The default value of the '{@link #getCompressionFailureX() <em>Compression Failure X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompressionFailureX()
	 * @generated
	 * @ordered
	 */
	protected static final double COMPRESSION_FAILURE_X_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCompressionFailureX() <em>Compression Failure X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompressionFailureX()
	 * @generated
	 * @ordered
	 */
	protected double compressionFailureX = COMPRESSION_FAILURE_X_EDEFAULT;

	/**
	 * This is true if the Compression Failure X attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean compressionFailureXESet;

	/**
	 * The default value of the '{@link #getCompressionFailureXAsString() <em>Compression Failure XAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompressionFailureXAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPRESSION_FAILURE_XAS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompressionFailureXAsString() <em>Compression Failure XAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompressionFailureXAsString()
	 * @generated
	 * @ordered
	 */
	protected String compressionFailureXAsString = COMPRESSION_FAILURE_XAS_STRING_EDEFAULT;

	/**
	 * This is true if the Compression Failure XAs String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean compressionFailureXAsStringESet;

	/**
	 * The default value of the '{@link #getCompressionFailureY() <em>Compression Failure Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompressionFailureY()
	 * @generated
	 * @ordered
	 */
	protected static final double COMPRESSION_FAILURE_Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCompressionFailureY() <em>Compression Failure Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompressionFailureY()
	 * @generated
	 * @ordered
	 */
	protected double compressionFailureY = COMPRESSION_FAILURE_Y_EDEFAULT;

	/**
	 * This is true if the Compression Failure Y attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean compressionFailureYESet;

	/**
	 * The default value of the '{@link #getCompressionFailureYAsString() <em>Compression Failure YAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompressionFailureYAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPRESSION_FAILURE_YAS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompressionFailureYAsString() <em>Compression Failure YAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompressionFailureYAsString()
	 * @generated
	 * @ordered
	 */
	protected String compressionFailureYAsString = COMPRESSION_FAILURE_YAS_STRING_EDEFAULT;

	/**
	 * This is true if the Compression Failure YAs String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean compressionFailureYAsStringESet;

	/**
	 * The default value of the '{@link #getCompressionFailureZ() <em>Compression Failure Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompressionFailureZ()
	 * @generated
	 * @ordered
	 */
	protected static final double COMPRESSION_FAILURE_Z_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCompressionFailureZ() <em>Compression Failure Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompressionFailureZ()
	 * @generated
	 * @ordered
	 */
	protected double compressionFailureZ = COMPRESSION_FAILURE_Z_EDEFAULT;

	/**
	 * This is true if the Compression Failure Z attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean compressionFailureZESet;

	/**
	 * The default value of the '{@link #getCompressionFailureZAsString() <em>Compression Failure ZAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompressionFailureZAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPRESSION_FAILURE_ZAS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompressionFailureZAsString() <em>Compression Failure ZAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompressionFailureZAsString()
	 * @generated
	 * @ordered
	 */
	protected String compressionFailureZAsString = COMPRESSION_FAILURE_ZAS_STRING_EDEFAULT;

	/**
	 * This is true if the Compression Failure ZAs String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean compressionFailureZAsStringESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcFailureConnectionConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcFailureConnectionCondition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTensionFailureX() {
		return tensionFailureX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTensionFailureX(double newTensionFailureX) {
		double oldTensionFailureX = tensionFailureX;
		tensionFailureX = newTensionFailureX;
		boolean oldTensionFailureXESet = tensionFailureXESet;
		tensionFailureXESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__TENSION_FAILURE_X, oldTensionFailureX, tensionFailureX, !oldTensionFailureXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTensionFailureX() {
		double oldTensionFailureX = tensionFailureX;
		boolean oldTensionFailureXESet = tensionFailureXESet;
		tensionFailureX = TENSION_FAILURE_X_EDEFAULT;
		tensionFailureXESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__TENSION_FAILURE_X, oldTensionFailureX, TENSION_FAILURE_X_EDEFAULT, oldTensionFailureXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTensionFailureX() {
		return tensionFailureXESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTensionFailureXAsString() {
		return tensionFailureXAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTensionFailureXAsString(String newTensionFailureXAsString) {
		String oldTensionFailureXAsString = tensionFailureXAsString;
		tensionFailureXAsString = newTensionFailureXAsString;
		boolean oldTensionFailureXAsStringESet = tensionFailureXAsStringESet;
		tensionFailureXAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__TENSION_FAILURE_XAS_STRING, oldTensionFailureXAsString, tensionFailureXAsString, !oldTensionFailureXAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTensionFailureXAsString() {
		String oldTensionFailureXAsString = tensionFailureXAsString;
		boolean oldTensionFailureXAsStringESet = tensionFailureXAsStringESet;
		tensionFailureXAsString = TENSION_FAILURE_XAS_STRING_EDEFAULT;
		tensionFailureXAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__TENSION_FAILURE_XAS_STRING, oldTensionFailureXAsString, TENSION_FAILURE_XAS_STRING_EDEFAULT, oldTensionFailureXAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTensionFailureXAsString() {
		return tensionFailureXAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTensionFailureY() {
		return tensionFailureY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTensionFailureY(double newTensionFailureY) {
		double oldTensionFailureY = tensionFailureY;
		tensionFailureY = newTensionFailureY;
		boolean oldTensionFailureYESet = tensionFailureYESet;
		tensionFailureYESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__TENSION_FAILURE_Y, oldTensionFailureY, tensionFailureY, !oldTensionFailureYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTensionFailureY() {
		double oldTensionFailureY = tensionFailureY;
		boolean oldTensionFailureYESet = tensionFailureYESet;
		tensionFailureY = TENSION_FAILURE_Y_EDEFAULT;
		tensionFailureYESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__TENSION_FAILURE_Y, oldTensionFailureY, TENSION_FAILURE_Y_EDEFAULT, oldTensionFailureYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTensionFailureY() {
		return tensionFailureYESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTensionFailureYAsString() {
		return tensionFailureYAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTensionFailureYAsString(String newTensionFailureYAsString) {
		String oldTensionFailureYAsString = tensionFailureYAsString;
		tensionFailureYAsString = newTensionFailureYAsString;
		boolean oldTensionFailureYAsStringESet = tensionFailureYAsStringESet;
		tensionFailureYAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__TENSION_FAILURE_YAS_STRING, oldTensionFailureYAsString, tensionFailureYAsString, !oldTensionFailureYAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTensionFailureYAsString() {
		String oldTensionFailureYAsString = tensionFailureYAsString;
		boolean oldTensionFailureYAsStringESet = tensionFailureYAsStringESet;
		tensionFailureYAsString = TENSION_FAILURE_YAS_STRING_EDEFAULT;
		tensionFailureYAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__TENSION_FAILURE_YAS_STRING, oldTensionFailureYAsString, TENSION_FAILURE_YAS_STRING_EDEFAULT, oldTensionFailureYAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTensionFailureYAsString() {
		return tensionFailureYAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTensionFailureZ() {
		return tensionFailureZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTensionFailureZ(double newTensionFailureZ) {
		double oldTensionFailureZ = tensionFailureZ;
		tensionFailureZ = newTensionFailureZ;
		boolean oldTensionFailureZESet = tensionFailureZESet;
		tensionFailureZESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__TENSION_FAILURE_Z, oldTensionFailureZ, tensionFailureZ, !oldTensionFailureZESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTensionFailureZ() {
		double oldTensionFailureZ = tensionFailureZ;
		boolean oldTensionFailureZESet = tensionFailureZESet;
		tensionFailureZ = TENSION_FAILURE_Z_EDEFAULT;
		tensionFailureZESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__TENSION_FAILURE_Z, oldTensionFailureZ, TENSION_FAILURE_Z_EDEFAULT, oldTensionFailureZESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTensionFailureZ() {
		return tensionFailureZESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTensionFailureZAsString() {
		return tensionFailureZAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTensionFailureZAsString(String newTensionFailureZAsString) {
		String oldTensionFailureZAsString = tensionFailureZAsString;
		tensionFailureZAsString = newTensionFailureZAsString;
		boolean oldTensionFailureZAsStringESet = tensionFailureZAsStringESet;
		tensionFailureZAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__TENSION_FAILURE_ZAS_STRING, oldTensionFailureZAsString, tensionFailureZAsString, !oldTensionFailureZAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTensionFailureZAsString() {
		String oldTensionFailureZAsString = tensionFailureZAsString;
		boolean oldTensionFailureZAsStringESet = tensionFailureZAsStringESet;
		tensionFailureZAsString = TENSION_FAILURE_ZAS_STRING_EDEFAULT;
		tensionFailureZAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__TENSION_FAILURE_ZAS_STRING, oldTensionFailureZAsString, TENSION_FAILURE_ZAS_STRING_EDEFAULT, oldTensionFailureZAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTensionFailureZAsString() {
		return tensionFailureZAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCompressionFailureX() {
		return compressionFailureX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompressionFailureX(double newCompressionFailureX) {
		double oldCompressionFailureX = compressionFailureX;
		compressionFailureX = newCompressionFailureX;
		boolean oldCompressionFailureXESet = compressionFailureXESet;
		compressionFailureXESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__COMPRESSION_FAILURE_X, oldCompressionFailureX, compressionFailureX, !oldCompressionFailureXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCompressionFailureX() {
		double oldCompressionFailureX = compressionFailureX;
		boolean oldCompressionFailureXESet = compressionFailureXESet;
		compressionFailureX = COMPRESSION_FAILURE_X_EDEFAULT;
		compressionFailureXESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__COMPRESSION_FAILURE_X, oldCompressionFailureX, COMPRESSION_FAILURE_X_EDEFAULT, oldCompressionFailureXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCompressionFailureX() {
		return compressionFailureXESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompressionFailureXAsString() {
		return compressionFailureXAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompressionFailureXAsString(String newCompressionFailureXAsString) {
		String oldCompressionFailureXAsString = compressionFailureXAsString;
		compressionFailureXAsString = newCompressionFailureXAsString;
		boolean oldCompressionFailureXAsStringESet = compressionFailureXAsStringESet;
		compressionFailureXAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__COMPRESSION_FAILURE_XAS_STRING, oldCompressionFailureXAsString, compressionFailureXAsString, !oldCompressionFailureXAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCompressionFailureXAsString() {
		String oldCompressionFailureXAsString = compressionFailureXAsString;
		boolean oldCompressionFailureXAsStringESet = compressionFailureXAsStringESet;
		compressionFailureXAsString = COMPRESSION_FAILURE_XAS_STRING_EDEFAULT;
		compressionFailureXAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__COMPRESSION_FAILURE_XAS_STRING, oldCompressionFailureXAsString, COMPRESSION_FAILURE_XAS_STRING_EDEFAULT, oldCompressionFailureXAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCompressionFailureXAsString() {
		return compressionFailureXAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCompressionFailureY() {
		return compressionFailureY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompressionFailureY(double newCompressionFailureY) {
		double oldCompressionFailureY = compressionFailureY;
		compressionFailureY = newCompressionFailureY;
		boolean oldCompressionFailureYESet = compressionFailureYESet;
		compressionFailureYESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__COMPRESSION_FAILURE_Y, oldCompressionFailureY, compressionFailureY, !oldCompressionFailureYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCompressionFailureY() {
		double oldCompressionFailureY = compressionFailureY;
		boolean oldCompressionFailureYESet = compressionFailureYESet;
		compressionFailureY = COMPRESSION_FAILURE_Y_EDEFAULT;
		compressionFailureYESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__COMPRESSION_FAILURE_Y, oldCompressionFailureY, COMPRESSION_FAILURE_Y_EDEFAULT, oldCompressionFailureYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCompressionFailureY() {
		return compressionFailureYESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompressionFailureYAsString() {
		return compressionFailureYAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompressionFailureYAsString(String newCompressionFailureYAsString) {
		String oldCompressionFailureYAsString = compressionFailureYAsString;
		compressionFailureYAsString = newCompressionFailureYAsString;
		boolean oldCompressionFailureYAsStringESet = compressionFailureYAsStringESet;
		compressionFailureYAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__COMPRESSION_FAILURE_YAS_STRING, oldCompressionFailureYAsString, compressionFailureYAsString, !oldCompressionFailureYAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCompressionFailureYAsString() {
		String oldCompressionFailureYAsString = compressionFailureYAsString;
		boolean oldCompressionFailureYAsStringESet = compressionFailureYAsStringESet;
		compressionFailureYAsString = COMPRESSION_FAILURE_YAS_STRING_EDEFAULT;
		compressionFailureYAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__COMPRESSION_FAILURE_YAS_STRING, oldCompressionFailureYAsString, COMPRESSION_FAILURE_YAS_STRING_EDEFAULT, oldCompressionFailureYAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCompressionFailureYAsString() {
		return compressionFailureYAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCompressionFailureZ() {
		return compressionFailureZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompressionFailureZ(double newCompressionFailureZ) {
		double oldCompressionFailureZ = compressionFailureZ;
		compressionFailureZ = newCompressionFailureZ;
		boolean oldCompressionFailureZESet = compressionFailureZESet;
		compressionFailureZESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__COMPRESSION_FAILURE_Z, oldCompressionFailureZ, compressionFailureZ, !oldCompressionFailureZESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCompressionFailureZ() {
		double oldCompressionFailureZ = compressionFailureZ;
		boolean oldCompressionFailureZESet = compressionFailureZESet;
		compressionFailureZ = COMPRESSION_FAILURE_Z_EDEFAULT;
		compressionFailureZESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__COMPRESSION_FAILURE_Z, oldCompressionFailureZ, COMPRESSION_FAILURE_Z_EDEFAULT, oldCompressionFailureZESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCompressionFailureZ() {
		return compressionFailureZESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompressionFailureZAsString() {
		return compressionFailureZAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompressionFailureZAsString(String newCompressionFailureZAsString) {
		String oldCompressionFailureZAsString = compressionFailureZAsString;
		compressionFailureZAsString = newCompressionFailureZAsString;
		boolean oldCompressionFailureZAsStringESet = compressionFailureZAsStringESet;
		compressionFailureZAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__COMPRESSION_FAILURE_ZAS_STRING, oldCompressionFailureZAsString, compressionFailureZAsString, !oldCompressionFailureZAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCompressionFailureZAsString() {
		String oldCompressionFailureZAsString = compressionFailureZAsString;
		boolean oldCompressionFailureZAsStringESet = compressionFailureZAsStringESet;
		compressionFailureZAsString = COMPRESSION_FAILURE_ZAS_STRING_EDEFAULT;
		compressionFailureZAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__COMPRESSION_FAILURE_ZAS_STRING, oldCompressionFailureZAsString, COMPRESSION_FAILURE_ZAS_STRING_EDEFAULT, oldCompressionFailureZAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCompressionFailureZAsString() {
		return compressionFailureZAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__TENSION_FAILURE_X:
				return getTensionFailureX();
			case Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__TENSION_FAILURE_XAS_STRING:
				return getTensionFailureXAsString();
			case Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__TENSION_FAILURE_Y:
				return getTensionFailureY();
			case Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__TENSION_FAILURE_YAS_STRING:
				return getTensionFailureYAsString();
			case Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__TENSION_FAILURE_Z:
				return getTensionFailureZ();
			case Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__TENSION_FAILURE_ZAS_STRING:
				return getTensionFailureZAsString();
			case Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__COMPRESSION_FAILURE_X:
				return getCompressionFailureX();
			case Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__COMPRESSION_FAILURE_XAS_STRING:
				return getCompressionFailureXAsString();
			case Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__COMPRESSION_FAILURE_Y:
				return getCompressionFailureY();
			case Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__COMPRESSION_FAILURE_YAS_STRING:
				return getCompressionFailureYAsString();
			case Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__COMPRESSION_FAILURE_Z:
				return getCompressionFailureZ();
			case Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__COMPRESSION_FAILURE_ZAS_STRING:
				return getCompressionFailureZAsString();
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
			case Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__TENSION_FAILURE_X:
				setTensionFailureX((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__TENSION_FAILURE_XAS_STRING:
				setTensionFailureXAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__TENSION_FAILURE_Y:
				setTensionFailureY((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__TENSION_FAILURE_YAS_STRING:
				setTensionFailureYAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__TENSION_FAILURE_Z:
				setTensionFailureZ((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__TENSION_FAILURE_ZAS_STRING:
				setTensionFailureZAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__COMPRESSION_FAILURE_X:
				setCompressionFailureX((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__COMPRESSION_FAILURE_XAS_STRING:
				setCompressionFailureXAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__COMPRESSION_FAILURE_Y:
				setCompressionFailureY((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__COMPRESSION_FAILURE_YAS_STRING:
				setCompressionFailureYAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__COMPRESSION_FAILURE_Z:
				setCompressionFailureZ((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__COMPRESSION_FAILURE_ZAS_STRING:
				setCompressionFailureZAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__TENSION_FAILURE_X:
				unsetTensionFailureX();
				return;
			case Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__TENSION_FAILURE_XAS_STRING:
				unsetTensionFailureXAsString();
				return;
			case Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__TENSION_FAILURE_Y:
				unsetTensionFailureY();
				return;
			case Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__TENSION_FAILURE_YAS_STRING:
				unsetTensionFailureYAsString();
				return;
			case Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__TENSION_FAILURE_Z:
				unsetTensionFailureZ();
				return;
			case Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__TENSION_FAILURE_ZAS_STRING:
				unsetTensionFailureZAsString();
				return;
			case Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__COMPRESSION_FAILURE_X:
				unsetCompressionFailureX();
				return;
			case Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__COMPRESSION_FAILURE_XAS_STRING:
				unsetCompressionFailureXAsString();
				return;
			case Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__COMPRESSION_FAILURE_Y:
				unsetCompressionFailureY();
				return;
			case Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__COMPRESSION_FAILURE_YAS_STRING:
				unsetCompressionFailureYAsString();
				return;
			case Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__COMPRESSION_FAILURE_Z:
				unsetCompressionFailureZ();
				return;
			case Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__COMPRESSION_FAILURE_ZAS_STRING:
				unsetCompressionFailureZAsString();
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
			case Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__TENSION_FAILURE_X:
				return isSetTensionFailureX();
			case Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__TENSION_FAILURE_XAS_STRING:
				return isSetTensionFailureXAsString();
			case Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__TENSION_FAILURE_Y:
				return isSetTensionFailureY();
			case Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__TENSION_FAILURE_YAS_STRING:
				return isSetTensionFailureYAsString();
			case Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__TENSION_FAILURE_Z:
				return isSetTensionFailureZ();
			case Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__TENSION_FAILURE_ZAS_STRING:
				return isSetTensionFailureZAsString();
			case Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__COMPRESSION_FAILURE_X:
				return isSetCompressionFailureX();
			case Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__COMPRESSION_FAILURE_XAS_STRING:
				return isSetCompressionFailureXAsString();
			case Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__COMPRESSION_FAILURE_Y:
				return isSetCompressionFailureY();
			case Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__COMPRESSION_FAILURE_YAS_STRING:
				return isSetCompressionFailureYAsString();
			case Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__COMPRESSION_FAILURE_Z:
				return isSetCompressionFailureZ();
			case Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__COMPRESSION_FAILURE_ZAS_STRING:
				return isSetCompressionFailureZAsString();
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
		result.append(" (TensionFailureX: ");
		if (tensionFailureXESet) result.append(tensionFailureX); else result.append("<unset>");
		result.append(", TensionFailureXAsString: ");
		if (tensionFailureXAsStringESet) result.append(tensionFailureXAsString); else result.append("<unset>");
		result.append(", TensionFailureY: ");
		if (tensionFailureYESet) result.append(tensionFailureY); else result.append("<unset>");
		result.append(", TensionFailureYAsString: ");
		if (tensionFailureYAsStringESet) result.append(tensionFailureYAsString); else result.append("<unset>");
		result.append(", TensionFailureZ: ");
		if (tensionFailureZESet) result.append(tensionFailureZ); else result.append("<unset>");
		result.append(", TensionFailureZAsString: ");
		if (tensionFailureZAsStringESet) result.append(tensionFailureZAsString); else result.append("<unset>");
		result.append(", CompressionFailureX: ");
		if (compressionFailureXESet) result.append(compressionFailureX); else result.append("<unset>");
		result.append(", CompressionFailureXAsString: ");
		if (compressionFailureXAsStringESet) result.append(compressionFailureXAsString); else result.append("<unset>");
		result.append(", CompressionFailureY: ");
		if (compressionFailureYESet) result.append(compressionFailureY); else result.append("<unset>");
		result.append(", CompressionFailureYAsString: ");
		if (compressionFailureYAsStringESet) result.append(compressionFailureYAsString); else result.append("<unset>");
		result.append(", CompressionFailureZ: ");
		if (compressionFailureZESet) result.append(compressionFailureZ); else result.append("<unset>");
		result.append(", CompressionFailureZAsString: ");
		if (compressionFailureZAsStringESet) result.append(compressionFailureZAsString); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcFailureConnectionConditionImpl
