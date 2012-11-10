/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcPresentationLayerWithStyle;
import ifc2x3tc1.IfcPresentationStyleSelect;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Presentation Layer With Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcPresentationLayerWithStyleImpl#isLayerOn <em>Layer On</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcPresentationLayerWithStyleImpl#isLayerFrozen <em>Layer Frozen</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcPresentationLayerWithStyleImpl#isLayerBlocked <em>Layer Blocked</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcPresentationLayerWithStyleImpl#getLayerStyles <em>Layer Styles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcPresentationLayerWithStyleImpl extends IfcPresentationLayerAssignmentImpl implements IfcPresentationLayerWithStyle {
	/**
	 * The default value of the '{@link #isLayerOn() <em>Layer On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLayerOn()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LAYER_ON_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLayerOn() <em>Layer On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLayerOn()
	 * @generated
	 * @ordered
	 */
	protected boolean layerOn = LAYER_ON_EDEFAULT;

	/**
	 * The default value of the '{@link #isLayerFrozen() <em>Layer Frozen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLayerFrozen()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LAYER_FROZEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLayerFrozen() <em>Layer Frozen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLayerFrozen()
	 * @generated
	 * @ordered
	 */
	protected boolean layerFrozen = LAYER_FROZEN_EDEFAULT;

	/**
	 * The default value of the '{@link #isLayerBlocked() <em>Layer Blocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLayerBlocked()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LAYER_BLOCKED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLayerBlocked() <em>Layer Blocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLayerBlocked()
	 * @generated
	 * @ordered
	 */
	protected boolean layerBlocked = LAYER_BLOCKED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLayerStyles() <em>Layer Styles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayerStyles()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcPresentationStyleSelect> layerStyles;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcPresentationLayerWithStyle();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLayerOn() {
		return layerOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayerOn(boolean newLayerOn) {
		boolean oldLayerOn = layerOn;
		layerOn = newLayerOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PRESENTATION_LAYER_WITH_STYLE__LAYER_ON, oldLayerOn, layerOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLayerFrozen() {
		return layerFrozen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayerFrozen(boolean newLayerFrozen) {
		boolean oldLayerFrozen = layerFrozen;
		layerFrozen = newLayerFrozen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PRESENTATION_LAYER_WITH_STYLE__LAYER_FROZEN, oldLayerFrozen, layerFrozen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLayerBlocked() {
		return layerBlocked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayerBlocked(boolean newLayerBlocked) {
		boolean oldLayerBlocked = layerBlocked;
		layerBlocked = newLayerBlocked;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PRESENTATION_LAYER_WITH_STYLE__LAYER_BLOCKED, oldLayerBlocked, layerBlocked));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcPresentationStyleSelect> getLayerStyles() {
		if (layerStyles == null) {
			layerStyles = new EObjectResolvingEList<IfcPresentationStyleSelect>(IfcPresentationStyleSelect.class, this, Ifc2x3tc1Package.IFC_PRESENTATION_LAYER_WITH_STYLE__LAYER_STYLES);
		}
		return layerStyles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_PRESENTATION_LAYER_WITH_STYLE__LAYER_ON:
				return isLayerOn();
			case Ifc2x3tc1Package.IFC_PRESENTATION_LAYER_WITH_STYLE__LAYER_FROZEN:
				return isLayerFrozen();
			case Ifc2x3tc1Package.IFC_PRESENTATION_LAYER_WITH_STYLE__LAYER_BLOCKED:
				return isLayerBlocked();
			case Ifc2x3tc1Package.IFC_PRESENTATION_LAYER_WITH_STYLE__LAYER_STYLES:
				return getLayerStyles();
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
			case Ifc2x3tc1Package.IFC_PRESENTATION_LAYER_WITH_STYLE__LAYER_ON:
				setLayerOn((Boolean)newValue);
				return;
			case Ifc2x3tc1Package.IFC_PRESENTATION_LAYER_WITH_STYLE__LAYER_FROZEN:
				setLayerFrozen((Boolean)newValue);
				return;
			case Ifc2x3tc1Package.IFC_PRESENTATION_LAYER_WITH_STYLE__LAYER_BLOCKED:
				setLayerBlocked((Boolean)newValue);
				return;
			case Ifc2x3tc1Package.IFC_PRESENTATION_LAYER_WITH_STYLE__LAYER_STYLES:
				getLayerStyles().clear();
				getLayerStyles().addAll((Collection<? extends IfcPresentationStyleSelect>)newValue);
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
			case Ifc2x3tc1Package.IFC_PRESENTATION_LAYER_WITH_STYLE__LAYER_ON:
				setLayerOn(LAYER_ON_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_PRESENTATION_LAYER_WITH_STYLE__LAYER_FROZEN:
				setLayerFrozen(LAYER_FROZEN_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_PRESENTATION_LAYER_WITH_STYLE__LAYER_BLOCKED:
				setLayerBlocked(LAYER_BLOCKED_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_PRESENTATION_LAYER_WITH_STYLE__LAYER_STYLES:
				getLayerStyles().clear();
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
			case Ifc2x3tc1Package.IFC_PRESENTATION_LAYER_WITH_STYLE__LAYER_ON:
				return layerOn != LAYER_ON_EDEFAULT;
			case Ifc2x3tc1Package.IFC_PRESENTATION_LAYER_WITH_STYLE__LAYER_FROZEN:
				return layerFrozen != LAYER_FROZEN_EDEFAULT;
			case Ifc2x3tc1Package.IFC_PRESENTATION_LAYER_WITH_STYLE__LAYER_BLOCKED:
				return layerBlocked != LAYER_BLOCKED_EDEFAULT;
			case Ifc2x3tc1Package.IFC_PRESENTATION_LAYER_WITH_STYLE__LAYER_STYLES:
				return layerStyles != null && !layerStyles.isEmpty();
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
		result.append(" (LayerOn: ");
		result.append(layerOn);
		result.append(", LayerFrozen: ");
		result.append(layerFrozen);
		result.append(", LayerBlocked: ");
		result.append(layerBlocked);
		result.append(')');
		return result.toString();
	}

} //IfcPresentationLayerWithStyleImpl
