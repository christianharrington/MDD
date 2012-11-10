/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcEdgeLoop;
import ifc2x3tc1.IfcOrientedEdge;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Edge Loop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcEdgeLoopImpl#getEdgeList <em>Edge List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcEdgeLoopImpl extends IfcLoopImpl implements IfcEdgeLoop {
	/**
	 * The cached value of the '{@link #getEdgeList() <em>Edge List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdgeList()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcOrientedEdge> edgeList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcEdgeLoopImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcEdgeLoop();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcOrientedEdge> getEdgeList() {
		if (edgeList == null) {
			edgeList = new EObjectResolvingEList<IfcOrientedEdge>(IfcOrientedEdge.class, this, Ifc2x3tc1Package.IFC_EDGE_LOOP__EDGE_LIST);
		}
		return edgeList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_EDGE_LOOP__EDGE_LIST:
				return getEdgeList();
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
			case Ifc2x3tc1Package.IFC_EDGE_LOOP__EDGE_LIST:
				getEdgeList().clear();
				getEdgeList().addAll((Collection<? extends IfcOrientedEdge>)newValue);
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
			case Ifc2x3tc1Package.IFC_EDGE_LOOP__EDGE_LIST:
				getEdgeList().clear();
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
			case Ifc2x3tc1Package.IFC_EDGE_LOOP__EDGE_LIST:
				return edgeList != null && !edgeList.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IfcEdgeLoopImpl
