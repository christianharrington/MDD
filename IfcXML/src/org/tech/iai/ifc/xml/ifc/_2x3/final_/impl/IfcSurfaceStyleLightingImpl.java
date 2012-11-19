/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.EntityImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.DiffuseReflectionColourType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.DiffuseTransmissionColourType1;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceStyleLighting;
import org.tech.iai.ifc.xml.ifc._2x3.final_.ReflectanceColourType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.TransmissionColourType1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Surface Style Lighting</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSurfaceStyleLightingImpl#getDiffuseTransmissionColour <em>Diffuse Transmission Colour</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSurfaceStyleLightingImpl#getDiffuseReflectionColour <em>Diffuse Reflection Colour</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSurfaceStyleLightingImpl#getTransmissionColour <em>Transmission Colour</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSurfaceStyleLightingImpl#getReflectanceColour <em>Reflectance Colour</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcSurfaceStyleLightingImpl extends EntityImpl implements IfcSurfaceStyleLighting {
	/**
	 * The cached value of the '{@link #getDiffuseTransmissionColour() <em>Diffuse Transmission Colour</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffuseTransmissionColour()
	 * @generated
	 * @ordered
	 */
	protected DiffuseTransmissionColourType1 diffuseTransmissionColour;

	/**
	 * The cached value of the '{@link #getDiffuseReflectionColour() <em>Diffuse Reflection Colour</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffuseReflectionColour()
	 * @generated
	 * @ordered
	 */
	protected DiffuseReflectionColourType diffuseReflectionColour;

	/**
	 * The cached value of the '{@link #getTransmissionColour() <em>Transmission Colour</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmissionColour()
	 * @generated
	 * @ordered
	 */
	protected TransmissionColourType1 transmissionColour;

	/**
	 * The cached value of the '{@link #getReflectanceColour() <em>Reflectance Colour</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReflectanceColour()
	 * @generated
	 * @ordered
	 */
	protected ReflectanceColourType reflectanceColour;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSurfaceStyleLightingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcSurfaceStyleLighting();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffuseTransmissionColourType1 getDiffuseTransmissionColour() {
		return diffuseTransmissionColour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiffuseTransmissionColour(DiffuseTransmissionColourType1 newDiffuseTransmissionColour, NotificationChain msgs) {
		DiffuseTransmissionColourType1 oldDiffuseTransmissionColour = diffuseTransmissionColour;
		diffuseTransmissionColour = newDiffuseTransmissionColour;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SURFACE_STYLE_LIGHTING__DIFFUSE_TRANSMISSION_COLOUR, oldDiffuseTransmissionColour, newDiffuseTransmissionColour);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiffuseTransmissionColour(DiffuseTransmissionColourType1 newDiffuseTransmissionColour) {
		if (newDiffuseTransmissionColour != diffuseTransmissionColour) {
			NotificationChain msgs = null;
			if (diffuseTransmissionColour != null)
				msgs = ((InternalEObject)diffuseTransmissionColour).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SURFACE_STYLE_LIGHTING__DIFFUSE_TRANSMISSION_COLOUR, null, msgs);
			if (newDiffuseTransmissionColour != null)
				msgs = ((InternalEObject)newDiffuseTransmissionColour).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SURFACE_STYLE_LIGHTING__DIFFUSE_TRANSMISSION_COLOUR, null, msgs);
			msgs = basicSetDiffuseTransmissionColour(newDiffuseTransmissionColour, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SURFACE_STYLE_LIGHTING__DIFFUSE_TRANSMISSION_COLOUR, newDiffuseTransmissionColour, newDiffuseTransmissionColour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffuseReflectionColourType getDiffuseReflectionColour() {
		return diffuseReflectionColour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiffuseReflectionColour(DiffuseReflectionColourType newDiffuseReflectionColour, NotificationChain msgs) {
		DiffuseReflectionColourType oldDiffuseReflectionColour = diffuseReflectionColour;
		diffuseReflectionColour = newDiffuseReflectionColour;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SURFACE_STYLE_LIGHTING__DIFFUSE_REFLECTION_COLOUR, oldDiffuseReflectionColour, newDiffuseReflectionColour);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiffuseReflectionColour(DiffuseReflectionColourType newDiffuseReflectionColour) {
		if (newDiffuseReflectionColour != diffuseReflectionColour) {
			NotificationChain msgs = null;
			if (diffuseReflectionColour != null)
				msgs = ((InternalEObject)diffuseReflectionColour).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SURFACE_STYLE_LIGHTING__DIFFUSE_REFLECTION_COLOUR, null, msgs);
			if (newDiffuseReflectionColour != null)
				msgs = ((InternalEObject)newDiffuseReflectionColour).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SURFACE_STYLE_LIGHTING__DIFFUSE_REFLECTION_COLOUR, null, msgs);
			msgs = basicSetDiffuseReflectionColour(newDiffuseReflectionColour, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SURFACE_STYLE_LIGHTING__DIFFUSE_REFLECTION_COLOUR, newDiffuseReflectionColour, newDiffuseReflectionColour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransmissionColourType1 getTransmissionColour() {
		return transmissionColour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransmissionColour(TransmissionColourType1 newTransmissionColour, NotificationChain msgs) {
		TransmissionColourType1 oldTransmissionColour = transmissionColour;
		transmissionColour = newTransmissionColour;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SURFACE_STYLE_LIGHTING__TRANSMISSION_COLOUR, oldTransmissionColour, newTransmissionColour);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransmissionColour(TransmissionColourType1 newTransmissionColour) {
		if (newTransmissionColour != transmissionColour) {
			NotificationChain msgs = null;
			if (transmissionColour != null)
				msgs = ((InternalEObject)transmissionColour).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SURFACE_STYLE_LIGHTING__TRANSMISSION_COLOUR, null, msgs);
			if (newTransmissionColour != null)
				msgs = ((InternalEObject)newTransmissionColour).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SURFACE_STYLE_LIGHTING__TRANSMISSION_COLOUR, null, msgs);
			msgs = basicSetTransmissionColour(newTransmissionColour, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SURFACE_STYLE_LIGHTING__TRANSMISSION_COLOUR, newTransmissionColour, newTransmissionColour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReflectanceColourType getReflectanceColour() {
		return reflectanceColour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReflectanceColour(ReflectanceColourType newReflectanceColour, NotificationChain msgs) {
		ReflectanceColourType oldReflectanceColour = reflectanceColour;
		reflectanceColour = newReflectanceColour;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SURFACE_STYLE_LIGHTING__REFLECTANCE_COLOUR, oldReflectanceColour, newReflectanceColour);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReflectanceColour(ReflectanceColourType newReflectanceColour) {
		if (newReflectanceColour != reflectanceColour) {
			NotificationChain msgs = null;
			if (reflectanceColour != null)
				msgs = ((InternalEObject)reflectanceColour).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SURFACE_STYLE_LIGHTING__REFLECTANCE_COLOUR, null, msgs);
			if (newReflectanceColour != null)
				msgs = ((InternalEObject)newReflectanceColour).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SURFACE_STYLE_LIGHTING__REFLECTANCE_COLOUR, null, msgs);
			msgs = basicSetReflectanceColour(newReflectanceColour, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SURFACE_STYLE_LIGHTING__REFLECTANCE_COLOUR, newReflectanceColour, newReflectanceColour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_SURFACE_STYLE_LIGHTING__DIFFUSE_TRANSMISSION_COLOUR:
				return basicSetDiffuseTransmissionColour(null, msgs);
			case FinalPackage.IFC_SURFACE_STYLE_LIGHTING__DIFFUSE_REFLECTION_COLOUR:
				return basicSetDiffuseReflectionColour(null, msgs);
			case FinalPackage.IFC_SURFACE_STYLE_LIGHTING__TRANSMISSION_COLOUR:
				return basicSetTransmissionColour(null, msgs);
			case FinalPackage.IFC_SURFACE_STYLE_LIGHTING__REFLECTANCE_COLOUR:
				return basicSetReflectanceColour(null, msgs);
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
			case FinalPackage.IFC_SURFACE_STYLE_LIGHTING__DIFFUSE_TRANSMISSION_COLOUR:
				return getDiffuseTransmissionColour();
			case FinalPackage.IFC_SURFACE_STYLE_LIGHTING__DIFFUSE_REFLECTION_COLOUR:
				return getDiffuseReflectionColour();
			case FinalPackage.IFC_SURFACE_STYLE_LIGHTING__TRANSMISSION_COLOUR:
				return getTransmissionColour();
			case FinalPackage.IFC_SURFACE_STYLE_LIGHTING__REFLECTANCE_COLOUR:
				return getReflectanceColour();
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
			case FinalPackage.IFC_SURFACE_STYLE_LIGHTING__DIFFUSE_TRANSMISSION_COLOUR:
				setDiffuseTransmissionColour((DiffuseTransmissionColourType1)newValue);
				return;
			case FinalPackage.IFC_SURFACE_STYLE_LIGHTING__DIFFUSE_REFLECTION_COLOUR:
				setDiffuseReflectionColour((DiffuseReflectionColourType)newValue);
				return;
			case FinalPackage.IFC_SURFACE_STYLE_LIGHTING__TRANSMISSION_COLOUR:
				setTransmissionColour((TransmissionColourType1)newValue);
				return;
			case FinalPackage.IFC_SURFACE_STYLE_LIGHTING__REFLECTANCE_COLOUR:
				setReflectanceColour((ReflectanceColourType)newValue);
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
			case FinalPackage.IFC_SURFACE_STYLE_LIGHTING__DIFFUSE_TRANSMISSION_COLOUR:
				setDiffuseTransmissionColour((DiffuseTransmissionColourType1)null);
				return;
			case FinalPackage.IFC_SURFACE_STYLE_LIGHTING__DIFFUSE_REFLECTION_COLOUR:
				setDiffuseReflectionColour((DiffuseReflectionColourType)null);
				return;
			case FinalPackage.IFC_SURFACE_STYLE_LIGHTING__TRANSMISSION_COLOUR:
				setTransmissionColour((TransmissionColourType1)null);
				return;
			case FinalPackage.IFC_SURFACE_STYLE_LIGHTING__REFLECTANCE_COLOUR:
				setReflectanceColour((ReflectanceColourType)null);
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
			case FinalPackage.IFC_SURFACE_STYLE_LIGHTING__DIFFUSE_TRANSMISSION_COLOUR:
				return diffuseTransmissionColour != null;
			case FinalPackage.IFC_SURFACE_STYLE_LIGHTING__DIFFUSE_REFLECTION_COLOUR:
				return diffuseReflectionColour != null;
			case FinalPackage.IFC_SURFACE_STYLE_LIGHTING__TRANSMISSION_COLOUR:
				return transmissionColour != null;
			case FinalPackage.IFC_SURFACE_STYLE_LIGHTING__REFLECTANCE_COLOUR:
				return reflectanceColour != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcSurfaceStyleLightingImpl
