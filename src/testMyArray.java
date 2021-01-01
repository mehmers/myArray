class testMyArray {

  public static <T> void main(String[] args) {
      
      myArray<Integer> myArray = new myArray(7);

      myArray.push(4);
      myArray.push(7);
      myArray.remove(0);
      myArray.push(34);

      Object[] newArray = myArray.getArray();

      for(Object elements : newArray){
        System.out.println(elements);
      }

      boolean result = myArray.contains(7);
      boolean result2 = myArray.contains(45);
      boolean result3 = myArray.contains("test");

      System.out.printf("Does array contain 7 : %s\nDoes array contain 45 : %s\nDoes array contain 'test' string : %s\n", result,result2,result3);

      Integer[] array = {1,2,3,4,5,6,7};  
      myArray<Integer> myArray2 = new myArray(7);
      myArray2.setArray(array);
      Object[] newArray2 = myArray2.getArray();
      for(Object elements : newArray2){
        System.out.println(elements);
      }
    }
}
