/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcStructuralLoadSingleDisplacementDistortion;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Structural Load Single Displacement Distortion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralLoadSingleDisplacementDistortionImpl#getDistortion <em>Distortion</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralLoadSingleDisplacementDistortionImpl#getDistortionAsString <em>Distortion As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcStructuralLoadSingleDisplacementDistortionImpl extends IfcStructuralLoadSingleDisplacementImpl implements IfcStructuralLoadSingleDisplacementDistortion {
	/**
	 * The default value of the '{@link #getDistortion() <em>Distortion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistortion()
	 * @generated
	 * @ordered
	 */
	protected static final double DISTORTION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDistortion() <em>Distortion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistortion()
	 * @generated
	 * @ordered
	 */
	protected double distortion = DISTORTION_EDEFAULT;

	/**
	 * This is true if the Distortion attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean distortionESet;

	/**
	 * The default value of the '{@link #getDistortionAsString() <em>Distortion As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistortionAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String DISTORTION_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDistortionAsString() <em>Distortion As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistortionAsString()
	 * @generated
	 * @ordered
	 */
	protected String distortionAsString = DISTORTION_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Distortion As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean distortionAsStringESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcStructuralLoadSingleDisplacementDistortionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadSingleDisplacementDistortion();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDistortion() {
		return distortion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistortion(double newDistortion) {
		double oldDistortion = distortion;
		distortion = newDistortion;
		boolean oldDistortionESet = distortionESet;
		distortionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT_DISTORTION__DISTORTION, oldDistortion, distortion, !oldDistortionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDistortion() {
		double oldDistortion = distortion;
		boolean oldDistortionESet = distortionESet;
		distortion = DISTORTION_EDEFAULT;
		distortionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT_DISTORTION__DISTORTION, oldDistortion, DISTORTION_EDEFAULT, oldDistortionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDistortion() {
		return distortionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDistortionAsString() {
		return distortionAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistortionAsString(String newDistortionAsString) {
		String oldDistortionAsString = distortionAsString;
		distortionAsString = newDistortionAsString;
		boolean oldDistortionAsStringESet = distortionAsStringESet;
		distortionAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT_DISTORTION__DISTORTION_AS_STRING, oldDistortionAsString, distortionAsString, !oldDistortionAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDistortionAsString() {
		String oldDistortionAsString = distortionAsString;
		boolean oldDistortionAsStringESet = distortionAsStringESet;
		distortionAsString = DISTORTION_AS_STRING_EDEFAULT;
		distortionAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT_DISTORTION__DISTORTION_AS_STRING, oldDistortionAsString, DISTORTION_AS_STRING_EDEFAULT, oldDistortionAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDistortionAsString() {
		return distortionAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT_DISTORTION__DISTORTION:
				return getDistortion();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT_DISTORTION__DISTORTION_AS_STRING:
				return getDistortionAsString();
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT_DISTORTION__DISTORTION:
				setDistortion((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT_DISTORTION__DISTORTION_AS_STRING:
				setDistortionAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT_DISTORTION__DISTORTION:
				unsetDistortion();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT_DISTORTION__DISTORTION_AS_STRING:
				unsetDistortionAsString();
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT_DISTORTION__DISTORTION:
				return isSetDistortion();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT_DISTORTION__DISTORTION_AS_STRING:
				return isSetDistortionAsString();
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
		result.append(" (Distortion: ");
		if (distortionESet) result.append(distortion); else result.append("<unset>");
		result.append(", DistortionAsString: ");
		if (distortionAsStringESet) result.append(distortionAsString); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcStructuralLoadSingleDisplacementDistortionImpl
