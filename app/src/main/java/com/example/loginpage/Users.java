package com.example.loginpage;

/**
 * Created by AkshayeJH on 15/12/17.
 */

public class Users {

    public String Name, Image_Url, status;

    public Users(){

    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getImage() {
        return Image_Url;
    }

    public void setImage(String Image_Url) {
        this.Image_Url = Image_Url;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Users(String Name, String Image_Url, String status) {
        this.Name = Name;
        this.Image_Url = Image_Url;
        this.status = status;
    }
}
