/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcGeometricProjectionEnum;
import ifc2x3tc1.IfcGeometricRepresentationContext;
import ifc2x3tc1.IfcGeometricRepresentationSubContext;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Geometric Representation Sub Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcGeometricRepresentationSubContextImpl#getParentContext <em>Parent Context</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcGeometricRepresentationSubContextImpl#getTargetScale <em>Target Scale</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcGeometricRepresentationSubContextImpl#getTargetScaleAsString <em>Target Scale As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcGeometricRepresentationSubContextImpl#getTargetView <em>Target View</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcGeometricRepresentationSubContextImpl#getUserDefinedTargetView <em>User Defined Target View</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcGeometricRepresentationSubContextImpl extends IfcGeometricRepresentationContextImpl implements IfcGeometricRepresentationSubContext {
	/**
	 * The cached value of the '{@link #getParentContext() <em>Parent Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentContext()
	 * @generated
	 * @ordered
	 */
	protected IfcGeometricRepresentationContext parentContext;

	/**
	 * The default value of the '{@link #getTargetScale() <em>Target Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetScale()
	 * @generated
	 * @ordered
	 */
	protected static final double TARGET_SCALE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTargetScale() <em>Target Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetScale()
	 * @generated
	 * @ordered
	 */
	protected double targetScale = TARGET_SCALE_EDEFAULT;

	/**
	 * This is true if the Target Scale attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean targetScaleESet;

	/**
	 * The default value of the '{@link #getTargetScaleAsString() <em>Target Scale As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetScaleAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_SCALE_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetScaleAsString() <em>Target Scale As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetScaleAsString()
	 * @generated
	 * @ordered
	 */
	protected String targetScaleAsString = TARGET_SCALE_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Target Scale As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean targetScaleAsStringESet;

	/**
	 * The default value of the '{@link #getTargetView() <em>Target View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetView()
	 * @generated
	 * @ordered
	 */
	protected static final IfcGeometricProjectionEnum TARGET_VIEW_EDEFAULT = IfcGeometricProjectionEnum.NULL;

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
	 * This is true if the User Defined Target View attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean userDefinedTargetViewESet;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcGeometricRepresentationSubContext();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcGeometricRepresentationContext getParentContext() {
		if (parentContext != null && parentContext.eIsProxy()) {
			InternalEObject oldParentContext = (InternalEObject)parentContext;
			parentContext = (IfcGeometricRepresentationContext)eResolveProxy(oldParentContext);
			if (parentContext != oldParentContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_SUB_CONTEXT__PARENT_CONTEXT, oldParentContext, parentContext));
			}
		}
		return parentContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcGeometricRepresentationContext basicGetParentContext() {
		return parentContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentContext(IfcGeometricRepresentationContext newParentContext, NotificationChain msgs) {
		IfcGeometricRepresentationContext oldParentContext = parentContext;
		parentContext = newParentContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_SUB_CONTEXT__PARENT_CONTEXT, oldParentContext, newParentContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentContext(IfcGeometricRepresentationContext newParentContext) {
		if (newParentContext != parentContext) {
			NotificationChain msgs = null;
			if (parentContext != null)
				msgs = ((InternalEObject)parentContext).eInverseRemove(this, Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__HAS_SUB_CONTEXTS, IfcGeometricRepresentationContext.class, msgs);
			if (newParentContext != null)
				msgs = ((InternalEObject)newParentContext).eInverseAdd(this, Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__HAS_SUB_CONTEXTS, IfcGeometricRepresentationContext.class, msgs);
			msgs = basicSetParentContext(newParentContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_SUB_CONTEXT__PARENT_CONTEXT, newParentContext, newParentContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTargetScale() {
		return targetScale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetScale(double newTargetScale) {
		double oldTargetScale = targetScale;
		targetScale = newTargetScale;
		boolean oldTargetScaleESet = targetScaleESet;
		targetScaleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_SUB_CONTEXT__TARGET_SCALE, oldTargetScale, targetScale, !oldTargetScaleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTargetScale() {
		double oldTargetScale = targetScale;
		boolean oldTargetScaleESet = targetScaleESet;
		targetScale = TARGET_SCALE_EDEFAULT;
		targetScaleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_SUB_CONTEXT__TARGET_SCALE, oldTargetScale, TARGET_SCALE_EDEFAULT, oldTargetScaleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTargetScale() {
		return targetScaleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetScaleAsString() {
		return targetScaleAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetScaleAsString(String newTargetScaleAsString) {
		String oldTargetScaleAsString = targetScaleAsString;
		targetScaleAsString = newTargetScaleAsString;
		boolean oldTargetScaleAsStringESet = targetScaleAsStringESet;
		targetScaleAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_SUB_CONTEXT__TARGET_SCALE_AS_STRING, oldTargetScaleAsString, targetScaleAsString, !oldTargetScaleAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTargetScaleAsString() {
		String oldTargetScaleAsString = targetScaleAsString;
		boolean oldTargetScaleAsStringESet = targetScaleAsStringESet;
		targetScaleAsString = TARGET_SCALE_AS_STRING_EDEFAULT;
		targetScaleAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_SUB_CONTEXT__TARGET_SCALE_AS_STRING, oldTargetScaleAsString, TARGET_SCALE_AS_STRING_EDEFAULT, oldTargetScaleAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTargetScaleAsString() {
		return targetScaleAsStringESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_SUB_CONTEXT__TARGET_VIEW, oldTargetView, targetView));
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
		boolean oldUserDefinedTargetViewESet = userDefinedTargetViewESet;
		userDefinedTargetViewESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_SUB_CONTEXT__USER_DEFINED_TARGET_VIEW, oldUserDefinedTargetView, userDefinedTargetView, !oldUserDefinedTargetViewESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUserDefinedTargetView() {
		String oldUserDefinedTargetView = userDefinedTargetView;
		boolean oldUserDefinedTargetViewESet = userDefinedTargetViewESet;
		userDefinedTargetView = USER_DEFINED_TARGET_VIEW_EDEFAULT;
		userDefinedTargetViewESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_SUB_CONTEXT__USER_DEFINED_TARGET_VIEW, oldUserDefinedTargetView, USER_DEFINED_TARGET_VIEW_EDEFAULT, oldUserDefinedTargetViewESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUserDefinedTargetView() {
		return userDefinedTargetViewESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_SUB_CONTEXT__PARENT_CONTEXT:
				if (parentContext != null)
					msgs = ((InternalEObject)parentContext).eInverseRemove(this, Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__HAS_SUB_CONTEXTS, IfcGeometricRepresentationContext.class, msgs);
				return basicSetParentContext((IfcGeometricRepresentationContext)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_SUB_CONTEXT__PARENT_CONTEXT:
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
			case Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_SUB_CONTEXT__PARENT_CONTEXT:
				if (resolve) return getParentContext();
				return basicGetParentContext();
			case Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_SUB_CONTEXT__TARGET_SCALE:
				return getTargetScale();
			case Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_SUB_CONTEXT__TARGET_SCALE_AS_STRING:
				return getTargetScaleAsString();
			case Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_SUB_CONTEXT__TARGET_VIEW:
				return getTargetView();
			case Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_SUB_CONTEXT__USER_DEFINED_TARGET_VIEW:
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
			case Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_SUB_CONTEXT__PARENT_CONTEXT:
				setParentContext((IfcGeometricRepresentationContext)newValue);
				return;
			case Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_SUB_CONTEXT__TARGET_SCALE:
				setTargetScale((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_SUB_CONTEXT__TARGET_SCALE_AS_STRING:
				setTargetScaleAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_SUB_CONTEXT__TARGET_VIEW:
				setTargetView((IfcGeometricProjectionEnum)newValue);
				return;
			case Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_SUB_CONTEXT__USER_DEFINED_TARGET_VIEW:
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
			case Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_SUB_CONTEXT__PARENT_CONTEXT:
				setParentContext((IfcGeometricRepresentationContext)null);
				return;
			case Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_SUB_CONTEXT__TARGET_SCALE:
				unsetTargetScale();
				return;
			case Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_SUB_CONTEXT__TARGET_SCALE_AS_STRING:
				unsetTargetScaleAsString();
				return;
			case Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_SUB_CONTEXT__TARGET_VIEW:
				setTargetView(TARGET_VIEW_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_SUB_CONTEXT__USER_DEFINED_TARGET_VIEW:
				unsetUserDefinedTargetView();
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
			case Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_SUB_CONTEXT__PARENT_CONTEXT:
				return parentContext != null;
			case Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_SUB_CONTEXT__TARGET_SCALE:
				return isSetTargetScale();
			case Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_SUB_CONTEXT__TARGET_SCALE_AS_STRING:
				return isSetTargetScaleAsString();
			case Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_SUB_CONTEXT__TARGET_VIEW:
				return targetView != TARGET_VIEW_EDEFAULT;
			case Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_SUB_CONTEXT__USER_DEFINED_TARGET_VIEW:
				return isSetUserDefinedTargetView();
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
		result.append(" (TargetScale: ");
		if (targetScaleESet) result.append(targetScale); else result.append("<unset>");
		result.append(", TargetScaleAsString: ");
		if (targetScaleAsStringESet) result.append(targetScaleAsString); else result.append("<unset>");
		result.append(", TargetView: ");
		result.append(targetView);
		result.append(", UserDefinedTargetView: ");
		if (userDefinedTargetViewESet) result.append(userDefinedTargetView); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcGeometricRepresentationSubContextImpl
