/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcSizeSelect;
import ifc2x3tc1.IfcTextStyleFontModel;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Text Style Font Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcTextStyleFontModelImpl#getFontFamily <em>Font Family</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTextStyleFontModelImpl#getFontStyle <em>Font Style</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTextStyleFontModelImpl#getFontVariant <em>Font Variant</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTextStyleFontModelImpl#getFontWeight <em>Font Weight</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTextStyleFontModelImpl#getFontSize <em>Font Size</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcTextStyleFontModelImpl extends IfcPreDefinedTextFontImpl implements IfcTextStyleFontModel {
	/**
	 * The cached value of the '{@link #getFontFamily() <em>Font Family</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontFamily()
	 * @generated
	 * @ordered
	 */
	protected EList<String> fontFamily;

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
	 * This is true if the Font Style attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fontStyleESet;

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
	 * This is true if the Font Variant attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fontVariantESet;

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
	 * This is true if the Font Weight attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fontWeightESet;

	/**
	 * The cached value of the '{@link #getFontSize() <em>Font Size</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontSize()
	 * @generated
	 * @ordered
	 */
	protected IfcSizeSelect fontSize;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcTextStyleFontModel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getFontFamily() {
		if (fontFamily == null) {
			fontFamily = new EDataTypeEList.Unsettable<String>(String.class, this, Ifc2x3tc1Package.IFC_TEXT_STYLE_FONT_MODEL__FONT_FAMILY);
		}
		return fontFamily;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFontFamily() {
		if (fontFamily != null) ((InternalEList.Unsettable<?>)fontFamily).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFontFamily() {
		return fontFamily != null && ((InternalEList.Unsettable<?>)fontFamily).isSet();
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
		boolean oldFontStyleESet = fontStyleESet;
		fontStyleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TEXT_STYLE_FONT_MODEL__FONT_STYLE, oldFontStyle, fontStyle, !oldFontStyleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFontStyle() {
		String oldFontStyle = fontStyle;
		boolean oldFontStyleESet = fontStyleESet;
		fontStyle = FONT_STYLE_EDEFAULT;
		fontStyleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_TEXT_STYLE_FONT_MODEL__FONT_STYLE, oldFontStyle, FONT_STYLE_EDEFAULT, oldFontStyleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFontStyle() {
		return fontStyleESet;
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
		boolean oldFontVariantESet = fontVariantESet;
		fontVariantESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TEXT_STYLE_FONT_MODEL__FONT_VARIANT, oldFontVariant, fontVariant, !oldFontVariantESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFontVariant() {
		String oldFontVariant = fontVariant;
		boolean oldFontVariantESet = fontVariantESet;
		fontVariant = FONT_VARIANT_EDEFAULT;
		fontVariantESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_TEXT_STYLE_FONT_MODEL__FONT_VARIANT, oldFontVariant, FONT_VARIANT_EDEFAULT, oldFontVariantESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFontVariant() {
		return fontVariantESet;
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
		boolean oldFontWeightESet = fontWeightESet;
		fontWeightESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TEXT_STYLE_FONT_MODEL__FONT_WEIGHT, oldFontWeight, fontWeight, !oldFontWeightESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFontWeight() {
		String oldFontWeight = fontWeight;
		boolean oldFontWeightESet = fontWeightESet;
		fontWeight = FONT_WEIGHT_EDEFAULT;
		fontWeightESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_TEXT_STYLE_FONT_MODEL__FONT_WEIGHT, oldFontWeight, FONT_WEIGHT_EDEFAULT, oldFontWeightESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFontWeight() {
		return fontWeightESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSizeSelect getFontSize() {
		if (fontSize != null && fontSize.eIsProxy()) {
			InternalEObject oldFontSize = (InternalEObject)fontSize;
			fontSize = (IfcSizeSelect)eResolveProxy(oldFontSize);
			if (fontSize != oldFontSize) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_TEXT_STYLE_FONT_MODEL__FONT_SIZE, oldFontSize, fontSize));
			}
		}
		return fontSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSizeSelect basicGetFontSize() {
		return fontSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontSize(IfcSizeSelect newFontSize) {
		IfcSizeSelect oldFontSize = fontSize;
		fontSize = newFontSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TEXT_STYLE_FONT_MODEL__FONT_SIZE, oldFontSize, fontSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_FONT_MODEL__FONT_FAMILY:
				return getFontFamily();
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_FONT_MODEL__FONT_STYLE:
				return getFontStyle();
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_FONT_MODEL__FONT_VARIANT:
				return getFontVariant();
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_FONT_MODEL__FONT_WEIGHT:
				return getFontWeight();
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_FONT_MODEL__FONT_SIZE:
				if (resolve) return getFontSize();
				return basicGetFontSize();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_FONT_MODEL__FONT_FAMILY:
				getFontFamily().clear();
				getFontFamily().addAll((Collection<? extends String>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_FONT_MODEL__FONT_STYLE:
				setFontStyle((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_FONT_MODEL__FONT_VARIANT:
				setFontVariant((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_FONT_MODEL__FONT_WEIGHT:
				setFontWeight((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_FONT_MODEL__FONT_SIZE:
				setFontSize((IfcSizeSelect)newValue);
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
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_FONT_MODEL__FONT_FAMILY:
				unsetFontFamily();
				return;
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_FONT_MODEL__FONT_STYLE:
				unsetFontStyle();
				return;
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_FONT_MODEL__FONT_VARIANT:
				unsetFontVariant();
				return;
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_FONT_MODEL__FONT_WEIGHT:
				unsetFontWeight();
				return;
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_FONT_MODEL__FONT_SIZE:
				setFontSize((IfcSizeSelect)null);
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
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_FONT_MODEL__FONT_FAMILY:
				return isSetFontFamily();
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_FONT_MODEL__FONT_STYLE:
				return isSetFontStyle();
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_FONT_MODEL__FONT_VARIANT:
				return isSetFontVariant();
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_FONT_MODEL__FONT_WEIGHT:
				return isSetFontWeight();
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_FONT_MODEL__FONT_SIZE:
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
		result.append(" (FontFamily: ");
		result.append(fontFamily);
		result.append(", FontStyle: ");
		if (fontStyleESet) result.append(fontStyle); else result.append("<unset>");
		result.append(", FontVariant: ");
		if (fontVariantESet) result.append(fontVariant); else result.append("<unset>");
		result.append(", FontWeight: ");
		if (fontWeightESet) result.append(fontWeight); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcTextStyleFontModelImpl
