/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcProcess;
import ifc2x3tc1.IfcRelSequence;
import ifc2x3tc1.IfcSequenceEnum;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcRelSequenceImpl#getRelatingProcess <em>Relating Process</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRelSequenceImpl#getRelatedProcess <em>Related Process</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRelSequenceImpl#getTimeLag <em>Time Lag</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRelSequenceImpl#getTimeLagAsString <em>Time Lag As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRelSequenceImpl#getSequenceType <em>Sequence Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelSequenceImpl extends IfcRelConnectsImpl implements IfcRelSequence {
	/**
	 * The cached value of the '{@link #getRelatingProcess() <em>Relating Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingProcess()
	 * @generated
	 * @ordered
	 */
	protected IfcProcess relatingProcess;

	/**
	 * The cached value of the '{@link #getRelatedProcess() <em>Related Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedProcess()
	 * @generated
	 * @ordered
	 */
	protected IfcProcess relatedProcess;

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
	 * The default value of the '{@link #getTimeLagAsString() <em>Time Lag As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeLagAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_LAG_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeLagAsString() <em>Time Lag As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeLagAsString()
	 * @generated
	 * @ordered
	 */
	protected String timeLagAsString = TIME_LAG_AS_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getSequenceType() <em>Sequence Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceType()
	 * @generated
	 * @ordered
	 */
	protected static final IfcSequenceEnum SEQUENCE_TYPE_EDEFAULT = IfcSequenceEnum.NULL;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcRelSequence();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProcess getRelatingProcess() {
		if (relatingProcess != null && relatingProcess.eIsProxy()) {
			InternalEObject oldRelatingProcess = (InternalEObject)relatingProcess;
			relatingProcess = (IfcProcess)eResolveProxy(oldRelatingProcess);
			if (relatingProcess != oldRelatingProcess) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_REL_SEQUENCE__RELATING_PROCESS, oldRelatingProcess, relatingProcess));
			}
		}
		return relatingProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProcess basicGetRelatingProcess() {
		return relatingProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatingProcess(IfcProcess newRelatingProcess, NotificationChain msgs) {
		IfcProcess oldRelatingProcess = relatingProcess;
		relatingProcess = newRelatingProcess;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_SEQUENCE__RELATING_PROCESS, oldRelatingProcess, newRelatingProcess);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingProcess(IfcProcess newRelatingProcess) {
		if (newRelatingProcess != relatingProcess) {
			NotificationChain msgs = null;
			if (relatingProcess != null)
				msgs = ((InternalEObject)relatingProcess).eInverseRemove(this, Ifc2x3tc1Package.IFC_PROCESS__IS_PREDECESSOR_TO, IfcProcess.class, msgs);
			if (newRelatingProcess != null)
				msgs = ((InternalEObject)newRelatingProcess).eInverseAdd(this, Ifc2x3tc1Package.IFC_PROCESS__IS_PREDECESSOR_TO, IfcProcess.class, msgs);
			msgs = basicSetRelatingProcess(newRelatingProcess, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_SEQUENCE__RELATING_PROCESS, newRelatingProcess, newRelatingProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProcess getRelatedProcess() {
		if (relatedProcess != null && relatedProcess.eIsProxy()) {
			InternalEObject oldRelatedProcess = (InternalEObject)relatedProcess;
			relatedProcess = (IfcProcess)eResolveProxy(oldRelatedProcess);
			if (relatedProcess != oldRelatedProcess) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_REL_SEQUENCE__RELATED_PROCESS, oldRelatedProcess, relatedProcess));
			}
		}
		return relatedProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProcess basicGetRelatedProcess() {
		return relatedProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatedProcess(IfcProcess newRelatedProcess, NotificationChain msgs) {
		IfcProcess oldRelatedProcess = relatedProcess;
		relatedProcess = newRelatedProcess;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_SEQUENCE__RELATED_PROCESS, oldRelatedProcess, newRelatedProcess);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedProcess(IfcProcess newRelatedProcess) {
		if (newRelatedProcess != relatedProcess) {
			NotificationChain msgs = null;
			if (relatedProcess != null)
				msgs = ((InternalEObject)relatedProcess).eInverseRemove(this, Ifc2x3tc1Package.IFC_PROCESS__IS_SUCCESSOR_FROM, IfcProcess.class, msgs);
			if (newRelatedProcess != null)
				msgs = ((InternalEObject)newRelatedProcess).eInverseAdd(this, Ifc2x3tc1Package.IFC_PROCESS__IS_SUCCESSOR_FROM, IfcProcess.class, msgs);
			msgs = basicSetRelatedProcess(newRelatedProcess, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_SEQUENCE__RELATED_PROCESS, newRelatedProcess, newRelatedProcess));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_SEQUENCE__TIME_LAG, oldTimeLag, timeLag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTimeLagAsString() {
		return timeLagAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeLagAsString(String newTimeLagAsString) {
		String oldTimeLagAsString = timeLagAsString;
		timeLagAsString = newTimeLagAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_SEQUENCE__TIME_LAG_AS_STRING, oldTimeLagAsString, timeLagAsString));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_SEQUENCE__SEQUENCE_TYPE, oldSequenceType, sequenceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_REL_SEQUENCE__RELATING_PROCESS:
				if (relatingProcess != null)
					msgs = ((InternalEObject)relatingProcess).eInverseRemove(this, Ifc2x3tc1Package.IFC_PROCESS__IS_PREDECESSOR_TO, IfcProcess.class, msgs);
				return basicSetRelatingProcess((IfcProcess)otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_REL_SEQUENCE__RELATED_PROCESS:
				if (relatedProcess != null)
					msgs = ((InternalEObject)relatedProcess).eInverseRemove(this, Ifc2x3tc1Package.IFC_PROCESS__IS_SUCCESSOR_FROM, IfcProcess.class, msgs);
				return basicSetRelatedProcess((IfcProcess)otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_REL_SEQUENCE__RELATING_PROCESS:
				return basicSetRelatingProcess(null, msgs);
			case Ifc2x3tc1Package.IFC_REL_SEQUENCE__RELATED_PROCESS:
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
			case Ifc2x3tc1Package.IFC_REL_SEQUENCE__RELATING_PROCESS:
				if (resolve) return getRelatingProcess();
				return basicGetRelatingProcess();
			case Ifc2x3tc1Package.IFC_REL_SEQUENCE__RELATED_PROCESS:
				if (resolve) return getRelatedProcess();
				return basicGetRelatedProcess();
			case Ifc2x3tc1Package.IFC_REL_SEQUENCE__TIME_LAG:
				return getTimeLag();
			case Ifc2x3tc1Package.IFC_REL_SEQUENCE__TIME_LAG_AS_STRING:
				return getTimeLagAsString();
			case Ifc2x3tc1Package.IFC_REL_SEQUENCE__SEQUENCE_TYPE:
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
			case Ifc2x3tc1Package.IFC_REL_SEQUENCE__RELATING_PROCESS:
				setRelatingProcess((IfcProcess)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REL_SEQUENCE__RELATED_PROCESS:
				setRelatedProcess((IfcProcess)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REL_SEQUENCE__TIME_LAG:
				setTimeLag((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REL_SEQUENCE__TIME_LAG_AS_STRING:
				setTimeLagAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REL_SEQUENCE__SEQUENCE_TYPE:
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
			case Ifc2x3tc1Package.IFC_REL_SEQUENCE__RELATING_PROCESS:
				setRelatingProcess((IfcProcess)null);
				return;
			case Ifc2x3tc1Package.IFC_REL_SEQUENCE__RELATED_PROCESS:
				setRelatedProcess((IfcProcess)null);
				return;
			case Ifc2x3tc1Package.IFC_REL_SEQUENCE__TIME_LAG:
				setTimeLag(TIME_LAG_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_REL_SEQUENCE__TIME_LAG_AS_STRING:
				setTimeLagAsString(TIME_LAG_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_REL_SEQUENCE__SEQUENCE_TYPE:
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
			case Ifc2x3tc1Package.IFC_REL_SEQUENCE__RELATING_PROCESS:
				return relatingProcess != null;
			case Ifc2x3tc1Package.IFC_REL_SEQUENCE__RELATED_PROCESS:
				return relatedProcess != null;
			case Ifc2x3tc1Package.IFC_REL_SEQUENCE__TIME_LAG:
				return timeLag != TIME_LAG_EDEFAULT;
			case Ifc2x3tc1Package.IFC_REL_SEQUENCE__TIME_LAG_AS_STRING:
				return TIME_LAG_AS_STRING_EDEFAULT == null ? timeLagAsString != null : !TIME_LAG_AS_STRING_EDEFAULT.equals(timeLagAsString);
			case Ifc2x3tc1Package.IFC_REL_SEQUENCE__SEQUENCE_TYPE:
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
		result.append(" (TimeLag: ");
		result.append(timeLag);
		result.append(", TimeLagAsString: ");
		result.append(timeLagAsString);
		result.append(", SequenceType: ");
		result.append(sequenceType);
		result.append(')');
		return result.toString();
	}

} //IfcRelSequenceImpl
