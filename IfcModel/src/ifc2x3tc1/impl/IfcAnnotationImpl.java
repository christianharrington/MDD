/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcAnnotation;
import ifc2x3tc1.IfcRelContainedInSpatialStructure;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcAnnotationImpl#getContainedInStructure <em>Contained In Structure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcAnnotationImpl extends IfcProductImpl implements IfcAnnotation {
	/**
	 * The cached value of the '{@link #getContainedInStructure() <em>Contained In Structure</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedInStructure()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcRelContainedInSpatialStructure> containedInStructure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcAnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcAnnotation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcRelContainedInSpatialStructure> getContainedInStructure() {
		if (containedInStructure == null) {
			containedInStructure = new EObjectResolvingEList.Unsettable<IfcRelContainedInSpatialStructure>(IfcRelContainedInSpatialStructure.class, this, Ifc2x3tc1Package.IFC_ANNOTATION__CONTAINED_IN_STRUCTURE);
		}
		return containedInStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetContainedInStructure() {
		if (containedInStructure != null) ((InternalEList.Unsettable<?>)containedInStructure).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetContainedInStructure() {
		return containedInStructure != null && ((InternalEList.Unsettable<?>)containedInStructure).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_ANNOTATION__CONTAINED_IN_STRUCTURE:
				return getContainedInStructure();
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
			case Ifc2x3tc1Package.IFC_ANNOTATION__CONTAINED_IN_STRUCTURE:
				getContainedInStructure().clear();
				getContainedInStructure().addAll((Collection<? extends IfcRelContainedInSpatialStructure>)newValue);
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
			case Ifc2x3tc1Package.IFC_ANNOTATION__CONTAINED_IN_STRUCTURE:
				unsetContainedInStructure();
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
			case Ifc2x3tc1Package.IFC_ANNOTATION__CONTAINED_IN_STRUCTURE:
				return isSetContainedInStructure();
		}
		return super.eIsSet(featureID);
	}

} //IfcAnnotationImpl
