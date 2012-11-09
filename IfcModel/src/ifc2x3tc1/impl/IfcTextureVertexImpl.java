/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcTextureVertex;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Texture Vertex</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcTextureVertexImpl#getCoordinates <em>Coordinates</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTextureVertexImpl#getCoordinatesAsString <em>Coordinates As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcTextureVertexImpl extends EObjectImpl implements IfcTextureVertex {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcTextureVertexImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcTextureVertex();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Double> getCoordinates() {
		if (coordinates == null) {
			coordinates = new EDataTypeEList<Double>(Double.class, this, Ifc2x3tc1Package.IFC_TEXTURE_VERTEX__COORDINATES);
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
			coordinatesAsString = new EDataTypeEList<String>(String.class, this, Ifc2x3tc1Package.IFC_TEXTURE_VERTEX__COORDINATES_AS_STRING);
		}
		return coordinatesAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_TEXTURE_VERTEX__COORDINATES:
				return getCoordinates();
			case Ifc2x3tc1Package.IFC_TEXTURE_VERTEX__COORDINATES_AS_STRING:
				return getCoordinatesAsString();
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
			case Ifc2x3tc1Package.IFC_TEXTURE_VERTEX__COORDINATES:
				getCoordinates().clear();
				getCoordinates().addAll((Collection<? extends Double>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TEXTURE_VERTEX__COORDINATES_AS_STRING:
				getCoordinatesAsString().clear();
				getCoordinatesAsString().addAll((Collection<? extends String>)newValue);
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
			case Ifc2x3tc1Package.IFC_TEXTURE_VERTEX__COORDINATES:
				getCoordinates().clear();
				return;
			case Ifc2x3tc1Package.IFC_TEXTURE_VERTEX__COORDINATES_AS_STRING:
				getCoordinatesAsString().clear();
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
			case Ifc2x3tc1Package.IFC_TEXTURE_VERTEX__COORDINATES:
				return coordinates != null && !coordinates.isEmpty();
			case Ifc2x3tc1Package.IFC_TEXTURE_VERTEX__COORDINATES_AS_STRING:
				return coordinatesAsString != null && !coordinatesAsString.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //IfcTextureVertexImpl
