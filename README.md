# Rapport

# Project assignment

**Den här appen är inte forkad från LenaSYS/mobileapp-programming-project men repositoriet bär samma namn. Appen har två activities, "MainActivity" och "SecondActivity". På sidan "MainActivity" finns det en <i>TextView</i> och en knapp som heter "open". Om användaren klickar på "open" kommer ett <i>intent</i> att startas och sidan "SecondActivity" kommer att visas upp ovanför "MainActivity". På sidan "SecondActivity" finns det en <i>EditText</i> och en knapp som heter "close". Ifall användaren klickar på knappen "close" kommer intentet att avslutas, sidan "SecondActivity" kommer alltså att stängas ner, också kommer det skrivna värdet i <i>EditText</i> att skickas till den <i>TextView</i> som finns på sidan "MainActivity". Texten skickas med hjälp av <i>Shared Preferences</i>.**

/*
        - Rename your App. Tip: Values->Strings
        - Enable Internet access for your App. Tip: Manifest

        - Create a WebView element in the layout file content_main.xml
        * Give the WebView element ID "my_webview"

        -- Commit and push to your github fork

        * Create a private member variable called "myWebView" of type WebView
        * Locate the WebView element created in step 1 using the ID created in step 2
        * Create a new WebViewClient to attach to our WebView. This allows us to
          browse the web inside our app.
        -- Commit and push to your github fork
        * Enable Javascript execution in your WebViewClient
        * Enter the url to load in our WebView
        -- Commit and push to your github fork
        * Move the code that loads a URL into your WebView into the two methods
          "showExternalWebPage()" and "showInternalWebPage()".
        * Call the "showExternalWebPage()" / "showInternalWebPage()" methods
          when you select menu options "External Web Page" or "Internal Web Page"
          respectively
        -- Commit and push to your github fork
        * Take two screenshots using the "Take a screenshot" tool in the AVD
           showing your App. One (1) screenshot showing your internal web page and
           one (1) screenshot showing your external web page.
        */



Följande grundsyn gäller dugga-svar:
Ett kortfattat svar är att föredra. Svar som är längre än en sida text (skärmdumpar och programkod exkluderat) är onödigt långt.
Svaret skall ha minst en snutt programkod.
Svaret skall inkludera en kort övergripande förklarande text som redogör för vad respektive snutt programkod gör eller som svarar på annan teorifråga.
Svaret skall ha minst en skärmdump. Skärmdumpar skall illustrera exekvering av relevant programkod. Eventuell text i skärmdumpar måste vara läsbar.
I de fall detta efterfrågas, dela upp delar av ditt svar i för- och nackdelar. Dina för- respektive nackdelar skall vara i form av punktlistor med kortare stycken (3-4 meningar).
Programkod ska se ut som exemplet nedan. Koden måste vara korrekt indenterad då den blir lättare att läsa vilket gör det lättare att hitta syntaktiska fel.
Bilder läggs i samma mapp som markdown-filen.

**Denna kodsnutt visar det som sker när användaren trycker på knappen "close", "CLOSE AND SUBMIT" står det i appen, på sidan <i>SecondActivity</i>:**

```
Button close = findViewById(R.id.close2nd);
        close.setOnClickListener(new View.OnClickListener() {
```

**Detta skärmklipp visar <i>SecondActivity</i> i appen, där användaren har skrivit in "Adam" i textfältet:**

<img src="/... .png" width="60%">

**Detta skärmklipp visar <i>MainActivity</i> i appen, då användaren tidigare har skrivit in "Adam" i textfältet på sidan <i>SecondActivity</i>:**

<img src="/... .png" width="60%">
