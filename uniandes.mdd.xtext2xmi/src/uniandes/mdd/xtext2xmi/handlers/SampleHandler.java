package uniandes.mdd.xtext2xmi.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import uniandes.xtext.arquitecturadian.dsl.SqlStandaloneSetup;

public class SampleHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		IStructuredSelection currentSelection = (IStructuredSelection) window.getSelectionService().getSelection();
        
		
		System.out.println("Handled");
		
			System.out.println("Trying to save");
			Object _element = ((IStructuredSelection) currentSelection)
					.getFirstElement();
			if (_element instanceof IResource)
	        {
	        	IResource resourceTarget = (IResource)_element;
	        	System.out.println("is resource");
	        	
	        }
			if (_element instanceof IFile) {
				try {
				System.out.println("Is file Saving...");
				IFile selectedFile = (IFile) _element;
				

				
				Injector injector = new SqlStandaloneSetup().createInjectorAndDoEMFRegistration();
			            
			    XtextResourceSet resourceSet = injector
			            .getInstance(XtextResourceSet.class);

			    // .ext ist the extension of the model file
			    String inputURI = selectedFile.getFullPath().toString();
			    String outputURI = selectedFile.getFullPath().removeFileExtension().addFileExtension("xmi").toString();
			    URI uri = URI.createURI(inputURI);
			    Resource xtextResource = resourceSet.getResource(uri, true);

			    EcoreUtil.resolveAll(xtextResource);

			    Resource xmiResource = resourceSet
			            .createResource(URI.createURI(outputURI));
			    xmiResource.getContents().add(xtextResource.getContents().get(0));
			    
			        xmiResource.save(null);
			    } catch (Exception e) {
			        e.printStackTrace();
			    }				 
				 
				 
			}
		
		return null;
	}
}
