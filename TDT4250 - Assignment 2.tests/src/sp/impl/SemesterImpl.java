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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import sp.CourseInSemester;
import sp.Semester;
import sp.SpPackage;
import sp.Year;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sp.impl.SemesterImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link sp.impl.SemesterImpl#getCourses <em>Courses</em>}</li>
 *   <li>{@link sp.impl.SemesterImpl#getSemesterInYear <em>Semester In Year</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemesterImpl extends MinimalEObjectImpl.Container implements Semester {
	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected int number = NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCourses() <em>Courses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<CourseInSemester> courses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemesterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpPackage.Literals.SEMESTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(int newNumber) {
		int oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpPackage.SEMESTER__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CourseInSemester> getCourses() {
		if (courses == null) {
			courses = new EObjectContainmentWithInverseEList<CourseInSemester>(CourseInSemester.class, this, SpPackage.SEMESTER__COURSES, SpPackage.COURSE_IN_SEMESTER__SEMESTER);
		}
		return courses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Year getSemesterInYear() {
		if (eContainerFeatureID() != SpPackage.SEMESTER__SEMESTER_IN_YEAR) return null;
		return (Year)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSemesterInYear(Year newSemesterInYear, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSemesterInYear, SpPackage.SEMESTER__SEMESTER_IN_YEAR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemesterInYear(Year newSemesterInYear) {
		if (newSemesterInYear != eInternalContainer() || (eContainerFeatureID() != SpPackage.SEMESTER__SEMESTER_IN_YEAR && newSemesterInYear != null)) {
			if (EcoreUtil.isAncestor(this, newSemesterInYear))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSemesterInYear != null)
				msgs = ((InternalEObject)newSemesterInYear).eInverseAdd(this, SpPackage.YEAR__SEMESTERS, Year.class, msgs);
			msgs = basicSetSemesterInYear(newSemesterInYear, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpPackage.SEMESTER__SEMESTER_IN_YEAR, newSemesterInYear, newSemesterInYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpPackage.SEMESTER__COURSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCourses()).basicAdd(otherEnd, msgs);
			case SpPackage.SEMESTER__SEMESTER_IN_YEAR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSemesterInYear((Year)otherEnd, msgs);
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
			case SpPackage.SEMESTER__COURSES:
				return ((InternalEList<?>)getCourses()).basicRemove(otherEnd, msgs);
			case SpPackage.SEMESTER__SEMESTER_IN_YEAR:
				return basicSetSemesterInYear(null, msgs);
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
			case SpPackage.SEMESTER__SEMESTER_IN_YEAR:
				return eInternalContainer().eInverseRemove(this, SpPackage.YEAR__SEMESTERS, Year.class, msgs);
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
			case SpPackage.SEMESTER__NUMBER:
				return getNumber();
			case SpPackage.SEMESTER__COURSES:
				return getCourses();
			case SpPackage.SEMESTER__SEMESTER_IN_YEAR:
				return getSemesterInYear();
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
			case SpPackage.SEMESTER__NUMBER:
				setNumber((Integer)newValue);
				return;
			case SpPackage.SEMESTER__COURSES:
				getCourses().clear();
				getCourses().addAll((Collection<? extends CourseInSemester>)newValue);
				return;
			case SpPackage.SEMESTER__SEMESTER_IN_YEAR:
				setSemesterInYear((Year)newValue);
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
			case SpPackage.SEMESTER__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case SpPackage.SEMESTER__COURSES:
				getCourses().clear();
				return;
			case SpPackage.SEMESTER__SEMESTER_IN_YEAR:
				setSemesterInYear((Year)null);
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
			case SpPackage.SEMESTER__NUMBER:
				return number != NUMBER_EDEFAULT;
			case SpPackage.SEMESTER__COURSES:
				return courses != null && !courses.isEmpty();
			case SpPackage.SEMESTER__SEMESTER_IN_YEAR:
				return getSemesterInYear() != null;
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
		result.append(" (number: ");
		result.append(number);
		result.append(')');
		return result.toString();
	}

} //SemesterImpl
