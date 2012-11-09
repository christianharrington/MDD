/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcAnalysisModelTypeEnum;
import ifc2x3tc1.IfcAxis2Placement3D;
import ifc2x3tc1.IfcStructuralAnalysisModel;
import ifc2x3tc1.IfcStructuralLoadGroup;
import ifc2x3tc1.IfcStructuralResultGroup;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Structural Analysis Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralAnalysisModelImpl#getPredefinedType <em>Predefined Type</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralAnalysisModelImpl#getOrientationOf2DPlane <em>Orientation Of2 DPlane</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralAnalysisModelImpl#getLoadedBy <em>Loaded By</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralAnalysisModelImpl#getHasResults <em>Has Results</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcStructuralAnalysisModelImpl extends IfcSystemImpl implements IfcStructuralAnalysisModel {
	/**
	 * The default value of the '{@link #getPredefinedType() <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredefinedType()
	 * @generated
	 * @ordered
	 */
	protected static final IfcAnalysisModelTypeEnum PREDEFINED_TYPE_EDEFAULT = IfcAnalysisModelTypeEnum.NULL;

	/**
	 * The cached value of the '{@link #getPredefinedType() <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredefinedType()
	 * @generated
	 * @ordered
	 */
	protected IfcAnalysisModelTypeEnum predefinedType = PREDEFINED_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOrientationOf2DPlane() <em>Orientation Of2 DPlane</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientationOf2DPlane()
	 * @generated
	 * @ordered
	 */
	protected IfcAxis2Placement3D orientationOf2DPlane;

	/**
	 * This is true if the Orientation Of2 DPlane reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean orientationOf2DPlaneESet;

	/**
	 * The cached value of the '{@link #getLoadedBy() <em>Loaded By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcStructuralLoadGroup> loadedBy;

	/**
	 * The cached value of the '{@link #getHasResults() <em>Has Results</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasResults()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcStructuralResultGroup> hasResults;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcStructuralAnalysisModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcStructuralAnalysisModel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAnalysisModelTypeEnum getPredefinedType() {
		return predefinedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredefinedType(IfcAnalysisModelTypeEnum newPredefinedType) {
		IfcAnalysisModelTypeEnum oldPredefinedType = predefinedType;
		predefinedType = newPredefinedType == null ? PREDEFINED_TYPE_EDEFAULT : newPredefinedType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_ANALYSIS_MODEL__PREDEFINED_TYPE, oldPredefinedType, predefinedType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAxis2Placement3D getOrientationOf2DPlane() {
		if (orientationOf2DPlane != null && orientationOf2DPlane.eIsProxy()) {
			InternalEObject oldOrientationOf2DPlane = (InternalEObject)orientationOf2DPlane;
			orientationOf2DPlane = (IfcAxis2Placement3D)eResolveProxy(oldOrientationOf2DPlane);
			if (orientationOf2DPlane != oldOrientationOf2DPlane) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_STRUCTURAL_ANALYSIS_MODEL__ORIENTATION_OF2_DPLANE, oldOrientationOf2DPlane, orientationOf2DPlane));
			}
		}
		return orientationOf2DPlane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAxis2Placement3D basicGetOrientationOf2DPlane() {
		return orientationOf2DPlane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrientationOf2DPlane(IfcAxis2Placement3D newOrientationOf2DPlane) {
		IfcAxis2Placement3D oldOrientationOf2DPlane = orientationOf2DPlane;
		orientationOf2DPlane = newOrientationOf2DPlane;
		boolean oldOrientationOf2DPlaneESet = orientationOf2DPlaneESet;
		orientationOf2DPlaneESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_ANALYSIS_MODEL__ORIENTATION_OF2_DPLANE, oldOrientationOf2DPlane, orientationOf2DPlane, !oldOrientationOf2DPlaneESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOrientationOf2DPlane() {
		IfcAxis2Placement3D oldOrientationOf2DPlane = orientationOf2DPlane;
		boolean oldOrientationOf2DPlaneESet = orientationOf2DPlaneESet;
		orientationOf2DPlane = null;
		orientationOf2DPlaneESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_ANALYSIS_MODEL__ORIENTATION_OF2_DPLANE, oldOrientationOf2DPlane, null, oldOrientationOf2DPlaneESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOrientationOf2DPlane() {
		return orientationOf2DPlaneESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcStructuralLoadGroup> getLoadedBy() {
		if (loadedBy == null) {
			loadedBy = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse<IfcStructuralLoadGroup>(IfcStructuralLoadGroup.class, this, Ifc2x3tc1Package.IFC_STRUCTURAL_ANALYSIS_MODEL__LOADED_BY, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_GROUP__LOAD_GROUP_FOR);
		}
		return loadedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLoadedBy() {
		if (loadedBy != null) ((InternalEList.Unsettable<?>)loadedBy).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLoadedBy() {
		return loadedBy != null && ((InternalEList.Unsettable<?>)loadedBy).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcStructuralResultGroup> getHasResults() {
		if (hasResults == null) {
			hasResults = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse<IfcStructuralResultGroup>(IfcStructuralResultGroup.class, this, Ifc2x3tc1Package.IFC_STRUCTURAL_ANALYSIS_MODEL__HAS_RESULTS, Ifc2x3tc1Package.IFC_STRUCTURAL_RESULT_GROUP__RESULT_GROUP_FOR);
		}
		return hasResults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHasResults() {
		if (hasResults != null) ((InternalEList.Unsettable<?>)hasResults).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHasResults() {
		return hasResults != null && ((InternalEList.Unsettable<?>)hasResults).isSet();
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_ANALYSIS_MODEL__LOADED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLoadedBy()).basicAdd(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_STRUCTURAL_ANALYSIS_MODEL__HAS_RESULTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasResults()).basicAdd(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_ANALYSIS_MODEL__LOADED_BY:
				return ((InternalEList<?>)getLoadedBy()).basicRemove(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_STRUCTURAL_ANALYSIS_MODEL__HAS_RESULTS:
				return ((InternalEList<?>)getHasResults()).basicRemove(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_ANALYSIS_MODEL__PREDEFINED_TYPE:
				return getPredefinedType();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_ANALYSIS_MODEL__ORIENTATION_OF2_DPLANE:
				if (resolve) return getOrientationOf2DPlane();
				return basicGetOrientationOf2DPlane();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_ANALYSIS_MODEL__LOADED_BY:
				return getLoadedBy();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_ANALYSIS_MODEL__HAS_RESULTS:
				return getHasResults();
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_ANALYSIS_MODEL__PREDEFINED_TYPE:
				setPredefinedType((IfcAnalysisModelTypeEnum)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_ANALYSIS_MODEL__ORIENTATION_OF2_DPLANE:
				setOrientationOf2DPlane((IfcAxis2Placement3D)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_ANALYSIS_MODEL__LOADED_BY:
				getLoadedBy().clear();
				getLoadedBy().addAll((Collection<? extends IfcStructuralLoadGroup>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_ANALYSIS_MODEL__HAS_RESULTS:
				getHasResults().clear();
				getHasResults().addAll((Collection<? extends IfcStructuralResultGroup>)newValue);
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_ANALYSIS_MODEL__PREDEFINED_TYPE:
				setPredefinedType(PREDEFINED_TYPE_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_ANALYSIS_MODEL__ORIENTATION_OF2_DPLANE:
				unsetOrientationOf2DPlane();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_ANALYSIS_MODEL__LOADED_BY:
				unsetLoadedBy();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_ANALYSIS_MODEL__HAS_RESULTS:
				unsetHasResults();
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_ANALYSIS_MODEL__PREDEFINED_TYPE:
				return predefinedType != PREDEFINED_TYPE_EDEFAULT;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_ANALYSIS_MODEL__ORIENTATION_OF2_DPLANE:
				return isSetOrientationOf2DPlane();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_ANALYSIS_MODEL__LOADED_BY:
				return isSetLoadedBy();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_ANALYSIS_MODEL__HAS_RESULTS:
				return isSetHasResults();
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
		result.append(" (PredefinedType: ");
		result.append(predefinedType);
		result.append(')');
		return result.toString();
	}

} //IfcStructuralAnalysisModelImpl
