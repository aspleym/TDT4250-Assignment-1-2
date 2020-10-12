/**
 */
package sp.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import sp.SpFactory;
import sp.Year;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Year</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class YearTest extends TestCase {

	/**
	 * The fixture for this Year test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Year fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(YearTest.class);
	}

	/**
	 * Constructs a new Year test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YearTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Year test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Year fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Year test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Year getFixture() {
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
		setFixture(SpFactory.eINSTANCE.createYear());
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

} //YearTest
