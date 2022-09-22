public class Main
{
    public static void main(String[] args)
    {
        int month = 17;

        System.out.println("Enter Your birth month[1-12]: ");
        if (month >= 1 && month <= 12){
                System.out.println("Your birth month is: " + month);
            }
        else{
            System.out.println("Your entered an incorrect month value: " + month);
        }
    }
}