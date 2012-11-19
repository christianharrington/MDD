/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCsgSolid;
import org.tech.iai.ifc.xml.ifc._2x3.final_.TreeRootExpressionType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Csg Solid</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcCsgSolidImpl#getTreeRootExpression <em>Tree Root Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcCsgSolidImpl extends IfcSolidModelImpl implements IfcCsgSolid {
	/**
	 * The cached value of the '{@link #getTreeRootExpression() <em>Tree Root Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreeRootExpression()
	 * @generated
	 * @ordered
	 */
	protected TreeRootExpressionType treeRootExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcCsgSolidImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcCsgSolid();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TreeRootExpressionType getTreeRootExpression() {
		return treeRootExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTreeRootExpression(TreeRootExpressionType newTreeRootExpression, NotificationChain msgs) {
		TreeRootExpressionType oldTreeRootExpression = treeRootExpression;
		treeRootExpression = newTreeRootExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CSG_SOLID__TREE_ROOT_EXPRESSION, oldTreeRootExpression, newTreeRootExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTreeRootExpression(TreeRootExpressionType newTreeRootExpression) {
		if (newTreeRootExpression != treeRootExpression) {
			NotificationChain msgs = null;
			if (treeRootExpression != null)
				msgs = ((InternalEObject)treeRootExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CSG_SOLID__TREE_ROOT_EXPRESSION, null, msgs);
			if (newTreeRootExpression != null)
				msgs = ((InternalEObject)newTreeRootExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CSG_SOLID__TREE_ROOT_EXPRESSION, null, msgs);
			msgs = basicSetTreeRootExpression(newTreeRootExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CSG_SOLID__TREE_ROOT_EXPRESSION, newTreeRootExpression, newTreeRootExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_CSG_SOLID__TREE_ROOT_EXPRESSION:
				return basicSetTreeRootExpression(null, msgs);
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
			case FinalPackage.IFC_CSG_SOLID__TREE_ROOT_EXPRESSION:
				return getTreeRootExpression();
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
			case FinalPackage.IFC_CSG_SOLID__TREE_ROOT_EXPRESSION:
				setTreeRootExpression((TreeRootExpressionType)newValue);
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
			case FinalPackage.IFC_CSG_SOLID__TREE_ROOT_EXPRESSION:
				setTreeRootExpression((TreeRootExpressionType)null);
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
			case FinalPackage.IFC_CSG_SOLID__TREE_ROOT_EXPRESSION:
				return treeRootExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcCsgSolidImpl
