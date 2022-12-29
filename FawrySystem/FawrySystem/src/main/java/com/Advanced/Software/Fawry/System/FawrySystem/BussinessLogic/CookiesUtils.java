package com.Advanced.Software.Fawry.System.FawrySystem.BussinessLogic;

import java.util.ArrayList;

import org.springframework.http.ResponseCookie;
import org.springframework.stereotype.Component;

import com.Advanced.Software.Fawry.System.FawrySystem.Model.FawryUser;

@Component
public class CookiesUtils {

  public ArrayList<ResponseCookie> generateUserCookie(FawryUser user) {
    ArrayList<ResponseCookie> cookies = new ArrayList<>();
    cookies.add(generateCookie("username", user.getUserName()));
    cookies.add(generateCookie("email", user.getEmail()));
    cookies.add(generateCookie("password", user.getPassword()));
   // cookies.add(generateCookie("usertype", user.getUserType()));
    return cookies;
  }

  private ResponseCookie generateCookie(String name, String value) {
    ResponseCookie cookie = ResponseCookie.from(name, value).maxAge(24 * 60 * 60).httpOnly(true).build();
    return cookie;
  }

}
