/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcAnalysisTheoryTypeEnum;
import ifc2x3tc1.IfcStructuralAnalysisModel;
import ifc2x3tc1.IfcStructuralLoadGroup;
import ifc2x3tc1.IfcStructuralResultGroup;
import ifc2x3tc1.Tristate;

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
 * An implementation of the model object '<em><b>Ifc Structural Result Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralResultGroupImpl#getTheoryType <em>Theory Type</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralResultGroupImpl#getResultForLoadGroup <em>Result For Load Group</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralResultGroupImpl#getIsLinear <em>Is Linear</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralResultGroupImpl#getResultGroupFor <em>Result Group For</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcStructuralResultGroupImpl extends IfcGroupImpl implements IfcStructuralResultGroup {
	/**
	 * The default value of the '{@link #getTheoryType() <em>Theory Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheoryType()
	 * @generated
	 * @ordered
	 */
	protected static final IfcAnalysisTheoryTypeEnum THEORY_TYPE_EDEFAULT = IfcAnalysisTheoryTypeEnum.NULL;

	/**
	 * The cached value of the '{@link #getTheoryType() <em>Theory Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheoryType()
	 * @generated
	 * @ordered
	 */
	protected IfcAnalysisTheoryTypeEnum theoryType = THEORY_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResultForLoadGroup() <em>Result For Load Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultForLoadGroup()
	 * @generated
	 * @ordered
	 */
	protected IfcStructuralLoadGroup resultForLoadGroup;

	/**
	 * This is true if the Result For Load Group reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean resultForLoadGroupESet;

	/**
	 * The default value of the '{@link #getIsLinear() <em>Is Linear</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsLinear()
	 * @generated
	 * @ordered
	 */
	protected static final Tristate IS_LINEAR_EDEFAULT = Tristate.TRUE;

	/**
	 * The cached value of the '{@link #getIsLinear() <em>Is Linear</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsLinear()
	 * @generated
	 * @ordered
	 */
	protected Tristate isLinear = IS_LINEAR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResultGroupFor() <em>Result Group For</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultGroupFor()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcStructuralAnalysisModel> resultGroupFor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcStructuralResultGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcStructuralResultGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAnalysisTheoryTypeEnum getTheoryType() {
		return theoryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheoryType(IfcAnalysisTheoryTypeEnum newTheoryType) {
		IfcAnalysisTheoryTypeEnum oldTheoryType = theoryType;
		theoryType = newTheoryType == null ? THEORY_TYPE_EDEFAULT : newTheoryType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_RESULT_GROUP__THEORY_TYPE, oldTheoryType, theoryType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralLoadGroup getResultForLoadGroup() {
		if (resultForLoadGroup != null && resultForLoadGroup.eIsProxy()) {
			InternalEObject oldResultForLoadGroup = (InternalEObject)resultForLoadGroup;
			resultForLoadGroup = (IfcStructuralLoadGroup)eResolveProxy(oldResultForLoadGroup);
			if (resultForLoadGroup != oldResultForLoadGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_STRUCTURAL_RESULT_GROUP__RESULT_FOR_LOAD_GROUP, oldResultForLoadGroup, resultForLoadGroup));
			}
		}
		return resultForLoadGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralLoadGroup basicGetResultForLoadGroup() {
		return resultForLoadGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResultForLoadGroup(IfcStructuralLoadGroup newResultForLoadGroup, NotificationChain msgs) {
		IfcStructuralLoadGroup oldResultForLoadGroup = resultForLoadGroup;
		resultForLoadGroup = newResultForLoadGroup;
		boolean oldResultForLoadGroupESet = resultForLoadGroupESet;
		resultForLoadGroupESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_RESULT_GROUP__RESULT_FOR_LOAD_GROUP, oldResultForLoadGroup, newResultForLoadGroup, !oldResultForLoadGroupESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultForLoadGroup(IfcStructuralLoadGroup newResultForLoadGroup) {
		if (newResultForLoadGroup != resultForLoadGroup) {
			NotificationChain msgs = null;
			if (resultForLoadGroup != null)
				msgs = ((InternalEObject)resultForLoadGroup).eInverseRemove(this, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_GROUP__SOURCE_OF_RESULT_GROUP, IfcStructuralLoadGroup.class, msgs);
			if (newResultForLoadGroup != null)
				msgs = ((InternalEObject)newResultForLoadGroup).eInverseAdd(this, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_GROUP__SOURCE_OF_RESULT_GROUP, IfcStructuralLoadGroup.class, msgs);
			msgs = basicSetResultForLoadGroup(newResultForLoadGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldResultForLoadGroupESet = resultForLoadGroupESet;
			resultForLoadGroupESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_RESULT_GROUP__RESULT_FOR_LOAD_GROUP, newResultForLoadGroup, newResultForLoadGroup, !oldResultForLoadGroupESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetResultForLoadGroup(NotificationChain msgs) {
		IfcStructuralLoadGroup oldResultForLoadGroup = resultForLoadGroup;
		resultForLoadGroup = null;
		boolean oldResultForLoadGroupESet = resultForLoadGroupESet;
		resultForLoadGroupESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_RESULT_GROUP__RESULT_FOR_LOAD_GROUP, oldResultForLoadGroup, null, oldResultForLoadGroupESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetResultForLoadGroup() {
		if (resultForLoadGroup != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)resultForLoadGroup).eInverseRemove(this, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_GROUP__SOURCE_OF_RESULT_GROUP, IfcStructuralLoadGroup.class, msgs);
			msgs = basicUnsetResultForLoadGroup(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldResultForLoadGroupESet = resultForLoadGroupESet;
			resultForLoadGroupESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_RESULT_GROUP__RESULT_FOR_LOAD_GROUP, null, null, oldResultForLoadGroupESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetResultForLoadGroup() {
		return resultForLoadGroupESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tristate getIsLinear() {
		return isLinear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLinear(Tristate newIsLinear) {
		Tristate oldIsLinear = isLinear;
		isLinear = newIsLinear == null ? IS_LINEAR_EDEFAULT : newIsLinear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_RESULT_GROUP__IS_LINEAR, oldIsLinear, isLinear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcStructuralAnalysisModel> getResultGroupFor() {
		if (resultGroupFor == null) {
			resultGroupFor = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse<IfcStructuralAnalysisModel>(IfcStructuralAnalysisModel.class, this, Ifc2x3tc1Package.IFC_STRUCTURAL_RESULT_GROUP__RESULT_GROUP_FOR, Ifc2x3tc1Package.IFC_STRUCTURAL_ANALYSIS_MODEL__HAS_RESULTS);
		}
		return resultGroupFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetResultGroupFor() {
		if (resultGroupFor != null) ((InternalEList.Unsettable<?>)resultGroupFor).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetResultGroupFor() {
		return resultGroupFor != null && ((InternalEList.Unsettable<?>)resultGroupFor).isSet();
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_RESULT_GROUP__RESULT_FOR_LOAD_GROUP:
				if (resultForLoadGroup != null)
					msgs = ((InternalEObject)resultForLoadGroup).eInverseRemove(this, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_GROUP__SOURCE_OF_RESULT_GROUP, IfcStructuralLoadGroup.class, msgs);
				return basicSetResultForLoadGroup((IfcStructuralLoadGroup)otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_STRUCTURAL_RESULT_GROUP__RESULT_GROUP_FOR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResultGroupFor()).basicAdd(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_RESULT_GROUP__RESULT_FOR_LOAD_GROUP:
				return basicUnsetResultForLoadGroup(msgs);
			case Ifc2x3tc1Package.IFC_STRUCTURAL_RESULT_GROUP__RESULT_GROUP_FOR:
				return ((InternalEList<?>)getResultGroupFor()).basicRemove(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_RESULT_GROUP__THEORY_TYPE:
				return getTheoryType();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_RESULT_GROUP__RESULT_FOR_LOAD_GROUP:
				if (resolve) return getResultForLoadGroup();
				return basicGetResultForLoadGroup();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_RESULT_GROUP__IS_LINEAR:
				return getIsLinear();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_RESULT_GROUP__RESULT_GROUP_FOR:
				return getResultGroupFor();
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_RESULT_GROUP__THEORY_TYPE:
				setTheoryType((IfcAnalysisTheoryTypeEnum)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_RESULT_GROUP__RESULT_FOR_LOAD_GROUP:
				setResultForLoadGroup((IfcStructuralLoadGroup)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_RESULT_GROUP__IS_LINEAR:
				setIsLinear((Tristate)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_RESULT_GROUP__RESULT_GROUP_FOR:
				getResultGroupFor().clear();
				getResultGroupFor().addAll((Collection<? extends IfcStructuralAnalysisModel>)newValue);
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_RESULT_GROUP__THEORY_TYPE:
				setTheoryType(THEORY_TYPE_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_RESULT_GROUP__RESULT_FOR_LOAD_GROUP:
				unsetResultForLoadGroup();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_RESULT_GROUP__IS_LINEAR:
				setIsLinear(IS_LINEAR_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_RESULT_GROUP__RESULT_GROUP_FOR:
				unsetResultGroupFor();
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_RESULT_GROUP__THEORY_TYPE:
				return theoryType != THEORY_TYPE_EDEFAULT;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_RESULT_GROUP__RESULT_FOR_LOAD_GROUP:
				return isSetResultForLoadGroup();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_RESULT_GROUP__IS_LINEAR:
				return isLinear != IS_LINEAR_EDEFAULT;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_RESULT_GROUP__RESULT_GROUP_FOR:
				return isSetResultGroupFor();
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
		result.append(" (TheoryType: ");
		result.append(theoryType);
		result.append(", IsLinear: ");
		result.append(isLinear);
		result.append(')');
		return result.toString();
	}

} //IfcStructuralResultGroupImpl
