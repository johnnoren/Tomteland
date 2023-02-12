package com.example

class Tomteland() {
    private val nodes: Node<String>

    init {
        val nodes = Node("Tomten")
        nodes.add(Node("Glader"),"Tomten")
        nodes.add(Node("Butter"),"Tomten")
        nodes.add(Node("Tröger"),"Glader")
        nodes.add(Node("Trötter"),"Glader")
        nodes.add(Node("Blyger"),"Glader")
        nodes.add(Node("Rådjuret"),"Butter")
        nodes.add(Node("Nyckelpigan"),"Butter")
        nodes.add(Node("Haren"),"Butter")
        nodes.add(Node("Räven"),"Butter")
        nodes.add(Node("Skumtomten"),"Trötter")
        nodes.add(Node("Dammråttan"),"Skumtomten")
        nodes.add(Node("Gråsuggan"),"Räven")
        nodes.add(Node("Myran"),"Räven")
        nodes.add(Node("Bladlusen"),"Myran")
        this.nodes = nodes
    }

    fun getUnderlings(name: String, list: MutableList<String>): List<String> {
        nodes.getChildren(name, list)
        return list
    }

}