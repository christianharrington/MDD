/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.DiffuseColourType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.DiffuseTransmissionColourType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcReflectanceMethodEnum;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceStyleRendering;
import org.tech.iai.ifc.xml.ifc._2x3.final_.ReflectionColourType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.SpecularColourType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.SpecularHighlightType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.TransmissionColourType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Surface Style Rendering</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSurfaceStyleRenderingImpl#getTransparency <em>Transparency</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSurfaceStyleRenderingImpl#getDiffuseColour <em>Diffuse Colour</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSurfaceStyleRenderingImpl#getTransmissionColour <em>Transmission Colour</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSurfaceStyleRenderingImpl#getDiffuseTransmissionColour <em>Diffuse Transmission Colour</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSurfaceStyleRenderingImpl#getReflectionColour <em>Reflection Colour</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSurfaceStyleRenderingImpl#getSpecularColour <em>Specular Colour</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSurfaceStyleRenderingImpl#getSpecularHighlight <em>Specular Highlight</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSurfaceStyleRenderingImpl#getReflectanceMethod <em>Reflectance Method</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcSurfaceStyleRenderingImpl extends IfcSurfaceStyleShadingImpl implements IfcSurfaceStyleRendering {
	/**
	 * The default value of the '{@link #getTransparency() <em>Transparency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransparency()
	 * @generated
	 * @ordered
	 */
	protected static final Double TRANSPARENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransparency() <em>Transparency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransparency()
	 * @generated
	 * @ordered
	 */
	protected Double transparency = TRANSPARENCY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDiffuseColour() <em>Diffuse Colour</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffuseColour()
	 * @generated
	 * @ordered
	 */
	protected DiffuseColourType diffuseColour;

	/**
	 * The cached value of the '{@link #getTransmissionColour() <em>Transmission Colour</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmissionColour()
	 * @generated
	 * @ordered
	 */
	protected TransmissionColourType transmissionColour;

	/**
	 * The cached value of the '{@link #getDiffuseTransmissionColour() <em>Diffuse Transmission Colour</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffuseTransmissionColour()
	 * @generated
	 * @ordered
	 */
	protected DiffuseTransmissionColourType diffuseTransmissionColour;

	/**
	 * The cached value of the '{@link #getReflectionColour() <em>Reflection Colour</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReflectionColour()
	 * @generated
	 * @ordered
	 */
	protected ReflectionColourType reflectionColour;

	/**
	 * The cached value of the '{@link #getSpecularColour() <em>Specular Colour</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecularColour()
	 * @generated
	 * @ordered
	 */
	protected SpecularColourType specularColour;

	/**
	 * The cached value of the '{@link #getSpecularHighlight() <em>Specular Highlight</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecularHighlight()
	 * @generated
	 * @ordered
	 */
	protected SpecularHighlightType specularHighlight;

	/**
	 * The default value of the '{@link #getReflectanceMethod() <em>Reflectance Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReflectanceMethod()
	 * @generated
	 * @ordered
	 */
	protected static final IfcReflectanceMethodEnum REFLECTANCE_METHOD_EDEFAULT = IfcReflectanceMethodEnum.BLINN;

	/**
	 * The cached value of the '{@link #getReflectanceMethod() <em>Reflectance Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReflectanceMethod()
	 * @generated
	 * @ordered
	 */
	protected IfcReflectanceMethodEnum reflectanceMethod = REFLECTANCE_METHOD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSurfaceStyleRenderingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcSurfaceStyleRendering();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getTransparency() {
		return transparency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransparency(Double newTransparency) {
		Double oldTransparency = transparency;
		transparency = newTransparency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SURFACE_STYLE_RENDERING__TRANSPARENCY, oldTransparency, transparency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffuseColourType getDiffuseColour() {
		return diffuseColour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiffuseColour(DiffuseColourType newDiffuseColour, NotificationChain msgs) {
		DiffuseColourType oldDiffuseColour = diffuseColour;
		diffuseColour = newDiffuseColour;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SURFACE_STYLE_RENDERING__DIFFUSE_COLOUR, oldDiffuseColour, newDiffuseColour);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiffuseColour(DiffuseColourType newDiffuseColour) {
		if (newDiffuseColour != diffuseColour) {
			NotificationChain msgs = null;
			if (diffuseColour != null)
				msgs = ((InternalEObject)diffuseColour).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SURFACE_STYLE_RENDERING__DIFFUSE_COLOUR, null, msgs);
			if (newDiffuseColour != null)
				msgs = ((InternalEObject)newDiffuseColour).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SURFACE_STYLE_RENDERING__DIFFUSE_COLOUR, null, msgs);
			msgs = basicSetDiffuseColour(newDiffuseColour, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SURFACE_STYLE_RENDERING__DIFFUSE_COLOUR, newDiffuseColour, newDiffuseColour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransmissionColourType getTransmissionColour() {
		return transmissionColour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransmissionColour(TransmissionColourType newTransmissionColour, NotificationChain msgs) {
		TransmissionColourType oldTransmissionColour = transmissionColour;
		transmissionColour = newTransmissionColour;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SURFACE_STYLE_RENDERING__TRANSMISSION_COLOUR, oldTransmissionColour, newTransmissionColour);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransmissionColour(TransmissionColourType newTransmissionColour) {
		if (newTransmissionColour != transmissionColour) {
			NotificationChain msgs = null;
			if (transmissionColour != null)
				msgs = ((InternalEObject)transmissionColour).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SURFACE_STYLE_RENDERING__TRANSMISSION_COLOUR, null, msgs);
			if (newTransmissionColour != null)
				msgs = ((InternalEObject)newTransmissionColour).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SURFACE_STYLE_RENDERING__TRANSMISSION_COLOUR, null, msgs);
			msgs = basicSetTransmissionColour(newTransmissionColour, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SURFACE_STYLE_RENDERING__TRANSMISSION_COLOUR, newTransmissionColour, newTransmissionColour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffuseTransmissionColourType getDiffuseTransmissionColour() {
		return diffuseTransmissionColour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiffuseTransmissionColour(DiffuseTransmissionColourType newDiffuseTransmissionColour, NotificationChain msgs) {
		DiffuseTransmissionColourType oldDiffuseTransmissionColour = diffuseTransmissionColour;
		diffuseTransmissionColour = newDiffuseTransmissionColour;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SURFACE_STYLE_RENDERING__DIFFUSE_TRANSMISSION_COLOUR, oldDiffuseTransmissionColour, newDiffuseTransmissionColour);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiffuseTransmissionColour(DiffuseTransmissionColourType newDiffuseTransmissionColour) {
		if (newDiffuseTransmissionColour != diffuseTransmissionColour) {
			NotificationChain msgs = null;
			if (diffuseTransmissionColour != null)
				msgs = ((InternalEObject)diffuseTransmissionColour).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SURFACE_STYLE_RENDERING__DIFFUSE_TRANSMISSION_COLOUR, null, msgs);
			if (newDiffuseTransmissionColour != null)
				msgs = ((InternalEObject)newDiffuseTransmissionColour).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SURFACE_STYLE_RENDERING__DIFFUSE_TRANSMISSION_COLOUR, null, msgs);
			msgs = basicSetDiffuseTransmissionColour(newDiffuseTransmissionColour, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SURFACE_STYLE_RENDERING__DIFFUSE_TRANSMISSION_COLOUR, newDiffuseTransmissionColour, newDiffuseTransmissionColour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReflectionColourType getReflectionColour() {
		return reflectionColour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReflectionColour(ReflectionColourType newReflectionColour, NotificationChain msgs) {
		ReflectionColourType oldReflectionColour = reflectionColour;
		reflectionColour = newReflectionColour;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SURFACE_STYLE_RENDERING__REFLECTION_COLOUR, oldReflectionColour, newReflectionColour);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReflectionColour(ReflectionColourType newReflectionColour) {
		if (newReflectionColour != reflectionColour) {
			NotificationChain msgs = null;
			if (reflectionColour != null)
				msgs = ((InternalEObject)reflectionColour).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SURFACE_STYLE_RENDERING__REFLECTION_COLOUR, null, msgs);
			if (newReflectionColour != null)
				msgs = ((InternalEObject)newReflectionColour).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SURFACE_STYLE_RENDERING__REFLECTION_COLOUR, null, msgs);
			msgs = basicSetReflectionColour(newReflectionColour, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SURFACE_STYLE_RENDERING__REFLECTION_COLOUR, newReflectionColour, newReflectionColour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecularColourType getSpecularColour() {
		return specularColour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecularColour(SpecularColourType newSpecularColour, NotificationChain msgs) {
		SpecularColourType oldSpecularColour = specularColour;
		specularColour = newSpecularColour;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SURFACE_STYLE_RENDERING__SPECULAR_COLOUR, oldSpecularColour, newSpecularColour);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecularColour(SpecularColourType newSpecularColour) {
		if (newSpecularColour != specularColour) {
			NotificationChain msgs = null;
			if (specularColour != null)
				msgs = ((InternalEObject)specularColour).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SURFACE_STYLE_RENDERING__SPECULAR_COLOUR, null, msgs);
			if (newSpecularColour != null)
				msgs = ((InternalEObject)newSpecularColour).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SURFACE_STYLE_RENDERING__SPECULAR_COLOUR, null, msgs);
			msgs = basicSetSpecularColour(newSpecularColour, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SURFACE_STYLE_RENDERING__SPECULAR_COLOUR, newSpecularColour, newSpecularColour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecularHighlightType getSpecularHighlight() {
		return specularHighlight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecularHighlight(SpecularHighlightType newSpecularHighlight, NotificationChain msgs) {
		SpecularHighlightType oldSpecularHighlight = specularHighlight;
		specularHighlight = newSpecularHighlight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SURFACE_STYLE_RENDERING__SPECULAR_HIGHLIGHT, oldSpecularHighlight, newSpecularHighlight);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecularHighlight(SpecularHighlightType newSpecularHighlight) {
		if (newSpecularHighlight != specularHighlight) {
			NotificationChain msgs = null;
			if (specularHighlight != null)
				msgs = ((InternalEObject)specularHighlight).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SURFACE_STYLE_RENDERING__SPECULAR_HIGHLIGHT, null, msgs);
			if (newSpecularHighlight != null)
				msgs = ((InternalEObject)newSpecularHighlight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SURFACE_STYLE_RENDERING__SPECULAR_HIGHLIGHT, null, msgs);
			msgs = basicSetSpecularHighlight(newSpecularHighlight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SURFACE_STYLE_RENDERING__SPECULAR_HIGHLIGHT, newSpecularHighlight, newSpecularHighlight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcReflectanceMethodEnum getReflectanceMethod() {
		return reflectanceMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReflectanceMethod(IfcReflectanceMethodEnum newReflectanceMethod) {
		IfcReflectanceMethodEnum oldReflectanceMethod = reflectanceMethod;
		reflectanceMethod = newReflectanceMethod == null ? REFLECTANCE_METHOD_EDEFAULT : newReflectanceMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SURFACE_STYLE_RENDERING__REFLECTANCE_METHOD, oldReflectanceMethod, reflectanceMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_SURFACE_STYLE_RENDERING__DIFFUSE_COLOUR:
				return basicSetDiffuseColour(null, msgs);
			case FinalPackage.IFC_SURFACE_STYLE_RENDERING__TRANSMISSION_COLOUR:
				return basicSetTransmissionColour(null, msgs);
			case FinalPackage.IFC_SURFACE_STYLE_RENDERING__DIFFUSE_TRANSMISSION_COLOUR:
				return basicSetDiffuseTransmissionColour(null, msgs);
			case FinalPackage.IFC_SURFACE_STYLE_RENDERING__REFLECTION_COLOUR:
				return basicSetReflectionColour(null, msgs);
			case FinalPackage.IFC_SURFACE_STYLE_RENDERING__SPECULAR_COLOUR:
				return basicSetSpecularColour(null, msgs);
			case FinalPackage.IFC_SURFACE_STYLE_RENDERING__SPECULAR_HIGHLIGHT:
				return basicSetSpecularHighlight(null, msgs);
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
			case FinalPackage.IFC_SURFACE_STYLE_RENDERING__TRANSPARENCY:
				return getTransparency();
			case FinalPackage.IFC_SURFACE_STYLE_RENDERING__DIFFUSE_COLOUR:
				return getDiffuseColour();
			case FinalPackage.IFC_SURFACE_STYLE_RENDERING__TRANSMISSION_COLOUR:
				return getTransmissionColour();
			case FinalPackage.IFC_SURFACE_STYLE_RENDERING__DIFFUSE_TRANSMISSION_COLOUR:
				return getDiffuseTransmissionColour();
			case FinalPackage.IFC_SURFACE_STYLE_RENDERING__REFLECTION_COLOUR:
				return getReflectionColour();
			case FinalPackage.IFC_SURFACE_STYLE_RENDERING__SPECULAR_COLOUR:
				return getSpecularColour();
			case FinalPackage.IFC_SURFACE_STYLE_RENDERING__SPECULAR_HIGHLIGHT:
				return getSpecularHighlight();
			case FinalPackage.IFC_SURFACE_STYLE_RENDERING__REFLECTANCE_METHOD:
				return getReflectanceMethod();
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
			case FinalPackage.IFC_SURFACE_STYLE_RENDERING__TRANSPARENCY:
				setTransparency((Double)newValue);
				return;
			case FinalPackage.IFC_SURFACE_STYLE_RENDERING__DIFFUSE_COLOUR:
				setDiffuseColour((DiffuseColourType)newValue);
				return;
			case FinalPackage.IFC_SURFACE_STYLE_RENDERING__TRANSMISSION_COLOUR:
				setTransmissionColour((TransmissionColourType)newValue);
				return;
			case FinalPackage.IFC_SURFACE_STYLE_RENDERING__DIFFUSE_TRANSMISSION_COLOUR:
				setDiffuseTransmissionColour((DiffuseTransmissionColourType)newValue);
				return;
			case FinalPackage.IFC_SURFACE_STYLE_RENDERING__REFLECTION_COLOUR:
				setReflectionColour((ReflectionColourType)newValue);
				return;
			case FinalPackage.IFC_SURFACE_STYLE_RENDERING__SPECULAR_COLOUR:
				setSpecularColour((SpecularColourType)newValue);
				return;
			case FinalPackage.IFC_SURFACE_STYLE_RENDERING__SPECULAR_HIGHLIGHT:
				setSpecularHighlight((SpecularHighlightType)newValue);
				return;
			case FinalPackage.IFC_SURFACE_STYLE_RENDERING__REFLECTANCE_METHOD:
				setReflectanceMethod((IfcReflectanceMethodEnum)newValue);
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
			case FinalPackage.IFC_SURFACE_STYLE_RENDERING__TRANSPARENCY:
				setTransparency(TRANSPARENCY_EDEFAULT);
				return;
			case FinalPackage.IFC_SURFACE_STYLE_RENDERING__DIFFUSE_COLOUR:
				setDiffuseColour((DiffuseColourType)null);
				return;
			case FinalPackage.IFC_SURFACE_STYLE_RENDERING__TRANSMISSION_COLOUR:
				setTransmissionColour((TransmissionColourType)null);
				return;
			case FinalPackage.IFC_SURFACE_STYLE_RENDERING__DIFFUSE_TRANSMISSION_COLOUR:
				setDiffuseTransmissionColour((DiffuseTransmissionColourType)null);
				return;
			case FinalPackage.IFC_SURFACE_STYLE_RENDERING__REFLECTION_COLOUR:
				setReflectionColour((ReflectionColourType)null);
				return;
			case FinalPackage.IFC_SURFACE_STYLE_RENDERING__SPECULAR_COLOUR:
				setSpecularColour((SpecularColourType)null);
				return;
			case FinalPackage.IFC_SURFACE_STYLE_RENDERING__SPECULAR_HIGHLIGHT:
				setSpecularHighlight((SpecularHighlightType)null);
				return;
			case FinalPackage.IFC_SURFACE_STYLE_RENDERING__REFLECTANCE_METHOD:
				setReflectanceMethod(REFLECTANCE_METHOD_EDEFAULT);
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
			case FinalPackage.IFC_SURFACE_STYLE_RENDERING__TRANSPARENCY:
				return TRANSPARENCY_EDEFAULT == null ? transparency != null : !TRANSPARENCY_EDEFAULT.equals(transparency);
			case FinalPackage.IFC_SURFACE_STYLE_RENDERING__DIFFUSE_COLOUR:
				return diffuseColour != null;
			case FinalPackage.IFC_SURFACE_STYLE_RENDERING__TRANSMISSION_COLOUR:
				return transmissionColour != null;
			case FinalPackage.IFC_SURFACE_STYLE_RENDERING__DIFFUSE_TRANSMISSION_COLOUR:
				return diffuseTransmissionColour != null;
			case FinalPackage.IFC_SURFACE_STYLE_RENDERING__REFLECTION_COLOUR:
				return reflectionColour != null;
			case FinalPackage.IFC_SURFACE_STYLE_RENDERING__SPECULAR_COLOUR:
				return specularColour != null;
			case FinalPackage.IFC_SURFACE_STYLE_RENDERING__SPECULAR_HIGHLIGHT:
				return specularHighlight != null;
			case FinalPackage.IFC_SURFACE_STYLE_RENDERING__REFLECTANCE_METHOD:
				return reflectanceMethod != REFLECTANCE_METHOD_EDEFAULT;
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
		result.append(" (transparency: ");
		result.append(transparency);
		result.append(", reflectanceMethod: ");
		result.append(reflectanceMethod);
		result.append(')');
		return result.toString();
	}

} //IfcSurfaceStyleRenderingImpl
