/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcSymbolStyle;
import ifc2x3tc1.IfcSymbolStyleSelect;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Symbol Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcSymbolStyleImpl#getStyleOfSymbol <em>Style Of Symbol</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcSymbolStyleImpl extends IfcPresentationStyleImpl implements IfcSymbolStyle {
	/**
	 * The cached value of the '{@link #getStyleOfSymbol() <em>Style Of Symbol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleOfSymbol()
	 * @generated
	 * @ordered
	 */
	protected IfcSymbolStyleSelect styleOfSymbol;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcSymbolStyle();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSymbolStyleSelect getStyleOfSymbol() {
		if (styleOfSymbol != null && styleOfSymbol.eIsProxy()) {
			InternalEObject oldStyleOfSymbol = (InternalEObject)styleOfSymbol;
			styleOfSymbol = (IfcSymbolStyleSelect)eResolveProxy(oldStyleOfSymbol);
			if (styleOfSymbol != oldStyleOfSymbol) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_SYMBOL_STYLE__STYLE_OF_SYMBOL, oldStyleOfSymbol, styleOfSymbol));
			}
		}
		return styleOfSymbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSymbolStyleSelect basicGetStyleOfSymbol() {
		return styleOfSymbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyleOfSymbol(IfcSymbolStyleSelect newStyleOfSymbol) {
		IfcSymbolStyleSelect oldStyleOfSymbol = styleOfSymbol;
		styleOfSymbol = newStyleOfSymbol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SYMBOL_STYLE__STYLE_OF_SYMBOL, oldStyleOfSymbol, styleOfSymbol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_SYMBOL_STYLE__STYLE_OF_SYMBOL:
				if (resolve) return getStyleOfSymbol();
				return basicGetStyleOfSymbol();
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
			case Ifc2x3tc1Package.IFC_SYMBOL_STYLE__STYLE_OF_SYMBOL:
				setStyleOfSymbol((IfcSymbolStyleSelect)newValue);
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
			case Ifc2x3tc1Package.IFC_SYMBOL_STYLE__STYLE_OF_SYMBOL:
				setStyleOfSymbol((IfcSymbolStyleSelect)null);
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
			case Ifc2x3tc1Package.IFC_SYMBOL_STYLE__STYLE_OF_SYMBOL:
				return styleOfSymbol != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcSymbolStyleImpl
