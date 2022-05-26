# Rapport

# Project assignment

## RecyclerView

**Den här applikationen är inte forkad från [LenaSYS/mobileapp-programming-project](https://github.com/LenaSYS/mobileapp-programming-project). Appen heter <i>River</i> och är en informativ app som lagrar information om världens längsta floder. Just nu finns de tio längsta floderna i appen. Appen har en Main-Activity och en About-Activity. På aktiviteten Main-Activity finns det en <i>RecyclerView</i> som representerar informationen för de olika floderna, se figur 1. Den längsta floden, <i>[Nilen](https://en.wikipedia.org/wiki/Nile)</i>, befinner sig högst upp i den <i>RecyclerView</i> som är placerad i Main-Activity. Därefter listas de andra floderna i fallande ordning.**

<p align="left"><img src="/Screenshot_20220526-142414.png" width="270px"></p>
<p align="left">Figur 1 - Skärmklippet, som är taget i appen <i>River</i> på sidan MainActivity, visar kort information om de fyra längsta floderna i världen.</p>

```
ex
```
<p align="left">Figur 2 - Kodsnutt som visar...</p>

## WebView

**På aktiviteten About-Activity finns det lite kort information om appen och aktiviteten är skapad med en intern WebView (HTML).**

<p align="left"><img src="/Screenshot_20220526-142439.png" width="270px"></p>
<p align="left">Figur 3 - AboutActivity i appen <i>River</i></p>

**AboutActivity befinner sig i appens option-menu.**

<p align="left"><img src="/Screenshot_20220526-142428.png" width="270px"></p>
<p align="left">Figur 4 - MainActivity i appen <i>River</i> med options-menu öppen</p>

```
ex
```
<p align="left">Figur 5 - Kodsnutt som visar...</p>

## Övrigt

**Datainformationen som handlar om floderna kommer ursprungligen från [Wikipedia | List of rivers by length](https://en.wikipedia.org/wiki/List_of_rivers_by_length). Tyvärr finns det inga bilder på floderna i appen eftersom biblioteket <i>[Picasso](https://square.github.io/picasso/)</i> inte fungerade helt och hållet (koden finns dock kvar men har blivit kommenterad). Dessutom var det trassligt att hämta bildlänkar med JSON.**

**Appens app-icon har fått ett nytt utseende.**

<p align="left"><img src="/app/src/main/res/mipmap-xxxhdpi/ic_launcher.png" width="192px"></p>
<p align="left">Figur 6 - App icon</p>