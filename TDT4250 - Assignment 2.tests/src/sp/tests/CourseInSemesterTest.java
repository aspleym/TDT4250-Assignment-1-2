/**
 */
package sp.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import sp.CourseInSemester;
import sp.SpFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Course In Semester</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link sp.CourseInSemester#isPicked() <em>Picked</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class CourseInSemesterTest extends TestCase {

	/**
	 * The fixture for this Course In Semester test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseInSemester fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CourseInSemesterTest.class);
	}

	/**
	 * Constructs a new Course In Semester test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseInSemesterTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Course In Semester test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(CourseInSemester fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Course In Semester test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseInSemester getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SpFactory.eINSTANCE.createCourseInSemester());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link sp.CourseInSemester#isPicked() <em>Picked</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sp.CourseInSemester#isPicked()
	 * @generated NOT
	 */
	public void testIsPicked() {
		// TODO: implement this feature getter test method
		fixture.setPicked(true);
		assertTrue(fixture.isPicked());
		fixture.setPicked(false);
		assertFalse(fixture.isPicked());
	}

	/**
	 * Tests the '{@link sp.CourseInSemester#setPicked(boolean) <em>Picked</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sp.CourseInSemester#setPicked(boolean)
	 * @generated NOT
	 */
	public void testSetPicked() {
		// TODO: implement this feature setter test method
		fixture.setPicked(true);
		assertTrue(fixture.isPicked());
		fixture.setPicked(false);
		assertFalse(fixture.isPicked());
	}

} //CourseInSemesterTest
