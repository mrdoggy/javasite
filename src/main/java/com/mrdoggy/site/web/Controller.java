package com.mrdoggy.site.web;

/**
 * Created with IntelliJ IDEA.
 * User: mrdoggy
 * Date: 20.03.13
 * Time: 23:21
 * To change this template use File | Settings | File Templates.
 */
import java.util.HashMap;
import java.util.Map;
import com.threewks.thundr.view.jsp.JspView;

public class Controller {
    public JspView home() {
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("message", "Hello slut!");
        return new JspView("home.jsp", model);
    }

    public JspView showLogin() {
        Map<String, Object> model = new HashMap<String, Object>();
        return new JspView("login.jsp",model);
    }

    public  JspView processLogin(String login,String password) {
        Map<String, Object> model = new HashMap<String, Object>();
        if (login.equals("")) {
            model.put("errors","Incorrect login or password");
        }
        return new JspView("login.jsp",model);
    }
}