/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcColourRgb;
import org.tech.iai.ifc.xml.ifc._2x3.final_.ReflectanceColourType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reflectance Colour Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ReflectanceColourTypeImpl#getIfcColourRgb <em>Ifc Colour Rgb</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReflectanceColourTypeImpl extends EObjectImpl implements ReflectanceColourType {
	/**
	 * The cached value of the '{@link #getIfcColourRgb() <em>Ifc Colour Rgb</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcColourRgb()
	 * @generated
	 * @ordered
	 */
	protected IfcColourRgb ifcColourRgb;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReflectanceColourTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getReflectanceColourType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcColourRgb getIfcColourRgb() {
		return ifcColourRgb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcColourRgb(IfcColourRgb newIfcColourRgb, NotificationChain msgs) {
		IfcColourRgb oldIfcColourRgb = ifcColourRgb;
		ifcColourRgb = newIfcColourRgb;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.REFLECTANCE_COLOUR_TYPE__IFC_COLOUR_RGB, oldIfcColourRgb, newIfcColourRgb);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcColourRgb(IfcColourRgb newIfcColourRgb) {
		if (newIfcColourRgb != ifcColourRgb) {
			NotificationChain msgs = null;
			if (ifcColourRgb != null)
				msgs = ((InternalEObject)ifcColourRgb).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.REFLECTANCE_COLOUR_TYPE__IFC_COLOUR_RGB, null, msgs);
			if (newIfcColourRgb != null)
				msgs = ((InternalEObject)newIfcColourRgb).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.REFLECTANCE_COLOUR_TYPE__IFC_COLOUR_RGB, null, msgs);
			msgs = basicSetIfcColourRgb(newIfcColourRgb, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.REFLECTANCE_COLOUR_TYPE__IFC_COLOUR_RGB, newIfcColourRgb, newIfcColourRgb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.REFLECTANCE_COLOUR_TYPE__IFC_COLOUR_RGB:
				return basicSetIfcColourRgb(null, msgs);
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
			case FinalPackage.REFLECTANCE_COLOUR_TYPE__IFC_COLOUR_RGB:
				return getIfcColourRgb();
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
			case FinalPackage.REFLECTANCE_COLOUR_TYPE__IFC_COLOUR_RGB:
				setIfcColourRgb((IfcColourRgb)newValue);
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
			case FinalPackage.REFLECTANCE_COLOUR_TYPE__IFC_COLOUR_RGB:
				setIfcColourRgb((IfcColourRgb)null);
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
			case FinalPackage.REFLECTANCE_COLOUR_TYPE__IFC_COLOUR_RGB:
				return ifcColourRgb != null;
		}
		return super.eIsSet(featureID);
	}

} //ReflectanceColourTypeImpl
