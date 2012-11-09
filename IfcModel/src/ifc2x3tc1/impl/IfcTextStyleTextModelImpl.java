/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcSizeSelect;
import ifc2x3tc1.IfcTextStyleTextModel;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Text Style Text Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcTextStyleTextModelImpl#getTextIndent <em>Text Indent</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTextStyleTextModelImpl#getTextAlign <em>Text Align</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTextStyleTextModelImpl#getTextDecoration <em>Text Decoration</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTextStyleTextModelImpl#getLetterSpacing <em>Letter Spacing</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTextStyleTextModelImpl#getWordSpacing <em>Word Spacing</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTextStyleTextModelImpl#getTextTransform <em>Text Transform</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTextStyleTextModelImpl#getLineHeight <em>Line Height</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcTextStyleTextModelImpl extends EObjectImpl implements IfcTextStyleTextModel {
	/**
	 * The cached value of the '{@link #getTextIndent() <em>Text Indent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextIndent()
	 * @generated
	 * @ordered
	 */
	protected IfcSizeSelect textIndent;

	/**
	 * This is true if the Text Indent reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean textIndentESet;

	/**
	 * The default value of the '{@link #getTextAlign() <em>Text Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextAlign()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_ALIGN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextAlign() <em>Text Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextAlign()
	 * @generated
	 * @ordered
	 */
	protected String textAlign = TEXT_ALIGN_EDEFAULT;

	/**
	 * This is true if the Text Align attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean textAlignESet;

	/**
	 * The default value of the '{@link #getTextDecoration() <em>Text Decoration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextDecoration()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_DECORATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextDecoration() <em>Text Decoration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextDecoration()
	 * @generated
	 * @ordered
	 */
	protected String textDecoration = TEXT_DECORATION_EDEFAULT;

	/**
	 * This is true if the Text Decoration attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean textDecorationESet;

	/**
	 * The cached value of the '{@link #getLetterSpacing() <em>Letter Spacing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLetterSpacing()
	 * @generated
	 * @ordered
	 */
	protected IfcSizeSelect letterSpacing;

	/**
	 * This is true if the Letter Spacing reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean letterSpacingESet;

	/**
	 * The cached value of the '{@link #getWordSpacing() <em>Word Spacing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWordSpacing()
	 * @generated
	 * @ordered
	 */
	protected IfcSizeSelect wordSpacing;

	/**
	 * This is true if the Word Spacing reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean wordSpacingESet;

	/**
	 * The default value of the '{@link #getTextTransform() <em>Text Transform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextTransform()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_TRANSFORM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextTransform() <em>Text Transform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextTransform()
	 * @generated
	 * @ordered
	 */
	protected String textTransform = TEXT_TRANSFORM_EDEFAULT;

	/**
	 * This is true if the Text Transform attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean textTransformESet;

	/**
	 * The cached value of the '{@link #getLineHeight() <em>Line Height</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineHeight()
	 * @generated
	 * @ordered
	 */
	protected IfcSizeSelect lineHeight;

	/**
	 * This is true if the Line Height reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lineHeightESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcTextStyleTextModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcTextStyleTextModel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSizeSelect getTextIndent() {
		if (textIndent != null && textIndent.eIsProxy()) {
			InternalEObject oldTextIndent = (InternalEObject)textIndent;
			textIndent = (IfcSizeSelect)eResolveProxy(oldTextIndent);
			if (textIndent != oldTextIndent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_TEXT_STYLE_TEXT_MODEL__TEXT_INDENT, oldTextIndent, textIndent));
			}
		}
		return textIndent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSizeSelect basicGetTextIndent() {
		return textIndent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextIndent(IfcSizeSelect newTextIndent) {
		IfcSizeSelect oldTextIndent = textIndent;
		textIndent = newTextIndent;
		boolean oldTextIndentESet = textIndentESet;
		textIndentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TEXT_STYLE_TEXT_MODEL__TEXT_INDENT, oldTextIndent, textIndent, !oldTextIndentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTextIndent() {
		IfcSizeSelect oldTextIndent = textIndent;
		boolean oldTextIndentESet = textIndentESet;
		textIndent = null;
		textIndentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_TEXT_STYLE_TEXT_MODEL__TEXT_INDENT, oldTextIndent, null, oldTextIndentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTextIndent() {
		return textIndentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextAlign() {
		return textAlign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextAlign(String newTextAlign) {
		String oldTextAlign = textAlign;
		textAlign = newTextAlign;
		boolean oldTextAlignESet = textAlignESet;
		textAlignESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TEXT_STYLE_TEXT_MODEL__TEXT_ALIGN, oldTextAlign, textAlign, !oldTextAlignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTextAlign() {
		String oldTextAlign = textAlign;
		boolean oldTextAlignESet = textAlignESet;
		textAlign = TEXT_ALIGN_EDEFAULT;
		textAlignESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_TEXT_STYLE_TEXT_MODEL__TEXT_ALIGN, oldTextAlign, TEXT_ALIGN_EDEFAULT, oldTextAlignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTextAlign() {
		return textAlignESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextDecoration() {
		return textDecoration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextDecoration(String newTextDecoration) {
		String oldTextDecoration = textDecoration;
		textDecoration = newTextDecoration;
		boolean oldTextDecorationESet = textDecorationESet;
		textDecorationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TEXT_STYLE_TEXT_MODEL__TEXT_DECORATION, oldTextDecoration, textDecoration, !oldTextDecorationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTextDecoration() {
		String oldTextDecoration = textDecoration;
		boolean oldTextDecorationESet = textDecorationESet;
		textDecoration = TEXT_DECORATION_EDEFAULT;
		textDecorationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_TEXT_STYLE_TEXT_MODEL__TEXT_DECORATION, oldTextDecoration, TEXT_DECORATION_EDEFAULT, oldTextDecorationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTextDecoration() {
		return textDecorationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSizeSelect getLetterSpacing() {
		if (letterSpacing != null && letterSpacing.eIsProxy()) {
			InternalEObject oldLetterSpacing = (InternalEObject)letterSpacing;
			letterSpacing = (IfcSizeSelect)eResolveProxy(oldLetterSpacing);
			if (letterSpacing != oldLetterSpacing) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_TEXT_STYLE_TEXT_MODEL__LETTER_SPACING, oldLetterSpacing, letterSpacing));
			}
		}
		return letterSpacing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSizeSelect basicGetLetterSpacing() {
		return letterSpacing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLetterSpacing(IfcSizeSelect newLetterSpacing) {
		IfcSizeSelect oldLetterSpacing = letterSpacing;
		letterSpacing = newLetterSpacing;
		boolean oldLetterSpacingESet = letterSpacingESet;
		letterSpacingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TEXT_STYLE_TEXT_MODEL__LETTER_SPACING, oldLetterSpacing, letterSpacing, !oldLetterSpacingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLetterSpacing() {
		IfcSizeSelect oldLetterSpacing = letterSpacing;
		boolean oldLetterSpacingESet = letterSpacingESet;
		letterSpacing = null;
		letterSpacingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_TEXT_STYLE_TEXT_MODEL__LETTER_SPACING, oldLetterSpacing, null, oldLetterSpacingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLetterSpacing() {
		return letterSpacingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSizeSelect getWordSpacing() {
		if (wordSpacing != null && wordSpacing.eIsProxy()) {
			InternalEObject oldWordSpacing = (InternalEObject)wordSpacing;
			wordSpacing = (IfcSizeSelect)eResolveProxy(oldWordSpacing);
			if (wordSpacing != oldWordSpacing) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_TEXT_STYLE_TEXT_MODEL__WORD_SPACING, oldWordSpacing, wordSpacing));
			}
		}
		return wordSpacing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSizeSelect basicGetWordSpacing() {
		return wordSpacing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWordSpacing(IfcSizeSelect newWordSpacing) {
		IfcSizeSelect oldWordSpacing = wordSpacing;
		wordSpacing = newWordSpacing;
		boolean oldWordSpacingESet = wordSpacingESet;
		wordSpacingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TEXT_STYLE_TEXT_MODEL__WORD_SPACING, oldWordSpacing, wordSpacing, !oldWordSpacingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWordSpacing() {
		IfcSizeSelect oldWordSpacing = wordSpacing;
		boolean oldWordSpacingESet = wordSpacingESet;
		wordSpacing = null;
		wordSpacingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_TEXT_STYLE_TEXT_MODEL__WORD_SPACING, oldWordSpacing, null, oldWordSpacingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWordSpacing() {
		return wordSpacingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextTransform() {
		return textTransform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextTransform(String newTextTransform) {
		String oldTextTransform = textTransform;
		textTransform = newTextTransform;
		boolean oldTextTransformESet = textTransformESet;
		textTransformESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TEXT_STYLE_TEXT_MODEL__TEXT_TRANSFORM, oldTextTransform, textTransform, !oldTextTransformESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTextTransform() {
		String oldTextTransform = textTransform;
		boolean oldTextTransformESet = textTransformESet;
		textTransform = TEXT_TRANSFORM_EDEFAULT;
		textTransformESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_TEXT_STYLE_TEXT_MODEL__TEXT_TRANSFORM, oldTextTransform, TEXT_TRANSFORM_EDEFAULT, oldTextTransformESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTextTransform() {
		return textTransformESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSizeSelect getLineHeight() {
		if (lineHeight != null && lineHeight.eIsProxy()) {
			InternalEObject oldLineHeight = (InternalEObject)lineHeight;
			lineHeight = (IfcSizeSelect)eResolveProxy(oldLineHeight);
			if (lineHeight != oldLineHeight) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_TEXT_STYLE_TEXT_MODEL__LINE_HEIGHT, oldLineHeight, lineHeight));
			}
		}
		return lineHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSizeSelect basicGetLineHeight() {
		return lineHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineHeight(IfcSizeSelect newLineHeight) {
		IfcSizeSelect oldLineHeight = lineHeight;
		lineHeight = newLineHeight;
		boolean oldLineHeightESet = lineHeightESet;
		lineHeightESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TEXT_STYLE_TEXT_MODEL__LINE_HEIGHT, oldLineHeight, lineHeight, !oldLineHeightESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLineHeight() {
		IfcSizeSelect oldLineHeight = lineHeight;
		boolean oldLineHeightESet = lineHeightESet;
		lineHeight = null;
		lineHeightESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_TEXT_STYLE_TEXT_MODEL__LINE_HEIGHT, oldLineHeight, null, oldLineHeightESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLineHeight() {
		return lineHeightESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_TEXT_MODEL__TEXT_INDENT:
				if (resolve) return getTextIndent();
				return basicGetTextIndent();
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_TEXT_MODEL__TEXT_ALIGN:
				return getTextAlign();
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_TEXT_MODEL__TEXT_DECORATION:
				return getTextDecoration();
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_TEXT_MODEL__LETTER_SPACING:
				if (resolve) return getLetterSpacing();
				return basicGetLetterSpacing();
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_TEXT_MODEL__WORD_SPACING:
				if (resolve) return getWordSpacing();
				return basicGetWordSpacing();
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_TEXT_MODEL__TEXT_TRANSFORM:
				return getTextTransform();
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_TEXT_MODEL__LINE_HEIGHT:
				if (resolve) return getLineHeight();
				return basicGetLineHeight();
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
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_TEXT_MODEL__TEXT_INDENT:
				setTextIndent((IfcSizeSelect)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_TEXT_MODEL__TEXT_ALIGN:
				setTextAlign((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_TEXT_MODEL__TEXT_DECORATION:
				setTextDecoration((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_TEXT_MODEL__LETTER_SPACING:
				setLetterSpacing((IfcSizeSelect)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_TEXT_MODEL__WORD_SPACING:
				setWordSpacing((IfcSizeSelect)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_TEXT_MODEL__TEXT_TRANSFORM:
				setTextTransform((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_TEXT_MODEL__LINE_HEIGHT:
				setLineHeight((IfcSizeSelect)newValue);
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
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_TEXT_MODEL__TEXT_INDENT:
				unsetTextIndent();
				return;
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_TEXT_MODEL__TEXT_ALIGN:
				unsetTextAlign();
				return;
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_TEXT_MODEL__TEXT_DECORATION:
				unsetTextDecoration();
				return;
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_TEXT_MODEL__LETTER_SPACING:
				unsetLetterSpacing();
				return;
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_TEXT_MODEL__WORD_SPACING:
				unsetWordSpacing();
				return;
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_TEXT_MODEL__TEXT_TRANSFORM:
				unsetTextTransform();
				return;
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_TEXT_MODEL__LINE_HEIGHT:
				unsetLineHeight();
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
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_TEXT_MODEL__TEXT_INDENT:
				return isSetTextIndent();
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_TEXT_MODEL__TEXT_ALIGN:
				return isSetTextAlign();
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_TEXT_MODEL__TEXT_DECORATION:
				return isSetTextDecoration();
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_TEXT_MODEL__LETTER_SPACING:
				return isSetLetterSpacing();
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_TEXT_MODEL__WORD_SPACING:
				return isSetWordSpacing();
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_TEXT_MODEL__TEXT_TRANSFORM:
				return isSetTextTransform();
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_TEXT_MODEL__LINE_HEIGHT:
				return isSetLineHeight();
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
		result.append(" (TextAlign: ");
		if (textAlignESet) result.append(textAlign); else result.append("<unset>");
		result.append(", TextDecoration: ");
		if (textDecorationESet) result.append(textDecoration); else result.append("<unset>");
		result.append(", TextTransform: ");
		if (textTransformESet) result.append(textTransform); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcTextStyleTextModelImpl
