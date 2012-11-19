/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcProduct;
import org.tech.iai.ifc.xml.ifc._2x3.final_.ObjectPlacementType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RepresentationType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcProductImpl#getObjectPlacement <em>Object Placement</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcProductImpl#getRepresentation <em>Representation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class IfcProductImpl extends IfcObjectImpl implements IfcProduct {
	/**
	 * The cached value of the '{@link #getObjectPlacement() <em>Object Placement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectPlacement()
	 * @generated
	 * @ordered
	 */
	protected ObjectPlacementType objectPlacement;

	/**
	 * The cached value of the '{@link #getRepresentation() <em>Representation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentation()
	 * @generated
	 * @ordered
	 */
	protected RepresentationType representation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcProduct();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectPlacementType getObjectPlacement() {
		return objectPlacement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectPlacement(ObjectPlacementType newObjectPlacement, NotificationChain msgs) {
		ObjectPlacementType oldObjectPlacement = objectPlacement;
		objectPlacement = newObjectPlacement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PRODUCT__OBJECT_PLACEMENT, oldObjectPlacement, newObjectPlacement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectPlacement(ObjectPlacementType newObjectPlacement) {
		if (newObjectPlacement != objectPlacement) {
			NotificationChain msgs = null;
			if (objectPlacement != null)
				msgs = ((InternalEObject)objectPlacement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PRODUCT__OBJECT_PLACEMENT, null, msgs);
			if (newObjectPlacement != null)
				msgs = ((InternalEObject)newObjectPlacement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PRODUCT__OBJECT_PLACEMENT, null, msgs);
			msgs = basicSetObjectPlacement(newObjectPlacement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PRODUCT__OBJECT_PLACEMENT, newObjectPlacement, newObjectPlacement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepresentationType getRepresentation() {
		return representation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepresentation(RepresentationType newRepresentation, NotificationChain msgs) {
		RepresentationType oldRepresentation = representation;
		representation = newRepresentation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PRODUCT__REPRESENTATION, oldRepresentation, newRepresentation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentation(RepresentationType newRepresentation) {
		if (newRepresentation != representation) {
			NotificationChain msgs = null;
			if (representation != null)
				msgs = ((InternalEObject)representation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PRODUCT__REPRESENTATION, null, msgs);
			if (newRepresentation != null)
				msgs = ((InternalEObject)newRepresentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PRODUCT__REPRESENTATION, null, msgs);
			msgs = basicSetRepresentation(newRepresentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PRODUCT__REPRESENTATION, newRepresentation, newRepresentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_PRODUCT__OBJECT_PLACEMENT:
				return basicSetObjectPlacement(null, msgs);
			case FinalPackage.IFC_PRODUCT__REPRESENTATION:
				return basicSetRepresentation(null, msgs);
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
			case FinalPackage.IFC_PRODUCT__OBJECT_PLACEMENT:
				return getObjectPlacement();
			case FinalPackage.IFC_PRODUCT__REPRESENTATION:
				return getRepresentation();
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
			case FinalPackage.IFC_PRODUCT__OBJECT_PLACEMENT:
				setObjectPlacement((ObjectPlacementType)newValue);
				return;
			case FinalPackage.IFC_PRODUCT__REPRESENTATION:
				setRepresentation((RepresentationType)newValue);
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
			case FinalPackage.IFC_PRODUCT__OBJECT_PLACEMENT:
				setObjectPlacement((ObjectPlacementType)null);
				return;
			case FinalPackage.IFC_PRODUCT__REPRESENTATION:
				setRepresentation((RepresentationType)null);
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
			case FinalPackage.IFC_PRODUCT__OBJECT_PLACEMENT:
				return objectPlacement != null;
			case FinalPackage.IFC_PRODUCT__REPRESENTATION:
				return representation != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcProductImpl
