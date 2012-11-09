/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcActor;
import ifc2x3tc1.IfcActorSelect;
import ifc2x3tc1.IfcRelAssignsToActor;

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
 * An implementation of the model object '<em><b>Ifc Actor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcActorImpl#getTheActor <em>The Actor</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcActorImpl#getIsActingUpon <em>Is Acting Upon</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcActorImpl extends IfcObjectImpl implements IfcActor {
	/**
	 * The cached value of the '{@link #getTheActor() <em>The Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheActor()
	 * @generated
	 * @ordered
	 */
	protected IfcActorSelect theActor;

	/**
	 * The cached value of the '{@link #getIsActingUpon() <em>Is Acting Upon</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsActingUpon()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcRelAssignsToActor> isActingUpon;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcActorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcActor();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcActorSelect getTheActor() {
		if (theActor != null && theActor.eIsProxy()) {
			InternalEObject oldTheActor = (InternalEObject)theActor;
			theActor = (IfcActorSelect)eResolveProxy(oldTheActor);
			if (theActor != oldTheActor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_ACTOR__THE_ACTOR, oldTheActor, theActor));
			}
		}
		return theActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcActorSelect basicGetTheActor() {
		return theActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheActor(IfcActorSelect newTheActor) {
		IfcActorSelect oldTheActor = theActor;
		theActor = newTheActor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ACTOR__THE_ACTOR, oldTheActor, theActor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcRelAssignsToActor> getIsActingUpon() {
		if (isActingUpon == null) {
			isActingUpon = new EObjectWithInverseResolvingEList.Unsettable<IfcRelAssignsToActor>(IfcRelAssignsToActor.class, this, Ifc2x3tc1Package.IFC_ACTOR__IS_ACTING_UPON, Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_ACTOR__RELATING_ACTOR);
		}
		return isActingUpon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsActingUpon() {
		if (isActingUpon != null) ((InternalEList.Unsettable<?>)isActingUpon).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsActingUpon() {
		return isActingUpon != null && ((InternalEList.Unsettable<?>)isActingUpon).isSet();
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
			case Ifc2x3tc1Package.IFC_ACTOR__IS_ACTING_UPON:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsActingUpon()).basicAdd(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_ACTOR__IS_ACTING_UPON:
				return ((InternalEList<?>)getIsActingUpon()).basicRemove(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_ACTOR__THE_ACTOR:
				if (resolve) return getTheActor();
				return basicGetTheActor();
			case Ifc2x3tc1Package.IFC_ACTOR__IS_ACTING_UPON:
				return getIsActingUpon();
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
			case Ifc2x3tc1Package.IFC_ACTOR__THE_ACTOR:
				setTheActor((IfcActorSelect)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ACTOR__IS_ACTING_UPON:
				getIsActingUpon().clear();
				getIsActingUpon().addAll((Collection<? extends IfcRelAssignsToActor>)newValue);
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
			case Ifc2x3tc1Package.IFC_ACTOR__THE_ACTOR:
				setTheActor((IfcActorSelect)null);
				return;
			case Ifc2x3tc1Package.IFC_ACTOR__IS_ACTING_UPON:
				unsetIsActingUpon();
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
			case Ifc2x3tc1Package.IFC_ACTOR__THE_ACTOR:
				return theActor != null;
			case Ifc2x3tc1Package.IFC_ACTOR__IS_ACTING_UPON:
				return isSetIsActingUpon();
		}
		return super.eIsSet(featureID);
	}

} //IfcActorImpl
