package demo;
import org.dwcj.*;
import org.dwcj.controls.*;
import org.dwcj.events.ButtonPushEvent;
import org.dwcj.exceptions.DwcAppInitializeException;
import org.dwcj.panels.AppPanel;
import org.dwcj.panels.Div;

import org.dwcj.controls.IExpansible.Expanse;
import org.dwcj.controls.IThemable.Theme;

public class Practice extends App{

    public Label header;

    public Label loginLabel;

    public Label password;

    public Label startingLabel;
    

    @Override
    public void run() throws DwcAppInitializeException {
        AppPanel panel = new AppPanel();
   


        header = new Label();

        loginLabel = new Label();
    
        password = new Label();
    
        startingLabel = new Label();

        // ===Components===
        Div mainWrapper = new Div();
        panel.add(mainWrapper);

        Div loginBox = new Div();
        mainWrapper.add(loginBox);

        loginBox.add(header);
        header.setText("Log in to App");
        
        loginBox.add(loginLabel);
        loginLabel.setText("Login ID");
        
        TextBox idBox = new TextBox();
        loginBox.add(idBox);
        
        loginBox.add(password);
        password.setText("Password");
        
        TextBox passwordBox = new TextBox();
        loginBox.add(passwordBox);

        loginBox.add(startingLabel);
        startingLabel.setText("Starting Page");

        //USE COMBO BOX
        ComboBox startingPage = new ComboBox();
        loginBox.add(startingPage);
        startingPage.addItem("Accounts2", "otherItem");
        startingPage.addItem("Accounts", "item");
        App.consoleLog(startingPage.toString());

        // ===Why is this not working? What should my object be?===
        // startingPage.addItem("1", "Accounts Page");
        // startingPage.addItem("2", "Create New Account");
        // startingPage.addItem("3", "Edit Profile");

        Button loginButton = new Button("Login");
        loginBox.add(loginButton);
        // loginButton.setTheme(Theme.PRIMARY);

        /*
         * This is where I'd like to add something like this:
         * 
            <div className='detailBox'>
                <a href='#1'>Forgot login ID or password?</a>
                <a href='#2'>New User?</a>
                <a href='#3'>Change Language</a>
                <a href='#4'>Log in to mobile</a>
            </div>
         * 
         * but I don't know if I can insert <a> elements directly?
         * 
         */
        



        // ==CSS Styles===
        mainWrapper.setStyle("display", "flex");
        mainWrapper.setStyle("flex-direction", "column");
        mainWrapper.setStyle("justify-content", "center");
        mainWrapper.setStyle("align-items", "center");
        mainWrapper.setStyle("background-image", "url(https://s1.1zoom.me/b5050/868/Sunrises_and_sunsets_447602_1920x1080.jpg)");
        mainWrapper.setStyle("height", "calc(100vh - 40px)");
        mainWrapper.setStyle("width", "100vw - 40px");
        mainWrapper.setStyle("margin", "20px");


        loginBox.setStyle("display", "flex");
        loginBox.setStyle("flex-direction", "column");
        loginBox.setStyle("background", "rgb(238, 238, 238)");
        loginBox.setStyle("height", "65vh");
        loginBox.setStyle("width", "calc(30vw - 60px)");
        loginBox.setStyle("padding", "0 30px 0 30px");
        loginBox.setStyle("overflow", "auto");

        header.setStyle("align-self", "center");
        //UAS
        header.setStyle("display", "block");
        header.setStyle("font-size", "2em");
        header.setStyle("margin-block-start", ".67em");
        header.setStyle("margin-block-end", ".67em");
        header.setStyle("font-weight", "bold");

        setPTagStyles("font-weight", "bold");
        setPTagStyles("margin-left", "30px");
        //Setting styles that come with UAS
        setPTagStyles("display", "block");
        setPTagStyles("margin-block-start", "1em");
        setPTagStyles("margin-block-end", "1em");

        startingPage.setExpanse(Expanse.LARGE);
   


        // header.setStyle("font-family", "'Lato', sans-serif");











        // panel.setStyle("display","flex");
        // panel.setStyle("flex-wrap","wrap");
        // panel.setStyle("gap","20px");
        // panel.setStyle("margin","20px");
        // panel.setStyle("padding","20px");
        // panel.setStyle("border","1px dotted");


        // TextBox txt1 = new TextBox();
        // txt1.setStyle("width", "10px");
        // txt1.setStyle("flex", "0 0 30%");
        // TextBox txt2 = new TextBox();
        // txt2.setStyle("width", "10px");
        // txt2.setStyle("flex", "0 0 30%");
        // TextBox txt3 = new TextBox();
        // txt3.setStyle("width", "10px");
        // txt3.setStyle("flex", "0 0 30%");
        // TextBox txt4 = new TextBox();
        // txt4.setStyle("width", "10px");
        // txt4.setStyle("flex", "0 0 30%");
        // TextBox txt5 = new TextBox();
        // txt5.setStyle("width", "10px");
        // txt5.setStyle("flex", "0 0 30%");
        // TextBox txt6 = new TextBox();
        // txt6.setStyle("width", "10px");
        // txt6.setStyle("flex", "0 0 30%");
        // TextBox txt7 = new TextBox();
        // txt7.setStyle("width", "10px");
        // txt7.setStyle("flex", "0 0 30%");
        // TextBox txt8 = new TextBox();
        // txt8.setStyle("width", "10px");
        // txt8.setStyle("flex", "0 0 30%");
        // TextBox txt9 = new TextBox();
        // txt9.setStyle("width", "10px");
        // txt9.setStyle("flex", "0 0 30%");

        // panel.add(txt1);
        // panel.add(txt2);
        // panel.add(txt3);
        // panel.add(txt4);
        // panel.add(txt5);
        // panel.add(txt6);
        // panel.add(txt7);
        // panel.add(txt8);
        // panel.add(txt9);
        // btn.setTheme(Theme.DANGER);
        // btn.setExpanse(Expanse.MEDIUM);

        // btn.onClick(this::onButtonPush);
    }

    public void setPTagStyles(String prop, String style){
        loginLabel.setStyle(prop, style);
        password.setStyle(prop, style);
        startingLabel.setStyle(prop, style);

    }

    // private void onButtonPush(ButtonPushEvent buttonPushEvent) {
    //     App.msgbox("Hello World");
    // }
}