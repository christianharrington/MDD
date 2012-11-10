/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcEdgeFeature;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Edge Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcEdgeFeatureImpl#getFeatureLength <em>Feature Length</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcEdgeFeatureImpl#getFeatureLengthAsString <em>Feature Length As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcEdgeFeatureImpl extends IfcFeatureElementSubtractionImpl implements IfcEdgeFeature {
	/**
	 * The default value of the '{@link #getFeatureLength() <em>Feature Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureLength()
	 * @generated
	 * @ordered
	 */
	protected static final double FEATURE_LENGTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFeatureLength() <em>Feature Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureLength()
	 * @generated
	 * @ordered
	 */
	protected double featureLength = FEATURE_LENGTH_EDEFAULT;

	/**
	 * This is true if the Feature Length attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean featureLengthESet;

	/**
	 * The default value of the '{@link #getFeatureLengthAsString() <em>Feature Length As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureLengthAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String FEATURE_LENGTH_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFeatureLengthAsString() <em>Feature Length As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureLengthAsString()
	 * @generated
	 * @ordered
	 */
	protected String featureLengthAsString = FEATURE_LENGTH_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Feature Length As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean featureLengthAsStringESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcEdgeFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcEdgeFeature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFeatureLength() {
		return featureLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureLength(double newFeatureLength) {
		double oldFeatureLength = featureLength;
		featureLength = newFeatureLength;
		boolean oldFeatureLengthESet = featureLengthESet;
		featureLengthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_EDGE_FEATURE__FEATURE_LENGTH, oldFeatureLength, featureLength, !oldFeatureLengthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFeatureLength() {
		double oldFeatureLength = featureLength;
		boolean oldFeatureLengthESet = featureLengthESet;
		featureLength = FEATURE_LENGTH_EDEFAULT;
		featureLengthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_EDGE_FEATURE__FEATURE_LENGTH, oldFeatureLength, FEATURE_LENGTH_EDEFAULT, oldFeatureLengthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFeatureLength() {
		return featureLengthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFeatureLengthAsString() {
		return featureLengthAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureLengthAsString(String newFeatureLengthAsString) {
		String oldFeatureLengthAsString = featureLengthAsString;
		featureLengthAsString = newFeatureLengthAsString;
		boolean oldFeatureLengthAsStringESet = featureLengthAsStringESet;
		featureLengthAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_EDGE_FEATURE__FEATURE_LENGTH_AS_STRING, oldFeatureLengthAsString, featureLengthAsString, !oldFeatureLengthAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFeatureLengthAsString() {
		String oldFeatureLengthAsString = featureLengthAsString;
		boolean oldFeatureLengthAsStringESet = featureLengthAsStringESet;
		featureLengthAsString = FEATURE_LENGTH_AS_STRING_EDEFAULT;
		featureLengthAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_EDGE_FEATURE__FEATURE_LENGTH_AS_STRING, oldFeatureLengthAsString, FEATURE_LENGTH_AS_STRING_EDEFAULT, oldFeatureLengthAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFeatureLengthAsString() {
		return featureLengthAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_EDGE_FEATURE__FEATURE_LENGTH:
				return getFeatureLength();
			case Ifc2x3tc1Package.IFC_EDGE_FEATURE__FEATURE_LENGTH_AS_STRING:
				return getFeatureLengthAsString();
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
			case Ifc2x3tc1Package.IFC_EDGE_FEATURE__FEATURE_LENGTH:
				setFeatureLength((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_EDGE_FEATURE__FEATURE_LENGTH_AS_STRING:
				setFeatureLengthAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_EDGE_FEATURE__FEATURE_LENGTH:
				unsetFeatureLength();
				return;
			case Ifc2x3tc1Package.IFC_EDGE_FEATURE__FEATURE_LENGTH_AS_STRING:
				unsetFeatureLengthAsString();
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
			case Ifc2x3tc1Package.IFC_EDGE_FEATURE__FEATURE_LENGTH:
				return isSetFeatureLength();
			case Ifc2x3tc1Package.IFC_EDGE_FEATURE__FEATURE_LENGTH_AS_STRING:
				return isSetFeatureLengthAsString();
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
		result.append(" (FeatureLength: ");
		if (featureLengthESet) result.append(featureLength); else result.append("<unset>");
		result.append(", FeatureLengthAsString: ");
		if (featureLengthAsStringESet) result.append(featureLengthAsString); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcEdgeFeatureImpl
