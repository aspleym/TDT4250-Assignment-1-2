/**
 */
package sp.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import sp.Course;
import sp.CourseInSemester;
import sp.Semester;
import sp.SpPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course In Semester</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sp.impl.CourseInSemesterImpl#getCourse <em>Course</em>}</li>
 *   <li>{@link sp.impl.CourseInSemesterImpl#isMandatory <em>Mandatory</em>}</li>
 *   <li>{@link sp.impl.CourseInSemesterImpl#getSemester <em>Semester</em>}</li>
 *   <li>{@link sp.impl.CourseInSemesterImpl#isPicked <em>Picked</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseInSemesterImpl extends MinimalEObjectImpl.Container implements CourseInSemester {
	/**
	 * The cached value of the '{@link #getCourse() <em>Course</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourse()
	 * @generated
	 * @ordered
	 */
	protected Course course;

	/**
	 * The default value of the '{@link #isMandatory() <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMandatory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MANDATORY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMandatory() <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMandatory()
	 * @generated
	 * @ordered
	 */
	protected boolean mandatory = MANDATORY_EDEFAULT;

	/**
	 * The default value of the '{@link #isPicked() <em>Picked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPicked()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PICKED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPicked() <em>Picked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPicked()
	 * @generated
	 * @ordered
	 */
	protected boolean picked = PICKED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseInSemesterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpPackage.Literals.COURSE_IN_SEMESTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course getCourse() {
		if (course != null && course.eIsProxy()) {
			InternalEObject oldCourse = (InternalEObject)course;
			course = (Course)eResolveProxy(oldCourse);
			if (course != oldCourse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpPackage.COURSE_IN_SEMESTER__COURSE, oldCourse, course));
			}
		}
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course basicGetCourse() {
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCourse(Course newCourse) {
		Course oldCourse = course;
		course = newCourse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpPackage.COURSE_IN_SEMESTER__COURSE, oldCourse, course));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMandatory() {
		return mandatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setMandatory(boolean newMandatory) {
		boolean oldMandatory = mandatory;
		mandatory = newMandatory;
		this.setPicked(newMandatory);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpPackage.COURSE_IN_SEMESTER__MANDATORY, oldMandatory, mandatory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Semester getSemester() {
		if (eContainerFeatureID() != SpPackage.COURSE_IN_SEMESTER__SEMESTER) return null;
		return (Semester)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSemester(Semester newSemester, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSemester, SpPackage.COURSE_IN_SEMESTER__SEMESTER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemester(Semester newSemester) {
		if (newSemester != eInternalContainer() || (eContainerFeatureID() != SpPackage.COURSE_IN_SEMESTER__SEMESTER && newSemester != null)) {
			if (EcoreUtil.isAncestor(this, newSemester))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSemester != null)
				msgs = ((InternalEObject)newSemester).eInverseAdd(this, SpPackage.SEMESTER__COURSES, Semester.class, msgs);
			msgs = basicSetSemester(newSemester, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpPackage.COURSE_IN_SEMESTER__SEMESTER, newSemester, newSemester));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPicked() {
		return picked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPicked(boolean newPicked) {
		boolean oldPicked = picked;
		picked = newPicked;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpPackage.COURSE_IN_SEMESTER__PICKED, oldPicked, picked));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpPackage.COURSE_IN_SEMESTER__SEMESTER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSemester((Semester)otherEnd, msgs);
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
			case SpPackage.COURSE_IN_SEMESTER__SEMESTER:
				return basicSetSemester(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SpPackage.COURSE_IN_SEMESTER__SEMESTER:
				return eInternalContainer().eInverseRemove(this, SpPackage.SEMESTER__COURSES, Semester.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpPackage.COURSE_IN_SEMESTER__COURSE:
				if (resolve) return getCourse();
				return basicGetCourse();
			case SpPackage.COURSE_IN_SEMESTER__MANDATORY:
				return isMandatory();
			case SpPackage.COURSE_IN_SEMESTER__SEMESTER:
				return getSemester();
			case SpPackage.COURSE_IN_SEMESTER__PICKED:
				return isPicked();
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
			case SpPackage.COURSE_IN_SEMESTER__COURSE:
				setCourse((Course)newValue);
				return;
			case SpPackage.COURSE_IN_SEMESTER__MANDATORY:
				setMandatory((Boolean)newValue);
				return;
			case SpPackage.COURSE_IN_SEMESTER__SEMESTER:
				setSemester((Semester)newValue);
				return;
			case SpPackage.COURSE_IN_SEMESTER__PICKED:
				setPicked((Boolean)newValue);
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
			case SpPackage.COURSE_IN_SEMESTER__COURSE:
				setCourse((Course)null);
				return;
			case SpPackage.COURSE_IN_SEMESTER__MANDATORY:
				setMandatory(MANDATORY_EDEFAULT);
				return;
			case SpPackage.COURSE_IN_SEMESTER__SEMESTER:
				setSemester((Semester)null);
				return;
			case SpPackage.COURSE_IN_SEMESTER__PICKED:
				setPicked(PICKED_EDEFAULT);
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
			case SpPackage.COURSE_IN_SEMESTER__COURSE:
				return course != null;
			case SpPackage.COURSE_IN_SEMESTER__MANDATORY:
				return mandatory != MANDATORY_EDEFAULT;
			case SpPackage.COURSE_IN_SEMESTER__SEMESTER:
				return getSemester() != null;
			case SpPackage.COURSE_IN_SEMESTER__PICKED:
				return picked != PICKED_EDEFAULT;
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
		result.append(" (mandatory: ");
		result.append(mandatory);
		result.append(", picked: ");
		result.append(picked);
		result.append(')');
		return result.toString();
	}

} //CourseInSemesterImpl
