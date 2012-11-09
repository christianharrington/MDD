/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcMaterialLayer;
import ifc2x3tc1.IfcMaterialLayerSet;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Material Layer Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcMaterialLayerSetImpl#getMaterialLayers <em>Material Layers</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcMaterialLayerSetImpl#getLayerSetName <em>Layer Set Name</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcMaterialLayerSetImpl#getTotalThickness <em>Total Thickness</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcMaterialLayerSetImpl#getTotalThicknessAsString <em>Total Thickness As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcMaterialLayerSetImpl extends EObjectImpl implements IfcMaterialLayerSet {
	/**
	 * The cached value of the '{@link #getMaterialLayers() <em>Material Layers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterialLayers()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcMaterialLayer> materialLayers;

	/**
	 * The default value of the '{@link #getLayerSetName() <em>Layer Set Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayerSetName()
	 * @generated
	 * @ordered
	 */
	protected static final String LAYER_SET_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLayerSetName() <em>Layer Set Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayerSetName()
	 * @generated
	 * @ordered
	 */
	protected String layerSetName = LAYER_SET_NAME_EDEFAULT;

	/**
	 * This is true if the Layer Set Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean layerSetNameESet;

	/**
	 * The default value of the '{@link #getTotalThickness() <em>Total Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalThickness()
	 * @generated
	 * @ordered
	 */
	protected static final double TOTAL_THICKNESS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTotalThickness() <em>Total Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalThickness()
	 * @generated
	 * @ordered
	 */
	protected double totalThickness = TOTAL_THICKNESS_EDEFAULT;

	/**
	 * This is true if the Total Thickness attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean totalThicknessESet;

	/**
	 * The default value of the '{@link #getTotalThicknessAsString() <em>Total Thickness As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalThicknessAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String TOTAL_THICKNESS_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTotalThicknessAsString() <em>Total Thickness As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalThicknessAsString()
	 * @generated
	 * @ordered
	 */
	protected String totalThicknessAsString = TOTAL_THICKNESS_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Total Thickness As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean totalThicknessAsStringESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcMaterialLayerSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcMaterialLayerSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcMaterialLayer> getMaterialLayers() {
		if (materialLayers == null) {
			materialLayers = new EObjectWithInverseResolvingEList<IfcMaterialLayer>(IfcMaterialLayer.class, this, Ifc2x3tc1Package.IFC_MATERIAL_LAYER_SET__MATERIAL_LAYERS, Ifc2x3tc1Package.IFC_MATERIAL_LAYER__TO_MATERIAL_LAYER_SET);
		}
		return materialLayers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLayerSetName() {
		return layerSetName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayerSetName(String newLayerSetName) {
		String oldLayerSetName = layerSetName;
		layerSetName = newLayerSetName;
		boolean oldLayerSetNameESet = layerSetNameESet;
		layerSetNameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_MATERIAL_LAYER_SET__LAYER_SET_NAME, oldLayerSetName, layerSetName, !oldLayerSetNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLayerSetName() {
		String oldLayerSetName = layerSetName;
		boolean oldLayerSetNameESet = layerSetNameESet;
		layerSetName = LAYER_SET_NAME_EDEFAULT;
		layerSetNameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_MATERIAL_LAYER_SET__LAYER_SET_NAME, oldLayerSetName, LAYER_SET_NAME_EDEFAULT, oldLayerSetNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLayerSetName() {
		return layerSetNameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTotalThickness() {
		return totalThickness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalThickness(double newTotalThickness) {
		double oldTotalThickness = totalThickness;
		totalThickness = newTotalThickness;
		boolean oldTotalThicknessESet = totalThicknessESet;
		totalThicknessESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_MATERIAL_LAYER_SET__TOTAL_THICKNESS, oldTotalThickness, totalThickness, !oldTotalThicknessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTotalThickness() {
		double oldTotalThickness = totalThickness;
		boolean oldTotalThicknessESet = totalThicknessESet;
		totalThickness = TOTAL_THICKNESS_EDEFAULT;
		totalThicknessESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_MATERIAL_LAYER_SET__TOTAL_THICKNESS, oldTotalThickness, TOTAL_THICKNESS_EDEFAULT, oldTotalThicknessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTotalThickness() {
		return totalThicknessESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTotalThicknessAsString() {
		return totalThicknessAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalThicknessAsString(String newTotalThicknessAsString) {
		String oldTotalThicknessAsString = totalThicknessAsString;
		totalThicknessAsString = newTotalThicknessAsString;
		boolean oldTotalThicknessAsStringESet = totalThicknessAsStringESet;
		totalThicknessAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_MATERIAL_LAYER_SET__TOTAL_THICKNESS_AS_STRING, oldTotalThicknessAsString, totalThicknessAsString, !oldTotalThicknessAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTotalThicknessAsString() {
		String oldTotalThicknessAsString = totalThicknessAsString;
		boolean oldTotalThicknessAsStringESet = totalThicknessAsStringESet;
		totalThicknessAsString = TOTAL_THICKNESS_AS_STRING_EDEFAULT;
		totalThicknessAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_MATERIAL_LAYER_SET__TOTAL_THICKNESS_AS_STRING, oldTotalThicknessAsString, TOTAL_THICKNESS_AS_STRING_EDEFAULT, oldTotalThicknessAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTotalThicknessAsString() {
		return totalThicknessAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_MATERIAL_LAYER_SET__MATERIAL_LAYERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMaterialLayers()).basicAdd(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_MATERIAL_LAYER_SET__MATERIAL_LAYERS:
				return ((InternalEList<?>)getMaterialLayers()).basicRemove(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_MATERIAL_LAYER_SET__MATERIAL_LAYERS:
				return getMaterialLayers();
			case Ifc2x3tc1Package.IFC_MATERIAL_LAYER_SET__LAYER_SET_NAME:
				return getLayerSetName();
			case Ifc2x3tc1Package.IFC_MATERIAL_LAYER_SET__TOTAL_THICKNESS:
				return getTotalThickness();
			case Ifc2x3tc1Package.IFC_MATERIAL_LAYER_SET__TOTAL_THICKNESS_AS_STRING:
				return getTotalThicknessAsString();
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
			case Ifc2x3tc1Package.IFC_MATERIAL_LAYER_SET__MATERIAL_LAYERS:
				getMaterialLayers().clear();
				getMaterialLayers().addAll((Collection<? extends IfcMaterialLayer>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_MATERIAL_LAYER_SET__LAYER_SET_NAME:
				setLayerSetName((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_MATERIAL_LAYER_SET__TOTAL_THICKNESS:
				setTotalThickness((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_MATERIAL_LAYER_SET__TOTAL_THICKNESS_AS_STRING:
				setTotalThicknessAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_MATERIAL_LAYER_SET__MATERIAL_LAYERS:
				getMaterialLayers().clear();
				return;
			case Ifc2x3tc1Package.IFC_MATERIAL_LAYER_SET__LAYER_SET_NAME:
				unsetLayerSetName();
				return;
			case Ifc2x3tc1Package.IFC_MATERIAL_LAYER_SET__TOTAL_THICKNESS:
				unsetTotalThickness();
				return;
			case Ifc2x3tc1Package.IFC_MATERIAL_LAYER_SET__TOTAL_THICKNESS_AS_STRING:
				unsetTotalThicknessAsString();
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
			case Ifc2x3tc1Package.IFC_MATERIAL_LAYER_SET__MATERIAL_LAYERS:
				return materialLayers != null && !materialLayers.isEmpty();
			case Ifc2x3tc1Package.IFC_MATERIAL_LAYER_SET__LAYER_SET_NAME:
				return isSetLayerSetName();
			case Ifc2x3tc1Package.IFC_MATERIAL_LAYER_SET__TOTAL_THICKNESS:
				return isSetTotalThickness();
			case Ifc2x3tc1Package.IFC_MATERIAL_LAYER_SET__TOTAL_THICKNESS_AS_STRING:
				return isSetTotalThicknessAsString();
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
		result.append(" (LayerSetName: ");
		if (layerSetNameESet) result.append(layerSetName); else result.append("<unset>");
		result.append(", TotalThickness: ");
		if (totalThicknessESet) result.append(totalThickness); else result.append("<unset>");
		result.append(", TotalThicknessAsString: ");
		if (totalThicknessAsStringESet) result.append(totalThicknessAsString); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcMaterialLayerSetImpl
