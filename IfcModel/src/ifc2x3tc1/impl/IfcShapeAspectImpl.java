/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcProductDefinitionShape;
import ifc2x3tc1.IfcShapeAspect;
import ifc2x3tc1.IfcShapeModel;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Shape Aspect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcShapeAspectImpl#getShapeRepresentations <em>Shape Representations</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcShapeAspectImpl#getName <em>Name</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcShapeAspectImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcShapeAspectImpl#isProductDefinitional <em>Product Definitional</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcShapeAspectImpl#getPartOfProductDefinitionShape <em>Part Of Product Definition Shape</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcShapeAspectImpl extends EObjectImpl implements IfcShapeAspect {
	/**
	 * The cached value of the '{@link #getShapeRepresentations() <em>Shape Representations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShapeRepresentations()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcShapeModel> shapeRepresentations;

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
	 * This is true if the Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nameESet;

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
	 * This is true if the Description attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean descriptionESet;

	/**
	 * The default value of the '{@link #isProductDefinitional() <em>Product Definitional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProductDefinitional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRODUCT_DEFINITIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isProductDefinitional() <em>Product Definitional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProductDefinitional()
	 * @generated
	 * @ordered
	 */
	protected boolean productDefinitional = PRODUCT_DEFINITIONAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPartOfProductDefinitionShape() <em>Part Of Product Definition Shape</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartOfProductDefinitionShape()
	 * @generated
	 * @ordered
	 */
	protected IfcProductDefinitionShape partOfProductDefinitionShape;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcShapeAspect();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcShapeModel> getShapeRepresentations() {
		if (shapeRepresentations == null) {
			shapeRepresentations = new EObjectWithInverseResolvingEList.ManyInverse<IfcShapeModel>(IfcShapeModel.class, this, Ifc2x3tc1Package.IFC_SHAPE_ASPECT__SHAPE_REPRESENTATIONS, Ifc2x3tc1Package.IFC_SHAPE_MODEL__OF_SHAPE_ASPECT);
		}
		return shapeRepresentations;
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
		boolean oldNameESet = nameESet;
		nameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SHAPE_ASPECT__NAME, oldName, name, !oldNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetName() {
		String oldName = name;
		boolean oldNameESet = nameESet;
		name = NAME_EDEFAULT;
		nameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SHAPE_ASPECT__NAME, oldName, NAME_EDEFAULT, oldNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetName() {
		return nameESet;
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
		boolean oldDescriptionESet = descriptionESet;
		descriptionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SHAPE_ASPECT__DESCRIPTION, oldDescription, description, !oldDescriptionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDescription() {
		String oldDescription = description;
		boolean oldDescriptionESet = descriptionESet;
		description = DESCRIPTION_EDEFAULT;
		descriptionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SHAPE_ASPECT__DESCRIPTION, oldDescription, DESCRIPTION_EDEFAULT, oldDescriptionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDescription() {
		return descriptionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isProductDefinitional() {
		return productDefinitional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductDefinitional(boolean newProductDefinitional) {
		boolean oldProductDefinitional = productDefinitional;
		productDefinitional = newProductDefinitional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SHAPE_ASPECT__PRODUCT_DEFINITIONAL, oldProductDefinitional, productDefinitional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProductDefinitionShape getPartOfProductDefinitionShape() {
		if (partOfProductDefinitionShape != null && partOfProductDefinitionShape.eIsProxy()) {
			InternalEObject oldPartOfProductDefinitionShape = (InternalEObject)partOfProductDefinitionShape;
			partOfProductDefinitionShape = (IfcProductDefinitionShape)eResolveProxy(oldPartOfProductDefinitionShape);
			if (partOfProductDefinitionShape != oldPartOfProductDefinitionShape) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_SHAPE_ASPECT__PART_OF_PRODUCT_DEFINITION_SHAPE, oldPartOfProductDefinitionShape, partOfProductDefinitionShape));
			}
		}
		return partOfProductDefinitionShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProductDefinitionShape basicGetPartOfProductDefinitionShape() {
		return partOfProductDefinitionShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartOfProductDefinitionShape(IfcProductDefinitionShape newPartOfProductDefinitionShape, NotificationChain msgs) {
		IfcProductDefinitionShape oldPartOfProductDefinitionShape = partOfProductDefinitionShape;
		partOfProductDefinitionShape = newPartOfProductDefinitionShape;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SHAPE_ASPECT__PART_OF_PRODUCT_DEFINITION_SHAPE, oldPartOfProductDefinitionShape, newPartOfProductDefinitionShape);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartOfProductDefinitionShape(IfcProductDefinitionShape newPartOfProductDefinitionShape) {
		if (newPartOfProductDefinitionShape != partOfProductDefinitionShape) {
			NotificationChain msgs = null;
			if (partOfProductDefinitionShape != null)
				msgs = ((InternalEObject)partOfProductDefinitionShape).eInverseRemove(this, Ifc2x3tc1Package.IFC_PRODUCT_DEFINITION_SHAPE__HAS_SHAPE_ASPECTS, IfcProductDefinitionShape.class, msgs);
			if (newPartOfProductDefinitionShape != null)
				msgs = ((InternalEObject)newPartOfProductDefinitionShape).eInverseAdd(this, Ifc2x3tc1Package.IFC_PRODUCT_DEFINITION_SHAPE__HAS_SHAPE_ASPECTS, IfcProductDefinitionShape.class, msgs);
			msgs = basicSetPartOfProductDefinitionShape(newPartOfProductDefinitionShape, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SHAPE_ASPECT__PART_OF_PRODUCT_DEFINITION_SHAPE, newPartOfProductDefinitionShape, newPartOfProductDefinitionShape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_SHAPE_ASPECT__SHAPE_REPRESENTATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getShapeRepresentations()).basicAdd(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_SHAPE_ASPECT__PART_OF_PRODUCT_DEFINITION_SHAPE:
				if (partOfProductDefinitionShape != null)
					msgs = ((InternalEObject)partOfProductDefinitionShape).eInverseRemove(this, Ifc2x3tc1Package.IFC_PRODUCT_DEFINITION_SHAPE__HAS_SHAPE_ASPECTS, IfcProductDefinitionShape.class, msgs);
				return basicSetPartOfProductDefinitionShape((IfcProductDefinitionShape)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_SHAPE_ASPECT__SHAPE_REPRESENTATIONS:
				return ((InternalEList<?>)getShapeRepresentations()).basicRemove(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_SHAPE_ASPECT__PART_OF_PRODUCT_DEFINITION_SHAPE:
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
			case Ifc2x3tc1Package.IFC_SHAPE_ASPECT__SHAPE_REPRESENTATIONS:
				return getShapeRepresentations();
			case Ifc2x3tc1Package.IFC_SHAPE_ASPECT__NAME:
				return getName();
			case Ifc2x3tc1Package.IFC_SHAPE_ASPECT__DESCRIPTION:
				return getDescription();
			case Ifc2x3tc1Package.IFC_SHAPE_ASPECT__PRODUCT_DEFINITIONAL:
				return isProductDefinitional();
			case Ifc2x3tc1Package.IFC_SHAPE_ASPECT__PART_OF_PRODUCT_DEFINITION_SHAPE:
				if (resolve) return getPartOfProductDefinitionShape();
				return basicGetPartOfProductDefinitionShape();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_SHAPE_ASPECT__SHAPE_REPRESENTATIONS:
				getShapeRepresentations().clear();
				getShapeRepresentations().addAll((Collection<? extends IfcShapeModel>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SHAPE_ASPECT__NAME:
				setName((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SHAPE_ASPECT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SHAPE_ASPECT__PRODUCT_DEFINITIONAL:
				setProductDefinitional((Boolean)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SHAPE_ASPECT__PART_OF_PRODUCT_DEFINITION_SHAPE:
				setPartOfProductDefinitionShape((IfcProductDefinitionShape)newValue);
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
			case Ifc2x3tc1Package.IFC_SHAPE_ASPECT__SHAPE_REPRESENTATIONS:
				getShapeRepresentations().clear();
				return;
			case Ifc2x3tc1Package.IFC_SHAPE_ASPECT__NAME:
				unsetName();
				return;
			case Ifc2x3tc1Package.IFC_SHAPE_ASPECT__DESCRIPTION:
				unsetDescription();
				return;
			case Ifc2x3tc1Package.IFC_SHAPE_ASPECT__PRODUCT_DEFINITIONAL:
				setProductDefinitional(PRODUCT_DEFINITIONAL_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_SHAPE_ASPECT__PART_OF_PRODUCT_DEFINITION_SHAPE:
				setPartOfProductDefinitionShape((IfcProductDefinitionShape)null);
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
			case Ifc2x3tc1Package.IFC_SHAPE_ASPECT__SHAPE_REPRESENTATIONS:
				return shapeRepresentations != null && !shapeRepresentations.isEmpty();
			case Ifc2x3tc1Package.IFC_SHAPE_ASPECT__NAME:
				return isSetName();
			case Ifc2x3tc1Package.IFC_SHAPE_ASPECT__DESCRIPTION:
				return isSetDescription();
			case Ifc2x3tc1Package.IFC_SHAPE_ASPECT__PRODUCT_DEFINITIONAL:
				return productDefinitional != PRODUCT_DEFINITIONAL_EDEFAULT;
			case Ifc2x3tc1Package.IFC_SHAPE_ASPECT__PART_OF_PRODUCT_DEFINITION_SHAPE:
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
		result.append(" (Name: ");
		if (nameESet) result.append(name); else result.append("<unset>");
		result.append(", Description: ");
		if (descriptionESet) result.append(description); else result.append("<unset>");
		result.append(", ProductDefinitional: ");
		result.append(productDefinitional);
		result.append(')');
		return result.toString();
	}

} //IfcShapeAspectImpl
