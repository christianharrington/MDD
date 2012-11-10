/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcPoint;
import ifc2x3tc1.IfcVertexPoint;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Vertex Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcVertexPointImpl#getVertexGeometry <em>Vertex Geometry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcVertexPointImpl extends IfcVertexImpl implements IfcVertexPoint {
	/**
	 * The cached value of the '{@link #getVertexGeometry() <em>Vertex Geometry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVertexGeometry()
	 * @generated
	 * @ordered
	 */
	protected IfcPoint vertexGeometry;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcVertexPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcVertexPoint();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPoint getVertexGeometry() {
		if (vertexGeometry != null && vertexGeometry.eIsProxy()) {
			InternalEObject oldVertexGeometry = (InternalEObject)vertexGeometry;
			vertexGeometry = (IfcPoint)eResolveProxy(oldVertexGeometry);
			if (vertexGeometry != oldVertexGeometry) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_VERTEX_POINT__VERTEX_GEOMETRY, oldVertexGeometry, vertexGeometry));
			}
		}
		return vertexGeometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPoint basicGetVertexGeometry() {
		return vertexGeometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVertexGeometry(IfcPoint newVertexGeometry) {
		IfcPoint oldVertexGeometry = vertexGeometry;
		vertexGeometry = newVertexGeometry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_VERTEX_POINT__VERTEX_GEOMETRY, oldVertexGeometry, vertexGeometry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_VERTEX_POINT__VERTEX_GEOMETRY:
				if (resolve) return getVertexGeometry();
				return basicGetVertexGeometry();
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
			case Ifc2x3tc1Package.IFC_VERTEX_POINT__VERTEX_GEOMETRY:
				setVertexGeometry((IfcPoint)newValue);
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
			case Ifc2x3tc1Package.IFC_VERTEX_POINT__VERTEX_GEOMETRY:
				setVertexGeometry((IfcPoint)null);
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
			case Ifc2x3tc1Package.IFC_VERTEX_POINT__VERTEX_GEOMETRY:
				return vertexGeometry != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcVertexPointImpl
