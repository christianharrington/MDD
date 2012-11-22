/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPixelTexture;
import org.tech.iai.ifc.xml.ifc._2x3.final_.PixelType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Pixel Texture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcPixelTextureImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcPixelTextureImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcPixelTextureImpl#getColourComponents <em>Colour Components</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcPixelTextureImpl#getPixel <em>Pixel</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcPixelTextureImpl extends IfcSurfaceTextureImpl implements IfcPixelTexture {
	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final Long WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected Long width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final Long HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected Long height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getColourComponents() <em>Colour Components</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColourComponents()
	 * @generated
	 * @ordered
	 */
	protected static final Long COLOUR_COMPONENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColourComponents() <em>Colour Components</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColourComponents()
	 * @generated
	 * @ordered
	 */
	protected Long colourComponents = COLOUR_COMPONENTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPixel() <em>Pixel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPixel()
	 * @generated
	 * @ordered
	 */
	protected PixelType pixel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcPixelTextureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcPixelTexture();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(Long newWidth) {
		Long oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PIXEL_TEXTURE__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(Long newHeight) {
		Long oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PIXEL_TEXTURE__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getColourComponents() {
		return colourComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColourComponents(Long newColourComponents) {
		Long oldColourComponents = colourComponents;
		colourComponents = newColourComponents;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PIXEL_TEXTURE__COLOUR_COMPONENTS, oldColourComponents, colourComponents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PixelType getPixel() {
		return pixel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPixel(PixelType newPixel, NotificationChain msgs) {
		PixelType oldPixel = pixel;
		pixel = newPixel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PIXEL_TEXTURE__PIXEL, oldPixel, newPixel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPixel(PixelType newPixel) {
		if (newPixel != pixel) {
			NotificationChain msgs = null;
			if (pixel != null)
				msgs = ((InternalEObject)pixel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PIXEL_TEXTURE__PIXEL, null, msgs);
			if (newPixel != null)
				msgs = ((InternalEObject)newPixel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PIXEL_TEXTURE__PIXEL, null, msgs);
			msgs = basicSetPixel(newPixel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PIXEL_TEXTURE__PIXEL, newPixel, newPixel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_PIXEL_TEXTURE__PIXEL:
				return basicSetPixel(null, msgs);
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
			case FinalPackage.IFC_PIXEL_TEXTURE__WIDTH:
				return getWidth();
			case FinalPackage.IFC_PIXEL_TEXTURE__HEIGHT:
				return getHeight();
			case FinalPackage.IFC_PIXEL_TEXTURE__COLOUR_COMPONENTS:
				return getColourComponents();
			case FinalPackage.IFC_PIXEL_TEXTURE__PIXEL:
				return getPixel();
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
			case FinalPackage.IFC_PIXEL_TEXTURE__WIDTH:
				setWidth((Long)newValue);
				return;
			case FinalPackage.IFC_PIXEL_TEXTURE__HEIGHT:
				setHeight((Long)newValue);
				return;
			case FinalPackage.IFC_PIXEL_TEXTURE__COLOUR_COMPONENTS:
				setColourComponents((Long)newValue);
				return;
			case FinalPackage.IFC_PIXEL_TEXTURE__PIXEL:
				setPixel((PixelType)newValue);
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
			case FinalPackage.IFC_PIXEL_TEXTURE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case FinalPackage.IFC_PIXEL_TEXTURE__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case FinalPackage.IFC_PIXEL_TEXTURE__COLOUR_COMPONENTS:
				setColourComponents(COLOUR_COMPONENTS_EDEFAULT);
				return;
			case FinalPackage.IFC_PIXEL_TEXTURE__PIXEL:
				setPixel((PixelType)null);
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
			case FinalPackage.IFC_PIXEL_TEXTURE__WIDTH:
				return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
			case FinalPackage.IFC_PIXEL_TEXTURE__HEIGHT:
				return HEIGHT_EDEFAULT == null ? height != null : !HEIGHT_EDEFAULT.equals(height);
			case FinalPackage.IFC_PIXEL_TEXTURE__COLOUR_COMPONENTS:
				return COLOUR_COMPONENTS_EDEFAULT == null ? colourComponents != null : !COLOUR_COMPONENTS_EDEFAULT.equals(colourComponents);
			case FinalPackage.IFC_PIXEL_TEXTURE__PIXEL:
				return pixel != null;
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
		result.append(" (width: ");
		result.append(width);
		result.append(", height: ");
		result.append(height);
		result.append(", colourComponents: ");
		result.append(colourComponents);
		result.append(')');
		return result.toString();
	}

} //IfcPixelTextureImpl
