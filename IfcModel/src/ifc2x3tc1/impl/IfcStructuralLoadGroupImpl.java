/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcActionSourceTypeEnum;
import ifc2x3tc1.IfcActionTypeEnum;
import ifc2x3tc1.IfcLoadGroupTypeEnum;
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
 * An implementation of the model object '<em><b>Ifc Structural Load Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralLoadGroupImpl#getPredefinedType <em>Predefined Type</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralLoadGroupImpl#getActionType <em>Action Type</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralLoadGroupImpl#getActionSource <em>Action Source</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralLoadGroupImpl#getCoefficient <em>Coefficient</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralLoadGroupImpl#getCoefficientAsString <em>Coefficient As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralLoadGroupImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralLoadGroupImpl#getSourceOfResultGroup <em>Source Of Result Group</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralLoadGroupImpl#getLoadGroupFor <em>Load Group For</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcStructuralLoadGroupImpl extends IfcGroupImpl implements IfcStructuralLoadGroup {
	/**
	 * The default value of the '{@link #getPredefinedType() <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredefinedType()
	 * @generated
	 * @ordered
	 */
	protected static final IfcLoadGroupTypeEnum PREDEFINED_TYPE_EDEFAULT = IfcLoadGroupTypeEnum.NULL;

	/**
	 * The cached value of the '{@link #getPredefinedType() <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredefinedType()
	 * @generated
	 * @ordered
	 */
	protected IfcLoadGroupTypeEnum predefinedType = PREDEFINED_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionType() <em>Action Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionType()
	 * @generated
	 * @ordered
	 */
	protected static final IfcActionTypeEnum ACTION_TYPE_EDEFAULT = IfcActionTypeEnum.NULL;

	/**
	 * The cached value of the '{@link #getActionType() <em>Action Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionType()
	 * @generated
	 * @ordered
	 */
	protected IfcActionTypeEnum actionType = ACTION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionSource() <em>Action Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionSource()
	 * @generated
	 * @ordered
	 */
	protected static final IfcActionSourceTypeEnum ACTION_SOURCE_EDEFAULT = IfcActionSourceTypeEnum.NULL;

	/**
	 * The cached value of the '{@link #getActionSource() <em>Action Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionSource()
	 * @generated
	 * @ordered
	 */
	protected IfcActionSourceTypeEnum actionSource = ACTION_SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCoefficient() <em>Coefficient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoefficient()
	 * @generated
	 * @ordered
	 */
	protected static final double COEFFICIENT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCoefficient() <em>Coefficient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoefficient()
	 * @generated
	 * @ordered
	 */
	protected double coefficient = COEFFICIENT_EDEFAULT;

	/**
	 * This is true if the Coefficient attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean coefficientESet;

	/**
	 * The default value of the '{@link #getCoefficientAsString() <em>Coefficient As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoefficientAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String COEFFICIENT_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCoefficientAsString() <em>Coefficient As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoefficientAsString()
	 * @generated
	 * @ordered
	 */
	protected String coefficientAsString = COEFFICIENT_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Coefficient As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean coefficientAsStringESet;

	/**
	 * The default value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected static final String PURPOSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected String purpose = PURPOSE_EDEFAULT;

	/**
	 * This is true if the Purpose attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean purposeESet;

	/**
	 * The cached value of the '{@link #getSourceOfResultGroup() <em>Source Of Result Group</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceOfResultGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcStructuralResultGroup> sourceOfResultGroup;

	/**
	 * The cached value of the '{@link #getLoadGroupFor() <em>Load Group For</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadGroupFor()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcStructuralAnalysisModel> loadGroupFor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcStructuralLoadGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLoadGroupTypeEnum getPredefinedType() {
		return predefinedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredefinedType(IfcLoadGroupTypeEnum newPredefinedType) {
		IfcLoadGroupTypeEnum oldPredefinedType = predefinedType;
		predefinedType = newPredefinedType == null ? PREDEFINED_TYPE_EDEFAULT : newPredefinedType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_GROUP__PREDEFINED_TYPE, oldPredefinedType, predefinedType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcActionTypeEnum getActionType() {
		return actionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionType(IfcActionTypeEnum newActionType) {
		IfcActionTypeEnum oldActionType = actionType;
		actionType = newActionType == null ? ACTION_TYPE_EDEFAULT : newActionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_GROUP__ACTION_TYPE, oldActionType, actionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcActionSourceTypeEnum getActionSource() {
		return actionSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionSource(IfcActionSourceTypeEnum newActionSource) {
		IfcActionSourceTypeEnum oldActionSource = actionSource;
		actionSource = newActionSource == null ? ACTION_SOURCE_EDEFAULT : newActionSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_GROUP__ACTION_SOURCE, oldActionSource, actionSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCoefficient() {
		return coefficient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoefficient(double newCoefficient) {
		double oldCoefficient = coefficient;
		coefficient = newCoefficient;
		boolean oldCoefficientESet = coefficientESet;
		coefficientESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_GROUP__COEFFICIENT, oldCoefficient, coefficient, !oldCoefficientESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCoefficient() {
		double oldCoefficient = coefficient;
		boolean oldCoefficientESet = coefficientESet;
		coefficient = COEFFICIENT_EDEFAULT;
		coefficientESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_GROUP__COEFFICIENT, oldCoefficient, COEFFICIENT_EDEFAULT, oldCoefficientESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCoefficient() {
		return coefficientESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCoefficientAsString() {
		return coefficientAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoefficientAsString(String newCoefficientAsString) {
		String oldCoefficientAsString = coefficientAsString;
		coefficientAsString = newCoefficientAsString;
		boolean oldCoefficientAsStringESet = coefficientAsStringESet;
		coefficientAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_GROUP__COEFFICIENT_AS_STRING, oldCoefficientAsString, coefficientAsString, !oldCoefficientAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCoefficientAsString() {
		String oldCoefficientAsString = coefficientAsString;
		boolean oldCoefficientAsStringESet = coefficientAsStringESet;
		coefficientAsString = COEFFICIENT_AS_STRING_EDEFAULT;
		coefficientAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_GROUP__COEFFICIENT_AS_STRING, oldCoefficientAsString, COEFFICIENT_AS_STRING_EDEFAULT, oldCoefficientAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCoefficientAsString() {
		return coefficientAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPurpose() {
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPurpose(String newPurpose) {
		String oldPurpose = purpose;
		purpose = newPurpose;
		boolean oldPurposeESet = purposeESet;
		purposeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_GROUP__PURPOSE, oldPurpose, purpose, !oldPurposeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPurpose() {
		String oldPurpose = purpose;
		boolean oldPurposeESet = purposeESet;
		purpose = PURPOSE_EDEFAULT;
		purposeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_GROUP__PURPOSE, oldPurpose, PURPOSE_EDEFAULT, oldPurposeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPurpose() {
		return purposeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcStructuralResultGroup> getSourceOfResultGroup() {
		if (sourceOfResultGroup == null) {
			sourceOfResultGroup = new EObjectWithInverseResolvingEList.Unsettable<IfcStructuralResultGroup>(IfcStructuralResultGroup.class, this, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_GROUP__SOURCE_OF_RESULT_GROUP, Ifc2x3tc1Package.IFC_STRUCTURAL_RESULT_GROUP__RESULT_FOR_LOAD_GROUP);
		}
		return sourceOfResultGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSourceOfResultGroup() {
		if (sourceOfResultGroup != null) ((InternalEList.Unsettable<?>)sourceOfResultGroup).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSourceOfResultGroup() {
		return sourceOfResultGroup != null && ((InternalEList.Unsettable<?>)sourceOfResultGroup).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcStructuralAnalysisModel> getLoadGroupFor() {
		if (loadGroupFor == null) {
			loadGroupFor = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse<IfcStructuralAnalysisModel>(IfcStructuralAnalysisModel.class, this, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_GROUP__LOAD_GROUP_FOR, Ifc2x3tc1Package.IFC_STRUCTURAL_ANALYSIS_MODEL__LOADED_BY);
		}
		return loadGroupFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLoadGroupFor() {
		if (loadGroupFor != null) ((InternalEList.Unsettable<?>)loadGroupFor).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLoadGroupFor() {
		return loadGroupFor != null && ((InternalEList.Unsettable<?>)loadGroupFor).isSet();
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_GROUP__SOURCE_OF_RESULT_GROUP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSourceOfResultGroup()).basicAdd(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_GROUP__LOAD_GROUP_FOR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLoadGroupFor()).basicAdd(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_GROUP__SOURCE_OF_RESULT_GROUP:
				return ((InternalEList<?>)getSourceOfResultGroup()).basicRemove(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_GROUP__LOAD_GROUP_FOR:
				return ((InternalEList<?>)getLoadGroupFor()).basicRemove(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_GROUP__PREDEFINED_TYPE:
				return getPredefinedType();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_GROUP__ACTION_TYPE:
				return getActionType();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_GROUP__ACTION_SOURCE:
				return getActionSource();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_GROUP__COEFFICIENT:
				return getCoefficient();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_GROUP__COEFFICIENT_AS_STRING:
				return getCoefficientAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_GROUP__PURPOSE:
				return getPurpose();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_GROUP__SOURCE_OF_RESULT_GROUP:
				return getSourceOfResultGroup();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_GROUP__LOAD_GROUP_FOR:
				return getLoadGroupFor();
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_GROUP__PREDEFINED_TYPE:
				setPredefinedType((IfcLoadGroupTypeEnum)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_GROUP__ACTION_TYPE:
				setActionType((IfcActionTypeEnum)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_GROUP__ACTION_SOURCE:
				setActionSource((IfcActionSourceTypeEnum)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_GROUP__COEFFICIENT:
				setCoefficient((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_GROUP__COEFFICIENT_AS_STRING:
				setCoefficientAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_GROUP__PURPOSE:
				setPurpose((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_GROUP__SOURCE_OF_RESULT_GROUP:
				getSourceOfResultGroup().clear();
				getSourceOfResultGroup().addAll((Collection<? extends IfcStructuralResultGroup>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_GROUP__LOAD_GROUP_FOR:
				getLoadGroupFor().clear();
				getLoadGroupFor().addAll((Collection<? extends IfcStructuralAnalysisModel>)newValue);
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_GROUP__PREDEFINED_TYPE:
				setPredefinedType(PREDEFINED_TYPE_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_GROUP__ACTION_TYPE:
				setActionType(ACTION_TYPE_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_GROUP__ACTION_SOURCE:
				setActionSource(ACTION_SOURCE_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_GROUP__COEFFICIENT:
				unsetCoefficient();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_GROUP__COEFFICIENT_AS_STRING:
				unsetCoefficientAsString();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_GROUP__PURPOSE:
				unsetPurpose();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_GROUP__SOURCE_OF_RESULT_GROUP:
				unsetSourceOfResultGroup();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_GROUP__LOAD_GROUP_FOR:
				unsetLoadGroupFor();
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_GROUP__PREDEFINED_TYPE:
				return predefinedType != PREDEFINED_TYPE_EDEFAULT;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_GROUP__ACTION_TYPE:
				return actionType != ACTION_TYPE_EDEFAULT;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_GROUP__ACTION_SOURCE:
				return actionSource != ACTION_SOURCE_EDEFAULT;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_GROUP__COEFFICIENT:
				return isSetCoefficient();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_GROUP__COEFFICIENT_AS_STRING:
				return isSetCoefficientAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_GROUP__PURPOSE:
				return isSetPurpose();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_GROUP__SOURCE_OF_RESULT_GROUP:
				return isSetSourceOfResultGroup();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_GROUP__LOAD_GROUP_FOR:
				return isSetLoadGroupFor();
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
		result.append(", ActionType: ");
		result.append(actionType);
		result.append(", ActionSource: ");
		result.append(actionSource);
		result.append(", Coefficient: ");
		if (coefficientESet) result.append(coefficient); else result.append("<unset>");
		result.append(", CoefficientAsString: ");
		if (coefficientAsStringESet) result.append(coefficientAsString); else result.append("<unset>");
		result.append(", Purpose: ");
		if (purposeESet) result.append(purpose); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcStructuralLoadGroupImpl
