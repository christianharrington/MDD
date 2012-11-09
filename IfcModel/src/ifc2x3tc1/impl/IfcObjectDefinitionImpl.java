/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcObjectDefinition;
import ifc2x3tc1.IfcRelAssigns;
import ifc2x3tc1.IfcRelAssociates;
import ifc2x3tc1.IfcRelDecomposes;

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
 * An implementation of the model object '<em><b>Ifc Object Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcObjectDefinitionImpl#getHasAssignments <em>Has Assignments</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcObjectDefinitionImpl#getIsDecomposedBy <em>Is Decomposed By</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcObjectDefinitionImpl#getDecomposes <em>Decomposes</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcObjectDefinitionImpl#getHasAssociations <em>Has Associations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcObjectDefinitionImpl extends IfcRootImpl implements IfcObjectDefinition {
	/**
	 * The cached value of the '{@link #getHasAssignments() <em>Has Assignments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasAssignments()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcRelAssigns> hasAssignments;

	/**
	 * The cached value of the '{@link #getIsDecomposedBy() <em>Is Decomposed By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDecomposedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcRelDecomposes> isDecomposedBy;

	/**
	 * The cached value of the '{@link #getDecomposes() <em>Decomposes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecomposes()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcRelDecomposes> decomposes;

	/**
	 * The cached value of the '{@link #getHasAssociations() <em>Has Associations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasAssociations()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcRelAssociates> hasAssociations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcObjectDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcObjectDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcRelAssigns> getHasAssignments() {
		if (hasAssignments == null) {
			hasAssignments = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse<IfcRelAssigns>(IfcRelAssigns.class, this, Ifc2x3tc1Package.IFC_OBJECT_DEFINITION__HAS_ASSIGNMENTS, Ifc2x3tc1Package.IFC_REL_ASSIGNS__RELATED_OBJECTS);
		}
		return hasAssignments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHasAssignments() {
		if (hasAssignments != null) ((InternalEList.Unsettable<?>)hasAssignments).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHasAssignments() {
		return hasAssignments != null && ((InternalEList.Unsettable<?>)hasAssignments).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcRelDecomposes> getIsDecomposedBy() {
		if (isDecomposedBy == null) {
			isDecomposedBy = new EObjectWithInverseResolvingEList.Unsettable<IfcRelDecomposes>(IfcRelDecomposes.class, this, Ifc2x3tc1Package.IFC_OBJECT_DEFINITION__IS_DECOMPOSED_BY, Ifc2x3tc1Package.IFC_REL_DECOMPOSES__RELATING_OBJECT);
		}
		return isDecomposedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsDecomposedBy() {
		if (isDecomposedBy != null) ((InternalEList.Unsettable<?>)isDecomposedBy).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsDecomposedBy() {
		return isDecomposedBy != null && ((InternalEList.Unsettable<?>)isDecomposedBy).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcRelDecomposes> getDecomposes() {
		if (decomposes == null) {
			decomposes = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse<IfcRelDecomposes>(IfcRelDecomposes.class, this, Ifc2x3tc1Package.IFC_OBJECT_DEFINITION__DECOMPOSES, Ifc2x3tc1Package.IFC_REL_DECOMPOSES__RELATED_OBJECTS);
		}
		return decomposes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDecomposes() {
		if (decomposes != null) ((InternalEList.Unsettable<?>)decomposes).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDecomposes() {
		return decomposes != null && ((InternalEList.Unsettable<?>)decomposes).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcRelAssociates> getHasAssociations() {
		if (hasAssociations == null) {
			hasAssociations = new EObjectResolvingEList.Unsettable<IfcRelAssociates>(IfcRelAssociates.class, this, Ifc2x3tc1Package.IFC_OBJECT_DEFINITION__HAS_ASSOCIATIONS);
		}
		return hasAssociations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHasAssociations() {
		if (hasAssociations != null) ((InternalEList.Unsettable<?>)hasAssociations).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHasAssociations() {
		return hasAssociations != null && ((InternalEList.Unsettable<?>)hasAssociations).isSet();
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
			case Ifc2x3tc1Package.IFC_OBJECT_DEFINITION__HAS_ASSIGNMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasAssignments()).basicAdd(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_OBJECT_DEFINITION__IS_DECOMPOSED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsDecomposedBy()).basicAdd(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_OBJECT_DEFINITION__DECOMPOSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDecomposes()).basicAdd(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_OBJECT_DEFINITION__HAS_ASSIGNMENTS:
				return ((InternalEList<?>)getHasAssignments()).basicRemove(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_OBJECT_DEFINITION__IS_DECOMPOSED_BY:
				return ((InternalEList<?>)getIsDecomposedBy()).basicRemove(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_OBJECT_DEFINITION__DECOMPOSES:
				return ((InternalEList<?>)getDecomposes()).basicRemove(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_OBJECT_DEFINITION__HAS_ASSIGNMENTS:
				return getHasAssignments();
			case Ifc2x3tc1Package.IFC_OBJECT_DEFINITION__IS_DECOMPOSED_BY:
				return getIsDecomposedBy();
			case Ifc2x3tc1Package.IFC_OBJECT_DEFINITION__DECOMPOSES:
				return getDecomposes();
			case Ifc2x3tc1Package.IFC_OBJECT_DEFINITION__HAS_ASSOCIATIONS:
				return getHasAssociations();
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
			case Ifc2x3tc1Package.IFC_OBJECT_DEFINITION__HAS_ASSIGNMENTS:
				getHasAssignments().clear();
				getHasAssignments().addAll((Collection<? extends IfcRelAssigns>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_OBJECT_DEFINITION__IS_DECOMPOSED_BY:
				getIsDecomposedBy().clear();
				getIsDecomposedBy().addAll((Collection<? extends IfcRelDecomposes>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_OBJECT_DEFINITION__DECOMPOSES:
				getDecomposes().clear();
				getDecomposes().addAll((Collection<? extends IfcRelDecomposes>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_OBJECT_DEFINITION__HAS_ASSOCIATIONS:
				getHasAssociations().clear();
				getHasAssociations().addAll((Collection<? extends IfcRelAssociates>)newValue);
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
			case Ifc2x3tc1Package.IFC_OBJECT_DEFINITION__HAS_ASSIGNMENTS:
				unsetHasAssignments();
				return;
			case Ifc2x3tc1Package.IFC_OBJECT_DEFINITION__IS_DECOMPOSED_BY:
				unsetIsDecomposedBy();
				return;
			case Ifc2x3tc1Package.IFC_OBJECT_DEFINITION__DECOMPOSES:
				unsetDecomposes();
				return;
			case Ifc2x3tc1Package.IFC_OBJECT_DEFINITION__HAS_ASSOCIATIONS:
				unsetHasAssociations();
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
			case Ifc2x3tc1Package.IFC_OBJECT_DEFINITION__HAS_ASSIGNMENTS:
				return isSetHasAssignments();
			case Ifc2x3tc1Package.IFC_OBJECT_DEFINITION__IS_DECOMPOSED_BY:
				return isSetIsDecomposedBy();
			case Ifc2x3tc1Package.IFC_OBJECT_DEFINITION__DECOMPOSES:
				return isSetDecomposes();
			case Ifc2x3tc1Package.IFC_OBJECT_DEFINITION__HAS_ASSOCIATIONS:
				return isSetHasAssociations();
		}
		return super.eIsSet(featureID);
	}

} //IfcObjectDefinitionImpl
