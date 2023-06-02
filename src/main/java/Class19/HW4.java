package Class19;

public class HW4 {
    //Create 1 class with a private method that has 3 overloaded forms.
    // Then call each overloaded method with specific arguments and observe result.
    private void String(String color){
        System.out.println(color);
    }
    private void String(String color,String flower){
        System.out.println(color+" "+flower);
    }
    private void String(String color,String flower,String season){
        System.out.println(color+" "+flower+" "+season);
    }

    public static void main(String[] args) {
        HW4 obj=new HW4();
        obj.String("Black");
        obj.String("White","Daisy");
        obj.String("Yellow","Sunflower","Summer");
    }
}
