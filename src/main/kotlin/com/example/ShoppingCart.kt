package example

object ShopingCart{

    init {
        println("Shopping cart invoked.")
    }
    var count:Int = 0

    fun addToCart() {
        count = count.plus(1)
    }
}