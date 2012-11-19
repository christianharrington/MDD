/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCharacterStyleSelect;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextStyleForDefinedFont;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Character Style Select</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcCharacterStyleSelectImpl#getIfcTextStyleForDefinedFont <em>Ifc Text Style For Defined Font</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcCharacterStyleSelectImpl extends EObjectImpl implements IfcCharacterStyleSelect {
	/**
	 * The cached value of the '{@link #getIfcTextStyleForDefinedFont() <em>Ifc Text Style For Defined Font</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcTextStyleForDefinedFont()
	 * @generated
	 * @ordered
	 */
	protected IfcTextStyleForDefinedFont ifcTextStyleForDefinedFont;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcCharacterStyleSelectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcCharacterStyleSelect();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTextStyleForDefinedFont getIfcTextStyleForDefinedFont() {
		return ifcTextStyleForDefinedFont;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcTextStyleForDefinedFont(IfcTextStyleForDefinedFont newIfcTextStyleForDefinedFont, NotificationChain msgs) {
		IfcTextStyleForDefinedFont oldIfcTextStyleForDefinedFont = ifcTextStyleForDefinedFont;
		ifcTextStyleForDefinedFont = newIfcTextStyleForDefinedFont;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CHARACTER_STYLE_SELECT__IFC_TEXT_STYLE_FOR_DEFINED_FONT, oldIfcTextStyleForDefinedFont, newIfcTextStyleForDefinedFont);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcTextStyleForDefinedFont(IfcTextStyleForDefinedFont newIfcTextStyleForDefinedFont) {
		if (newIfcTextStyleForDefinedFont != ifcTextStyleForDefinedFont) {
			NotificationChain msgs = null;
			if (ifcTextStyleForDefinedFont != null)
				msgs = ((InternalEObject)ifcTextStyleForDefinedFont).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CHARACTER_STYLE_SELECT__IFC_TEXT_STYLE_FOR_DEFINED_FONT, null, msgs);
			if (newIfcTextStyleForDefinedFont != null)
				msgs = ((InternalEObject)newIfcTextStyleForDefinedFont).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CHARACTER_STYLE_SELECT__IFC_TEXT_STYLE_FOR_DEFINED_FONT, null, msgs);
			msgs = basicSetIfcTextStyleForDefinedFont(newIfcTextStyleForDefinedFont, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CHARACTER_STYLE_SELECT__IFC_TEXT_STYLE_FOR_DEFINED_FONT, newIfcTextStyleForDefinedFont, newIfcTextStyleForDefinedFont));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_CHARACTER_STYLE_SELECT__IFC_TEXT_STYLE_FOR_DEFINED_FONT:
				return basicSetIfcTextStyleForDefinedFont(null, msgs);
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
			case FinalPackage.IFC_CHARACTER_STYLE_SELECT__IFC_TEXT_STYLE_FOR_DEFINED_FONT:
				return getIfcTextStyleForDefinedFont();
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
			case FinalPackage.IFC_CHARACTER_STYLE_SELECT__IFC_TEXT_STYLE_FOR_DEFINED_FONT:
				setIfcTextStyleForDefinedFont((IfcTextStyleForDefinedFont)newValue);
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
			case FinalPackage.IFC_CHARACTER_STYLE_SELECT__IFC_TEXT_STYLE_FOR_DEFINED_FONT:
				setIfcTextStyleForDefinedFont((IfcTextStyleForDefinedFont)null);
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
			case FinalPackage.IFC_CHARACTER_STYLE_SELECT__IFC_TEXT_STYLE_FOR_DEFINED_FONT:
				return ifcTextStyleForDefinedFont != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcCharacterStyleSelectImpl
