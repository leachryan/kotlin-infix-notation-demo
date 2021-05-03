class Queue<T> {
    private val items: MutableList<T> = mutableListOf()

    infix fun enqueue(item: T): Queue<T> {
        items.add(item)
        return this
    }

    fun dequeue(): T = items.removeFirst()
}