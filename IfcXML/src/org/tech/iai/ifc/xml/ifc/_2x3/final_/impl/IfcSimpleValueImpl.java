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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcBooleanType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcIdentifierType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcIntegerType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLabelType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLogicalType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRealType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSimpleValue;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Simple Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSimpleValueImpl#getIfcInteger <em>Ifc Integer</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSimpleValueImpl#getIfcReal <em>Ifc Real</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSimpleValueImpl#getIfcBoolean <em>Ifc Boolean</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSimpleValueImpl#getIfcIdentifier <em>Ifc Identifier</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSimpleValueImpl#getIfcText <em>Ifc Text</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSimpleValueImpl#getIfcLabel <em>Ifc Label</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSimpleValueImpl#getIfcLogical <em>Ifc Logical</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcSimpleValueImpl extends EObjectImpl implements IfcSimpleValue {
	/**
	 * The cached value of the '{@link #getIfcInteger() <em>Ifc Integer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcInteger()
	 * @generated
	 * @ordered
	 */
	protected IfcIntegerType ifcInteger;

	/**
	 * The cached value of the '{@link #getIfcReal() <em>Ifc Real</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcReal()
	 * @generated
	 * @ordered
	 */
	protected IfcRealType ifcReal;

	/**
	 * The cached value of the '{@link #getIfcBoolean() <em>Ifc Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcBoolean()
	 * @generated
	 * @ordered
	 */
	protected IfcBooleanType ifcBoolean;

	/**
	 * The cached value of the '{@link #getIfcIdentifier() <em>Ifc Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcIdentifier()
	 * @generated
	 * @ordered
	 */
	protected IfcIdentifierType ifcIdentifier;

	/**
	 * The cached value of the '{@link #getIfcText() <em>Ifc Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcText()
	 * @generated
	 * @ordered
	 */
	protected IfcTextType ifcText;

	/**
	 * The cached value of the '{@link #getIfcLabel() <em>Ifc Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcLabel()
	 * @generated
	 * @ordered
	 */
	protected IfcLabelType ifcLabel;

	/**
	 * The cached value of the '{@link #getIfcLogical() <em>Ifc Logical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcLogical()
	 * @generated
	 * @ordered
	 */
	protected IfcLogicalType ifcLogical;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSimpleValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcSimpleValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcIntegerType getIfcInteger() {
		return ifcInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcInteger(IfcIntegerType newIfcInteger, NotificationChain msgs) {
		IfcIntegerType oldIfcInteger = ifcInteger;
		ifcInteger = newIfcInteger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SIMPLE_VALUE__IFC_INTEGER, oldIfcInteger, newIfcInteger);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcInteger(IfcIntegerType newIfcInteger) {
		if (newIfcInteger != ifcInteger) {
			NotificationChain msgs = null;
			if (ifcInteger != null)
				msgs = ((InternalEObject)ifcInteger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SIMPLE_VALUE__IFC_INTEGER, null, msgs);
			if (newIfcInteger != null)
				msgs = ((InternalEObject)newIfcInteger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SIMPLE_VALUE__IFC_INTEGER, null, msgs);
			msgs = basicSetIfcInteger(newIfcInteger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SIMPLE_VALUE__IFC_INTEGER, newIfcInteger, newIfcInteger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRealType getIfcReal() {
		return ifcReal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcReal(IfcRealType newIfcReal, NotificationChain msgs) {
		IfcRealType oldIfcReal = ifcReal;
		ifcReal = newIfcReal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SIMPLE_VALUE__IFC_REAL, oldIfcReal, newIfcReal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcReal(IfcRealType newIfcReal) {
		if (newIfcReal != ifcReal) {
			NotificationChain msgs = null;
			if (ifcReal != null)
				msgs = ((InternalEObject)ifcReal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SIMPLE_VALUE__IFC_REAL, null, msgs);
			if (newIfcReal != null)
				msgs = ((InternalEObject)newIfcReal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SIMPLE_VALUE__IFC_REAL, null, msgs);
			msgs = basicSetIfcReal(newIfcReal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SIMPLE_VALUE__IFC_REAL, newIfcReal, newIfcReal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBooleanType getIfcBoolean() {
		return ifcBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcBoolean(IfcBooleanType newIfcBoolean, NotificationChain msgs) {
		IfcBooleanType oldIfcBoolean = ifcBoolean;
		ifcBoolean = newIfcBoolean;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SIMPLE_VALUE__IFC_BOOLEAN, oldIfcBoolean, newIfcBoolean);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcBoolean(IfcBooleanType newIfcBoolean) {
		if (newIfcBoolean != ifcBoolean) {
			NotificationChain msgs = null;
			if (ifcBoolean != null)
				msgs = ((InternalEObject)ifcBoolean).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SIMPLE_VALUE__IFC_BOOLEAN, null, msgs);
			if (newIfcBoolean != null)
				msgs = ((InternalEObject)newIfcBoolean).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SIMPLE_VALUE__IFC_BOOLEAN, null, msgs);
			msgs = basicSetIfcBoolean(newIfcBoolean, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SIMPLE_VALUE__IFC_BOOLEAN, newIfcBoolean, newIfcBoolean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcIdentifierType getIfcIdentifier() {
		return ifcIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcIdentifier(IfcIdentifierType newIfcIdentifier, NotificationChain msgs) {
		IfcIdentifierType oldIfcIdentifier = ifcIdentifier;
		ifcIdentifier = newIfcIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SIMPLE_VALUE__IFC_IDENTIFIER, oldIfcIdentifier, newIfcIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcIdentifier(IfcIdentifierType newIfcIdentifier) {
		if (newIfcIdentifier != ifcIdentifier) {
			NotificationChain msgs = null;
			if (ifcIdentifier != null)
				msgs = ((InternalEObject)ifcIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SIMPLE_VALUE__IFC_IDENTIFIER, null, msgs);
			if (newIfcIdentifier != null)
				msgs = ((InternalEObject)newIfcIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SIMPLE_VALUE__IFC_IDENTIFIER, null, msgs);
			msgs = basicSetIfcIdentifier(newIfcIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SIMPLE_VALUE__IFC_IDENTIFIER, newIfcIdentifier, newIfcIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTextType getIfcText() {
		return ifcText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcText(IfcTextType newIfcText, NotificationChain msgs) {
		IfcTextType oldIfcText = ifcText;
		ifcText = newIfcText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SIMPLE_VALUE__IFC_TEXT, oldIfcText, newIfcText);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcText(IfcTextType newIfcText) {
		if (newIfcText != ifcText) {
			NotificationChain msgs = null;
			if (ifcText != null)
				msgs = ((InternalEObject)ifcText).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SIMPLE_VALUE__IFC_TEXT, null, msgs);
			if (newIfcText != null)
				msgs = ((InternalEObject)newIfcText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SIMPLE_VALUE__IFC_TEXT, null, msgs);
			msgs = basicSetIfcText(newIfcText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SIMPLE_VALUE__IFC_TEXT, newIfcText, newIfcText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLabelType getIfcLabel() {
		return ifcLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcLabel(IfcLabelType newIfcLabel, NotificationChain msgs) {
		IfcLabelType oldIfcLabel = ifcLabel;
		ifcLabel = newIfcLabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SIMPLE_VALUE__IFC_LABEL, oldIfcLabel, newIfcLabel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcLabel(IfcLabelType newIfcLabel) {
		if (newIfcLabel != ifcLabel) {
			NotificationChain msgs = null;
			if (ifcLabel != null)
				msgs = ((InternalEObject)ifcLabel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SIMPLE_VALUE__IFC_LABEL, null, msgs);
			if (newIfcLabel != null)
				msgs = ((InternalEObject)newIfcLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SIMPLE_VALUE__IFC_LABEL, null, msgs);
			msgs = basicSetIfcLabel(newIfcLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SIMPLE_VALUE__IFC_LABEL, newIfcLabel, newIfcLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLogicalType getIfcLogical() {
		return ifcLogical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcLogical(IfcLogicalType newIfcLogical, NotificationChain msgs) {
		IfcLogicalType oldIfcLogical = ifcLogical;
		ifcLogical = newIfcLogical;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SIMPLE_VALUE__IFC_LOGICAL, oldIfcLogical, newIfcLogical);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcLogical(IfcLogicalType newIfcLogical) {
		if (newIfcLogical != ifcLogical) {
			NotificationChain msgs = null;
			if (ifcLogical != null)
				msgs = ((InternalEObject)ifcLogical).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SIMPLE_VALUE__IFC_LOGICAL, null, msgs);
			if (newIfcLogical != null)
				msgs = ((InternalEObject)newIfcLogical).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SIMPLE_VALUE__IFC_LOGICAL, null, msgs);
			msgs = basicSetIfcLogical(newIfcLogical, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SIMPLE_VALUE__IFC_LOGICAL, newIfcLogical, newIfcLogical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_SIMPLE_VALUE__IFC_INTEGER:
				return basicSetIfcInteger(null, msgs);
			case FinalPackage.IFC_SIMPLE_VALUE__IFC_REAL:
				return basicSetIfcReal(null, msgs);
			case FinalPackage.IFC_SIMPLE_VALUE__IFC_BOOLEAN:
				return basicSetIfcBoolean(null, msgs);
			case FinalPackage.IFC_SIMPLE_VALUE__IFC_IDENTIFIER:
				return basicSetIfcIdentifier(null, msgs);
			case FinalPackage.IFC_SIMPLE_VALUE__IFC_TEXT:
				return basicSetIfcText(null, msgs);
			case FinalPackage.IFC_SIMPLE_VALUE__IFC_LABEL:
				return basicSetIfcLabel(null, msgs);
			case FinalPackage.IFC_SIMPLE_VALUE__IFC_LOGICAL:
				return basicSetIfcLogical(null, msgs);
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
			case FinalPackage.IFC_SIMPLE_VALUE__IFC_INTEGER:
				return getIfcInteger();
			case FinalPackage.IFC_SIMPLE_VALUE__IFC_REAL:
				return getIfcReal();
			case FinalPackage.IFC_SIMPLE_VALUE__IFC_BOOLEAN:
				return getIfcBoolean();
			case FinalPackage.IFC_SIMPLE_VALUE__IFC_IDENTIFIER:
				return getIfcIdentifier();
			case FinalPackage.IFC_SIMPLE_VALUE__IFC_TEXT:
				return getIfcText();
			case FinalPackage.IFC_SIMPLE_VALUE__IFC_LABEL:
				return getIfcLabel();
			case FinalPackage.IFC_SIMPLE_VALUE__IFC_LOGICAL:
				return getIfcLogical();
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
			case FinalPackage.IFC_SIMPLE_VALUE__IFC_INTEGER:
				setIfcInteger((IfcIntegerType)newValue);
				return;
			case FinalPackage.IFC_SIMPLE_VALUE__IFC_REAL:
				setIfcReal((IfcRealType)newValue);
				return;
			case FinalPackage.IFC_SIMPLE_VALUE__IFC_BOOLEAN:
				setIfcBoolean((IfcBooleanType)newValue);
				return;
			case FinalPackage.IFC_SIMPLE_VALUE__IFC_IDENTIFIER:
				setIfcIdentifier((IfcIdentifierType)newValue);
				return;
			case FinalPackage.IFC_SIMPLE_VALUE__IFC_TEXT:
				setIfcText((IfcTextType)newValue);
				return;
			case FinalPackage.IFC_SIMPLE_VALUE__IFC_LABEL:
				setIfcLabel((IfcLabelType)newValue);
				return;
			case FinalPackage.IFC_SIMPLE_VALUE__IFC_LOGICAL:
				setIfcLogical((IfcLogicalType)newValue);
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
			case FinalPackage.IFC_SIMPLE_VALUE__IFC_INTEGER:
				setIfcInteger((IfcIntegerType)null);
				return;
			case FinalPackage.IFC_SIMPLE_VALUE__IFC_REAL:
				setIfcReal((IfcRealType)null);
				return;
			case FinalPackage.IFC_SIMPLE_VALUE__IFC_BOOLEAN:
				setIfcBoolean((IfcBooleanType)null);
				return;
			case FinalPackage.IFC_SIMPLE_VALUE__IFC_IDENTIFIER:
				setIfcIdentifier((IfcIdentifierType)null);
				return;
			case FinalPackage.IFC_SIMPLE_VALUE__IFC_TEXT:
				setIfcText((IfcTextType)null);
				return;
			case FinalPackage.IFC_SIMPLE_VALUE__IFC_LABEL:
				setIfcLabel((IfcLabelType)null);
				return;
			case FinalPackage.IFC_SIMPLE_VALUE__IFC_LOGICAL:
				setIfcLogical((IfcLogicalType)null);
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
			case FinalPackage.IFC_SIMPLE_VALUE__IFC_INTEGER:
				return ifcInteger != null;
			case FinalPackage.IFC_SIMPLE_VALUE__IFC_REAL:
				return ifcReal != null;
			case FinalPackage.IFC_SIMPLE_VALUE__IFC_BOOLEAN:
				return ifcBoolean != null;
			case FinalPackage.IFC_SIMPLE_VALUE__IFC_IDENTIFIER:
				return ifcIdentifier != null;
			case FinalPackage.IFC_SIMPLE_VALUE__IFC_TEXT:
				return ifcText != null;
			case FinalPackage.IFC_SIMPLE_VALUE__IFC_LABEL:
				return ifcLabel != null;
			case FinalPackage.IFC_SIMPLE_VALUE__IFC_LOGICAL:
				return ifcLogical != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcSimpleValueImpl
