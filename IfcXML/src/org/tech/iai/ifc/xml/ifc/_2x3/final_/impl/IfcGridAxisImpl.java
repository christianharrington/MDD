/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.EntityImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.AxisCurveType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcGridAxis;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Grid Axis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcGridAxisImpl#getAxisTag <em>Axis Tag</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcGridAxisImpl#getAxisCurve <em>Axis Curve</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcGridAxisImpl#isSameSense <em>Same Sense</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcGridAxisImpl extends EntityImpl implements IfcGridAxis {
	/**
	 * The default value of the '{@link #getAxisTag() <em>Axis Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxisTag()
	 * @generated
	 * @ordered
	 */
	protected static final String AXIS_TAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAxisTag() <em>Axis Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxisTag()
	 * @generated
	 * @ordered
	 */
	protected String axisTag = AXIS_TAG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAxisCurve() <em>Axis Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxisCurve()
	 * @generated
	 * @ordered
	 */
	protected AxisCurveType axisCurve;

	/**
	 * The default value of the '{@link #isSameSense() <em>Same Sense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSameSense()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SAME_SENSE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSameSense() <em>Same Sense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSameSense()
	 * @generated
	 * @ordered
	 */
	protected boolean sameSense = SAME_SENSE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcGridAxisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcGridAxis();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAxisTag() {
		return axisTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxisTag(String newAxisTag) {
		String oldAxisTag = axisTag;
		axisTag = newAxisTag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_GRID_AXIS__AXIS_TAG, oldAxisTag, axisTag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AxisCurveType getAxisCurve() {
		return axisCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAxisCurve(AxisCurveType newAxisCurve, NotificationChain msgs) {
		AxisCurveType oldAxisCurve = axisCurve;
		axisCurve = newAxisCurve;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_GRID_AXIS__AXIS_CURVE, oldAxisCurve, newAxisCurve);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxisCurve(AxisCurveType newAxisCurve) {
		if (newAxisCurve != axisCurve) {
			NotificationChain msgs = null;
			if (axisCurve != null)
				msgs = ((InternalEObject)axisCurve).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_GRID_AXIS__AXIS_CURVE, null, msgs);
			if (newAxisCurve != null)
				msgs = ((InternalEObject)newAxisCurve).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_GRID_AXIS__AXIS_CURVE, null, msgs);
			msgs = basicSetAxisCurve(newAxisCurve, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_GRID_AXIS__AXIS_CURVE, newAxisCurve, newAxisCurve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSameSense() {
		return sameSense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSameSense(boolean newSameSense) {
		boolean oldSameSense = sameSense;
		sameSense = newSameSense;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_GRID_AXIS__SAME_SENSE, oldSameSense, sameSense));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_GRID_AXIS__AXIS_CURVE:
				return basicSetAxisCurve(null, msgs);
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
			case FinalPackage.IFC_GRID_AXIS__AXIS_TAG:
				return getAxisTag();
			case FinalPackage.IFC_GRID_AXIS__AXIS_CURVE:
				return getAxisCurve();
			case FinalPackage.IFC_GRID_AXIS__SAME_SENSE:
				return isSameSense();
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
			case FinalPackage.IFC_GRID_AXIS__AXIS_TAG:
				setAxisTag((String)newValue);
				return;
			case FinalPackage.IFC_GRID_AXIS__AXIS_CURVE:
				setAxisCurve((AxisCurveType)newValue);
				return;
			case FinalPackage.IFC_GRID_AXIS__SAME_SENSE:
				setSameSense((Boolean)newValue);
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
			case FinalPackage.IFC_GRID_AXIS__AXIS_TAG:
				setAxisTag(AXIS_TAG_EDEFAULT);
				return;
			case FinalPackage.IFC_GRID_AXIS__AXIS_CURVE:
				setAxisCurve((AxisCurveType)null);
				return;
			case FinalPackage.IFC_GRID_AXIS__SAME_SENSE:
				setSameSense(SAME_SENSE_EDEFAULT);
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
			case FinalPackage.IFC_GRID_AXIS__AXIS_TAG:
				return AXIS_TAG_EDEFAULT == null ? axisTag != null : !AXIS_TAG_EDEFAULT.equals(axisTag);
			case FinalPackage.IFC_GRID_AXIS__AXIS_CURVE:
				return axisCurve != null;
			case FinalPackage.IFC_GRID_AXIS__SAME_SENSE:
				return sameSense != SAME_SENSE_EDEFAULT;
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
		result.append(" (axisTag: ");
		result.append(axisTag);
		result.append(", sameSense: ");
		result.append(sameSense);
		result.append(')');
		return result.toString();
	}

} //IfcGridAxisImpl
