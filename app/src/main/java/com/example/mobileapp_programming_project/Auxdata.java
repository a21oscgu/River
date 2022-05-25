package com.example.mobileapp_programming_project;

/* Exempel:
    "auxdata": "{”img”:”https://en.wikipedia.org/wiki/Nile#/media/File:Nile_River_and_delta_from_orbit.jpg”}"
    "auxdata": "{”img”:”https://en.wikipedia.org/wiki/Amazon_River#/media/File:Manaus-Amazon-NASA.jpg”}"
    "auxdata": "{”img”:”https://en.wikipedia.org/wiki/Yangtze#/media/File:Hutiaoxia.jpg”}"
    "auxdata": "{”img”:”https://en.wikipedia.org/wiki/Mississippi_River#/media/File:Efmo_View_from_Fire_Point.jpg”}"
    "auxdata": "{”img”:”https://en.wikipedia.org/wiki/Yenisey#/media/File:Yenisei_Ob_Kara_Sea.jpg”}"
 */


public class Auxdata {

    private String img;

    public String getImg() {
        if (img.equals("")) {
            return null;
        }
        else {
            return img;
        }
    }
}