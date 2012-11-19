/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextStyleTextModel;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextStyleWithBoxCharacteristics;
import org.tech.iai.ifc.xml.ifc._2x3.final_.TextStyleType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Style Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.TextStyleTypeImpl#getIfcTextStyleWithBoxCharacteristics <em>Ifc Text Style With Box Characteristics</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.TextStyleTypeImpl#getIfcTextStyleTextModel <em>Ifc Text Style Text Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextStyleTypeImpl extends EObjectImpl implements TextStyleType {
	/**
	 * The cached value of the '{@link #getIfcTextStyleWithBoxCharacteristics() <em>Ifc Text Style With Box Characteristics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcTextStyleWithBoxCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected IfcTextStyleWithBoxCharacteristics ifcTextStyleWithBoxCharacteristics;

	/**
	 * The cached value of the '{@link #getIfcTextStyleTextModel() <em>Ifc Text Style Text Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcTextStyleTextModel()
	 * @generated
	 * @ordered
	 */
	protected IfcTextStyleTextModel ifcTextStyleTextModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextStyleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getTextStyleType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTextStyleWithBoxCharacteristics getIfcTextStyleWithBoxCharacteristics() {
		return ifcTextStyleWithBoxCharacteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcTextStyleWithBoxCharacteristics(IfcTextStyleWithBoxCharacteristics newIfcTextStyleWithBoxCharacteristics, NotificationChain msgs) {
		IfcTextStyleWithBoxCharacteristics oldIfcTextStyleWithBoxCharacteristics = ifcTextStyleWithBoxCharacteristics;
		ifcTextStyleWithBoxCharacteristics = newIfcTextStyleWithBoxCharacteristics;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.TEXT_STYLE_TYPE__IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS, oldIfcTextStyleWithBoxCharacteristics, newIfcTextStyleWithBoxCharacteristics);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcTextStyleWithBoxCharacteristics(IfcTextStyleWithBoxCharacteristics newIfcTextStyleWithBoxCharacteristics) {
		if (newIfcTextStyleWithBoxCharacteristics != ifcTextStyleWithBoxCharacteristics) {
			NotificationChain msgs = null;
			if (ifcTextStyleWithBoxCharacteristics != null)
				msgs = ((InternalEObject)ifcTextStyleWithBoxCharacteristics).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.TEXT_STYLE_TYPE__IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS, null, msgs);
			if (newIfcTextStyleWithBoxCharacteristics != null)
				msgs = ((InternalEObject)newIfcTextStyleWithBoxCharacteristics).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.TEXT_STYLE_TYPE__IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS, null, msgs);
			msgs = basicSetIfcTextStyleWithBoxCharacteristics(newIfcTextStyleWithBoxCharacteristics, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.TEXT_STYLE_TYPE__IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS, newIfcTextStyleWithBoxCharacteristics, newIfcTextStyleWithBoxCharacteristics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTextStyleTextModel getIfcTextStyleTextModel() {
		return ifcTextStyleTextModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcTextStyleTextModel(IfcTextStyleTextModel newIfcTextStyleTextModel, NotificationChain msgs) {
		IfcTextStyleTextModel oldIfcTextStyleTextModel = ifcTextStyleTextModel;
		ifcTextStyleTextModel = newIfcTextStyleTextModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.TEXT_STYLE_TYPE__IFC_TEXT_STYLE_TEXT_MODEL, oldIfcTextStyleTextModel, newIfcTextStyleTextModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcTextStyleTextModel(IfcTextStyleTextModel newIfcTextStyleTextModel) {
		if (newIfcTextStyleTextModel != ifcTextStyleTextModel) {
			NotificationChain msgs = null;
			if (ifcTextStyleTextModel != null)
				msgs = ((InternalEObject)ifcTextStyleTextModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.TEXT_STYLE_TYPE__IFC_TEXT_STYLE_TEXT_MODEL, null, msgs);
			if (newIfcTextStyleTextModel != null)
				msgs = ((InternalEObject)newIfcTextStyleTextModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.TEXT_STYLE_TYPE__IFC_TEXT_STYLE_TEXT_MODEL, null, msgs);
			msgs = basicSetIfcTextStyleTextModel(newIfcTextStyleTextModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.TEXT_STYLE_TYPE__IFC_TEXT_STYLE_TEXT_MODEL, newIfcTextStyleTextModel, newIfcTextStyleTextModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.TEXT_STYLE_TYPE__IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS:
				return basicSetIfcTextStyleWithBoxCharacteristics(null, msgs);
			case FinalPackage.TEXT_STYLE_TYPE__IFC_TEXT_STYLE_TEXT_MODEL:
				return basicSetIfcTextStyleTextModel(null, msgs);
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
			case FinalPackage.TEXT_STYLE_TYPE__IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS:
				return getIfcTextStyleWithBoxCharacteristics();
			case FinalPackage.TEXT_STYLE_TYPE__IFC_TEXT_STYLE_TEXT_MODEL:
				return getIfcTextStyleTextModel();
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
			case FinalPackage.TEXT_STYLE_TYPE__IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS:
				setIfcTextStyleWithBoxCharacteristics((IfcTextStyleWithBoxCharacteristics)newValue);
				return;
			case FinalPackage.TEXT_STYLE_TYPE__IFC_TEXT_STYLE_TEXT_MODEL:
				setIfcTextStyleTextModel((IfcTextStyleTextModel)newValue);
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
			case FinalPackage.TEXT_STYLE_TYPE__IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS:
				setIfcTextStyleWithBoxCharacteristics((IfcTextStyleWithBoxCharacteristics)null);
				return;
			case FinalPackage.TEXT_STYLE_TYPE__IFC_TEXT_STYLE_TEXT_MODEL:
				setIfcTextStyleTextModel((IfcTextStyleTextModel)null);
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
			case FinalPackage.TEXT_STYLE_TYPE__IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS:
				return ifcTextStyleWithBoxCharacteristics != null;
			case FinalPackage.TEXT_STYLE_TYPE__IFC_TEXT_STYLE_TEXT_MODEL:
				return ifcTextStyleTextModel != null;
		}
		return super.eIsSet(featureID);
	}

} //TextStyleTypeImpl
