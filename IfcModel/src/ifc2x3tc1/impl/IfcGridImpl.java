/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcGrid;
import ifc2x3tc1.IfcGridAxis;
import ifc2x3tc1.IfcRelContainedInSpatialStructure;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Grid</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcGridImpl#getUAxes <em>UAxes</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcGridImpl#getVAxes <em>VAxes</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcGridImpl#getWAxes <em>WAxes</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcGridImpl#getContainedInStructure <em>Contained In Structure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcGridImpl extends IfcProductImpl implements IfcGrid {
	/**
	 * The cached value of the '{@link #getUAxes() <em>UAxes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUAxes()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcGridAxis> uAxes;

	/**
	 * The cached value of the '{@link #getVAxes() <em>VAxes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVAxes()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcGridAxis> vAxes;

	/**
	 * The cached value of the '{@link #getWAxes() <em>WAxes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWAxes()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcGridAxis> wAxes;

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
	protected IfcGridImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcGrid();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcGridAxis> getUAxes() {
		if (uAxes == null) {
			uAxes = new EObjectWithInverseResolvingEList.ManyInverse<IfcGridAxis>(IfcGridAxis.class, this, Ifc2x3tc1Package.IFC_GRID__UAXES, Ifc2x3tc1Package.IFC_GRID_AXIS__PART_OF_U);
		}
		return uAxes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcGridAxis> getVAxes() {
		if (vAxes == null) {
			vAxes = new EObjectWithInverseResolvingEList.ManyInverse<IfcGridAxis>(IfcGridAxis.class, this, Ifc2x3tc1Package.IFC_GRID__VAXES, Ifc2x3tc1Package.IFC_GRID_AXIS__PART_OF_V);
		}
		return vAxes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcGridAxis> getWAxes() {
		if (wAxes == null) {
			wAxes = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse<IfcGridAxis>(IfcGridAxis.class, this, Ifc2x3tc1Package.IFC_GRID__WAXES, Ifc2x3tc1Package.IFC_GRID_AXIS__PART_OF_W);
		}
		return wAxes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWAxes() {
		if (wAxes != null) ((InternalEList.Unsettable<?>)wAxes).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWAxes() {
		return wAxes != null && ((InternalEList.Unsettable<?>)wAxes).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcRelContainedInSpatialStructure> getContainedInStructure() {
		if (containedInStructure == null) {
			containedInStructure = new EObjectResolvingEList.Unsettable<IfcRelContainedInSpatialStructure>(IfcRelContainedInSpatialStructure.class, this, Ifc2x3tc1Package.IFC_GRID__CONTAINED_IN_STRUCTURE);
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_GRID__UAXES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUAxes()).basicAdd(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_GRID__VAXES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVAxes()).basicAdd(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_GRID__WAXES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWAxes()).basicAdd(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_GRID__UAXES:
				return ((InternalEList<?>)getUAxes()).basicRemove(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_GRID__VAXES:
				return ((InternalEList<?>)getVAxes()).basicRemove(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_GRID__WAXES:
				return ((InternalEList<?>)getWAxes()).basicRemove(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_GRID__UAXES:
				return getUAxes();
			case Ifc2x3tc1Package.IFC_GRID__VAXES:
				return getVAxes();
			case Ifc2x3tc1Package.IFC_GRID__WAXES:
				return getWAxes();
			case Ifc2x3tc1Package.IFC_GRID__CONTAINED_IN_STRUCTURE:
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
			case Ifc2x3tc1Package.IFC_GRID__UAXES:
				getUAxes().clear();
				getUAxes().addAll((Collection<? extends IfcGridAxis>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_GRID__VAXES:
				getVAxes().clear();
				getVAxes().addAll((Collection<? extends IfcGridAxis>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_GRID__WAXES:
				getWAxes().clear();
				getWAxes().addAll((Collection<? extends IfcGridAxis>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_GRID__CONTAINED_IN_STRUCTURE:
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
			case Ifc2x3tc1Package.IFC_GRID__UAXES:
				getUAxes().clear();
				return;
			case Ifc2x3tc1Package.IFC_GRID__VAXES:
				getVAxes().clear();
				return;
			case Ifc2x3tc1Package.IFC_GRID__WAXES:
				unsetWAxes();
				return;
			case Ifc2x3tc1Package.IFC_GRID__CONTAINED_IN_STRUCTURE:
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
			case Ifc2x3tc1Package.IFC_GRID__UAXES:
				return uAxes != null && !uAxes.isEmpty();
			case Ifc2x3tc1Package.IFC_GRID__VAXES:
				return vAxes != null && !vAxes.isEmpty();
			case Ifc2x3tc1Package.IFC_GRID__WAXES:
				return isSetWAxes();
			case Ifc2x3tc1Package.IFC_GRID__CONTAINED_IN_STRUCTURE:
				return isSetContainedInStructure();
		}
		return super.eIsSet(featureID);
	}

} //IfcGridImpl
