# Projekt oeffentlicher-nahverkehr
[zurück zur Projektübersicht] (https://github.com/phoen1x/livingfire-uml/tree/master/oeffentlicher-nahverkehr "Projekt oeffentlicher-nahverkehr")

## Composite structure diagram

### Infos im Web
[uml-diagrams.org --- Composite structure diagram](http://www.uml-diagrams.org/composite-structure-diagrams.html "")

### Beschreibung

Der öffentliche Nahverkehr gliedert sich wiefolgt

* **Fuhrpark** (Strukturierte Klasse)
  - **15x Bus** (Part)
  - **16x Busfahrer** (external Part)
  - **10x UBahn** (Part)
  - **12x UBahnfahrer** (external Part)
  - **8x StrassenBahn** (Part)
  - **10x SBahnfahrer** (external Part)
* **Fahrgaeste** (Strukturierte Klasse)
  - **beliebig viele Fahrgäste** (Part)
  - **20x Kontrolleur** (external Part)

###Sonstiges
**TODO tl: Besseres Beispiel ausdenken**

### UML
### Download
* [Projekt Datei: oeffentlicher_nahverkehr.asta](https://github.com/phoen1x/livingfire-uml/raw/master/oeffentlicher-nahverkehr/oeffentlicher_nahverkehr.asta "oeffentlicher_nahverkehr.asta")
* [Download software to open .asta](http://astah.net/download "")

### Implementation
![Diagram](https://raw.githubusercontent.com/phoen1x/livingfire-uml/master/oeffentlicher-nahverkehr/src/main/documentation/composite_structure_diagram/Composite%20Structure.png "")