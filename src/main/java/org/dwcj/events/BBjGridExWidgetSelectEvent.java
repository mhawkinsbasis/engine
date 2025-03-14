package org.dwcj.events;

import com.basiscomponents.db.ResultSet;
import org.dwcj.bbjplugins.BBjGridExWidget;
import org.dwcj.controls.AbstractDwcControl;

import java.io.IOException;
import java.text.ParseException;

public final class BBjGridExWidgetSelectEvent implements IDwcEvent {

    private final BBjGridExWidget control;
    private final ResultSet selection;

    public BBjGridExWidgetSelectEvent(BBjGridExWidget theGrid, String eventString) {
        ResultSet selectionTmp = null;
        this.control = theGrid;
        try {
            selectionTmp = ResultSet.fromJson(eventString);
        } catch (IOException|ParseException e) {
            e.printStackTrace();
        }
        selection = selectionTmp;
    }

    public BBjGridExWidgetSelectEvent(BBjGridExWidget theGrid, ResultSet selection) {
        this.control = theGrid;
        this.selection = selection;
    }

    @Override
    public AbstractDwcControl getControl() {
        return control;
    }

    /**
     * return the selection that is made effective by the user action that triggered the event
     *
     * @return the selected row(s) / records
     */
    public ResultSet getSelection() {
        return selection;
    }
}
