/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcDocumentElectronicFormat;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Document Electronic Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcDocumentElectronicFormatImpl#getFileExtension <em>File Extension</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcDocumentElectronicFormatImpl#getMimeContentType <em>Mime Content Type</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcDocumentElectronicFormatImpl#getMimeSubtype <em>Mime Subtype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcDocumentElectronicFormatImpl extends EObjectImpl implements IfcDocumentElectronicFormat {
	/**
	 * The default value of the '{@link #getFileExtension() <em>File Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileExtension()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_EXTENSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileExtension() <em>File Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileExtension()
	 * @generated
	 * @ordered
	 */
	protected String fileExtension = FILE_EXTENSION_EDEFAULT;

	/**
	 * This is true if the File Extension attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fileExtensionESet;

	/**
	 * The default value of the '{@link #getMimeContentType() <em>Mime Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimeContentType()
	 * @generated
	 * @ordered
	 */
	protected static final String MIME_CONTENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMimeContentType() <em>Mime Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimeContentType()
	 * @generated
	 * @ordered
	 */
	protected String mimeContentType = MIME_CONTENT_TYPE_EDEFAULT;

	/**
	 * This is true if the Mime Content Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mimeContentTypeESet;

	/**
	 * The default value of the '{@link #getMimeSubtype() <em>Mime Subtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimeSubtype()
	 * @generated
	 * @ordered
	 */
	protected static final String MIME_SUBTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMimeSubtype() <em>Mime Subtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimeSubtype()
	 * @generated
	 * @ordered
	 */
	protected String mimeSubtype = MIME_SUBTYPE_EDEFAULT;

	/**
	 * This is true if the Mime Subtype attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mimeSubtypeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcDocumentElectronicFormatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcDocumentElectronicFormat();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFileExtension() {
		return fileExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileExtension(String newFileExtension) {
		String oldFileExtension = fileExtension;
		fileExtension = newFileExtension;
		boolean oldFileExtensionESet = fileExtensionESet;
		fileExtensionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DOCUMENT_ELECTRONIC_FORMAT__FILE_EXTENSION, oldFileExtension, fileExtension, !oldFileExtensionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFileExtension() {
		String oldFileExtension = fileExtension;
		boolean oldFileExtensionESet = fileExtensionESet;
		fileExtension = FILE_EXTENSION_EDEFAULT;
		fileExtensionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_DOCUMENT_ELECTRONIC_FORMAT__FILE_EXTENSION, oldFileExtension, FILE_EXTENSION_EDEFAULT, oldFileExtensionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFileExtension() {
		return fileExtensionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMimeContentType() {
		return mimeContentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMimeContentType(String newMimeContentType) {
		String oldMimeContentType = mimeContentType;
		mimeContentType = newMimeContentType;
		boolean oldMimeContentTypeESet = mimeContentTypeESet;
		mimeContentTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DOCUMENT_ELECTRONIC_FORMAT__MIME_CONTENT_TYPE, oldMimeContentType, mimeContentType, !oldMimeContentTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMimeContentType() {
		String oldMimeContentType = mimeContentType;
		boolean oldMimeContentTypeESet = mimeContentTypeESet;
		mimeContentType = MIME_CONTENT_TYPE_EDEFAULT;
		mimeContentTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_DOCUMENT_ELECTRONIC_FORMAT__MIME_CONTENT_TYPE, oldMimeContentType, MIME_CONTENT_TYPE_EDEFAULT, oldMimeContentTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMimeContentType() {
		return mimeContentTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMimeSubtype() {
		return mimeSubtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMimeSubtype(String newMimeSubtype) {
		String oldMimeSubtype = mimeSubtype;
		mimeSubtype = newMimeSubtype;
		boolean oldMimeSubtypeESet = mimeSubtypeESet;
		mimeSubtypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DOCUMENT_ELECTRONIC_FORMAT__MIME_SUBTYPE, oldMimeSubtype, mimeSubtype, !oldMimeSubtypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMimeSubtype() {
		String oldMimeSubtype = mimeSubtype;
		boolean oldMimeSubtypeESet = mimeSubtypeESet;
		mimeSubtype = MIME_SUBTYPE_EDEFAULT;
		mimeSubtypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_DOCUMENT_ELECTRONIC_FORMAT__MIME_SUBTYPE, oldMimeSubtype, MIME_SUBTYPE_EDEFAULT, oldMimeSubtypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMimeSubtype() {
		return mimeSubtypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_DOCUMENT_ELECTRONIC_FORMAT__FILE_EXTENSION:
				return getFileExtension();
			case Ifc2x3tc1Package.IFC_DOCUMENT_ELECTRONIC_FORMAT__MIME_CONTENT_TYPE:
				return getMimeContentType();
			case Ifc2x3tc1Package.IFC_DOCUMENT_ELECTRONIC_FORMAT__MIME_SUBTYPE:
				return getMimeSubtype();
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
			case Ifc2x3tc1Package.IFC_DOCUMENT_ELECTRONIC_FORMAT__FILE_EXTENSION:
				setFileExtension((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_DOCUMENT_ELECTRONIC_FORMAT__MIME_CONTENT_TYPE:
				setMimeContentType((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_DOCUMENT_ELECTRONIC_FORMAT__MIME_SUBTYPE:
				setMimeSubtype((String)newValue);
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
			case Ifc2x3tc1Package.IFC_DOCUMENT_ELECTRONIC_FORMAT__FILE_EXTENSION:
				unsetFileExtension();
				return;
			case Ifc2x3tc1Package.IFC_DOCUMENT_ELECTRONIC_FORMAT__MIME_CONTENT_TYPE:
				unsetMimeContentType();
				return;
			case Ifc2x3tc1Package.IFC_DOCUMENT_ELECTRONIC_FORMAT__MIME_SUBTYPE:
				unsetMimeSubtype();
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
			case Ifc2x3tc1Package.IFC_DOCUMENT_ELECTRONIC_FORMAT__FILE_EXTENSION:
				return isSetFileExtension();
			case Ifc2x3tc1Package.IFC_DOCUMENT_ELECTRONIC_FORMAT__MIME_CONTENT_TYPE:
				return isSetMimeContentType();
			case Ifc2x3tc1Package.IFC_DOCUMENT_ELECTRONIC_FORMAT__MIME_SUBTYPE:
				return isSetMimeSubtype();
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
		result.append(" (FileExtension: ");
		if (fileExtensionESet) result.append(fileExtension); else result.append("<unset>");
		result.append(", MimeContentType: ");
		if (mimeContentTypeESet) result.append(mimeContentType); else result.append("<unset>");
		result.append(", MimeSubtype: ");
		if (mimeSubtypeESet) result.append(mimeSubtype); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcDocumentElectronicFormatImpl
