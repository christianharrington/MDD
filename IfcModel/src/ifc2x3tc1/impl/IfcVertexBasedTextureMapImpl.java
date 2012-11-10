/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcCartesianPoint;
import ifc2x3tc1.IfcTextureVertex;
import ifc2x3tc1.IfcVertexBasedTextureMap;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Vertex Based Texture Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcVertexBasedTextureMapImpl#getTextureVertices <em>Texture Vertices</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcVertexBasedTextureMapImpl#getTexturePoints <em>Texture Points</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcVertexBasedTextureMapImpl extends EObjectImpl implements IfcVertexBasedTextureMap {
	/**
	 * The cached value of the '{@link #getTextureVertices() <em>Texture Vertices</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextureVertices()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcTextureVertex> textureVertices;

	/**
	 * The cached value of the '{@link #getTexturePoints() <em>Texture Points</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTexturePoints()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcCartesianPoint> texturePoints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcVertexBasedTextureMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcVertexBasedTextureMap();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcTextureVertex> getTextureVertices() {
		if (textureVertices == null) {
			textureVertices = new EObjectResolvingEList<IfcTextureVertex>(IfcTextureVertex.class, this, Ifc2x3tc1Package.IFC_VERTEX_BASED_TEXTURE_MAP__TEXTURE_VERTICES);
		}
		return textureVertices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcCartesianPoint> getTexturePoints() {
		if (texturePoints == null) {
			texturePoints = new EObjectResolvingEList<IfcCartesianPoint>(IfcCartesianPoint.class, this, Ifc2x3tc1Package.IFC_VERTEX_BASED_TEXTURE_MAP__TEXTURE_POINTS);
		}
		return texturePoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_VERTEX_BASED_TEXTURE_MAP__TEXTURE_VERTICES:
				return getTextureVertices();
			case Ifc2x3tc1Package.IFC_VERTEX_BASED_TEXTURE_MAP__TEXTURE_POINTS:
				return getTexturePoints();
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
			case Ifc2x3tc1Package.IFC_VERTEX_BASED_TEXTURE_MAP__TEXTURE_VERTICES:
				getTextureVertices().clear();
				getTextureVertices().addAll((Collection<? extends IfcTextureVertex>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_VERTEX_BASED_TEXTURE_MAP__TEXTURE_POINTS:
				getTexturePoints().clear();
				getTexturePoints().addAll((Collection<? extends IfcCartesianPoint>)newValue);
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
			case Ifc2x3tc1Package.IFC_VERTEX_BASED_TEXTURE_MAP__TEXTURE_VERTICES:
				getTextureVertices().clear();
				return;
			case Ifc2x3tc1Package.IFC_VERTEX_BASED_TEXTURE_MAP__TEXTURE_POINTS:
				getTexturePoints().clear();
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
			case Ifc2x3tc1Package.IFC_VERTEX_BASED_TEXTURE_MAP__TEXTURE_VERTICES:
				return textureVertices != null && !textureVertices.isEmpty();
			case Ifc2x3tc1Package.IFC_VERTEX_BASED_TEXTURE_MAP__TEXTURE_POINTS:
				return texturePoints != null && !texturePoints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IfcVertexBasedTextureMapImpl
