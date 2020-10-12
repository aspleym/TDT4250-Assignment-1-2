/**
 */
package sp.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sp.Department;
import sp.SpPackage;
import sp.StudyPlan;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Study Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sp.impl.StudyPlanImpl#getDepartments <em>Departments</em>}</li>
 *   <li>{@link sp.impl.StudyPlanImpl#getStudentNr <em>Student Nr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StudyPlanImpl extends MinimalEObjectImpl.Container implements StudyPlan {
	/**
	 * The cached value of the '{@link #getDepartments() <em>Departments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartments()
	 * @generated
	 * @ordered
	 */
	protected EList<Department> departments;

	/**
	 * The default value of the '{@link #getStudentNr() <em>Student Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudentNr()
	 * @generated
	 * @ordered
	 */
	protected static final int STUDENT_NR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStudentNr() <em>Student Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudentNr()
	 * @generated
	 * @ordered
	 */
	protected int studentNr = STUDENT_NR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudyPlanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpPackage.Literals.STUDY_PLAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Department> getDepartments() {
		if (departments == null) {
			departments = new EObjectContainmentEList<Department>(Department.class, this, SpPackage.STUDY_PLAN__DEPARTMENTS);
		}
		return departments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStudentNr() {
		return studentNr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStudentNr(int newStudentNr) {
		int oldStudentNr = studentNr;
		studentNr = newStudentNr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpPackage.STUDY_PLAN__STUDENT_NR, oldStudentNr, studentNr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpPackage.STUDY_PLAN__DEPARTMENTS:
				return ((InternalEList<?>)getDepartments()).basicRemove(otherEnd, msgs);
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
			case SpPackage.STUDY_PLAN__DEPARTMENTS:
				return getDepartments();
			case SpPackage.STUDY_PLAN__STUDENT_NR:
				return getStudentNr();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SpPackage.STUDY_PLAN__DEPARTMENTS:
				getDepartments().clear();
				getDepartments().addAll((Collection<? extends Department>)newValue);
				return;
			case SpPackage.STUDY_PLAN__STUDENT_NR:
				setStudentNr((Integer)newValue);
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
			case SpPackage.STUDY_PLAN__DEPARTMENTS:
				getDepartments().clear();
				return;
			case SpPackage.STUDY_PLAN__STUDENT_NR:
				setStudentNr(STUDENT_NR_EDEFAULT);
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
			case SpPackage.STUDY_PLAN__DEPARTMENTS:
				return departments != null && !departments.isEmpty();
			case SpPackage.STUDY_PLAN__STUDENT_NR:
				return studentNr != STUDENT_NR_EDEFAULT;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (studentNr: ");
		result.append(studentNr);
		result.append(')');
		return result.toString();
	}

} //StudyPlanImpl
