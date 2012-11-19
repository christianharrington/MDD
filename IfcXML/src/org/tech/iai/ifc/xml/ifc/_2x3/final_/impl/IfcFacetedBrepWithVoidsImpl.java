/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFacetedBrepWithVoids;
import org.tech.iai.ifc.xml.ifc._2x3.final_.VoidsType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Faceted Brep With Voids</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcFacetedBrepWithVoidsImpl#getVoids <em>Voids</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcFacetedBrepWithVoidsImpl extends IfcManifoldSolidBrepImpl implements IfcFacetedBrepWithVoids {
	/**
	 * The cached value of the '{@link #getVoids() <em>Voids</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoids()
	 * @generated
	 * @ordered
	 */
	protected VoidsType voids;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcFacetedBrepWithVoidsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcFacetedBrepWithVoids();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VoidsType getVoids() {
		return voids;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVoids(VoidsType newVoids, NotificationChain msgs) {
		VoidsType oldVoids = voids;
		voids = newVoids;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_FACETED_BREP_WITH_VOIDS__VOIDS, oldVoids, newVoids);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoids(VoidsType newVoids) {
		if (newVoids != voids) {
			NotificationChain msgs = null;
			if (voids != null)
				msgs = ((InternalEObject)voids).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_FACETED_BREP_WITH_VOIDS__VOIDS, null, msgs);
			if (newVoids != null)
				msgs = ((InternalEObject)newVoids).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_FACETED_BREP_WITH_VOIDS__VOIDS, null, msgs);
			msgs = basicSetVoids(newVoids, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_FACETED_BREP_WITH_VOIDS__VOIDS, newVoids, newVoids));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_FACETED_BREP_WITH_VOIDS__VOIDS:
				return basicSetVoids(null, msgs);
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
			case FinalPackage.IFC_FACETED_BREP_WITH_VOIDS__VOIDS:
				return getVoids();
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
			case FinalPackage.IFC_FACETED_BREP_WITH_VOIDS__VOIDS:
				setVoids((VoidsType)newValue);
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
			case FinalPackage.IFC_FACETED_BREP_WITH_VOIDS__VOIDS:
				setVoids((VoidsType)null);
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
			case FinalPackage.IFC_FACETED_BREP_WITH_VOIDS__VOIDS:
				return voids != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcFacetedBrepWithVoidsImpl
