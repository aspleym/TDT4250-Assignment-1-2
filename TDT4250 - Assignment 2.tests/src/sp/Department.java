/**
 */
package sp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Department</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sp.Department#getName <em>Name</em>}</li>
 *   <li>{@link sp.Department#getProgrammes <em>Programmes</em>}</li>
 *   <li>{@link sp.Department#getCourses <em>Courses</em>}</li>
 * </ul>
 *
 * @see sp.SpPackage#getDepartment()
 * @model
 * @generated
 */
public interface Department extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see sp.SpPackage#getDepartment_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link sp.Department#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Programmes</b></em>' containment reference list.
	 * The list contents are of type {@link sp.Programme}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programmes</em>' containment reference list.
	 * @see sp.SpPackage#getDepartment_Programmes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Programme> getProgrammes();

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' containment reference list.
	 * The list contents are of type {@link sp.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' containment reference list.
	 * @see sp.SpPackage#getDepartment_Courses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Course> getCourses();

} // Department
