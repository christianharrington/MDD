/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcCharacterStyleSelect;
import ifc2x3tc1.IfcTextFontSelect;
import ifc2x3tc1.IfcTextStyle;
import ifc2x3tc1.IfcTextStyleSelect;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Text Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcTextStyleImpl#getTextCharacterAppearance <em>Text Character Appearance</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTextStyleImpl#getTextStyle <em>Text Style</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTextStyleImpl#getTextFontStyle <em>Text Font Style</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcTextStyleImpl extends IfcPresentationStyleImpl implements IfcTextStyle {
	/**
	 * The cached value of the '{@link #getTextCharacterAppearance() <em>Text Character Appearance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextCharacterAppearance()
	 * @generated
	 * @ordered
	 */
	protected IfcCharacterStyleSelect textCharacterAppearance;

	/**
	 * This is true if the Text Character Appearance reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean textCharacterAppearanceESet;

	/**
	 * The cached value of the '{@link #getTextStyle() <em>Text Style</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextStyle()
	 * @generated
	 * @ordered
	 */
	protected IfcTextStyleSelect textStyle;

	/**
	 * This is true if the Text Style reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean textStyleESet;

	/**
	 * The cached value of the '{@link #getTextFontStyle() <em>Text Font Style</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextFontStyle()
	 * @generated
	 * @ordered
	 */
	protected IfcTextFontSelect textFontStyle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcTextStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcTextStyle();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCharacterStyleSelect getTextCharacterAppearance() {
		if (textCharacterAppearance != null && textCharacterAppearance.eIsProxy()) {
			InternalEObject oldTextCharacterAppearance = (InternalEObject)textCharacterAppearance;
			textCharacterAppearance = (IfcCharacterStyleSelect)eResolveProxy(oldTextCharacterAppearance);
			if (textCharacterAppearance != oldTextCharacterAppearance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_TEXT_STYLE__TEXT_CHARACTER_APPEARANCE, oldTextCharacterAppearance, textCharacterAppearance));
			}
		}
		return textCharacterAppearance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCharacterStyleSelect basicGetTextCharacterAppearance() {
		return textCharacterAppearance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextCharacterAppearance(IfcCharacterStyleSelect newTextCharacterAppearance) {
		IfcCharacterStyleSelect oldTextCharacterAppearance = textCharacterAppearance;
		textCharacterAppearance = newTextCharacterAppearance;
		boolean oldTextCharacterAppearanceESet = textCharacterAppearanceESet;
		textCharacterAppearanceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TEXT_STYLE__TEXT_CHARACTER_APPEARANCE, oldTextCharacterAppearance, textCharacterAppearance, !oldTextCharacterAppearanceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTextCharacterAppearance() {
		IfcCharacterStyleSelect oldTextCharacterAppearance = textCharacterAppearance;
		boolean oldTextCharacterAppearanceESet = textCharacterAppearanceESet;
		textCharacterAppearance = null;
		textCharacterAppearanceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_TEXT_STYLE__TEXT_CHARACTER_APPEARANCE, oldTextCharacterAppearance, null, oldTextCharacterAppearanceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTextCharacterAppearance() {
		return textCharacterAppearanceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTextStyleSelect getTextStyle() {
		if (textStyle != null && textStyle.eIsProxy()) {
			InternalEObject oldTextStyle = (InternalEObject)textStyle;
			textStyle = (IfcTextStyleSelect)eResolveProxy(oldTextStyle);
			if (textStyle != oldTextStyle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_TEXT_STYLE__TEXT_STYLE, oldTextStyle, textStyle));
			}
		}
		return textStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTextStyleSelect basicGetTextStyle() {
		return textStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextStyle(IfcTextStyleSelect newTextStyle) {
		IfcTextStyleSelect oldTextStyle = textStyle;
		textStyle = newTextStyle;
		boolean oldTextStyleESet = textStyleESet;
		textStyleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TEXT_STYLE__TEXT_STYLE, oldTextStyle, textStyle, !oldTextStyleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTextStyle() {
		IfcTextStyleSelect oldTextStyle = textStyle;
		boolean oldTextStyleESet = textStyleESet;
		textStyle = null;
		textStyleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_TEXT_STYLE__TEXT_STYLE, oldTextStyle, null, oldTextStyleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTextStyle() {
		return textStyleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTextFontSelect getTextFontStyle() {
		if (textFontStyle != null && textFontStyle.eIsProxy()) {
			InternalEObject oldTextFontStyle = (InternalEObject)textFontStyle;
			textFontStyle = (IfcTextFontSelect)eResolveProxy(oldTextFontStyle);
			if (textFontStyle != oldTextFontStyle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_TEXT_STYLE__TEXT_FONT_STYLE, oldTextFontStyle, textFontStyle));
			}
		}
		return textFontStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTextFontSelect basicGetTextFontStyle() {
		return textFontStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextFontStyle(IfcTextFontSelect newTextFontStyle) {
		IfcTextFontSelect oldTextFontStyle = textFontStyle;
		textFontStyle = newTextFontStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TEXT_STYLE__TEXT_FONT_STYLE, oldTextFontStyle, textFontStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_TEXT_STYLE__TEXT_CHARACTER_APPEARANCE:
				if (resolve) return getTextCharacterAppearance();
				return basicGetTextCharacterAppearance();
			case Ifc2x3tc1Package.IFC_TEXT_STYLE__TEXT_STYLE:
				if (resolve) return getTextStyle();
				return basicGetTextStyle();
			case Ifc2x3tc1Package.IFC_TEXT_STYLE__TEXT_FONT_STYLE:
				if (resolve) return getTextFontStyle();
				return basicGetTextFontStyle();
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
			case Ifc2x3tc1Package.IFC_TEXT_STYLE__TEXT_CHARACTER_APPEARANCE:
				setTextCharacterAppearance((IfcCharacterStyleSelect)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TEXT_STYLE__TEXT_STYLE:
				setTextStyle((IfcTextStyleSelect)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TEXT_STYLE__TEXT_FONT_STYLE:
				setTextFontStyle((IfcTextFontSelect)newValue);
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
			case Ifc2x3tc1Package.IFC_TEXT_STYLE__TEXT_CHARACTER_APPEARANCE:
				unsetTextCharacterAppearance();
				return;
			case Ifc2x3tc1Package.IFC_TEXT_STYLE__TEXT_STYLE:
				unsetTextStyle();
				return;
			case Ifc2x3tc1Package.IFC_TEXT_STYLE__TEXT_FONT_STYLE:
				setTextFontStyle((IfcTextFontSelect)null);
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
			case Ifc2x3tc1Package.IFC_TEXT_STYLE__TEXT_CHARACTER_APPEARANCE:
				return isSetTextCharacterAppearance();
			case Ifc2x3tc1Package.IFC_TEXT_STYLE__TEXT_STYLE:
				return isSetTextStyle();
			case Ifc2x3tc1Package.IFC_TEXT_STYLE__TEXT_FONT_STYLE:
				return textFontStyle != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcTextStyleImpl
