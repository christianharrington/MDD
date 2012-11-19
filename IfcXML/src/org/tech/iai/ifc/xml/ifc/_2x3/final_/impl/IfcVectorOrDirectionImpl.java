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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDirection;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcVector;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcVectorOrDirection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Vector Or Direction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcVectorOrDirectionImpl#getIfcDirection <em>Ifc Direction</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcVectorOrDirectionImpl#getIfcVector <em>Ifc Vector</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcVectorOrDirectionImpl extends EObjectImpl implements IfcVectorOrDirection {
	/**
	 * The cached value of the '{@link #getIfcDirection() <em>Ifc Direction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcDirection()
	 * @generated
	 * @ordered
	 */
	protected IfcDirection ifcDirection;

	/**
	 * The cached value of the '{@link #getIfcVector() <em>Ifc Vector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcVector()
	 * @generated
	 * @ordered
	 */
	protected IfcVector ifcVector;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcVectorOrDirectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcVectorOrDirection();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDirection getIfcDirection() {
		return ifcDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcDirection(IfcDirection newIfcDirection, NotificationChain msgs) {
		IfcDirection oldIfcDirection = ifcDirection;
		ifcDirection = newIfcDirection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_VECTOR_OR_DIRECTION__IFC_DIRECTION, oldIfcDirection, newIfcDirection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcDirection(IfcDirection newIfcDirection) {
		if (newIfcDirection != ifcDirection) {
			NotificationChain msgs = null;
			if (ifcDirection != null)
				msgs = ((InternalEObject)ifcDirection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_VECTOR_OR_DIRECTION__IFC_DIRECTION, null, msgs);
			if (newIfcDirection != null)
				msgs = ((InternalEObject)newIfcDirection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_VECTOR_OR_DIRECTION__IFC_DIRECTION, null, msgs);
			msgs = basicSetIfcDirection(newIfcDirection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_VECTOR_OR_DIRECTION__IFC_DIRECTION, newIfcDirection, newIfcDirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcVector getIfcVector() {
		return ifcVector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcVector(IfcVector newIfcVector, NotificationChain msgs) {
		IfcVector oldIfcVector = ifcVector;
		ifcVector = newIfcVector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_VECTOR_OR_DIRECTION__IFC_VECTOR, oldIfcVector, newIfcVector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcVector(IfcVector newIfcVector) {
		if (newIfcVector != ifcVector) {
			NotificationChain msgs = null;
			if (ifcVector != null)
				msgs = ((InternalEObject)ifcVector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_VECTOR_OR_DIRECTION__IFC_VECTOR, null, msgs);
			if (newIfcVector != null)
				msgs = ((InternalEObject)newIfcVector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_VECTOR_OR_DIRECTION__IFC_VECTOR, null, msgs);
			msgs = basicSetIfcVector(newIfcVector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_VECTOR_OR_DIRECTION__IFC_VECTOR, newIfcVector, newIfcVector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_VECTOR_OR_DIRECTION__IFC_DIRECTION:
				return basicSetIfcDirection(null, msgs);
			case FinalPackage.IFC_VECTOR_OR_DIRECTION__IFC_VECTOR:
				return basicSetIfcVector(null, msgs);
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
			case FinalPackage.IFC_VECTOR_OR_DIRECTION__IFC_DIRECTION:
				return getIfcDirection();
			case FinalPackage.IFC_VECTOR_OR_DIRECTION__IFC_VECTOR:
				return getIfcVector();
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
			case FinalPackage.IFC_VECTOR_OR_DIRECTION__IFC_DIRECTION:
				setIfcDirection((IfcDirection)newValue);
				return;
			case FinalPackage.IFC_VECTOR_OR_DIRECTION__IFC_VECTOR:
				setIfcVector((IfcVector)newValue);
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
			case FinalPackage.IFC_VECTOR_OR_DIRECTION__IFC_DIRECTION:
				setIfcDirection((IfcDirection)null);
				return;
			case FinalPackage.IFC_VECTOR_OR_DIRECTION__IFC_VECTOR:
				setIfcVector((IfcVector)null);
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
			case FinalPackage.IFC_VECTOR_OR_DIRECTION__IFC_DIRECTION:
				return ifcDirection != null;
			case FinalPackage.IFC_VECTOR_OR_DIRECTION__IFC_VECTOR:
				return ifcVector != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcVectorOrDirectionImpl
