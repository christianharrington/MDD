/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcCsgSelect;
import ifc2x3tc1.IfcCsgSolid;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Csg Solid</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcCsgSolidImpl#getTreeRootExpression <em>Tree Root Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcCsgSolidImpl extends IfcSolidModelImpl implements IfcCsgSolid {
	/**
	 * The cached value of the '{@link #getTreeRootExpression() <em>Tree Root Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreeRootExpression()
	 * @generated
	 * @ordered
	 */
	protected IfcCsgSelect treeRootExpression;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcCsgSolid();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCsgSelect getTreeRootExpression() {
		if (treeRootExpression != null && treeRootExpression.eIsProxy()) {
			InternalEObject oldTreeRootExpression = (InternalEObject)treeRootExpression;
			treeRootExpression = (IfcCsgSelect)eResolveProxy(oldTreeRootExpression);
			if (treeRootExpression != oldTreeRootExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_CSG_SOLID__TREE_ROOT_EXPRESSION, oldTreeRootExpression, treeRootExpression));
			}
		}
		return treeRootExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCsgSelect basicGetTreeRootExpression() {
		return treeRootExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTreeRootExpression(IfcCsgSelect newTreeRootExpression) {
		IfcCsgSelect oldTreeRootExpression = treeRootExpression;
		treeRootExpression = newTreeRootExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CSG_SOLID__TREE_ROOT_EXPRESSION, oldTreeRootExpression, treeRootExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_CSG_SOLID__TREE_ROOT_EXPRESSION:
				if (resolve) return getTreeRootExpression();
				return basicGetTreeRootExpression();
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
			case Ifc2x3tc1Package.IFC_CSG_SOLID__TREE_ROOT_EXPRESSION:
				setTreeRootExpression((IfcCsgSelect)newValue);
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
			case Ifc2x3tc1Package.IFC_CSG_SOLID__TREE_ROOT_EXPRESSION:
				setTreeRootExpression((IfcCsgSelect)null);
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
			case Ifc2x3tc1Package.IFC_CSG_SOLID__TREE_ROOT_EXPRESSION:
				return treeRootExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcCsgSolidImpl
