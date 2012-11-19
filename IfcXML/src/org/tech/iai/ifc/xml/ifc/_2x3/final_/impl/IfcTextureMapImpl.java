/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextureMap;
import org.tech.iai.ifc.xml.ifc._2x3.final_.TextureMapsType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Texture Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTextureMapImpl#getTextureMaps <em>Texture Maps</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcTextureMapImpl extends IfcTextureCoordinateImpl implements IfcTextureMap {
	/**
	 * The cached value of the '{@link #getTextureMaps() <em>Texture Maps</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextureMaps()
	 * @generated
	 * @ordered
	 */
	protected TextureMapsType textureMaps;

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
		return FinalPackage.eINSTANCE.getIfcTextureMap();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextureMapsType getTextureMaps() {
		return textureMaps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextureMaps(TextureMapsType newTextureMaps, NotificationChain msgs) {
		TextureMapsType oldTextureMaps = textureMaps;
		textureMaps = newTextureMaps;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TEXTURE_MAP__TEXTURE_MAPS, oldTextureMaps, newTextureMaps);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextureMaps(TextureMapsType newTextureMaps) {
		if (newTextureMaps != textureMaps) {
			NotificationChain msgs = null;
			if (textureMaps != null)
				msgs = ((InternalEObject)textureMaps).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_TEXTURE_MAP__TEXTURE_MAPS, null, msgs);
			if (newTextureMaps != null)
				msgs = ((InternalEObject)newTextureMaps).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_TEXTURE_MAP__TEXTURE_MAPS, null, msgs);
			msgs = basicSetTextureMaps(newTextureMaps, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TEXTURE_MAP__TEXTURE_MAPS, newTextureMaps, newTextureMaps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_TEXTURE_MAP__TEXTURE_MAPS:
				return basicSetTextureMaps(null, msgs);
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
			case FinalPackage.IFC_TEXTURE_MAP__TEXTURE_MAPS:
				return getTextureMaps();
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
			case FinalPackage.IFC_TEXTURE_MAP__TEXTURE_MAPS:
				setTextureMaps((TextureMapsType)newValue);
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
			case FinalPackage.IFC_TEXTURE_MAP__TEXTURE_MAPS:
				setTextureMaps((TextureMapsType)null);
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
			case FinalPackage.IFC_TEXTURE_MAP__TEXTURE_MAPS:
				return textureMaps != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcTextureMapImpl
