package com.dpgil.pathlinker.path_linker.internal;

import com.dpgil.pathlinker.path_linker.internal.PathLinkerPanel.PanelState;
import java.awt.event.ActionEvent;
import org.cytoscape.application.CyApplicationManager;
import org.cytoscape.application.swing.AbstractCyAction;

/**
 * // -------------------------------------------------------------------------
 * /** Menu option to open the PathLinker plugin
 *
 * @author Daniel Gil
 * @version Nov 4, 2015
 */
public class OpenPathLinkerMenuAction
    extends AbstractCyAction
{
    private PathLinkerPanel _panel;


    /**
     * Constructor for the menu option
     *
     * @param panel
     *            the panel to be opened
     * @param applicationManager
     *            the application manager to add this option into the menu
     */
    public OpenPathLinkerMenuAction(
        PathLinkerPanel panel,
        CyApplicationManager applicationManager)
    {
        super("Open", applicationManager, null, null);
        setPreferredMenu("Apps.PathLinker");

        _panel = panel;
    }


    @Override
    public void actionPerformed(ActionEvent arg0)
    {
        // opens the panel
        _panel.setPanelState(PanelState.OPEN);
    }
}
