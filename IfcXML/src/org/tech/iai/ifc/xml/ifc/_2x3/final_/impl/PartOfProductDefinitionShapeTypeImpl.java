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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcProductDefinitionShape;
import org.tech.iai.ifc.xml.ifc._2x3.final_.PartOfProductDefinitionShapeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Part Of Product Definition Shape Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.PartOfProductDefinitionShapeTypeImpl#getIfcProductDefinitionShape <em>Ifc Product Definition Shape</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PartOfProductDefinitionShapeTypeImpl extends EObjectImpl implements PartOfProductDefinitionShapeType {
	/**
	 * The cached value of the '{@link #getIfcProductDefinitionShape() <em>Ifc Product Definition Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcProductDefinitionShape()
	 * @generated
	 * @ordered
	 */
	protected IfcProductDefinitionShape ifcProductDefinitionShape;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartOfProductDefinitionShapeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getPartOfProductDefinitionShapeType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProductDefinitionShape getIfcProductDefinitionShape() {
		return ifcProductDefinitionShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcProductDefinitionShape(IfcProductDefinitionShape newIfcProductDefinitionShape, NotificationChain msgs) {
		IfcProductDefinitionShape oldIfcProductDefinitionShape = ifcProductDefinitionShape;
		ifcProductDefinitionShape = newIfcProductDefinitionShape;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.PART_OF_PRODUCT_DEFINITION_SHAPE_TYPE__IFC_PRODUCT_DEFINITION_SHAPE, oldIfcProductDefinitionShape, newIfcProductDefinitionShape);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcProductDefinitionShape(IfcProductDefinitionShape newIfcProductDefinitionShape) {
		if (newIfcProductDefinitionShape != ifcProductDefinitionShape) {
			NotificationChain msgs = null;
			if (ifcProductDefinitionShape != null)
				msgs = ((InternalEObject)ifcProductDefinitionShape).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.PART_OF_PRODUCT_DEFINITION_SHAPE_TYPE__IFC_PRODUCT_DEFINITION_SHAPE, null, msgs);
			if (newIfcProductDefinitionShape != null)
				msgs = ((InternalEObject)newIfcProductDefinitionShape).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.PART_OF_PRODUCT_DEFINITION_SHAPE_TYPE__IFC_PRODUCT_DEFINITION_SHAPE, null, msgs);
			msgs = basicSetIfcProductDefinitionShape(newIfcProductDefinitionShape, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.PART_OF_PRODUCT_DEFINITION_SHAPE_TYPE__IFC_PRODUCT_DEFINITION_SHAPE, newIfcProductDefinitionShape, newIfcProductDefinitionShape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.PART_OF_PRODUCT_DEFINITION_SHAPE_TYPE__IFC_PRODUCT_DEFINITION_SHAPE:
				return basicSetIfcProductDefinitionShape(null, msgs);
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
			case FinalPackage.PART_OF_PRODUCT_DEFINITION_SHAPE_TYPE__IFC_PRODUCT_DEFINITION_SHAPE:
				return getIfcProductDefinitionShape();
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
			case FinalPackage.PART_OF_PRODUCT_DEFINITION_SHAPE_TYPE__IFC_PRODUCT_DEFINITION_SHAPE:
				setIfcProductDefinitionShape((IfcProductDefinitionShape)newValue);
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
			case FinalPackage.PART_OF_PRODUCT_DEFINITION_SHAPE_TYPE__IFC_PRODUCT_DEFINITION_SHAPE:
				setIfcProductDefinitionShape((IfcProductDefinitionShape)null);
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
			case FinalPackage.PART_OF_PRODUCT_DEFINITION_SHAPE_TYPE__IFC_PRODUCT_DEFINITION_SHAPE:
				return ifcProductDefinitionShape != null;
		}
		return super.eIsSet(featureID);
	}

} //PartOfProductDefinitionShapeTypeImpl
