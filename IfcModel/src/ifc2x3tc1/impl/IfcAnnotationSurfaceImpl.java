/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcAnnotationSurface;
import ifc2x3tc1.IfcGeometricRepresentationItem;
import ifc2x3tc1.IfcTextureCoordinate;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Annotation Surface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcAnnotationSurfaceImpl#getItem <em>Item</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcAnnotationSurfaceImpl#getTextureCoordinates <em>Texture Coordinates</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcAnnotationSurfaceImpl extends IfcGeometricRepresentationItemImpl implements IfcAnnotationSurface {
	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected IfcGeometricRepresentationItem item;

	/**
	 * The cached value of the '{@link #getTextureCoordinates() <em>Texture Coordinates</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextureCoordinates()
	 * @generated
	 * @ordered
	 */
	protected IfcTextureCoordinate textureCoordinates;

	/**
	 * This is true if the Texture Coordinates reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean textureCoordinatesESet;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcAnnotationSurface();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcGeometricRepresentationItem getItem() {
		if (item != null && item.eIsProxy()) {
			InternalEObject oldItem = (InternalEObject)item;
			item = (IfcGeometricRepresentationItem)eResolveProxy(oldItem);
			if (item != oldItem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_ANNOTATION_SURFACE__ITEM, oldItem, item));
			}
		}
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcGeometricRepresentationItem basicGetItem() {
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItem(IfcGeometricRepresentationItem newItem) {
		IfcGeometricRepresentationItem oldItem = item;
		item = newItem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ANNOTATION_SURFACE__ITEM, oldItem, item));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTextureCoordinate getTextureCoordinates() {
		if (textureCoordinates != null && textureCoordinates.eIsProxy()) {
			InternalEObject oldTextureCoordinates = (InternalEObject)textureCoordinates;
			textureCoordinates = (IfcTextureCoordinate)eResolveProxy(oldTextureCoordinates);
			if (textureCoordinates != oldTextureCoordinates) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_ANNOTATION_SURFACE__TEXTURE_COORDINATES, oldTextureCoordinates, textureCoordinates));
			}
		}
		return textureCoordinates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTextureCoordinate basicGetTextureCoordinates() {
		return textureCoordinates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextureCoordinates(IfcTextureCoordinate newTextureCoordinates, NotificationChain msgs) {
		IfcTextureCoordinate oldTextureCoordinates = textureCoordinates;
		textureCoordinates = newTextureCoordinates;
		boolean oldTextureCoordinatesESet = textureCoordinatesESet;
		textureCoordinatesESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ANNOTATION_SURFACE__TEXTURE_COORDINATES, oldTextureCoordinates, newTextureCoordinates, !oldTextureCoordinatesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextureCoordinates(IfcTextureCoordinate newTextureCoordinates) {
		if (newTextureCoordinates != textureCoordinates) {
			NotificationChain msgs = null;
			if (textureCoordinates != null)
				msgs = ((InternalEObject)textureCoordinates).eInverseRemove(this, Ifc2x3tc1Package.IFC_TEXTURE_COORDINATE__ANNOTATED_SURFACE, IfcTextureCoordinate.class, msgs);
			if (newTextureCoordinates != null)
				msgs = ((InternalEObject)newTextureCoordinates).eInverseAdd(this, Ifc2x3tc1Package.IFC_TEXTURE_COORDINATE__ANNOTATED_SURFACE, IfcTextureCoordinate.class, msgs);
			msgs = basicSetTextureCoordinates(newTextureCoordinates, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldTextureCoordinatesESet = textureCoordinatesESet;
			textureCoordinatesESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ANNOTATION_SURFACE__TEXTURE_COORDINATES, newTextureCoordinates, newTextureCoordinates, !oldTextureCoordinatesESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetTextureCoordinates(NotificationChain msgs) {
		IfcTextureCoordinate oldTextureCoordinates = textureCoordinates;
		textureCoordinates = null;
		boolean oldTextureCoordinatesESet = textureCoordinatesESet;
		textureCoordinatesESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_ANNOTATION_SURFACE__TEXTURE_COORDINATES, oldTextureCoordinates, null, oldTextureCoordinatesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTextureCoordinates() {
		if (textureCoordinates != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)textureCoordinates).eInverseRemove(this, Ifc2x3tc1Package.IFC_TEXTURE_COORDINATE__ANNOTATED_SURFACE, IfcTextureCoordinate.class, msgs);
			msgs = basicUnsetTextureCoordinates(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldTextureCoordinatesESet = textureCoordinatesESet;
			textureCoordinatesESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_ANNOTATION_SURFACE__TEXTURE_COORDINATES, null, null, oldTextureCoordinatesESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTextureCoordinates() {
		return textureCoordinatesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_ANNOTATION_SURFACE__TEXTURE_COORDINATES:
				if (textureCoordinates != null)
					msgs = ((InternalEObject)textureCoordinates).eInverseRemove(this, Ifc2x3tc1Package.IFC_TEXTURE_COORDINATE__ANNOTATED_SURFACE, IfcTextureCoordinate.class, msgs);
				return basicSetTextureCoordinates((IfcTextureCoordinate)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_ANNOTATION_SURFACE__TEXTURE_COORDINATES:
				return basicUnsetTextureCoordinates(msgs);
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
			case Ifc2x3tc1Package.IFC_ANNOTATION_SURFACE__ITEM:
				if (resolve) return getItem();
				return basicGetItem();
			case Ifc2x3tc1Package.IFC_ANNOTATION_SURFACE__TEXTURE_COORDINATES:
				if (resolve) return getTextureCoordinates();
				return basicGetTextureCoordinates();
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
			case Ifc2x3tc1Package.IFC_ANNOTATION_SURFACE__ITEM:
				setItem((IfcGeometricRepresentationItem)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ANNOTATION_SURFACE__TEXTURE_COORDINATES:
				setTextureCoordinates((IfcTextureCoordinate)newValue);
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
			case Ifc2x3tc1Package.IFC_ANNOTATION_SURFACE__ITEM:
				setItem((IfcGeometricRepresentationItem)null);
				return;
			case Ifc2x3tc1Package.IFC_ANNOTATION_SURFACE__TEXTURE_COORDINATES:
				unsetTextureCoordinates();
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
			case Ifc2x3tc1Package.IFC_ANNOTATION_SURFACE__ITEM:
				return item != null;
			case Ifc2x3tc1Package.IFC_ANNOTATION_SURFACE__TEXTURE_COORDINATES:
				return isSetTextureCoordinates();
		}
		return super.eIsSet(featureID);
	}

} //IfcAnnotationSurfaceImpl
