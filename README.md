# Rapport

# Project assignment

**Den här applikationen är inte forkad från [LenaSYS/mobileapp-programming-project](https://github.com/LenaSYS/mobileapp-programming-project). Appen heter <i>River</i> och är en informativ app som lagrar information om världens längsta floder, just nu finns det tio floder i appen, se figur !. Datainformationen kommer ursprungligen från [Wikipedia | List of rivers by length](https://en.wikipedia.org/wiki/List_of_rivers_by_length). Tyvärr finns det inga bilder på floderna i appen eftersom biblioteket <i>[Picasso](https://square.github.io/picasso/)</i> inte fungerade helt och hållet (koden finns dock kvar men har blivit kommenterad). Dessutom var det trassligt att hämta bildlänkar med JSON. Appen har en Main-Activity och en About-Activity. På Main-Activity finns det en <i>RecyclerView</i> som representerar informationen för de olika floderna, se figur !. Den längsta floden, <i>[Nilen](https://en.wikipedia.org/wiki/Nile)</i>, befinner sig högst upp i den <i>RecyclerView</i> som är placerad i Main-Activity. Därefter listas de andra floderna i fallande ordning. På About-Activity finns det lite kort information om appen och aktiviteten är skapad med en intern WebView (HTML), se figur !. AboutActivity befinner sig i appens option-menu, se figur !. Appens app-icon har även förändrats, se figur !.**

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
