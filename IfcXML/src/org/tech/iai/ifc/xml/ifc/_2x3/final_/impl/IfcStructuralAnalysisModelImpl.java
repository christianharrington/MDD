/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.HasResultsType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAnalysisModelTypeEnum;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralAnalysisModel;
import org.tech.iai.ifc.xml.ifc._2x3.final_.LoadedByType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.OrientationOf2DPlaneType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Structural Analysis Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcStructuralAnalysisModelImpl#getPredefinedType <em>Predefined Type</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcStructuralAnalysisModelImpl#getOrientationOf2DPlane <em>Orientation Of2 DPlane</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcStructuralAnalysisModelImpl#getLoadedBy <em>Loaded By</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcStructuralAnalysisModelImpl#getHasResults <em>Has Results</em>}</li>
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
	protected static final IfcAnalysisModelTypeEnum PREDEFINED_TYPE_EDEFAULT = IfcAnalysisModelTypeEnum.IN_PLANE_LOADING2D;

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
	 * The cached value of the '{@link #getOrientationOf2DPlane() <em>Orientation Of2 DPlane</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientationOf2DPlane()
	 * @generated
	 * @ordered
	 */
	protected OrientationOf2DPlaneType orientationOf2DPlane;

	/**
	 * The cached value of the '{@link #getLoadedBy() <em>Loaded By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadedBy()
	 * @generated
	 * @ordered
	 */
	protected LoadedByType loadedBy;

	/**
	 * The cached value of the '{@link #getHasResults() <em>Has Results</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasResults()
	 * @generated
	 * @ordered
	 */
	protected HasResultsType hasResults;

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
		return FinalPackage.eINSTANCE.getIfcStructuralAnalysisModel();
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_ANALYSIS_MODEL__PREDEFINED_TYPE, oldPredefinedType, predefinedType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrientationOf2DPlaneType getOrientationOf2DPlane() {
		return orientationOf2DPlane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrientationOf2DPlane(OrientationOf2DPlaneType newOrientationOf2DPlane, NotificationChain msgs) {
		OrientationOf2DPlaneType oldOrientationOf2DPlane = orientationOf2DPlane;
		orientationOf2DPlane = newOrientationOf2DPlane;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_ANALYSIS_MODEL__ORIENTATION_OF2_DPLANE, oldOrientationOf2DPlane, newOrientationOf2DPlane);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrientationOf2DPlane(OrientationOf2DPlaneType newOrientationOf2DPlane) {
		if (newOrientationOf2DPlane != orientationOf2DPlane) {
			NotificationChain msgs = null;
			if (orientationOf2DPlane != null)
				msgs = ((InternalEObject)orientationOf2DPlane).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_STRUCTURAL_ANALYSIS_MODEL__ORIENTATION_OF2_DPLANE, null, msgs);
			if (newOrientationOf2DPlane != null)
				msgs = ((InternalEObject)newOrientationOf2DPlane).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_STRUCTURAL_ANALYSIS_MODEL__ORIENTATION_OF2_DPLANE, null, msgs);
			msgs = basicSetOrientationOf2DPlane(newOrientationOf2DPlane, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_ANALYSIS_MODEL__ORIENTATION_OF2_DPLANE, newOrientationOf2DPlane, newOrientationOf2DPlane));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadedByType getLoadedBy() {
		return loadedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoadedBy(LoadedByType newLoadedBy, NotificationChain msgs) {
		LoadedByType oldLoadedBy = loadedBy;
		loadedBy = newLoadedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_ANALYSIS_MODEL__LOADED_BY, oldLoadedBy, newLoadedBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoadedBy(LoadedByType newLoadedBy) {
		if (newLoadedBy != loadedBy) {
			NotificationChain msgs = null;
			if (loadedBy != null)
				msgs = ((InternalEObject)loadedBy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_STRUCTURAL_ANALYSIS_MODEL__LOADED_BY, null, msgs);
			if (newLoadedBy != null)
				msgs = ((InternalEObject)newLoadedBy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_STRUCTURAL_ANALYSIS_MODEL__LOADED_BY, null, msgs);
			msgs = basicSetLoadedBy(newLoadedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_ANALYSIS_MODEL__LOADED_BY, newLoadedBy, newLoadedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HasResultsType getHasResults() {
		return hasResults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasResults(HasResultsType newHasResults, NotificationChain msgs) {
		HasResultsType oldHasResults = hasResults;
		hasResults = newHasResults;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_ANALYSIS_MODEL__HAS_RESULTS, oldHasResults, newHasResults);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasResults(HasResultsType newHasResults) {
		if (newHasResults != hasResults) {
			NotificationChain msgs = null;
			if (hasResults != null)
				msgs = ((InternalEObject)hasResults).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_STRUCTURAL_ANALYSIS_MODEL__HAS_RESULTS, null, msgs);
			if (newHasResults != null)
				msgs = ((InternalEObject)newHasResults).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_STRUCTURAL_ANALYSIS_MODEL__HAS_RESULTS, null, msgs);
			msgs = basicSetHasResults(newHasResults, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_ANALYSIS_MODEL__HAS_RESULTS, newHasResults, newHasResults));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_STRUCTURAL_ANALYSIS_MODEL__ORIENTATION_OF2_DPLANE:
				return basicSetOrientationOf2DPlane(null, msgs);
			case FinalPackage.IFC_STRUCTURAL_ANALYSIS_MODEL__LOADED_BY:
				return basicSetLoadedBy(null, msgs);
			case FinalPackage.IFC_STRUCTURAL_ANALYSIS_MODEL__HAS_RESULTS:
				return basicSetHasResults(null, msgs);
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
			case FinalPackage.IFC_STRUCTURAL_ANALYSIS_MODEL__PREDEFINED_TYPE:
				return getPredefinedType();
			case FinalPackage.IFC_STRUCTURAL_ANALYSIS_MODEL__ORIENTATION_OF2_DPLANE:
				return getOrientationOf2DPlane();
			case FinalPackage.IFC_STRUCTURAL_ANALYSIS_MODEL__LOADED_BY:
				return getLoadedBy();
			case FinalPackage.IFC_STRUCTURAL_ANALYSIS_MODEL__HAS_RESULTS:
				return getHasResults();
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
			case FinalPackage.IFC_STRUCTURAL_ANALYSIS_MODEL__PREDEFINED_TYPE:
				setPredefinedType((IfcAnalysisModelTypeEnum)newValue);
				return;
			case FinalPackage.IFC_STRUCTURAL_ANALYSIS_MODEL__ORIENTATION_OF2_DPLANE:
				setOrientationOf2DPlane((OrientationOf2DPlaneType)newValue);
				return;
			case FinalPackage.IFC_STRUCTURAL_ANALYSIS_MODEL__LOADED_BY:
				setLoadedBy((LoadedByType)newValue);
				return;
			case FinalPackage.IFC_STRUCTURAL_ANALYSIS_MODEL__HAS_RESULTS:
				setHasResults((HasResultsType)newValue);
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
			case FinalPackage.IFC_STRUCTURAL_ANALYSIS_MODEL__PREDEFINED_TYPE:
				setPredefinedType(PREDEFINED_TYPE_EDEFAULT);
				return;
			case FinalPackage.IFC_STRUCTURAL_ANALYSIS_MODEL__ORIENTATION_OF2_DPLANE:
				setOrientationOf2DPlane((OrientationOf2DPlaneType)null);
				return;
			case FinalPackage.IFC_STRUCTURAL_ANALYSIS_MODEL__LOADED_BY:
				setLoadedBy((LoadedByType)null);
				return;
			case FinalPackage.IFC_STRUCTURAL_ANALYSIS_MODEL__HAS_RESULTS:
				setHasResults((HasResultsType)null);
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
			case FinalPackage.IFC_STRUCTURAL_ANALYSIS_MODEL__PREDEFINED_TYPE:
				return predefinedType != PREDEFINED_TYPE_EDEFAULT;
			case FinalPackage.IFC_STRUCTURAL_ANALYSIS_MODEL__ORIENTATION_OF2_DPLANE:
				return orientationOf2DPlane != null;
			case FinalPackage.IFC_STRUCTURAL_ANALYSIS_MODEL__LOADED_BY:
				return loadedBy != null;
			case FinalPackage.IFC_STRUCTURAL_ANALYSIS_MODEL__HAS_RESULTS:
				return hasResults != null;
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
		result.append(" (predefinedType: ");
		result.append(predefinedType);
		result.append(')');
		return result.toString();
	}

} //IfcStructuralAnalysisModelImpl
