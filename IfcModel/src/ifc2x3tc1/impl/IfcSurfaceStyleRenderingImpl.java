/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcColourOrFactor;
import ifc2x3tc1.IfcReflectanceMethodEnum;
import ifc2x3tc1.IfcSpecularHighlightSelect;
import ifc2x3tc1.IfcSurfaceStyleRendering;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Surface Style Rendering</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcSurfaceStyleRenderingImpl#getTransparency <em>Transparency</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSurfaceStyleRenderingImpl#getTransparencyAsString <em>Transparency As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSurfaceStyleRenderingImpl#getDiffuseColour <em>Diffuse Colour</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSurfaceStyleRenderingImpl#getTransmissionColour <em>Transmission Colour</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSurfaceStyleRenderingImpl#getDiffuseTransmissionColour <em>Diffuse Transmission Colour</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSurfaceStyleRenderingImpl#getReflectionColour <em>Reflection Colour</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSurfaceStyleRenderingImpl#getSpecularColour <em>Specular Colour</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSurfaceStyleRenderingImpl#getSpecularHighlight <em>Specular Highlight</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSurfaceStyleRenderingImpl#getReflectanceMethod <em>Reflectance Method</em>}</li>
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
	protected static final double TRANSPARENCY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTransparency() <em>Transparency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransparency()
	 * @generated
	 * @ordered
	 */
	protected double transparency = TRANSPARENCY_EDEFAULT;

	/**
	 * This is true if the Transparency attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean transparencyESet;

	/**
	 * The default value of the '{@link #getTransparencyAsString() <em>Transparency As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransparencyAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSPARENCY_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransparencyAsString() <em>Transparency As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransparencyAsString()
	 * @generated
	 * @ordered
	 */
	protected String transparencyAsString = TRANSPARENCY_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Transparency As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean transparencyAsStringESet;

	/**
	 * The cached value of the '{@link #getDiffuseColour() <em>Diffuse Colour</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffuseColour()
	 * @generated
	 * @ordered
	 */
	protected IfcColourOrFactor diffuseColour;

	/**
	 * This is true if the Diffuse Colour reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean diffuseColourESet;

	/**
	 * The cached value of the '{@link #getTransmissionColour() <em>Transmission Colour</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmissionColour()
	 * @generated
	 * @ordered
	 */
	protected IfcColourOrFactor transmissionColour;

	/**
	 * This is true if the Transmission Colour reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean transmissionColourESet;

	/**
	 * The cached value of the '{@link #getDiffuseTransmissionColour() <em>Diffuse Transmission Colour</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffuseTransmissionColour()
	 * @generated
	 * @ordered
	 */
	protected IfcColourOrFactor diffuseTransmissionColour;

	/**
	 * This is true if the Diffuse Transmission Colour reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean diffuseTransmissionColourESet;

	/**
	 * The cached value of the '{@link #getReflectionColour() <em>Reflection Colour</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReflectionColour()
	 * @generated
	 * @ordered
	 */
	protected IfcColourOrFactor reflectionColour;

	/**
	 * This is true if the Reflection Colour reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean reflectionColourESet;

	/**
	 * The cached value of the '{@link #getSpecularColour() <em>Specular Colour</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecularColour()
	 * @generated
	 * @ordered
	 */
	protected IfcColourOrFactor specularColour;

	/**
	 * This is true if the Specular Colour reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean specularColourESet;

	/**
	 * The cached value of the '{@link #getSpecularHighlight() <em>Specular Highlight</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecularHighlight()
	 * @generated
	 * @ordered
	 */
	protected IfcSpecularHighlightSelect specularHighlight;

	/**
	 * This is true if the Specular Highlight reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean specularHighlightESet;

	/**
	 * The default value of the '{@link #getReflectanceMethod() <em>Reflectance Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReflectanceMethod()
	 * @generated
	 * @ordered
	 */
	protected static final IfcReflectanceMethodEnum REFLECTANCE_METHOD_EDEFAULT = IfcReflectanceMethodEnum.NULL;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcSurfaceStyleRendering();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTransparency() {
		return transparency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransparency(double newTransparency) {
		double oldTransparency = transparency;
		transparency = newTransparency;
		boolean oldTransparencyESet = transparencyESet;
		transparencyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SURFACE_STYLE_RENDERING__TRANSPARENCY, oldTransparency, transparency, !oldTransparencyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTransparency() {
		double oldTransparency = transparency;
		boolean oldTransparencyESet = transparencyESet;
		transparency = TRANSPARENCY_EDEFAULT;
		transparencyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SURFACE_STYLE_RENDERING__TRANSPARENCY, oldTransparency, TRANSPARENCY_EDEFAULT, oldTransparencyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTransparency() {
		return transparencyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransparencyAsString() {
		return transparencyAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransparencyAsString(String newTransparencyAsString) {
		String oldTransparencyAsString = transparencyAsString;
		transparencyAsString = newTransparencyAsString;
		boolean oldTransparencyAsStringESet = transparencyAsStringESet;
		transparencyAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SURFACE_STYLE_RENDERING__TRANSPARENCY_AS_STRING, oldTransparencyAsString, transparencyAsString, !oldTransparencyAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTransparencyAsString() {
		String oldTransparencyAsString = transparencyAsString;
		boolean oldTransparencyAsStringESet = transparencyAsStringESet;
		transparencyAsString = TRANSPARENCY_AS_STRING_EDEFAULT;
		transparencyAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SURFACE_STYLE_RENDERING__TRANSPARENCY_AS_STRING, oldTransparencyAsString, TRANSPARENCY_AS_STRING_EDEFAULT, oldTransparencyAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTransparencyAsString() {
		return transparencyAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcColourOrFactor getDiffuseColour() {
		if (diffuseColour != null && diffuseColour.eIsProxy()) {
			InternalEObject oldDiffuseColour = (InternalEObject)diffuseColour;
			diffuseColour = (IfcColourOrFactor)eResolveProxy(oldDiffuseColour);
			if (diffuseColour != oldDiffuseColour) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_SURFACE_STYLE_RENDERING__DIFFUSE_COLOUR, oldDiffuseColour, diffuseColour));
			}
		}
		return diffuseColour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcColourOrFactor basicGetDiffuseColour() {
		return diffuseColour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiffuseColour(IfcColourOrFactor newDiffuseColour) {
		IfcColourOrFactor oldDiffuseColour = diffuseColour;
		diffuseColour = newDiffuseColour;
		boolean oldDiffuseColourESet = diffuseColourESet;
		diffuseColourESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SURFACE_STYLE_RENDERING__DIFFUSE_COLOUR, oldDiffuseColour, diffuseColour, !oldDiffuseColourESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDiffuseColour() {
		IfcColourOrFactor oldDiffuseColour = diffuseColour;
		boolean oldDiffuseColourESet = diffuseColourESet;
		diffuseColour = null;
		diffuseColourESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SURFACE_STYLE_RENDERING__DIFFUSE_COLOUR, oldDiffuseColour, null, oldDiffuseColourESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDiffuseColour() {
		return diffuseColourESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcColourOrFactor getTransmissionColour() {
		if (transmissionColour != null && transmissionColour.eIsProxy()) {
			InternalEObject oldTransmissionColour = (InternalEObject)transmissionColour;
			transmissionColour = (IfcColourOrFactor)eResolveProxy(oldTransmissionColour);
			if (transmissionColour != oldTransmissionColour) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_SURFACE_STYLE_RENDERING__TRANSMISSION_COLOUR, oldTransmissionColour, transmissionColour));
			}
		}
		return transmissionColour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcColourOrFactor basicGetTransmissionColour() {
		return transmissionColour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransmissionColour(IfcColourOrFactor newTransmissionColour) {
		IfcColourOrFactor oldTransmissionColour = transmissionColour;
		transmissionColour = newTransmissionColour;
		boolean oldTransmissionColourESet = transmissionColourESet;
		transmissionColourESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SURFACE_STYLE_RENDERING__TRANSMISSION_COLOUR, oldTransmissionColour, transmissionColour, !oldTransmissionColourESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTransmissionColour() {
		IfcColourOrFactor oldTransmissionColour = transmissionColour;
		boolean oldTransmissionColourESet = transmissionColourESet;
		transmissionColour = null;
		transmissionColourESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SURFACE_STYLE_RENDERING__TRANSMISSION_COLOUR, oldTransmissionColour, null, oldTransmissionColourESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTransmissionColour() {
		return transmissionColourESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcColourOrFactor getDiffuseTransmissionColour() {
		if (diffuseTransmissionColour != null && diffuseTransmissionColour.eIsProxy()) {
			InternalEObject oldDiffuseTransmissionColour = (InternalEObject)diffuseTransmissionColour;
			diffuseTransmissionColour = (IfcColourOrFactor)eResolveProxy(oldDiffuseTransmissionColour);
			if (diffuseTransmissionColour != oldDiffuseTransmissionColour) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_SURFACE_STYLE_RENDERING__DIFFUSE_TRANSMISSION_COLOUR, oldDiffuseTransmissionColour, diffuseTransmissionColour));
			}
		}
		return diffuseTransmissionColour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcColourOrFactor basicGetDiffuseTransmissionColour() {
		return diffuseTransmissionColour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiffuseTransmissionColour(IfcColourOrFactor newDiffuseTransmissionColour) {
		IfcColourOrFactor oldDiffuseTransmissionColour = diffuseTransmissionColour;
		diffuseTransmissionColour = newDiffuseTransmissionColour;
		boolean oldDiffuseTransmissionColourESet = diffuseTransmissionColourESet;
		diffuseTransmissionColourESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SURFACE_STYLE_RENDERING__DIFFUSE_TRANSMISSION_COLOUR, oldDiffuseTransmissionColour, diffuseTransmissionColour, !oldDiffuseTransmissionColourESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDiffuseTransmissionColour() {
		IfcColourOrFactor oldDiffuseTransmissionColour = diffuseTransmissionColour;
		boolean oldDiffuseTransmissionColourESet = diffuseTransmissionColourESet;
		diffuseTransmissionColour = null;
		diffuseTransmissionColourESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SURFACE_STYLE_RENDERING__DIFFUSE_TRANSMISSION_COLOUR, oldDiffuseTransmissionColour, null, oldDiffuseTransmissionColourESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDiffuseTransmissionColour() {
		return diffuseTransmissionColourESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcColourOrFactor getReflectionColour() {
		if (reflectionColour != null && reflectionColour.eIsProxy()) {
			InternalEObject oldReflectionColour = (InternalEObject)reflectionColour;
			reflectionColour = (IfcColourOrFactor)eResolveProxy(oldReflectionColour);
			if (reflectionColour != oldReflectionColour) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_SURFACE_STYLE_RENDERING__REFLECTION_COLOUR, oldReflectionColour, reflectionColour));
			}
		}
		return reflectionColour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcColourOrFactor basicGetReflectionColour() {
		return reflectionColour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReflectionColour(IfcColourOrFactor newReflectionColour) {
		IfcColourOrFactor oldReflectionColour = reflectionColour;
		reflectionColour = newReflectionColour;
		boolean oldReflectionColourESet = reflectionColourESet;
		reflectionColourESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SURFACE_STYLE_RENDERING__REFLECTION_COLOUR, oldReflectionColour, reflectionColour, !oldReflectionColourESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReflectionColour() {
		IfcColourOrFactor oldReflectionColour = reflectionColour;
		boolean oldReflectionColourESet = reflectionColourESet;
		reflectionColour = null;
		reflectionColourESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SURFACE_STYLE_RENDERING__REFLECTION_COLOUR, oldReflectionColour, null, oldReflectionColourESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReflectionColour() {
		return reflectionColourESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcColourOrFactor getSpecularColour() {
		if (specularColour != null && specularColour.eIsProxy()) {
			InternalEObject oldSpecularColour = (InternalEObject)specularColour;
			specularColour = (IfcColourOrFactor)eResolveProxy(oldSpecularColour);
			if (specularColour != oldSpecularColour) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_SURFACE_STYLE_RENDERING__SPECULAR_COLOUR, oldSpecularColour, specularColour));
			}
		}
		return specularColour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcColourOrFactor basicGetSpecularColour() {
		return specularColour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecularColour(IfcColourOrFactor newSpecularColour) {
		IfcColourOrFactor oldSpecularColour = specularColour;
		specularColour = newSpecularColour;
		boolean oldSpecularColourESet = specularColourESet;
		specularColourESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SURFACE_STYLE_RENDERING__SPECULAR_COLOUR, oldSpecularColour, specularColour, !oldSpecularColourESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSpecularColour() {
		IfcColourOrFactor oldSpecularColour = specularColour;
		boolean oldSpecularColourESet = specularColourESet;
		specularColour = null;
		specularColourESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SURFACE_STYLE_RENDERING__SPECULAR_COLOUR, oldSpecularColour, null, oldSpecularColourESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSpecularColour() {
		return specularColourESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSpecularHighlightSelect getSpecularHighlight() {
		if (specularHighlight != null && specularHighlight.eIsProxy()) {
			InternalEObject oldSpecularHighlight = (InternalEObject)specularHighlight;
			specularHighlight = (IfcSpecularHighlightSelect)eResolveProxy(oldSpecularHighlight);
			if (specularHighlight != oldSpecularHighlight) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_SURFACE_STYLE_RENDERING__SPECULAR_HIGHLIGHT, oldSpecularHighlight, specularHighlight));
			}
		}
		return specularHighlight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSpecularHighlightSelect basicGetSpecularHighlight() {
		return specularHighlight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecularHighlight(IfcSpecularHighlightSelect newSpecularHighlight) {
		IfcSpecularHighlightSelect oldSpecularHighlight = specularHighlight;
		specularHighlight = newSpecularHighlight;
		boolean oldSpecularHighlightESet = specularHighlightESet;
		specularHighlightESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SURFACE_STYLE_RENDERING__SPECULAR_HIGHLIGHT, oldSpecularHighlight, specularHighlight, !oldSpecularHighlightESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSpecularHighlight() {
		IfcSpecularHighlightSelect oldSpecularHighlight = specularHighlight;
		boolean oldSpecularHighlightESet = specularHighlightESet;
		specularHighlight = null;
		specularHighlightESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SURFACE_STYLE_RENDERING__SPECULAR_HIGHLIGHT, oldSpecularHighlight, null, oldSpecularHighlightESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSpecularHighlight() {
		return specularHighlightESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SURFACE_STYLE_RENDERING__REFLECTANCE_METHOD, oldReflectanceMethod, reflectanceMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_RENDERING__TRANSPARENCY:
				return getTransparency();
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_RENDERING__TRANSPARENCY_AS_STRING:
				return getTransparencyAsString();
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_RENDERING__DIFFUSE_COLOUR:
				if (resolve) return getDiffuseColour();
				return basicGetDiffuseColour();
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_RENDERING__TRANSMISSION_COLOUR:
				if (resolve) return getTransmissionColour();
				return basicGetTransmissionColour();
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_RENDERING__DIFFUSE_TRANSMISSION_COLOUR:
				if (resolve) return getDiffuseTransmissionColour();
				return basicGetDiffuseTransmissionColour();
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_RENDERING__REFLECTION_COLOUR:
				if (resolve) return getReflectionColour();
				return basicGetReflectionColour();
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_RENDERING__SPECULAR_COLOUR:
				if (resolve) return getSpecularColour();
				return basicGetSpecularColour();
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_RENDERING__SPECULAR_HIGHLIGHT:
				if (resolve) return getSpecularHighlight();
				return basicGetSpecularHighlight();
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_RENDERING__REFLECTANCE_METHOD:
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
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_RENDERING__TRANSPARENCY:
				setTransparency((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_RENDERING__TRANSPARENCY_AS_STRING:
				setTransparencyAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_RENDERING__DIFFUSE_COLOUR:
				setDiffuseColour((IfcColourOrFactor)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_RENDERING__TRANSMISSION_COLOUR:
				setTransmissionColour((IfcColourOrFactor)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_RENDERING__DIFFUSE_TRANSMISSION_COLOUR:
				setDiffuseTransmissionColour((IfcColourOrFactor)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_RENDERING__REFLECTION_COLOUR:
				setReflectionColour((IfcColourOrFactor)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_RENDERING__SPECULAR_COLOUR:
				setSpecularColour((IfcColourOrFactor)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_RENDERING__SPECULAR_HIGHLIGHT:
				setSpecularHighlight((IfcSpecularHighlightSelect)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_RENDERING__REFLECTANCE_METHOD:
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
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_RENDERING__TRANSPARENCY:
				unsetTransparency();
				return;
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_RENDERING__TRANSPARENCY_AS_STRING:
				unsetTransparencyAsString();
				return;
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_RENDERING__DIFFUSE_COLOUR:
				unsetDiffuseColour();
				return;
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_RENDERING__TRANSMISSION_COLOUR:
				unsetTransmissionColour();
				return;
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_RENDERING__DIFFUSE_TRANSMISSION_COLOUR:
				unsetDiffuseTransmissionColour();
				return;
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_RENDERING__REFLECTION_COLOUR:
				unsetReflectionColour();
				return;
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_RENDERING__SPECULAR_COLOUR:
				unsetSpecularColour();
				return;
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_RENDERING__SPECULAR_HIGHLIGHT:
				unsetSpecularHighlight();
				return;
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_RENDERING__REFLECTANCE_METHOD:
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
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_RENDERING__TRANSPARENCY:
				return isSetTransparency();
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_RENDERING__TRANSPARENCY_AS_STRING:
				return isSetTransparencyAsString();
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_RENDERING__DIFFUSE_COLOUR:
				return isSetDiffuseColour();
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_RENDERING__TRANSMISSION_COLOUR:
				return isSetTransmissionColour();
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_RENDERING__DIFFUSE_TRANSMISSION_COLOUR:
				return isSetDiffuseTransmissionColour();
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_RENDERING__REFLECTION_COLOUR:
				return isSetReflectionColour();
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_RENDERING__SPECULAR_COLOUR:
				return isSetSpecularColour();
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_RENDERING__SPECULAR_HIGHLIGHT:
				return isSetSpecularHighlight();
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_RENDERING__REFLECTANCE_METHOD:
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
		result.append(" (Transparency: ");
		if (transparencyESet) result.append(transparency); else result.append("<unset>");
		result.append(", TransparencyAsString: ");
		if (transparencyAsStringESet) result.append(transparencyAsString); else result.append("<unset>");
		result.append(", ReflectanceMethod: ");
		result.append(reflectanceMethod);
		result.append(')');
		return result.toString();
	}

} //IfcSurfaceStyleRenderingImpl
