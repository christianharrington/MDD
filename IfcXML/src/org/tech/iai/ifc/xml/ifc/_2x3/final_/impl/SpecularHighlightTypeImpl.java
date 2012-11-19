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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSpecularExponentType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSpecularRoughnessType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.SpecularHighlightType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specular Highlight Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.SpecularHighlightTypeImpl#getIfcSpecularExponent <em>Ifc Specular Exponent</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.SpecularHighlightTypeImpl#getIfcSpecularRoughness <em>Ifc Specular Roughness</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpecularHighlightTypeImpl extends EObjectImpl implements SpecularHighlightType {
	/**
	 * The cached value of the '{@link #getIfcSpecularExponent() <em>Ifc Specular Exponent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcSpecularExponent()
	 * @generated
	 * @ordered
	 */
	protected IfcSpecularExponentType ifcSpecularExponent;

	/**
	 * The cached value of the '{@link #getIfcSpecularRoughness() <em>Ifc Specular Roughness</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcSpecularRoughness()
	 * @generated
	 * @ordered
	 */
	protected IfcSpecularRoughnessType ifcSpecularRoughness;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecularHighlightTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getSpecularHighlightType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSpecularExponentType getIfcSpecularExponent() {
		return ifcSpecularExponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcSpecularExponent(IfcSpecularExponentType newIfcSpecularExponent, NotificationChain msgs) {
		IfcSpecularExponentType oldIfcSpecularExponent = ifcSpecularExponent;
		ifcSpecularExponent = newIfcSpecularExponent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.SPECULAR_HIGHLIGHT_TYPE__IFC_SPECULAR_EXPONENT, oldIfcSpecularExponent, newIfcSpecularExponent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcSpecularExponent(IfcSpecularExponentType newIfcSpecularExponent) {
		if (newIfcSpecularExponent != ifcSpecularExponent) {
			NotificationChain msgs = null;
			if (ifcSpecularExponent != null)
				msgs = ((InternalEObject)ifcSpecularExponent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.SPECULAR_HIGHLIGHT_TYPE__IFC_SPECULAR_EXPONENT, null, msgs);
			if (newIfcSpecularExponent != null)
				msgs = ((InternalEObject)newIfcSpecularExponent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.SPECULAR_HIGHLIGHT_TYPE__IFC_SPECULAR_EXPONENT, null, msgs);
			msgs = basicSetIfcSpecularExponent(newIfcSpecularExponent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.SPECULAR_HIGHLIGHT_TYPE__IFC_SPECULAR_EXPONENT, newIfcSpecularExponent, newIfcSpecularExponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSpecularRoughnessType getIfcSpecularRoughness() {
		return ifcSpecularRoughness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcSpecularRoughness(IfcSpecularRoughnessType newIfcSpecularRoughness, NotificationChain msgs) {
		IfcSpecularRoughnessType oldIfcSpecularRoughness = ifcSpecularRoughness;
		ifcSpecularRoughness = newIfcSpecularRoughness;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.SPECULAR_HIGHLIGHT_TYPE__IFC_SPECULAR_ROUGHNESS, oldIfcSpecularRoughness, newIfcSpecularRoughness);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcSpecularRoughness(IfcSpecularRoughnessType newIfcSpecularRoughness) {
		if (newIfcSpecularRoughness != ifcSpecularRoughness) {
			NotificationChain msgs = null;
			if (ifcSpecularRoughness != null)
				msgs = ((InternalEObject)ifcSpecularRoughness).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.SPECULAR_HIGHLIGHT_TYPE__IFC_SPECULAR_ROUGHNESS, null, msgs);
			if (newIfcSpecularRoughness != null)
				msgs = ((InternalEObject)newIfcSpecularRoughness).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.SPECULAR_HIGHLIGHT_TYPE__IFC_SPECULAR_ROUGHNESS, null, msgs);
			msgs = basicSetIfcSpecularRoughness(newIfcSpecularRoughness, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.SPECULAR_HIGHLIGHT_TYPE__IFC_SPECULAR_ROUGHNESS, newIfcSpecularRoughness, newIfcSpecularRoughness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.SPECULAR_HIGHLIGHT_TYPE__IFC_SPECULAR_EXPONENT:
				return basicSetIfcSpecularExponent(null, msgs);
			case FinalPackage.SPECULAR_HIGHLIGHT_TYPE__IFC_SPECULAR_ROUGHNESS:
				return basicSetIfcSpecularRoughness(null, msgs);
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
			case FinalPackage.SPECULAR_HIGHLIGHT_TYPE__IFC_SPECULAR_EXPONENT:
				return getIfcSpecularExponent();
			case FinalPackage.SPECULAR_HIGHLIGHT_TYPE__IFC_SPECULAR_ROUGHNESS:
				return getIfcSpecularRoughness();
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
			case FinalPackage.SPECULAR_HIGHLIGHT_TYPE__IFC_SPECULAR_EXPONENT:
				setIfcSpecularExponent((IfcSpecularExponentType)newValue);
				return;
			case FinalPackage.SPECULAR_HIGHLIGHT_TYPE__IFC_SPECULAR_ROUGHNESS:
				setIfcSpecularRoughness((IfcSpecularRoughnessType)newValue);
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
			case FinalPackage.SPECULAR_HIGHLIGHT_TYPE__IFC_SPECULAR_EXPONENT:
				setIfcSpecularExponent((IfcSpecularExponentType)null);
				return;
			case FinalPackage.SPECULAR_HIGHLIGHT_TYPE__IFC_SPECULAR_ROUGHNESS:
				setIfcSpecularRoughness((IfcSpecularRoughnessType)null);
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
			case FinalPackage.SPECULAR_HIGHLIGHT_TYPE__IFC_SPECULAR_EXPONENT:
				return ifcSpecularExponent != null;
			case FinalPackage.SPECULAR_HIGHLIGHT_TYPE__IFC_SPECULAR_ROUGHNESS:
				return ifcSpecularRoughness != null;
		}
		return super.eIsSet(featureID);
	}

} //SpecularHighlightTypeImpl
