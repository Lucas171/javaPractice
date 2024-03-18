class Main{
  static public void main(String[] args){
    String name = "Lucas";
    int age = 26;
    String job = "Military";

    String message = String.format("Hello, My name is %s. I am %d years old. I work for the %s", name, age, job);

    System.out.println(message);
  }
}