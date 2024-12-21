/**
   Chapter 18, Programming Challenge 4
*/

public class Main
{
   public static void main(String[] args)
   {
      // Create a StockMap object.
      StockMap stockMap = new StockMap();

      // Add some mappings to the StockMap.
      stockMap.add(new Stock("ACM", 28.67));
      stockMap.add(new Stock("SUN", 56.22));
      stockMap.add(new Stock("IBM", 45.33));
      stockMap.add(new Stock("MSF", 88.56));
      stockMap.add(new Stock("XYZ", 18.57));

      // Retrieve and display the Stock objects.
      System.out.println(stockMap.getStock("SUN"));
      System.out.println(stockMap.getStock("IBM"));
      System.out.println(stockMap.getStock("ACM"));
      System.out.println(stockMap.getStock("XYZ"));
      System.out.println(stockMap.getStock("MSF"));
   }
}
