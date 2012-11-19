/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcExternallyDefinedTextFont;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPreDefinedTextFont;
import org.tech.iai.ifc.xml.ifc._2x3.final_.TextFontStyleType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Font Style Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.TextFontStyleTypeImpl#getIfcPreDefinedTextFontGroup <em>Ifc Pre Defined Text Font Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.TextFontStyleTypeImpl#getIfcPreDefinedTextFont <em>Ifc Pre Defined Text Font</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.TextFontStyleTypeImpl#getIfcExternallyDefinedTextFont <em>Ifc Externally Defined Text Font</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextFontStyleTypeImpl extends EObjectImpl implements TextFontStyleType {
	/**
	 * The cached value of the '{@link #getIfcPreDefinedTextFontGroup() <em>Ifc Pre Defined Text Font Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcPreDefinedTextFontGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcPreDefinedTextFontGroup;

	/**
	 * The cached value of the '{@link #getIfcExternallyDefinedTextFont() <em>Ifc Externally Defined Text Font</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcExternallyDefinedTextFont()
	 * @generated
	 * @ordered
	 */
	protected IfcExternallyDefinedTextFont ifcExternallyDefinedTextFont;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextFontStyleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getTextFontStyleType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcPreDefinedTextFontGroup() {
		if (ifcPreDefinedTextFontGroup == null) {
			ifcPreDefinedTextFontGroup = new BasicFeatureMap(this, FinalPackage.TEXT_FONT_STYLE_TYPE__IFC_PRE_DEFINED_TEXT_FONT_GROUP);
		}
		return ifcPreDefinedTextFontGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPreDefinedTextFont getIfcPreDefinedTextFont() {
		return (IfcPreDefinedTextFont)getIfcPreDefinedTextFontGroup().get(FinalPackage.eINSTANCE.getTextFontStyleType_IfcPreDefinedTextFont(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcPreDefinedTextFont(IfcPreDefinedTextFont newIfcPreDefinedTextFont, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcPreDefinedTextFontGroup()).basicAdd(FinalPackage.eINSTANCE.getTextFontStyleType_IfcPreDefinedTextFont(), newIfcPreDefinedTextFont, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcExternallyDefinedTextFont getIfcExternallyDefinedTextFont() {
		return ifcExternallyDefinedTextFont;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcExternallyDefinedTextFont(IfcExternallyDefinedTextFont newIfcExternallyDefinedTextFont, NotificationChain msgs) {
		IfcExternallyDefinedTextFont oldIfcExternallyDefinedTextFont = ifcExternallyDefinedTextFont;
		ifcExternallyDefinedTextFont = newIfcExternallyDefinedTextFont;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.TEXT_FONT_STYLE_TYPE__IFC_EXTERNALLY_DEFINED_TEXT_FONT, oldIfcExternallyDefinedTextFont, newIfcExternallyDefinedTextFont);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcExternallyDefinedTextFont(IfcExternallyDefinedTextFont newIfcExternallyDefinedTextFont) {
		if (newIfcExternallyDefinedTextFont != ifcExternallyDefinedTextFont) {
			NotificationChain msgs = null;
			if (ifcExternallyDefinedTextFont != null)
				msgs = ((InternalEObject)ifcExternallyDefinedTextFont).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.TEXT_FONT_STYLE_TYPE__IFC_EXTERNALLY_DEFINED_TEXT_FONT, null, msgs);
			if (newIfcExternallyDefinedTextFont != null)
				msgs = ((InternalEObject)newIfcExternallyDefinedTextFont).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.TEXT_FONT_STYLE_TYPE__IFC_EXTERNALLY_DEFINED_TEXT_FONT, null, msgs);
			msgs = basicSetIfcExternallyDefinedTextFont(newIfcExternallyDefinedTextFont, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.TEXT_FONT_STYLE_TYPE__IFC_EXTERNALLY_DEFINED_TEXT_FONT, newIfcExternallyDefinedTextFont, newIfcExternallyDefinedTextFont));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.TEXT_FONT_STYLE_TYPE__IFC_PRE_DEFINED_TEXT_FONT_GROUP:
				return ((InternalEList<?>)getIfcPreDefinedTextFontGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.TEXT_FONT_STYLE_TYPE__IFC_PRE_DEFINED_TEXT_FONT:
				return basicSetIfcPreDefinedTextFont(null, msgs);
			case FinalPackage.TEXT_FONT_STYLE_TYPE__IFC_EXTERNALLY_DEFINED_TEXT_FONT:
				return basicSetIfcExternallyDefinedTextFont(null, msgs);
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
			case FinalPackage.TEXT_FONT_STYLE_TYPE__IFC_PRE_DEFINED_TEXT_FONT_GROUP:
				if (coreType) return getIfcPreDefinedTextFontGroup();
				return ((FeatureMap.Internal)getIfcPreDefinedTextFontGroup()).getWrapper();
			case FinalPackage.TEXT_FONT_STYLE_TYPE__IFC_PRE_DEFINED_TEXT_FONT:
				return getIfcPreDefinedTextFont();
			case FinalPackage.TEXT_FONT_STYLE_TYPE__IFC_EXTERNALLY_DEFINED_TEXT_FONT:
				return getIfcExternallyDefinedTextFont();
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
			case FinalPackage.TEXT_FONT_STYLE_TYPE__IFC_PRE_DEFINED_TEXT_FONT_GROUP:
				((FeatureMap.Internal)getIfcPreDefinedTextFontGroup()).set(newValue);
				return;
			case FinalPackage.TEXT_FONT_STYLE_TYPE__IFC_EXTERNALLY_DEFINED_TEXT_FONT:
				setIfcExternallyDefinedTextFont((IfcExternallyDefinedTextFont)newValue);
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
			case FinalPackage.TEXT_FONT_STYLE_TYPE__IFC_PRE_DEFINED_TEXT_FONT_GROUP:
				getIfcPreDefinedTextFontGroup().clear();
				return;
			case FinalPackage.TEXT_FONT_STYLE_TYPE__IFC_EXTERNALLY_DEFINED_TEXT_FONT:
				setIfcExternallyDefinedTextFont((IfcExternallyDefinedTextFont)null);
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
			case FinalPackage.TEXT_FONT_STYLE_TYPE__IFC_PRE_DEFINED_TEXT_FONT_GROUP:
				return ifcPreDefinedTextFontGroup != null && !ifcPreDefinedTextFontGroup.isEmpty();
			case FinalPackage.TEXT_FONT_STYLE_TYPE__IFC_PRE_DEFINED_TEXT_FONT:
				return getIfcPreDefinedTextFont() != null;
			case FinalPackage.TEXT_FONT_STYLE_TYPE__IFC_EXTERNALLY_DEFINED_TEXT_FONT:
				return ifcExternallyDefinedTextFont != null;
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
		result.append(" (ifcPreDefinedTextFontGroup: ");
		result.append(ifcPreDefinedTextFontGroup);
		result.append(')');
		return result.toString();
	}

} //TextFontStyleTypeImpl
