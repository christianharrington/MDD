/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcCartesianTransformationOperator2D;
import ifc2x3tc1.IfcSurfaceTexture;
import ifc2x3tc1.IfcSurfaceTextureEnum;
import ifc2x3tc1.Tristate;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Surface Texture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcSurfaceTextureImpl#getRepeatS <em>Repeat S</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSurfaceTextureImpl#getRepeatT <em>Repeat T</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSurfaceTextureImpl#getTextureType <em>Texture Type</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSurfaceTextureImpl#getTextureTransform <em>Texture Transform</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcSurfaceTextureImpl extends EObjectImpl implements IfcSurfaceTexture {
	/**
	 * The default value of the '{@link #getRepeatS() <em>Repeat S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeatS()
	 * @generated
	 * @ordered
	 */
	protected static final Tristate REPEAT_S_EDEFAULT = Tristate.TRUE;

	/**
	 * The cached value of the '{@link #getRepeatS() <em>Repeat S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeatS()
	 * @generated
	 * @ordered
	 */
	protected Tristate repeatS = REPEAT_S_EDEFAULT;

	/**
	 * The default value of the '{@link #getRepeatT() <em>Repeat T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeatT()
	 * @generated
	 * @ordered
	 */
	protected static final Tristate REPEAT_T_EDEFAULT = Tristate.TRUE;

	/**
	 * The cached value of the '{@link #getRepeatT() <em>Repeat T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeatT()
	 * @generated
	 * @ordered
	 */
	protected Tristate repeatT = REPEAT_T_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextureType() <em>Texture Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextureType()
	 * @generated
	 * @ordered
	 */
	protected static final IfcSurfaceTextureEnum TEXTURE_TYPE_EDEFAULT = IfcSurfaceTextureEnum.NULL;

	/**
	 * The cached value of the '{@link #getTextureType() <em>Texture Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextureType()
	 * @generated
	 * @ordered
	 */
	protected IfcSurfaceTextureEnum textureType = TEXTURE_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTextureTransform() <em>Texture Transform</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextureTransform()
	 * @generated
	 * @ordered
	 */
	protected IfcCartesianTransformationOperator2D textureTransform;

	/**
	 * This is true if the Texture Transform reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean textureTransformESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSurfaceTextureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcSurfaceTexture();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tristate getRepeatS() {
		return repeatS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepeatS(Tristate newRepeatS) {
		Tristate oldRepeatS = repeatS;
		repeatS = newRepeatS == null ? REPEAT_S_EDEFAULT : newRepeatS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SURFACE_TEXTURE__REPEAT_S, oldRepeatS, repeatS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tristate getRepeatT() {
		return repeatT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepeatT(Tristate newRepeatT) {
		Tristate oldRepeatT = repeatT;
		repeatT = newRepeatT == null ? REPEAT_T_EDEFAULT : newRepeatT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SURFACE_TEXTURE__REPEAT_T, oldRepeatT, repeatT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSurfaceTextureEnum getTextureType() {
		return textureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextureType(IfcSurfaceTextureEnum newTextureType) {
		IfcSurfaceTextureEnum oldTextureType = textureType;
		textureType = newTextureType == null ? TEXTURE_TYPE_EDEFAULT : newTextureType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SURFACE_TEXTURE__TEXTURE_TYPE, oldTextureType, textureType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCartesianTransformationOperator2D getTextureTransform() {
		if (textureTransform != null && textureTransform.eIsProxy()) {
			InternalEObject oldTextureTransform = (InternalEObject)textureTransform;
			textureTransform = (IfcCartesianTransformationOperator2D)eResolveProxy(oldTextureTransform);
			if (textureTransform != oldTextureTransform) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_SURFACE_TEXTURE__TEXTURE_TRANSFORM, oldTextureTransform, textureTransform));
			}
		}
		return textureTransform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCartesianTransformationOperator2D basicGetTextureTransform() {
		return textureTransform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextureTransform(IfcCartesianTransformationOperator2D newTextureTransform) {
		IfcCartesianTransformationOperator2D oldTextureTransform = textureTransform;
		textureTransform = newTextureTransform;
		boolean oldTextureTransformESet = textureTransformESet;
		textureTransformESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SURFACE_TEXTURE__TEXTURE_TRANSFORM, oldTextureTransform, textureTransform, !oldTextureTransformESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTextureTransform() {
		IfcCartesianTransformationOperator2D oldTextureTransform = textureTransform;
		boolean oldTextureTransformESet = textureTransformESet;
		textureTransform = null;
		textureTransformESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SURFACE_TEXTURE__TEXTURE_TRANSFORM, oldTextureTransform, null, oldTextureTransformESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTextureTransform() {
		return textureTransformESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_SURFACE_TEXTURE__REPEAT_S:
				return getRepeatS();
			case Ifc2x3tc1Package.IFC_SURFACE_TEXTURE__REPEAT_T:
				return getRepeatT();
			case Ifc2x3tc1Package.IFC_SURFACE_TEXTURE__TEXTURE_TYPE:
				return getTextureType();
			case Ifc2x3tc1Package.IFC_SURFACE_TEXTURE__TEXTURE_TRANSFORM:
				if (resolve) return getTextureTransform();
				return basicGetTextureTransform();
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
			case Ifc2x3tc1Package.IFC_SURFACE_TEXTURE__REPEAT_S:
				setRepeatS((Tristate)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SURFACE_TEXTURE__REPEAT_T:
				setRepeatT((Tristate)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SURFACE_TEXTURE__TEXTURE_TYPE:
				setTextureType((IfcSurfaceTextureEnum)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SURFACE_TEXTURE__TEXTURE_TRANSFORM:
				setTextureTransform((IfcCartesianTransformationOperator2D)newValue);
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
			case Ifc2x3tc1Package.IFC_SURFACE_TEXTURE__REPEAT_S:
				setRepeatS(REPEAT_S_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_SURFACE_TEXTURE__REPEAT_T:
				setRepeatT(REPEAT_T_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_SURFACE_TEXTURE__TEXTURE_TYPE:
				setTextureType(TEXTURE_TYPE_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_SURFACE_TEXTURE__TEXTURE_TRANSFORM:
				unsetTextureTransform();
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
			case Ifc2x3tc1Package.IFC_SURFACE_TEXTURE__REPEAT_S:
				return repeatS != REPEAT_S_EDEFAULT;
			case Ifc2x3tc1Package.IFC_SURFACE_TEXTURE__REPEAT_T:
				return repeatT != REPEAT_T_EDEFAULT;
			case Ifc2x3tc1Package.IFC_SURFACE_TEXTURE__TEXTURE_TYPE:
				return textureType != TEXTURE_TYPE_EDEFAULT;
			case Ifc2x3tc1Package.IFC_SURFACE_TEXTURE__TEXTURE_TRANSFORM:
				return isSetTextureTransform();
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
		result.append(" (RepeatS: ");
		result.append(repeatS);
		result.append(", RepeatT: ");
		result.append(repeatT);
		result.append(", TextureType: ");
		result.append(textureType);
		result.append(')');
		return result.toString();
	}

} //IfcSurfaceTextureImpl
