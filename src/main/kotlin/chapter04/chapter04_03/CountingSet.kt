package chapter04.chapter04_03

class CountingSet<T>(
    val innerSet : MutableCollection<T> = HashSet<T>()
) : MutableCollection<T> by innerSet { //MutableCollection 구현을 innerSet에게 위임한다.
    var objectsAdded = 0
    //두 메소드는 위임하지 않고 새로운 구현을 제공한다.
    override fun add(element:T) : Boolean {
        objectsAdded++
        return innerSet.add(element)
    }

    override fun addAll(c:Collection<T>) : Boolean {
        objectsAdded += c.size
        return innerSet.addAll(c)
    }
}