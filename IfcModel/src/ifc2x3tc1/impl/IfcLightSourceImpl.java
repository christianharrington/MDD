/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcColourRgb;
import ifc2x3tc1.IfcLightSource;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Light Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcLightSourceImpl#getName <em>Name</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcLightSourceImpl#getLightColour <em>Light Colour</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcLightSourceImpl#getAmbientIntensity <em>Ambient Intensity</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcLightSourceImpl#getAmbientIntensityAsString <em>Ambient Intensity As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcLightSourceImpl#getIntensity <em>Intensity</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcLightSourceImpl#getIntensityAsString <em>Intensity As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcLightSourceImpl extends IfcGeometricRepresentationItemImpl implements IfcLightSource {
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
	 * This is true if the Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nameESet;

	/**
	 * The cached value of the '{@link #getLightColour() <em>Light Colour</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLightColour()
	 * @generated
	 * @ordered
	 */
	protected IfcColourRgb lightColour;

	/**
	 * The default value of the '{@link #getAmbientIntensity() <em>Ambient Intensity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmbientIntensity()
	 * @generated
	 * @ordered
	 */
	protected static final double AMBIENT_INTENSITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAmbientIntensity() <em>Ambient Intensity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmbientIntensity()
	 * @generated
	 * @ordered
	 */
	protected double ambientIntensity = AMBIENT_INTENSITY_EDEFAULT;

	/**
	 * This is true if the Ambient Intensity attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ambientIntensityESet;

	/**
	 * The default value of the '{@link #getAmbientIntensityAsString() <em>Ambient Intensity As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmbientIntensityAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String AMBIENT_INTENSITY_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAmbientIntensityAsString() <em>Ambient Intensity As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmbientIntensityAsString()
	 * @generated
	 * @ordered
	 */
	protected String ambientIntensityAsString = AMBIENT_INTENSITY_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Ambient Intensity As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ambientIntensityAsStringESet;

	/**
	 * The default value of the '{@link #getIntensity() <em>Intensity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntensity()
	 * @generated
	 * @ordered
	 */
	protected static final double INTENSITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getIntensity() <em>Intensity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntensity()
	 * @generated
	 * @ordered
	 */
	protected double intensity = INTENSITY_EDEFAULT;

	/**
	 * This is true if the Intensity attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean intensityESet;

	/**
	 * The default value of the '{@link #getIntensityAsString() <em>Intensity As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntensityAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String INTENSITY_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIntensityAsString() <em>Intensity As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntensityAsString()
	 * @generated
	 * @ordered
	 */
	protected String intensityAsString = INTENSITY_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Intensity As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean intensityAsStringESet;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcLightSource();
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
		boolean oldNameESet = nameESet;
		nameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_LIGHT_SOURCE__NAME, oldName, name, !oldNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetName() {
		String oldName = name;
		boolean oldNameESet = nameESet;
		name = NAME_EDEFAULT;
		nameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_LIGHT_SOURCE__NAME, oldName, NAME_EDEFAULT, oldNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetName() {
		return nameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcColourRgb getLightColour() {
		if (lightColour != null && lightColour.eIsProxy()) {
			InternalEObject oldLightColour = (InternalEObject)lightColour;
			lightColour = (IfcColourRgb)eResolveProxy(oldLightColour);
			if (lightColour != oldLightColour) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_LIGHT_SOURCE__LIGHT_COLOUR, oldLightColour, lightColour));
			}
		}
		return lightColour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcColourRgb basicGetLightColour() {
		return lightColour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLightColour(IfcColourRgb newLightColour) {
		IfcColourRgb oldLightColour = lightColour;
		lightColour = newLightColour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_LIGHT_SOURCE__LIGHT_COLOUR, oldLightColour, lightColour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAmbientIntensity() {
		return ambientIntensity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmbientIntensity(double newAmbientIntensity) {
		double oldAmbientIntensity = ambientIntensity;
		ambientIntensity = newAmbientIntensity;
		boolean oldAmbientIntensityESet = ambientIntensityESet;
		ambientIntensityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_LIGHT_SOURCE__AMBIENT_INTENSITY, oldAmbientIntensity, ambientIntensity, !oldAmbientIntensityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAmbientIntensity() {
		double oldAmbientIntensity = ambientIntensity;
		boolean oldAmbientIntensityESet = ambientIntensityESet;
		ambientIntensity = AMBIENT_INTENSITY_EDEFAULT;
		ambientIntensityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_LIGHT_SOURCE__AMBIENT_INTENSITY, oldAmbientIntensity, AMBIENT_INTENSITY_EDEFAULT, oldAmbientIntensityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAmbientIntensity() {
		return ambientIntensityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAmbientIntensityAsString() {
		return ambientIntensityAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmbientIntensityAsString(String newAmbientIntensityAsString) {
		String oldAmbientIntensityAsString = ambientIntensityAsString;
		ambientIntensityAsString = newAmbientIntensityAsString;
		boolean oldAmbientIntensityAsStringESet = ambientIntensityAsStringESet;
		ambientIntensityAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_LIGHT_SOURCE__AMBIENT_INTENSITY_AS_STRING, oldAmbientIntensityAsString, ambientIntensityAsString, !oldAmbientIntensityAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAmbientIntensityAsString() {
		String oldAmbientIntensityAsString = ambientIntensityAsString;
		boolean oldAmbientIntensityAsStringESet = ambientIntensityAsStringESet;
		ambientIntensityAsString = AMBIENT_INTENSITY_AS_STRING_EDEFAULT;
		ambientIntensityAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_LIGHT_SOURCE__AMBIENT_INTENSITY_AS_STRING, oldAmbientIntensityAsString, AMBIENT_INTENSITY_AS_STRING_EDEFAULT, oldAmbientIntensityAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAmbientIntensityAsString() {
		return ambientIntensityAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getIntensity() {
		return intensity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntensity(double newIntensity) {
		double oldIntensity = intensity;
		intensity = newIntensity;
		boolean oldIntensityESet = intensityESet;
		intensityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_LIGHT_SOURCE__INTENSITY, oldIntensity, intensity, !oldIntensityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIntensity() {
		double oldIntensity = intensity;
		boolean oldIntensityESet = intensityESet;
		intensity = INTENSITY_EDEFAULT;
		intensityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_LIGHT_SOURCE__INTENSITY, oldIntensity, INTENSITY_EDEFAULT, oldIntensityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIntensity() {
		return intensityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIntensityAsString() {
		return intensityAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntensityAsString(String newIntensityAsString) {
		String oldIntensityAsString = intensityAsString;
		intensityAsString = newIntensityAsString;
		boolean oldIntensityAsStringESet = intensityAsStringESet;
		intensityAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_LIGHT_SOURCE__INTENSITY_AS_STRING, oldIntensityAsString, intensityAsString, !oldIntensityAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIntensityAsString() {
		String oldIntensityAsString = intensityAsString;
		boolean oldIntensityAsStringESet = intensityAsStringESet;
		intensityAsString = INTENSITY_AS_STRING_EDEFAULT;
		intensityAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_LIGHT_SOURCE__INTENSITY_AS_STRING, oldIntensityAsString, INTENSITY_AS_STRING_EDEFAULT, oldIntensityAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIntensityAsString() {
		return intensityAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE__NAME:
				return getName();
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE__LIGHT_COLOUR:
				if (resolve) return getLightColour();
				return basicGetLightColour();
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE__AMBIENT_INTENSITY:
				return getAmbientIntensity();
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE__AMBIENT_INTENSITY_AS_STRING:
				return getAmbientIntensityAsString();
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE__INTENSITY:
				return getIntensity();
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE__INTENSITY_AS_STRING:
				return getIntensityAsString();
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
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE__NAME:
				setName((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE__LIGHT_COLOUR:
				setLightColour((IfcColourRgb)newValue);
				return;
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE__AMBIENT_INTENSITY:
				setAmbientIntensity((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE__AMBIENT_INTENSITY_AS_STRING:
				setAmbientIntensityAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE__INTENSITY:
				setIntensity((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE__INTENSITY_AS_STRING:
				setIntensityAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE__NAME:
				unsetName();
				return;
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE__LIGHT_COLOUR:
				setLightColour((IfcColourRgb)null);
				return;
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE__AMBIENT_INTENSITY:
				unsetAmbientIntensity();
				return;
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE__AMBIENT_INTENSITY_AS_STRING:
				unsetAmbientIntensityAsString();
				return;
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE__INTENSITY:
				unsetIntensity();
				return;
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE__INTENSITY_AS_STRING:
				unsetIntensityAsString();
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
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE__NAME:
				return isSetName();
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE__LIGHT_COLOUR:
				return lightColour != null;
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE__AMBIENT_INTENSITY:
				return isSetAmbientIntensity();
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE__AMBIENT_INTENSITY_AS_STRING:
				return isSetAmbientIntensityAsString();
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE__INTENSITY:
				return isSetIntensity();
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE__INTENSITY_AS_STRING:
				return isSetIntensityAsString();
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
		result.append(" (Name: ");
		if (nameESet) result.append(name); else result.append("<unset>");
		result.append(", AmbientIntensity: ");
		if (ambientIntensityESet) result.append(ambientIntensity); else result.append("<unset>");
		result.append(", AmbientIntensityAsString: ");
		if (ambientIntensityAsStringESet) result.append(ambientIntensityAsString); else result.append("<unset>");
		result.append(", Intensity: ");
		if (intensityESet) result.append(intensity); else result.append("<unset>");
		result.append(", IntensityAsString: ");
		if (intensityAsStringESet) result.append(intensityAsString); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcLightSourceImpl
