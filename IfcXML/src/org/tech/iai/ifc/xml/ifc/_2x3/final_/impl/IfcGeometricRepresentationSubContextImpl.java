/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcGeometricProjectionEnum;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcGeometricRepresentationSubContext;
import org.tech.iai.ifc.xml.ifc._2x3.final_.ParentContextType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Geometric Representation Sub Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcGeometricRepresentationSubContextImpl#getParentContext <em>Parent Context</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcGeometricRepresentationSubContextImpl#getTargetScale <em>Target Scale</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcGeometricRepresentationSubContextImpl#getTargetView <em>Target View</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcGeometricRepresentationSubContextImpl#getUserDefinedTargetView <em>User Defined Target View</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcGeometricRepresentationSubContextImpl extends IfcGeometricRepresentationSubContextTempImpl implements IfcGeometricRepresentationSubContext {
	/**
	 * The cached value of the '{@link #getParentContext() <em>Parent Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentContext()
	 * @generated
	 * @ordered
	 */
	protected ParentContextType parentContext;

	/**
	 * The default value of the '{@link #getTargetScale() <em>Target Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetScale()
	 * @generated
	 * @ordered
	 */
	protected static final Double TARGET_SCALE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetScale() <em>Target Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetScale()
	 * @generated
	 * @ordered
	 */
	protected Double targetScale = TARGET_SCALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetView() <em>Target View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetView()
	 * @generated
	 * @ordered
	 */
	protected static final IfcGeometricProjectionEnum TARGET_VIEW_EDEFAULT = IfcGeometricProjectionEnum.GRAPH_VIEW;

	/**
	 * The cached value of the '{@link #getTargetView() <em>Target View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetView()
	 * @generated
	 * @ordered
	 */
	protected IfcGeometricProjectionEnum targetView = TARGET_VIEW_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserDefinedTargetView() <em>User Defined Target View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDefinedTargetView()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_DEFINED_TARGET_VIEW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserDefinedTargetView() <em>User Defined Target View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDefinedTargetView()
	 * @generated
	 * @ordered
	 */
	protected String userDefinedTargetView = USER_DEFINED_TARGET_VIEW_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcGeometricRepresentationSubContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcGeometricRepresentationSubContext();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParentContextType getParentContext() {
		return parentContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentContext(ParentContextType newParentContext, NotificationChain msgs) {
		ParentContextType oldParentContext = parentContext;
		parentContext = newParentContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_GEOMETRIC_REPRESENTATION_SUB_CONTEXT__PARENT_CONTEXT, oldParentContext, newParentContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentContext(ParentContextType newParentContext) {
		if (newParentContext != parentContext) {
			NotificationChain msgs = null;
			if (parentContext != null)
				msgs = ((InternalEObject)parentContext).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_GEOMETRIC_REPRESENTATION_SUB_CONTEXT__PARENT_CONTEXT, null, msgs);
			if (newParentContext != null)
				msgs = ((InternalEObject)newParentContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_GEOMETRIC_REPRESENTATION_SUB_CONTEXT__PARENT_CONTEXT, null, msgs);
			msgs = basicSetParentContext(newParentContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_GEOMETRIC_REPRESENTATION_SUB_CONTEXT__PARENT_CONTEXT, newParentContext, newParentContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getTargetScale() {
		return targetScale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetScale(Double newTargetScale) {
		Double oldTargetScale = targetScale;
		targetScale = newTargetScale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_GEOMETRIC_REPRESENTATION_SUB_CONTEXT__TARGET_SCALE, oldTargetScale, targetScale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcGeometricProjectionEnum getTargetView() {
		return targetView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetView(IfcGeometricProjectionEnum newTargetView) {
		IfcGeometricProjectionEnum oldTargetView = targetView;
		targetView = newTargetView == null ? TARGET_VIEW_EDEFAULT : newTargetView;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_GEOMETRIC_REPRESENTATION_SUB_CONTEXT__TARGET_VIEW, oldTargetView, targetView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserDefinedTargetView() {
		return userDefinedTargetView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserDefinedTargetView(String newUserDefinedTargetView) {
		String oldUserDefinedTargetView = userDefinedTargetView;
		userDefinedTargetView = newUserDefinedTargetView;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_GEOMETRIC_REPRESENTATION_SUB_CONTEXT__USER_DEFINED_TARGET_VIEW, oldUserDefinedTargetView, userDefinedTargetView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_GEOMETRIC_REPRESENTATION_SUB_CONTEXT__PARENT_CONTEXT:
				return basicSetParentContext(null, msgs);
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
			case FinalPackage.IFC_GEOMETRIC_REPRESENTATION_SUB_CONTEXT__PARENT_CONTEXT:
				return getParentContext();
			case FinalPackage.IFC_GEOMETRIC_REPRESENTATION_SUB_CONTEXT__TARGET_SCALE:
				return getTargetScale();
			case FinalPackage.IFC_GEOMETRIC_REPRESENTATION_SUB_CONTEXT__TARGET_VIEW:
				return getTargetView();
			case FinalPackage.IFC_GEOMETRIC_REPRESENTATION_SUB_CONTEXT__USER_DEFINED_TARGET_VIEW:
				return getUserDefinedTargetView();
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
			case FinalPackage.IFC_GEOMETRIC_REPRESENTATION_SUB_CONTEXT__PARENT_CONTEXT:
				setParentContext((ParentContextType)newValue);
				return;
			case FinalPackage.IFC_GEOMETRIC_REPRESENTATION_SUB_CONTEXT__TARGET_SCALE:
				setTargetScale((Double)newValue);
				return;
			case FinalPackage.IFC_GEOMETRIC_REPRESENTATION_SUB_CONTEXT__TARGET_VIEW:
				setTargetView((IfcGeometricProjectionEnum)newValue);
				return;
			case FinalPackage.IFC_GEOMETRIC_REPRESENTATION_SUB_CONTEXT__USER_DEFINED_TARGET_VIEW:
				setUserDefinedTargetView((String)newValue);
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
			case FinalPackage.IFC_GEOMETRIC_REPRESENTATION_SUB_CONTEXT__PARENT_CONTEXT:
				setParentContext((ParentContextType)null);
				return;
			case FinalPackage.IFC_GEOMETRIC_REPRESENTATION_SUB_CONTEXT__TARGET_SCALE:
				setTargetScale(TARGET_SCALE_EDEFAULT);
				return;
			case FinalPackage.IFC_GEOMETRIC_REPRESENTATION_SUB_CONTEXT__TARGET_VIEW:
				setTargetView(TARGET_VIEW_EDEFAULT);
				return;
			case FinalPackage.IFC_GEOMETRIC_REPRESENTATION_SUB_CONTEXT__USER_DEFINED_TARGET_VIEW:
				setUserDefinedTargetView(USER_DEFINED_TARGET_VIEW_EDEFAULT);
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
			case FinalPackage.IFC_GEOMETRIC_REPRESENTATION_SUB_CONTEXT__PARENT_CONTEXT:
				return parentContext != null;
			case FinalPackage.IFC_GEOMETRIC_REPRESENTATION_SUB_CONTEXT__TARGET_SCALE:
				return TARGET_SCALE_EDEFAULT == null ? targetScale != null : !TARGET_SCALE_EDEFAULT.equals(targetScale);
			case FinalPackage.IFC_GEOMETRIC_REPRESENTATION_SUB_CONTEXT__TARGET_VIEW:
				return targetView != TARGET_VIEW_EDEFAULT;
			case FinalPackage.IFC_GEOMETRIC_REPRESENTATION_SUB_CONTEXT__USER_DEFINED_TARGET_VIEW:
				return USER_DEFINED_TARGET_VIEW_EDEFAULT == null ? userDefinedTargetView != null : !USER_DEFINED_TARGET_VIEW_EDEFAULT.equals(userDefinedTargetView);
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
		result.append(" (targetScale: ");
		result.append(targetScale);
		result.append(", targetView: ");
		result.append(targetView);
		result.append(", userDefinedTargetView: ");
		result.append(userDefinedTargetView);
		result.append(')');
		return result.toString();
	}

} //IfcGeometricRepresentationSubContextImpl
