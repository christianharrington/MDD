/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcActorSelect;
import ifc2x3tc1.IfcSubContractResource;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Sub Contract Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcSubContractResourceImpl#getSubContractor <em>Sub Contractor</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSubContractResourceImpl#getJobDescription <em>Job Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcSubContractResourceImpl extends IfcConstructionResourceImpl implements IfcSubContractResource {
	/**
	 * The cached value of the '{@link #getSubContractor() <em>Sub Contractor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubContractor()
	 * @generated
	 * @ordered
	 */
	protected IfcActorSelect subContractor;

	/**
	 * This is true if the Sub Contractor reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean subContractorESet;

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
	 * This is true if the Job Description attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean jobDescriptionESet;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcSubContractResource();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcActorSelect getSubContractor() {
		if (subContractor != null && subContractor.eIsProxy()) {
			InternalEObject oldSubContractor = (InternalEObject)subContractor;
			subContractor = (IfcActorSelect)eResolveProxy(oldSubContractor);
			if (subContractor != oldSubContractor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_SUB_CONTRACT_RESOURCE__SUB_CONTRACTOR, oldSubContractor, subContractor));
			}
		}
		return subContractor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcActorSelect basicGetSubContractor() {
		return subContractor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubContractor(IfcActorSelect newSubContractor) {
		IfcActorSelect oldSubContractor = subContractor;
		subContractor = newSubContractor;
		boolean oldSubContractorESet = subContractorESet;
		subContractorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SUB_CONTRACT_RESOURCE__SUB_CONTRACTOR, oldSubContractor, subContractor, !oldSubContractorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSubContractor() {
		IfcActorSelect oldSubContractor = subContractor;
		boolean oldSubContractorESet = subContractorESet;
		subContractor = null;
		subContractorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SUB_CONTRACT_RESOURCE__SUB_CONTRACTOR, oldSubContractor, null, oldSubContractorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSubContractor() {
		return subContractorESet;
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
		boolean oldJobDescriptionESet = jobDescriptionESet;
		jobDescriptionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SUB_CONTRACT_RESOURCE__JOB_DESCRIPTION, oldJobDescription, jobDescription, !oldJobDescriptionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetJobDescription() {
		String oldJobDescription = jobDescription;
		boolean oldJobDescriptionESet = jobDescriptionESet;
		jobDescription = JOB_DESCRIPTION_EDEFAULT;
		jobDescriptionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SUB_CONTRACT_RESOURCE__JOB_DESCRIPTION, oldJobDescription, JOB_DESCRIPTION_EDEFAULT, oldJobDescriptionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetJobDescription() {
		return jobDescriptionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_SUB_CONTRACT_RESOURCE__SUB_CONTRACTOR:
				if (resolve) return getSubContractor();
				return basicGetSubContractor();
			case Ifc2x3tc1Package.IFC_SUB_CONTRACT_RESOURCE__JOB_DESCRIPTION:
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
			case Ifc2x3tc1Package.IFC_SUB_CONTRACT_RESOURCE__SUB_CONTRACTOR:
				setSubContractor((IfcActorSelect)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SUB_CONTRACT_RESOURCE__JOB_DESCRIPTION:
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
			case Ifc2x3tc1Package.IFC_SUB_CONTRACT_RESOURCE__SUB_CONTRACTOR:
				unsetSubContractor();
				return;
			case Ifc2x3tc1Package.IFC_SUB_CONTRACT_RESOURCE__JOB_DESCRIPTION:
				unsetJobDescription();
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
			case Ifc2x3tc1Package.IFC_SUB_CONTRACT_RESOURCE__SUB_CONTRACTOR:
				return isSetSubContractor();
			case Ifc2x3tc1Package.IFC_SUB_CONTRACT_RESOURCE__JOB_DESCRIPTION:
				return isSetJobDescription();
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
		result.append(" (JobDescription: ");
		if (jobDescriptionESet) result.append(jobDescription); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcSubContractResourceImpl
