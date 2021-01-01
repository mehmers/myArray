public class myArray<T>{

  private int size;
  private T[] array = (T[]) new Object[size];

  public myArray(int size){
    this.size = size;
  }

  public void setArray(T[] newArray){
    this.array = newArray;
  }

  public T[] getArray(){
    return this.array;
  }

  public void push(T object){
    int length = this.array.length;
    T[] tempArray = (T[]) new Object[length+1];
    for(int i = 0 ; i < length ; i++){
      tempArray[i] = array[i];
    }
    tempArray[length] = object;
    this.array = tempArray;
  }

  public void remove(int index){
    int length = this.array.length;
    int count = 0;
    T[] tempArray = (T[]) new Object[length-1];
    for(int i = 0 ; i < length ; i++){
      if(i != index){
        tempArray[count] = array[i];
        count = count+1;
      }
    }
    this.array = tempArray;
  }

  public boolean contains(Object a){
    boolean result = false;
    int length = this.array.length;
    for(int i = 0; i < length ; i++){
      if(array[i] == a){
        result = true;
      }
    }
    return result;
  }
}
