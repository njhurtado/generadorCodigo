package uniandes.xtext.arquitecturadian.dsl.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ide.editor.syntaxcoloring.HighlightingStyles;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class GuessHighlightingConfiguration_ extends DefaultHighlightingConfiguration
{
	public static final String INVALID_TOKEN_ID = HighlightingStyles.INVALID_TOKEN_ID;
	/**
	 * @since 2.6
	 */
	public static final String ANNOTATION = "Annotation";

	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor);
		acceptor.acceptDefaultHighlighting(ANNOTATION, "annotation", annotedTextStyle());
	}
	
	
	
	public TextStyle annotedTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(135, 94, 6));
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}
}