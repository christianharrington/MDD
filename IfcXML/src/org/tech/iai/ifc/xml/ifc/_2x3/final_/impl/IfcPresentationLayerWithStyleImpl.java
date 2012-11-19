/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.Logical;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPresentationLayerWithStyle;
import org.tech.iai.ifc.xml.ifc._2x3.final_.LayerStylesType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Presentation Layer With Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcPresentationLayerWithStyleImpl#getLayerOn <em>Layer On</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcPresentationLayerWithStyleImpl#getLayerFrozen <em>Layer Frozen</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcPresentationLayerWithStyleImpl#getLayerBlocked <em>Layer Blocked</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcPresentationLayerWithStyleImpl#getLayerStyles <em>Layer Styles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcPresentationLayerWithStyleImpl extends IfcPresentationLayerAssignmentImpl implements IfcPresentationLayerWithStyle {
	/**
	 * The default value of the '{@link #getLayerOn() <em>Layer On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayerOn()
	 * @generated
	 * @ordered
	 */
	protected static final Logical LAYER_ON_EDEFAULT = Logical.FALSE;

	/**
	 * The cached value of the '{@link #getLayerOn() <em>Layer On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayerOn()
	 * @generated
	 * @ordered
	 */
	protected Logical layerOn = LAYER_ON_EDEFAULT;

	/**
	 * The default value of the '{@link #getLayerFrozen() <em>Layer Frozen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayerFrozen()
	 * @generated
	 * @ordered
	 */
	protected static final Logical LAYER_FROZEN_EDEFAULT = Logical.FALSE;

	/**
	 * The cached value of the '{@link #getLayerFrozen() <em>Layer Frozen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayerFrozen()
	 * @generated
	 * @ordered
	 */
	protected Logical layerFrozen = LAYER_FROZEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getLayerBlocked() <em>Layer Blocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayerBlocked()
	 * @generated
	 * @ordered
	 */
	protected static final Logical LAYER_BLOCKED_EDEFAULT = Logical.FALSE;

	/**
	 * The cached value of the '{@link #getLayerBlocked() <em>Layer Blocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayerBlocked()
	 * @generated
	 * @ordered
	 */
	protected Logical layerBlocked = LAYER_BLOCKED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLayerStyles() <em>Layer Styles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayerStyles()
	 * @generated
	 * @ordered
	 */
	protected LayerStylesType layerStyles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcPresentationLayerWithStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcPresentationLayerWithStyle();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Logical getLayerOn() {
		return layerOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayerOn(Logical newLayerOn) {
		Logical oldLayerOn = layerOn;
		layerOn = newLayerOn == null ? LAYER_ON_EDEFAULT : newLayerOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PRESENTATION_LAYER_WITH_STYLE__LAYER_ON, oldLayerOn, layerOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Logical getLayerFrozen() {
		return layerFrozen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayerFrozen(Logical newLayerFrozen) {
		Logical oldLayerFrozen = layerFrozen;
		layerFrozen = newLayerFrozen == null ? LAYER_FROZEN_EDEFAULT : newLayerFrozen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PRESENTATION_LAYER_WITH_STYLE__LAYER_FROZEN, oldLayerFrozen, layerFrozen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Logical getLayerBlocked() {
		return layerBlocked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayerBlocked(Logical newLayerBlocked) {
		Logical oldLayerBlocked = layerBlocked;
		layerBlocked = newLayerBlocked == null ? LAYER_BLOCKED_EDEFAULT : newLayerBlocked;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PRESENTATION_LAYER_WITH_STYLE__LAYER_BLOCKED, oldLayerBlocked, layerBlocked));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayerStylesType getLayerStyles() {
		return layerStyles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLayerStyles(LayerStylesType newLayerStyles, NotificationChain msgs) {
		LayerStylesType oldLayerStyles = layerStyles;
		layerStyles = newLayerStyles;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PRESENTATION_LAYER_WITH_STYLE__LAYER_STYLES, oldLayerStyles, newLayerStyles);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayerStyles(LayerStylesType newLayerStyles) {
		if (newLayerStyles != layerStyles) {
			NotificationChain msgs = null;
			if (layerStyles != null)
				msgs = ((InternalEObject)layerStyles).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PRESENTATION_LAYER_WITH_STYLE__LAYER_STYLES, null, msgs);
			if (newLayerStyles != null)
				msgs = ((InternalEObject)newLayerStyles).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PRESENTATION_LAYER_WITH_STYLE__LAYER_STYLES, null, msgs);
			msgs = basicSetLayerStyles(newLayerStyles, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PRESENTATION_LAYER_WITH_STYLE__LAYER_STYLES, newLayerStyles, newLayerStyles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_PRESENTATION_LAYER_WITH_STYLE__LAYER_STYLES:
				return basicSetLayerStyles(null, msgs);
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
			case FinalPackage.IFC_PRESENTATION_LAYER_WITH_STYLE__LAYER_ON:
				return getLayerOn();
			case FinalPackage.IFC_PRESENTATION_LAYER_WITH_STYLE__LAYER_FROZEN:
				return getLayerFrozen();
			case FinalPackage.IFC_PRESENTATION_LAYER_WITH_STYLE__LAYER_BLOCKED:
				return getLayerBlocked();
			case FinalPackage.IFC_PRESENTATION_LAYER_WITH_STYLE__LAYER_STYLES:
				return getLayerStyles();
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
			case FinalPackage.IFC_PRESENTATION_LAYER_WITH_STYLE__LAYER_ON:
				setLayerOn((Logical)newValue);
				return;
			case FinalPackage.IFC_PRESENTATION_LAYER_WITH_STYLE__LAYER_FROZEN:
				setLayerFrozen((Logical)newValue);
				return;
			case FinalPackage.IFC_PRESENTATION_LAYER_WITH_STYLE__LAYER_BLOCKED:
				setLayerBlocked((Logical)newValue);
				return;
			case FinalPackage.IFC_PRESENTATION_LAYER_WITH_STYLE__LAYER_STYLES:
				setLayerStyles((LayerStylesType)newValue);
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
			case FinalPackage.IFC_PRESENTATION_LAYER_WITH_STYLE__LAYER_ON:
				setLayerOn(LAYER_ON_EDEFAULT);
				return;
			case FinalPackage.IFC_PRESENTATION_LAYER_WITH_STYLE__LAYER_FROZEN:
				setLayerFrozen(LAYER_FROZEN_EDEFAULT);
				return;
			case FinalPackage.IFC_PRESENTATION_LAYER_WITH_STYLE__LAYER_BLOCKED:
				setLayerBlocked(LAYER_BLOCKED_EDEFAULT);
				return;
			case FinalPackage.IFC_PRESENTATION_LAYER_WITH_STYLE__LAYER_STYLES:
				setLayerStyles((LayerStylesType)null);
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
			case FinalPackage.IFC_PRESENTATION_LAYER_WITH_STYLE__LAYER_ON:
				return layerOn != LAYER_ON_EDEFAULT;
			case FinalPackage.IFC_PRESENTATION_LAYER_WITH_STYLE__LAYER_FROZEN:
				return layerFrozen != LAYER_FROZEN_EDEFAULT;
			case FinalPackage.IFC_PRESENTATION_LAYER_WITH_STYLE__LAYER_BLOCKED:
				return layerBlocked != LAYER_BLOCKED_EDEFAULT;
			case FinalPackage.IFC_PRESENTATION_LAYER_WITH_STYLE__LAYER_STYLES:
				return layerStyles != null;
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
		result.append(" (layerOn: ");
		result.append(layerOn);
		result.append(", layerFrozen: ");
		result.append(layerFrozen);
		result.append(", layerBlocked: ");
		result.append(layerBlocked);
		result.append(')');
		return result.toString();
	}

} //IfcPresentationLayerWithStyleImpl
