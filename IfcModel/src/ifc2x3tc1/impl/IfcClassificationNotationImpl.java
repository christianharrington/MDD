/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcClassificationNotation;
import ifc2x3tc1.IfcClassificationNotationFacet;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Classification Notation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcClassificationNotationImpl#getNotationFacets <em>Notation Facets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcClassificationNotationImpl extends EObjectImpl implements IfcClassificationNotation {
	/**
	 * The cached value of the '{@link #getNotationFacets() <em>Notation Facets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotationFacets()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcClassificationNotationFacet> notationFacets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcClassificationNotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcClassificationNotation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcClassificationNotationFacet> getNotationFacets() {
		if (notationFacets == null) {
			notationFacets = new EObjectResolvingEList<IfcClassificationNotationFacet>(IfcClassificationNotationFacet.class, this, Ifc2x3tc1Package.IFC_CLASSIFICATION_NOTATION__NOTATION_FACETS);
		}
		return notationFacets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_CLASSIFICATION_NOTATION__NOTATION_FACETS:
				return getNotationFacets();
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
			case Ifc2x3tc1Package.IFC_CLASSIFICATION_NOTATION__NOTATION_FACETS:
				getNotationFacets().clear();
				getNotationFacets().addAll((Collection<? extends IfcClassificationNotationFacet>)newValue);
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
			case Ifc2x3tc1Package.IFC_CLASSIFICATION_NOTATION__NOTATION_FACETS:
				getNotationFacets().clear();
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
			case Ifc2x3tc1Package.IFC_CLASSIFICATION_NOTATION__NOTATION_FACETS:
				return notationFacets != null && !notationFacets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IfcClassificationNotationImpl
