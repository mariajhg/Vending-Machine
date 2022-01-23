public class Product {
    int price;
    String name;
    int id;
    int amount=5;
    double display;


    public void showItems(){
        this.display=Math.round(this.price);
        this.display=this.display/100;

        if (this.name.length()==4) {
            System.out.println(this.name + "       $" + this.display + "     " + this.id + " | " + this.amount + " left");
        }
        else if (this.name.length()==5){
            System.out.println(this.name + "      $" + this.display + "     " + this.id + " | " + this.amount + " left");
        }
        else
        {
            System.out.println(this.name + "     $" + this.display + "     " + this.id + " | " + this.amount + " left");
        }
     }

     public boolean checkInventory(){
        boolean enough=true;
        if(this.amount<=0)
         {
             System.out.println("Item is sold out.");
             System.out.println("Please select another product.");
             enough=false;
         }
        return enough;
     }

}
