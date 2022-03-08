package chapter04.chapter04_03.two

class DelegatingCollection<T> (
    innerList : Collection<T> = ArrayList<T>()
): Collection<T> by innerList {}