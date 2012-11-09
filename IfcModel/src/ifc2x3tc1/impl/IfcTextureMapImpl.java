/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcTextureMap;
import ifc2x3tc1.IfcVertexBasedTextureMap;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Texture Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcTextureMapImpl#getTextureMaps <em>Texture Maps</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcTextureMapImpl extends IfcTextureCoordinateImpl implements IfcTextureMap {
	/**
	 * The cached value of the '{@link #getTextureMaps() <em>Texture Maps</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextureMaps()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcVertexBasedTextureMap> textureMaps;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcTextureMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcTextureMap();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcVertexBasedTextureMap> getTextureMaps() {
		if (textureMaps == null) {
			textureMaps = new EObjectResolvingEList<IfcVertexBasedTextureMap>(IfcVertexBasedTextureMap.class, this, Ifc2x3tc1Package.IFC_TEXTURE_MAP__TEXTURE_MAPS);
		}
		return textureMaps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_TEXTURE_MAP__TEXTURE_MAPS:
				return getTextureMaps();
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
			case Ifc2x3tc1Package.IFC_TEXTURE_MAP__TEXTURE_MAPS:
				getTextureMaps().clear();
				getTextureMaps().addAll((Collection<? extends IfcVertexBasedTextureMap>)newValue);
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
			case Ifc2x3tc1Package.IFC_TEXTURE_MAP__TEXTURE_MAPS:
				getTextureMaps().clear();
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
			case Ifc2x3tc1Package.IFC_TEXTURE_MAP__TEXTURE_MAPS:
				return textureMaps != null && !textureMaps.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IfcTextureMapImpl
