/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcGlobalOrLocalEnum;
import ifc2x3tc1.IfcRelConnectsStructuralActivity;
import ifc2x3tc1.IfcStructuralActivity;
import ifc2x3tc1.IfcStructuralLoad;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Structural Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralActivityImpl#getAppliedLoad <em>Applied Load</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralActivityImpl#getGlobalOrLocal <em>Global Or Local</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralActivityImpl#getAssignedToStructuralItem <em>Assigned To Structural Item</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcStructuralActivityImpl extends IfcProductImpl implements IfcStructuralActivity {
	/**
	 * The cached value of the '{@link #getAppliedLoad() <em>Applied Load</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliedLoad()
	 * @generated
	 * @ordered
	 */
	protected IfcStructuralLoad appliedLoad;

	/**
	 * The default value of the '{@link #getGlobalOrLocal() <em>Global Or Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalOrLocal()
	 * @generated
	 * @ordered
	 */
	protected static final IfcGlobalOrLocalEnum GLOBAL_OR_LOCAL_EDEFAULT = IfcGlobalOrLocalEnum.NULL;

	/**
	 * The cached value of the '{@link #getGlobalOrLocal() <em>Global Or Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalOrLocal()
	 * @generated
	 * @ordered
	 */
	protected IfcGlobalOrLocalEnum globalOrLocal = GLOBAL_OR_LOCAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssignedToStructuralItem() <em>Assigned To Structural Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedToStructuralItem()
	 * @generated
	 * @ordered
	 */
	protected IfcRelConnectsStructuralActivity assignedToStructuralItem;

	/**
	 * This is true if the Assigned To Structural Item reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean assignedToStructuralItemESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcStructuralActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcStructuralActivity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralLoad getAppliedLoad() {
		if (appliedLoad != null && appliedLoad.eIsProxy()) {
			InternalEObject oldAppliedLoad = (InternalEObject)appliedLoad;
			appliedLoad = (IfcStructuralLoad)eResolveProxy(oldAppliedLoad);
			if (appliedLoad != oldAppliedLoad) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_STRUCTURAL_ACTIVITY__APPLIED_LOAD, oldAppliedLoad, appliedLoad));
			}
		}
		return appliedLoad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralLoad basicGetAppliedLoad() {
		return appliedLoad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppliedLoad(IfcStructuralLoad newAppliedLoad) {
		IfcStructuralLoad oldAppliedLoad = appliedLoad;
		appliedLoad = newAppliedLoad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_ACTIVITY__APPLIED_LOAD, oldAppliedLoad, appliedLoad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcGlobalOrLocalEnum getGlobalOrLocal() {
		return globalOrLocal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobalOrLocal(IfcGlobalOrLocalEnum newGlobalOrLocal) {
		IfcGlobalOrLocalEnum oldGlobalOrLocal = globalOrLocal;
		globalOrLocal = newGlobalOrLocal == null ? GLOBAL_OR_LOCAL_EDEFAULT : newGlobalOrLocal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_ACTIVITY__GLOBAL_OR_LOCAL, oldGlobalOrLocal, globalOrLocal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelConnectsStructuralActivity getAssignedToStructuralItem() {
		if (assignedToStructuralItem != null && assignedToStructuralItem.eIsProxy()) {
			InternalEObject oldAssignedToStructuralItem = (InternalEObject)assignedToStructuralItem;
			assignedToStructuralItem = (IfcRelConnectsStructuralActivity)eResolveProxy(oldAssignedToStructuralItem);
			if (assignedToStructuralItem != oldAssignedToStructuralItem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_STRUCTURAL_ACTIVITY__ASSIGNED_TO_STRUCTURAL_ITEM, oldAssignedToStructuralItem, assignedToStructuralItem));
			}
		}
		return assignedToStructuralItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelConnectsStructuralActivity basicGetAssignedToStructuralItem() {
		return assignedToStructuralItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssignedToStructuralItem(IfcRelConnectsStructuralActivity newAssignedToStructuralItem, NotificationChain msgs) {
		IfcRelConnectsStructuralActivity oldAssignedToStructuralItem = assignedToStructuralItem;
		assignedToStructuralItem = newAssignedToStructuralItem;
		boolean oldAssignedToStructuralItemESet = assignedToStructuralItemESet;
		assignedToStructuralItemESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_ACTIVITY__ASSIGNED_TO_STRUCTURAL_ITEM, oldAssignedToStructuralItem, newAssignedToStructuralItem, !oldAssignedToStructuralItemESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignedToStructuralItem(IfcRelConnectsStructuralActivity newAssignedToStructuralItem) {
		if (newAssignedToStructuralItem != assignedToStructuralItem) {
			NotificationChain msgs = null;
			if (assignedToStructuralItem != null)
				msgs = ((InternalEObject)assignedToStructuralItem).eInverseRemove(this, Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_ACTIVITY__RELATED_STRUCTURAL_ACTIVITY, IfcRelConnectsStructuralActivity.class, msgs);
			if (newAssignedToStructuralItem != null)
				msgs = ((InternalEObject)newAssignedToStructuralItem).eInverseAdd(this, Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_ACTIVITY__RELATED_STRUCTURAL_ACTIVITY, IfcRelConnectsStructuralActivity.class, msgs);
			msgs = basicSetAssignedToStructuralItem(newAssignedToStructuralItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldAssignedToStructuralItemESet = assignedToStructuralItemESet;
			assignedToStructuralItemESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_ACTIVITY__ASSIGNED_TO_STRUCTURAL_ITEM, newAssignedToStructuralItem, newAssignedToStructuralItem, !oldAssignedToStructuralItemESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetAssignedToStructuralItem(NotificationChain msgs) {
		IfcRelConnectsStructuralActivity oldAssignedToStructuralItem = assignedToStructuralItem;
		assignedToStructuralItem = null;
		boolean oldAssignedToStructuralItemESet = assignedToStructuralItemESet;
		assignedToStructuralItemESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_ACTIVITY__ASSIGNED_TO_STRUCTURAL_ITEM, oldAssignedToStructuralItem, null, oldAssignedToStructuralItemESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAssignedToStructuralItem() {
		if (assignedToStructuralItem != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)assignedToStructuralItem).eInverseRemove(this, Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_ACTIVITY__RELATED_STRUCTURAL_ACTIVITY, IfcRelConnectsStructuralActivity.class, msgs);
			msgs = basicUnsetAssignedToStructuralItem(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldAssignedToStructuralItemESet = assignedToStructuralItemESet;
			assignedToStructuralItemESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_ACTIVITY__ASSIGNED_TO_STRUCTURAL_ITEM, null, null, oldAssignedToStructuralItemESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAssignedToStructuralItem() {
		return assignedToStructuralItemESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_STRUCTURAL_ACTIVITY__ASSIGNED_TO_STRUCTURAL_ITEM:
				if (assignedToStructuralItem != null)
					msgs = ((InternalEObject)assignedToStructuralItem).eInverseRemove(this, Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_ACTIVITY__RELATED_STRUCTURAL_ACTIVITY, IfcRelConnectsStructuralActivity.class, msgs);
				return basicSetAssignedToStructuralItem((IfcRelConnectsStructuralActivity)otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_ACTIVITY__ASSIGNED_TO_STRUCTURAL_ITEM:
				return basicUnsetAssignedToStructuralItem(msgs);
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_ACTIVITY__APPLIED_LOAD:
				if (resolve) return getAppliedLoad();
				return basicGetAppliedLoad();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_ACTIVITY__GLOBAL_OR_LOCAL:
				return getGlobalOrLocal();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_ACTIVITY__ASSIGNED_TO_STRUCTURAL_ITEM:
				if (resolve) return getAssignedToStructuralItem();
				return basicGetAssignedToStructuralItem();
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_ACTIVITY__APPLIED_LOAD:
				setAppliedLoad((IfcStructuralLoad)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_ACTIVITY__GLOBAL_OR_LOCAL:
				setGlobalOrLocal((IfcGlobalOrLocalEnum)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_ACTIVITY__ASSIGNED_TO_STRUCTURAL_ITEM:
				setAssignedToStructuralItem((IfcRelConnectsStructuralActivity)newValue);
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_ACTIVITY__APPLIED_LOAD:
				setAppliedLoad((IfcStructuralLoad)null);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_ACTIVITY__GLOBAL_OR_LOCAL:
				setGlobalOrLocal(GLOBAL_OR_LOCAL_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_ACTIVITY__ASSIGNED_TO_STRUCTURAL_ITEM:
				unsetAssignedToStructuralItem();
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_ACTIVITY__APPLIED_LOAD:
				return appliedLoad != null;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_ACTIVITY__GLOBAL_OR_LOCAL:
				return globalOrLocal != GLOBAL_OR_LOCAL_EDEFAULT;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_ACTIVITY__ASSIGNED_TO_STRUCTURAL_ITEM:
				return isSetAssignedToStructuralItem();
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
		result.append(" (GlobalOrLocal: ");
		result.append(globalOrLocal);
		result.append(')');
		return result.toString();
	}

} //IfcStructuralActivityImpl
