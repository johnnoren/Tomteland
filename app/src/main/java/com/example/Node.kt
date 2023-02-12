package com.example

data class Node<T>(val id: T, val children: MutableList<Node<T>> = mutableListOf()) {
    fun add(child: Node<T>, nodeId: T) {
        if (nodeId == id) children.add(child)
        else children.forEach { it.add(child, nodeId) }
    }

    fun getChildren(id: T, list: MutableList<T>, addToList: Boolean = false) {
        if (addToList) list.add(this.id)
        val addChildToList = this.id == id || addToList
        children.forEach { it.getChildren(id, list, addChildToList) }
    }
}