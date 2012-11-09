/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcColour;
import ifc2x3tc1.IfcTextStyleForDefinedFont;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Text Style For Defined Font</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcTextStyleForDefinedFontImpl#getColour <em>Colour</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTextStyleForDefinedFontImpl#getBackgroundColour <em>Background Colour</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcTextStyleForDefinedFontImpl extends EObjectImpl implements IfcTextStyleForDefinedFont {
	/**
	 * The cached value of the '{@link #getColour() <em>Colour</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColour()
	 * @generated
	 * @ordered
	 */
	protected IfcColour colour;

	/**
	 * The cached value of the '{@link #getBackgroundColour() <em>Background Colour</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundColour()
	 * @generated
	 * @ordered
	 */
	protected IfcColour backgroundColour;

	/**
	 * This is true if the Background Colour reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean backgroundColourESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcTextStyleForDefinedFontImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcTextStyleForDefinedFont();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcColour getColour() {
		if (colour != null && colour.eIsProxy()) {
			InternalEObject oldColour = (InternalEObject)colour;
			colour = (IfcColour)eResolveProxy(oldColour);
			if (colour != oldColour) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_TEXT_STYLE_FOR_DEFINED_FONT__COLOUR, oldColour, colour));
			}
		}
		return colour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcColour basicGetColour() {
		return colour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColour(IfcColour newColour) {
		IfcColour oldColour = colour;
		colour = newColour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TEXT_STYLE_FOR_DEFINED_FONT__COLOUR, oldColour, colour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcColour getBackgroundColour() {
		if (backgroundColour != null && backgroundColour.eIsProxy()) {
			InternalEObject oldBackgroundColour = (InternalEObject)backgroundColour;
			backgroundColour = (IfcColour)eResolveProxy(oldBackgroundColour);
			if (backgroundColour != oldBackgroundColour) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_TEXT_STYLE_FOR_DEFINED_FONT__BACKGROUND_COLOUR, oldBackgroundColour, backgroundColour));
			}
		}
		return backgroundColour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcColour basicGetBackgroundColour() {
		return backgroundColour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackgroundColour(IfcColour newBackgroundColour) {
		IfcColour oldBackgroundColour = backgroundColour;
		backgroundColour = newBackgroundColour;
		boolean oldBackgroundColourESet = backgroundColourESet;
		backgroundColourESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TEXT_STYLE_FOR_DEFINED_FONT__BACKGROUND_COLOUR, oldBackgroundColour, backgroundColour, !oldBackgroundColourESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBackgroundColour() {
		IfcColour oldBackgroundColour = backgroundColour;
		boolean oldBackgroundColourESet = backgroundColourESet;
		backgroundColour = null;
		backgroundColourESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_TEXT_STYLE_FOR_DEFINED_FONT__BACKGROUND_COLOUR, oldBackgroundColour, null, oldBackgroundColourESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBackgroundColour() {
		return backgroundColourESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_FOR_DEFINED_FONT__COLOUR:
				if (resolve) return getColour();
				return basicGetColour();
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_FOR_DEFINED_FONT__BACKGROUND_COLOUR:
				if (resolve) return getBackgroundColour();
				return basicGetBackgroundColour();
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
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_FOR_DEFINED_FONT__COLOUR:
				setColour((IfcColour)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_FOR_DEFINED_FONT__BACKGROUND_COLOUR:
				setBackgroundColour((IfcColour)newValue);
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
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_FOR_DEFINED_FONT__COLOUR:
				setColour((IfcColour)null);
				return;
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_FOR_DEFINED_FONT__BACKGROUND_COLOUR:
				unsetBackgroundColour();
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
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_FOR_DEFINED_FONT__COLOUR:
				return colour != null;
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_FOR_DEFINED_FONT__BACKGROUND_COLOUR:
				return isSetBackgroundColour();
		}
		return super.eIsSet(featureID);
	}

} //IfcTextStyleForDefinedFontImpl
