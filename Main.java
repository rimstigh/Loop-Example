class Main {
  public static void main(String[] args) {
  System.out.println("First for loop");
    for (int i = 0; i<5; i++)
      {
        System.out.println("i is: " + i);
      }
  System.out.println("Second for loop");
    for (int count = 10; count >= 0; count--)
      {
        System.out.println(count);
      }
  System.out.println("First while loop");
    int c = 0;
    while (c < 7)
      {
        System.out.println(c);
        c += 2;
      }
  System.out.println("First do while loop");
  int num = 10;
  do
    {
      System.out.println("Hello");
      num --;
    } while (num > 5);
  System.out.println("Nested for loop");
  for (int j = 0; j<5; j++)
    {
      for (int k=5; k>0; k--)
        {
          System.out.println(j + " " + k);
        }
    }
  }
}