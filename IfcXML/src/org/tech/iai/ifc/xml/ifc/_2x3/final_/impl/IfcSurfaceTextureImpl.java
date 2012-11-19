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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceTexture;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceTextureEnum;
import org.tech.iai.ifc.xml.ifc._2x3.final_.TextureTransformType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Surface Texture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSurfaceTextureImpl#isRepeatS <em>Repeat S</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSurfaceTextureImpl#isRepeatT <em>Repeat T</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSurfaceTextureImpl#getTextureType <em>Texture Type</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSurfaceTextureImpl#getTextureTransform <em>Texture Transform</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class IfcSurfaceTextureImpl extends EntityImpl implements IfcSurfaceTexture {
	/**
	 * The default value of the '{@link #isRepeatS() <em>Repeat S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRepeatS()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REPEAT_S_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRepeatS() <em>Repeat S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRepeatS()
	 * @generated
	 * @ordered
	 */
	protected boolean repeatS = REPEAT_S_EDEFAULT;

	/**
	 * The default value of the '{@link #isRepeatT() <em>Repeat T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRepeatT()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REPEAT_T_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRepeatT() <em>Repeat T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRepeatT()
	 * @generated
	 * @ordered
	 */
	protected boolean repeatT = REPEAT_T_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextureType() <em>Texture Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextureType()
	 * @generated
	 * @ordered
	 */
	protected static final IfcSurfaceTextureEnum TEXTURE_TYPE_EDEFAULT = IfcSurfaceTextureEnum.BUMP;

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
	 * The cached value of the '{@link #getTextureTransform() <em>Texture Transform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextureTransform()
	 * @generated
	 * @ordered
	 */
	protected TextureTransformType textureTransform;

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
		return FinalPackage.eINSTANCE.getIfcSurfaceTexture();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRepeatS() {
		return repeatS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepeatS(boolean newRepeatS) {
		boolean oldRepeatS = repeatS;
		repeatS = newRepeatS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SURFACE_TEXTURE__REPEAT_S, oldRepeatS, repeatS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRepeatT() {
		return repeatT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepeatT(boolean newRepeatT) {
		boolean oldRepeatT = repeatT;
		repeatT = newRepeatT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SURFACE_TEXTURE__REPEAT_T, oldRepeatT, repeatT));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SURFACE_TEXTURE__TEXTURE_TYPE, oldTextureType, textureType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextureTransformType getTextureTransform() {
		return textureTransform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextureTransform(TextureTransformType newTextureTransform, NotificationChain msgs) {
		TextureTransformType oldTextureTransform = textureTransform;
		textureTransform = newTextureTransform;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SURFACE_TEXTURE__TEXTURE_TRANSFORM, oldTextureTransform, newTextureTransform);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextureTransform(TextureTransformType newTextureTransform) {
		if (newTextureTransform != textureTransform) {
			NotificationChain msgs = null;
			if (textureTransform != null)
				msgs = ((InternalEObject)textureTransform).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SURFACE_TEXTURE__TEXTURE_TRANSFORM, null, msgs);
			if (newTextureTransform != null)
				msgs = ((InternalEObject)newTextureTransform).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SURFACE_TEXTURE__TEXTURE_TRANSFORM, null, msgs);
			msgs = basicSetTextureTransform(newTextureTransform, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SURFACE_TEXTURE__TEXTURE_TRANSFORM, newTextureTransform, newTextureTransform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_SURFACE_TEXTURE__TEXTURE_TRANSFORM:
				return basicSetTextureTransform(null, msgs);
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
			case FinalPackage.IFC_SURFACE_TEXTURE__REPEAT_S:
				return isRepeatS();
			case FinalPackage.IFC_SURFACE_TEXTURE__REPEAT_T:
				return isRepeatT();
			case FinalPackage.IFC_SURFACE_TEXTURE__TEXTURE_TYPE:
				return getTextureType();
			case FinalPackage.IFC_SURFACE_TEXTURE__TEXTURE_TRANSFORM:
				return getTextureTransform();
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
			case FinalPackage.IFC_SURFACE_TEXTURE__REPEAT_S:
				setRepeatS((Boolean)newValue);
				return;
			case FinalPackage.IFC_SURFACE_TEXTURE__REPEAT_T:
				setRepeatT((Boolean)newValue);
				return;
			case FinalPackage.IFC_SURFACE_TEXTURE__TEXTURE_TYPE:
				setTextureType((IfcSurfaceTextureEnum)newValue);
				return;
			case FinalPackage.IFC_SURFACE_TEXTURE__TEXTURE_TRANSFORM:
				setTextureTransform((TextureTransformType)newValue);
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
			case FinalPackage.IFC_SURFACE_TEXTURE__REPEAT_S:
				setRepeatS(REPEAT_S_EDEFAULT);
				return;
			case FinalPackage.IFC_SURFACE_TEXTURE__REPEAT_T:
				setRepeatT(REPEAT_T_EDEFAULT);
				return;
			case FinalPackage.IFC_SURFACE_TEXTURE__TEXTURE_TYPE:
				setTextureType(TEXTURE_TYPE_EDEFAULT);
				return;
			case FinalPackage.IFC_SURFACE_TEXTURE__TEXTURE_TRANSFORM:
				setTextureTransform((TextureTransformType)null);
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
			case FinalPackage.IFC_SURFACE_TEXTURE__REPEAT_S:
				return repeatS != REPEAT_S_EDEFAULT;
			case FinalPackage.IFC_SURFACE_TEXTURE__REPEAT_T:
				return repeatT != REPEAT_T_EDEFAULT;
			case FinalPackage.IFC_SURFACE_TEXTURE__TEXTURE_TYPE:
				return textureType != TEXTURE_TYPE_EDEFAULT;
			case FinalPackage.IFC_SURFACE_TEXTURE__TEXTURE_TRANSFORM:
				return textureTransform != null;
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
		result.append(" (repeatS: ");
		result.append(repeatS);
		result.append(", repeatT: ");
		result.append(repeatT);
		result.append(", textureType: ");
		result.append(textureType);
		result.append(')');
		return result.toString();
	}

} //IfcSurfaceTextureImpl
