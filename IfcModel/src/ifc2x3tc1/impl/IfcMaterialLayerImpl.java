/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcMaterial;
import ifc2x3tc1.IfcMaterialLayer;
import ifc2x3tc1.IfcMaterialLayerSet;
import ifc2x3tc1.Tristate;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Material Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcMaterialLayerImpl#getMaterial <em>Material</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcMaterialLayerImpl#getLayerThickness <em>Layer Thickness</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcMaterialLayerImpl#getLayerThicknessAsString <em>Layer Thickness As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcMaterialLayerImpl#getIsVentilated <em>Is Ventilated</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcMaterialLayerImpl#getToMaterialLayerSet <em>To Material Layer Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcMaterialLayerImpl extends EObjectImpl implements IfcMaterialLayer {
	/**
	 * The cached value of the '{@link #getMaterial() <em>Material</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterial()
	 * @generated
	 * @ordered
	 */
	protected IfcMaterial material;

	/**
	 * This is true if the Material reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean materialESet;

	/**
	 * The default value of the '{@link #getLayerThickness() <em>Layer Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayerThickness()
	 * @generated
	 * @ordered
	 */
	protected static final double LAYER_THICKNESS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLayerThickness() <em>Layer Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayerThickness()
	 * @generated
	 * @ordered
	 */
	protected double layerThickness = LAYER_THICKNESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLayerThicknessAsString() <em>Layer Thickness As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayerThicknessAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String LAYER_THICKNESS_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLayerThicknessAsString() <em>Layer Thickness As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayerThicknessAsString()
	 * @generated
	 * @ordered
	 */
	protected String layerThicknessAsString = LAYER_THICKNESS_AS_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsVentilated() <em>Is Ventilated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsVentilated()
	 * @generated
	 * @ordered
	 */
	protected static final Tristate IS_VENTILATED_EDEFAULT = Tristate.TRUE;

	/**
	 * The cached value of the '{@link #getIsVentilated() <em>Is Ventilated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsVentilated()
	 * @generated
	 * @ordered
	 */
	protected Tristate isVentilated = IS_VENTILATED_EDEFAULT;

	/**
	 * This is true if the Is Ventilated attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isVentilatedESet;

	/**
	 * The cached value of the '{@link #getToMaterialLayerSet() <em>To Material Layer Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToMaterialLayerSet()
	 * @generated
	 * @ordered
	 */
	protected IfcMaterialLayerSet toMaterialLayerSet;

	/**
	 * This is true if the To Material Layer Set reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean toMaterialLayerSetESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcMaterialLayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcMaterialLayer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMaterial getMaterial() {
		if (material != null && material.eIsProxy()) {
			InternalEObject oldMaterial = (InternalEObject)material;
			material = (IfcMaterial)eResolveProxy(oldMaterial);
			if (material != oldMaterial) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_MATERIAL_LAYER__MATERIAL, oldMaterial, material));
			}
		}
		return material;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMaterial basicGetMaterial() {
		return material;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaterial(IfcMaterial newMaterial) {
		IfcMaterial oldMaterial = material;
		material = newMaterial;
		boolean oldMaterialESet = materialESet;
		materialESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_MATERIAL_LAYER__MATERIAL, oldMaterial, material, !oldMaterialESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaterial() {
		IfcMaterial oldMaterial = material;
		boolean oldMaterialESet = materialESet;
		material = null;
		materialESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_MATERIAL_LAYER__MATERIAL, oldMaterial, null, oldMaterialESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaterial() {
		return materialESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLayerThickness() {
		return layerThickness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayerThickness(double newLayerThickness) {
		double oldLayerThickness = layerThickness;
		layerThickness = newLayerThickness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_MATERIAL_LAYER__LAYER_THICKNESS, oldLayerThickness, layerThickness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLayerThicknessAsString() {
		return layerThicknessAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayerThicknessAsString(String newLayerThicknessAsString) {
		String oldLayerThicknessAsString = layerThicknessAsString;
		layerThicknessAsString = newLayerThicknessAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_MATERIAL_LAYER__LAYER_THICKNESS_AS_STRING, oldLayerThicknessAsString, layerThicknessAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tristate getIsVentilated() {
		return isVentilated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsVentilated(Tristate newIsVentilated) {
		Tristate oldIsVentilated = isVentilated;
		isVentilated = newIsVentilated == null ? IS_VENTILATED_EDEFAULT : newIsVentilated;
		boolean oldIsVentilatedESet = isVentilatedESet;
		isVentilatedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_MATERIAL_LAYER__IS_VENTILATED, oldIsVentilated, isVentilated, !oldIsVentilatedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsVentilated() {
		Tristate oldIsVentilated = isVentilated;
		boolean oldIsVentilatedESet = isVentilatedESet;
		isVentilated = IS_VENTILATED_EDEFAULT;
		isVentilatedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_MATERIAL_LAYER__IS_VENTILATED, oldIsVentilated, IS_VENTILATED_EDEFAULT, oldIsVentilatedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsVentilated() {
		return isVentilatedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMaterialLayerSet getToMaterialLayerSet() {
		if (toMaterialLayerSet != null && toMaterialLayerSet.eIsProxy()) {
			InternalEObject oldToMaterialLayerSet = (InternalEObject)toMaterialLayerSet;
			toMaterialLayerSet = (IfcMaterialLayerSet)eResolveProxy(oldToMaterialLayerSet);
			if (toMaterialLayerSet != oldToMaterialLayerSet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_MATERIAL_LAYER__TO_MATERIAL_LAYER_SET, oldToMaterialLayerSet, toMaterialLayerSet));
			}
		}
		return toMaterialLayerSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMaterialLayerSet basicGetToMaterialLayerSet() {
		return toMaterialLayerSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToMaterialLayerSet(IfcMaterialLayerSet newToMaterialLayerSet, NotificationChain msgs) {
		IfcMaterialLayerSet oldToMaterialLayerSet = toMaterialLayerSet;
		toMaterialLayerSet = newToMaterialLayerSet;
		boolean oldToMaterialLayerSetESet = toMaterialLayerSetESet;
		toMaterialLayerSetESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_MATERIAL_LAYER__TO_MATERIAL_LAYER_SET, oldToMaterialLayerSet, newToMaterialLayerSet, !oldToMaterialLayerSetESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToMaterialLayerSet(IfcMaterialLayerSet newToMaterialLayerSet) {
		if (newToMaterialLayerSet != toMaterialLayerSet) {
			NotificationChain msgs = null;
			if (toMaterialLayerSet != null)
				msgs = ((InternalEObject)toMaterialLayerSet).eInverseRemove(this, Ifc2x3tc1Package.IFC_MATERIAL_LAYER_SET__MATERIAL_LAYERS, IfcMaterialLayerSet.class, msgs);
			if (newToMaterialLayerSet != null)
				msgs = ((InternalEObject)newToMaterialLayerSet).eInverseAdd(this, Ifc2x3tc1Package.IFC_MATERIAL_LAYER_SET__MATERIAL_LAYERS, IfcMaterialLayerSet.class, msgs);
			msgs = basicSetToMaterialLayerSet(newToMaterialLayerSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldToMaterialLayerSetESet = toMaterialLayerSetESet;
			toMaterialLayerSetESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_MATERIAL_LAYER__TO_MATERIAL_LAYER_SET, newToMaterialLayerSet, newToMaterialLayerSet, !oldToMaterialLayerSetESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetToMaterialLayerSet(NotificationChain msgs) {
		IfcMaterialLayerSet oldToMaterialLayerSet = toMaterialLayerSet;
		toMaterialLayerSet = null;
		boolean oldToMaterialLayerSetESet = toMaterialLayerSetESet;
		toMaterialLayerSetESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_MATERIAL_LAYER__TO_MATERIAL_LAYER_SET, oldToMaterialLayerSet, null, oldToMaterialLayerSetESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetToMaterialLayerSet() {
		if (toMaterialLayerSet != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)toMaterialLayerSet).eInverseRemove(this, Ifc2x3tc1Package.IFC_MATERIAL_LAYER_SET__MATERIAL_LAYERS, IfcMaterialLayerSet.class, msgs);
			msgs = basicUnsetToMaterialLayerSet(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldToMaterialLayerSetESet = toMaterialLayerSetESet;
			toMaterialLayerSetESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_MATERIAL_LAYER__TO_MATERIAL_LAYER_SET, null, null, oldToMaterialLayerSetESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetToMaterialLayerSet() {
		return toMaterialLayerSetESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_MATERIAL_LAYER__TO_MATERIAL_LAYER_SET:
				if (toMaterialLayerSet != null)
					msgs = ((InternalEObject)toMaterialLayerSet).eInverseRemove(this, Ifc2x3tc1Package.IFC_MATERIAL_LAYER_SET__MATERIAL_LAYERS, IfcMaterialLayerSet.class, msgs);
				return basicSetToMaterialLayerSet((IfcMaterialLayerSet)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_MATERIAL_LAYER__TO_MATERIAL_LAYER_SET:
				return basicUnsetToMaterialLayerSet(msgs);
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
			case Ifc2x3tc1Package.IFC_MATERIAL_LAYER__MATERIAL:
				if (resolve) return getMaterial();
				return basicGetMaterial();
			case Ifc2x3tc1Package.IFC_MATERIAL_LAYER__LAYER_THICKNESS:
				return getLayerThickness();
			case Ifc2x3tc1Package.IFC_MATERIAL_LAYER__LAYER_THICKNESS_AS_STRING:
				return getLayerThicknessAsString();
			case Ifc2x3tc1Package.IFC_MATERIAL_LAYER__IS_VENTILATED:
				return getIsVentilated();
			case Ifc2x3tc1Package.IFC_MATERIAL_LAYER__TO_MATERIAL_LAYER_SET:
				if (resolve) return getToMaterialLayerSet();
				return basicGetToMaterialLayerSet();
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
			case Ifc2x3tc1Package.IFC_MATERIAL_LAYER__MATERIAL:
				setMaterial((IfcMaterial)newValue);
				return;
			case Ifc2x3tc1Package.IFC_MATERIAL_LAYER__LAYER_THICKNESS:
				setLayerThickness((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_MATERIAL_LAYER__LAYER_THICKNESS_AS_STRING:
				setLayerThicknessAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_MATERIAL_LAYER__IS_VENTILATED:
				setIsVentilated((Tristate)newValue);
				return;
			case Ifc2x3tc1Package.IFC_MATERIAL_LAYER__TO_MATERIAL_LAYER_SET:
				setToMaterialLayerSet((IfcMaterialLayerSet)newValue);
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
			case Ifc2x3tc1Package.IFC_MATERIAL_LAYER__MATERIAL:
				unsetMaterial();
				return;
			case Ifc2x3tc1Package.IFC_MATERIAL_LAYER__LAYER_THICKNESS:
				setLayerThickness(LAYER_THICKNESS_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_MATERIAL_LAYER__LAYER_THICKNESS_AS_STRING:
				setLayerThicknessAsString(LAYER_THICKNESS_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_MATERIAL_LAYER__IS_VENTILATED:
				unsetIsVentilated();
				return;
			case Ifc2x3tc1Package.IFC_MATERIAL_LAYER__TO_MATERIAL_LAYER_SET:
				unsetToMaterialLayerSet();
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
			case Ifc2x3tc1Package.IFC_MATERIAL_LAYER__MATERIAL:
				return isSetMaterial();
			case Ifc2x3tc1Package.IFC_MATERIAL_LAYER__LAYER_THICKNESS:
				return layerThickness != LAYER_THICKNESS_EDEFAULT;
			case Ifc2x3tc1Package.IFC_MATERIAL_LAYER__LAYER_THICKNESS_AS_STRING:
				return LAYER_THICKNESS_AS_STRING_EDEFAULT == null ? layerThicknessAsString != null : !LAYER_THICKNESS_AS_STRING_EDEFAULT.equals(layerThicknessAsString);
			case Ifc2x3tc1Package.IFC_MATERIAL_LAYER__IS_VENTILATED:
				return isSetIsVentilated();
			case Ifc2x3tc1Package.IFC_MATERIAL_LAYER__TO_MATERIAL_LAYER_SET:
				return isSetToMaterialLayerSet();
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
		result.append(" (LayerThickness: ");
		result.append(layerThickness);
		result.append(", LayerThicknessAsString: ");
		result.append(layerThicknessAsString);
		result.append(", IsVentilated: ");
		if (isVentilatedESet) result.append(isVentilated); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcMaterialLayerImpl
