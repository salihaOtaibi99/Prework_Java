class Task4 {
    
    public static double average(Integer[] numList){
    
    int sum = 0;
    for(int i : numList){
      sum += i;
    }
    
    return (double) sum / numList.length;
  }
  
  public static void main(String[] args) {
    Integer[] numbers = {2, 11, 16, 7};
    double avg = average(numbers);
    System.out.println(" The Average is: " + avg);
    
  }

  
}
