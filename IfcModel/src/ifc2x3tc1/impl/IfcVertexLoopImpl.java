/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcVertex;
import ifc2x3tc1.IfcVertexLoop;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Vertex Loop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcVertexLoopImpl#getLoopVertex <em>Loop Vertex</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcVertexLoopImpl extends IfcLoopImpl implements IfcVertexLoop {
	/**
	 * The cached value of the '{@link #getLoopVertex() <em>Loop Vertex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopVertex()
	 * @generated
	 * @ordered
	 */
	protected IfcVertex loopVertex;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcVertexLoop();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcVertex getLoopVertex() {
		if (loopVertex != null && loopVertex.eIsProxy()) {
			InternalEObject oldLoopVertex = (InternalEObject)loopVertex;
			loopVertex = (IfcVertex)eResolveProxy(oldLoopVertex);
			if (loopVertex != oldLoopVertex) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_VERTEX_LOOP__LOOP_VERTEX, oldLoopVertex, loopVertex));
			}
		}
		return loopVertex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcVertex basicGetLoopVertex() {
		return loopVertex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoopVertex(IfcVertex newLoopVertex) {
		IfcVertex oldLoopVertex = loopVertex;
		loopVertex = newLoopVertex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_VERTEX_LOOP__LOOP_VERTEX, oldLoopVertex, loopVertex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_VERTEX_LOOP__LOOP_VERTEX:
				if (resolve) return getLoopVertex();
				return basicGetLoopVertex();
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
			case Ifc2x3tc1Package.IFC_VERTEX_LOOP__LOOP_VERTEX:
				setLoopVertex((IfcVertex)newValue);
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
			case Ifc2x3tc1Package.IFC_VERTEX_LOOP__LOOP_VERTEX:
				setLoopVertex((IfcVertex)null);
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
			case Ifc2x3tc1Package.IFC_VERTEX_LOOP__LOOP_VERTEX:
				return loopVertex != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcVertexLoopImpl
