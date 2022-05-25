package com.example.mobileapp_programming_project;

/* Exempel:
    "auxdata": "{
        ”countries\":[”Mongolia”,”Russia”],
        ”wiki”:”https://en.wikipedia.org/wiki/Yenisey”,
        ”img”:”https://en.wikipedia.org/wiki/Yenisey#/media/File:Yenisei_Ob_Kara_Sea.jpg”
  }"
 */


public class Auxdata {

    private String countries;
    private String wiki;
    private String img;

    public String getCountries() {
        if (countries.equals("")) {
            return null;
        } else {
            return countries;
        }
    }

    public String getWiki() {
        if (wiki.equals("")) {
            return null;
        } else {
            return wiki;
        }
    }

    public String getImg() {
        if (img.equals("")) {
            return null;
        }
        else {
            return img;
        }
    }
}