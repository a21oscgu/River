package com.example.mobileapp_programming_project;

/* Rivers:
  [{
	"ID": "1",
	"name": "Nile",
	"type": "a21oscgu",
	"company": "",
	"location": "Africa",
	"category": "Rivers",
	"size": 0,
	"cost": 0,
	"auxdata": "{”countries\":[”Egypt”,”Sudan”,”Ethiopia”,”Uganda”,”Congo”,”Kenya”,”Tanzania”,”Rwanda”,”Burundi”],”wiki”:”https://en.wikipedia.org/wiki/Nile”,”img”:”https://en.wikipedia.org/wiki/Nile#/media/File:Nile_River_and_delta_from_orbit.jpg”}"
}, {
	"ID": "2",
	"name": "Amazon River",
	"type": "a21oscgu",
	"company": "",
	"location": "South America",
	"category": "Rivers",
	"size": 0,
	"cost": 0,
	"auxdata": "{”countries\":[”Peru”,”Colombia”,”Brazil”],”wiki”:”https://en.wikipedia.org/wiki/Amazon_River”,”img”:”https://en.wikipedia.org/wiki/Amazon_River#/media/File:Manaus-Amazon-NASA.jpg”}"
}, {
	"ID": "3",
	"name": "Yangtze",
	"type": "a21oscgu",
	"company": "",
	"location": "Asia",
	"category": "Rivers",
	"size": 0,
	"cost": 0,
	"auxdata": "{”countries\":[”China”],”wiki”:”https://en.wikipedia.org/wiki/Yangtze”,”img”:”https://en.wikipedia.org/wiki/Yangtze#/media/File:Hutiaoxia.jpg”}"
}, {
	"ID": "4",
	"name": "Mississippi River",
	"type": "a21oscgu",
	"company": "",
	"location": "North America",
	"category": "Rivers",
	"size": 0,
	"cost": 0,
	"auxdata": "{”countries\":[”United States”],”wiki”:”https://en.wikipedia.org/wiki/Mississippi_River”,”img”:”https://en.wikipedia.org/wiki/Mississippi_River#/media/File:Efmo_View_from_Fire_Point.jpg”}"
}, {
	"ID": "5",
	"name": "Yenisey",
	"type": "a21oscgu",
	"company": "",
	"location": "Asia",
	"category": "Rivers",
	"size": 0,
	"cost": 0,
	"auxdata": "{
	”countries\":[”Mongolia”,”Russia”],
	”wiki”:”https://en.wikipedia.org/wiki/Yenisey”,
	”img”:”https://en.wikipedia.org/wiki/Yenisey#/media/File:Yenisei_Ob_Kara_Sea.jpg”
	}"
}]
 */


public class River {

    private int id;
    private String name;
    private String type;
    private String company;
    private String location;
    private String category;
    private int size;
    private int cost;
    private Auxdata auxdata;

    public int getId() {
        return id;
    }

    public String getName() {
        if (name.equals("")) {
            return null;
        }
        else {
            return name;
        }
    }

    public String getType() {
        if (type.equals("")) {
            return null;
        }
        else {
            return type;
        }
    }

    public String getCompany() {
        if (company.equals("")) {
            return null;
        }
        else {
            return company;
        }
    }

    public String getLocation() {
        if (location.equals("")) {
            return null;
        }
        else {
            return location;
        }
    }

    public String getCategory() {
        if (category.equals("")) {
            return null;
        }
        else {
            return category;
        }
    }

    public int getSize() {
        return size;
    }

    public int getCost() {
        return cost;
    }

    public Auxdata getAuxdata() {
        return auxdata;
    }
}