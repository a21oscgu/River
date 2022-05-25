package com.example.mobileapp_programming_project;

/* Rivers:
[{
	"ID": "1",
	"name": "Nile",
	"type": "a21oscgu",
	"company": "Africa",
	"location": "Egypt, Sudan, Ethiopia, Uganda, Congo, Kenya, Tanzania, etc.",
	"category": "Rivers",
	"size": 0,
	"cost": 0,
	"auxdata": {}
}, {
	"ID": "2",
	"name": "Amazon River",
	"type": "a21oscgu",
	"company": "South America",
	"location": "Peru, Colombia, Brazil",
	"category": "Rivers",
	"size": 0,
	"cost": 0,
	"auxdata": {}
}, {
	"ID": "3",
	"name": "Yangtze",
	"type": "a21oscgu",
	"company": "Asia",
	"location": "China",
	"category": "Rivers",
	"size": 0,
	"cost": 0,
	"auxdata": {}
}, {
	"ID": "4",
	"name": "Mississippi River",
	"type": "a21oscgu",
	"company": "North America",
	"location": "United States",
	"category": "Rivers",
	"size": 0,
	"cost": 0,
	"auxdata": {}
}, {
	"ID": "5",
	"name": "Yenisey",
	"type": "a21oscgu",
	"company": "Asia",
	"location": "Mongolia, Russia",
	"category": "Rivers",
	"size": 0,
	"cost": 0,
	"auxdata": {}
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