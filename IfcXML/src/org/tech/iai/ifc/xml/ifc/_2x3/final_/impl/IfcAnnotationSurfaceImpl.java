/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAnnotationSurface;
import org.tech.iai.ifc.xml.ifc._2x3.final_.ItemType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.TextureCoordinatesType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Annotation Surface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcAnnotationSurfaceImpl#getItem <em>Item</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcAnnotationSurfaceImpl#getTextureCoordinates <em>Texture Coordinates</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcAnnotationSurfaceImpl extends IfcGeometricRepresentationItemImpl implements IfcAnnotationSurface {
	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected ItemType item;

	/**
	 * The cached value of the '{@link #getTextureCoordinates() <em>Texture Coordinates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextureCoordinates()
	 * @generated
	 * @ordered
	 */
	protected TextureCoordinatesType textureCoordinates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcAnnotationSurfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcAnnotationSurface();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemType getItem() {
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItem(ItemType newItem, NotificationChain msgs) {
		ItemType oldItem = item;
		item = newItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_ANNOTATION_SURFACE__ITEM, oldItem, newItem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItem(ItemType newItem) {
		if (newItem != item) {
			NotificationChain msgs = null;
			if (item != null)
				msgs = ((InternalEObject)item).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_ANNOTATION_SURFACE__ITEM, null, msgs);
			if (newItem != null)
				msgs = ((InternalEObject)newItem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_ANNOTATION_SURFACE__ITEM, null, msgs);
			msgs = basicSetItem(newItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_ANNOTATION_SURFACE__ITEM, newItem, newItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextureCoordinatesType getTextureCoordinates() {
		return textureCoordinates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextureCoordinates(TextureCoordinatesType newTextureCoordinates, NotificationChain msgs) {
		TextureCoordinatesType oldTextureCoordinates = textureCoordinates;
		textureCoordinates = newTextureCoordinates;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_ANNOTATION_SURFACE__TEXTURE_COORDINATES, oldTextureCoordinates, newTextureCoordinates);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextureCoordinates(TextureCoordinatesType newTextureCoordinates) {
		if (newTextureCoordinates != textureCoordinates) {
			NotificationChain msgs = null;
			if (textureCoordinates != null)
				msgs = ((InternalEObject)textureCoordinates).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_ANNOTATION_SURFACE__TEXTURE_COORDINATES, null, msgs);
			if (newTextureCoordinates != null)
				msgs = ((InternalEObject)newTextureCoordinates).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_ANNOTATION_SURFACE__TEXTURE_COORDINATES, null, msgs);
			msgs = basicSetTextureCoordinates(newTextureCoordinates, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_ANNOTATION_SURFACE__TEXTURE_COORDINATES, newTextureCoordinates, newTextureCoordinates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_ANNOTATION_SURFACE__ITEM:
				return basicSetItem(null, msgs);
			case FinalPackage.IFC_ANNOTATION_SURFACE__TEXTURE_COORDINATES:
				return basicSetTextureCoordinates(null, msgs);
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
			case FinalPackage.IFC_ANNOTATION_SURFACE__ITEM:
				return getItem();
			case FinalPackage.IFC_ANNOTATION_SURFACE__TEXTURE_COORDINATES:
				return getTextureCoordinates();
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
			case FinalPackage.IFC_ANNOTATION_SURFACE__ITEM:
				setItem((ItemType)newValue);
				return;
			case FinalPackage.IFC_ANNOTATION_SURFACE__TEXTURE_COORDINATES:
				setTextureCoordinates((TextureCoordinatesType)newValue);
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
			case FinalPackage.IFC_ANNOTATION_SURFACE__ITEM:
				setItem((ItemType)null);
				return;
			case FinalPackage.IFC_ANNOTATION_SURFACE__TEXTURE_COORDINATES:
				setTextureCoordinates((TextureCoordinatesType)null);
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
			case FinalPackage.IFC_ANNOTATION_SURFACE__ITEM:
				return item != null;
			case FinalPackage.IFC_ANNOTATION_SURFACE__TEXTURE_COORDINATES:
				return textureCoordinates != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcAnnotationSurfaceImpl
