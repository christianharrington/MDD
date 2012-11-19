/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.EntityImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcVertexBasedTextureMap;
import org.tech.iai.ifc.xml.ifc._2x3.final_.TexturePointsType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.TextureVerticesType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Vertex Based Texture Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcVertexBasedTextureMapImpl#getTextureVertices <em>Texture Vertices</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcVertexBasedTextureMapImpl#getTexturePoints <em>Texture Points</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcVertexBasedTextureMapImpl extends EntityImpl implements IfcVertexBasedTextureMap {
	/**
	 * The cached value of the '{@link #getTextureVertices() <em>Texture Vertices</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextureVertices()
	 * @generated
	 * @ordered
	 */
	protected TextureVerticesType textureVertices;

	/**
	 * The cached value of the '{@link #getTexturePoints() <em>Texture Points</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTexturePoints()
	 * @generated
	 * @ordered
	 */
	protected TexturePointsType texturePoints;

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
		return FinalPackage.eINSTANCE.getIfcVertexBasedTextureMap();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextureVerticesType getTextureVertices() {
		return textureVertices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextureVertices(TextureVerticesType newTextureVertices, NotificationChain msgs) {
		TextureVerticesType oldTextureVertices = textureVertices;
		textureVertices = newTextureVertices;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_VERTEX_BASED_TEXTURE_MAP__TEXTURE_VERTICES, oldTextureVertices, newTextureVertices);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextureVertices(TextureVerticesType newTextureVertices) {
		if (newTextureVertices != textureVertices) {
			NotificationChain msgs = null;
			if (textureVertices != null)
				msgs = ((InternalEObject)textureVertices).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_VERTEX_BASED_TEXTURE_MAP__TEXTURE_VERTICES, null, msgs);
			if (newTextureVertices != null)
				msgs = ((InternalEObject)newTextureVertices).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_VERTEX_BASED_TEXTURE_MAP__TEXTURE_VERTICES, null, msgs);
			msgs = basicSetTextureVertices(newTextureVertices, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_VERTEX_BASED_TEXTURE_MAP__TEXTURE_VERTICES, newTextureVertices, newTextureVertices));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TexturePointsType getTexturePoints() {
		return texturePoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTexturePoints(TexturePointsType newTexturePoints, NotificationChain msgs) {
		TexturePointsType oldTexturePoints = texturePoints;
		texturePoints = newTexturePoints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_VERTEX_BASED_TEXTURE_MAP__TEXTURE_POINTS, oldTexturePoints, newTexturePoints);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTexturePoints(TexturePointsType newTexturePoints) {
		if (newTexturePoints != texturePoints) {
			NotificationChain msgs = null;
			if (texturePoints != null)
				msgs = ((InternalEObject)texturePoints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_VERTEX_BASED_TEXTURE_MAP__TEXTURE_POINTS, null, msgs);
			if (newTexturePoints != null)
				msgs = ((InternalEObject)newTexturePoints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_VERTEX_BASED_TEXTURE_MAP__TEXTURE_POINTS, null, msgs);
			msgs = basicSetTexturePoints(newTexturePoints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_VERTEX_BASED_TEXTURE_MAP__TEXTURE_POINTS, newTexturePoints, newTexturePoints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_VERTEX_BASED_TEXTURE_MAP__TEXTURE_VERTICES:
				return basicSetTextureVertices(null, msgs);
			case FinalPackage.IFC_VERTEX_BASED_TEXTURE_MAP__TEXTURE_POINTS:
				return basicSetTexturePoints(null, msgs);
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
			case FinalPackage.IFC_VERTEX_BASED_TEXTURE_MAP__TEXTURE_VERTICES:
				return getTextureVertices();
			case FinalPackage.IFC_VERTEX_BASED_TEXTURE_MAP__TEXTURE_POINTS:
				return getTexturePoints();
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
			case FinalPackage.IFC_VERTEX_BASED_TEXTURE_MAP__TEXTURE_VERTICES:
				setTextureVertices((TextureVerticesType)newValue);
				return;
			case FinalPackage.IFC_VERTEX_BASED_TEXTURE_MAP__TEXTURE_POINTS:
				setTexturePoints((TexturePointsType)newValue);
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
			case FinalPackage.IFC_VERTEX_BASED_TEXTURE_MAP__TEXTURE_VERTICES:
				setTextureVertices((TextureVerticesType)null);
				return;
			case FinalPackage.IFC_VERTEX_BASED_TEXTURE_MAP__TEXTURE_POINTS:
				setTexturePoints((TexturePointsType)null);
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
			case FinalPackage.IFC_VERTEX_BASED_TEXTURE_MAP__TEXTURE_VERTICES:
				return textureVertices != null;
			case FinalPackage.IFC_VERTEX_BASED_TEXTURE_MAP__TEXTURE_POINTS:
				return texturePoints != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcVertexBasedTextureMapImpl
