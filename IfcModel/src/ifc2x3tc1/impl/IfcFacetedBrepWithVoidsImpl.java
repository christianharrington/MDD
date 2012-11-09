/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcClosedShell;
import ifc2x3tc1.IfcFacetedBrepWithVoids;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Faceted Brep With Voids</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcFacetedBrepWithVoidsImpl#getVoids <em>Voids</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcFacetedBrepWithVoidsImpl extends IfcManifoldSolidBrepImpl implements IfcFacetedBrepWithVoids {
	/**
	 * The cached value of the '{@link #getVoids() <em>Voids</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoids()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcClosedShell> voids;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcFacetedBrepWithVoidsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcFacetedBrepWithVoids();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcClosedShell> getVoids() {
		if (voids == null) {
			voids = new EObjectResolvingEList<IfcClosedShell>(IfcClosedShell.class, this, Ifc2x3tc1Package.IFC_FACETED_BREP_WITH_VOIDS__VOIDS);
		}
		return voids;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_FACETED_BREP_WITH_VOIDS__VOIDS:
				return getVoids();
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
			case Ifc2x3tc1Package.IFC_FACETED_BREP_WITH_VOIDS__VOIDS:
				getVoids().clear();
				getVoids().addAll((Collection<? extends IfcClosedShell>)newValue);
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
			case Ifc2x3tc1Package.IFC_FACETED_BREP_WITH_VOIDS__VOIDS:
				getVoids().clear();
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
			case Ifc2x3tc1Package.IFC_FACETED_BREP_WITH_VOIDS__VOIDS:
				return voids != null && !voids.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IfcFacetedBrepWithVoidsImpl
