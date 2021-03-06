package com.dpgil.pathlinker.path_linker.internal;

import com.dpgil.pathlinker.path_linker.internal.PathLinkerPanel.PanelState;
import java.awt.event.ActionEvent;
import org.cytoscape.application.CyApplicationManager;
import org.cytoscape.application.swing.AbstractCyAction;

/**
 * // -------------------------------------------------------------------------
 * /** Menu option to close the PathLinker plugin
 *
 * @author Daniel Gil
 * @version Nov 4, 2015
 */
public class ClosePathLinkerMenuAction
    extends AbstractCyAction
{
    private static PathLinkerPanel _panel;


    /**
     * Constructor for the menu option
     *
     * @param panel
     *            the panel to close
     * @param applicationManager
     *            the application manager to add this option into the menu
     */
    public ClosePathLinkerMenuAction(
        PathLinkerPanel panel,
        CyApplicationManager applicationManager)
    {
        super("Close", applicationManager, null, null);
        setPreferredMenu("Apps.PathLinker");

        _panel = panel;
    }


    @Override
    public void actionPerformed(ActionEvent arg0)
    {
        // closes the panel
        _panel.setPanelState(PanelState.CLOSED);
    }
}
