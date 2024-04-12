fun main(args: Array<String>) {
  val  customer = Customer("Mikisa Priscilla",23, "Sodas")
    customer.restaurantMenu("Canary Foods",arrayOf("Fried chicken","Sodas","Chips","Chapatis","Burger","Milk Shake"))
}
//Write a program that enables users to make orders according to the restaurant's menu and helps the restaurant to prepare the meals accordingly"
// PSEUDO CODE
//1. Input the company's name and menu.
//2. Input the customer's request.
//3. Determine if the customer's request is part of the given menu.
//4. If the customer's request is part of the menu output " 'order' will be ready in a few!"
//5. If the customer's order is not part of the menu, output " Sorry, we don't have 'order' but you can try any from 'menu'"

class Customer(var name:String, var tableNumber:Int, var order:String){
     fun restaurantMenu(restaurantName: String, menu: Array<String>){
        var food = 0
        while(food < menu.size){
            food++
            if(order == menu[food]){
                println("$order will be ready in a few!")
                break
                            }
            else{
                println("Sorry we don't have $order but you can try any from ${menu.contentToString()}")
                break
            }
        }
        }
}