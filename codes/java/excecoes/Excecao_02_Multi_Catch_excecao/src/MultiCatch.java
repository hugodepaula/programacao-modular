class MultiCatch {
  public static void main(String args[]) {
    int a = 88, b = 0;
    char chrs[] = { 'A', 'B', 'C' };
    
    for(int i=0; i < 2; i++) {
      try {
        if(i == 0)
          System.out.println(a / b); // gera uma ArithmeticException  
        else
          chrs[5] = 'X'; // gera uma ArrayIndexOutOfBoundsException
      // Captura ambas as exceções.
      } catch(ArithmeticException |
              ArrayIndexOutOfBoundsException e) {
        System.out.println("Excecao capturada: " + e);
      }
    }

    System.out.println("Apos multi-catch.");
  }
}