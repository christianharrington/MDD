/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.EntityImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.BackgroundColourType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.ColourType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextStyleForDefinedFont;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Text Style For Defined Font</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTextStyleForDefinedFontImpl#getColour <em>Colour</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTextStyleForDefinedFontImpl#getBackgroundColour <em>Background Colour</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcTextStyleForDefinedFontImpl extends EntityImpl implements IfcTextStyleForDefinedFont {
	/**
	 * The cached value of the '{@link #getColour() <em>Colour</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColour()
	 * @generated
	 * @ordered
	 */
	protected ColourType colour;

	/**
	 * The cached value of the '{@link #getBackgroundColour() <em>Background Colour</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundColour()
	 * @generated
	 * @ordered
	 */
	protected BackgroundColourType backgroundColour;

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
		return FinalPackage.eINSTANCE.getIfcTextStyleForDefinedFont();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColourType getColour() {
		return colour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColour(ColourType newColour, NotificationChain msgs) {
		ColourType oldColour = colour;
		colour = newColour;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TEXT_STYLE_FOR_DEFINED_FONT__COLOUR, oldColour, newColour);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColour(ColourType newColour) {
		if (newColour != colour) {
			NotificationChain msgs = null;
			if (colour != null)
				msgs = ((InternalEObject)colour).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_TEXT_STYLE_FOR_DEFINED_FONT__COLOUR, null, msgs);
			if (newColour != null)
				msgs = ((InternalEObject)newColour).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_TEXT_STYLE_FOR_DEFINED_FONT__COLOUR, null, msgs);
			msgs = basicSetColour(newColour, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TEXT_STYLE_FOR_DEFINED_FONT__COLOUR, newColour, newColour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BackgroundColourType getBackgroundColour() {
		return backgroundColour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBackgroundColour(BackgroundColourType newBackgroundColour, NotificationChain msgs) {
		BackgroundColourType oldBackgroundColour = backgroundColour;
		backgroundColour = newBackgroundColour;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TEXT_STYLE_FOR_DEFINED_FONT__BACKGROUND_COLOUR, oldBackgroundColour, newBackgroundColour);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackgroundColour(BackgroundColourType newBackgroundColour) {
		if (newBackgroundColour != backgroundColour) {
			NotificationChain msgs = null;
			if (backgroundColour != null)
				msgs = ((InternalEObject)backgroundColour).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_TEXT_STYLE_FOR_DEFINED_FONT__BACKGROUND_COLOUR, null, msgs);
			if (newBackgroundColour != null)
				msgs = ((InternalEObject)newBackgroundColour).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_TEXT_STYLE_FOR_DEFINED_FONT__BACKGROUND_COLOUR, null, msgs);
			msgs = basicSetBackgroundColour(newBackgroundColour, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TEXT_STYLE_FOR_DEFINED_FONT__BACKGROUND_COLOUR, newBackgroundColour, newBackgroundColour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_TEXT_STYLE_FOR_DEFINED_FONT__COLOUR:
				return basicSetColour(null, msgs);
			case FinalPackage.IFC_TEXT_STYLE_FOR_DEFINED_FONT__BACKGROUND_COLOUR:
				return basicSetBackgroundColour(null, msgs);
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
			case FinalPackage.IFC_TEXT_STYLE_FOR_DEFINED_FONT__COLOUR:
				return getColour();
			case FinalPackage.IFC_TEXT_STYLE_FOR_DEFINED_FONT__BACKGROUND_COLOUR:
				return getBackgroundColour();
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
			case FinalPackage.IFC_TEXT_STYLE_FOR_DEFINED_FONT__COLOUR:
				setColour((ColourType)newValue);
				return;
			case FinalPackage.IFC_TEXT_STYLE_FOR_DEFINED_FONT__BACKGROUND_COLOUR:
				setBackgroundColour((BackgroundColourType)newValue);
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
			case FinalPackage.IFC_TEXT_STYLE_FOR_DEFINED_FONT__COLOUR:
				setColour((ColourType)null);
				return;
			case FinalPackage.IFC_TEXT_STYLE_FOR_DEFINED_FONT__BACKGROUND_COLOUR:
				setBackgroundColour((BackgroundColourType)null);
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
			case FinalPackage.IFC_TEXT_STYLE_FOR_DEFINED_FONT__COLOUR:
				return colour != null;
			case FinalPackage.IFC_TEXT_STYLE_FOR_DEFINED_FONT__BACKGROUND_COLOUR:
				return backgroundColour != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcTextStyleForDefinedFontImpl
