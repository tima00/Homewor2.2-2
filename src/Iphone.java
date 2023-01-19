public class Iphone extends Telephone{

   public Iphone(String model, int years, Color color) {
      super(model, years, color);
   }

   @Override
   public void print() {
      System.out.println("Модель: "+this.getModel()+
              "\nГод: "+ this.getYears()+
              "\nЦвет: "+this.getColor());
   }
}
