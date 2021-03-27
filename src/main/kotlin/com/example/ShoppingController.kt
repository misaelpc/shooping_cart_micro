package example

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces

@Controller("/shopping_cart")
class CartController {

    @Get("/add")
    @Produces(MediaType.TEXT_PLAIN)
    fun add(): String {
        ShopingCart.addToCart()
        return "Items: ${ShopingCart.count}"
    }

    @Get("/")
    @Produces(MediaType.TEXT_PLAIN)
    fun index(): String {
        return "Index"
    }
}