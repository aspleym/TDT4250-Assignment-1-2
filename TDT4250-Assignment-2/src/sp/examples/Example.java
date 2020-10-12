package sp.examples;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import sp.SpPackage;

public class Example {

	public static void main(String[] args) {
		ResourceSet resSet = new ResourceSetImpl();
		resSet.getPackageRegistry().put(SpPackage.eNS_URI, SpPackage.eINSTANCE);
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Resource resource = resSet.getResource(URI.createURI(Example.class.getResource("Department.xmi").toString()), true);
		
		TreeIterator<EObject> eObjects = resource.getAllContents();
		
		while (eObjects.hasNext()) {
			System.out.println(eObjects.next());
		}
	}
	
}
