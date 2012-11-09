/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcCartesianPoint;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Cartesian Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcCartesianPointImpl#getCoordinates <em>Coordinates</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcCartesianPointImpl#getCoordinatesAsString <em>Coordinates As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcCartesianPointImpl#getDim <em>Dim</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcCartesianPointImpl extends IfcPointImpl implements IfcCartesianPoint {
	/**
	 * The cached value of the '{@link #getCoordinates() <em>Coordinates</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinates()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> coordinates;

	/**
	 * The cached value of the '{@link #getCoordinatesAsString() <em>Coordinates As String</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinatesAsString()
	 * @generated
	 * @ordered
	 */
	protected EList<String> coordinatesAsString;

	/**
	 * The default value of the '{@link #getDim() <em>Dim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDim()
	 * @generated
	 * @ordered
	 */
	protected static final int DIM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDim() <em>Dim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDim()
	 * @generated
	 * @ordered
	 */
	protected int dim = DIM_EDEFAULT;

	/**
	 * This is true if the Dim attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dimESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcCartesianPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcCartesianPoint();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Double> getCoordinates() {
		if (coordinates == null) {
			coordinates = new EDataTypeEList<Double>(Double.class, this, Ifc2x3tc1Package.IFC_CARTESIAN_POINT__COORDINATES);
		}
		return coordinates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getCoordinatesAsString() {
		if (coordinatesAsString == null) {
			coordinatesAsString = new EDataTypeEList<String>(String.class, this, Ifc2x3tc1Package.IFC_CARTESIAN_POINT__COORDINATES_AS_STRING);
		}
		return coordinatesAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDim() {
		return dim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDim(int newDim) {
		int oldDim = dim;
		dim = newDim;
		boolean oldDimESet = dimESet;
		dimESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CARTESIAN_POINT__DIM, oldDim, dim, !oldDimESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDim() {
		int oldDim = dim;
		boolean oldDimESet = dimESet;
		dim = DIM_EDEFAULT;
		dimESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_CARTESIAN_POINT__DIM, oldDim, DIM_EDEFAULT, oldDimESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDim() {
		return dimESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_CARTESIAN_POINT__COORDINATES:
				return getCoordinates();
			case Ifc2x3tc1Package.IFC_CARTESIAN_POINT__COORDINATES_AS_STRING:
				return getCoordinatesAsString();
			case Ifc2x3tc1Package.IFC_CARTESIAN_POINT__DIM:
				return getDim();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_CARTESIAN_POINT__COORDINATES:
				getCoordinates().clear();
				getCoordinates().addAll((Collection<? extends Double>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CARTESIAN_POINT__COORDINATES_AS_STRING:
				getCoordinatesAsString().clear();
				getCoordinatesAsString().addAll((Collection<? extends String>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CARTESIAN_POINT__DIM:
				setDim((Integer)newValue);
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
			case Ifc2x3tc1Package.IFC_CARTESIAN_POINT__COORDINATES:
				getCoordinates().clear();
				return;
			case Ifc2x3tc1Package.IFC_CARTESIAN_POINT__COORDINATES_AS_STRING:
				getCoordinatesAsString().clear();
				return;
			case Ifc2x3tc1Package.IFC_CARTESIAN_POINT__DIM:
				unsetDim();
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
			case Ifc2x3tc1Package.IFC_CARTESIAN_POINT__COORDINATES:
				return coordinates != null && !coordinates.isEmpty();
			case Ifc2x3tc1Package.IFC_CARTESIAN_POINT__COORDINATES_AS_STRING:
				return coordinatesAsString != null && !coordinatesAsString.isEmpty();
			case Ifc2x3tc1Package.IFC_CARTESIAN_POINT__DIM:
				return isSetDim();
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
		result.append(" (Coordinates: ");
		result.append(coordinates);
		result.append(", CoordinatesAsString: ");
		result.append(coordinatesAsString);
		result.append(", Dim: ");
		if (dimESet) result.append(dim); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcCartesianPointImpl
