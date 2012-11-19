/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSymbolStyle;
import org.tech.iai.ifc.xml.ifc._2x3.final_.StyleOfSymbolType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Symbol Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSymbolStyleImpl#getStyleOfSymbol <em>Style Of Symbol</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcSymbolStyleImpl extends IfcPresentationStyleImpl implements IfcSymbolStyle {
	/**
	 * The cached value of the '{@link #getStyleOfSymbol() <em>Style Of Symbol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleOfSymbol()
	 * @generated
	 * @ordered
	 */
	protected StyleOfSymbolType styleOfSymbol;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSymbolStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcSymbolStyle();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleOfSymbolType getStyleOfSymbol() {
		return styleOfSymbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStyleOfSymbol(StyleOfSymbolType newStyleOfSymbol, NotificationChain msgs) {
		StyleOfSymbolType oldStyleOfSymbol = styleOfSymbol;
		styleOfSymbol = newStyleOfSymbol;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SYMBOL_STYLE__STYLE_OF_SYMBOL, oldStyleOfSymbol, newStyleOfSymbol);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyleOfSymbol(StyleOfSymbolType newStyleOfSymbol) {
		if (newStyleOfSymbol != styleOfSymbol) {
			NotificationChain msgs = null;
			if (styleOfSymbol != null)
				msgs = ((InternalEObject)styleOfSymbol).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SYMBOL_STYLE__STYLE_OF_SYMBOL, null, msgs);
			if (newStyleOfSymbol != null)
				msgs = ((InternalEObject)newStyleOfSymbol).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SYMBOL_STYLE__STYLE_OF_SYMBOL, null, msgs);
			msgs = basicSetStyleOfSymbol(newStyleOfSymbol, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SYMBOL_STYLE__STYLE_OF_SYMBOL, newStyleOfSymbol, newStyleOfSymbol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_SYMBOL_STYLE__STYLE_OF_SYMBOL:
				return basicSetStyleOfSymbol(null, msgs);
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
			case FinalPackage.IFC_SYMBOL_STYLE__STYLE_OF_SYMBOL:
				return getStyleOfSymbol();
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
			case FinalPackage.IFC_SYMBOL_STYLE__STYLE_OF_SYMBOL:
				setStyleOfSymbol((StyleOfSymbolType)newValue);
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
			case FinalPackage.IFC_SYMBOL_STYLE__STYLE_OF_SYMBOL:
				setStyleOfSymbol((StyleOfSymbolType)null);
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
			case FinalPackage.IFC_SYMBOL_STYLE__STYLE_OF_SYMBOL:
				return styleOfSymbol != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcSymbolStyleImpl
