/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.DiffuseColourType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcColourRgb;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcNormalisedRatioMeasureType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diffuse Colour Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.DiffuseColourTypeImpl#getIfcColourRgb <em>Ifc Colour Rgb</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.DiffuseColourTypeImpl#getIfcNormalisedRatioMeasure <em>Ifc Normalised Ratio Measure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiffuseColourTypeImpl extends EObjectImpl implements DiffuseColourType {
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
	 * The cached value of the '{@link #getIfcNormalisedRatioMeasure() <em>Ifc Normalised Ratio Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcNormalisedRatioMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcNormalisedRatioMeasureType ifcNormalisedRatioMeasure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiffuseColourTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getDiffuseColourType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.DIFFUSE_COLOUR_TYPE__IFC_COLOUR_RGB, oldIfcColourRgb, newIfcColourRgb);
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
				msgs = ((InternalEObject)ifcColourRgb).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.DIFFUSE_COLOUR_TYPE__IFC_COLOUR_RGB, null, msgs);
			if (newIfcColourRgb != null)
				msgs = ((InternalEObject)newIfcColourRgb).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.DIFFUSE_COLOUR_TYPE__IFC_COLOUR_RGB, null, msgs);
			msgs = basicSetIfcColourRgb(newIfcColourRgb, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.DIFFUSE_COLOUR_TYPE__IFC_COLOUR_RGB, newIfcColourRgb, newIfcColourRgb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcNormalisedRatioMeasureType getIfcNormalisedRatioMeasure() {
		return ifcNormalisedRatioMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcNormalisedRatioMeasure(IfcNormalisedRatioMeasureType newIfcNormalisedRatioMeasure, NotificationChain msgs) {
		IfcNormalisedRatioMeasureType oldIfcNormalisedRatioMeasure = ifcNormalisedRatioMeasure;
		ifcNormalisedRatioMeasure = newIfcNormalisedRatioMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.DIFFUSE_COLOUR_TYPE__IFC_NORMALISED_RATIO_MEASURE, oldIfcNormalisedRatioMeasure, newIfcNormalisedRatioMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcNormalisedRatioMeasure(IfcNormalisedRatioMeasureType newIfcNormalisedRatioMeasure) {
		if (newIfcNormalisedRatioMeasure != ifcNormalisedRatioMeasure) {
			NotificationChain msgs = null;
			if (ifcNormalisedRatioMeasure != null)
				msgs = ((InternalEObject)ifcNormalisedRatioMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.DIFFUSE_COLOUR_TYPE__IFC_NORMALISED_RATIO_MEASURE, null, msgs);
			if (newIfcNormalisedRatioMeasure != null)
				msgs = ((InternalEObject)newIfcNormalisedRatioMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.DIFFUSE_COLOUR_TYPE__IFC_NORMALISED_RATIO_MEASURE, null, msgs);
			msgs = basicSetIfcNormalisedRatioMeasure(newIfcNormalisedRatioMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.DIFFUSE_COLOUR_TYPE__IFC_NORMALISED_RATIO_MEASURE, newIfcNormalisedRatioMeasure, newIfcNormalisedRatioMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.DIFFUSE_COLOUR_TYPE__IFC_COLOUR_RGB:
				return basicSetIfcColourRgb(null, msgs);
			case FinalPackage.DIFFUSE_COLOUR_TYPE__IFC_NORMALISED_RATIO_MEASURE:
				return basicSetIfcNormalisedRatioMeasure(null, msgs);
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
			case FinalPackage.DIFFUSE_COLOUR_TYPE__IFC_COLOUR_RGB:
				return getIfcColourRgb();
			case FinalPackage.DIFFUSE_COLOUR_TYPE__IFC_NORMALISED_RATIO_MEASURE:
				return getIfcNormalisedRatioMeasure();
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
			case FinalPackage.DIFFUSE_COLOUR_TYPE__IFC_COLOUR_RGB:
				setIfcColourRgb((IfcColourRgb)newValue);
				return;
			case FinalPackage.DIFFUSE_COLOUR_TYPE__IFC_NORMALISED_RATIO_MEASURE:
				setIfcNormalisedRatioMeasure((IfcNormalisedRatioMeasureType)newValue);
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
			case FinalPackage.DIFFUSE_COLOUR_TYPE__IFC_COLOUR_RGB:
				setIfcColourRgb((IfcColourRgb)null);
				return;
			case FinalPackage.DIFFUSE_COLOUR_TYPE__IFC_NORMALISED_RATIO_MEASURE:
				setIfcNormalisedRatioMeasure((IfcNormalisedRatioMeasureType)null);
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
			case FinalPackage.DIFFUSE_COLOUR_TYPE__IFC_COLOUR_RGB:
				return ifcColourRgb != null;
			case FinalPackage.DIFFUSE_COLOUR_TYPE__IFC_NORMALISED_RATIO_MEASURE:
				return ifcNormalisedRatioMeasure != null;
		}
		return super.eIsSet(featureID);
	}

} //DiffuseColourTypeImpl
