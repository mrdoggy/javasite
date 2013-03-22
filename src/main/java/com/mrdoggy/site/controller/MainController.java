package com.mrdoggy.site.controller;

/**
 * User: mrdoggy
 * Date: 20.03.13
 * Time: 23:21
 */
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.mrdoggy.site.service.UserService;
import com.threewks.thundr.view.jsp.JspView;
import com.threewks.thundr.view.redirect.RedirectView;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MainController {
    @Inject
    UserService userService;

    public JspView home(HttpServletRequest req,HttpServletResponse resp) {

        userService.checkAuthorization(req,resp);

        Map<String, Object> model = new HashMap<String, Object>();
        model.put("message", "Hello slut!");
        return new JspView("home.jsp", model);
    }

    public JspView showLogin() {
        Map<String, Object> model = new HashMap<String, Object>();
        return new JspView("login.jsp",model);
    }

    public  JspView processLogin(String login,String password,HttpServletRequest req,HttpServletResponse resp) {
        Map<String, Object> model = new HashMap<String, Object>();
        if (!userService.doLogin(login,password,req)) {
            model.put("errors","Incorrect login or password");
            return new JspView("login.jsp",model);
        } else {
            try {
                resp.sendRedirect("/");
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
    }

}