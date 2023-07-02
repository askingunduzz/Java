package Temel_Kavramlar;

public class Switch_Yeah
{
    public static void main(String[] args){

        int day=1;

        switch(day){
            case 1:
                System.out.println("Bugun Pazartesi");
                break;
            case 2:
                System.out.println("Bugun Sali");
                break;
            case 3:
                System.out.println("Bugun Carsamba");
                break;
            case 4:
                System.out.println("Bugun Persembe");
                break;
            default:
                System.out.println("Yeter la");
        }
    }
}
