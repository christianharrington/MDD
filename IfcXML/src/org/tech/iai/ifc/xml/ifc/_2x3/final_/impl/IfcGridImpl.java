/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcGrid;
import org.tech.iai.ifc.xml.ifc._2x3.final_.UAxesType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.VAxesType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.WAxesType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Grid</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcGridImpl#getUAxes <em>UAxes</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcGridImpl#getVAxes <em>VAxes</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcGridImpl#getWAxes <em>WAxes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcGridImpl extends IfcProductImpl implements IfcGrid {
	/**
	 * The cached value of the '{@link #getUAxes() <em>UAxes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUAxes()
	 * @generated
	 * @ordered
	 */
	protected UAxesType uAxes;

	/**
	 * The cached value of the '{@link #getVAxes() <em>VAxes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVAxes()
	 * @generated
	 * @ordered
	 */
	protected VAxesType vAxes;

	/**
	 * The cached value of the '{@link #getWAxes() <em>WAxes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWAxes()
	 * @generated
	 * @ordered
	 */
	protected WAxesType wAxes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcGridImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcGrid();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UAxesType getUAxes() {
		return uAxes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUAxes(UAxesType newUAxes, NotificationChain msgs) {
		UAxesType oldUAxes = uAxes;
		uAxes = newUAxes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_GRID__UAXES, oldUAxes, newUAxes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUAxes(UAxesType newUAxes) {
		if (newUAxes != uAxes) {
			NotificationChain msgs = null;
			if (uAxes != null)
				msgs = ((InternalEObject)uAxes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_GRID__UAXES, null, msgs);
			if (newUAxes != null)
				msgs = ((InternalEObject)newUAxes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_GRID__UAXES, null, msgs);
			msgs = basicSetUAxes(newUAxes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_GRID__UAXES, newUAxes, newUAxes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VAxesType getVAxes() {
		return vAxes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVAxes(VAxesType newVAxes, NotificationChain msgs) {
		VAxesType oldVAxes = vAxes;
		vAxes = newVAxes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_GRID__VAXES, oldVAxes, newVAxes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVAxes(VAxesType newVAxes) {
		if (newVAxes != vAxes) {
			NotificationChain msgs = null;
			if (vAxes != null)
				msgs = ((InternalEObject)vAxes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_GRID__VAXES, null, msgs);
			if (newVAxes != null)
				msgs = ((InternalEObject)newVAxes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_GRID__VAXES, null, msgs);
			msgs = basicSetVAxes(newVAxes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_GRID__VAXES, newVAxes, newVAxes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WAxesType getWAxes() {
		return wAxes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWAxes(WAxesType newWAxes, NotificationChain msgs) {
		WAxesType oldWAxes = wAxes;
		wAxes = newWAxes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_GRID__WAXES, oldWAxes, newWAxes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWAxes(WAxesType newWAxes) {
		if (newWAxes != wAxes) {
			NotificationChain msgs = null;
			if (wAxes != null)
				msgs = ((InternalEObject)wAxes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_GRID__WAXES, null, msgs);
			if (newWAxes != null)
				msgs = ((InternalEObject)newWAxes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_GRID__WAXES, null, msgs);
			msgs = basicSetWAxes(newWAxes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_GRID__WAXES, newWAxes, newWAxes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_GRID__UAXES:
				return basicSetUAxes(null, msgs);
			case FinalPackage.IFC_GRID__VAXES:
				return basicSetVAxes(null, msgs);
			case FinalPackage.IFC_GRID__WAXES:
				return basicSetWAxes(null, msgs);
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
			case FinalPackage.IFC_GRID__UAXES:
				return getUAxes();
			case FinalPackage.IFC_GRID__VAXES:
				return getVAxes();
			case FinalPackage.IFC_GRID__WAXES:
				return getWAxes();
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
			case FinalPackage.IFC_GRID__UAXES:
				setUAxes((UAxesType)newValue);
				return;
			case FinalPackage.IFC_GRID__VAXES:
				setVAxes((VAxesType)newValue);
				return;
			case FinalPackage.IFC_GRID__WAXES:
				setWAxes((WAxesType)newValue);
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
			case FinalPackage.IFC_GRID__UAXES:
				setUAxes((UAxesType)null);
				return;
			case FinalPackage.IFC_GRID__VAXES:
				setVAxes((VAxesType)null);
				return;
			case FinalPackage.IFC_GRID__WAXES:
				setWAxes((WAxesType)null);
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
			case FinalPackage.IFC_GRID__UAXES:
				return uAxes != null;
			case FinalPackage.IFC_GRID__VAXES:
				return vAxes != null;
			case FinalPackage.IFC_GRID__WAXES:
				return wAxes != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcGridImpl
