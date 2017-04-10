# Projekt oeffentlicher-nahverkehr
[zurück zur Projektübersicht] (https://github.com/phoen1x/livingfire-uml/tree/master/oeffentlicher-nahverkehr "Projekt oeffentlicher-nahverkehr")

## Verteilungsdiagramm / Deployment Diagram

### Infos im Web
[uml-diagrams.org --- Deployment Diagram](http://www.uml-diagrams.org/deployment-diagrams.html "uml-diagrams.org")


### Aplikationen zum Deploy

    * Auskunftsystem: <<servlet>> auskunft.jar
    * Ticketsystem: <<servlet>> ticket.jar


### Struktur der Server


    Kassenautomat ( Objekte: 2x Client Workstation, Typ: Kassenautomat in Nürnberg und Erlagen)
    Kunde Internet ( Objekte: n x Client Worksation, Typ: Webbrowser des Kunden)

                       /\
                       ||
                       \/

    Internetseiten Proxy / Balancer   ( Objekte: 1x Apache, ServerTyp: HetznerEX90)

                       /\
                       ||
                       \/

    Tomcat Cluster ( Objekte: 2x Tomcat Java Server, ServerTyp: HetznerEX60)

                       /\
                       ||
                       \/

    Datenbank Cluster ( Objekte: 3x Cassandra Node, ServerTyp: HetznerEX40)


**Details ServerTypen HetznerEX...**: http://www.hetzner.de/hosting/produktmatrix/rootserver-produktmatrix/

### UML
### Download
* [Projekt Datei: oeffentlicher_nahverkehr.asta](https://github.com/phoen1x/livingfire-uml/raw/master/oeffentlicher-nahverkehr/oeffentlicher_nahverkehr.asta "oeffentlicher_nahverkehr.asta")
* [Download software to open .asta](http://astah.net/download "")

### Implementation
![UML Deployment Diagram](https://raw.githubusercontent.com/phoen1x/livingfire-uml/master/oeffentlicher-nahverkehr/src/main/documentation/deployment_diagram/Deployment.png "Deployment Diagram")