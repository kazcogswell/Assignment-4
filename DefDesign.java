
/**
 * Features for a website
 *
 * @author Kaz Cogswell
 * @version 3/11/2019
 */
public class DefDesign
{
  public int basePrice ;
  public int feature1;
  public int feature2;
  public int feature3;
  public int feature4;
  public int feature5;
  
  public DefDesign(int price, int feat1, int feat2, int feat3, int feat4, int feat5) {
   basePrice = price;
   feature1 = feat1;
   feature2 = feat2;
   feature3 = feat3;
   feature4 = feat4;
   feature5 = feat5;
}  
  public int getBasePrice(){
  return basePrice;
}

 public int getFeat1(){
  return feature1;
}

 public int getFeat2(){
  return feature2;
}

 public int getFeat3(){
  return feature3;
}

 public int getFeat4(){
  return feature4;
}

 public int getFeat5(){
  return feature5;
}
}
