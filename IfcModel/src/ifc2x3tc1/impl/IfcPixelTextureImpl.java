/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcPixelTexture;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Pixel Texture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcPixelTextureImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcPixelTextureImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcPixelTextureImpl#getColourComponents <em>Colour Components</em>}</li>
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
	protected static final int WIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected int width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int HEIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected int height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getColourComponents() <em>Colour Components</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColourComponents()
	 * @generated
	 * @ordered
	 */
	protected static final int COLOUR_COMPONENTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getColourComponents() <em>Colour Components</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColourComponents()
	 * @generated
	 * @ordered
	 */
	protected int colourComponents = COLOUR_COMPONENTS_EDEFAULT;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcPixelTexture();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(int newWidth) {
		int oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PIXEL_TEXTURE__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(int newHeight) {
		int oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PIXEL_TEXTURE__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getColourComponents() {
		return colourComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColourComponents(int newColourComponents) {
		int oldColourComponents = colourComponents;
		colourComponents = newColourComponents;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PIXEL_TEXTURE__COLOUR_COMPONENTS, oldColourComponents, colourComponents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_PIXEL_TEXTURE__WIDTH:
				return getWidth();
			case Ifc2x3tc1Package.IFC_PIXEL_TEXTURE__HEIGHT:
				return getHeight();
			case Ifc2x3tc1Package.IFC_PIXEL_TEXTURE__COLOUR_COMPONENTS:
				return getColourComponents();
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
			case Ifc2x3tc1Package.IFC_PIXEL_TEXTURE__WIDTH:
				setWidth((Integer)newValue);
				return;
			case Ifc2x3tc1Package.IFC_PIXEL_TEXTURE__HEIGHT:
				setHeight((Integer)newValue);
				return;
			case Ifc2x3tc1Package.IFC_PIXEL_TEXTURE__COLOUR_COMPONENTS:
				setColourComponents((Integer)newValue);
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
			case Ifc2x3tc1Package.IFC_PIXEL_TEXTURE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_PIXEL_TEXTURE__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_PIXEL_TEXTURE__COLOUR_COMPONENTS:
				setColourComponents(COLOUR_COMPONENTS_EDEFAULT);
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
			case Ifc2x3tc1Package.IFC_PIXEL_TEXTURE__WIDTH:
				return width != WIDTH_EDEFAULT;
			case Ifc2x3tc1Package.IFC_PIXEL_TEXTURE__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case Ifc2x3tc1Package.IFC_PIXEL_TEXTURE__COLOUR_COMPONENTS:
				return colourComponents != COLOUR_COMPONENTS_EDEFAULT;
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
		result.append(" (Width: ");
		result.append(width);
		result.append(", Height: ");
		result.append(height);
		result.append(", ColourComponents: ");
		result.append(colourComponents);
		result.append(')');
		return result.toString();
	}

} //IfcPixelTextureImpl
