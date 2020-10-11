package studyplan.xtext;

import java.io.IOException;
import java.io.PrintStream;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import sp.Department;
import sp.SpPackage;

public class GeneratorMain {
	
	public static void main(String[] args) throws IOException {
		
		Department dep = getDepartment();
		String studyplan = new Generator().generateHtml(dep);
		String workingDir = System.getProperty("user.dir");
		URI html = URI.createURI(workingDir + "/src-gen/studyplan/xtext/index.html");
		try (PrintStream ps = new PrintStream(dep.eResource().getResourceSet().getURIConverter().createOutputStream(html))) {
			ps.print(studyplan);
			ps.close();
		}
		System.out.println(studyplan);
	}
	
	public static Department getDepartment() throws IOException {
		
		ResourceSet resSet = new ResourceSetImpl();
		resSet.getPackageRegistry().put(SpPackage.eNS_URI, SpPackage.eINSTANCE);
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Resource resource = resSet.getResource(URI.createURI(GeneratorMain.class.getResource("Department.xmi").toString()), true);
		
		TreeIterator<EObject> eObjects = resource.getAllContents();
		
		while (eObjects.hasNext()) {
			EObject eObject = eObjects.next();
			if (eObject instanceof Department) {
				return (Department) eObject;
			}
		}
		return null;	
	}

}
