package org.dwcj.events.sinks.treeview;

import com.basis.bbj.proxies.event.BBjGainedFocusEvent;
import com.basis.bbj.proxies.sysgui.BBjControl;
import org.dwcj.Environment;
import org.dwcj.bridge.ControlAccessor;
import org.dwcj.controls.TreeView;
import org.dwcj.events.treeview.TreeGainedFocusEvent;

import java.util.function.Consumer;

public class BBjTreeGainedFocusEventSink {

    private final Consumer<TreeGainedFocusEvent> target;

    private final TreeView tree;


    @SuppressWarnings({"static-access"})
    public BBjTreeGainedFocusEventSink(TreeView tree, Consumer<TreeGainedFocusEvent> target) {
        this.target = target;
        this.tree = tree;

        BBjControl bbjctrl = null;
        try {
            bbjctrl = ControlAccessor.getDefault().getBBjControl(tree);
            bbjctrl.setCallback(Environment.getInstance().getBBjAPI().ON_GAINED_FOCUS,
                    Environment.getInstance().getDwcjHelper().getEventProxy(this, "gainedFocusEvent"),
                    "onEvent");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void gainedFocusEvent(BBjGainedFocusEvent ev) { // NOSONAR
        TreeGainedFocusEvent dwcEv = new TreeGainedFocusEvent(this.tree);
        target.accept(dwcEv);
    }
}
