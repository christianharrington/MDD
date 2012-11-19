/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcVertexLoop;
import org.tech.iai.ifc.xml.ifc._2x3.final_.LoopVertexType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Vertex Loop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcVertexLoopImpl#getLoopVertex <em>Loop Vertex</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcVertexLoopImpl extends IfcLoopImpl implements IfcVertexLoop {
	/**
	 * The cached value of the '{@link #getLoopVertex() <em>Loop Vertex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopVertex()
	 * @generated
	 * @ordered
	 */
	protected LoopVertexType loopVertex;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcVertexLoopImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcVertexLoop();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopVertexType getLoopVertex() {
		return loopVertex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoopVertex(LoopVertexType newLoopVertex, NotificationChain msgs) {
		LoopVertexType oldLoopVertex = loopVertex;
		loopVertex = newLoopVertex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_VERTEX_LOOP__LOOP_VERTEX, oldLoopVertex, newLoopVertex);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoopVertex(LoopVertexType newLoopVertex) {
		if (newLoopVertex != loopVertex) {
			NotificationChain msgs = null;
			if (loopVertex != null)
				msgs = ((InternalEObject)loopVertex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_VERTEX_LOOP__LOOP_VERTEX, null, msgs);
			if (newLoopVertex != null)
				msgs = ((InternalEObject)newLoopVertex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_VERTEX_LOOP__LOOP_VERTEX, null, msgs);
			msgs = basicSetLoopVertex(newLoopVertex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_VERTEX_LOOP__LOOP_VERTEX, newLoopVertex, newLoopVertex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_VERTEX_LOOP__LOOP_VERTEX:
				return basicSetLoopVertex(null, msgs);
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
			case FinalPackage.IFC_VERTEX_LOOP__LOOP_VERTEX:
				return getLoopVertex();
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
			case FinalPackage.IFC_VERTEX_LOOP__LOOP_VERTEX:
				setLoopVertex((LoopVertexType)newValue);
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
			case FinalPackage.IFC_VERTEX_LOOP__LOOP_VERTEX:
				setLoopVertex((LoopVertexType)null);
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
			case FinalPackage.IFC_VERTEX_LOOP__LOOP_VERTEX:
				return loopVertex != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcVertexLoopImpl
