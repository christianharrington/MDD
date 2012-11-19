/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.EntityImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.CharacterSpacingType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextStyleWithBoxCharacteristics;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Text Style With Box Characteristics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTextStyleWithBoxCharacteristicsImpl#getBoxHeight <em>Box Height</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTextStyleWithBoxCharacteristicsImpl#getBoxWidth <em>Box Width</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTextStyleWithBoxCharacteristicsImpl#getBoxSlantAngle <em>Box Slant Angle</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTextStyleWithBoxCharacteristicsImpl#getBoxRotateAngle <em>Box Rotate Angle</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTextStyleWithBoxCharacteristicsImpl#getCharacterSpacing <em>Character Spacing</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcTextStyleWithBoxCharacteristicsImpl extends EntityImpl implements IfcTextStyleWithBoxCharacteristics {
	/**
	 * The default value of the '{@link #getBoxHeight() <em>Box Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoxHeight()
	 * @generated
	 * @ordered
	 */
	protected static final Double BOX_HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBoxHeight() <em>Box Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoxHeight()
	 * @generated
	 * @ordered
	 */
	protected Double boxHeight = BOX_HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getBoxWidth() <em>Box Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoxWidth()
	 * @generated
	 * @ordered
	 */
	protected static final Double BOX_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBoxWidth() <em>Box Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoxWidth()
	 * @generated
	 * @ordered
	 */
	protected Double boxWidth = BOX_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getBoxSlantAngle() <em>Box Slant Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoxSlantAngle()
	 * @generated
	 * @ordered
	 */
	protected static final Double BOX_SLANT_ANGLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBoxSlantAngle() <em>Box Slant Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoxSlantAngle()
	 * @generated
	 * @ordered
	 */
	protected Double boxSlantAngle = BOX_SLANT_ANGLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBoxRotateAngle() <em>Box Rotate Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoxRotateAngle()
	 * @generated
	 * @ordered
	 */
	protected static final Double BOX_ROTATE_ANGLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBoxRotateAngle() <em>Box Rotate Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoxRotateAngle()
	 * @generated
	 * @ordered
	 */
	protected Double boxRotateAngle = BOX_ROTATE_ANGLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCharacterSpacing() <em>Character Spacing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacterSpacing()
	 * @generated
	 * @ordered
	 */
	protected CharacterSpacingType characterSpacing;

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
		return FinalPackage.eINSTANCE.getIfcTextStyleWithBoxCharacteristics();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getBoxHeight() {
		return boxHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoxHeight(Double newBoxHeight) {
		Double oldBoxHeight = boxHeight;
		boxHeight = newBoxHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_HEIGHT, oldBoxHeight, boxHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getBoxWidth() {
		return boxWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoxWidth(Double newBoxWidth) {
		Double oldBoxWidth = boxWidth;
		boxWidth = newBoxWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_WIDTH, oldBoxWidth, boxWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getBoxSlantAngle() {
		return boxSlantAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoxSlantAngle(Double newBoxSlantAngle) {
		Double oldBoxSlantAngle = boxSlantAngle;
		boxSlantAngle = newBoxSlantAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_SLANT_ANGLE, oldBoxSlantAngle, boxSlantAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getBoxRotateAngle() {
		return boxRotateAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoxRotateAngle(Double newBoxRotateAngle) {
		Double oldBoxRotateAngle = boxRotateAngle;
		boxRotateAngle = newBoxRotateAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_ROTATE_ANGLE, oldBoxRotateAngle, boxRotateAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacterSpacingType getCharacterSpacing() {
		return characterSpacing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCharacterSpacing(CharacterSpacingType newCharacterSpacing, NotificationChain msgs) {
		CharacterSpacingType oldCharacterSpacing = characterSpacing;
		characterSpacing = newCharacterSpacing;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__CHARACTER_SPACING, oldCharacterSpacing, newCharacterSpacing);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharacterSpacing(CharacterSpacingType newCharacterSpacing) {
		if (newCharacterSpacing != characterSpacing) {
			NotificationChain msgs = null;
			if (characterSpacing != null)
				msgs = ((InternalEObject)characterSpacing).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__CHARACTER_SPACING, null, msgs);
			if (newCharacterSpacing != null)
				msgs = ((InternalEObject)newCharacterSpacing).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__CHARACTER_SPACING, null, msgs);
			msgs = basicSetCharacterSpacing(newCharacterSpacing, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__CHARACTER_SPACING, newCharacterSpacing, newCharacterSpacing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__CHARACTER_SPACING:
				return basicSetCharacterSpacing(null, msgs);
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
			case FinalPackage.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_HEIGHT:
				return getBoxHeight();
			case FinalPackage.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_WIDTH:
				return getBoxWidth();
			case FinalPackage.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_SLANT_ANGLE:
				return getBoxSlantAngle();
			case FinalPackage.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_ROTATE_ANGLE:
				return getBoxRotateAngle();
			case FinalPackage.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__CHARACTER_SPACING:
				return getCharacterSpacing();
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
			case FinalPackage.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_HEIGHT:
				setBoxHeight((Double)newValue);
				return;
			case FinalPackage.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_WIDTH:
				setBoxWidth((Double)newValue);
				return;
			case FinalPackage.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_SLANT_ANGLE:
				setBoxSlantAngle((Double)newValue);
				return;
			case FinalPackage.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_ROTATE_ANGLE:
				setBoxRotateAngle((Double)newValue);
				return;
			case FinalPackage.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__CHARACTER_SPACING:
				setCharacterSpacing((CharacterSpacingType)newValue);
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
			case FinalPackage.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_HEIGHT:
				setBoxHeight(BOX_HEIGHT_EDEFAULT);
				return;
			case FinalPackage.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_WIDTH:
				setBoxWidth(BOX_WIDTH_EDEFAULT);
				return;
			case FinalPackage.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_SLANT_ANGLE:
				setBoxSlantAngle(BOX_SLANT_ANGLE_EDEFAULT);
				return;
			case FinalPackage.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_ROTATE_ANGLE:
				setBoxRotateAngle(BOX_ROTATE_ANGLE_EDEFAULT);
				return;
			case FinalPackage.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__CHARACTER_SPACING:
				setCharacterSpacing((CharacterSpacingType)null);
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
			case FinalPackage.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_HEIGHT:
				return BOX_HEIGHT_EDEFAULT == null ? boxHeight != null : !BOX_HEIGHT_EDEFAULT.equals(boxHeight);
			case FinalPackage.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_WIDTH:
				return BOX_WIDTH_EDEFAULT == null ? boxWidth != null : !BOX_WIDTH_EDEFAULT.equals(boxWidth);
			case FinalPackage.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_SLANT_ANGLE:
				return BOX_SLANT_ANGLE_EDEFAULT == null ? boxSlantAngle != null : !BOX_SLANT_ANGLE_EDEFAULT.equals(boxSlantAngle);
			case FinalPackage.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_ROTATE_ANGLE:
				return BOX_ROTATE_ANGLE_EDEFAULT == null ? boxRotateAngle != null : !BOX_ROTATE_ANGLE_EDEFAULT.equals(boxRotateAngle);
			case FinalPackage.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__CHARACTER_SPACING:
				return characterSpacing != null;
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
		result.append(" (boxHeight: ");
		result.append(boxHeight);
		result.append(", boxWidth: ");
		result.append(boxWidth);
		result.append(", boxSlantAngle: ");
		result.append(boxSlantAngle);
		result.append(", boxRotateAngle: ");
		result.append(boxRotateAngle);
		result.append(')');
		return result.toString();
	}

} //IfcTextStyleWithBoxCharacteristicsImpl
