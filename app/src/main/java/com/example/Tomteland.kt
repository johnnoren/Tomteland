package com.example

class Tomteland {
    private val nodes: Node<String>

    constructor() {
        val nodes = Node<String>("Tomten")
        nodes.add(Node("Glader"),"Tomten")
        nodes.add(Node("Butter"),"Tomten")
    }
}


/*Högsta chefen för allt är "Tomten"
Under "Tomten" jobbar "Glader" och "Butter"
Under "Glader" jobbar "Tröger", "Trötter" och "Blyger"
Under "Butter" jobbar "Rådjuret", "Nyckelpigan", "Haren" och "Räven"
Under "Trötter" jobbar "Skumtomten"
Under "Skumtomten" jobbar "Dammråttan"
Under "Räven" jobbar "Gråsuggan" och "Myran"
Under "Myran" jobbar "Bladlusen"*/
