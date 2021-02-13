package co.gov.dian.xtext.arquitecturadian.dsl.ui;

import org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator;
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.nodemodel.BidiTreeIterator;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.impl.CompositeNodeWithSemanticElement;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.CancelIndicator;

import co.gov.dian.xtext.arquitecturadian.dsl.sql.Annotation;

public class GuessHighlightingCalculator_ extends DefaultSemanticHighlightingCalculator {

	
	@Override
	public void provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor,
			CancelIndicator cancelIndicator) {
		if (resource == null)
			return;
		IParseResult parseResult = resource.getParseResult();
		if (parseResult == null || parseResult.getRootASTElement() == null)
			return;
		
		INode root = resource.getParseResult().getRootNode();
		BidiTreeIterator<INode> it = root.getAsTreeIterable().iterator();
		while( it.hasNext() )
		{
			INode node = it.next();
			if( node instanceof CompositeNodeWithSemanticElement && node.getSemanticElement() instanceof Annotation )
			{
				acceptor.addPosition(node.getOffset(), node.getLength(), GuessHighlightingConfiguration_.ANNOTATION);
			}
		}
		doProvideHighlightingFor(resource, acceptor, cancelIndicator);
	}
}
 
