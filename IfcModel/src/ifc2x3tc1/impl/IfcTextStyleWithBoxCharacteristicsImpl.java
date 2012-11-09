/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcSizeSelect;
import ifc2x3tc1.IfcTextStyleWithBoxCharacteristics;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Text Style With Box Characteristics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcTextStyleWithBoxCharacteristicsImpl#getBoxHeight <em>Box Height</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTextStyleWithBoxCharacteristicsImpl#getBoxHeightAsString <em>Box Height As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTextStyleWithBoxCharacteristicsImpl#getBoxWidth <em>Box Width</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTextStyleWithBoxCharacteristicsImpl#getBoxWidthAsString <em>Box Width As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTextStyleWithBoxCharacteristicsImpl#getBoxSlantAngle <em>Box Slant Angle</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTextStyleWithBoxCharacteristicsImpl#getBoxSlantAngleAsString <em>Box Slant Angle As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTextStyleWithBoxCharacteristicsImpl#getBoxRotateAngle <em>Box Rotate Angle</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTextStyleWithBoxCharacteristicsImpl#getBoxRotateAngleAsString <em>Box Rotate Angle As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTextStyleWithBoxCharacteristicsImpl#getCharacterSpacing <em>Character Spacing</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcTextStyleWithBoxCharacteristicsImpl extends EObjectImpl implements IfcTextStyleWithBoxCharacteristics {
	/**
	 * The default value of the '{@link #getBoxHeight() <em>Box Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoxHeight()
	 * @generated
	 * @ordered
	 */
	protected static final double BOX_HEIGHT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBoxHeight() <em>Box Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoxHeight()
	 * @generated
	 * @ordered
	 */
	protected double boxHeight = BOX_HEIGHT_EDEFAULT;

	/**
	 * This is true if the Box Height attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean boxHeightESet;

	/**
	 * The default value of the '{@link #getBoxHeightAsString() <em>Box Height As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoxHeightAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String BOX_HEIGHT_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBoxHeightAsString() <em>Box Height As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoxHeightAsString()
	 * @generated
	 * @ordered
	 */
	protected String boxHeightAsString = BOX_HEIGHT_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Box Height As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean boxHeightAsStringESet;

	/**
	 * The default value of the '{@link #getBoxWidth() <em>Box Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoxWidth()
	 * @generated
	 * @ordered
	 */
	protected static final double BOX_WIDTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBoxWidth() <em>Box Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoxWidth()
	 * @generated
	 * @ordered
	 */
	protected double boxWidth = BOX_WIDTH_EDEFAULT;

	/**
	 * This is true if the Box Width attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean boxWidthESet;

	/**
	 * The default value of the '{@link #getBoxWidthAsString() <em>Box Width As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoxWidthAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String BOX_WIDTH_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBoxWidthAsString() <em>Box Width As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoxWidthAsString()
	 * @generated
	 * @ordered
	 */
	protected String boxWidthAsString = BOX_WIDTH_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Box Width As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean boxWidthAsStringESet;

	/**
	 * The default value of the '{@link #getBoxSlantAngle() <em>Box Slant Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoxSlantAngle()
	 * @generated
	 * @ordered
	 */
	protected static final double BOX_SLANT_ANGLE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBoxSlantAngle() <em>Box Slant Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoxSlantAngle()
	 * @generated
	 * @ordered
	 */
	protected double boxSlantAngle = BOX_SLANT_ANGLE_EDEFAULT;

	/**
	 * This is true if the Box Slant Angle attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean boxSlantAngleESet;

	/**
	 * The default value of the '{@link #getBoxSlantAngleAsString() <em>Box Slant Angle As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoxSlantAngleAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String BOX_SLANT_ANGLE_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBoxSlantAngleAsString() <em>Box Slant Angle As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoxSlantAngleAsString()
	 * @generated
	 * @ordered
	 */
	protected String boxSlantAngleAsString = BOX_SLANT_ANGLE_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Box Slant Angle As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean boxSlantAngleAsStringESet;

	/**
	 * The default value of the '{@link #getBoxRotateAngle() <em>Box Rotate Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoxRotateAngle()
	 * @generated
	 * @ordered
	 */
	protected static final double BOX_ROTATE_ANGLE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBoxRotateAngle() <em>Box Rotate Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoxRotateAngle()
	 * @generated
	 * @ordered
	 */
	protected double boxRotateAngle = BOX_ROTATE_ANGLE_EDEFAULT;

	/**
	 * This is true if the Box Rotate Angle attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean boxRotateAngleESet;

	/**
	 * The default value of the '{@link #getBoxRotateAngleAsString() <em>Box Rotate Angle As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoxRotateAngleAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String BOX_ROTATE_ANGLE_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBoxRotateAngleAsString() <em>Box Rotate Angle As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoxRotateAngleAsString()
	 * @generated
	 * @ordered
	 */
	protected String boxRotateAngleAsString = BOX_ROTATE_ANGLE_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Box Rotate Angle As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean boxRotateAngleAsStringESet;

	/**
	 * The cached value of the '{@link #getCharacterSpacing() <em>Character Spacing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacterSpacing()
	 * @generated
	 * @ordered
	 */
	protected IfcSizeSelect characterSpacing;

	/**
	 * This is true if the Character Spacing reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean characterSpacingESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcTextStyleWithBoxCharacteristicsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcTextStyleWithBoxCharacteristics();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBoxHeight() {
		return boxHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoxHeight(double newBoxHeight) {
		double oldBoxHeight = boxHeight;
		boxHeight = newBoxHeight;
		boolean oldBoxHeightESet = boxHeightESet;
		boxHeightESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_HEIGHT, oldBoxHeight, boxHeight, !oldBoxHeightESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBoxHeight() {
		double oldBoxHeight = boxHeight;
		boolean oldBoxHeightESet = boxHeightESet;
		boxHeight = BOX_HEIGHT_EDEFAULT;
		boxHeightESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_HEIGHT, oldBoxHeight, BOX_HEIGHT_EDEFAULT, oldBoxHeightESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBoxHeight() {
		return boxHeightESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBoxHeightAsString() {
		return boxHeightAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoxHeightAsString(String newBoxHeightAsString) {
		String oldBoxHeightAsString = boxHeightAsString;
		boxHeightAsString = newBoxHeightAsString;
		boolean oldBoxHeightAsStringESet = boxHeightAsStringESet;
		boxHeightAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_HEIGHT_AS_STRING, oldBoxHeightAsString, boxHeightAsString, !oldBoxHeightAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBoxHeightAsString() {
		String oldBoxHeightAsString = boxHeightAsString;
		boolean oldBoxHeightAsStringESet = boxHeightAsStringESet;
		boxHeightAsString = BOX_HEIGHT_AS_STRING_EDEFAULT;
		boxHeightAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_HEIGHT_AS_STRING, oldBoxHeightAsString, BOX_HEIGHT_AS_STRING_EDEFAULT, oldBoxHeightAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBoxHeightAsString() {
		return boxHeightAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBoxWidth() {
		return boxWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoxWidth(double newBoxWidth) {
		double oldBoxWidth = boxWidth;
		boxWidth = newBoxWidth;
		boolean oldBoxWidthESet = boxWidthESet;
		boxWidthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_WIDTH, oldBoxWidth, boxWidth, !oldBoxWidthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBoxWidth() {
		double oldBoxWidth = boxWidth;
		boolean oldBoxWidthESet = boxWidthESet;
		boxWidth = BOX_WIDTH_EDEFAULT;
		boxWidthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_WIDTH, oldBoxWidth, BOX_WIDTH_EDEFAULT, oldBoxWidthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBoxWidth() {
		return boxWidthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBoxWidthAsString() {
		return boxWidthAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoxWidthAsString(String newBoxWidthAsString) {
		String oldBoxWidthAsString = boxWidthAsString;
		boxWidthAsString = newBoxWidthAsString;
		boolean oldBoxWidthAsStringESet = boxWidthAsStringESet;
		boxWidthAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_WIDTH_AS_STRING, oldBoxWidthAsString, boxWidthAsString, !oldBoxWidthAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBoxWidthAsString() {
		String oldBoxWidthAsString = boxWidthAsString;
		boolean oldBoxWidthAsStringESet = boxWidthAsStringESet;
		boxWidthAsString = BOX_WIDTH_AS_STRING_EDEFAULT;
		boxWidthAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_WIDTH_AS_STRING, oldBoxWidthAsString, BOX_WIDTH_AS_STRING_EDEFAULT, oldBoxWidthAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBoxWidthAsString() {
		return boxWidthAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBoxSlantAngle() {
		return boxSlantAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoxSlantAngle(double newBoxSlantAngle) {
		double oldBoxSlantAngle = boxSlantAngle;
		boxSlantAngle = newBoxSlantAngle;
		boolean oldBoxSlantAngleESet = boxSlantAngleESet;
		boxSlantAngleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_SLANT_ANGLE, oldBoxSlantAngle, boxSlantAngle, !oldBoxSlantAngleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBoxSlantAngle() {
		double oldBoxSlantAngle = boxSlantAngle;
		boolean oldBoxSlantAngleESet = boxSlantAngleESet;
		boxSlantAngle = BOX_SLANT_ANGLE_EDEFAULT;
		boxSlantAngleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_SLANT_ANGLE, oldBoxSlantAngle, BOX_SLANT_ANGLE_EDEFAULT, oldBoxSlantAngleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBoxSlantAngle() {
		return boxSlantAngleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBoxSlantAngleAsString() {
		return boxSlantAngleAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoxSlantAngleAsString(String newBoxSlantAngleAsString) {
		String oldBoxSlantAngleAsString = boxSlantAngleAsString;
		boxSlantAngleAsString = newBoxSlantAngleAsString;
		boolean oldBoxSlantAngleAsStringESet = boxSlantAngleAsStringESet;
		boxSlantAngleAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_SLANT_ANGLE_AS_STRING, oldBoxSlantAngleAsString, boxSlantAngleAsString, !oldBoxSlantAngleAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBoxSlantAngleAsString() {
		String oldBoxSlantAngleAsString = boxSlantAngleAsString;
		boolean oldBoxSlantAngleAsStringESet = boxSlantAngleAsStringESet;
		boxSlantAngleAsString = BOX_SLANT_ANGLE_AS_STRING_EDEFAULT;
		boxSlantAngleAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_SLANT_ANGLE_AS_STRING, oldBoxSlantAngleAsString, BOX_SLANT_ANGLE_AS_STRING_EDEFAULT, oldBoxSlantAngleAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBoxSlantAngleAsString() {
		return boxSlantAngleAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBoxRotateAngle() {
		return boxRotateAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoxRotateAngle(double newBoxRotateAngle) {
		double oldBoxRotateAngle = boxRotateAngle;
		boxRotateAngle = newBoxRotateAngle;
		boolean oldBoxRotateAngleESet = boxRotateAngleESet;
		boxRotateAngleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_ROTATE_ANGLE, oldBoxRotateAngle, boxRotateAngle, !oldBoxRotateAngleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBoxRotateAngle() {
		double oldBoxRotateAngle = boxRotateAngle;
		boolean oldBoxRotateAngleESet = boxRotateAngleESet;
		boxRotateAngle = BOX_ROTATE_ANGLE_EDEFAULT;
		boxRotateAngleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_ROTATE_ANGLE, oldBoxRotateAngle, BOX_ROTATE_ANGLE_EDEFAULT, oldBoxRotateAngleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBoxRotateAngle() {
		return boxRotateAngleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBoxRotateAngleAsString() {
		return boxRotateAngleAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoxRotateAngleAsString(String newBoxRotateAngleAsString) {
		String oldBoxRotateAngleAsString = boxRotateAngleAsString;
		boxRotateAngleAsString = newBoxRotateAngleAsString;
		boolean oldBoxRotateAngleAsStringESet = boxRotateAngleAsStringESet;
		boxRotateAngleAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_ROTATE_ANGLE_AS_STRING, oldBoxRotateAngleAsString, boxRotateAngleAsString, !oldBoxRotateAngleAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBoxRotateAngleAsString() {
		String oldBoxRotateAngleAsString = boxRotateAngleAsString;
		boolean oldBoxRotateAngleAsStringESet = boxRotateAngleAsStringESet;
		boxRotateAngleAsString = BOX_ROTATE_ANGLE_AS_STRING_EDEFAULT;
		boxRotateAngleAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_ROTATE_ANGLE_AS_STRING, oldBoxRotateAngleAsString, BOX_ROTATE_ANGLE_AS_STRING_EDEFAULT, oldBoxRotateAngleAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBoxRotateAngleAsString() {
		return boxRotateAngleAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSizeSelect getCharacterSpacing() {
		if (characterSpacing != null && characterSpacing.eIsProxy()) {
			InternalEObject oldCharacterSpacing = (InternalEObject)characterSpacing;
			characterSpacing = (IfcSizeSelect)eResolveProxy(oldCharacterSpacing);
			if (characterSpacing != oldCharacterSpacing) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__CHARACTER_SPACING, oldCharacterSpacing, characterSpacing));
			}
		}
		return characterSpacing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSizeSelect basicGetCharacterSpacing() {
		return characterSpacing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharacterSpacing(IfcSizeSelect newCharacterSpacing) {
		IfcSizeSelect oldCharacterSpacing = characterSpacing;
		characterSpacing = newCharacterSpacing;
		boolean oldCharacterSpacingESet = characterSpacingESet;
		characterSpacingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__CHARACTER_SPACING, oldCharacterSpacing, characterSpacing, !oldCharacterSpacingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCharacterSpacing() {
		IfcSizeSelect oldCharacterSpacing = characterSpacing;
		boolean oldCharacterSpacingESet = characterSpacingESet;
		characterSpacing = null;
		characterSpacingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__CHARACTER_SPACING, oldCharacterSpacing, null, oldCharacterSpacingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCharacterSpacing() {
		return characterSpacingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_HEIGHT:
				return getBoxHeight();
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_HEIGHT_AS_STRING:
				return getBoxHeightAsString();
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_WIDTH:
				return getBoxWidth();
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_WIDTH_AS_STRING:
				return getBoxWidthAsString();
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_SLANT_ANGLE:
				return getBoxSlantAngle();
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_SLANT_ANGLE_AS_STRING:
				return getBoxSlantAngleAsString();
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_ROTATE_ANGLE:
				return getBoxRotateAngle();
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_ROTATE_ANGLE_AS_STRING:
				return getBoxRotateAngleAsString();
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__CHARACTER_SPACING:
				if (resolve) return getCharacterSpacing();
				return basicGetCharacterSpacing();
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
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_HEIGHT:
				setBoxHeight((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_HEIGHT_AS_STRING:
				setBoxHeightAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_WIDTH:
				setBoxWidth((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_WIDTH_AS_STRING:
				setBoxWidthAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_SLANT_ANGLE:
				setBoxSlantAngle((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_SLANT_ANGLE_AS_STRING:
				setBoxSlantAngleAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_ROTATE_ANGLE:
				setBoxRotateAngle((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_ROTATE_ANGLE_AS_STRING:
				setBoxRotateAngleAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__CHARACTER_SPACING:
				setCharacterSpacing((IfcSizeSelect)newValue);
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
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_HEIGHT:
				unsetBoxHeight();
				return;
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_HEIGHT_AS_STRING:
				unsetBoxHeightAsString();
				return;
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_WIDTH:
				unsetBoxWidth();
				return;
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_WIDTH_AS_STRING:
				unsetBoxWidthAsString();
				return;
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_SLANT_ANGLE:
				unsetBoxSlantAngle();
				return;
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_SLANT_ANGLE_AS_STRING:
				unsetBoxSlantAngleAsString();
				return;
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_ROTATE_ANGLE:
				unsetBoxRotateAngle();
				return;
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_ROTATE_ANGLE_AS_STRING:
				unsetBoxRotateAngleAsString();
				return;
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__CHARACTER_SPACING:
				unsetCharacterSpacing();
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
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_HEIGHT:
				return isSetBoxHeight();
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_HEIGHT_AS_STRING:
				return isSetBoxHeightAsString();
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_WIDTH:
				return isSetBoxWidth();
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_WIDTH_AS_STRING:
				return isSetBoxWidthAsString();
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_SLANT_ANGLE:
				return isSetBoxSlantAngle();
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_SLANT_ANGLE_AS_STRING:
				return isSetBoxSlantAngleAsString();
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_ROTATE_ANGLE:
				return isSetBoxRotateAngle();
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_ROTATE_ANGLE_AS_STRING:
				return isSetBoxRotateAngleAsString();
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__CHARACTER_SPACING:
				return isSetCharacterSpacing();
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
		result.append(" (BoxHeight: ");
		if (boxHeightESet) result.append(boxHeight); else result.append("<unset>");
		result.append(", BoxHeightAsString: ");
		if (boxHeightAsStringESet) result.append(boxHeightAsString); else result.append("<unset>");
		result.append(", BoxWidth: ");
		if (boxWidthESet) result.append(boxWidth); else result.append("<unset>");
		result.append(", BoxWidthAsString: ");
		if (boxWidthAsStringESet) result.append(boxWidthAsString); else result.append("<unset>");
		result.append(", BoxSlantAngle: ");
		if (boxSlantAngleESet) result.append(boxSlantAngle); else result.append("<unset>");
		result.append(", BoxSlantAngleAsString: ");
		if (boxSlantAngleAsStringESet) result.append(boxSlantAngleAsString); else result.append("<unset>");
		result.append(", BoxRotateAngle: ");
		if (boxRotateAngleESet) result.append(boxRotateAngle); else result.append("<unset>");
		result.append(", BoxRotateAngleAsString: ");
		if (boxRotateAngleAsStringESet) result.append(boxRotateAngleAsString); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcTextStyleWithBoxCharacteristicsImpl
