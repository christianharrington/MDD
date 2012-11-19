/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.Logical;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.EntityImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcShapeAspect;
import org.tech.iai.ifc.xml.ifc._2x3.final_.PartOfProductDefinitionShapeType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.ShapeRepresentationsType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Shape Aspect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcShapeAspectImpl#getShapeRepresentations <em>Shape Representations</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcShapeAspectImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcShapeAspectImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcShapeAspectImpl#getProductDefinitional <em>Product Definitional</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcShapeAspectImpl#getPartOfProductDefinitionShape <em>Part Of Product Definition Shape</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcShapeAspectImpl extends EntityImpl implements IfcShapeAspect {
	/**
	 * The cached value of the '{@link #getShapeRepresentations() <em>Shape Representations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShapeRepresentations()
	 * @generated
	 * @ordered
	 */
	protected ShapeRepresentationsType shapeRepresentations;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductDefinitional() <em>Product Definitional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductDefinitional()
	 * @generated
	 * @ordered
	 */
	protected static final Logical PRODUCT_DEFINITIONAL_EDEFAULT = Logical.FALSE;

	/**
	 * The cached value of the '{@link #getProductDefinitional() <em>Product Definitional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductDefinitional()
	 * @generated
	 * @ordered
	 */
	protected Logical productDefinitional = PRODUCT_DEFINITIONAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPartOfProductDefinitionShape() <em>Part Of Product Definition Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartOfProductDefinitionShape()
	 * @generated
	 * @ordered
	 */
	protected PartOfProductDefinitionShapeType partOfProductDefinitionShape;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcShapeAspectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcShapeAspect();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShapeRepresentationsType getShapeRepresentations() {
		return shapeRepresentations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShapeRepresentations(ShapeRepresentationsType newShapeRepresentations, NotificationChain msgs) {
		ShapeRepresentationsType oldShapeRepresentations = shapeRepresentations;
		shapeRepresentations = newShapeRepresentations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SHAPE_ASPECT__SHAPE_REPRESENTATIONS, oldShapeRepresentations, newShapeRepresentations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShapeRepresentations(ShapeRepresentationsType newShapeRepresentations) {
		if (newShapeRepresentations != shapeRepresentations) {
			NotificationChain msgs = null;
			if (shapeRepresentations != null)
				msgs = ((InternalEObject)shapeRepresentations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SHAPE_ASPECT__SHAPE_REPRESENTATIONS, null, msgs);
			if (newShapeRepresentations != null)
				msgs = ((InternalEObject)newShapeRepresentations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SHAPE_ASPECT__SHAPE_REPRESENTATIONS, null, msgs);
			msgs = basicSetShapeRepresentations(newShapeRepresentations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SHAPE_ASPECT__SHAPE_REPRESENTATIONS, newShapeRepresentations, newShapeRepresentations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SHAPE_ASPECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SHAPE_ASPECT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Logical getProductDefinitional() {
		return productDefinitional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductDefinitional(Logical newProductDefinitional) {
		Logical oldProductDefinitional = productDefinitional;
		productDefinitional = newProductDefinitional == null ? PRODUCT_DEFINITIONAL_EDEFAULT : newProductDefinitional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SHAPE_ASPECT__PRODUCT_DEFINITIONAL, oldProductDefinitional, productDefinitional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartOfProductDefinitionShapeType getPartOfProductDefinitionShape() {
		return partOfProductDefinitionShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartOfProductDefinitionShape(PartOfProductDefinitionShapeType newPartOfProductDefinitionShape, NotificationChain msgs) {
		PartOfProductDefinitionShapeType oldPartOfProductDefinitionShape = partOfProductDefinitionShape;
		partOfProductDefinitionShape = newPartOfProductDefinitionShape;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SHAPE_ASPECT__PART_OF_PRODUCT_DEFINITION_SHAPE, oldPartOfProductDefinitionShape, newPartOfProductDefinitionShape);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartOfProductDefinitionShape(PartOfProductDefinitionShapeType newPartOfProductDefinitionShape) {
		if (newPartOfProductDefinitionShape != partOfProductDefinitionShape) {
			NotificationChain msgs = null;
			if (partOfProductDefinitionShape != null)
				msgs = ((InternalEObject)partOfProductDefinitionShape).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SHAPE_ASPECT__PART_OF_PRODUCT_DEFINITION_SHAPE, null, msgs);
			if (newPartOfProductDefinitionShape != null)
				msgs = ((InternalEObject)newPartOfProductDefinitionShape).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SHAPE_ASPECT__PART_OF_PRODUCT_DEFINITION_SHAPE, null, msgs);
			msgs = basicSetPartOfProductDefinitionShape(newPartOfProductDefinitionShape, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SHAPE_ASPECT__PART_OF_PRODUCT_DEFINITION_SHAPE, newPartOfProductDefinitionShape, newPartOfProductDefinitionShape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_SHAPE_ASPECT__SHAPE_REPRESENTATIONS:
				return basicSetShapeRepresentations(null, msgs);
			case FinalPackage.IFC_SHAPE_ASPECT__PART_OF_PRODUCT_DEFINITION_SHAPE:
				return basicSetPartOfProductDefinitionShape(null, msgs);
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
			case FinalPackage.IFC_SHAPE_ASPECT__SHAPE_REPRESENTATIONS:
				return getShapeRepresentations();
			case FinalPackage.IFC_SHAPE_ASPECT__NAME:
				return getName();
			case FinalPackage.IFC_SHAPE_ASPECT__DESCRIPTION:
				return getDescription();
			case FinalPackage.IFC_SHAPE_ASPECT__PRODUCT_DEFINITIONAL:
				return getProductDefinitional();
			case FinalPackage.IFC_SHAPE_ASPECT__PART_OF_PRODUCT_DEFINITION_SHAPE:
				return getPartOfProductDefinitionShape();
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
			case FinalPackage.IFC_SHAPE_ASPECT__SHAPE_REPRESENTATIONS:
				setShapeRepresentations((ShapeRepresentationsType)newValue);
				return;
			case FinalPackage.IFC_SHAPE_ASPECT__NAME:
				setName((String)newValue);
				return;
			case FinalPackage.IFC_SHAPE_ASPECT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case FinalPackage.IFC_SHAPE_ASPECT__PRODUCT_DEFINITIONAL:
				setProductDefinitional((Logical)newValue);
				return;
			case FinalPackage.IFC_SHAPE_ASPECT__PART_OF_PRODUCT_DEFINITION_SHAPE:
				setPartOfProductDefinitionShape((PartOfProductDefinitionShapeType)newValue);
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
			case FinalPackage.IFC_SHAPE_ASPECT__SHAPE_REPRESENTATIONS:
				setShapeRepresentations((ShapeRepresentationsType)null);
				return;
			case FinalPackage.IFC_SHAPE_ASPECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FinalPackage.IFC_SHAPE_ASPECT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case FinalPackage.IFC_SHAPE_ASPECT__PRODUCT_DEFINITIONAL:
				setProductDefinitional(PRODUCT_DEFINITIONAL_EDEFAULT);
				return;
			case FinalPackage.IFC_SHAPE_ASPECT__PART_OF_PRODUCT_DEFINITION_SHAPE:
				setPartOfProductDefinitionShape((PartOfProductDefinitionShapeType)null);
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
			case FinalPackage.IFC_SHAPE_ASPECT__SHAPE_REPRESENTATIONS:
				return shapeRepresentations != null;
			case FinalPackage.IFC_SHAPE_ASPECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FinalPackage.IFC_SHAPE_ASPECT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case FinalPackage.IFC_SHAPE_ASPECT__PRODUCT_DEFINITIONAL:
				return productDefinitional != PRODUCT_DEFINITIONAL_EDEFAULT;
			case FinalPackage.IFC_SHAPE_ASPECT__PART_OF_PRODUCT_DEFINITION_SHAPE:
				return partOfProductDefinitionShape != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", productDefinitional: ");
		result.append(productDefinitional);
		result.append(')');
		return result.toString();
	}

} //IfcShapeAspectImpl
