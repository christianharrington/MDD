/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcShapeAspect;
import ifc2x3tc1.IfcShapeModel;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Shape Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcShapeModelImpl#getOfShapeAspect <em>Of Shape Aspect</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcShapeModelImpl extends IfcRepresentationImpl implements IfcShapeModel {
	/**
	 * The cached value of the '{@link #getOfShapeAspect() <em>Of Shape Aspect</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOfShapeAspect()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcShapeAspect> ofShapeAspect;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcShapeModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcShapeModel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcShapeAspect> getOfShapeAspect() {
		if (ofShapeAspect == null) {
			ofShapeAspect = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse<IfcShapeAspect>(IfcShapeAspect.class, this, Ifc2x3tc1Package.IFC_SHAPE_MODEL__OF_SHAPE_ASPECT, Ifc2x3tc1Package.IFC_SHAPE_ASPECT__SHAPE_REPRESENTATIONS);
		}
		return ofShapeAspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOfShapeAspect() {
		if (ofShapeAspect != null) ((InternalEList.Unsettable<?>)ofShapeAspect).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOfShapeAspect() {
		return ofShapeAspect != null && ((InternalEList.Unsettable<?>)ofShapeAspect).isSet();
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
			case Ifc2x3tc1Package.IFC_SHAPE_MODEL__OF_SHAPE_ASPECT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOfShapeAspect()).basicAdd(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_SHAPE_MODEL__OF_SHAPE_ASPECT:
				return ((InternalEList<?>)getOfShapeAspect()).basicRemove(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_SHAPE_MODEL__OF_SHAPE_ASPECT:
				return getOfShapeAspect();
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
			case Ifc2x3tc1Package.IFC_SHAPE_MODEL__OF_SHAPE_ASPECT:
				getOfShapeAspect().clear();
				getOfShapeAspect().addAll((Collection<? extends IfcShapeAspect>)newValue);
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
			case Ifc2x3tc1Package.IFC_SHAPE_MODEL__OF_SHAPE_ASPECT:
				unsetOfShapeAspect();
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
			case Ifc2x3tc1Package.IFC_SHAPE_MODEL__OF_SHAPE_ASPECT:
				return isSetOfShapeAspect();
		}
		return super.eIsSet(featureID);
	}

} //IfcShapeModelImpl
