/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.EdgeEndType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.EdgeStartType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcEdge;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcEdgeImpl#getEdgeStart <em>Edge Start</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcEdgeImpl#getEdgeEnd <em>Edge End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcEdgeImpl extends IfcTopologicalRepresentationItemImpl implements IfcEdge {
	/**
	 * The cached value of the '{@link #getEdgeStart() <em>Edge Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdgeStart()
	 * @generated
	 * @ordered
	 */
	protected EdgeStartType edgeStart;

	/**
	 * The cached value of the '{@link #getEdgeEnd() <em>Edge End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdgeEnd()
	 * @generated
	 * @ordered
	 */
	protected EdgeEndType edgeEnd;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcEdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcEdge();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeStartType getEdgeStart() {
		return edgeStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEdgeStart(EdgeStartType newEdgeStart, NotificationChain msgs) {
		EdgeStartType oldEdgeStart = edgeStart;
		edgeStart = newEdgeStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_EDGE__EDGE_START, oldEdgeStart, newEdgeStart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdgeStart(EdgeStartType newEdgeStart) {
		if (newEdgeStart != edgeStart) {
			NotificationChain msgs = null;
			if (edgeStart != null)
				msgs = ((InternalEObject)edgeStart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_EDGE__EDGE_START, null, msgs);
			if (newEdgeStart != null)
				msgs = ((InternalEObject)newEdgeStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_EDGE__EDGE_START, null, msgs);
			msgs = basicSetEdgeStart(newEdgeStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_EDGE__EDGE_START, newEdgeStart, newEdgeStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeEndType getEdgeEnd() {
		return edgeEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEdgeEnd(EdgeEndType newEdgeEnd, NotificationChain msgs) {
		EdgeEndType oldEdgeEnd = edgeEnd;
		edgeEnd = newEdgeEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_EDGE__EDGE_END, oldEdgeEnd, newEdgeEnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdgeEnd(EdgeEndType newEdgeEnd) {
		if (newEdgeEnd != edgeEnd) {
			NotificationChain msgs = null;
			if (edgeEnd != null)
				msgs = ((InternalEObject)edgeEnd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_EDGE__EDGE_END, null, msgs);
			if (newEdgeEnd != null)
				msgs = ((InternalEObject)newEdgeEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_EDGE__EDGE_END, null, msgs);
			msgs = basicSetEdgeEnd(newEdgeEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_EDGE__EDGE_END, newEdgeEnd, newEdgeEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_EDGE__EDGE_START:
				return basicSetEdgeStart(null, msgs);
			case FinalPackage.IFC_EDGE__EDGE_END:
				return basicSetEdgeEnd(null, msgs);
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
			case FinalPackage.IFC_EDGE__EDGE_START:
				return getEdgeStart();
			case FinalPackage.IFC_EDGE__EDGE_END:
				return getEdgeEnd();
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
			case FinalPackage.IFC_EDGE__EDGE_START:
				setEdgeStart((EdgeStartType)newValue);
				return;
			case FinalPackage.IFC_EDGE__EDGE_END:
				setEdgeEnd((EdgeEndType)newValue);
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
			case FinalPackage.IFC_EDGE__EDGE_START:
				setEdgeStart((EdgeStartType)null);
				return;
			case FinalPackage.IFC_EDGE__EDGE_END:
				setEdgeEnd((EdgeEndType)null);
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
			case FinalPackage.IFC_EDGE__EDGE_START:
				return edgeStart != null;
			case FinalPackage.IFC_EDGE__EDGE_END:
				return edgeEnd != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcEdgeImpl
