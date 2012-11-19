/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcVertexPoint;
import org.tech.iai.ifc.xml.ifc._2x3.final_.VertexGeometryType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Vertex Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcVertexPointImpl#getVertexGeometry <em>Vertex Geometry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcVertexPointImpl extends IfcVertexImpl implements IfcVertexPoint {
	/**
	 * The cached value of the '{@link #getVertexGeometry() <em>Vertex Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVertexGeometry()
	 * @generated
	 * @ordered
	 */
	protected VertexGeometryType vertexGeometry;

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
		return FinalPackage.eINSTANCE.getIfcVertexPoint();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VertexGeometryType getVertexGeometry() {
		return vertexGeometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVertexGeometry(VertexGeometryType newVertexGeometry, NotificationChain msgs) {
		VertexGeometryType oldVertexGeometry = vertexGeometry;
		vertexGeometry = newVertexGeometry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_VERTEX_POINT__VERTEX_GEOMETRY, oldVertexGeometry, newVertexGeometry);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVertexGeometry(VertexGeometryType newVertexGeometry) {
		if (newVertexGeometry != vertexGeometry) {
			NotificationChain msgs = null;
			if (vertexGeometry != null)
				msgs = ((InternalEObject)vertexGeometry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_VERTEX_POINT__VERTEX_GEOMETRY, null, msgs);
			if (newVertexGeometry != null)
				msgs = ((InternalEObject)newVertexGeometry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_VERTEX_POINT__VERTEX_GEOMETRY, null, msgs);
			msgs = basicSetVertexGeometry(newVertexGeometry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_VERTEX_POINT__VERTEX_GEOMETRY, newVertexGeometry, newVertexGeometry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_VERTEX_POINT__VERTEX_GEOMETRY:
				return basicSetVertexGeometry(null, msgs);
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
			case FinalPackage.IFC_VERTEX_POINT__VERTEX_GEOMETRY:
				return getVertexGeometry();
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
			case FinalPackage.IFC_VERTEX_POINT__VERTEX_GEOMETRY:
				setVertexGeometry((VertexGeometryType)newValue);
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
			case FinalPackage.IFC_VERTEX_POINT__VERTEX_GEOMETRY:
				setVertexGeometry((VertexGeometryType)null);
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
			case FinalPackage.IFC_VERTEX_POINT__VERTEX_GEOMETRY:
				return vertexGeometry != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcVertexPointImpl
