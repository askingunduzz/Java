package lab02;
import java.util.Scanner;

public class CountrySorter {
public static void main(String[] args) {
String[] strArr = new String[5];

strArr[0] = "ITALY";
strArr[1] = "TURKEY";
int integer = 2;

Scanner kulak = new Scanner(System.in);
boolean değer = true;
String cntry = "aa";
while (değer) {
System.out.print("Please enter a country name: ");
cntry = kulak.next();
if (cntry.equals("stop")) {
değer = false;
break;
}
cntry = cntry.toUpperCase();
strArr[integer] = cntry;
integer++;

String number_1;
for (int sayi1 = 0; sayi1 < integer; sayi1++) {
for (int sayi2 = sayi1 + 1; sayi2 < integer; sayi2++) {

if (strArr[sayi1].compareTo(strArr[sayi2]) > 0) {

number_1 = strArr[sayi1];
strArr[sayi1] = strArr[sayi2];
strArr[sayi2] = number_1;
}
}
for(int xy=0;xy<=sayi1;xy++)
System.out.print(strArr[xy] + " ");
System.out.println();
}


}
}
}