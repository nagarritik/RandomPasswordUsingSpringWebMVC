package com.ud.pass.controller;

import com.ud.pass.model.Password;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Objects;
import java.util.Random;

@Controller
public class PasswordGeneratorController {
    @RequestMapping(path = "/generatepassword",method = RequestMethod.POST)
    public RedirectView generatePassword(
            @ModelAttribute Password password,
            RedirectView redirectView,
            HttpSession httpSession,
            HttpServletRequest httpServletRequest
            ){
        StringBuilder masterStringBuilder = new StringBuilder();
        StringBuilder passwordStringBuilder = new StringBuilder();
        Random random = new Random();
        String upperCaseChar = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseChar = upperCaseChar.toLowerCase();
        String number = "0123456789";
        String specialChar = "~`! @#$%^&*()_-+={[}]|\\:;\"'<,>.?/";

        if (Objects.equals(password.getUppercase(), "on")){
            masterStringBuilder.append(upperCaseChar);
        }
        if (Objects.equals(password.getLowercase(), "on")){
            masterStringBuilder.append(lowerCaseChar);
        }
        if (Objects.equals(password.getNumber(), "on")){
            masterStringBuilder.append(number);
        }
        if (Objects.equals(password.getSpecialcharacter(), "on")){
            masterStringBuilder.append(specialChar);
        }

        String masterString = masterStringBuilder.toString();

        for (int i=1;i<=password.getPasswordlength();i++){
            passwordStringBuilder.append(masterString.charAt(random.nextInt(masterString.length())));
        }

        httpSession.setAttribute("password",passwordStringBuilder.toString());
        redirectView.setUrl(httpServletRequest.getContextPath()+"/password");
        return redirectView;
    }
}
