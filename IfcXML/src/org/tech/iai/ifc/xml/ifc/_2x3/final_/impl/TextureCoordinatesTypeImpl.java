/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextureCoordinate;
import org.tech.iai.ifc.xml.ifc._2x3.final_.TextureCoordinatesType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Texture Coordinates Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.TextureCoordinatesTypeImpl#getIfcTextureCoordinateGroup <em>Ifc Texture Coordinate Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.TextureCoordinatesTypeImpl#getIfcTextureCoordinate <em>Ifc Texture Coordinate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextureCoordinatesTypeImpl extends EObjectImpl implements TextureCoordinatesType {
	/**
	 * The cached value of the '{@link #getIfcTextureCoordinateGroup() <em>Ifc Texture Coordinate Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcTextureCoordinateGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcTextureCoordinateGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextureCoordinatesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getTextureCoordinatesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcTextureCoordinateGroup() {
		if (ifcTextureCoordinateGroup == null) {
			ifcTextureCoordinateGroup = new BasicFeatureMap(this, FinalPackage.TEXTURE_COORDINATES_TYPE__IFC_TEXTURE_COORDINATE_GROUP);
		}
		return ifcTextureCoordinateGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTextureCoordinate getIfcTextureCoordinate() {
		return (IfcTextureCoordinate)getIfcTextureCoordinateGroup().get(FinalPackage.eINSTANCE.getTextureCoordinatesType_IfcTextureCoordinate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcTextureCoordinate(IfcTextureCoordinate newIfcTextureCoordinate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcTextureCoordinateGroup()).basicAdd(FinalPackage.eINSTANCE.getTextureCoordinatesType_IfcTextureCoordinate(), newIfcTextureCoordinate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.TEXTURE_COORDINATES_TYPE__IFC_TEXTURE_COORDINATE_GROUP:
				return ((InternalEList<?>)getIfcTextureCoordinateGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.TEXTURE_COORDINATES_TYPE__IFC_TEXTURE_COORDINATE:
				return basicSetIfcTextureCoordinate(null, msgs);
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
			case FinalPackage.TEXTURE_COORDINATES_TYPE__IFC_TEXTURE_COORDINATE_GROUP:
				if (coreType) return getIfcTextureCoordinateGroup();
				return ((FeatureMap.Internal)getIfcTextureCoordinateGroup()).getWrapper();
			case FinalPackage.TEXTURE_COORDINATES_TYPE__IFC_TEXTURE_COORDINATE:
				return getIfcTextureCoordinate();
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
			case FinalPackage.TEXTURE_COORDINATES_TYPE__IFC_TEXTURE_COORDINATE_GROUP:
				((FeatureMap.Internal)getIfcTextureCoordinateGroup()).set(newValue);
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
			case FinalPackage.TEXTURE_COORDINATES_TYPE__IFC_TEXTURE_COORDINATE_GROUP:
				getIfcTextureCoordinateGroup().clear();
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
			case FinalPackage.TEXTURE_COORDINATES_TYPE__IFC_TEXTURE_COORDINATE_GROUP:
				return ifcTextureCoordinateGroup != null && !ifcTextureCoordinateGroup.isEmpty();
			case FinalPackage.TEXTURE_COORDINATES_TYPE__IFC_TEXTURE_COORDINATE:
				return getIfcTextureCoordinate() != null;
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
		result.append(" (ifcTextureCoordinateGroup: ");
		result.append(ifcTextureCoordinateGroup);
		result.append(')');
		return result.toString();
	}

} //TextureCoordinatesTypeImpl
