/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcStructuralAction;
import ifc2x3tc1.IfcStructuralReaction;
import ifc2x3tc1.Tristate;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Structural Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralActionImpl#getDestabilizingLoad <em>Destabilizing Load</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralActionImpl#getCausedBy <em>Caused By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcStructuralActionImpl extends IfcStructuralActivityImpl implements IfcStructuralAction {
	/**
	 * The default value of the '{@link #getDestabilizingLoad() <em>Destabilizing Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestabilizingLoad()
	 * @generated
	 * @ordered
	 */
	protected static final Tristate DESTABILIZING_LOAD_EDEFAULT = Tristate.TRUE;

	/**
	 * The cached value of the '{@link #getDestabilizingLoad() <em>Destabilizing Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestabilizingLoad()
	 * @generated
	 * @ordered
	 */
	protected Tristate destabilizingLoad = DESTABILIZING_LOAD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCausedBy() <em>Caused By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCausedBy()
	 * @generated
	 * @ordered
	 */
	protected IfcStructuralReaction causedBy;

	/**
	 * This is true if the Caused By reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean causedByESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcStructuralActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcStructuralAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tristate getDestabilizingLoad() {
		return destabilizingLoad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestabilizingLoad(Tristate newDestabilizingLoad) {
		Tristate oldDestabilizingLoad = destabilizingLoad;
		destabilizingLoad = newDestabilizingLoad == null ? DESTABILIZING_LOAD_EDEFAULT : newDestabilizingLoad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_ACTION__DESTABILIZING_LOAD, oldDestabilizingLoad, destabilizingLoad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralReaction getCausedBy() {
		if (causedBy != null && causedBy.eIsProxy()) {
			InternalEObject oldCausedBy = (InternalEObject)causedBy;
			causedBy = (IfcStructuralReaction)eResolveProxy(oldCausedBy);
			if (causedBy != oldCausedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_STRUCTURAL_ACTION__CAUSED_BY, oldCausedBy, causedBy));
			}
		}
		return causedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralReaction basicGetCausedBy() {
		return causedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCausedBy(IfcStructuralReaction newCausedBy, NotificationChain msgs) {
		IfcStructuralReaction oldCausedBy = causedBy;
		causedBy = newCausedBy;
		boolean oldCausedByESet = causedByESet;
		causedByESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_ACTION__CAUSED_BY, oldCausedBy, newCausedBy, !oldCausedByESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCausedBy(IfcStructuralReaction newCausedBy) {
		if (newCausedBy != causedBy) {
			NotificationChain msgs = null;
			if (causedBy != null)
				msgs = ((InternalEObject)causedBy).eInverseRemove(this, Ifc2x3tc1Package.IFC_STRUCTURAL_REACTION__CAUSES, IfcStructuralReaction.class, msgs);
			if (newCausedBy != null)
				msgs = ((InternalEObject)newCausedBy).eInverseAdd(this, Ifc2x3tc1Package.IFC_STRUCTURAL_REACTION__CAUSES, IfcStructuralReaction.class, msgs);
			msgs = basicSetCausedBy(newCausedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldCausedByESet = causedByESet;
			causedByESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_ACTION__CAUSED_BY, newCausedBy, newCausedBy, !oldCausedByESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetCausedBy(NotificationChain msgs) {
		IfcStructuralReaction oldCausedBy = causedBy;
		causedBy = null;
		boolean oldCausedByESet = causedByESet;
		causedByESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_ACTION__CAUSED_BY, oldCausedBy, null, oldCausedByESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCausedBy() {
		if (causedBy != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)causedBy).eInverseRemove(this, Ifc2x3tc1Package.IFC_STRUCTURAL_REACTION__CAUSES, IfcStructuralReaction.class, msgs);
			msgs = basicUnsetCausedBy(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldCausedByESet = causedByESet;
			causedByESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_ACTION__CAUSED_BY, null, null, oldCausedByESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCausedBy() {
		return causedByESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_STRUCTURAL_ACTION__CAUSED_BY:
				if (causedBy != null)
					msgs = ((InternalEObject)causedBy).eInverseRemove(this, Ifc2x3tc1Package.IFC_STRUCTURAL_REACTION__CAUSES, IfcStructuralReaction.class, msgs);
				return basicSetCausedBy((IfcStructuralReaction)otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_ACTION__CAUSED_BY:
				return basicUnsetCausedBy(msgs);
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_ACTION__DESTABILIZING_LOAD:
				return getDestabilizingLoad();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_ACTION__CAUSED_BY:
				if (resolve) return getCausedBy();
				return basicGetCausedBy();
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_ACTION__DESTABILIZING_LOAD:
				setDestabilizingLoad((Tristate)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_ACTION__CAUSED_BY:
				setCausedBy((IfcStructuralReaction)newValue);
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_ACTION__DESTABILIZING_LOAD:
				setDestabilizingLoad(DESTABILIZING_LOAD_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_ACTION__CAUSED_BY:
				unsetCausedBy();
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_ACTION__DESTABILIZING_LOAD:
				return destabilizingLoad != DESTABILIZING_LOAD_EDEFAULT;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_ACTION__CAUSED_BY:
				return isSetCausedBy();
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
		result.append(" (DestabilizingLoad: ");
		result.append(destabilizingLoad);
		result.append(')');
		return result.toString();
	}

} //IfcStructuralActionImpl
