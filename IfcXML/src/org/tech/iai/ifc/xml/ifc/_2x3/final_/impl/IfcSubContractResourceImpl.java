/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSubContractResource;
import org.tech.iai.ifc.xml.ifc._2x3.final_.SubContractorType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Sub Contract Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSubContractResourceImpl#getSubContractor <em>Sub Contractor</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSubContractResourceImpl#getJobDescription <em>Job Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcSubContractResourceImpl extends IfcConstructionResourceImpl implements IfcSubContractResource {
	/**
	 * The cached value of the '{@link #getSubContractor() <em>Sub Contractor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubContractor()
	 * @generated
	 * @ordered
	 */
	protected SubContractorType subContractor;

	/**
	 * The default value of the '{@link #getJobDescription() <em>Job Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String JOB_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJobDescription() <em>Job Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobDescription()
	 * @generated
	 * @ordered
	 */
	protected String jobDescription = JOB_DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSubContractResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcSubContractResource();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubContractorType getSubContractor() {
		return subContractor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubContractor(SubContractorType newSubContractor, NotificationChain msgs) {
		SubContractorType oldSubContractor = subContractor;
		subContractor = newSubContractor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SUB_CONTRACT_RESOURCE__SUB_CONTRACTOR, oldSubContractor, newSubContractor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubContractor(SubContractorType newSubContractor) {
		if (newSubContractor != subContractor) {
			NotificationChain msgs = null;
			if (subContractor != null)
				msgs = ((InternalEObject)subContractor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SUB_CONTRACT_RESOURCE__SUB_CONTRACTOR, null, msgs);
			if (newSubContractor != null)
				msgs = ((InternalEObject)newSubContractor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SUB_CONTRACT_RESOURCE__SUB_CONTRACTOR, null, msgs);
			msgs = basicSetSubContractor(newSubContractor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SUB_CONTRACT_RESOURCE__SUB_CONTRACTOR, newSubContractor, newSubContractor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJobDescription() {
		return jobDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJobDescription(String newJobDescription) {
		String oldJobDescription = jobDescription;
		jobDescription = newJobDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SUB_CONTRACT_RESOURCE__JOB_DESCRIPTION, oldJobDescription, jobDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_SUB_CONTRACT_RESOURCE__SUB_CONTRACTOR:
				return basicSetSubContractor(null, msgs);
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
			case FinalPackage.IFC_SUB_CONTRACT_RESOURCE__SUB_CONTRACTOR:
				return getSubContractor();
			case FinalPackage.IFC_SUB_CONTRACT_RESOURCE__JOB_DESCRIPTION:
				return getJobDescription();
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
			case FinalPackage.IFC_SUB_CONTRACT_RESOURCE__SUB_CONTRACTOR:
				setSubContractor((SubContractorType)newValue);
				return;
			case FinalPackage.IFC_SUB_CONTRACT_RESOURCE__JOB_DESCRIPTION:
				setJobDescription((String)newValue);
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
			case FinalPackage.IFC_SUB_CONTRACT_RESOURCE__SUB_CONTRACTOR:
				setSubContractor((SubContractorType)null);
				return;
			case FinalPackage.IFC_SUB_CONTRACT_RESOURCE__JOB_DESCRIPTION:
				setJobDescription(JOB_DESCRIPTION_EDEFAULT);
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
			case FinalPackage.IFC_SUB_CONTRACT_RESOURCE__SUB_CONTRACTOR:
				return subContractor != null;
			case FinalPackage.IFC_SUB_CONTRACT_RESOURCE__JOB_DESCRIPTION:
				return JOB_DESCRIPTION_EDEFAULT == null ? jobDescription != null : !JOB_DESCRIPTION_EDEFAULT.equals(jobDescription);
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
		result.append(" (jobDescription: ");
		result.append(jobDescription);
		result.append(')');
		return result.toString();
	}

} //IfcSubContractResourceImpl
