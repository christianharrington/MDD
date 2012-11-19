/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.EntityImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextStyleTextModel;
import org.tech.iai.ifc.xml.ifc._2x3.final_.LetterSpacingType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.LineHeightType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.TextIndentType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.WordSpacingType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Text Style Text Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTextStyleTextModelImpl#getTextIndent <em>Text Indent</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTextStyleTextModelImpl#getTextAlign <em>Text Align</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTextStyleTextModelImpl#getTextDecoration <em>Text Decoration</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTextStyleTextModelImpl#getLetterSpacing <em>Letter Spacing</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTextStyleTextModelImpl#getWordSpacing <em>Word Spacing</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTextStyleTextModelImpl#getTextTransform <em>Text Transform</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTextStyleTextModelImpl#getLineHeight <em>Line Height</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcTextStyleTextModelImpl extends EntityImpl implements IfcTextStyleTextModel {
	/**
	 * The cached value of the '{@link #getTextIndent() <em>Text Indent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextIndent()
	 * @generated
	 * @ordered
	 */
	protected TextIndentType textIndent;

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
	 * The cached value of the '{@link #getLetterSpacing() <em>Letter Spacing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLetterSpacing()
	 * @generated
	 * @ordered
	 */
	protected LetterSpacingType letterSpacing;

	/**
	 * The cached value of the '{@link #getWordSpacing() <em>Word Spacing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWordSpacing()
	 * @generated
	 * @ordered
	 */
	protected WordSpacingType wordSpacing;

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
	 * The cached value of the '{@link #getLineHeight() <em>Line Height</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineHeight()
	 * @generated
	 * @ordered
	 */
	protected LineHeightType lineHeight;

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
		return FinalPackage.eINSTANCE.getIfcTextStyleTextModel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextIndentType getTextIndent() {
		return textIndent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextIndent(TextIndentType newTextIndent, NotificationChain msgs) {
		TextIndentType oldTextIndent = textIndent;
		textIndent = newTextIndent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TEXT_STYLE_TEXT_MODEL__TEXT_INDENT, oldTextIndent, newTextIndent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextIndent(TextIndentType newTextIndent) {
		if (newTextIndent != textIndent) {
			NotificationChain msgs = null;
			if (textIndent != null)
				msgs = ((InternalEObject)textIndent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_TEXT_STYLE_TEXT_MODEL__TEXT_INDENT, null, msgs);
			if (newTextIndent != null)
				msgs = ((InternalEObject)newTextIndent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_TEXT_STYLE_TEXT_MODEL__TEXT_INDENT, null, msgs);
			msgs = basicSetTextIndent(newTextIndent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TEXT_STYLE_TEXT_MODEL__TEXT_INDENT, newTextIndent, newTextIndent));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TEXT_STYLE_TEXT_MODEL__TEXT_ALIGN, oldTextAlign, textAlign));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TEXT_STYLE_TEXT_MODEL__TEXT_DECORATION, oldTextDecoration, textDecoration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LetterSpacingType getLetterSpacing() {
		return letterSpacing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLetterSpacing(LetterSpacingType newLetterSpacing, NotificationChain msgs) {
		LetterSpacingType oldLetterSpacing = letterSpacing;
		letterSpacing = newLetterSpacing;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TEXT_STYLE_TEXT_MODEL__LETTER_SPACING, oldLetterSpacing, newLetterSpacing);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLetterSpacing(LetterSpacingType newLetterSpacing) {
		if (newLetterSpacing != letterSpacing) {
			NotificationChain msgs = null;
			if (letterSpacing != null)
				msgs = ((InternalEObject)letterSpacing).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_TEXT_STYLE_TEXT_MODEL__LETTER_SPACING, null, msgs);
			if (newLetterSpacing != null)
				msgs = ((InternalEObject)newLetterSpacing).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_TEXT_STYLE_TEXT_MODEL__LETTER_SPACING, null, msgs);
			msgs = basicSetLetterSpacing(newLetterSpacing, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TEXT_STYLE_TEXT_MODEL__LETTER_SPACING, newLetterSpacing, newLetterSpacing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WordSpacingType getWordSpacing() {
		return wordSpacing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWordSpacing(WordSpacingType newWordSpacing, NotificationChain msgs) {
		WordSpacingType oldWordSpacing = wordSpacing;
		wordSpacing = newWordSpacing;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TEXT_STYLE_TEXT_MODEL__WORD_SPACING, oldWordSpacing, newWordSpacing);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWordSpacing(WordSpacingType newWordSpacing) {
		if (newWordSpacing != wordSpacing) {
			NotificationChain msgs = null;
			if (wordSpacing != null)
				msgs = ((InternalEObject)wordSpacing).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_TEXT_STYLE_TEXT_MODEL__WORD_SPACING, null, msgs);
			if (newWordSpacing != null)
				msgs = ((InternalEObject)newWordSpacing).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_TEXT_STYLE_TEXT_MODEL__WORD_SPACING, null, msgs);
			msgs = basicSetWordSpacing(newWordSpacing, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TEXT_STYLE_TEXT_MODEL__WORD_SPACING, newWordSpacing, newWordSpacing));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TEXT_STYLE_TEXT_MODEL__TEXT_TRANSFORM, oldTextTransform, textTransform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineHeightType getLineHeight() {
		return lineHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLineHeight(LineHeightType newLineHeight, NotificationChain msgs) {
		LineHeightType oldLineHeight = lineHeight;
		lineHeight = newLineHeight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TEXT_STYLE_TEXT_MODEL__LINE_HEIGHT, oldLineHeight, newLineHeight);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineHeight(LineHeightType newLineHeight) {
		if (newLineHeight != lineHeight) {
			NotificationChain msgs = null;
			if (lineHeight != null)
				msgs = ((InternalEObject)lineHeight).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_TEXT_STYLE_TEXT_MODEL__LINE_HEIGHT, null, msgs);
			if (newLineHeight != null)
				msgs = ((InternalEObject)newLineHeight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_TEXT_STYLE_TEXT_MODEL__LINE_HEIGHT, null, msgs);
			msgs = basicSetLineHeight(newLineHeight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TEXT_STYLE_TEXT_MODEL__LINE_HEIGHT, newLineHeight, newLineHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_TEXT_STYLE_TEXT_MODEL__TEXT_INDENT:
				return basicSetTextIndent(null, msgs);
			case FinalPackage.IFC_TEXT_STYLE_TEXT_MODEL__LETTER_SPACING:
				return basicSetLetterSpacing(null, msgs);
			case FinalPackage.IFC_TEXT_STYLE_TEXT_MODEL__WORD_SPACING:
				return basicSetWordSpacing(null, msgs);
			case FinalPackage.IFC_TEXT_STYLE_TEXT_MODEL__LINE_HEIGHT:
				return basicSetLineHeight(null, msgs);
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
			case FinalPackage.IFC_TEXT_STYLE_TEXT_MODEL__TEXT_INDENT:
				return getTextIndent();
			case FinalPackage.IFC_TEXT_STYLE_TEXT_MODEL__TEXT_ALIGN:
				return getTextAlign();
			case FinalPackage.IFC_TEXT_STYLE_TEXT_MODEL__TEXT_DECORATION:
				return getTextDecoration();
			case FinalPackage.IFC_TEXT_STYLE_TEXT_MODEL__LETTER_SPACING:
				return getLetterSpacing();
			case FinalPackage.IFC_TEXT_STYLE_TEXT_MODEL__WORD_SPACING:
				return getWordSpacing();
			case FinalPackage.IFC_TEXT_STYLE_TEXT_MODEL__TEXT_TRANSFORM:
				return getTextTransform();
			case FinalPackage.IFC_TEXT_STYLE_TEXT_MODEL__LINE_HEIGHT:
				return getLineHeight();
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
			case FinalPackage.IFC_TEXT_STYLE_TEXT_MODEL__TEXT_INDENT:
				setTextIndent((TextIndentType)newValue);
				return;
			case FinalPackage.IFC_TEXT_STYLE_TEXT_MODEL__TEXT_ALIGN:
				setTextAlign((String)newValue);
				return;
			case FinalPackage.IFC_TEXT_STYLE_TEXT_MODEL__TEXT_DECORATION:
				setTextDecoration((String)newValue);
				return;
			case FinalPackage.IFC_TEXT_STYLE_TEXT_MODEL__LETTER_SPACING:
				setLetterSpacing((LetterSpacingType)newValue);
				return;
			case FinalPackage.IFC_TEXT_STYLE_TEXT_MODEL__WORD_SPACING:
				setWordSpacing((WordSpacingType)newValue);
				return;
			case FinalPackage.IFC_TEXT_STYLE_TEXT_MODEL__TEXT_TRANSFORM:
				setTextTransform((String)newValue);
				return;
			case FinalPackage.IFC_TEXT_STYLE_TEXT_MODEL__LINE_HEIGHT:
				setLineHeight((LineHeightType)newValue);
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
			case FinalPackage.IFC_TEXT_STYLE_TEXT_MODEL__TEXT_INDENT:
				setTextIndent((TextIndentType)null);
				return;
			case FinalPackage.IFC_TEXT_STYLE_TEXT_MODEL__TEXT_ALIGN:
				setTextAlign(TEXT_ALIGN_EDEFAULT);
				return;
			case FinalPackage.IFC_TEXT_STYLE_TEXT_MODEL__TEXT_DECORATION:
				setTextDecoration(TEXT_DECORATION_EDEFAULT);
				return;
			case FinalPackage.IFC_TEXT_STYLE_TEXT_MODEL__LETTER_SPACING:
				setLetterSpacing((LetterSpacingType)null);
				return;
			case FinalPackage.IFC_TEXT_STYLE_TEXT_MODEL__WORD_SPACING:
				setWordSpacing((WordSpacingType)null);
				return;
			case FinalPackage.IFC_TEXT_STYLE_TEXT_MODEL__TEXT_TRANSFORM:
				setTextTransform(TEXT_TRANSFORM_EDEFAULT);
				return;
			case FinalPackage.IFC_TEXT_STYLE_TEXT_MODEL__LINE_HEIGHT:
				setLineHeight((LineHeightType)null);
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
			case FinalPackage.IFC_TEXT_STYLE_TEXT_MODEL__TEXT_INDENT:
				return textIndent != null;
			case FinalPackage.IFC_TEXT_STYLE_TEXT_MODEL__TEXT_ALIGN:
				return TEXT_ALIGN_EDEFAULT == null ? textAlign != null : !TEXT_ALIGN_EDEFAULT.equals(textAlign);
			case FinalPackage.IFC_TEXT_STYLE_TEXT_MODEL__TEXT_DECORATION:
				return TEXT_DECORATION_EDEFAULT == null ? textDecoration != null : !TEXT_DECORATION_EDEFAULT.equals(textDecoration);
			case FinalPackage.IFC_TEXT_STYLE_TEXT_MODEL__LETTER_SPACING:
				return letterSpacing != null;
			case FinalPackage.IFC_TEXT_STYLE_TEXT_MODEL__WORD_SPACING:
				return wordSpacing != null;
			case FinalPackage.IFC_TEXT_STYLE_TEXT_MODEL__TEXT_TRANSFORM:
				return TEXT_TRANSFORM_EDEFAULT == null ? textTransform != null : !TEXT_TRANSFORM_EDEFAULT.equals(textTransform);
			case FinalPackage.IFC_TEXT_STYLE_TEXT_MODEL__LINE_HEIGHT:
				return lineHeight != null;
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
		result.append(" (textAlign: ");
		result.append(textAlign);
		result.append(", textDecoration: ");
		result.append(textDecoration);
		result.append(", textTransform: ");
		result.append(textTransform);
		result.append(')');
		return result.toString();
	}

} //IfcTextStyleTextModelImpl
