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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceStyleWithTextures;
import org.tech.iai.ifc.xml.ifc._2x3.final_.TexturesType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Surface Style With Textures</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSurfaceStyleWithTexturesImpl#getTextures <em>Textures</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcSurfaceStyleWithTexturesImpl extends EntityImpl implements IfcSurfaceStyleWithTextures {
	/**
	 * The cached value of the '{@link #getTextures() <em>Textures</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextures()
	 * @generated
	 * @ordered
	 */
	protected TexturesType textures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSurfaceStyleWithTexturesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcSurfaceStyleWithTextures();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TexturesType getTextures() {
		return textures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextures(TexturesType newTextures, NotificationChain msgs) {
		TexturesType oldTextures = textures;
		textures = newTextures;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SURFACE_STYLE_WITH_TEXTURES__TEXTURES, oldTextures, newTextures);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextures(TexturesType newTextures) {
		if (newTextures != textures) {
			NotificationChain msgs = null;
			if (textures != null)
				msgs = ((InternalEObject)textures).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SURFACE_STYLE_WITH_TEXTURES__TEXTURES, null, msgs);
			if (newTextures != null)
				msgs = ((InternalEObject)newTextures).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SURFACE_STYLE_WITH_TEXTURES__TEXTURES, null, msgs);
			msgs = basicSetTextures(newTextures, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SURFACE_STYLE_WITH_TEXTURES__TEXTURES, newTextures, newTextures));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_SURFACE_STYLE_WITH_TEXTURES__TEXTURES:
				return basicSetTextures(null, msgs);
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
			case FinalPackage.IFC_SURFACE_STYLE_WITH_TEXTURES__TEXTURES:
				return getTextures();
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
			case FinalPackage.IFC_SURFACE_STYLE_WITH_TEXTURES__TEXTURES:
				setTextures((TexturesType)newValue);
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
			case FinalPackage.IFC_SURFACE_STYLE_WITH_TEXTURES__TEXTURES:
				setTextures((TexturesType)null);
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
			case FinalPackage.IFC_SURFACE_STYLE_WITH_TEXTURES__TEXTURES:
				return textures != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcSurfaceStyleWithTexturesImpl
