/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FontFamilyType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FontSizeType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextStyleFontModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Text Style Font Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTextStyleFontModelImpl#getFontFamily <em>Font Family</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTextStyleFontModelImpl#getFontStyle <em>Font Style</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTextStyleFontModelImpl#getFontVariant <em>Font Variant</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTextStyleFontModelImpl#getFontWeight <em>Font Weight</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTextStyleFontModelImpl#getFontSize <em>Font Size</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcTextStyleFontModelImpl extends IfcPreDefinedTextFontImpl implements IfcTextStyleFontModel {
	/**
	 * The cached value of the '{@link #getFontFamily() <em>Font Family</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontFamily()
	 * @generated
	 * @ordered
	 */
	protected FontFamilyType fontFamily;

	/**
	 * The default value of the '{@link #getFontStyle() <em>Font Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontStyle()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_STYLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFontStyle() <em>Font Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontStyle()
	 * @generated
	 * @ordered
	 */
	protected String fontStyle = FONT_STYLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFontVariant() <em>Font Variant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontVariant()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_VARIANT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFontVariant() <em>Font Variant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontVariant()
	 * @generated
	 * @ordered
	 */
	protected String fontVariant = FONT_VARIANT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFontWeight() <em>Font Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontWeight()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_WEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFontWeight() <em>Font Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontWeight()
	 * @generated
	 * @ordered
	 */
	protected String fontWeight = FONT_WEIGHT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFontSize() <em>Font Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontSize()
	 * @generated
	 * @ordered
	 */
	protected FontSizeType fontSize;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcTextStyleFontModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcTextStyleFontModel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontFamilyType getFontFamily() {
		return fontFamily;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFontFamily(FontFamilyType newFontFamily, NotificationChain msgs) {
		FontFamilyType oldFontFamily = fontFamily;
		fontFamily = newFontFamily;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TEXT_STYLE_FONT_MODEL__FONT_FAMILY, oldFontFamily, newFontFamily);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontFamily(FontFamilyType newFontFamily) {
		if (newFontFamily != fontFamily) {
			NotificationChain msgs = null;
			if (fontFamily != null)
				msgs = ((InternalEObject)fontFamily).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_TEXT_STYLE_FONT_MODEL__FONT_FAMILY, null, msgs);
			if (newFontFamily != null)
				msgs = ((InternalEObject)newFontFamily).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_TEXT_STYLE_FONT_MODEL__FONT_FAMILY, null, msgs);
			msgs = basicSetFontFamily(newFontFamily, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TEXT_STYLE_FONT_MODEL__FONT_FAMILY, newFontFamily, newFontFamily));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFontStyle() {
		return fontStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontStyle(String newFontStyle) {
		String oldFontStyle = fontStyle;
		fontStyle = newFontStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TEXT_STYLE_FONT_MODEL__FONT_STYLE, oldFontStyle, fontStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFontVariant() {
		return fontVariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontVariant(String newFontVariant) {
		String oldFontVariant = fontVariant;
		fontVariant = newFontVariant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TEXT_STYLE_FONT_MODEL__FONT_VARIANT, oldFontVariant, fontVariant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFontWeight() {
		return fontWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontWeight(String newFontWeight) {
		String oldFontWeight = fontWeight;
		fontWeight = newFontWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TEXT_STYLE_FONT_MODEL__FONT_WEIGHT, oldFontWeight, fontWeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontSizeType getFontSize() {
		return fontSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFontSize(FontSizeType newFontSize, NotificationChain msgs) {
		FontSizeType oldFontSize = fontSize;
		fontSize = newFontSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TEXT_STYLE_FONT_MODEL__FONT_SIZE, oldFontSize, newFontSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontSize(FontSizeType newFontSize) {
		if (newFontSize != fontSize) {
			NotificationChain msgs = null;
			if (fontSize != null)
				msgs = ((InternalEObject)fontSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_TEXT_STYLE_FONT_MODEL__FONT_SIZE, null, msgs);
			if (newFontSize != null)
				msgs = ((InternalEObject)newFontSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_TEXT_STYLE_FONT_MODEL__FONT_SIZE, null, msgs);
			msgs = basicSetFontSize(newFontSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TEXT_STYLE_FONT_MODEL__FONT_SIZE, newFontSize, newFontSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_TEXT_STYLE_FONT_MODEL__FONT_FAMILY:
				return basicSetFontFamily(null, msgs);
			case FinalPackage.IFC_TEXT_STYLE_FONT_MODEL__FONT_SIZE:
				return basicSetFontSize(null, msgs);
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
			case FinalPackage.IFC_TEXT_STYLE_FONT_MODEL__FONT_FAMILY:
				return getFontFamily();
			case FinalPackage.IFC_TEXT_STYLE_FONT_MODEL__FONT_STYLE:
				return getFontStyle();
			case FinalPackage.IFC_TEXT_STYLE_FONT_MODEL__FONT_VARIANT:
				return getFontVariant();
			case FinalPackage.IFC_TEXT_STYLE_FONT_MODEL__FONT_WEIGHT:
				return getFontWeight();
			case FinalPackage.IFC_TEXT_STYLE_FONT_MODEL__FONT_SIZE:
				return getFontSize();
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
			case FinalPackage.IFC_TEXT_STYLE_FONT_MODEL__FONT_FAMILY:
				setFontFamily((FontFamilyType)newValue);
				return;
			case FinalPackage.IFC_TEXT_STYLE_FONT_MODEL__FONT_STYLE:
				setFontStyle((String)newValue);
				return;
			case FinalPackage.IFC_TEXT_STYLE_FONT_MODEL__FONT_VARIANT:
				setFontVariant((String)newValue);
				return;
			case FinalPackage.IFC_TEXT_STYLE_FONT_MODEL__FONT_WEIGHT:
				setFontWeight((String)newValue);
				return;
			case FinalPackage.IFC_TEXT_STYLE_FONT_MODEL__FONT_SIZE:
				setFontSize((FontSizeType)newValue);
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
			case FinalPackage.IFC_TEXT_STYLE_FONT_MODEL__FONT_FAMILY:
				setFontFamily((FontFamilyType)null);
				return;
			case FinalPackage.IFC_TEXT_STYLE_FONT_MODEL__FONT_STYLE:
				setFontStyle(FONT_STYLE_EDEFAULT);
				return;
			case FinalPackage.IFC_TEXT_STYLE_FONT_MODEL__FONT_VARIANT:
				setFontVariant(FONT_VARIANT_EDEFAULT);
				return;
			case FinalPackage.IFC_TEXT_STYLE_FONT_MODEL__FONT_WEIGHT:
				setFontWeight(FONT_WEIGHT_EDEFAULT);
				return;
			case FinalPackage.IFC_TEXT_STYLE_FONT_MODEL__FONT_SIZE:
				setFontSize((FontSizeType)null);
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
			case FinalPackage.IFC_TEXT_STYLE_FONT_MODEL__FONT_FAMILY:
				return fontFamily != null;
			case FinalPackage.IFC_TEXT_STYLE_FONT_MODEL__FONT_STYLE:
				return FONT_STYLE_EDEFAULT == null ? fontStyle != null : !FONT_STYLE_EDEFAULT.equals(fontStyle);
			case FinalPackage.IFC_TEXT_STYLE_FONT_MODEL__FONT_VARIANT:
				return FONT_VARIANT_EDEFAULT == null ? fontVariant != null : !FONT_VARIANT_EDEFAULT.equals(fontVariant);
			case FinalPackage.IFC_TEXT_STYLE_FONT_MODEL__FONT_WEIGHT:
				return FONT_WEIGHT_EDEFAULT == null ? fontWeight != null : !FONT_WEIGHT_EDEFAULT.equals(fontWeight);
			case FinalPackage.IFC_TEXT_STYLE_FONT_MODEL__FONT_SIZE:
				return fontSize != null;
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
		result.append(" (fontStyle: ");
		result.append(fontStyle);
		result.append(", fontVariant: ");
		result.append(fontVariant);
		result.append(", fontWeight: ");
		result.append(fontWeight);
		result.append(')');
		return result.toString();
	}

} //IfcTextStyleFontModelImpl
