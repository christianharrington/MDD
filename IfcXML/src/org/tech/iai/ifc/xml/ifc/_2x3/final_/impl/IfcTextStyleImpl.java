/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextStyle;
import org.tech.iai.ifc.xml.ifc._2x3.final_.TextCharacterAppearanceType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.TextFontStyleType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.TextStyleType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Text Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTextStyleImpl#getTextCharacterAppearance <em>Text Character Appearance</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTextStyleImpl#getTextStyle <em>Text Style</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTextStyleImpl#getTextFontStyle <em>Text Font Style</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcTextStyleImpl extends IfcPresentationStyleImpl implements IfcTextStyle {
	/**
	 * The cached value of the '{@link #getTextCharacterAppearance() <em>Text Character Appearance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextCharacterAppearance()
	 * @generated
	 * @ordered
	 */
	protected TextCharacterAppearanceType textCharacterAppearance;

	/**
	 * The cached value of the '{@link #getTextStyle() <em>Text Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextStyle()
	 * @generated
	 * @ordered
	 */
	protected TextStyleType textStyle;

	/**
	 * The cached value of the '{@link #getTextFontStyle() <em>Text Font Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextFontStyle()
	 * @generated
	 * @ordered
	 */
	protected TextFontStyleType textFontStyle;

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
		return FinalPackage.eINSTANCE.getIfcTextStyle();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextCharacterAppearanceType getTextCharacterAppearance() {
		return textCharacterAppearance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextCharacterAppearance(TextCharacterAppearanceType newTextCharacterAppearance, NotificationChain msgs) {
		TextCharacterAppearanceType oldTextCharacterAppearance = textCharacterAppearance;
		textCharacterAppearance = newTextCharacterAppearance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TEXT_STYLE__TEXT_CHARACTER_APPEARANCE, oldTextCharacterAppearance, newTextCharacterAppearance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextCharacterAppearance(TextCharacterAppearanceType newTextCharacterAppearance) {
		if (newTextCharacterAppearance != textCharacterAppearance) {
			NotificationChain msgs = null;
			if (textCharacterAppearance != null)
				msgs = ((InternalEObject)textCharacterAppearance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_TEXT_STYLE__TEXT_CHARACTER_APPEARANCE, null, msgs);
			if (newTextCharacterAppearance != null)
				msgs = ((InternalEObject)newTextCharacterAppearance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_TEXT_STYLE__TEXT_CHARACTER_APPEARANCE, null, msgs);
			msgs = basicSetTextCharacterAppearance(newTextCharacterAppearance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TEXT_STYLE__TEXT_CHARACTER_APPEARANCE, newTextCharacterAppearance, newTextCharacterAppearance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextStyleType getTextStyle() {
		return textStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextStyle(TextStyleType newTextStyle, NotificationChain msgs) {
		TextStyleType oldTextStyle = textStyle;
		textStyle = newTextStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TEXT_STYLE__TEXT_STYLE, oldTextStyle, newTextStyle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextStyle(TextStyleType newTextStyle) {
		if (newTextStyle != textStyle) {
			NotificationChain msgs = null;
			if (textStyle != null)
				msgs = ((InternalEObject)textStyle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_TEXT_STYLE__TEXT_STYLE, null, msgs);
			if (newTextStyle != null)
				msgs = ((InternalEObject)newTextStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_TEXT_STYLE__TEXT_STYLE, null, msgs);
			msgs = basicSetTextStyle(newTextStyle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TEXT_STYLE__TEXT_STYLE, newTextStyle, newTextStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextFontStyleType getTextFontStyle() {
		return textFontStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextFontStyle(TextFontStyleType newTextFontStyle, NotificationChain msgs) {
		TextFontStyleType oldTextFontStyle = textFontStyle;
		textFontStyle = newTextFontStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TEXT_STYLE__TEXT_FONT_STYLE, oldTextFontStyle, newTextFontStyle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextFontStyle(TextFontStyleType newTextFontStyle) {
		if (newTextFontStyle != textFontStyle) {
			NotificationChain msgs = null;
			if (textFontStyle != null)
				msgs = ((InternalEObject)textFontStyle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_TEXT_STYLE__TEXT_FONT_STYLE, null, msgs);
			if (newTextFontStyle != null)
				msgs = ((InternalEObject)newTextFontStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_TEXT_STYLE__TEXT_FONT_STYLE, null, msgs);
			msgs = basicSetTextFontStyle(newTextFontStyle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TEXT_STYLE__TEXT_FONT_STYLE, newTextFontStyle, newTextFontStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_TEXT_STYLE__TEXT_CHARACTER_APPEARANCE:
				return basicSetTextCharacterAppearance(null, msgs);
			case FinalPackage.IFC_TEXT_STYLE__TEXT_STYLE:
				return basicSetTextStyle(null, msgs);
			case FinalPackage.IFC_TEXT_STYLE__TEXT_FONT_STYLE:
				return basicSetTextFontStyle(null, msgs);
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
			case FinalPackage.IFC_TEXT_STYLE__TEXT_CHARACTER_APPEARANCE:
				return getTextCharacterAppearance();
			case FinalPackage.IFC_TEXT_STYLE__TEXT_STYLE:
				return getTextStyle();
			case FinalPackage.IFC_TEXT_STYLE__TEXT_FONT_STYLE:
				return getTextFontStyle();
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
			case FinalPackage.IFC_TEXT_STYLE__TEXT_CHARACTER_APPEARANCE:
				setTextCharacterAppearance((TextCharacterAppearanceType)newValue);
				return;
			case FinalPackage.IFC_TEXT_STYLE__TEXT_STYLE:
				setTextStyle((TextStyleType)newValue);
				return;
			case FinalPackage.IFC_TEXT_STYLE__TEXT_FONT_STYLE:
				setTextFontStyle((TextFontStyleType)newValue);
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
			case FinalPackage.IFC_TEXT_STYLE__TEXT_CHARACTER_APPEARANCE:
				setTextCharacterAppearance((TextCharacterAppearanceType)null);
				return;
			case FinalPackage.IFC_TEXT_STYLE__TEXT_STYLE:
				setTextStyle((TextStyleType)null);
				return;
			case FinalPackage.IFC_TEXT_STYLE__TEXT_FONT_STYLE:
				setTextFontStyle((TextFontStyleType)null);
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
			case FinalPackage.IFC_TEXT_STYLE__TEXT_CHARACTER_APPEARANCE:
				return textCharacterAppearance != null;
			case FinalPackage.IFC_TEXT_STYLE__TEXT_STYLE:
				return textStyle != null;
			case FinalPackage.IFC_TEXT_STYLE__TEXT_FONT_STYLE:
				return textFontStyle != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcTextStyleImpl
