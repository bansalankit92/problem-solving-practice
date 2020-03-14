package continumlatestver;/* Save this in a file called Main.java to compile and test it */

/* Do not add a package declaration */
import java.util.*;
import java.io.*;
import java.util.stream.Collectors;

/* DO NOT CHANGE ANYTHING ABOVE THIS LINE */
/* You may add any imports here, if you wish, but only from the 
   standard library */

/* Do not add a namespace declaration */

public class Main {
  public static List<String> processData(List<String> array) {

    List<Product> products = array.stream().map(string->{
      String [] prod = string.split(",");
      int version = Integer.valueOf(prod[2].trim().replace("v",""));
      return new Product(prod[0].trim(),prod[1].trim(),version);
    }).collect(Collectors.toList());

    Map<String,Product> productsMap = new HashMap<>();
    for (Product p: products ) {
      if (productsMap.containsKey(p.getLibrary()))
      {
        Product oldProd = productsMap.get(p.getLibrary());
        if (p.version > oldProd.version) {
          productsMap.put(p.getLibrary(),p);
        }
      } else {
        productsMap.put(p.getLibrary(),p);
      }
    }
    /*
     * Modify this method to process `array` as indicated
     * in the question. At the end, return a List containing the
     * appropriate values
     *
     * Please create appropriate classes, and use appropriate
     * data structures as necessary.
     *
     * Do not print anything in this method.
     *
     * Submit this entire program (not just this method)
     * as your answer
     */

    return productsMap.values().stream().map(Product::getName).distinct()
        .collect(Collectors.toList());
  }

  public static  class Product{
    private String name,library;
    private int version;

    public Product(String name, String library, int version) {
      this.name = name;
      this.library = library;
      this.version = version;
    }

    public String getName() {
      return name;
    }

    public String getLibrary() {
      return library;
    }

    public double getVersion() {
      return version;
    }

  }

  public static void main (String[] args) {
    ArrayList<String> inputData = new ArrayList<String>();
//    String line;
//    Scanner in = new Scanner(System.in);
//    while(in.hasNextLine())
//      inputData.add(in.nextLine());
    List<String> retVal = processData(inputData);
//    PrintWriter output = new PrintWriter(System.out);
//    for(String str: retVal)
//      output.println(str);
//    output.close();
  }
}