package com.oauth.oauth_server.domain;

public class UserProfileModel {
    private String uName;
    private String mail;

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "UserProfileModel{" +
                "uName='" + uName + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}
