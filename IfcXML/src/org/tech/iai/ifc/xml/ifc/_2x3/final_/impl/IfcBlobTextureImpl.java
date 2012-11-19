/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcBlobTexture;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Blob Texture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcBlobTextureImpl#getRasterFormat <em>Raster Format</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcBlobTextureImpl#isRasterCode <em>Raster Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcBlobTextureImpl extends IfcSurfaceTextureImpl implements IfcBlobTexture {
	/**
	 * The default value of the '{@link #getRasterFormat() <em>Raster Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRasterFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String RASTER_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRasterFormat() <em>Raster Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRasterFormat()
	 * @generated
	 * @ordered
	 */
	protected String rasterFormat = RASTER_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #isRasterCode() <em>Raster Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRasterCode()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RASTER_CODE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRasterCode() <em>Raster Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRasterCode()
	 * @generated
	 * @ordered
	 */
	protected boolean rasterCode = RASTER_CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcBlobTextureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcBlobTexture();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRasterFormat() {
		return rasterFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRasterFormat(String newRasterFormat) {
		String oldRasterFormat = rasterFormat;
		rasterFormat = newRasterFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_BLOB_TEXTURE__RASTER_FORMAT, oldRasterFormat, rasterFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRasterCode() {
		return rasterCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRasterCode(boolean newRasterCode) {
		boolean oldRasterCode = rasterCode;
		rasterCode = newRasterCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_BLOB_TEXTURE__RASTER_CODE, oldRasterCode, rasterCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalPackage.IFC_BLOB_TEXTURE__RASTER_FORMAT:
				return getRasterFormat();
			case FinalPackage.IFC_BLOB_TEXTURE__RASTER_CODE:
				return isRasterCode();
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
			case FinalPackage.IFC_BLOB_TEXTURE__RASTER_FORMAT:
				setRasterFormat((String)newValue);
				return;
			case FinalPackage.IFC_BLOB_TEXTURE__RASTER_CODE:
				setRasterCode((Boolean)newValue);
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
			case FinalPackage.IFC_BLOB_TEXTURE__RASTER_FORMAT:
				setRasterFormat(RASTER_FORMAT_EDEFAULT);
				return;
			case FinalPackage.IFC_BLOB_TEXTURE__RASTER_CODE:
				setRasterCode(RASTER_CODE_EDEFAULT);
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
			case FinalPackage.IFC_BLOB_TEXTURE__RASTER_FORMAT:
				return RASTER_FORMAT_EDEFAULT == null ? rasterFormat != null : !RASTER_FORMAT_EDEFAULT.equals(rasterFormat);
			case FinalPackage.IFC_BLOB_TEXTURE__RASTER_CODE:
				return rasterCode != RASTER_CODE_EDEFAULT;
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
		result.append(" (rasterFormat: ");
		result.append(rasterFormat);
		result.append(", rasterCode: ");
		result.append(rasterCode);
		result.append(')');
		return result.toString();
	}

} //IfcBlobTextureImpl
