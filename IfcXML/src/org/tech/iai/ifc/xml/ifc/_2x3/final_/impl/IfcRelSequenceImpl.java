/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelSequence;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSequenceEnum;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatedProcessType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingProcessType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelSequenceImpl#getRelatingProcess <em>Relating Process</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelSequenceImpl#getRelatedProcess <em>Related Process</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelSequenceImpl#getTimeLag <em>Time Lag</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelSequenceImpl#getSequenceType <em>Sequence Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelSequenceImpl extends IfcRelConnectsImpl implements IfcRelSequence {
	/**
	 * The cached value of the '{@link #getRelatingProcess() <em>Relating Process</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingProcess()
	 * @generated
	 * @ordered
	 */
	protected RelatingProcessType relatingProcess;

	/**
	 * The cached value of the '{@link #getRelatedProcess() <em>Related Process</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedProcess()
	 * @generated
	 * @ordered
	 */
	protected RelatedProcessType relatedProcess;

	/**
	 * The default value of the '{@link #getTimeLag() <em>Time Lag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeLag()
	 * @generated
	 * @ordered
	 */
	protected static final double TIME_LAG_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTimeLag() <em>Time Lag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeLag()
	 * @generated
	 * @ordered
	 */
	protected double timeLag = TIME_LAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getSequenceType() <em>Sequence Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceType()
	 * @generated
	 * @ordered
	 */
	protected static final IfcSequenceEnum SEQUENCE_TYPE_EDEFAULT = IfcSequenceEnum.START_START;

	/**
	 * The cached value of the '{@link #getSequenceType() <em>Sequence Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceType()
	 * @generated
	 * @ordered
	 */
	protected IfcSequenceEnum sequenceType = SEQUENCE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelSequenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcRelSequence();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingProcessType getRelatingProcess() {
		return relatingProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatingProcess(RelatingProcessType newRelatingProcess, NotificationChain msgs) {
		RelatingProcessType oldRelatingProcess = relatingProcess;
		relatingProcess = newRelatingProcess;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_SEQUENCE__RELATING_PROCESS, oldRelatingProcess, newRelatingProcess);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingProcess(RelatingProcessType newRelatingProcess) {
		if (newRelatingProcess != relatingProcess) {
			NotificationChain msgs = null;
			if (relatingProcess != null)
				msgs = ((InternalEObject)relatingProcess).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_SEQUENCE__RELATING_PROCESS, null, msgs);
			if (newRelatingProcess != null)
				msgs = ((InternalEObject)newRelatingProcess).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_SEQUENCE__RELATING_PROCESS, null, msgs);
			msgs = basicSetRelatingProcess(newRelatingProcess, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_SEQUENCE__RELATING_PROCESS, newRelatingProcess, newRelatingProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedProcessType getRelatedProcess() {
		return relatedProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatedProcess(RelatedProcessType newRelatedProcess, NotificationChain msgs) {
		RelatedProcessType oldRelatedProcess = relatedProcess;
		relatedProcess = newRelatedProcess;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_SEQUENCE__RELATED_PROCESS, oldRelatedProcess, newRelatedProcess);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedProcess(RelatedProcessType newRelatedProcess) {
		if (newRelatedProcess != relatedProcess) {
			NotificationChain msgs = null;
			if (relatedProcess != null)
				msgs = ((InternalEObject)relatedProcess).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_SEQUENCE__RELATED_PROCESS, null, msgs);
			if (newRelatedProcess != null)
				msgs = ((InternalEObject)newRelatedProcess).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_SEQUENCE__RELATED_PROCESS, null, msgs);
			msgs = basicSetRelatedProcess(newRelatedProcess, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_SEQUENCE__RELATED_PROCESS, newRelatedProcess, newRelatedProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTimeLag() {
		return timeLag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeLag(double newTimeLag) {
		double oldTimeLag = timeLag;
		timeLag = newTimeLag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_SEQUENCE__TIME_LAG, oldTimeLag, timeLag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSequenceEnum getSequenceType() {
		return sequenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequenceType(IfcSequenceEnum newSequenceType) {
		IfcSequenceEnum oldSequenceType = sequenceType;
		sequenceType = newSequenceType == null ? SEQUENCE_TYPE_EDEFAULT : newSequenceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_SEQUENCE__SEQUENCE_TYPE, oldSequenceType, sequenceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_REL_SEQUENCE__RELATING_PROCESS:
				return basicSetRelatingProcess(null, msgs);
			case FinalPackage.IFC_REL_SEQUENCE__RELATED_PROCESS:
				return basicSetRelatedProcess(null, msgs);
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
			case FinalPackage.IFC_REL_SEQUENCE__RELATING_PROCESS:
				return getRelatingProcess();
			case FinalPackage.IFC_REL_SEQUENCE__RELATED_PROCESS:
				return getRelatedProcess();
			case FinalPackage.IFC_REL_SEQUENCE__TIME_LAG:
				return getTimeLag();
			case FinalPackage.IFC_REL_SEQUENCE__SEQUENCE_TYPE:
				return getSequenceType();
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
			case FinalPackage.IFC_REL_SEQUENCE__RELATING_PROCESS:
				setRelatingProcess((RelatingProcessType)newValue);
				return;
			case FinalPackage.IFC_REL_SEQUENCE__RELATED_PROCESS:
				setRelatedProcess((RelatedProcessType)newValue);
				return;
			case FinalPackage.IFC_REL_SEQUENCE__TIME_LAG:
				setTimeLag((Double)newValue);
				return;
			case FinalPackage.IFC_REL_SEQUENCE__SEQUENCE_TYPE:
				setSequenceType((IfcSequenceEnum)newValue);
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
			case FinalPackage.IFC_REL_SEQUENCE__RELATING_PROCESS:
				setRelatingProcess((RelatingProcessType)null);
				return;
			case FinalPackage.IFC_REL_SEQUENCE__RELATED_PROCESS:
				setRelatedProcess((RelatedProcessType)null);
				return;
			case FinalPackage.IFC_REL_SEQUENCE__TIME_LAG:
				setTimeLag(TIME_LAG_EDEFAULT);
				return;
			case FinalPackage.IFC_REL_SEQUENCE__SEQUENCE_TYPE:
				setSequenceType(SEQUENCE_TYPE_EDEFAULT);
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
			case FinalPackage.IFC_REL_SEQUENCE__RELATING_PROCESS:
				return relatingProcess != null;
			case FinalPackage.IFC_REL_SEQUENCE__RELATED_PROCESS:
				return relatedProcess != null;
			case FinalPackage.IFC_REL_SEQUENCE__TIME_LAG:
				return timeLag != TIME_LAG_EDEFAULT;
			case FinalPackage.IFC_REL_SEQUENCE__SEQUENCE_TYPE:
				return sequenceType != SEQUENCE_TYPE_EDEFAULT;
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
		result.append(" (timeLag: ");
		result.append(timeLag);
		result.append(", sequenceType: ");
		result.append(sequenceType);
		result.append(')');
		return result.toString();
	}

} //IfcRelSequenceImpl
