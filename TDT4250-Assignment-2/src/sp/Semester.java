/**
 */
package sp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sp.Semester#getNumber <em>Number</em>}</li>
 *   <li>{@link sp.Semester#getCourses <em>Courses</em>}</li>
 *   <li>{@link sp.Semester#getSemesterInYear <em>Semester In Year</em>}</li>
 * </ul>
 *
 * @see sp.SpPackage#getSemester()
 * @model
 * @generated
 */
public interface Semester extends EObject {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(int)
	 * @see sp.SpPackage#getSemester_Number()
	 * @model required="true"
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link sp.Semester#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(int value);

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' containment reference list.
	 * The list contents are of type {@link sp.CourseInSemester}.
	 * It is bidirectional and its opposite is '{@link sp.CourseInSemester#getSemester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' containment reference list.
	 * @see sp.SpPackage#getSemester_Courses()
	 * @see sp.CourseInSemester#getSemester
	 * @model opposite="semester" containment="true" required="true"
	 * @generated
	 */
	EList<CourseInSemester> getCourses();

	/**
	 * Returns the value of the '<em><b>Semester In Year</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link sp.Year#getSemesters <em>Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester In Year</em>' container reference.
	 * @see #setSemesterInYear(Year)
	 * @see sp.SpPackage#getSemester_SemesterInYear()
	 * @see sp.Year#getSemesters
	 * @model opposite="semesters" transient="false"
	 * @generated
	 */
	Year getSemesterInYear();

	/**
	 * Sets the value of the '{@link sp.Semester#getSemesterInYear <em>Semester In Year</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester In Year</em>' container reference.
	 * @see #getSemesterInYear()
	 * @generated
	 */
	void setSemesterInYear(Year value);

} // Semester
