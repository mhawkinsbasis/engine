package org.dwcj.controls;

import com.basis.bbj.proxies.sysgui.BBjControl;
import com.basis.bbj.proxies.sysgui.BBjMenuItem;
import com.basis.bbj.proxies.sysgui.BBjPopupMenu;
import com.basis.bbj.proxies.sysgui.BBjWindow;
import com.basis.startup.type.BBjException;
import org.dwcj.bridge.PanelAccessor;
import org.dwcj.panels.AbstractDwcjPanel;

public class PopupMenu extends AbstractDwcControl implements IStyleable, IPopupAble {

    private BBjPopupMenu bbjPopupMenu;

    @Override
    protected void create(AbstractDwcjPanel p) {
        try{
            BBjWindow w = PanelAccessor.getDefault().getBBjWindow(p);
            ctrl = (BBjControl) w.addPopupMenu();
            catchUp();
            bbjPopupMenu = (BBjPopupMenu) ctrl;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public CheckableMenuItem addCheckableMenuItem(int id, String title) {
        try {
            return (CheckableMenuItem) bbjPopupMenu.addCheckableMenuItem(id, title);
        } catch (BBjException e) {
            e.printStackTrace();
        }
        return null;
    }

    public CheckableMenuItem addCheckableMenuItem(int id, String title, boolean checked) {
        try {
            return (CheckableMenuItem) bbjPopupMenu.addCheckableMenuItem(id, title, checked);
        } catch (BBjException e) {
            e.printStackTrace();
        }
        return null;
    }

    public MenuItem addMenuItem(int id, String title) {
        try {
            return (MenuItem) bbjPopupMenu.addMenuItem(id, title);
        } catch (BBjException e) {
            e.printStackTrace();
        }
        return null;
    }

    public MenuItem addMenuItem(int id, String title, int action) {
        try {
            return (MenuItem) bbjPopupMenu.addMenuItem(id, title, action);
        } catch (BBjException e) {
            e.printStackTrace();
        }
        return null;
    }

    public MenuItem addMenuItem(int id, String title, boolean checkable, boolean checked) {
        try {
            return (MenuItem) bbjPopupMenu.addMenuItem(id, title, checkable, checked);
        } catch (BBjException e) {
            e.printStackTrace();
        }
        return null;
    }

    public MenuItem addMenuItem(int id, String title, boolean checkable, boolean checked, int action) {
        try {
            return (MenuItem) bbjPopupMenu.addMenuItem(id, title, checkable, checked, action);
        } catch (BBjException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void addSeparator() {
        try {
            bbjPopupMenu.addSeparator();
        } catch (BBjException e) {
            e.printStackTrace();
        }
    }

    public CheckableMenuItem getCheckableMenuItem(int id) {
        try {
            return (CheckableMenuItem) bbjPopupMenu.getCheckableMenuItem(id);
        } catch (BBjException e) {
            e.printStackTrace();
        }
        return null;
    }

    public CheckableMenuItem getCheckableMenuItemAt(int index) {
        try {
            return (CheckableMenuItem) bbjPopupMenu.getCheckableMenuItemAt(index);
        } catch (BBjException e) {
            e.printStackTrace();
        }
        return null;
    }

    public int getChildCount() {
        return bbjPopupMenu.getChildCount();
    }

    public String getClientProperty(Object key) {
        try {
            return bbjPopupMenu.getClientProperty(key).toString();
        } catch (BBjException e) {
            e.printStackTrace();
        }
        return "";
    }

    public BBjControl getControl(int id) {
        try {
            return bbjPopupMenu.getControl(id);
        } catch (BBjException e) {
            e.printStackTrace();
            return null;
        }
    }

    public int getID() {
        return bbjPopupMenu.getID();
    }

    public int getMaximumRowCount() {
        return bbjPopupMenu.getMaximumRowCount();
    }

    public MenuItem getMenuItem(int id) {
        try {
            return (MenuItem) bbjPopupMenu.getMenuItem(id);
        } catch (BBjException e) {
            e.printStackTrace();
        }
        return null;
    }

    public MenuItem getMenuItemAt(int index) {
        try {
            return (MenuItem) bbjPopupMenu.getMenuItemAt(index);
        } catch (BBjException e) {
            e.printStackTrace();
        }
        return null;
    }

    public int getMenuItemIDAt(int index) {
        try {
            return bbjPopupMenu.getMenuItemIDAt(index);
        } catch (BBjException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public String getName() {
        try {
            return bbjPopupMenu.getName();
        } catch (BBjException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Object getUserData() {
        try {
            return bbjPopupMenu.getUserData();
        } catch (BBjException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void hide() {
        try {
            bbjPopupMenu.hide();
        } catch (BBjException e) {
            e.printStackTrace();
        }
    }

    public CheckableMenuItem insertCheckableMenuItem(int index, int id, String title) {
        try {
            return (CheckableMenuItem) bbjPopupMenu.insertCheckableMenuItem(index, id, title);
        } catch (BBjException e) {
            e.printStackTrace();
        }
        return null;
    }

    public CheckableMenuItem insertCheckableMenuItem(int index, int id, String title, boolean checked) {
        try {
            return (CheckableMenuItem) bbjPopupMenu.insertCheckableMenuItem(index, id, title, checked);
        } catch (BBjException e) {
            e.printStackTrace();
        }
        return null;
    }

    public MenuItem insertMenuItem(int index, int id, String title) {
        try {
            return (MenuItem) bbjPopupMenu.insertMenuItem(index, id, title);
        } catch (BBjException e) {
            e.printStackTrace();
        }
        return null;
    }

    public MenuItem insertMenuItem(int index, int id, String title, int action) {
        try {
            return (MenuItem) bbjPopupMenu.insertMenuItem(index, id, title, action);
        } catch (BBjException e) {
            e.printStackTrace();
        }
        return null;
    }

    public MenuItem insertMenuItem(int index, int id, String title, boolean checkable, boolean checked) {
        try {
            return (MenuItem) bbjPopupMenu.insertMenuItem(index, id, title, checkable, checked);
        } catch (BBjException e) {
            e.printStackTrace();
        }
        return null;
    }

    public MenuItem insertMenuItem(int index, int id, String title, boolean checkable, boolean checked, int action) {
        try {
            return (MenuItem) bbjPopupMenu.insertMenuItem(index, id, title, checkable, checked, action);
        } catch (BBjException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void insertSeparator(int index) {
        try {
            bbjPopupMenu.insertSeparator(index);
        } catch (BBjException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean isVisible() {
        try {
            return bbjPopupMenu.isVisible();
        } catch (BBjException e) {
            e.printStackTrace();
        }
        return false;
    }

    public void putClientProperty(Object key, Object value) {
        try {
            bbjPopupMenu.putClientProperty(key, value);
        } catch (BBjException e) {
            e.printStackTrace();
        }
    }

    public void removeMenuItem(MenuItem item) {
        try {
            bbjPopupMenu.removeMenuItem((BBjMenuItem) item);
        } catch (BBjException e) {
            e.printStackTrace();
        }
    }

    public void removeMenuItem(int id) {
        try {
            bbjPopupMenu.removeMenuItem(id);
        } catch (BBjException e) {
            e.printStackTrace();
        }
    }

    public void removeMenuItemAt(int index) {
        try {
            bbjPopupMenu.removeMenuItemAt(index);
        } catch (BBjException e) {
            e.printStackTrace();
        }
    }

    public void removeSeparator(int index) {
        try {
            bbjPopupMenu.removeSeparator(index);
        } catch (BBjException e) {
            e.printStackTrace();
        }
    }

    public void setMaximumRowCount(int max) {
        bbjPopupMenu.setMaximumRowCount(max);
    }

    public void setName(String name) {
        try {
            bbjPopupMenu.setName(name);
        } catch (BBjException e) {
            e.printStackTrace();
        }
    }

    public void setUserData(Object object) {
        try {
            bbjPopupMenu.setUserData(object);
        } catch (BBjException e) {
            e.printStackTrace();
        }
    }

    //todo: how to handle BBjControl parameter?
    public void show (BBjControl control, int x, int y) {
        try {
            bbjPopupMenu.show(control, x, y);
        } catch (BBjException e) {
            e.printStackTrace();
        }
    }

    public void show(int context, int id, int x, int y) {
        try {
            bbjPopupMenu.show(context, id, x, y);
        } catch (BBjException e) {
            e.printStackTrace();
        }
    }

    @Override
    public IStyleable setStyle(String property, String value) {
        super.setControlStyle(property, value);
        return this;
    }

    @Override
    public IStyleable addClass(String selector) {
        super.addControlCssClass(selector);
        return this;
    }

    @Override
    public IStyleable removeClass(String selector) {
        super.removeControlCssClass(selector);
        return this;
    }

    @Override
    public IPopupAble addPopupMenu(int id, String title) {
        return null;
    }

    @Override
    public IPopupAble removePopupMenu(int id, String title) {
        return null;
    }
}
