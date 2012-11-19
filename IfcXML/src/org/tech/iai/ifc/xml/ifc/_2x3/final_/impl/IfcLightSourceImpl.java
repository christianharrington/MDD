/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLightSource;
import org.tech.iai.ifc.xml.ifc._2x3.final_.LightColourType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Light Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcLightSourceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcLightSourceImpl#getLightColour <em>Light Colour</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcLightSourceImpl#getAmbientIntensity <em>Ambient Intensity</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcLightSourceImpl#getIntensity <em>Intensity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class IfcLightSourceImpl extends IfcGeometricRepresentationItemImpl implements IfcLightSource {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLightColour() <em>Light Colour</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLightColour()
	 * @generated
	 * @ordered
	 */
	protected LightColourType lightColour;

	/**
	 * The default value of the '{@link #getAmbientIntensity() <em>Ambient Intensity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmbientIntensity()
	 * @generated
	 * @ordered
	 */
	protected static final Double AMBIENT_INTENSITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAmbientIntensity() <em>Ambient Intensity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmbientIntensity()
	 * @generated
	 * @ordered
	 */
	protected Double ambientIntensity = AMBIENT_INTENSITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getIntensity() <em>Intensity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntensity()
	 * @generated
	 * @ordered
	 */
	protected static final Double INTENSITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIntensity() <em>Intensity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntensity()
	 * @generated
	 * @ordered
	 */
	protected Double intensity = INTENSITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcLightSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcLightSource();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_LIGHT_SOURCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LightColourType getLightColour() {
		return lightColour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLightColour(LightColourType newLightColour, NotificationChain msgs) {
		LightColourType oldLightColour = lightColour;
		lightColour = newLightColour;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_LIGHT_SOURCE__LIGHT_COLOUR, oldLightColour, newLightColour);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLightColour(LightColourType newLightColour) {
		if (newLightColour != lightColour) {
			NotificationChain msgs = null;
			if (lightColour != null)
				msgs = ((InternalEObject)lightColour).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_LIGHT_SOURCE__LIGHT_COLOUR, null, msgs);
			if (newLightColour != null)
				msgs = ((InternalEObject)newLightColour).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_LIGHT_SOURCE__LIGHT_COLOUR, null, msgs);
			msgs = basicSetLightColour(newLightColour, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_LIGHT_SOURCE__LIGHT_COLOUR, newLightColour, newLightColour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getAmbientIntensity() {
		return ambientIntensity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmbientIntensity(Double newAmbientIntensity) {
		Double oldAmbientIntensity = ambientIntensity;
		ambientIntensity = newAmbientIntensity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_LIGHT_SOURCE__AMBIENT_INTENSITY, oldAmbientIntensity, ambientIntensity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIntensity() {
		return intensity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntensity(Double newIntensity) {
		Double oldIntensity = intensity;
		intensity = newIntensity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_LIGHT_SOURCE__INTENSITY, oldIntensity, intensity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_LIGHT_SOURCE__LIGHT_COLOUR:
				return basicSetLightColour(null, msgs);
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
			case FinalPackage.IFC_LIGHT_SOURCE__NAME:
				return getName();
			case FinalPackage.IFC_LIGHT_SOURCE__LIGHT_COLOUR:
				return getLightColour();
			case FinalPackage.IFC_LIGHT_SOURCE__AMBIENT_INTENSITY:
				return getAmbientIntensity();
			case FinalPackage.IFC_LIGHT_SOURCE__INTENSITY:
				return getIntensity();
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
			case FinalPackage.IFC_LIGHT_SOURCE__NAME:
				setName((String)newValue);
				return;
			case FinalPackage.IFC_LIGHT_SOURCE__LIGHT_COLOUR:
				setLightColour((LightColourType)newValue);
				return;
			case FinalPackage.IFC_LIGHT_SOURCE__AMBIENT_INTENSITY:
				setAmbientIntensity((Double)newValue);
				return;
			case FinalPackage.IFC_LIGHT_SOURCE__INTENSITY:
				setIntensity((Double)newValue);
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
			case FinalPackage.IFC_LIGHT_SOURCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FinalPackage.IFC_LIGHT_SOURCE__LIGHT_COLOUR:
				setLightColour((LightColourType)null);
				return;
			case FinalPackage.IFC_LIGHT_SOURCE__AMBIENT_INTENSITY:
				setAmbientIntensity(AMBIENT_INTENSITY_EDEFAULT);
				return;
			case FinalPackage.IFC_LIGHT_SOURCE__INTENSITY:
				setIntensity(INTENSITY_EDEFAULT);
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
			case FinalPackage.IFC_LIGHT_SOURCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FinalPackage.IFC_LIGHT_SOURCE__LIGHT_COLOUR:
				return lightColour != null;
			case FinalPackage.IFC_LIGHT_SOURCE__AMBIENT_INTENSITY:
				return AMBIENT_INTENSITY_EDEFAULT == null ? ambientIntensity != null : !AMBIENT_INTENSITY_EDEFAULT.equals(ambientIntensity);
			case FinalPackage.IFC_LIGHT_SOURCE__INTENSITY:
				return INTENSITY_EDEFAULT == null ? intensity != null : !INTENSITY_EDEFAULT.equals(intensity);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", ambientIntensity: ");
		result.append(ambientIntensity);
		result.append(", intensity: ");
		result.append(intensity);
		result.append(')');
		return result.toString();
	}

} //IfcLightSourceImpl
