package chapter04.three.two

class DelegatingCollection<T> (
    innerList : Collection<T> = ArrayList<T>()
): Collection<T> by innerList {}