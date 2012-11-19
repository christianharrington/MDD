/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPoint;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcVertexPoint;
import org.tech.iai.ifc.xml.ifc._2x3.final_.PointOnRelatingElementType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Point On Relating Element Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.PointOnRelatingElementTypeImpl#getIfcPointGroup <em>Ifc Point Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.PointOnRelatingElementTypeImpl#getIfcPoint <em>Ifc Point</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.PointOnRelatingElementTypeImpl#getIfcVertexPoint <em>Ifc Vertex Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PointOnRelatingElementTypeImpl extends EObjectImpl implements PointOnRelatingElementType {
	/**
	 * The cached value of the '{@link #getIfcPointGroup() <em>Ifc Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcPointGroup;

	/**
	 * The cached value of the '{@link #getIfcVertexPoint() <em>Ifc Vertex Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcVertexPoint()
	 * @generated
	 * @ordered
	 */
	protected IfcVertexPoint ifcVertexPoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PointOnRelatingElementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getPointOnRelatingElementType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcPointGroup() {
		if (ifcPointGroup == null) {
			ifcPointGroup = new BasicFeatureMap(this, FinalPackage.POINT_ON_RELATING_ELEMENT_TYPE__IFC_POINT_GROUP);
		}
		return ifcPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPoint getIfcPoint() {
		return (IfcPoint)getIfcPointGroup().get(FinalPackage.eINSTANCE.getPointOnRelatingElementType_IfcPoint(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcPoint(IfcPoint newIfcPoint, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcPointGroup()).basicAdd(FinalPackage.eINSTANCE.getPointOnRelatingElementType_IfcPoint(), newIfcPoint, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcVertexPoint getIfcVertexPoint() {
		return ifcVertexPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcVertexPoint(IfcVertexPoint newIfcVertexPoint, NotificationChain msgs) {
		IfcVertexPoint oldIfcVertexPoint = ifcVertexPoint;
		ifcVertexPoint = newIfcVertexPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.POINT_ON_RELATING_ELEMENT_TYPE__IFC_VERTEX_POINT, oldIfcVertexPoint, newIfcVertexPoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcVertexPoint(IfcVertexPoint newIfcVertexPoint) {
		if (newIfcVertexPoint != ifcVertexPoint) {
			NotificationChain msgs = null;
			if (ifcVertexPoint != null)
				msgs = ((InternalEObject)ifcVertexPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.POINT_ON_RELATING_ELEMENT_TYPE__IFC_VERTEX_POINT, null, msgs);
			if (newIfcVertexPoint != null)
				msgs = ((InternalEObject)newIfcVertexPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.POINT_ON_RELATING_ELEMENT_TYPE__IFC_VERTEX_POINT, null, msgs);
			msgs = basicSetIfcVertexPoint(newIfcVertexPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.POINT_ON_RELATING_ELEMENT_TYPE__IFC_VERTEX_POINT, newIfcVertexPoint, newIfcVertexPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.POINT_ON_RELATING_ELEMENT_TYPE__IFC_POINT_GROUP:
				return ((InternalEList<?>)getIfcPointGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.POINT_ON_RELATING_ELEMENT_TYPE__IFC_POINT:
				return basicSetIfcPoint(null, msgs);
			case FinalPackage.POINT_ON_RELATING_ELEMENT_TYPE__IFC_VERTEX_POINT:
				return basicSetIfcVertexPoint(null, msgs);
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
			case FinalPackage.POINT_ON_RELATING_ELEMENT_TYPE__IFC_POINT_GROUP:
				if (coreType) return getIfcPointGroup();
				return ((FeatureMap.Internal)getIfcPointGroup()).getWrapper();
			case FinalPackage.POINT_ON_RELATING_ELEMENT_TYPE__IFC_POINT:
				return getIfcPoint();
			case FinalPackage.POINT_ON_RELATING_ELEMENT_TYPE__IFC_VERTEX_POINT:
				return getIfcVertexPoint();
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
			case FinalPackage.POINT_ON_RELATING_ELEMENT_TYPE__IFC_POINT_GROUP:
				((FeatureMap.Internal)getIfcPointGroup()).set(newValue);
				return;
			case FinalPackage.POINT_ON_RELATING_ELEMENT_TYPE__IFC_VERTEX_POINT:
				setIfcVertexPoint((IfcVertexPoint)newValue);
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
			case FinalPackage.POINT_ON_RELATING_ELEMENT_TYPE__IFC_POINT_GROUP:
				getIfcPointGroup().clear();
				return;
			case FinalPackage.POINT_ON_RELATING_ELEMENT_TYPE__IFC_VERTEX_POINT:
				setIfcVertexPoint((IfcVertexPoint)null);
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
			case FinalPackage.POINT_ON_RELATING_ELEMENT_TYPE__IFC_POINT_GROUP:
				return ifcPointGroup != null && !ifcPointGroup.isEmpty();
			case FinalPackage.POINT_ON_RELATING_ELEMENT_TYPE__IFC_POINT:
				return getIfcPoint() != null;
			case FinalPackage.POINT_ON_RELATING_ELEMENT_TYPE__IFC_VERTEX_POINT:
				return ifcVertexPoint != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (ifcPointGroup: ");
		result.append(ifcPointGroup);
		result.append(')');
		return result.toString();
	}

} //PointOnRelatingElementTypeImpl
