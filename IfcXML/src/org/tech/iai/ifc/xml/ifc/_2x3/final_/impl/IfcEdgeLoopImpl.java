/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.EdgeListType1;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcEdgeLoop;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Edge Loop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcEdgeLoopImpl#getEdgeList <em>Edge List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcEdgeLoopImpl extends IfcLoopImpl implements IfcEdgeLoop {
	/**
	 * The cached value of the '{@link #getEdgeList() <em>Edge List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdgeList()
	 * @generated
	 * @ordered
	 */
	protected EdgeListType1 edgeList;

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
		return FinalPackage.eINSTANCE.getIfcEdgeLoop();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeListType1 getEdgeList() {
		return edgeList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEdgeList(EdgeListType1 newEdgeList, NotificationChain msgs) {
		EdgeListType1 oldEdgeList = edgeList;
		edgeList = newEdgeList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_EDGE_LOOP__EDGE_LIST, oldEdgeList, newEdgeList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdgeList(EdgeListType1 newEdgeList) {
		if (newEdgeList != edgeList) {
			NotificationChain msgs = null;
			if (edgeList != null)
				msgs = ((InternalEObject)edgeList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_EDGE_LOOP__EDGE_LIST, null, msgs);
			if (newEdgeList != null)
				msgs = ((InternalEObject)newEdgeList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_EDGE_LOOP__EDGE_LIST, null, msgs);
			msgs = basicSetEdgeList(newEdgeList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_EDGE_LOOP__EDGE_LIST, newEdgeList, newEdgeList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_EDGE_LOOP__EDGE_LIST:
				return basicSetEdgeList(null, msgs);
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
			case FinalPackage.IFC_EDGE_LOOP__EDGE_LIST:
				return getEdgeList();
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
			case FinalPackage.IFC_EDGE_LOOP__EDGE_LIST:
				setEdgeList((EdgeListType1)newValue);
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
			case FinalPackage.IFC_EDGE_LOOP__EDGE_LIST:
				setEdgeList((EdgeListType1)null);
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
			case FinalPackage.IFC_EDGE_LOOP__EDGE_LIST:
				return edgeList != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcEdgeLoopImpl
