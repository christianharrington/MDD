/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcSurfaceStyleRefraction;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Surface Style Refraction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcSurfaceStyleRefractionImpl#getRefractionIndex <em>Refraction Index</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSurfaceStyleRefractionImpl#getRefractionIndexAsString <em>Refraction Index As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSurfaceStyleRefractionImpl#getDispersionFactor <em>Dispersion Factor</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSurfaceStyleRefractionImpl#getDispersionFactorAsString <em>Dispersion Factor As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcSurfaceStyleRefractionImpl extends EObjectImpl implements IfcSurfaceStyleRefraction {
	/**
	 * The default value of the '{@link #getRefractionIndex() <em>Refraction Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefractionIndex()
	 * @generated
	 * @ordered
	 */
	protected static final double REFRACTION_INDEX_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRefractionIndex() <em>Refraction Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefractionIndex()
	 * @generated
	 * @ordered
	 */
	protected double refractionIndex = REFRACTION_INDEX_EDEFAULT;

	/**
	 * This is true if the Refraction Index attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean refractionIndexESet;

	/**
	 * The default value of the '{@link #getRefractionIndexAsString() <em>Refraction Index As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefractionIndexAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String REFRACTION_INDEX_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRefractionIndexAsString() <em>Refraction Index As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefractionIndexAsString()
	 * @generated
	 * @ordered
	 */
	protected String refractionIndexAsString = REFRACTION_INDEX_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Refraction Index As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean refractionIndexAsStringESet;

	/**
	 * The default value of the '{@link #getDispersionFactor() <em>Dispersion Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDispersionFactor()
	 * @generated
	 * @ordered
	 */
	protected static final double DISPERSION_FACTOR_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDispersionFactor() <em>Dispersion Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDispersionFactor()
	 * @generated
	 * @ordered
	 */
	protected double dispersionFactor = DISPERSION_FACTOR_EDEFAULT;

	/**
	 * This is true if the Dispersion Factor attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dispersionFactorESet;

	/**
	 * The default value of the '{@link #getDispersionFactorAsString() <em>Dispersion Factor As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDispersionFactorAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPERSION_FACTOR_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDispersionFactorAsString() <em>Dispersion Factor As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDispersionFactorAsString()
	 * @generated
	 * @ordered
	 */
	protected String dispersionFactorAsString = DISPERSION_FACTOR_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Dispersion Factor As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dispersionFactorAsStringESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSurfaceStyleRefractionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcSurfaceStyleRefraction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRefractionIndex() {
		return refractionIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefractionIndex(double newRefractionIndex) {
		double oldRefractionIndex = refractionIndex;
		refractionIndex = newRefractionIndex;
		boolean oldRefractionIndexESet = refractionIndexESet;
		refractionIndexESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SURFACE_STYLE_REFRACTION__REFRACTION_INDEX, oldRefractionIndex, refractionIndex, !oldRefractionIndexESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRefractionIndex() {
		double oldRefractionIndex = refractionIndex;
		boolean oldRefractionIndexESet = refractionIndexESet;
		refractionIndex = REFRACTION_INDEX_EDEFAULT;
		refractionIndexESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SURFACE_STYLE_REFRACTION__REFRACTION_INDEX, oldRefractionIndex, REFRACTION_INDEX_EDEFAULT, oldRefractionIndexESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRefractionIndex() {
		return refractionIndexESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRefractionIndexAsString() {
		return refractionIndexAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefractionIndexAsString(String newRefractionIndexAsString) {
		String oldRefractionIndexAsString = refractionIndexAsString;
		refractionIndexAsString = newRefractionIndexAsString;
		boolean oldRefractionIndexAsStringESet = refractionIndexAsStringESet;
		refractionIndexAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SURFACE_STYLE_REFRACTION__REFRACTION_INDEX_AS_STRING, oldRefractionIndexAsString, refractionIndexAsString, !oldRefractionIndexAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRefractionIndexAsString() {
		String oldRefractionIndexAsString = refractionIndexAsString;
		boolean oldRefractionIndexAsStringESet = refractionIndexAsStringESet;
		refractionIndexAsString = REFRACTION_INDEX_AS_STRING_EDEFAULT;
		refractionIndexAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SURFACE_STYLE_REFRACTION__REFRACTION_INDEX_AS_STRING, oldRefractionIndexAsString, REFRACTION_INDEX_AS_STRING_EDEFAULT, oldRefractionIndexAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRefractionIndexAsString() {
		return refractionIndexAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDispersionFactor() {
		return dispersionFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDispersionFactor(double newDispersionFactor) {
		double oldDispersionFactor = dispersionFactor;
		dispersionFactor = newDispersionFactor;
		boolean oldDispersionFactorESet = dispersionFactorESet;
		dispersionFactorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SURFACE_STYLE_REFRACTION__DISPERSION_FACTOR, oldDispersionFactor, dispersionFactor, !oldDispersionFactorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDispersionFactor() {
		double oldDispersionFactor = dispersionFactor;
		boolean oldDispersionFactorESet = dispersionFactorESet;
		dispersionFactor = DISPERSION_FACTOR_EDEFAULT;
		dispersionFactorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SURFACE_STYLE_REFRACTION__DISPERSION_FACTOR, oldDispersionFactor, DISPERSION_FACTOR_EDEFAULT, oldDispersionFactorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDispersionFactor() {
		return dispersionFactorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDispersionFactorAsString() {
		return dispersionFactorAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDispersionFactorAsString(String newDispersionFactorAsString) {
		String oldDispersionFactorAsString = dispersionFactorAsString;
		dispersionFactorAsString = newDispersionFactorAsString;
		boolean oldDispersionFactorAsStringESet = dispersionFactorAsStringESet;
		dispersionFactorAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SURFACE_STYLE_REFRACTION__DISPERSION_FACTOR_AS_STRING, oldDispersionFactorAsString, dispersionFactorAsString, !oldDispersionFactorAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDispersionFactorAsString() {
		String oldDispersionFactorAsString = dispersionFactorAsString;
		boolean oldDispersionFactorAsStringESet = dispersionFactorAsStringESet;
		dispersionFactorAsString = DISPERSION_FACTOR_AS_STRING_EDEFAULT;
		dispersionFactorAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SURFACE_STYLE_REFRACTION__DISPERSION_FACTOR_AS_STRING, oldDispersionFactorAsString, DISPERSION_FACTOR_AS_STRING_EDEFAULT, oldDispersionFactorAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDispersionFactorAsString() {
		return dispersionFactorAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_REFRACTION__REFRACTION_INDEX:
				return getRefractionIndex();
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_REFRACTION__REFRACTION_INDEX_AS_STRING:
				return getRefractionIndexAsString();
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_REFRACTION__DISPERSION_FACTOR:
				return getDispersionFactor();
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_REFRACTION__DISPERSION_FACTOR_AS_STRING:
				return getDispersionFactorAsString();
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
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_REFRACTION__REFRACTION_INDEX:
				setRefractionIndex((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_REFRACTION__REFRACTION_INDEX_AS_STRING:
				setRefractionIndexAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_REFRACTION__DISPERSION_FACTOR:
				setDispersionFactor((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_REFRACTION__DISPERSION_FACTOR_AS_STRING:
				setDispersionFactorAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_REFRACTION__REFRACTION_INDEX:
				unsetRefractionIndex();
				return;
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_REFRACTION__REFRACTION_INDEX_AS_STRING:
				unsetRefractionIndexAsString();
				return;
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_REFRACTION__DISPERSION_FACTOR:
				unsetDispersionFactor();
				return;
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_REFRACTION__DISPERSION_FACTOR_AS_STRING:
				unsetDispersionFactorAsString();
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
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_REFRACTION__REFRACTION_INDEX:
				return isSetRefractionIndex();
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_REFRACTION__REFRACTION_INDEX_AS_STRING:
				return isSetRefractionIndexAsString();
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_REFRACTION__DISPERSION_FACTOR:
				return isSetDispersionFactor();
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_REFRACTION__DISPERSION_FACTOR_AS_STRING:
				return isSetDispersionFactorAsString();
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
		result.append(" (RefractionIndex: ");
		if (refractionIndexESet) result.append(refractionIndex); else result.append("<unset>");
		result.append(", RefractionIndexAsString: ");
		if (refractionIndexAsStringESet) result.append(refractionIndexAsString); else result.append("<unset>");
		result.append(", DispersionFactor: ");
		if (dispersionFactorESet) result.append(dispersionFactor); else result.append("<unset>");
		result.append(", DispersionFactorAsString: ");
		if (dispersionFactorAsStringESet) result.append(dispersionFactorAsString); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcSurfaceStyleRefractionImpl
